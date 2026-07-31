import java.io.*;
import java.nio.file.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class PatchClickGuiColorSupplier {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) { System.err.println("Usage: PatchClickGuiColorSupplier <input> <output>"); System.exit(1); }
        String classFile = args[0];
        String outFile = args[1];
        byte[] data = Files.readAllBytes(Path.of(classFile));
        ClassNode cn = new ClassNode();
        new ClassReader(data).accept(cn, 0);

        String animatedColorClass = "ru/destra/animation/AnimatedColor";

        for (MethodNode mn : cn.methods) {
            if (mn.name.equals("<init>") && mn.desc.equals("()V")) {
                System.err.println("Patching ClickGuiColorSupplier.<init>()");

                AbstractInsnNode ret = null;
                for (AbstractInsnNode insn : mn.instructions) {
                    if (insn.getOpcode() == Opcodes.RETURN) {
                        ret = insn;
                        break;
                    }
                }
                if (ret == null) { System.err.println("  ERROR: No RETURN"); continue; }

                InsnList inject = new InsnList();

                // this.metaTextColor = new AnimatedColor(250L, -167)
                inject.add(new VarInsnNode(Opcodes.ALOAD, 0));
                inject.add(new TypeInsnNode(Opcodes.NEW, animatedColorClass));
                inject.add(new InsnNode(Opcodes.DUP));
                inject.add(new LdcInsnNode(250L));
                inject.add(new LdcInsnNode(-167));
                inject.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, animatedColorClass, "<init>", "(JI)V", false));
                inject.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, "metaTextColor", "Lru/destra/animation/AnimatedColor;"));

                // this.actionButtonColor = new AnimatedColor(250L, -167)
                inject.add(new VarInsnNode(Opcodes.ALOAD, 0));
                inject.add(new TypeInsnNode(Opcodes.NEW, animatedColorClass));
                inject.add(new InsnNode(Opcodes.DUP));
                inject.add(new LdcInsnNode(250L));
                inject.add(new LdcInsnNode(-167));
                inject.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, animatedColorClass, "<init>", "(JI)V", false));
                inject.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, "actionButtonColor", "Lru/destra/animation/AnimatedColor;"));

                // this.nameTextColor = new AnimatedColor(250L, -1) -- white
                inject.add(new VarInsnNode(Opcodes.ALOAD, 0));
                inject.add(new TypeInsnNode(Opcodes.NEW, animatedColorClass));
                inject.add(new InsnNode(Opcodes.DUP));
                inject.add(new LdcInsnNode(250L));
                inject.add(new InsnNode(Opcodes.ICONST_M1));
                inject.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, animatedColorClass, "<init>", "(JI)V", false));
                inject.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, "nameTextColor", "Lru/destra/animation/AnimatedColor;"));

                // this.selectedHighlightProgress = 0.0F
                inject.add(new VarInsnNode(Opcodes.ALOAD, 0));
                inject.add(new InsnNode(Opcodes.FCONST_0));
                inject.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, "selectedHighlightProgress", "F"));

                // this.leftButtonHoverProgress = 0.0F
                inject.add(new VarInsnNode(Opcodes.ALOAD, 0));
                inject.add(new InsnNode(Opcodes.FCONST_0));
                inject.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, "leftButtonHoverProgress", "F"));

                // this.rightButtonHoverProgress = 0.0F
                inject.add(new VarInsnNode(Opcodes.ALOAD, 0));
                inject.add(new InsnNode(Opcodes.FCONST_0));
                inject.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, "rightButtonHoverProgress", "F"));

                mn.instructions.insertBefore(ret, inject);
                mn.maxStack = 5;
                mn.maxLocals = 1;
                System.err.println("  Injected 3 AnimatedColor + 3 float field initializations");
                break;
            }
        }

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(Path.of(outFile), out);
        System.err.println("Written " + out.length + " bytes to " + outFile);
    }
}
