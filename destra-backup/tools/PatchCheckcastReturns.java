import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public final class PatchCheckcastReturns {
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
                boolean changed = false;

                for (MethodNode m : cn.methods) {
                    if (m.instructions == null) continue;
                    String ret = m.desc.substring(m.desc.indexOf(')') + 1);
                    // Only methods returning a reference type Lxxx; or [Lxxx; (arrays of ref)
                    if (!ret.startsWith("L") && !ret.startsWith("[L")) continue;
                    String checkType = ret.startsWith("L") ? ret.substring(1, ret.length() - 1) : ret;

                    List<AbstractInsnNode> areturns = new ArrayList<>();
                    for (AbstractInsnNode n = m.instructions.getFirst(); n != null; n = n.getNext()) {
                        if (n.getOpcode() == Opcodes.ARETURN) areturns.add(n);
                    }
                    for (AbstractInsnNode aret : areturns) {
                        AbstractInsnNode prev = aret.getPrevious();
                        // Skip if already a checkcast to the right type
                        if (prev != null && prev.getOpcode() == Opcodes.CHECKCAST
                                && prev instanceof TypeInsnNode tin && tin.desc.equals(checkType)) {
                            continue;
                        }
                        // Insert checkcast before areturn. For array-of-ref ([Lxxx;) checkcast uses the
                        // full descriptor; for plain ref use the internal name.
                        m.instructions.insertBefore(aret, new TypeInsnNode(Opcodes.CHECKCAST, checkType));
                        changed = true;
                        patched++;
                    }
                }

                if (changed) {
                    cn.accept(new ClassWriter(0) { @Override protected String getCommonSuperClass(String a, String b) { return "java/lang/Object"; } });
                    ClassWriter cw = new ClassWriter(0);
                    cn.accept(cw);
                    byte[] out = cw.toByteArray();
                    Files.write(p, out);
                    Path bc = Path.of("build/classes/java/main/" + root.relativize(p).toString().replace('\\','/'));
                    if (Files.exists(bc)) Files.write(bc, out);
                    classesPatched++;
                    System.out.println("  patched areturns in: " + p.getFileName());
                }
            }
        }
        System.out.println("Inserted checkcast before " + patched + " areturn(s) in " + classesPatched + " classes");
    }
}
