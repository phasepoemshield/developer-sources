import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class CheckKeybindSettingElement {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/KeybindSettingElement.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        System.out.println("Super: " + cn.superName);
        System.out.println("\n=== Methods ===");
        for (MethodNode m : cn.methods) {
            String hex = "";
            for (int i = 0; i < m.name.length(); i++) hex += String.format("U+%04X ", (int) m.name.charAt(i));
            System.out.printf("  %s %s [%s] instr=%d%n", m.name, m.desc, hex.trim(), m.instructions.size());
        }

        // Check the ?(FFFF)V method
        for (MethodNode m : cn.methods) {
            if (m.desc.equals("(FFFF)V") && m.instructions.size() < 30) {
                System.out.println("\n=== " + m.name + m.desc + " ===");
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn.getType() == AbstractInsnNode.LINE || insn.getType() == AbstractInsnNode.LABEL) continue;
                    if (insn instanceof MethodInsnNode) {
                        MethodInsnNode mn = (MethodInsnNode) insn;
                        System.out.printf("  %s %s.%s%s%n", insn.getOpcode()==Opcodes.INVOKEVIRTUAL?"INVOKEVIRTUAL":"INVOKESPECIAL",
                            mn.owner.substring(mn.owner.lastIndexOf('/')+1), mn.name, mn.desc);
                    } else if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        System.out.printf("  %s %s.%s %s%n", insn.getOpcode()==Opcodes.GETFIELD?"GETFIELD":"PUTFIELD",
                            fn.owner.substring(fn.owner.lastIndexOf('/')+1), fn.name, fn.desc);
                    } else {
                        System.out.printf("  OP_%d%n", insn.getOpcode());
                    }
                }
            }
        }
    }
}
