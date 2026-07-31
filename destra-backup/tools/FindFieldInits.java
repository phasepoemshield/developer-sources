import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;

public final class FindFieldInits {
    public static void main(String[] args) throws Exception {
        Path classFile = Path.of(".precompiled/ru/destra/module/TargetEspModule.class");
        byte[] data = Files.readAllBytes(classFile);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));

        Set<String> targets = new HashSet<>(Arrays.asList("шя3", "шяА", "шяп", "шяЕ", "шяl", "шяГ", "шя7", "шяя"));

        for (MethodNode m : cn.methods) {
            for (int i = 0; i < m.instructions.size(); i++) {
                AbstractInsnNode insn = m.instructions.get(i);
                if (insn instanceof FieldInsnNode) {
                    FieldInsnNode fin = (FieldInsnNode) insn;
                    if (targets.contains(fin.name) && "Ljava/lang/String;".equals(fin.desc)) {
                        String kind = fin.getOpcode() == Opcodes.PUTSTATIC ? "PUT" : "GET";
                        String ctx = "";
                        for (int j = Math.max(0, i - 3); j <= i; j++) {
                            AbstractInsnNode p = m.instructions.get(j);
                            if (p instanceof LdcInsnNode) ctx += "LDC\"" + ((LdcInsnNode) p).cst + "\" ";
                            else if (p instanceof FieldInsnNode) ctx += (fin.getOpcode() == Opcodes.PUTSTATIC ? "PUT" : "GET") + fin.name + " ";
                            else if (p instanceof MethodInsnNode) ctx += "CALL" + ((MethodInsnNode) p).name + " ";
                            else if (p.getOpcode() >= 0) ctx += p.getOpcode() + " ";
                        }
                        System.out.println(m.name + ": " + kind + " " + fin.name + "  <- " + ctx);
                    }
                }
            }
        }
    }
}
