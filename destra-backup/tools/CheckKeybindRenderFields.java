import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class CheckKeybindRenderFields {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/KeybindSettingElement.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        // Check the big render method
        for (MethodNode m : cn.methods) {
            if (m.desc.contains("DrawContext") && m.desc.contains("II") && m.instructions.size() > 100) {
                System.out.println("=== " + m.name + m.desc + " ===");
                int offset = 0;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn.getType() == AbstractInsnNode.LINE || insn.getType() == AbstractInsnNode.LABEL) continue;
                    if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        if (fn.owner.equals(cn.name) && "F".equals(fn.desc)) {
                            String hex = "";
                            for (int i = 0; i < fn.name.length(); i++) hex += String.format("U+%04X ", (int) fn.name.charAt(i));
                            System.out.printf("  %4d: %s %s [%s]%n", offset,
                                insn.getOpcode()==Opcodes.GETFIELD?"GETFIELD":"PUTFIELD", fn.name, hex.trim());
                        }
                    }
                    offset++;
                }
            }
        }
    }
}
