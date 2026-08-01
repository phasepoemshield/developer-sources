import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class CheckGetRowHeightPrecise {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/KeybindSettingElement.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        for (MethodNode m : cn.methods) {
            if ("getRowHeight".equals(m.name)) {
                System.out.println("=== getRowHeight" + m.desc + " ===");
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn.getType() == AbstractInsnNode.LINE || insn.getType() == AbstractInsnNode.LABEL) continue;
                    if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fn = (FieldInsnNode) insn;
                        System.out.printf("  GETSTATIC %s.%s%n", fn.owner.substring(fn.owner.lastIndexOf('/')+1), fn.name);
                    } else {
                        System.out.printf("  OP_%d%n", insn.getOpcode());
                    }
                }
            }
        }
    }
}
