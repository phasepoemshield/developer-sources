import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;

public final class DumpAllFields {
    public static void main(String[] args) throws Exception {
        Path classFile = Path.of(".precompiled/ru/destra/module/TargetEspModule.class");
        byte[] data = Files.readAllBytes(classFile);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));

        System.out.println("=== All String static fields ===");
        for (FieldNode f : cn.fields) {
            if ((f.access & Opcodes.ACC_STATIC) != 0 && "Ljava/lang/String;".equals(f.desc)) {
                System.out.println("  " + f.name + " : String" + (f.value != null ? " = \"" + f.value + "\"" : " (clinit)"));
            }
        }

        System.out.println("\n=== <clinit> PUTSTATIC for String fields ===");
        for (MethodNode m : cn.methods) {
            if ("<clinit>".equals(m.name)) {
                for (int i = 0; i < m.instructions.size(); i++) {
                    AbstractInsnNode insn = m.instructions.get(i);
                    if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fin = (FieldInsnNode) insn;
                        if (fin.getOpcode() == Opcodes.PUTSTATIC && "Ljava/lang/String;".equals(fin.desc)) {
                            AbstractInsnNode prev = m.instructions.get(i - 1);
                            String prevStr = "";
                            if (prev instanceof LdcInsnNode) prevStr = "LDC\"" + ((LdcInsnNode) prev).cst + "\"";
                            else prevStr = prev.getOpcode() + " " + (prev instanceof MethodInsnNode ? ((MethodInsnNode) prev).name : "");
                            System.out.println("  " + fin.name + " <- " + prevStr);
                        }
                    }
                }
            }
        }
    }
}
