import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class VerifyMapping {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/KeybindSettingElement.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        System.out.println("=== Fields with hex ===");
        for (FieldNode fn : cn.fields) {
            if ("F".equals(fn.desc) && (fn.access & Opcodes.ACC_STATIC) == 0) {
                String hex = "";
                for (int i = 0; i < fn.name.length(); i++) hex += String.format("U+%04X ", (int) fn.name.charAt(i));
                System.out.printf("  %s [%s]%n", fn.name, hex.trim());
            }
        }

        // Check what GTI_X and GTI_Y map to in PatchAllElements
        String gtiX = "\u5F1F\u044D";  // ?э
        String gtiY = "\u5F1F\u0429";  // ?щ

        System.out.println("\n=== PatchAllElements mapping ===");
        System.out.println("GTI_X = U+5F1F U+044D = ?э");
        System.out.println("GTI_Y = U+5F1F U+0429 = ?щ");

        // Find which field matches
        for (FieldNode fn : cn.fields) {
            if ("F".equals(fn.desc) && (fn.access & Opcodes.ACC_STATIC) == 0) {
                if (fn.name.equals(gtiX)) {
                    String hex = "";
                    for (int i = 0; i < fn.name.length(); i++) hex += String.format("U+%04X ", (int) fn.name.charAt(i));
                    System.out.println("  GTI_X matches field: " + fn.name + " [" + hex.trim() + "]");
                }
                if (fn.name.equals(gtiY)) {
                    String hex = "";
                    for (int i = 0; i < fn.name.length(); i++) hex += String.format("U+%04X ", (int) fn.name.charAt(i));
                    System.out.println("  GTI_Y matches field: " + fn.name + " [" + hex.trim() + "]");
                }
            }
        }

        // Now check the я method to see which field gets which param
        for (MethodNode m : cn.methods) {
            if (m.desc.equals("(FFFF)V") && m.instructions.size() < 30) {
                System.out.println("\n=== setBounds method ===");
                int varNum = -1;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof VarInsnNode) {
                        varNum = ((VarInsnNode)insn).var;
                    }
                    if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        if (insn.getOpcode() == Opcodes.PUTFIELD) {
                            String hex = "";
                            for (int i = 0; i < fn.name.length(); i++) hex += String.format("U+%04X ", (int) fn.name.charAt(i));
                            System.out.printf("  PUTFIELD %s.%s [%s] = FLOAD %d%n",
                                fn.owner.substring(fn.owner.lastIndexOf('/')+1), fn.name, hex.trim(), varNum);
                        }
                    }
                }
            }
        }
    }
}
