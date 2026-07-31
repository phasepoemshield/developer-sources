import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class FindColumnUsage {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/ClickGuiScreen.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        for (MethodNode m : cn.methods) {
            int leftRefs = 0, rightRefs = 0, moduleElRefs = 0;
            for (AbstractInsnNode insn : m.instructions) {
                if (insn instanceof FieldInsnNode) {
                    FieldInsnNode fn = (FieldInsnNode) insn;
                    if (fn.name.equals("leftColumnModules")) leftRefs++;
                    if (fn.name.equals("rightColumnModules")) rightRefs++;
                    if (fn.name.equals("moduleElements")) moduleElRefs++;
                }
            }
            if (leftRefs > 0 || rightRefs > 0 || moduleElRefs > 0) {
                System.out.printf("  %s%s: left=%d right=%d moduleElements=%d%n",
                    m.name, m.desc, leftRefs, rightRefs, moduleElRefs);
            }
        }
    }
}
