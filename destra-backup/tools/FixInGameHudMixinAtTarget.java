import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public final class FixInGameHudMixinAtTarget {
    static final String CLASS = "sg/mx/InGameHudMixin";
    static final String YARN_TARGET =
        "Lnet/minecraft/client/gui/LayeredDrawer;render(Lnet/minecraft/client/gui/DrawContext;Lnet/minecraft/client/render/RenderTickCounter;)V";
    static final String INTERMEDIARY_TARGET =
        "Lnet/minecraft/class_9080;method_55809(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V";

    public static void main(String[] args) throws Exception {
        Path classFile = Path.of(".precompiled/sg/mx/InGameHudMixin.class");
        if (!Files.exists(classFile)) {
            System.err.println("InGameHudMixin.class not found: " + classFile);
            return;
        }

        byte[] data = Files.readAllBytes(classFile);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        boolean patched = false;
        for (MethodNode m : cn.methods) {
            if (m.visibleAnnotations == null) continue;
            for (AnnotationNode an : m.visibleAnnotations) {
                if ("Lorg/spongepowered/asm/mixin/injection/Inject;".equals(an.desc)) {
                    patched |= patchInjectAnnotation(an, m.name);
                }
            }
        }

        if (patched) {
            ClassWriter cw = new ClassWriter(0);
            cn.accept(cw);
            Files.write(classFile, cw.toByteArray());
            System.err.println("FixInGameHudMixinAtTarget: patched @At target in " + classFile);
        } else {
            System.err.println("FixInGameHudMixinAtTarget: no @At target needing patch found");
        }
    }

    @SuppressWarnings("unchecked")
    static boolean patchInjectAnnotation(AnnotationNode inject, String methodName) {
        boolean changed = false;
        if (inject.values == null) return false;
        for (int i = 0; i < inject.values.size() - 1; i += 2) {
            Object keyObj = inject.values.get(i);
            if (!(keyObj instanceof String)) continue;
            String key = (String) keyObj;
            if ("at".equals(key)) {
                Object atVal = inject.values.get(i + 1);
                if (atVal instanceof List) {
                    for (Object atAnno : (List<?>) atVal) {
                        if (atAnno instanceof AnnotationNode) {
                            changed |= patchAtAnnotation((AnnotationNode) atAnno, methodName);
                        }
                    }
                } else if (atVal instanceof AnnotationNode) {
                    changed |= patchAtAnnotation((AnnotationNode) atVal, methodName);
                }
            }
        }
        return changed;
    }

    @SuppressWarnings("unchecked")
    static boolean patchAtAnnotation(AnnotationNode at, String methodName) {
        if (at.values == null) return false;
        for (int i = 0; i < at.values.size() - 1; i += 2) {
            Object keyObj = at.values.get(i);
            if (!(keyObj instanceof String)) continue;
            String key = (String) keyObj;
            if ("target".equals(key)) {
                Object targetVal = at.values.get(i + 1);
                if (targetVal instanceof String) {
                    String target = (String) targetVal;
                    if (target.equals(YARN_TARGET)) {
                        at.values.set(i + 1, INTERMEDIARY_TARGET);
                        System.err.println("  Patched @At target in " + methodName + ": " + YARN_TARGET + " -> " + INTERMEDIARY_TARGET);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
