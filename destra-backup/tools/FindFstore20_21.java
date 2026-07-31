import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class FindFstore20_21 {
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
                if (insn instanceof VarInsnNode) {
                    VarInsnNode vn = (VarInsnNode) insn;
                    if ((vn.var == 20 || vn.var == 21) && insn.getOpcode() == Opcodes.FSTORE) {
                        System.out.printf("  FSTORE %d at offset %d%n", vn.var, offset);
                    }
                }
                offset++;
            }
        }
    }
}
