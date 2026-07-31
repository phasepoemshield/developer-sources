import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class PatchHudBlurFlicker {
    static final String OWNER = "ru/destra/hud/HudBlurRenderer";
    static final String BLUR_CAP = "blurCapturedFrame";
    static final String CURR = "currentFrame";

    public static void main(String[] args) throws Exception {
        Path cf = Path.of(".precompiled/ru/destra/hud/HudBlurRenderer.class");
        if (!Files.exists(cf)) { System.out.println("HudBlurRenderer.class not found"); return; }
        ClassReader cr = new ClassReader(Files.readAllBytes(cf));
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        for (MethodNode m : cn.methods) {
            if ("flushBatchedBlurRects".equals(m.name) && "()V".equals(m.desc)) patchFlush(m);
            else if ("drawBlurRect".equals(m.name) && m.desc.startsWith("(Lnet/minecraft/client/gui/DrawContext;FFFFFI)V")) patchDrawBlurRect(m);
        }

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES) {
            @Override protected String getCommonSuperClass(String a, String b) { return "java/lang/Object"; }
        };
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(cf, out);
        Path bc = Path.of("build/classes/java/main/ru/destra/hud/HudBlurRenderer.class");
        if (Files.exists(bc)) Files.write(bc, out);
        System.out.println("Patched HudBlurRenderer flicker: " + out.length + " bytes");
    }

    static void patchFlush(MethodNode m) {
        InsnList il = m.instructions;
        for (AbstractInsnNode n = il.getFirst(); n != null; n = n.getNext()) {
            if (!isGet(n, BLUR_CAP)) continue;
            AbstractInsnNode c1 = n.getNext(), c2 = c1 != null ? c1.getNext() : null, c3 = c2 != null ? c2.getNext() : null;
            if (isGet(c1, CURR) && c2 != null && c2.getOpcode() == Opcodes.LCMP
                    && c3 != null && c3.getOpcode() == Opcodes.IFEQ && c3 instanceof JumpInsnNode) {
                LabelNode draw = ((JumpInsnNode) c3).label;
                il.insertBefore(n, new JumpInsnNode(Opcodes.GOTO, draw));
                il.remove(n); il.remove(c1); il.remove(c2); il.remove(c3);
                System.out.println("  flushBatchedBlurRects: blurCapturedFrame check -> GOTO draw (reuse last blurred FB on skip-frames)");
                return;
            }
        }
        System.out.println("  flushBatchedBlurRects: pattern NOT found (already patched?)");
    }

    static void patchDrawBlurRect(MethodNode m) {
        InsnList il = m.instructions;
        for (AbstractInsnNode n = il.getFirst(); n != null; n = n.getNext()) {
            if (!isGet(n, BLUR_CAP)) continue;
            AbstractInsnNode c1 = n.getNext(), c2 = c1 != null ? c1.getNext() : null, c3 = c2 != null ? c2.getNext() : null;
            if (isGet(c1, CURR) && c2 != null && c2.getOpcode() == Opcodes.LCMP
                    && c3 != null && c3.getOpcode() == Opcodes.IFNE) {
                il.remove(n); il.remove(c1); il.remove(c2); il.remove(c3);
                System.out.println("  drawBlurRect: removed blurCapturedFrame bail (fall through to size check, draw on skip-frames)");
                return;
            }
        }
        System.out.println("  drawBlurRect: pattern NOT found (already patched?)");
    }

    static boolean isGet(AbstractInsnNode n, String name) {
        if (n == null || n.getOpcode() != Opcodes.GETSTATIC || !(n instanceof FieldInsnNode)) return false;
        FieldInsnNode f = (FieldInsnNode) n;
        return f.owner.equals(OWNER) && f.name.equals(name) && f.desc.equals("J");
    }
}
