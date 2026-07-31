import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class FindClickGuiStaticValues {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/ClickGuiScreen.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        // Track LDC -> PUTSTATIC pairs in <clinit>
        for (MethodNode m : cn.methods) {
            if ("<clinit>".equals(m.name)) {
                Object pendingLdc = null;
                int offset = 0;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn.getType() == AbstractInsnNode.LINE || insn.getType() == AbstractInsnNode.LABEL) continue;
                    if (insn instanceof LdcInsnNode) {
                        pendingLdc = ((LdcInsnNode)insn).cst;
                    }
                    if (insn instanceof FieldInsnNode && insn.getOpcode() == Opcodes.PUTSTATIC) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        if (fn.desc.equals("F") && pendingLdc != null) {
                            String hex = "";
                            for (int i = 0; i < fn.name.length(); i++) hex += String.format("U+%04X ", (int) fn.name.charAt(i));
                            if (hex.contains("U+0448 U+0422")) {
                                System.out.printf("  %s [%s] = %s%n", fn.name, hex.trim(), pendingLdc);
                            }
                        }
                        pendingLdc = null;
                    }
                    offset++;
                }
            }
        }
    }
}
