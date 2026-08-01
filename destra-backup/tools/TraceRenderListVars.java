import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class TraceRenderListVars {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/ClickGuiScreen.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, ClassReader.EXPAND_FRAMES);

        for (MethodNode m : cn.methods) {
            if (!"render".equals(m.name)) continue;
            int offset = 0;
            for (AbstractInsnNode insn : m.instructions) {
                if (insn.getType() == AbstractInsnNode.LINE || insn.getType() == AbstractInsnNode.LABEL) continue;
                // Show offsets 1349-1360 (list loading) and 1498-1510 (first loop start) and 1543-1550 (second loop start)
                if ((offset >= 1349 && offset <= 1360) || (offset >= 1498 && offset <= 1510) || (offset >= 1543 && offset <= 1560)) {
                    if (insn instanceof VarInsnNode) {
                        String op = insn.getOpcode()==Opcodes.ALOAD?"ALOAD":insn.getOpcode()==Opcodes.FLOAD?"FLOAD":
                                    insn.getOpcode()==Opcodes.ASTORE?"ASTORE":insn.getOpcode()==Opcodes.FSTORE?"FSTORE":"OP"+insn.getOpcode();
                        System.out.printf("  %4d: %s %d%n", offset, op, ((VarInsnNode)insn).var);
                    } else if (insn instanceof MethodInsnNode) {
                        MethodInsnNode mn = (MethodInsnNode) insn;
                        System.out.printf("  %4d: %s %s.%s%s%n", offset,
                            insn.getOpcode()==Opcodes.INVOKEVIRTUAL?"INVOKEVIRTUAL":"INVOKEINTERFACE",
                            mn.owner.substring(mn.owner.lastIndexOf('/')+1), mn.name, mn.desc);
                    } else if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        System.out.printf("  %4d: %s %s.%s%n", offset,
                            insn.getOpcode()==Opcodes.GETFIELD?"GETFIELD":"GETSTATIC",
                            fn.owner.substring(fn.owner.lastIndexOf('/')+1), fn.name);
                    } else {
                        System.out.printf("  %4d: OP_%d%n", offset, insn.getOpcode());
                    }
                }
                offset++;
            }
        }
    }
}
