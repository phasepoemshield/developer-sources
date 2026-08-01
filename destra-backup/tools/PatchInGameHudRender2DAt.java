import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;

/**
 * InGameHudMixin.render inject that posts Render2DEvent used
 * @At(INVOKE, target=class_9080.method_55809) which soft-fails under Loom named
 * mappings (defaultRequire=0) → no HUD. Switch that inject to @At("RETURN").
 */
public final class PatchInGameHudRender2DAt {
    public static void main(String[] args) throws Exception {
        Path p = Path.of(".precompiled/sg/mx/InGameHudMixin.class");
        ClassNode cn = new ClassNode();
        new ClassReader(Files.readAllBytes(p)).accept(cn, 0);
        boolean changed = false;

        for (MethodNode mn : cn.methods) {
            if (!"render".equals(mn.name)) continue;
            if (mn.visibleAnnotations == null) continue;
            for (AnnotationNode an : mn.visibleAnnotations) {
                if (!"Lorg/spongepowered/asm/mixin/injection/Inject;".equals(an.desc)) continue;
                if (an.values == null) continue;
                // Only the inject that uses INVOKE + LayeredDrawer / class_9080 target
                if (!hasInvokeLayeredTarget(an)) continue;

                // Replace "at" value with @At("RETURN")
                for (int i = 0; i < an.values.size() - 1; i += 2) {
                    if (!"at".equals(an.values.get(i))) continue;
                    AnnotationNode at = new AnnotationNode("Lorg/spongepowered/asm/mixin/injection/At;");
                    at.values = new ArrayList<>();
                    at.values.add("value");
                    at.values.add("RETURN");
                    an.values.set(i + 1, Collections.singletonList(at));
                    changed = true;
                    System.out.println("InGameHudMixin." + mn.name + ": @At INVOKE LayeredDrawer → @At(RETURN)");
                }
            }
        }

        if (!changed) {
            System.out.println("PatchInGameHudRender2DAt: nothing to change (already RETURN?)");
            return;
        }

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(p, out);
        Path bc = Path.of("build/classes/java/main/sg/mx/InGameHudMixin.class");
        if (Files.exists(bc)) Files.write(bc, out);
        System.out.println("Wrote " + p + " (" + out.length + " bytes)");
    }

    @SuppressWarnings("unchecked")
    static boolean hasInvokeLayeredTarget(AnnotationNode inject) {
        for (int i = 0; i < inject.values.size() - 1; i += 2) {
            if (!"at".equals(inject.values.get(i))) continue;
            Object atVal = inject.values.get(i + 1);
            List<AnnotationNode> ats = new ArrayList<>();
            if (atVal instanceof List) {
                for (Object o : (List<?>) atVal) {
                    if (o instanceof AnnotationNode) ats.add((AnnotationNode) o);
                }
            } else if (atVal instanceof AnnotationNode) {
                ats.add((AnnotationNode) atVal);
            }
            for (AnnotationNode at : ats) {
                if (at.values == null) continue;
                String value = null;
                String target = null;
                for (int j = 0; j < at.values.size() - 1; j += 2) {
                    if ("value".equals(at.values.get(j))) value = String.valueOf(at.values.get(j + 1));
                    if ("target".equals(at.values.get(j)) && at.values.get(j + 1) instanceof String) {
                        target = (String) at.values.get(j + 1);
                    }
                }
                if ("INVOKE".equals(value) && target != null
                        && (target.contains("class_9080") || target.contains("LayeredDrawer"))) {
                    return true;
                }
            }
        }
        return false;
    }
}
