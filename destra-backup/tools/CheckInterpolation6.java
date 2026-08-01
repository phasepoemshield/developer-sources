import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class CheckInterpolation6 {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/animation/InterpolationUtil.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        for (MethodNode m : cn.methods) {
            if ("6".equals(m.name) && "(FF)F".equals(m.desc)) {
                System.out.println("=== 6(FF)F ===");
                int offset = 0;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn.getType() == AbstractInsnNode.LINE || insn.getType() == AbstractInsnNode.LABEL) continue;
                    if (insn instanceof VarInsnNode) {
                        System.out.printf("  %4d: %s %d%n", offset, insn.getOpcode()==Opcodes.FLOAD?"FLOAD":"OP"+insn.getOpcode(), ((VarInsnNode)insn).var);
                    } else {
                        System.out.printf("  %4d: OP_%d%n", offset, insn.getOpcode());
                    }
                    offset++;
                }
            }
        }
    }
}
