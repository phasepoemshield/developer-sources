import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;

public final class DumpInitModeSettings {
    public static void main(String[] args) throws Exception {
        Path classFile = Path.of(".precompiled/ru/destra/module/TargetEspModule.class");
        byte[] data = Files.readAllBytes(classFile);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, ClassReader.EXPAND_FRAMES);

        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));

        for (MethodNode m : cn.methods) {
            if ("<init>".equals(m.name)) {
                Deque<Object> stack = new ArrayDeque<>();
                int msCount = 0;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof LdcInsnNode) {
                        LdcInsnNode ldc = (LdcInsnNode) insn;
                        stack.push(ldc.cst);
                    } else if (insn instanceof MethodInsnNode) {
                        MethodInsnNode min = (MethodInsnNode) insn;
                        if (min.owner.contains("ModeSetting") && min.name.equals("<init>")) {
                            msCount++;
                            // ModeSetting(String name, Module module, String... modes)
                            // Stack top: modes..., module, name
                            // Just dump recent strings
                            List<Object> recent = new ArrayList<>();
                            int n = 0;
                            Iterator<Object> it = stack.iterator();
                            while (it.hasNext() && n < 8) { recent.add(it.next()); n++; }
                            Collections.reverse(recent);
                            System.out.println("ModeSetting #" + msCount + " recent stack: " + recent);
                        }
                    } else if (insn instanceof VarInsnNode) {
                        VarInsnNode vin = (VarInsnNode) insn;
                        stack.push("VAR" + vin.var);
                    } else if (insn instanceof FieldInsnNode) {
                        FieldInsnNode fin = (FieldInsnNode) insn;
                        stack.push("FIELD:" + fin.name);
                    }
                }
            }
        }
    }
}
