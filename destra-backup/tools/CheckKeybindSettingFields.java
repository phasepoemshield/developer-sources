import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class CheckKeybindSettingFields {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/KeybindSettingElement.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        System.out.println("Super: " + cn.superName);

        // Check all instance float fields
        System.out.println("\n=== Instance float fields ===");
        int idx = 0;
        for (FieldNode fn : cn.fields) {
            if ("F".equals(fn.desc) && (fn.access & Opcodes.ACC_STATIC) == 0) {
                String hex = "";
                for (int i = 0; i < fn.name.length(); i++) hex += String.format("U+%04X ", (int) fn.name.charAt(i));
                System.out.printf("  [%d] %s [%s]%n", idx, fn.name, hex.trim());
                idx++;
            }
        }

        // Check parent GuiTextInput fields
        System.out.println("\n=== Parent GuiTextInput fields ===");
        String gtiPath = ".precompiled/ru/destra/gui/GuiTextInput.class";
        byte[] gtiData = Files.readAllBytes(Path.of(gtiPath));
        ClassReader gtiCr = new ClassReader(gtiData);
        ClassNode gtiCn = new ClassNode();
        gtiCr.accept(gtiCn, 0);
        for (FieldNode fn : gtiCn.fields) {
            if ("F".equals(fn.desc) && (fn.access & Opcodes.ACC_STATIC) == 0) {
                System.out.printf("  %s %s%n", fn.desc, fn.name);
            }
        }

        // Check if KeybindSettingElement has setBounds or if it uses parent's
        System.out.println("\n=== setBounds-related methods ===");
        for (MethodNode m : cn.methods) {
            if (m.desc.equals("(FFFF)V")) {
                String hex = "";
                for (int i = 0; i < m.name.length(); i++) hex += String.format("U+%04X ", (int) m.name.charAt(i));
                System.out.printf("  %s %s [%s] instr=%d%n", m.name, m.desc, hex.trim(), m.instructions.size());
            }
        }
    }
}
