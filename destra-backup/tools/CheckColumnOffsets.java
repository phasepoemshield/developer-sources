import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class CheckColumnOffsets {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/ClickGuiScreen.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        // Find шТ9 and шТМ in <clinit>
        for (MethodNode m : cn.methods) {
            if ("<clinit>".equals(m.name)) {
                Object pendingLdc = null;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof LdcInsnNode) {
                        pendingLdc = ((LdcInsnNode)insn).cst;
                    }
                    if (insn instanceof FieldInsnNode && insn.getOpcode() == Opcodes.PUTSTATIC) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        if (fn.desc.equals("F") && pendingLdc != null) {
                            String hex = "";
                            for (int i = 0; i < fn.name.length(); i++) hex += String.format("U+%04X ", (int) fn.name.charAt(i));
                            if (hex.contains("U+0448 U+0422 U+0039") || hex.contains("U+0448 U+0422 U+041C")) {
                                System.out.printf("  %s [%s] = %s%n", fn.name, hex.trim(), pendingLdc);
                            }
                        }
                        pendingLdc = null;
                    }
                }
            }
        }

        // Now check what шТ9 and шТМ are - need to match the hex from trace
        // шТ9 = U+0448 U+0422 U+0039
        // шТМ = U+0448 U+0422 U+041C  (but trace showed шшм which might be different)
        
        // Let's find all шТ* fields with their values
        System.out.println("\n=== All шТ* fields ===");
        for (MethodNode m : cn.methods) {
            if ("<clinit>".equals(m.name)) {
                Object pendingLdc = null;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof LdcInsnNode) {
                        pendingLdc = ((LdcInsnNode)insn).cst;
                    }
                    if (insn instanceof FieldInsnNode && insn.getOpcode() == Opcodes.PUTSTATIC) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        if (fn.desc.equals("F") && pendingLdc != null) {
                            String hex = "";
                            for (int i = 0; i < fn.name.length(); i++) hex += String.format("U+%04X ", (int) fn.name.charAt(i));
                            if (hex.startsWith("U+0448 U+0422")) {
                                System.out.printf("  %s [%s] = %s%n", fn.name, hex.trim(), pendingLdc);
                            }
                        }
                        pendingLdc = null;
                    }
                }
            }
        }
    }
}
