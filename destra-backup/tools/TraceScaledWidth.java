import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class TraceScaledWidth {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/render/ScaledResolution.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        for (MethodNode m : cn.methods) {
            if ("getScaledWidth".equals(m.name) && "(I)I".equals(m.desc)) {
                System.out.println("=== getScaledWidth(I)I ===");
                int offset = 0;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn.getType() == AbstractInsnNode.LINE || insn.getType() == AbstractInsnNode.LABEL) continue;
                    if (insn instanceof VarInsnNode) {
                        VarInsnNode vn = (VarInsnNode) insn;
                        String op = insn.getOpcode()==Opcodes.ILOAD?"ILOAD":insn.getOpcode()==Opcodes.ISTORE?"ISTORE":"OP"+insn.getOpcode();
                        System.out.printf("  %4d: %s %d%n", offset, op, vn.var);
                    } else if (insn instanceof MethodInsnNode) {
                        MethodInsnNode mn = (MethodInsnNode) insn;
                        String op = insn.getOpcode()==Opcodes.INVOKESTATIC?"INVOKESTATIC":"INVOKEVIRTUAL";
                        System.out.printf("  %4d: %s %s.%s%s%n", offset, op, mn.owner.substring(mn.owner.lastIndexOf('/')+1), mn.name, mn.desc);
                    } else if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        System.out.printf("  %4d: GETSTATIC %s.%s%n", offset, fn.owner.substring(fn.owner.lastIndexOf('/')+1), fn.name);
                    } else {
                        System.out.printf("  %4d: OP_%d%n", offset, insn.getOpcode());
                    }
                    offset++;
                }
            }
        }
    }
}
