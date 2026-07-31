import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class TraceWidthCalcPrecise {
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
                if ((offset >= 1378 && offset <= 1390) || (offset >= 1398 && offset <= 1410)) {
                    if (insn instanceof VarInsnNode) {
                        VarInsnNode vn = (VarInsnNode) insn;
                        String op = insn.getOpcode()==Opcodes.ALOAD?"ALOAD":insn.getOpcode()==Opcodes.FLOAD?"FLOAD":
                                    insn.getOpcode()==Opcodes.FSTORE?"FSTORE":"OP"+insn.getOpcode();
                        System.out.printf("  %4d: %s %d%n", offset, op, vn.var);
                    } else if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        String hex = "";
                        for (int i = 0; i < fn.name.length(); i++) hex += String.format("U+%04X ", (int) fn.name.charAt(i));
                        System.out.printf("  %4d: %s %s.%s %s [%s]%n", offset,
                            insn.getOpcode()==Opcodes.GETFIELD?"GETFIELD":insn.getOpcode()==Opcodes.GETSTATIC?"GETSTATIC":"PUTFIELD",
                            fn.owner.substring(fn.owner.lastIndexOf('/')+1), fn.name, fn.desc, hex.trim());
                    } else {
                        System.out.printf("  %4d: OP_%d%n", offset, insn.getOpcode());
                    }
                }
                offset++;
            }
        }
    }
}
