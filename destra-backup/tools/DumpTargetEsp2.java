import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;

public final class DumpTargetEsp2 {
    public static void main(String[] args) throws Exception {
        Path classFile = Path.of(".precompiled/ru/destra/module/TargetEspModule.class");
        byte[] data = Files.readAllBytes(classFile);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, ClassReader.EXPAND_FRAMES);

        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));

        System.out.println("=== <clinit> all string LDCs (UTF-8) ===");
        for (MethodNode m : cn.methods) {
            if ("<clinit>".equals(m.name)) {
                int idx = 0;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof LdcInsnNode) {
                        LdcInsnNode ldc = (LdcInsnNode) insn;
                        if (ldc.cst instanceof String) {
                            System.out.println("  [" + idx + "] \"" + ldc.cst + "\"");
                            idx++;
                        }
                    }
                }
            }
        }

        System.out.println("\n=== <init> first ModeSetting (style) construction ===");
        for (MethodNode m : cn.methods) {
            if ("<init>".equals(m.name)) {
                List<String> stack = new ArrayList<>();
                boolean foundFirst = false;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof LdcInsnNode) {
                        LdcInsnNode ldc = (LdcInsnNode) insn;
                        if (ldc.cst instanceof String) {
                            stack.add((String) ldc.cst);
                        }
                    }
                    if (insn instanceof MethodInsnNode) {
                        MethodInsnNode min = (MethodInsnNode) insn;
                        if (min.owner.contains("ModeSetting") && min.name.equals("<init>")) {
                            if (!foundFirst) {
                                foundFirst = true;
                                System.out.println("  First ModeSetting args (last few on stack):");
                                int start = Math.max(0, stack.size() - 7);
                                for (int i = start; i < stack.size(); i++) {
                                    System.out.println("    arg[" + (i - start) + "] = \"" + stack.get(i) + "\"");
                                }
                                stack.clear();
                            }
                        }
                    }
                }
            }
        }

        System.out.println("\n=== onRender2D annotations ===");
        for (MethodNode m : cn.methods) {
            if ("onRender2D".equals(m.name)) {
                System.out.println("  desc=" + m.desc);
                System.out.println("  visibleAnnotations: " + (m.visibleAnnotations == null ? "null" : m.visibleAnnotations.size()));
                if (m.visibleAnnotations != null) {
                    for (AnnotationNode an : m.visibleAnnotations) {
                        System.out.println("    @" + an.desc);
                    }
                }
                System.out.println("  invisibleAnnotations: " + (m.invisibleAnnotations == null ? "null" : m.invisibleAnnotations.size()));
                if (m.invisibleAnnotations != null) {
                    for (AnnotationNode an : m.invisibleAnnotations) {
                        System.out.println("    @" + an.desc);
                    }
                }
            }
        }
    }
}
