import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class VerifyPatchedKSE {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/KeybindSettingElement.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        System.out.println("Super: " + cn.superName);

        // Check я(FFFF)V method
        for (MethodNode m : cn.methods) {
            if (m.desc.equals("(FFFF)V") && m.instructions.size() < 30) {
                String hex = "";
                for (int i = 0; i < m.name.length(); i++) hex += String.format("U+%04X ", (int) m.name.charAt(i));
                System.out.println("\n=== " + m.name + m.desc + " [" + hex.trim() + "] (" + m.instructions.size() + " insns) ===");
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn.getType() == AbstractInsnNode.LINE || insn.getType() == AbstractInsnNode.LABEL) continue;
                    if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        String op = insn.getOpcode()==Opcodes.PUTFIELD?"PUTFIELD":"GETFIELD";
                        System.out.printf("  %s %s.%s %s%n", op, fn.owner.substring(fn.owner.lastIndexOf('/')+1), fn.name, fn.desc);
                    } else if (insn instanceof VarInsnNode) {
                        String op = insn.getOpcode()==Opcodes.ALOAD?"ALOAD":insn.getOpcode()==Opcodes.FLOAD?"FLOAD":"OP"+insn.getOpcode();
                        System.out.printf("  %s %d%n", op, ((VarInsnNode)insn).var);
                    } else {
                        System.out.printf("  OP_%d%n", insn.getOpcode());
                    }
                }
            }
        }

        // Check first few GETFIELDs in render method
        for (MethodNode m : cn.methods) {
            if (m.desc.contains("DrawContext") && m.desc.contains("II") && m.instructions.size() > 100) {
                System.out.println("\n=== render method first 10 GETFIELD F ===");
                int count = 0;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof FieldInsnNode && insn.getOpcode() == Opcodes.GETFIELD) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        if ("F".equals(fn.desc)) {
                            System.out.printf("  GETFIELD %s.%s%n", fn.owner.substring(fn.owner.lastIndexOf('/')+1), fn.name);
                            count++;
                            if (count >= 10) break;
                        }
                    }
                }
            }
        }
    }
}
