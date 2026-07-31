import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;

public class DumpFields {
    public static void main(String[] args) throws Exception {
        String[] classes = {
            ".precompiled/ru/destra/gui/CheckboxComponent.class",
            ".precompiled/ru/destra/gui/CheckboxElement.class",
            ".precompiled/ru/destra/gui/ColorSliderElement.class",
            ".precompiled/ru/destra/gui/SliderElement.class",
            ".precompiled/ru/destra/gui/ModeChangeElement.class",
            ".precompiled/ru/destra/gui/KeybindElement.class"
        };
        for (String path : classes) {
            dump(path);
        }
    }

    static void dump(String path) throws Exception {
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);
        System.out.println("\n=== " + cn.name + " extends " + cn.superName + " ===");
        for (FieldNode f : cn.fields) {
            if ((f.access & Opcodes.ACC_STATIC) != 0) continue;
            System.out.println("  field: name='" + escape(f.name) + "' desc=" + f.desc + " access=0x" + Integer.toHexString(f.access));
        }
        for (MethodNode m : cn.methods) {
            if (m.name.equals("<init>") || m.name.equals("<clinit>")) continue;
            Map<String, Integer> fieldUsage = new LinkedHashMap<>();
            for (AbstractInsnNode insn : m.instructions) {
                if (insn instanceof FieldInsnNode) {
                    FieldInsnNode fin = (FieldInsnNode) insn;
                    if (fin.owner.equals(cn.name) && "F".equals(fin.desc)) {
                        fieldUsage.merge(fin.name, 1, Integer::sum);
                    }
                }
            }
            if (!fieldUsage.isEmpty()) {
                System.out.println("  method " + m.name + m.desc + ":");
                for (Map.Entry<String, Integer> e : fieldUsage.entrySet()) {
                    System.out.println("    uses " + escape(e.getKey()) + " x" + e.getValue());
                }
            }
        }
    }

    static String escape(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 32 && c < 127) sb.append(c);
            else sb.append("U+").append(String.format("%04X", (int) c));
        }
        return sb.toString();
    }
}
