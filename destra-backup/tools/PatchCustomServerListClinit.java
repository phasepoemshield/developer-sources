import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;

public final class PatchCustomServerListClinit {
    static final String CLASS = "ru/destra/gui/CustomServerListScreen";
    static final String INIT_METHOD = "5\u0411";

    public static void main(String[] args) throws Exception {
        Path classFile = Path.of(".precompiled/ru/destra/gui/CustomServerListScreen.class");
        byte[] data = Files.readAllBytes(classFile);

        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        MethodNode clinit = null;
        for (MethodNode m : cn.methods) {
            if ("<clinit>".equals(m.name)) { clinit = m; break; }
        }
        if (clinit == null) {
            System.out.println("No <clinit> found, skipping");
            return;
        }

        List<AbstractInsnNode> calls = new ArrayList<>();
        for (AbstractInsnNode insn : clinit.instructions) {
            if (insn instanceof MethodInsnNode) {
                MethodInsnNode min = (MethodInsnNode) insn;
                if (min.getOpcode() == Opcodes.INVOKESTATIC
                        && INIT_METHOD.equals(min.name)
                        && "()V".equals(min.desc)
                        && CLASS.equals(min.owner)) {
                    calls.add(insn);
                }
            }
        }

        for (AbstractInsnNode c : calls) {
            clinit.instructions.remove(c);
        }
        int removed = calls.size();

        AbstractInsnNode ret = null;
        for (AbstractInsnNode insn : clinit.instructions) {
            if (insn.getOpcode() == Opcodes.RETURN) { ret = insn; break; }
        }
        if (ret == null) {
            System.out.println("No RETURN in <clinit>, appending to end");
            clinit.instructions.add(new MethodInsnNode(Opcodes.INVOKESTATIC, CLASS, INIT_METHOD, "()V", false));
            clinit.instructions.add(new InsnNode(Opcodes.RETURN));
        } else {
            clinit.instructions.insertBefore(ret, new MethodInsnNode(Opcodes.INVOKESTATIC, CLASS, INIT_METHOD, "()V", false));
        }

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] result = cw.toByteArray();
        Files.write(classFile, result);
        System.out.println("ASM patched CustomServerListScreen <clinit>: removed " + removed
                + " duplicate call(s), injected 1 before RETURN -> " + result.length + " bytes");
    }
}
