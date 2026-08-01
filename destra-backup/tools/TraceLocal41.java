import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class TraceLocal41 {
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
                if (offset >= 1359 && offset <= 1370) {
                    if (insn instanceof VarInsnNode) {
                        VarInsnNode vn = (VarInsnNode) insn;
                        String op = insn.getOpcode()==Opcodes.FLOAD?"FLOAD":insn.getOpcode()==Opcodes.FSTORE?"FSTORE":"OP"+insn.getOpcode();
                        System.out.printf("  %4d: %s %d%n", offset, op, vn.var);
                    } else if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        String hex = "";
                        for (int i = 0; i < fn.name.length(); i++) hex += String.format("U+%04X ", (int) fn.name.charAt(i));
                        System.out.printf("  %4d: GETSTATIC %s.%s = see_clinit [%s]%n", offset,
                            fn.owner.substring(fn.owner.lastIndexOf('/')+1), fn.name, hex.trim());
                    } else {
                        System.out.printf("  %4d: OP_%d%n", offset, insn.getOpcode());
                    }
                }
                offset++;
            }
        }
    }
}
