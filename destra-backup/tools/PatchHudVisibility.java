import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;

public final class PatchHudVisibility {
    static final String PRECOMPILED = ".precompiled";
    static final String HUD_MODULE = "ru/destra/module/HudModule";

    public static void main(String[] args) throws Exception {
        List<String> hudClasses = new ArrayList<>();

        Files.walk(Path.of(PRECOMPILED))
            .filter(p -> p.toString().endsWith(".class"))
            .forEach(p -> {
                try {
                    byte[] data = Files.readAllBytes(p);
                    ClassReader cr = new ClassReader(data);
                    if (HUD_MODULE.equals(cr.getSuperName())) {
                        hudClasses.add(p.toString());
                    }
                } catch (Exception e) {}
            });

        System.out.println("Found " + hudClasses.size() + " HUD module subclasses");

        for (String classPath : hudClasses) {
            patchClass(classPath);
        }
    }

    static void patchClass(String classPath) throws Exception {
        byte[] data = Files.readAllBytes(Path.of(classPath));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        String className = cn.name;
        int patched = 0;

        for (MethodNode m : cn.methods) {
            if (m.desc.equals("()Z") && !m.name.equals("<init>") && !m.name.equals("<clinit>")) {
                if (isStubFalse(m)) {
                    m.instructions.clear();
                    m.instructions.add(new InsnNode(Opcodes.ICONST_1));
                    m.instructions.add(new InsnNode(Opcodes.IRETURN));
                    patched++;
                    System.out.println("  " + shortName(className) + ": patched " + escape(m.name) + "()Z -> true");
                }
            }
        }

        if (patched > 0) {
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
            cn.accept(cw);
            Files.write(Path.of(classPath), cw.toByteArray());
            System.out.println("  " + shortName(className) + ": " + patched + " visibility stubs fixed");
        }
    }

    static boolean isStubFalse(MethodNode m) {
        for (AbstractInsnNode insn : m.instructions) {
            if (insn.getOpcode() == Opcodes.ICONST_0) {
                AbstractInsnNode next = insn.getNext();
                if (next != null && next.getOpcode() == Opcodes.IRETURN) {
                    return true;
                }
            }
        }
        return false;
    }

    static String shortName(String name) {
        int idx = name.lastIndexOf('/');
        return idx >= 0 ? name.substring(idx + 1) : name;
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
