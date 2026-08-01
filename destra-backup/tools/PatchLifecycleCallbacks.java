import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;

/**
 * Strip recursive enable/disable calls from lifecycle hooks so Module.destra$invokeLifecycle
 * can safely call them:
 * - AspectRatioModule.onEnable: remove trailing Module.enable()
 * - AspectRatioModule: ensure onDisable sets resettingToNative=true
 * - CosmeticModule.onEnabledChanged: remove leading Module.enable(Z)
 */
public final class PatchLifecycleCallbacks {
    public static void main(String[] args) throws Exception {
        patchAspectRatio();
        patchCosmetic();
    }

    static void patchAspectRatio() throws Exception {
        Path p = Path.of(".precompiled/ru/destra/module/AspectRatioModule.class");
        ClassNode cn = new ClassNode();
        new ClassReader(Files.readAllBytes(p)).accept(cn, 0);
        String self = cn.name;
        boolean changed = false;

        for (MethodNode mn : cn.methods) {
            if ("onEnable".equals(mn.name) && "()V".equals(mn.desc)) {
                // Remove invokespecial Module.enable() / enable(Z) near end
                ListIterator<AbstractInsnNode> it = mn.instructions.iterator();
                while (it.hasNext()) {
                    AbstractInsnNode insn = it.next();
                    if (insn instanceof MethodInsnNode min
                            && min.getOpcode() == Opcodes.INVOKESPECIAL
                            && "ru/destra/core/Module".equals(min.owner)
                            && "enable".equals(min.name)) {
                        // remove preceding aload_0 (and optional iconst for enable(Z))
                        AbstractInsnNode prev = insn.getPrevious();
                        if (prev != null && (prev.getOpcode() == Opcodes.ICONST_0 || prev.getOpcode() == Opcodes.ICONST_1)) {
                            mn.instructions.remove(prev);
                            prev = insn.getPrevious();
                        }
                        if (prev != null && prev.getOpcode() == Opcodes.ALOAD) {
                            mn.instructions.remove(prev);
                        }
                        mn.instructions.remove(insn);
                        changed = true;
                        System.out.println("AspectRatio.onEnable: removed Module.enable callback");
                    }
                }
            }
        }

        boolean hasOnDisable = false;
        for (MethodNode mn : cn.methods) {
            if ("onDisable".equals(mn.name) && "()V".equals(mn.desc)) {
                hasOnDisable = true;
                break;
            }
        }
        if (!hasOnDisable) {
            MethodNode onDisable = new MethodNode(Opcodes.ACC_PUBLIC, "onDisable", "()V", null, null);
            onDisable.visitCode();
            onDisable.visitVarInsn(Opcodes.ALOAD, 0);
            onDisable.visitInsn(Opcodes.ICONST_1);
            onDisable.visitFieldInsn(Opcodes.PUTFIELD, self, "resettingToNative", "Z");
            onDisable.visitInsn(Opcodes.RETURN);
            onDisable.visitMaxs(2, 1);
            onDisable.visitEnd();
            cn.methods.add(onDisable);
            changed = true;
            System.out.println("AspectRatio: added onDisable() setting resettingToNative=true");
        }

        if (changed) {
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
            cn.accept(cw);
            byte[] out = cw.toByteArray();
            Files.write(p, out);
            Path bc = Path.of("build/classes/java/main/ru/destra/module/AspectRatioModule.class");
            if (Files.exists(bc)) Files.write(bc, out);
            System.out.println("PatchLifecycleCallbacks: AspectRatio patched (" + out.length + " bytes)");
        }
    }

    static void patchCosmetic() throws Exception {
        Path p = Path.of(".precompiled/ru/destra/module/CosmeticModule.class");
        ClassNode cn = new ClassNode();
        new ClassReader(Files.readAllBytes(p)).accept(cn, 0);
        boolean changed = false;

        for (MethodNode mn : cn.methods) {
            if (!"onEnabledChanged".equals(mn.name) || !"(Z)V".equals(mn.desc)) continue;
            // Remove initial: aload_0; iload_1; invokespecial Module.enable:(Z)V
            AbstractInsnNode[] arr = mn.instructions.toArray();
            for (int i = 0; i < arr.length - 2; i++) {
                if (arr[i].getOpcode() == Opcodes.ALOAD && ((VarInsnNode) arr[i]).var == 0
                        && arr[i + 1].getOpcode() == Opcodes.ILOAD && ((VarInsnNode) arr[i + 1]).var == 1
                        && arr[i + 2] instanceof MethodInsnNode min
                        && min.getOpcode() == Opcodes.INVOKESPECIAL
                        && "ru/destra/core/Module".equals(min.owner)
                        && "enable".equals(min.name)
                        && "(Z)V".equals(min.desc)) {
                    mn.instructions.remove(arr[i]);
                    mn.instructions.remove(arr[i + 1]);
                    mn.instructions.remove(arr[i + 2]);
                    changed = true;
                    System.out.println("Cosmetic.onEnabledChanged: removed Module.enable(Z) callback");
                    break;
                }
            }
        }

        if (changed) {
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
            cn.accept(cw);
            byte[] out = cw.toByteArray();
            Files.write(p, out);
            Path bc = Path.of("build/classes/java/main/ru/destra/module/CosmeticModule.class");
            if (Files.exists(bc)) Files.write(bc, out);
            System.out.println("PatchLifecycleCallbacks: Cosmetic patched (" + out.length + " bytes)");
        }
    }
}
