import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class CheckGetRowHeight {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/KeybindSettingElement.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        for (MethodNode m : cn.methods) {
            if ("getRowHeight".equals(m.name)) {
                System.out.println("=== getRowHeight" + m.desc + " (" + m.instructions.size() + " insns) ===");
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn.getType() == AbstractInsnNode.LINE || insn.getType() == AbstractInsnNode.LABEL) continue;
                    if (insn instanceof LdcInsnNode) {
                        System.out.printf("  LDC %s%n", ((LdcInsnNode)insn).cst);
                    } else {
                        System.out.printf("  OP_%d%n", insn.getOpcode());
                    }
                }
            }
        }

        // Also check the static fields used in render
        System.out.println("\n=== ClickGuiScreen static float fields with ??? ===");
        String cgPath = ".precompiled/ru/destra/gui/ClickGuiScreen.class";
        byte[] cgData = Files.readAllBytes(Path.of(cgPath));
        ClassReader cgCr = new ClassReader(cgData);
        ClassNode cgCn = new ClassNode();
        cgCr.accept(cgCn, 0);

        // Check <clinit> for static field initialization
        for (MethodNode m : cgCn.methods) {
            if ("<clinit>".equals(m.name)) {
                System.out.println("  <clinit> has " + m.instructions.size() + " insns");
                // Count LDC and PUTSTATIC
                int ldcCount = 0;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof LdcInsnNode) ldcCount++;
                }
                System.out.println("  LDC count: " + ldcCount);
            }
        }
    }
}
