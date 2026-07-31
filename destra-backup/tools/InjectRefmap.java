import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;
import java.util.zip.*;

public final class InjectRefmap {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        if (args.length < 2) {
            System.err.println("Usage: InjectRefmap <refmap.json> <jar> [precompiled-dir]");
            System.exit(1);
        }
        Path refmapPath = Path.of(args[0]);
        Path jarPath = Path.of(args[1]);
        Path precompiledDir = args.length > 2 ? Path.of(args[2]) : null;

        String refmapContent = Files.readString(refmapPath, StandardCharsets.UTF_8);
        System.out.println("Refmap content length: " + refmapContent.length());

        // Collect ALL precompiled classes (not just sg/mx)
        Map<String, byte[]> missingClasses = new HashMap<>();
        if (precompiledDir != null && Files.exists(precompiledDir)) {
            try (var stream = Files.walk(precompiledDir)) {
                stream.filter(p -> p.toString().endsWith(".class"))
                    .forEach(p -> {
                        String rel = precompiledDir.relativize(p).toString().replace(File.separatorChar, '/');
                        try {
                            missingClasses.put(rel, Files.readAllBytes(p));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
            }
            System.out.println("Found " + missingClasses.size() + " precompiled sg/mx classes");
        }

        Path tmpJar = Path.of(args[1] + ".tmp");
        try (ZipFile zf = new ZipFile(jarPath.toFile());
             ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(tmpJar.toFile()))) {
            Set<String> existingEntries = new HashSet<>();
            boolean replaced = false;
            var entries = zf.stream().toList();
            for (ZipEntry entry : entries) {
                existingEntries.add(entry.getName());
                if (entry.getName().equals("destra-recovered-refmap.json")) {
                    zos.putNextEntry(new ZipEntry(entry.getName()));
                    zos.write(refmapContent.getBytes(StandardCharsets.UTF_8));
                    zos.closeEntry();
                    replaced = true;
                    System.out.println("Replaced refmap in jar");
                } else if (entry.getName().equals("destra.mixins.json")) {
                    String mixinsJson = new String(readAll(zf, entry), StandardCharsets.UTF_8);
                    if (!mixinsJson.contains("\"refmap\"")) {
                        mixinsJson = mixinsJson.replace("\"package\": \"sg.mx\",", "\"package\": \"sg.mx\",\n  \"refmap\": \"destra-recovered-refmap.json\",");
                        System.out.println("Injected refmap reference into destra.mixins.json in jar");
                    }
                    zos.putNextEntry(new ZipEntry(entry.getName()));
                    zos.write(mixinsJson.getBytes(StandardCharsets.UTF_8));
                    zos.closeEntry();
                } else if (entry.getName().equals("ru/destra/misc/ChatCommandSender2.class")) {
                    // Fix CCS2 in jar: set mc field to public static final (remapJar removes final)
                    byte[] ccs2 = readAll(zf, entry);
                    org.objectweb.asm.ClassReader ccr = new org.objectweb.asm.ClassReader(ccs2);
                    org.objectweb.asm.tree.ClassNode ccn = new org.objectweb.asm.tree.ClassNode();
                    ccr.accept(ccn, 0);
                    ccn.access = org.objectweb.asm.Opcodes.ACC_PUBLIC | org.objectweb.asm.Opcodes.ACC_INTERFACE | org.objectweb.asm.Opcodes.ACC_ABSTRACT;
                    for (var fn : ccn.fields) {
                        if (fn.name.equals("mc")) {
                            fn.access = org.objectweb.asm.Opcodes.ACC_PUBLIC | org.objectweb.asm.Opcodes.ACC_STATIC | org.objectweb.asm.Opcodes.ACC_FINAL;
                        }
                    }
                    var ccw = new org.objectweb.asm.ClassWriter(0);
                    ccn.accept(ccw);
                    zos.putNextEntry(new ZipEntry(entry.getName()));
                    zos.write(ccw.toByteArray());
                    zos.closeEntry();
                    System.out.println("Fixed CCS2 in jar: interface+abstract, mc=public static final");
                } else if (entry.getName().equals("ru/destra/core/DestraClient.class")) {
                    // Patch putstatic ChatCommandSender2.mc -> invokestatic ChatCommandSender2.init()
                    byte[] dc = readAll(zf, entry);
                    org.objectweb.asm.ClassReader cr = new org.objectweb.asm.ClassReader(dc);
                    org.objectweb.asm.tree.ClassNode cn = new org.objectweb.asm.tree.ClassNode();
                    cr.accept(cn, 0);
                    boolean dcPatched = false;
                    for (var mn : cn.methods) {
                        if (mn.instructions == null) continue;
                        for (var insn : mn.instructions) {
                            if (insn.getOpcode() == org.objectweb.asm.Opcodes.PUTSTATIC) {
                                var fin = (org.objectweb.asm.tree.FieldInsnNode) insn;
                                if (fin.owner.equals("ru/destra/misc/ChatCommandSender2") && fin.name.equals("mc")) {
                                    var rep = new org.objectweb.asm.tree.MethodInsnNode(
                                        org.objectweb.asm.Opcodes.INVOKESTATIC,
                                        "ru/destra/misc/ChatCommandSender2", "init", "()V", true);
                                    mn.instructions.insert(insn, rep);
                                    mn.instructions.remove(insn);
                                    dcPatched = true;
                                }
                            }
                        }
                    }
                    var cw = new org.objectweb.asm.ClassWriter(0);
                    cn.accept(cw);
                    zos.putNextEntry(new ZipEntry(entry.getName()));
                    zos.write(cw.toByteArray());
                    zos.closeEntry();
                    if (dcPatched) System.out.println("Patched DestraClient: putstatic mc -> invokestatic init()");
                } else {
                    zos.putNextEntry(new ZipEntry(entry.getName()));
                    try (InputStream is = zf.getInputStream(entry)) {
                        is.transferTo(zos);
                    }
                    zos.closeEntry();
                }
            }
            if (!replaced) {
                zos.putNextEntry(new ZipEntry("destra-recovered-refmap.json"));
                zos.write(refmapContent.getBytes(StandardCharsets.UTF_8));
                zos.closeEntry();
                System.out.println("Added refmap to jar (was missing)");
            }

            // Add missing precompiled classes
            int added = 0;
            for (var e : missingClasses.entrySet()) {
                String key = e.getKey();
                if (!existingEntries.contains(key)) {
                    zos.putNextEntry(new ZipEntry(key));
                    zos.write(e.getValue());
                    zos.closeEntry();
                    added++;
                }
            }
            if (added > 0) {
                System.out.println("Added " + added + " missing precompiled classes to jar");
            }
        }
        Files.move(tmpJar, jarPath, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Done: " + jarPath);
    }

    static byte[] readAll(ZipFile zf, ZipEntry entry) throws IOException {
        var baos = new ByteArrayOutputStream();
        try (InputStream is = zf.getInputStream(entry)) { is.transferTo(baos); }
        return baos.toByteArray();
    }
}
