import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class CheckAnimationValue {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/animation/AnimationValue.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        System.out.println("=== AnimationValue fields ===");
        for (FieldNode fn : cn.fields) {
            System.out.printf("  %s %s%n", fn.desc, fn.name);
        }
        System.out.println("\n=== Methods ===");
        for (MethodNode m : cn.methods) {
            System.out.printf("  %s %s instr=%d%n", m.name, m.desc, m.instructions.size());
        }

        // Check <init>
        for (MethodNode m : cn.methods) {
            if ("<init>".equals(m.name)) {
                System.out.println("\n=== <init> ===");
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn.getType() == AbstractInsnNode.LINE || insn.getType() == AbstractInsnNode.LABEL) continue;
                    if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        System.out.printf("  %s %s.%s%n", insn.getOpcode()==Opcodes.PUTFIELD?"PUTFIELD":"GETFIELD",
                            fn.owner.substring(fn.owner.lastIndexOf('/')+1), fn.name);
                    } else if (insn instanceof VarInsnNode) {
                        System.out.printf("  %s %d%n", insn.getOpcode()==Opcodes.FLOAD?"FLOAD":insn.getOpcode()==Opcodes.LLOAD?"LLOAD":"OP"+insn.getOpcode(), ((VarInsnNode)insn).var);
                    } else {
                        System.out.printf("  OP_%d%n", insn.getOpcode());
                    }
                }
            }
        }
    }
}
