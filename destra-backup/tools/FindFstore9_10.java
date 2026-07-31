import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class FindFstore9_10 {
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
                if (insn instanceof VarInsnNode) {
                    VarInsnNode vn = (VarInsnNode) insn;
                    if ((vn.var == 9 || vn.var == 10) && (insn.getOpcode() == Opcodes.FSTORE || insn.getOpcode() == Opcodes.FLOAD)) {
                        String op = insn.getOpcode()==Opcodes.FLOAD?"FLOAD":"FSTORE";
                        System.out.printf("  %4d: %s %d%n", offset, op, vn.var);
                    }
                }
                offset++;
            }
        }
    }
}
