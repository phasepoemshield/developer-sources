import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class TraceFstore20_21 {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/ClickGuiScreen.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        for (MethodNode m : cn.methods) {
            if (!"render".equals(m.name)) continue;
            int offset = 0;
            for (AbstractInsnNode insn : m.instructions) {
                if (insn.getType() == AbstractInsnNode.LINE || insn.getType() == AbstractInsnNode.LABEL) continue;
                if ((offset >= 170 && offset <= 185) || (offset >= 385 && offset <= 400)) {
                    if (insn instanceof VarInsnNode) {
                        VarInsnNode vn = (VarInsnNode) insn;
                        String op = insn.getOpcode()==Opcodes.FLOAD?"FLOAD":insn.getOpcode()==Opcodes.FSTORE?"FSTORE":
                                    insn.getOpcode()==Opcodes.ALOAD?"ALOAD":"OP"+insn.getOpcode();
                        System.out.printf("  %4d: %s %d%n", offset, op, vn.var);
                    } else if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        System.out.printf("  %4d: %s %s.%s%n", offset,
                            insn.getOpcode()==Opcodes.GETSTATIC?"GETSTATIC":insn.getOpcode()==Opcodes.GETFIELD?"GETFIELD":"PUTSTATIC",
                            fn.owner.substring(fn.owner.lastIndexOf('/')+1), fn.name);
                    } else if (insn instanceof MethodInsnNode) {
                        MethodInsnNode mn = (MethodInsnNode) insn;
                        System.out.printf("  %4d: %s %s.%s%s%n", offset,
                            insn.getOpcode()==Opcodes.INVOKEVIRTUAL?"INVOKEVIRTUAL":"INVOKESTATIC",
                            mn.owner.substring(mn.owner.lastIndexOf('/')+1), mn.name, mn.desc);
                    } else if (insn instanceof LdcInsnNode) {
                        System.out.printf("  %4d: LDC %s%n", offset, ((LdcInsnNode)insn).cst);
                    } else {
                        System.out.printf("  %4d: OP_%d%n", offset, insn.getOpcode());
                    }
                }
                offset++;
            }
        }
    }
}
