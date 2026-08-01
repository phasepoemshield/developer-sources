import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public final class PatchStaticFinalFields {
    public static void main(String[] args) throws Exception {
        Path root = Path.of(".precompiled");
        int patched = 0, classesPatched = 0;

        try (var s = Files.walk(root)) {
            var files = s.filter(p -> p.toString().endsWith(".class")).toList();
            for (Path p : files) {
                byte[] bytes = Files.readAllBytes(p);
                ClassReader cr = new ClassReader(bytes);
                ClassNode cn = new ClassNode();
                cr.accept(cn, 0);

                // Collect static fields that are written via putstatic outside <clinit>
                Set<String> writtenOutsideClinit = new HashSet<>();
                for (MethodNode m : cn.methods) {
                    if (m.instructions == null) continue;
                    if ("<clinit>".equals(m.name)) continue;
                    for (AbstractInsnNode n = m.instructions.getFirst(); n != null; n = n.getNext()) {
                        if (n instanceof FieldInsnNode fin && fin.owner.equals(cn.name)
                                && fin.getOpcode() == Opcodes.PUTSTATIC) {
                            writtenOutsideClinit.add(fin.name);
                        }
                    }
                }
                if (writtenOutsideClinit.isEmpty()) continue;

                boolean changed = false;
                for (FieldNode f : cn.fields) {
                    if ((f.access & Opcodes.ACC_STATIC) == 0) continue;
                    if ((f.access & Opcodes.ACC_FINAL) == 0) continue;
                    if (!writtenOutsideClinit.contains(f.name)) continue;
                    f.access &= ~Opcodes.ACC_FINAL;
                    changed = true;
                    patched++;
                    System.out.println("  " + p.getFileName() + " :: removed FINAL from static field " + f.name + " (written outside <clinit>)");
                }
                if (changed) {
                    ClassWriter cw = new ClassWriter(0);
                    cn.accept(cw);
                    byte[] out = cw.toByteArray();
                    Files.write(p, out);
                    Path bc = Path.of("build/classes/java/main/" + root.relativize(p).toString().replace('\\','/'));
                    if (Files.exists(bc)) Files.write(bc, out);
                    classesPatched++;
                }
            }
        }
        System.out.println("Patched " + patched + " static final fields in " + classesPatched + " classes");
    }
}
