import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class TraceKSERenderTransform {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/KeybindSettingElement.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        for (MethodNode m : cn.methods) {
            if (m.desc.contains("DrawContext") && m.desc.contains("II") && m.instructions.size() > 100) {
                System.out.println("=== render " + m.name + m.desc + " (" + m.instructions.size() + " insns) ===");
                int offset = 0;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn.getType() == AbstractInsnNode.LINE || insn.getType() == AbstractInsnNode.LABEL) { offset++; continue; }
                    if (insn instanceof MethodInsnNode) {
                        MethodInsnNode mn = (MethodInsnNode) insn;
                        if (mn.name.contains("translate") || mn.name.contains("scale") || mn.name.contains("push") || mn.name.contains("pop") || mn.name.contains("Scissor") || mn.name.contains("scissor")) {
                            System.out.printf("  %4d: %s %s.%s%s%n", offset,
                                insn.getOpcode()==Opcodes.INVOKEVIRTUAL?"INVOKEVIRTUAL":insn.getOpcode()==Opcodes.INVOKESTATIC?"INVOKESTATIC":"INVOKESPECIAL",
                                mn.owner.substring(mn.owner.lastIndexOf('/')+1), mn.name, mn.desc);
                        }
                    }
                    if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        if (fn.name.contains("openClose") || fn.name.contains("Scale") || fn.name.contains("Alpha") || fn.name.contains("scale")) {
                            System.out.printf("  %4d: %s %s.%s%n", offset,
                                insn.getOpcode()==Opcodes.GETSTATIC?"GETSTATIC":insn.getOpcode()==Opcodes.GETFIELD?"GETFIELD":"PUTFIELD",
                                fn.owner.substring(fn.owner.lastIndexOf('/')+1), fn.name);
                        }
                    }
                    offset++;
                }
            }
        }
    }
}
