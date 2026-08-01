import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class TraceStaticInit {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/ClickGuiScreen.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, ClassReader.EXPAND_FRAMES);

        for (MethodNode m : cn.methods) {
            if ("staticInit".equals(m.name)) {
                System.out.println("=== staticInit" + m.desc + " (" + m.instructions.size() + " insns) ===");
                int offset = 0;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn.getType() == AbstractInsnNode.LINE || insn.getType() == AbstractInsnNode.LABEL) continue;
                    if (insn instanceof MethodInsnNode) {
                        MethodInsnNode mn = (MethodInsnNode) insn;
                        System.out.printf("  %4d: %s %s.%s%s%n", offset, opN(insn.getOpcode()), sn(mn.owner), mn.name, mn.desc);
                    } else if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        String hex = "";
                        for (int i = 0; i < fn.name.length(); i++) hex += String.format("U+%04X ", (int) fn.name.charAt(i));
                        System.out.printf("  %4d: %s %s.%s %s [%s]%n", offset, opN(insn.getOpcode()), sn(fn.owner), fn.name, fn.desc, hex.trim());
                    } else if (insn instanceof LdcInsnNode) {
                        System.out.printf("  %4d: LDC %s%n", offset, ((LdcInsnNode)insn).cst);
                    } else {
                        System.out.printf("  %4d: %s%n", offset, opN(insn.getOpcode()));
                    }
                    offset++;
                }
            }
        }

        // Check if staticInit is called from <clinit>
        for (MethodNode m : cn.methods) {
            if ("<clinit>".equals(m.name)) {
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof MethodInsnNode) {
                        MethodInsnNode mn = (MethodInsnNode) insn;
                        if (mn.name.equals("staticInit")) {
                            System.out.println("\n  staticInit IS called from <clinit>");
                        }
                    }
                }
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
            case Opcodes.RETURN: return "RETURN";
            case -1: return "NOP/LABEL";
            default: return "OP_" + op;
        }
    }
}
