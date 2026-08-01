import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;

/**
 * ChinaHatModule.setEnabled(Z) always called Module.disable — same decompiler bug as AspectRatio.
 * Branch: true → Module.enable(); false → releaseShaders + Module.disable().
 */
public final class FixChinaHatSetEnabled {
    public static void main(String[] args) throws Exception {
        Path p = Path.of(".precompiled/ru/destra/module/ChinaHatModule.class");
        ClassNode cn = new ClassNode();
        new ClassReader(Files.readAllBytes(p)).accept(cn, 0);
        String self = cn.name;

        for (MethodNode mn : cn.methods) {
            if (!"setEnabled".equals(mn.name) || !"(Z)V".equals(mn.desc)) continue;

            InsnList il = new InsnList();
            LabelNode elseL = new LabelNode();
            il.add(new VarInsnNode(Opcodes.ILOAD, 1));
            il.add(new JumpInsnNode(Opcodes.IFEQ, elseL));
            il.add(new VarInsnNode(Opcodes.ALOAD, 0));
            il.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "ru/destra/core/Module", "enable", "()V", false));
            il.add(new InsnNode(Opcodes.RETURN));
            il.add(elseL);
            // release shaders then disable
            il.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "ru/destra/render/NebulaShaderRenderer",
                    "releaseShaders", "()V", false));
            il.add(new VarInsnNode(Opcodes.ALOAD, 0));
            il.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "ru/destra/core/Module", "disable", "()V", false));
            il.add(new InsnNode(Opcodes.RETURN));

            mn.instructions.clear();
            mn.tryCatchBlocks.clear();
            mn.localVariables = null;
            mn.instructions.add(il);
            System.out.println("ChinaHat.setEnabled: branched enable/disable");
        }

        // Ensure TRIANGLE_RENDER_LAYER init is not swallowed forever: also call initStaticResources
        // at the start of renderHat if layer is null
        for (MethodNode mn : cn.methods) {
            if (!"renderHat".equals(mn.name)) continue;
            boolean already = false;
            for (AbstractInsnNode insn : mn.instructions) {
                if (insn instanceof MethodInsnNode min && "initStaticResources".equals(min.name)) {
                    already = true;
                    break;
                }
            }
            if (already) continue;
            InsnList inject = new InsnList();
            LabelNode ok = new LabelNode();
            inject.add(new FieldInsnNode(Opcodes.GETSTATIC, self, "TRIANGLE_RENDER_LAYER",
                    "Lnet/minecraft/client/render/RenderLayer;"));
            inject.add(new JumpInsnNode(Opcodes.IFNONNULL, ok));
            inject.add(new MethodInsnNode(Opcodes.INVOKESTATIC, self, "initStaticResources", "()V", false));
            inject.add(ok);
            mn.instructions.insert(inject);
            System.out.println("ChinaHat.renderHat: lazy initStaticResources if layer null");
        }

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(p, out);
        Path bc = Path.of("build/classes/java/main/ru/destra/module/ChinaHatModule.class");
        if (Files.exists(bc)) Files.write(bc, out);
        System.out.println("FixChinaHatSetEnabled: wrote " + out.length + " bytes");
    }
}
