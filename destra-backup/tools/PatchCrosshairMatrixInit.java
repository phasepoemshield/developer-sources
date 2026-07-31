import java.io.*;
import java.nio.file.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

// Patch ru.destra.module.CrosshairModule.<clinit> to call resetToDefaultMatrix() before RETURN.
//
// Root cause: the recovered CrosshairModule class only initializes its 7 static String name
// fields in <clinit>; it NEVER initializes the static `int[][] crosshairPixels` field there.
// The matrix is only set inside resetToDefaultMatrix() (and onToggle copies matrixModule.matrix
// back into it). A companion mixin (sg.mx.CrosshairModuleInitMixin) was written to inject a call
// to resetToDefaultMatrix() at <clinit> RETURN, but that mixin is not registered in
// destra.mixins.json, so it never applies. Result: crosshairPixels == null after class init.
//
// CrosshairModule.<init> then does `getstatic crosshairPixels` and passes it to
// MatrixModule.<init>(String, Module, int[][]), which stores it directly into `matrix`.
// So matrixModule.matrix == null. When the crosshair settings screen opens and the matrix
// setting is rendered (iterating the 11x11 grid), it throws NullPointerException on the null
// int[][] -> crash opening the settings screen.
//
// Fix: append `invokestatic CrosshairModule.resetToDefaultMatrix:()V` just before the clinit's
// RETURN. This guarantees crosshairPixels is non-null before any <init> reads it. This mirrors
// the PatchClickGuiColorSupplier fix (which repairs a stripped <init> leaving AnimatedColor
// fields null) but targets <clinit> and a static method call instead of field initializers.
//
// This build-time patch is self-contained: it does NOT depend on the mixin being registered in
// destra.mixins.json. If the mixin is later registered too, resetToDefaultMatrix() simply runs
// twice (idempotent — it just rebuilds the same 11x11 array), which is harmless.
//
// Usage: PatchCrosshairMatrixInit <inputClass> <outputClass>
public final class PatchCrosshairMatrixInit {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.err.println("Usage: PatchCrosshairMatrixInit <input> <output>");
            System.exit(1);
        }
        String classFile = args[0];
        String outFile = args[1];
        byte[] data = Files.readAllBytes(Path.of(classFile));
        ClassNode cn = new ClassNode();
        new ClassReader(data).accept(cn, 0);

        String owner = cn.name; // ru/destra/module/CrosshairModule
        String resetMethod = "resetToDefaultMatrix";
        String resetDesc = "()V";

        boolean patched = false;
        for (MethodNode mn : cn.methods) {
            if (!mn.name.equals("<clinit>") || !mn.desc.equals("()V")) continue;
            System.err.println("Patching " + cn.name.replace('/', '.') + ".<clinit>()");

            // Idempotency: skip if a call to resetToDefaultMatrix is already present.
            boolean alreadyPresent = false;
            for (AbstractInsnNode insn : mn.instructions) {
                if (insn instanceof MethodInsnNode min &&
                    min.getOpcode() == Opcodes.INVOKESTATIC &&
                    min.owner.equals(owner) &&
                    min.name.equals(resetMethod) &&
                    min.desc.equals(resetDesc)) {
                    alreadyPresent = true;
                    break;
                }
            }
            if (alreadyPresent) {
                System.err.println("  resetToDefaultMatrix() already injected in <clinit>; skipping");
                patched = true;
                break;
            }

            // Locate the (single) RETURN at the end of the linear static initializer.
            AbstractInsnNode ret = null;
            for (AbstractInsnNode insn : mn.instructions) {
                if (insn.getOpcode() == Opcodes.RETURN) {
                    ret = insn;
                }
            }
            if (ret == null) {
                System.err.println("  ERROR: No RETURN in <clinit>; leaving unchanged");
                break;
            }

            // Insert: invokestatic CrosshairModule.resetToDefaultMatrix:()V  before RETURN.
            InsnList inject = new InsnList();
            inject.add(new MethodInsnNode(Opcodes.INVOKESTATIC, owner, resetMethod, resetDesc, false));
            mn.instructions.insertBefore(ret, inject);

            // invokestatic ()V does not change operand stack depth; keep existing maxes as a floor.
            if (mn.maxStack < 1) mn.maxStack = 1;
            System.err.println("  Injected invokestatic " + owner.replace('/', '.') +
                               "." + resetMethod + "() before RETURN");
            patched = true;
            break;
        }

        if (!patched) {
            System.err.println("No <clinit> ()V found in " + classFile + "; writing input unchanged");
            Files.write(Path.of(outFile), data);
            System.exit(0);
        }

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(Path.of(outFile), out);
        System.err.println("Written " + out.length + " bytes to " + outFile);
    }
}
