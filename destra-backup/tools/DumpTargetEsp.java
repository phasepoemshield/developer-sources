import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;

public final class DumpTargetEsp {
    public static void main(String[] args) throws Exception {
        Path classFile = Path.of(".precompiled/ru/destra/module/TargetEspModule.class");
        byte[] data = Files.readAllBytes(classFile);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, ClassReader.EXPAND_FRAMES);

        System.out.println("=== Methods with @Subscribe ===");
        for (MethodNode m : cn.methods) {
            boolean hasSub = false;
            if (m.visibleAnnotations != null) {
                for (AnnotationNode an : m.visibleAnnotations) {
                    if (an.desc.contains("Subscribe")) {
                        hasSub = true;
                        break;
                    }
                }
            }
            if (hasSub || m.name.equals("onRenderTick") || m.name.equals("onWorldRender")
                    || m.name.equals("onRender2D") || m.name.equals("onRenderEvent")) {
                System.out.println("  " + m.name + m.desc + " @Subscribe=" + hasSub);
            }
        }

        System.out.println("\n=== Static field initial values (strings) ===");
        for (FieldNode f : cn.fields) {
            if ((f.access & Opcodes.ACC_STATIC) != 0 && f.value instanceof String) {
                String v = (String) f.value;
                if (isCyr(v) || v.length() > 0) {
                    System.out.println("  " + f.name + " [" + f.desc + "] = \"" + v + "\"");
                }
            }
        }

        System.out.println("\n=== <clinit> string constants ===");
        for (MethodNode m : cn.methods) {
            if ("<clinit>".equals(m.name)) {
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof LdcInsnNode) {
                        LdcInsnNode ldc = (LdcInsnNode) insn;
                        if (ldc.cst instanceof String) {
                            String s = (String) ldc.cst;
                            if (isCyr(s) || s.equals("TargetESP") || s.contains("тиль") || s.contains("Маркер")
                                || s.contains("Призраки") || s.contains("Трейл") || s.contains("Скан") || s.contains("Сфера")
                                || s.contains("стиль")) {
                                System.out.println("  LDC: \"" + s + "\"");
                            }
                        }
                    }
                }
            }
        }

        System.out.println("\n=== <init> ModeSetting for Э (style) ===");
        for (MethodNode m : cn.methods) {
            if ("<init>".equals(m.name)) {
                int modeSettings = 0;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof MethodInsnNode) {
                        MethodInsnNode min = (MethodInsnNode) insn;
                        if (min.name.equals("ModeSetting") || (min.owner.contains("ModeSetting") && min.name.equals("<init>"))) {
                            modeSettings++;
                        }
                    }
                }
                System.out.println("  ModeSetting constructor calls: " + modeSettings);
            }
        }
    }

    static boolean isCyr(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 0x0400 && c <= 0x04FF) return true;
        }
        return false;
    }
}
