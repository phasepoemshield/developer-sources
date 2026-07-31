import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class CheckGuiDimensions {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/ClickGuiScreen.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        for (MethodNode m : cn.methods) {
            if ("getGuiWidth".equals(m.name) || "getGuiHeight".equals(m.name) ||
                "getGuiTopBarHeight".equals(m.name) || "getGuiSidebarWidth".equals(m.name)) {
                System.out.println("=== " + m.name + m.desc + " (" + m.instructions.size() + " insns) ===");
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn.getType() == AbstractInsnNode.LINE || insn.getType() == AbstractInsnNode.LABEL) continue;
                    if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        String hex = "";
                        for (int i = 0; i < fn.name.length(); i++) hex += String.format("U+%04X ", (int) fn.name.charAt(i));
                        System.out.printf("  %s %s.%s %s [%s]%n",
                            insn.getOpcode()==Opcodes.GETSTATIC?"GETSTATIC":"PUTSTATIC",
                            fn.owner.substring(fn.owner.lastIndexOf('/')+1), fn.name, fn.desc, hex.trim());
                    } else if (insn instanceof LdcInsnNode) {
                        System.out.printf("  LDC %s%n", ((LdcInsnNode)insn).cst);
                    } else {
                        System.out.printf("  OP_%d%n", insn.getOpcode());
                    }
                }
            }
        }

        // Also check GUI_WIDTH, GUI_HEIGHT static fields values in <clinit>
        System.out.println("\n=== GUI_WIDTH/GUI_HEIGHT in <clinit> ===");
        for (MethodNode m : cn.methods) {
            if ("<clinit>".equals(m.name)) {
                int offset = 0;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        if (fn.name.equals("GUI_WIDTH") || fn.name.equals("GUI_HEIGHT") ||
                            fn.name.equals("GUI_SIDEBAR_WIDTH") || fn.name.equals("GUI_TOP_BAR_HEIGHT")) {
                            // Get the LDC before this PUTSTATIC
                            AbstractInsnNode prev = insn.getPrevious();
                            String ldcVal = "?";
                            if (prev instanceof LdcInsnNode) {
                                ldcVal = String.valueOf(((LdcInsnNode)prev).cst);
                            }
                            System.out.printf("  %s = %s%n", fn.name, ldcVal);
                        }
                    }
                    offset++;
                }
            }
        }
    }
}
