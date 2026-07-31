import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class TraceRenderColumns {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/ClickGuiScreen.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, ClassReader.EXPAND_FRAMES);

        for (MethodNode m : cn.methods) {
            if (!"render".equals(m.name)) continue;
            int offset = 0;
            boolean printing = false;
            int printCount = 0;
            for (AbstractInsnNode insn : m.instructions) {
                if (insn.getType() == AbstractInsnNode.LINE || insn.getType() == AbstractInsnNode.LABEL) continue;
                if (offset >= 1340 && offset <= 1500) {
                    if (insn instanceof MethodInsnNode) {
                        MethodInsnNode mn = (MethodInsnNode) insn;
                        System.out.printf("  %4d: %s %s.%s%s%n", offset, opN(insn.getOpcode()), sn(mn.owner), mn.name, mn.desc);
                    } else if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        System.out.printf("  %4d: %s %s.%s %s%n", offset, opN(insn.getOpcode()), sn(fn.owner), fn.name, fn.desc);
                    } else if (insn instanceof LdcInsnNode) {
                        System.out.printf("  %4d: LDC %s%n", offset, ((LdcInsnNode)insn).cst);
                    } else if (insn instanceof TypeInsnNode) {
                        System.out.printf("  %4d: %s %s%n", offset, opN(insn.getOpcode()), ((TypeInsnNode)insn).desc);
                    } else if (insn instanceof JumpInsnNode) {
                        System.out.printf("  %4d: %s%n", offset, opN(insn.getOpcode()));
                    } else {
                        System.out.printf("  %4d: %s%n", offset, opN(insn.getOpcode()));
                    }
                }
                offset++;
            }
        }
    }
    static String sn(String s) { int i = s.lastIndexOf('/'); return i >= 0 ? s.substring(i + 1) : s; }
    static String opN(int op) {
        switch (op) {
            case Opcodes.GETFIELD: return "GETFIELD";
            case Opcodes.PUTFIELD: return "PUTFIELD";
            case Opcodes.GETSTATIC: return "GETSTATIC";
            case Opcodes.PUTSTATIC: return "PUTSTATIC";
            case Opcodes.INVOKEVIRTUAL: return "INVOKEVIRTUAL";
            case Opcodes.INVOKESPECIAL: return "INVOKESPECIAL";
            case Opcodes.INVOKESTATIC: return "INVOKESTATIC";
            case Opcodes.INVOKEINTERFACE: return "INVOKEINTERFACE";
            case Opcodes.INVOKEDYNAMIC: return "INVOKEDYNAMIC";
            case Opcodes.ALOAD: return "ALOAD";
            case Opcodes.ILOAD: return "ILOAD";
            case Opcodes.FLOAD: return "FLOAD";
            case Opcodes.DLOAD: return "DLOAD";
            case Opcodes.ISTORE: return "ISTORE";
            case Opcodes.FSTORE: return "FSTORE";
            case Opcodes.ASTORE: return "ASTORE";
            case Opcodes.DSTORE: return "DSTORE";
            case Opcodes.IRETURN: return "IRETURN";
            case Opcodes.RETURN: return "RETURN";
            case Opcodes.ARETURN: return "ARETURN";
            case Opcodes.FCONST_0: return "FCONST_0";
            case Opcodes.FCONST_1: return "FCONST_1";
            case Opcodes.FCONST_2: return "FCONST_2";
            case Opcodes.ICONST_0: return "ICONST_0";
            case Opcodes.ICONST_1: return "ICONST_1";
            case Opcodes.ICONST_2: return "ICONST_2";
            case Opcodes.FADD: return "FADD";
            case Opcodes.FSUB: return "FSUB";
            case Opcodes.FMUL: return "FMUL";
            case Opcodes.FDIV: return "FDIV";
            case Opcodes.I2F: return "I2F";
            case Opcodes.F2I: return "F2I";
            case Opcodes.IADD: return "IADD";
            case Opcodes.ISUB: return "ISUB";
            case Opcodes.IFEQ: return "IFEQ";
            case Opcodes.IFNE: return "IFNE";
            case Opcodes.IFNULL: return "IFNULL";
            case Opcodes.IFNONNULL: return "IFNONNULL";
            case Opcodes.IF_ICMPEQ: return "IF_ICMPEQ";
            case Opcodes.IF_ICMPGE: return "IF_ICMPGE";
            case Opcodes.IF_ICMPGT: return "IF_ICMPGT";
            case Opcodes.IF_ICMPLE: return "IF_ICMPLE";
            case Opcodes.GOTO: return "GOTO";
            case Opcodes.DUP: return "DUP";
            case Opcodes.NEW: return "NEW";
            case Opcodes.CHECKCAST: return "CHECKCAST";
            case -1: return "NOP/LABEL";
            default: return "OP_" + op;
        }
    }
}
