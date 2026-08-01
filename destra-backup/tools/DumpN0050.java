import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.nio.charset.*;

public final class DumpN0050 {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        // N0050 = с4$в (the fill box command class used by Render3DUtil)
        Path p = Path.of(".precompiled/sg/ec/N0050.class");
        byte[] data = Files.readAllBytes(p);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);
        System.out.println("Class: " + cn.name + " super: " + cn.superName);
        System.out.println("Fields:");
        for (FieldNode f : cn.fields) System.out.println("  " + f.name + " " + f.desc);
        System.out.println("Methods:");
        for (MethodNode m : cn.methods) {
            System.out.println("  " + m.name + m.desc + " insns=" + (m.instructions == null ? 0 : m.instructions.size()));
            if (m.instructions != null && m.name.equals("<init>")) {
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof VarInsnNode) System.out.println("    VAR" + ((VarInsnNode) insn).var);
                    else if (insn instanceof FieldInsnNode) System.out.println("    " + (insn.getOpcode() == Opcodes.PUTFIELD ? "PUTFIELD" : "GETFIELD") + " " + ((FieldInsnNode) insn).name);
                    else if (insn instanceof MethodInsnNode) System.out.println("    INVOKE " + ((MethodInsnNode) insn).name);
                    else if (insn instanceof InsnNode) System.out.println("    OP " + insn.getOpcode());
                    else if (insn instanceof LabelNode) System.out.println("    LABEL");
                }
            }
        }
    }
}
