import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class FindColumnRenderSection {
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
                if (insn instanceof FieldInsnNode) {
                    FieldInsnNode fn = (FieldInsnNode) insn;
                    if (fn.name.equals("leftColumnModules") || fn.name.equals("rightColumnModules")) {
                        System.out.printf("  offset %d: %s %s.%s %s%n",
                            offset, insn.getOpcode()==Opcodes.GETFIELD?"GETFIELD":"PUTFIELD",
                            fn.owner, fn.name, fn.desc);
                    }
                }
                offset++;
            }
        }
    }
}
