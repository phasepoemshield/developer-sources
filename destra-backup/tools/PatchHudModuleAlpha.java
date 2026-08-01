import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;

public final class PatchHudModuleAlpha {
    public static void main(String[] args) throws Exception {
        String classPath = ".precompiled/ru/destra/module/HudModule.class";

        byte[] classData = Files.readAllBytes(Path.of(classPath));
        ClassReader cr = new ClassReader(classData);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        String fieldName = "currentAlpha";
        boolean fieldExists = false;
        for (FieldNode f : cn.fields) {
            if (f.name.equals(fieldName) && f.desc.equals("F")) {
                fieldExists = true;
                break;
            }
        }
        if (!fieldExists) {
            System.out.println("  ERROR: currentAlpha field not found in HudModule");
            return;
        }

        MethodNode method = null;
        for (MethodNode m : cn.methods) {
            if (m.name.equals("applyAlphaToChannel") && m.desc.equals("(IF)I")) {
                method = m;
                break;
            }
        }
        if (method == null) {
            System.out.println("  ERROR: applyAlphaToChannel(IF)I not found");
            return;
        }

        boolean alreadyPatched = false;
        for (AbstractInsnNode insn : method.instructions) {
            if (insn instanceof IntInsnNode) {
                IntInsnNode iin = (IntInsnNode) insn;
                if (iin.getOpcode() == Opcodes.BIPUSH && iin.operand == 24) {
                    alreadyPatched = true;
                    break;
                }
            }
        }

        if (alreadyPatched) {
            System.out.println("  HudModule.applyAlphaToChannel: already patched");
            return;
        }

        method.instructions.clear();

        InsnList ins = new InsnList();

        ins.add(new VarInsnNode(Opcodes.ILOAD, 1));
        ins.add(new LdcInsnNode(0x00FFFFFF));
        ins.add(new InsnNode(Opcodes.IAND));

        ins.add(new VarInsnNode(Opcodes.ALOAD, 0));
        ins.add(new FieldInsnNode(Opcodes.GETFIELD, cn.name, fieldName, "F"));
        ins.add(new LdcInsnNode(255.0f));
        ins.add(new InsnNode(Opcodes.FMUL));
        ins.add(new InsnNode(Opcodes.F2I));

        ins.add(new IntInsnNode(Opcodes.SIPUSH, 255));
        ins.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "java/lang/Math", "min", "(II)I"));
        ins.add(new InsnNode(Opcodes.ICONST_0));
        ins.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "java/lang/Math", "max", "(II)I"));

        ins.add(new IntInsnNode(Opcodes.BIPUSH, 24));
        ins.add(new InsnNode(Opcodes.ISHL));

        ins.add(new InsnNode(Opcodes.IOR));
        ins.add(new InsnNode(Opcodes.IRETURN));

        method.instructions.add(ins);

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cn.accept(cw);
        Files.write(Path.of(classPath), cw.toByteArray());

        System.out.println("  Patched HudModule.applyAlphaToChannel: proper ARGB alpha channel setting");
    }
}
