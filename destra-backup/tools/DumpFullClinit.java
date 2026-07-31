import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;

public final class DumpFullClinit {
    public static void main(String[] args) throws Exception {
        Path classFile = Path.of(".precompiled/ru/destra/module/TargetEspModule.class");
        byte[] data = Files.readAllBytes(classFile);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));

        for (MethodNode m : cn.methods) {
            if ("<clinit>".equals(m.name)) {
                int i = 0;
                for (AbstractInsnNode insn : m.instructions) {
                    String s = insnToString(insn);
                    if (s != null) {
                        System.out.printf("%4d: %s%n", i, s);
                    }
                    i++;
                }
            }
        }
    }

    static String insnToString(AbstractInsnNode insn) {
        if (insn instanceof LdcInsnNode) return "LDC \"" + ((LdcInsnNode) insn).cst + "\"";
        if (insn instanceof FieldInsnNode) {
            FieldInsnNode f = (FieldInsnNode) insn;
            return f.getOpcode() == Opcodes.PUTSTATIC ? "PUTSTATIC " + f.name + " [" + f.desc + "]"
                : "GETSTATIC " + f.name + " [" + f.desc + "]";
        }
        if (insn instanceof MethodInsnNode) {
            MethodInsnNode m = (MethodInsnNode) insn;
            return "INVOKE" + (m.itf ? "INTERFACE" : (m.getOpcode() == Opcodes.INVOKESTATIC ? "STATIC" : ""))
                + " " + m.owner + "." + m.name + m.desc;
        }
        if (insn instanceof TypeInsnNode) return "TYPE " + ((TypeInsnNode) insn).desc;
        if (insn instanceof JumpInsnNode) return "JUMP " + insn.getOpcode();
        if (insn instanceof LabelNode) return "LABEL";
        if (insn instanceof FrameNode) return "FRAME";
        if (insn instanceof LineNumberNode) return "LINE " + ((LineNumberNode) insn).line;
        int op = insn.getOpcode();
        if (op >= 0) return "OP " + op + " (" + insn.getClass().getSimpleName() + ")";
        return null;
    }
}
