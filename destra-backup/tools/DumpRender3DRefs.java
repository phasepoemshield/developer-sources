import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;

public final class DumpRender3DRefs {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        Path classFile = Path.of(".precompiled/ru/destra/render/Render3DUtil.class");
        byte[] data = Files.readAllBytes(classFile);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        Set<String> refs = new TreeSet<>();
        for (FieldNode f : cn.fields) {
            extractClasses(f.desc, refs);
        }
        for (MethodNode m : cn.methods) {
            extractClasses(m.desc, refs);
            for (AbstractInsnNode insn : m.instructions) {
                if (insn instanceof TypeInsnNode) {
                    String t = ((TypeInsnNode) insn).desc;
                    if (t.startsWith("[")) extractClasses(t, refs);
                    else refs.add(t);
                } else if (insn instanceof FieldInsnNode) {
                    refs.add(((FieldInsnNode) insn).owner);
                    extractClasses(((FieldInsnNode) insn).desc, refs);
                } else if (insn instanceof MethodInsnNode) {
                    refs.add(((MethodInsnNode) insn).owner);
                    extractClasses(((MethodInsnNode) insn).desc, refs);
                } else if (insn instanceof LdcInsnNode) {
                    Object c = ((LdcInsnNode) insn).cst;
                    if (c instanceof org.objectweb.asm.Type) extractClasses(((org.objectweb.asm.Type) c).getDescriptor(), refs);
                }
            }
        }
        System.out.println("=== sg/ec refs in Render3DUtil ===");
        for (String r : refs) {
            if (r.startsWith("sg/ec/")) {
                System.out.print(r);
                boolean ascii = true;
                for (int i = 0; i < r.length(); i++) if (r.charAt(i) > 127) ascii = false;
                System.out.println(" (ascii=" + ascii + ")");
            }
        }
        System.out.println("=== inner classes ===");
        if (cn.innerClasses != null) {
            for (InnerClassNode ic : cn.innerClasses) {
                System.out.println("  inner: " + ic.name + " outer=" + ic.outerName + " innerName=" + ic.innerName);
            }
        }
        System.out.println("=== this class: " + cn.name + " ===");
    }

    static void extractClasses(String desc, Set<String> refs) {
        if (desc == null) return;
        int idx = 0;
        while ((idx = desc.indexOf('L', idx)) >= 0) {
            int end = desc.indexOf(';', idx);
            if (end < 0) break;
            refs.add(desc.substring(idx + 1, end));
            idx = end + 1;
        }
    }
}
