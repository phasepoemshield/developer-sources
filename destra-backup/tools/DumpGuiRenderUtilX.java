import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.nio.charset.*;

public final class DumpGuiRenderUtilX {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        Path p = Path.of(".precompiled/ru/destra/render/GuiRenderUtil.class");
        byte[] data = Files.readAllBytes(p);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        // Find methods that call RoundedRectBuilder.build or RoundedRectImpl.render
        for (MethodNode m : cn.methods) {
            boolean usesBuilder = false;
            for (AbstractInsnNode insn : m.instructions) {
                if (insn instanceof MethodInsnNode) {
                    MethodInsnNode min = (MethodInsnNode) insn;
                    if (min.owner.contains("RoundedRect") || min.owner.contains("RoundedRectImpl")) {
                        usesBuilder = true;
                        break;
                    }
                }
            }
            if (usesBuilder) {
                System.out.println("\n=== Method: " + m.name + m.desc + " ===");
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof MethodInsnNode) {
                        MethodInsnNode min = (MethodInsnNode) insn;
                        System.out.println("  INVOKE " + min.owner + "." + min.name + min.desc);
                    } else if (insn instanceof LdcInsnNode) {
                        System.out.println("  LDC " + ((LdcInsnNode) insn).cst);
                    } else if (insn instanceof TypeInsnNode) {
                        System.out.println("  TYPE " + ((TypeInsnNode) insn).desc);
                    }
                }
            }
        }
    }
}
