import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class TraceAnimUpdate {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/animation/AnimationValue.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, ClassReader.EXPAND_FRAMES);

        for (MethodNode m : cn.methods) {
            if ("update".equals(m.name)) {
                System.out.println("=== update" + m.desc + " (" + m.instructions.size() + " insns) ===");
                int offset = 0;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn.getType() == AbstractInsnNode.LINE || insn.getType() == AbstractInsnNode.LABEL) continue;
                    if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        System.out.printf("  %4d: %s %s.%s%n", offset,
                            insn.getOpcode()==Opcodes.GETFIELD?"GETFIELD":insn.getOpcode()==Opcodes.PUTFIELD?"PUTFIELD":"GETFIELD",
                            fn.owner.substring(fn.owner.lastIndexOf('/')+1), fn.name);
                    } else if (insn instanceof VarInsnNode) {
                        System.out.printf("  %4d: %s %d%n", offset, insn.getOpcode()==Opcodes.ALOAD?"ALOAD":"OP"+insn.getOpcode(), ((VarInsnNode)insn).var);
                    } else if (insn instanceof LdcInsnNode) {
                        System.out.printf("  %4d: LDC %s%n", offset, ((LdcInsnNode)insn).cst);
                    } else if (insn instanceof JumpInsnNode) {
                        System.out.printf("  %4d: %s%n", offset, insn.getOpcode()==Opcodes.IFEQ?"IFEQ":insn.getOpcode()==Opcodes.IFNE?"IFNE":"JMP");
                    } else {
                        System.out.printf("  %4d: OP_%d%n", offset, insn.getOpcode());
                    }
                    offset++;
                }
            }
        }
    }
}
