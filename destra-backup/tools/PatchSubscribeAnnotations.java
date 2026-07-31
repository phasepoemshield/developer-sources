import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public final class PatchSubscribeAnnotations {
    static final String SUBSCRIBE_DESC = "Lcom/google/common/eventbus/Subscribe;";

    public static void main(String[] args) throws Exception {
        List<File> classFiles = new ArrayList<>();
        for (String path : args) {
            File f = new File(path);
            if (!f.exists()) {
                System.err.println("SKIP (not found): " + path);
                continue;
            }
            if (f.isDirectory()) {
                collectClasses(f, classFiles);
            } else if (path.endsWith(".class")) {
                classFiles.add(f);
            }
        }
        int totalAdded = 0;
        int totalRemoved = 0;
        int totalFiles = 0;
        for (File f : classFiles) {
            byte[] data = Files.readAllBytes(f.toPath());
            ClassReader cr = new ClassReader(data);
            ClassNode cn = new ClassNode();
            cr.accept(cn, 0);

            Set<String> internallyCalled = collectInternalCalls(cn);

            int added = 0;
            int removed = 0;
            for (MethodNode m : cn.methods) {
                if (!shouldSubscribe(m)) continue;
                boolean hasSub = hasSubscribe(m);
                boolean calledInternally = internallyCalled.contains(m.name + m.desc);

                if (!hasSub && !calledInternally) {
                    if (m.visibleAnnotations == null) m.visibleAnnotations = new ArrayList<>();
                    m.visibleAnnotations.add(new AnnotationNode(SUBSCRIBE_DESC));
                    added++;
                    System.err.println("  Added @Subscribe to " + m.name + m.desc + " in " + f.getName());
                } else if (hasSub && calledInternally) {
                    m.visibleAnnotations.removeIf(an -> SUBSCRIBE_DESC.equals(an.desc));
                    removed++;
                    System.err.println("  Removed @Subscribe from helper " + m.name + m.desc + " in " + f.getName());
                }
            }

            if (added > 0 || removed > 0) {
                ClassWriter cw = new ClassWriter(0);
                cn.accept(cw);
                Files.write(f.toPath(), cw.toByteArray());
                totalAdded += added;
                totalRemoved += removed;
                totalFiles++;
            }
        }
        System.err.println("PatchSubscribeAnnotations: added " + totalAdded + ", removed " + totalRemoved + ", files=" + totalFiles);
    }

    static void collectClasses(File dir, List<File> out) {
        File[] files = dir.listFiles();
        if (files == null) return;
        for (File f : files) {
            if (f.isDirectory()) {
                collectClasses(f, out);
            } else if (f.getName().endsWith(".class")) {
                out.add(f);
            }
        }
    }

    static Set<String> collectInternalCalls(ClassNode cn) {
        Set<String> called = new HashSet<>();
        for (MethodNode m : cn.methods) {
            for (AbstractInsnNode insn : m.instructions) {
                if (insn instanceof MethodInsnNode) {
                    MethodInsnNode min = (MethodInsnNode) insn;
                    if (min.owner.equals(cn.name) && min.getOpcode() != Opcodes.INVOKESTATIC) {
                        called.add(min.name + min.desc);
                    }
                }
            }
        }
        return called;
    }

    static boolean shouldSubscribe(MethodNode m) {
        if ((m.access & Opcodes.ACC_PUBLIC) == 0) return false;
        if (!m.desc.endsWith(")V")) return false;
        if (m.desc.equals("()V")) return false;
        Type[] argTypes = Type.getArgumentTypes(m.desc);
        if (argTypes.length != 1) return false;
        String paramInternal = argTypes[0].getInternalName();
        return paramInternal.startsWith("ru/destra/event/")
            || paramInternal.startsWith("ru/destra/hud/")
            || paramInternal.startsWith("ru/destra/misc/")
            || paramInternal.startsWith("ru/destra/social/");
    }

    static boolean hasSubscribe(MethodNode m) {
        if (m.visibleAnnotations == null) return false;
        for (AnnotationNode an : m.visibleAnnotations) {
            if (SUBSCRIBE_DESC.equals(an.desc)) return true;
        }
        return false;
    }
}
