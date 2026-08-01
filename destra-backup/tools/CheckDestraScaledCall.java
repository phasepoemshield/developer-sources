import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class CheckDestraScaledCall {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/ClickGuiScreen.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        for (MethodNode m : cn.methods) {
            if ("destra$getScaledWidth".equals(m.name) || "destra$getScaledHeight".equals(m.name)) {
                System.out.println("=== " + m.name + m.desc + " ===");
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn.getType() == AbstractInsnNode.LINE || insn.getType() == AbstractInsnNode.LABEL) continue;
                    if (insn instanceof MethodInsnNode) {
                        MethodInsnNode mn = (MethodInsnNode) insn;
                        System.out.printf("  %s %s.%s%s%n", insn.getOpcode()==Opcodes.INVOKESTATIC?"INVOKESTATIC":"INVOKEVIRTUAL",
                            mn.owner.substring(mn.owner.lastIndexOf('/')+1), mn.name, mn.desc);
                    } else {
                        System.out.printf("  OP_%d (= %s)%n", insn.getOpcode(), 
                            insn.getOpcode()==3?"ICONST_0":insn.getOpcode()==4?"ICONST_1":insn.getOpcode()==5?"ICONST_2":
                            insn.getOpcode()==6?"ICONST_3":insn.getOpcode()==7?"ICONST_4":insn.getOpcode()==8?"ICONST_5":"?");
                    }
                }
            }
        }
    }
}
