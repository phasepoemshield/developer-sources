import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import static org.objectweb.asm.Opcodes.*;
import java.util.*;
import java.util.stream.*;

public class PatchSoundManager {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.err.println("Usage: PatchSoundManager <input.class> <output.class>");
            System.exit(1);
        }
        byte[] original = new java.io.FileInputStream(args[0]).readAllBytes();

        ClassNode cn = new ClassNode();
        new ClassReader(original).accept(cn, 0);

        for (MethodNode mn : cn.methods) {
            // Target: ?(String, String, float, boolean) -> void
            if (mn.desc.equals("(Ljava/lang/String;Ljava/lang/String;FZ)V")) {
                System.out.println("Patching method: " + mn.name + mn.desc);
                patchInnerPlaySound(mn);
            }
            // Target: playSound(String, String, float) -> void (public 3-arg)
            if (mn.name.equals("playSound") && mn.desc.equals("(Ljava/lang/String;Ljava/lang/String;F)V")) {
                System.out.println("Patching method: " + mn.name + mn.desc);
                patchPlaySound3(mn);
            }
        }

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS) {
            @Override
            protected String getCommonSuperClass(String type1, String type2) {
                return "java/lang/Object";
            }
        };
        cn.accept(cw);
        byte[] patched = cw.toByteArray();
        new java.io.FileOutputStream(args[1]).write(patched);
        System.out.println("Patched SoundManager written to: " + args[1]);
    }

    static void patchInnerPlaySound(MethodNode mn) {
        ListIterator<AbstractInsnNode> it = mn.instructions.iterator();
        while (it.hasNext()) {
            AbstractInsnNode insn = it.next();
            // Find: ALOAD (exception local) + INVOKEVIRTUAL Throwable.printStackTrace()V
            if (insn instanceof VarInsnNode && insn.getOpcode() == ALOAD) {
                VarInsnNode varInsn = (VarInsnNode) insn;
                AbstractInsnNode next = insn.getNext();
                if (next != null && next.getOpcode() == INVOKEVIRTUAL) {
                    MethodInsnNode methodInsn = (MethodInsnNode) next;
                    if (methodInsn.name.equals("printStackTrace") && methodInsn.desc.equals("()V")) {
                        System.out.println("  Removing printStackTrace() call (ALOAD " + varInsn.var + " + INVOKEVIRTUAL)");
                        // Remove both ALOAD and INVOKEVIRTUAL to eliminate stack push+pop
                        it.remove(); // remove ALOAD 5
                        it.next();   // advance to invokevirtual
                        it.remove(); // remove invokevirtual printStackTrace
                    }
                }
            }
        }
    }

    static void patchPlaySound3(MethodNode mn) {
        // Insert at the start of the method:
        // name = name.replace("Mode ", "")
        InsnList inject = new InsnList();
        inject.add(new VarInsnNode(ALOAD, 0));          // load name
        inject.add(new LdcInsnNode("Mode "));            // "Mode "
        inject.add(new LdcInsnNode(""));                 // ""
        inject.add(new MethodInsnNode(INVOKEVIRTUAL, "java/lang/String", "replace",
                "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", false));
        inject.add(new VarInsnNode(ASTORE, 0));          // store back to name

        // Also replace spaces: name = name.replace(" ", "")
        inject.add(new VarInsnNode(ALOAD, 0));
        inject.add(new LdcInsnNode(" "));
        inject.add(new LdcInsnNode(""));
        inject.add(new MethodInsnNode(INVOKEVIRTUAL, "java/lang/String", "replace",
                "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", false));
        inject.add(new VarInsnNode(ASTORE, 0));

        // Insert at the very beginning of the method
        mn.instructions.insertBefore(mn.instructions.getFirst(), inject);
        System.out.println("  Inserted name sanitization in playSound(String, String, float)");
    }
}
