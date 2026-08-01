import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class FindEnabledAlphaSet {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/KeybindSettingElement.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        for (MethodNode m : cn.methods) {
            for (AbstractInsnNode insn : m.instructions) {
                if (insn instanceof FieldInsnNode) {
                    FieldInsnNode fn = (FieldInsnNode) insn;
                    if (fn.name.equals("enabledAlpha") && insn.getOpcode() == Opcodes.PUTFIELD) {
                        System.out.printf("  %s%s: PUTFIELD enabledAlpha (from %s)%n", m.name, m.desc, fn.owner.substring(fn.owner.lastIndexOf('/')+1));
                    }
                }
            }
        }

        // Also check if there's a tick/update method
        System.out.println("\n=== Methods with 'tick' or 'update' ===");
        for (MethodNode m : cn.methods) {
            if (m.name.contains("tick") || m.name.contains("update") || m.name.contains("Tick")) {
                System.out.printf("  %s %s%n", m.name, m.desc);
            }
        }

        // Check the 4(FFFF)V method (setBounds) - is it called differently?
        System.out.println("\n=== All (FFFF)V methods ===");
        for (MethodNode m : cn.methods) {
            if (m.desc.equals("(FFFF)V")) {
                String hex = "";
                for (int i = 0; i < m.name.length(); i++) hex += String.format("U+%04X ", (int) m.name.charAt(i));
                System.out.printf("  %s %s [%s] instr=%d%n", m.name, m.desc, hex.trim(), m.instructions.size());
            }
        }
    }
}
