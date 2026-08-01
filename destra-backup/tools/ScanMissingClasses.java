import org.objectweb.asm.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public final class ScanMissingClasses {
    public static void main(String[] args) throws Exception {
        Path root = Path.of(".precompiled");
        Set<String> existing = new TreeSet<>();
        try (var s = Files.walk(root)) {
            s.filter(p -> p.toString().endsWith(".class")).forEach(p -> {
                try {
                    ClassReader cr = new ClassReader(Files.readAllBytes(p));
                    existing.add(cr.getClassName());
                } catch (Exception e) {}
            });
        }
        System.out.println("Existing precompiled classes: " + existing.size());

        // Prefixes that are external (provided by MC/fabric/java/asm/etc) - not missing
        Set<String> externalPrefixes = new TreeSet<>(Arrays.asList(
            "java/", "javax/", "sun/", "jdk/", "org/objectweb/asm/", "org/spongepowered/",
            "com/mojang/", "com/google/", "com/llamalad7/", "org/joml/", "org/lwjgl/",
            "net/minecraft/", "net/fabricmc/", "org/apache/", "com/fasterxml/",
            "it/unimi/", "net/java/"
        ));

        Map<String, Set<String>> missing = new TreeMap<>();
        try (var s = Files.walk(root)) {
            s.filter(p -> p.toString().endsWith(".class")).forEach(p -> {
                try {
                    ClassReader cr = new ClassReader(Files.readAllBytes(p));
                    for (var r : cr.getInterfaces()) checkRef(r, existing, externalPrefixes, cr.getClassName(), missing);
                    // scan constant pool for Class entries
                    cr.accept(new ClassVisitor(Opcodes.ASM9) {
                        @Override
                        public void visit(int version, int access, String name, String signature, String superName, String[] ifaces) {
                            if (superName != null) checkRef(superName, existing, externalPrefixes, name, missing);
                            for (var i : ifaces) checkRef(i, existing, externalPrefixes, name, missing);
                        }
                        @Override
                        public org.objectweb.asm.FieldVisitor visitField(int access, String name, String desc, String sig, Object value) {
                            checkDesc(desc, existing, externalPrefixes, cr.getClassName(), missing);
                            return null;
                        }
                        @Override
                        public org.objectweb.asm.MethodVisitor visitMethod(int access, String name, String desc, String sig, String[] ex) {
                            checkMethodDesc(desc, existing, externalPrefixes, cr.getClassName(), missing);
                            if (ex != null) for (var e : ex) checkRef(e, existing, externalPrefixes, cr.getClassName(), missing);
                            return new org.objectweb.asm.MethodVisitor(Opcodes.ASM9) {
                                @Override
                                public void visitTypeInsn(int opcode, String type) { checkRef(type, existing, externalPrefixes, cr.getClassName(), missing); }
                                @Override
                                public void visitFieldInsn(int opcode, String owner, String name, String desc) {
                                    checkRef(owner, existing, externalPrefixes, cr.getClassName(), missing);
                                    checkDesc(desc, existing, externalPrefixes, cr.getClassName(), missing);
                                }
                                @Override
                                public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
                                    checkRef(owner, existing, externalPrefixes, cr.getClassName(), missing);
                                    checkMethodDesc(desc, existing, externalPrefixes, cr.getClassName(), missing);
                                }
                                @Override
                                public void visitInvokeDynamicInsn(String name, String desc, org.objectweb.asm.Handle bsm, Object... bsmArgs) {
                                    checkMethodDesc(desc, existing, externalPrefixes, cr.getClassName(), missing);
                                }
                                @Override
                                public void visitLdcInsn(Object value) {
                                    if (value instanceof org.objectweb.asm.Type t) {
                                        checkDesc(t.getDescriptor(), existing, externalPrefixes, cr.getClassName(), missing);
                                    }
                                }
                                @Override
                                public void visitLocalVariable(String name, String desc, String sig, org.objectweb.asm.Label start, org.objectweb.asm.Label end, int index) {
                                    checkDesc(desc, existing, externalPrefixes, cr.getClassName(), missing);
                                }
                            };
                        }
                    }, ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
                } catch (Exception e) {}
            });
        }

        if (missing.isEmpty()) {
            System.out.println("No missing classes found!");
        } else {
            System.out.println("\n=== MISSING CLASSES (" + missing.size() + ") ===");
            for (var e : missing.entrySet()) {
                System.out.println(e.getKey() + "  <- referenced by " + e.getValue());
            }
        }
    }

    static void checkRef(String ref, Set<String> existing, Set<String> externalPrefixes, String from, Map<String, Set<String>> missing) {
        if (ref == null) return;
        if (ref.startsWith("[")) { checkDesc(ref, existing, externalPrefixes, from, missing); return; }
        if (existing.contains(ref)) return;
        for (var p : externalPrefixes) if (ref.startsWith(p)) return;
        missing.computeIfAbsent(ref, k -> new TreeSet<>()).add(from);
    }

    static void checkDesc(String desc, Set<String> existing, Set<String> externalPrefixes, String from, Map<String, Set<String>> missing) {
        if (desc == null) return;
        int i = 0;
        while (i < desc.length()) {
            char c = desc.charAt(i);
            if (c == 'L') {
                int end = desc.indexOf(';', i);
                if (end < 0) return;
                String cls = desc.substring(i + 1, end);
                checkRef(cls, existing, externalPrefixes, from, missing);
                i = end + 1;
            } else if (c == '[') {
                i++;
            } else {
                return;
            }
        }
    }

    static void checkMethodDesc(String desc, Set<String> existing, Set<String> externalPrefixes, String from, Map<String, Set<String>> missing) {
        if (desc == null) return;
        int paren = desc.indexOf(')');
        if (paren < 0) return;
        checkDesc(desc.substring(0, paren), existing, externalPrefixes, from, missing);
        checkDesc(desc.substring(paren + 1), existing, externalPrefixes, from, missing);
    }
}
