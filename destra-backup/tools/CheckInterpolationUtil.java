import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class CheckInterpolationUtil {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/animation/InterpolationUtil.class";
        File f = new File(path);
        if (!f.exists()) { System.out.println("NOT FOUND"); return; }
        byte[] data = Files.readAllBytes(f.toPath());
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        System.out.println("=== InterpolationUtil methods ===");
        for (MethodNode m : cn.methods) {
            String hex = "";
            for (int i = 0; i < m.name.length(); i++) hex += String.format("U+%04X ", (int) m.name.charAt(i));
            System.out.printf("  %s %s [%s] instr=%d%n", m.name, m.desc, hex.trim(), m.instructions.size());
        }

        // Check method 6(FF)F
        for (MethodNode m : cn.methods) {
            if ("6".equals(m.name) && "(FF)F".equals(m.desc)) {
                System.out.println("\n=== 6(FF)F ===");
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn.getType() == AbstractInsnNode.LINE || insn.getType() == AbstractInsnNode.LABEL) continue;
                    if (insn instanceof VarInsnNode) {
                        System.out.printf("  %s %d%n", insn.getOpcode()==Opcodes.FLOAD?"FLOAD":"OP"+insn.getOpcode(), ((VarInsnNode)insn).var);
                    } else if (insn instanceof LdcInsnNode) {
                        System.out.printf("  LDC %s%n", ((LdcInsnNode)insn).cst);
                    } else {
                        System.out.printf("  OP_%d%n", insn.getOpcode());
                    }
                }
            }
        }
    }
}
