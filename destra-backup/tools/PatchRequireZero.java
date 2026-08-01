import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.zip.*;

public final class PatchRequireZero {
    static Map<String, Set<String>> mcMethodNames = new HashMap<>();
    static Map<String, Map<String, String>> refmap;

    public static void main(String[] args) throws Exception {
        String mcJar = System.getProperty("mc.jar");
        if (mcJar != null && Files.exists(Path.of(mcJar))) loadMinecraft(mcJar);
        loadRefmap(Path.of("build/refmap-merged.json"));

        Path dir = Path.of(".precompiled/sg/mx");
        List<Path> classes = new ArrayList<>();
        try (var s = Files.list(dir)) { s.filter(p -> p.toString().endsWith(".class")).forEach(classes::add); }
        Collections.sort(classes);

        int patched = 0;
        for (Path p : classes) {
            byte[] data = Files.readAllBytes(p);
            ClassReader cr = new ClassReader(data);
            ClassNode cn = new ClassNode();
            cr.accept(cn, 0);
            Map<String, String> classMap = refmap.get(cn.name);

            // Find @Mixin target (can be in visible or invisible annotations)
            String targetInterm = null;
            for (List<AnnotationNode> anns : java.util.Arrays.asList(cn.visibleAnnotations, cn.invisibleAnnotations)) {
                if (anns == null) continue;
                for (AnnotationNode an : anns) {
                    if ("Lorg/spongepowered/asm/mixin/Mixin;".equals(an.desc) && an.values != null) {
                        for (int i = 0; i < an.values.size(); i += 2) {
                            if ("value".equals(an.values.get(i))) {
                                Object v = an.values.get(i + 1);
                                if (v instanceof List<?> list && !list.isEmpty()) {
                                    Object first = list.get(0);
                                    String cls = null;
                                    if (first instanceof String s) cls = s;
                                    else if (first instanceof org.objectweb.asm.Type t) cls = t.getDescriptor();
                                    if (cls != null) {
                                        if (cls.startsWith("L") && cls.endsWith(";")) cls = cls.substring(1, cls.length() - 1);
                                        if (classMap != null && classMap.containsKey(cls)) cls = classMap.get(cls);
                                        targetInterm = cls;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (targetInterm == null) {
                if (Boolean.getBoolean("debug")) System.out.println("  DBG " + p.getFileName() + ": no @Mixin target found");
                continue;
            }
            Set<String> targetMethods = mcMethodNames.getOrDefault(targetInterm, Collections.emptySet());
            if (Boolean.getBoolean("debug")) System.out.println("  DBG " + p.getFileName() + ": target=" + targetInterm + " methods=" + targetMethods.size());

            boolean changed = false;
            for (MethodNode m : cn.methods) {
                if (m.visibleAnnotations == null) continue;
                for (AnnotationNode a : m.visibleAnnotations) {
                    if (!"Lorg/spongepowered/asm/mixin/injection/Inject;".equals(a.desc)) continue;
                    // Check if 'require' is already set (and its value)
                    boolean hasRequire = false;
                    boolean hasRequire0 = false;
                    String targetMethod = null;
                    if (a.values != null) {
                        for (int i = 0; i < a.values.size(); i += 2) {
                            if ("require".equals(a.values.get(i))) {
                                hasRequire = true;
                                Object v = a.values.get(i + 1);
                                if (v instanceof Integer ii && ii == 0) hasRequire0 = true;
                            }
                            if ("method".equals(a.values.get(i))) {
                                Object v = a.values.get(i + 1);
                                if (v instanceof List<?> list && !list.isEmpty() && list.get(0) instanceof String s) targetMethod = s;
                            }
                        }
                    }
                    if (targetMethod == null) continue;

                    // Map target method to intermediary
                    String mapped = classMap != null ? classMap.get(targetMethod) : null;
                    String lookupName = mapped != null ? mapped : targetMethod;

                    // Check if method exists in target class
                    boolean exists = targetMethods.contains(lookupName);
                    if (!exists && !hasRequire0) {
                        // Method not found — add require=0 so Mixin doesn't crash
                        if (a.values == null) a.values = new ArrayList<>();
                        a.values.add("require");
                        a.values.add(0);
                        changed = true;
                        patched++;
                        System.out.println("  " + p.getFileName() + " :: @Inject " + targetMethod + " (->" + lookupName + ") not in " + targetInterm + " — added require=0");
                    } else if (exists && hasRequire0) {
                        // Method exists but require=0 was added erroneously — remove it
                        for (int i = 0; i < a.values.size(); i += 2) {
                            if ("require".equals(a.values.get(i))) {
                                a.values.remove(i);
                                a.values.remove(i);
                                break;
                            }
                        }
                        changed = true;
                        System.out.println("  " + p.getFileName() + " :: @Inject " + targetMethod + " (->" + lookupName + ") EXISTS in " + targetInterm + " — removed require=0");
                    }
                }
            }

            if (changed) {
                ClassWriter cw = new ClassWriter(0);
                cn.accept(cw);
                byte[] out = cw.toByteArray();
                Files.write(p, out);
                Path bc = Path.of("build/classes/java/main/sg/mx/" + p.getFileName());
                if (Files.exists(bc)) Files.write(bc, out);
            }
        }
        System.out.println("Added require=0 to " + patched + " @Inject annotations");
    }

    static void loadMinecraft(String jarPath) throws Exception {
        try (ZipFile zf = new ZipFile(jarPath)) {
            for (var e = zf.entries(); e.hasMoreElements(); ) {
                var en = e.nextElement();
                if (!en.getName().endsWith(".class")) continue;
                try {
                    ClassReader cr = new ClassReader(zf.getInputStream(en).readAllBytes());
                    String name = cr.getClassName();
                    Set<String> methods = new HashSet<>();
                    cr.accept(new ClassVisitor(Opcodes.ASM9) {
                        @Override public MethodVisitor visitMethod(int access, String name, String desc, String sig, String[] ex) {
                            methods.add(name); return null;
                        }
                    }, ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
                    mcMethodNames.put(name, methods);
                } catch (Exception ex) {}
            }
        }
        System.out.println("Loaded " + mcMethodNames.size() + " MC classes");
    }

    static void loadRefmap(Path p) throws Exception {
        refmap = new HashMap<>();
        if (!Files.exists(p)) return;
        String json = Files.readString(p, StandardCharsets.UTF_8);
        int mIdx = json.indexOf("\"mappings\"");
        if (mIdx < 0) return;
        int objStart = json.indexOf('{', mIdx);
        int objEnd = matchingBrace(json, objStart);
        String mappingsObj = json.substring(objStart + 1, objEnd);
        int i = 0;
        while (i < mappingsObj.length()) {
            int q1 = mappingsObj.indexOf('"', i);
            if (q1 < 0) break;
            int q2 = mappingsObj.indexOf('"', q1 + 1);
            String className = mappingsObj.substring(q1 + 1, q2);
            int cBrace = mappingsObj.indexOf('{', q2);
            int cEnd = matchingBrace(mappingsObj, cBrace);
            String classBody = mappingsObj.substring(cBrace + 1, cEnd);
            Map<String, String> classMap = new HashMap<>();
            int j = 0;
            while (j < classBody.length()) {
                int kq1 = classBody.indexOf('"', j);
                if (kq1 < 0) break;
                int kq2 = classBody.indexOf('"', kq1 + 1);
                String key = classBody.substring(kq1 + 1, kq2);
                int vq1 = classBody.indexOf('"', kq2 + 1);
                int vq2 = classBody.indexOf('"', vq1 + 1);
                String val = classBody.substring(vq1 + 1, vq2);
                classMap.put(key, val);
                j = vq2 + 1;
            }
            refmap.put(className, classMap);
            i = cEnd + 1;
        }
        System.out.println("Loaded refmap with " + refmap.size() + " entries");
    }

    static int matchingBrace(String s, int open) {
        int depth = 0;
        for (int k = open; k < s.length(); k++) {
            char c = s.charAt(k);
            if (c == '{') depth++;
            else if (c == '}') { depth--; if (depth == 0) return k; }
        }
        return s.length() - 1;
    }
}
