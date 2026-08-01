import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.nio.charset.*;

public final class DumpRoundedRectImpl {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        Path p = Path.of(".precompiled/sg/ec/RoundedRectImpl.class");
        byte[] data = Files.readAllBytes(p);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        System.out.println("Class: " + cn.name + " super: " + cn.superName);
        System.out.println("Fields:");
        for (FieldNode f : cn.fields) {
            System.out.println("  " + f.name + " " + f.desc + " access=" + f.access);
        }
        System.out.println("Methods:");
        for (MethodNode m : cn.methods) {
            int insnCount = m.instructions == null ? 0 : m.instructions.size();
            System.out.println("  " + m.name + m.desc + " insns=" + insnCount + " access=" + m.access);
            if (m.instructions != null) {
                for (AbstractInsnNode insn : m.instructions) {
                    String s = insnToString(insn);
                    if (s != null) System.out.println("    " + s);
                }
            }
        }
    }

    static String insnToString(AbstractInsnNode insn) {
        if (insn instanceof LdcInsnNode) return "LDC " + ((LdcInsnNode) insn).cst;
        if (insn instanceof FieldInsnNode) {
            FieldInsnNode f = (FieldInsnNode) insn;
            return (f.getOpcode() == Opcodes.GETFIELD ? "GETFIELD" : "PUTFIELD") + " " + f.name;
        }
        if (insn instanceof MethodInsnNode) {
            MethodInsnNode m = (MethodInsnNode) insn;
            return "INVOKE " + m.owner + "." + m.name + m.desc;
        }
        if (insn instanceof VarInsnNode) return "VAR" + ((VarInsnNode) insn).var;
        if (insn instanceof InsnNode) return "OP " + insn.getOpcode();
        if (insn instanceof TypeInsnNode) return "TYPE " + ((TypeInsnNode) insn).desc;
        if (insn instanceof LabelNode) return "LABEL";
        if (insn instanceof FrameNode) return "FRAME";
        int op = insn.getOpcode();
        if (op >= 0) return "OP" + op;
        return null;
    }
}
