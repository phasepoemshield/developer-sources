import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class TraceKeybindSetBounds {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/KeybindSettingElement.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        for (MethodNode m : cn.methods) {
            if (m.desc.equals("(FFFF)V") && m.instructions.size() < 30) {
                String hex = "";
                for (int i = 0; i < m.name.length(); i++) hex += String.format("U+%04X ", (int) m.name.charAt(i));
                System.out.println("=== " + m.name + m.desc + " [" + hex.trim() + "] ===");
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn.getType() == AbstractInsnNode.LINE || insn.getType() == AbstractInsnNode.LABEL) continue;
                    if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        System.out.printf("  %s %s.%s %s%n", insn.getOpcode()==Opcodes.GETFIELD?"GETFIELD":"PUTFIELD",
                            fn.owner.substring(fn.owner.lastIndexOf('/')+1), fn.name, fn.desc);
                    } else if (insn instanceof VarInsnNode) {
                        String op = insn.getOpcode()==Opcodes.ALOAD?"ALOAD":insn.getOpcode()==Opcodes.FLOAD?"FLOAD":"OP"+insn.getOpcode();
                        System.out.printf("  %s %d%n", op, ((VarInsnNode)insn).var);
                    } else {
                        System.out.printf("  OP_%d%n", insn.getOpcode());
                    }
                }
            }
        }

        // Also check fields
        System.out.println("\n=== KeybindSettingElement float fields ===");
        int idx = 0;
        for (FieldNode fn : cn.fields) {
            if ("F".equals(fn.desc) && (fn.access & Opcodes.ACC_STATIC) == 0) {
                String hex = "";
                for (int i = 0; i < fn.name.length(); i++) hex += String.format("U+%04X ", (int) fn.name.charAt(i));
                System.out.printf("  [%d] %s [%s]%n", idx, fn.name, hex.trim());
                idx++;
            }
        }
    }
}
