import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;

public final class DumpStaticStrings2 {
    public static void main(String[] args) throws Exception {
        Path classFile = Path.of(".precompiled/ru/destra/module/TargetEspModule.class");
        byte[] data = Files.readAllBytes(classFile);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, ClassReader.EXPAND_FRAMES);

        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));

        Set<String> targetFields = new HashSet<>(Arrays.asList(
            "шя3", "шяА", "шяп", "шяЕ", "шяl",
            "шяГ", "шя7", "шяя"
        ));

        for (MethodNode m : cn.methods) {
            if ("<clinit>".equals(m.name)) {
                // Walk instructions, track last LDC string before each PUTSTATIC
                Object lastLdc = null;
                for (AbstractInsnNode insn = m.instructions.getFirst(); insn != null; insn = insn.getNext()) {
                    if (insn instanceof LdcInsnNode) {
                        lastLdc = ((LdcInsnNode) insn).cst;
                    } else if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fin = (FieldInsnNode) insn;
                        if (fin.getOpcode() == Opcodes.PUTSTATIC && targetFields.contains(fin.name)) {
                            System.out.println(fin.name + " [String] = \"" + lastLdc + "\"");
                        }
                    }
                }

                // Also try: dump raw instruction sequence around PUTSTATIC for target fields
                System.out.println("\n=== Raw instructions around target PUTSTATIC ===");
                for (int i = 0; i < m.instructions.size(); i++) {
                    AbstractInsnNode insn = m.instructions.get(i);
                    if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fin = (FieldInsnNode) insn;
                        if (fin.getOpcode() == Opcodes.PUTSTATIC && targetFields.contains(fin.name)) {
                            System.out.print("  " + fin.name + " <- ");
                            for (int j = Math.max(0, i - 4); j <= i; j++) {
                                AbstractInsnNode prev = m.instructions.get(j);
                                if (prev instanceof LdcInsnNode) System.out.print("LDC\"" + ((LdcInsnNode) prev).cst + "\" ");
                                else if (prev instanceof FieldInsnNode) System.out.print(((FieldInsnNode) prev).getOpcode() == Opcodes.GETSTATIC ? "GET " : "PUT ");
                                else if (prev instanceof MethodInsnNode) System.out.print("CALL ");
                                else System.out.print(prev.getOpcode() + " ");
                            }
                            System.out.println();
                        }
                    }
                }
            }
        }
    }
}
