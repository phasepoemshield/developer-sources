import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;

public final class CountPutStatic {
    public static void main(String[] args) throws Exception {
        Path classFile = Path.of(".precompiled/ru/destra/module/TargetEspModule.class");
        byte[] data = Files.readAllBytes(classFile);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));

        Set<String> targets = new HashSet<>(Arrays.asList(
            "шя3", "шяА", "шяп", "шяЕ", "шяl",
            "шяГ", "шя7", "шяя",
            "шЦ7", "шЦя", "шЦ6", "шЦх"
        ));

        Map<String, Integer> counts = new LinkedHashMap<>();
        for (MethodNode m : cn.methods) {
            if ("<clinit>".equals(m.name)) {
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fin = (FieldInsnNode) insn;
                        if (fin.getOpcode() == Opcodes.PUTSTATIC && targets.contains(fin.name)) {
                            counts.merge(fin.name, 1, Integer::sum);
                        }
                    }
                }
            }
        }
        for (String t : targets) {
            System.out.println(t + ": " + counts.getOrDefault(t, 0) + " PUTSTATIC");
        }
    }
}
