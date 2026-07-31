import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;

public final class PatchAllSgEcClasses {
    static final String SGEC = "sg/ec/";
    static final int V21 = Opcodes.V21;
    static final Map<String, String> renameMap = new LinkedHashMap<>();

    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        Path ecDir = Path.of(".precompiled/sg/ec");

        // Phase 1: rename non-ASCII class files using cmd.exe short names (8.3)
        // This works because NTFS generates ASCII short names for non-ASCII filenames.
        // Java's Files API can't see Chinese-named files (sun.jnu.encoding=Cp1251), but
        // cmd.exe "dir /x" reveals the short names, and File.renameTo(shortName) works.
        renameNonAsciiFiles(ecDir);

        System.out.println("Rename map (" + renameMap.size() + " entries):");

        // Phase 2: patch all class files in precompiled - downgrade version + remap refs
        // Only process sg/ec files to avoid reading files corrupted by raw byte patchers
        Path ecPath = Path.of(".precompiled/sg/ec");
        List<Path> allPrecompiled = new ArrayList<>();
        try (var stream = Files.walk(ecPath)) {
            stream.filter(Files::isRegularFile)
                  .filter(p -> p.toString().endsWith(".class"))
                  .forEach(allPrecompiled::add);
        }

        int downgraded = 0;
        int patched = 0;
        for (Path p : allPrecompiled) {
            byte[] data = Files.readAllBytes(p);
            ClassReader cr = new ClassReader(data);
            ClassNode cn = new ClassNode();
            cr.accept(cn, ClassReader.EXPAND_FRAMES);

            boolean changed = false;
            boolean refsChanged = false;

            if (cn.version > V21) { cn.version = V21; changed = true; downgraded++; }
            if (renameMap.containsKey(cn.name)) { cn.name = renameMap.get(cn.name); changed = true; }

            String sn = remap(cn.superName);
            if (!sn.equals(cn.superName)) { cn.superName = sn; refsChanged = true; }
            if (cn.interfaces != null) {
                for (int i = 0; i < cn.interfaces.size(); i++) {
                    String r = remap(cn.interfaces.get(i));
                    if (!r.equals(cn.interfaces.get(i))) { cn.interfaces.set(i, r); refsChanged = true; }
                }
            }
            if (cn.innerClasses != null) {
                for (InnerClassNode ic : cn.innerClasses) {
                    String r1 = remap(ic.name);
                    if (!r1.equals(ic.name)) { ic.name = r1; refsChanged = true; }
                    if (ic.outerName != null) {
                        String r2 = remap(ic.outerName);
                        if (!r2.equals(ic.outerName)) { ic.outerName = r2; refsChanged = true; }
                    }
                }
            }
            for (FieldNode f : cn.fields) {
                String r = remapDesc(f.desc);
                if (!r.equals(f.desc)) { f.desc = r; refsChanged = true; }
            }
            for (MethodNode m : cn.methods) {
                String r = remapDesc(m.desc);
                if (!r.equals(m.desc)) { m.desc = r; refsChanged = true; }
                if (m.exceptions != null) {
                    for (int i = 0; i < m.exceptions.size(); i++) {
                        String e = remap(m.exceptions.get(i));
                        if (!e.equals(m.exceptions.get(i))) { m.exceptions.set(i, e); refsChanged = true; }
                    }
                }
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof TypeInsnNode) {
                        TypeInsnNode tin = (TypeInsnNode) insn;
                        String t = tin.desc;
                        String nt = t.startsWith("[") ? remapDesc(t) : remap(t);
                        if (!nt.equals(t)) { tin.desc = nt; refsChanged = true; }
                    } else if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fin = (FieldInsnNode) insn;
                        String o = remap(fin.owner);
                        if (!o.equals(fin.owner)) { fin.owner = o; refsChanged = true; }
                        String d = remapDesc(fin.desc);
                        if (!d.equals(fin.desc)) { fin.desc = d; refsChanged = true; }
                    } else if (insn instanceof MethodInsnNode) {
                        MethodInsnNode min = (MethodInsnNode) insn;
                        String o = remap(min.owner);
                        if (!o.equals(min.owner)) { min.owner = o; refsChanged = true; }
                        String d = remapDesc(min.desc);
                        if (!d.equals(min.desc)) { min.desc = d; refsChanged = true; }
                    } else if (insn instanceof InvokeDynamicInsnNode) {
                        InvokeDynamicInsnNode indy = (InvokeDynamicInsnNode) insn;
                        String d = remapDesc(indy.desc);
                        if (!d.equals(indy.desc)) { indy.desc = d; refsChanged = true; }
                        Handle nh = remapHandle(indy.bsm);
                        if (nh != indy.bsm) { indy.bsm = nh; refsChanged = true; }
                        for (int i = 0; i < indy.bsmArgs.length; i++) {
                            Object arg = indy.bsmArgs[i];
                            if (arg instanceof Type) {
                                Type nt = remapType((Type) arg);
                                if (nt != arg) { indy.bsmArgs[i] = nt; refsChanged = true; }
                            } else if (arg instanceof Handle) {
                                Handle nh2 = remapHandle((Handle) arg);
                                if (nh2 != arg) { indy.bsmArgs[i] = nh2; refsChanged = true; }
                            }
                        }
                    } else if (insn instanceof LdcInsnNode) {
                        LdcInsnNode ldc = (LdcInsnNode) insn;
                        if (ldc.cst instanceof Type) {
                            Type nt = remapType((Type) ldc.cst);
                            if (nt != ldc.cst) { ldc.cst = nt; refsChanged = true; }
                        }
                    }
                }
            }

            if (changed || refsChanged) {
                ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES) {
                    @Override
                    protected String getCommonSuperClass(String t1, String t2) {
                        if (t1.startsWith("net/minecraft/") || t2.startsWith("net/minecraft/")) return "java/lang/Object";
                        if (t1.startsWith("sg/ec/") || t2.startsWith("sg/ec/")) return "java/lang/Object";
                        try { return super.getCommonSuperClass(t1, t2); }
                        catch (Throwable e) { return "java/lang/Object"; }
                    }
                };
                cn.accept(cw);
                byte[] result = cw.toByteArray();
                Files.write(p, result);
                patched++;
            }
        }

        System.out.println("Downgraded " + downgraded + " classes to V21");
        System.out.println("Patched " + patched + " class files");
    }

    static void renameNonAsciiFiles(Path ecDir) throws Exception {
        // Find existing N-prefixed files to avoid collisions / rebuild rename map
        File[] existing = ecDir.toFile().listFiles((d, n) -> n.startsWith("N") && n.endsWith(".class"));
        int counter = 0;
        for (File f : existing != null ? existing : new File[0]) {
            try {
                byte[] data = Files.readAllBytes(f.toPath());
                ClassReader cr = new ClassReader(data);
                String orig = cr.getClassName();
                if (orig.startsWith(SGEC)) {
                    String nName = f.getName().substring(0, f.getName().length() - 6);
                    boolean nonAscii = false;
                    for (int i = 0; i < orig.length(); i++) if (orig.charAt(i) > 127) { nonAscii = true; break; }
                    if (nonAscii) {
                        renameMap.put(orig, SGEC + nName);
                        int num = Integer.parseInt(nName.substring(1));
                        if (num >= counter) counter = num + 1;
                    }
                }
            } catch (Throwable e) {}
        }

        boolean windows = System.getProperty("os.name", "").toLowerCase(Locale.ROOT).contains("win");
        if (!windows) {
            // On Unix/macOS Java can see Unicode filenames; rename remaining non-ASCII classes directly.
            File[] all = ecDir.toFile().listFiles((d, n) -> n.endsWith(".class") && !n.startsWith("N"));
            for (File f : all != null ? all : new File[0]) {
                try {
                    byte[] data = Files.readAllBytes(f.toPath());
                    if (data.length < 10) continue;
                    ClassReader cr = new ClassReader(data);
                    String origName = cr.getClassName();
                    boolean nonAscii = false;
                    for (int i = 0; i < origName.length(); i++) if (origName.charAt(i) > 127) { nonAscii = true; break; }
                    if (nonAscii && origName.startsWith(SGEC) && !renameMap.containsKey(origName)) {
                        String newName = "N" + String.format("%04d", counter++);
                        File newFile = new File(ecDir.toFile(), newName + ".class");
                        if (newFile.exists()) newFile.delete();
                        if (f.renameTo(newFile)) {
                            renameMap.put(origName, SGEC + newName);
                            System.out.println("  Renamed: " + origName + " -> " + newName);
                        }
                    }
                } catch (Throwable e) {}
            }
            return;
        }

        // Windows: use cmd.exe "dir /x" for 8.3 short names (Java may not see Cp1251 filenames)
        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "dir /x", ecDir.toString());
        pb.redirectErrorStream(true);
        Process proc = pb.start();
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(proc.getInputStream(), Charset.forName("Cp866")));
        String line;
        while ((line = reader.readLine()) != null) {
            if (!line.contains(".class") || !line.contains("~")) continue;
            String[] parts = line.split("\\s+");
            String shortName = null;
            for (String pStr : parts) {
                if (pStr.contains("~") && pStr.toUpperCase().endsWith(".CLA")) { shortName = pStr; break; }
            }
            if (shortName == null) continue;
            File f = new File(ecDir.toFile(), shortName);
            if (!f.exists()) continue;
            byte[] data = Files.readAllBytes(f.toPath());
            if (data.length < 10) continue;
            ClassReader cr = new ClassReader(data);
            String origName = cr.getClassName();
            boolean nonAscii = false;
            for (int i = 0; i < origName.length(); i++) if (origName.charAt(i) > 127) { nonAscii = true; break; }
            if (nonAscii && origName.startsWith(SGEC) && !renameMap.containsKey(origName)) {
                String newName = "N" + String.format("%04d", counter++);
                File newFile = new File(ecDir.toFile(), newName + ".class");
                if (newFile.exists()) newFile.delete();
                if (f.renameTo(newFile)) {
                    renameMap.put(origName, SGEC + newName);
                    System.out.println("  Renamed: " + origName + " -> " + newName);
                }
            }
        }
        proc.waitFor();
    }

    static String remap(String name) {
        if (name == null) return null;
        if (renameMap.containsKey(name)) return renameMap.get(name);
        for (Map.Entry<String, String> e : renameMap.entrySet()) {
            if (name.startsWith(e.getKey() + "$")) return e.getValue() + name.substring(e.getKey().length());
        }
        return name;
    }

    static String remapDesc(String desc) {
        if (desc == null) return null;
        String result = desc;
        for (Map.Entry<String, String> e : renameMap.entrySet()) {
            result = result.replace("L" + e.getKey() + ";", "L" + e.getValue() + ";");
        }
        // Handle inner class refs: Lold$xxx; -> Lnew$xxx;
        for (Map.Entry<String, String> e : renameMap.entrySet()) {
            String old = e.getKey();
            String pat = "L" + old + "$";
            int idx = result.indexOf(pat);
            while (idx >= 0) {
                int end = result.indexOf(';', idx);
                if (end < 0) break;
                result = result.substring(0, idx + 1) + e.getValue() + "$" + result.substring(idx + 1 + old.length() + 1);
                idx = result.indexOf(pat, idx + 1);
            }
        }
        return result;
    }

    static Handle remapHandle(Handle h) {
        String owner = remap(h.getOwner());
        String desc = remapDesc(h.getDesc());
        if (!owner.equals(h.getOwner()) || !desc.equals(h.getDesc()))
            return new Handle(h.getTag(), owner, h.getName(), desc, h.isInterface());
        return h;
    }

    static Type remapType(Type t) {
        if (t == null) return null;
        if (t.getSort() == Type.OBJECT) {
            String internal = t.getInternalName();
            String mapped = remap(internal);
            if (!internal.equals(mapped)) return Type.getObjectType(mapped);
        } else if (t.getSort() == Type.ARRAY) {
            String desc = t.getDescriptor();
            String newDesc = remapDesc(desc);
            if (!desc.equals(newDesc)) return Type.getType(newDesc);
        } else if (t.getSort() == Type.METHOD) {
            String desc = t.getDescriptor();
            String newDesc = remapDesc(desc);
            if (!desc.equals(newDesc)) return Type.getType(newDesc);
        }
        return t;
    }
}
