import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

/**
 * AspectRatioModule.setEnabled(boolean): true → Module.enable() (lifecycle runs onEnable),
 * false → Module.disable() + resettingToNative = true.
 */
public final class FixAspectRatioSetEnabled {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: FixAspectRatioSetEnabled <precompiled-dir>");
            return;
        }
        File dir = new File(args[0]);
        File target = new File(dir, "ru/destra/module/AspectRatioModule.class");
        if (!target.exists()) {
            System.err.println("AspectRatioModule.class not found in " + dir);
            return;
        }

        byte[] data = Files.readAllBytes(target.toPath());
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        String className = cn.name;
        String moduleClass = "ru/destra/core/Module";

        boolean patched = false;
        for (MethodNode mn : cn.methods) {
            if (mn.name.equals("setEnabled") && mn.desc.equals("(Z)V")) {
                InsnList insns = new InsnList();
                LabelNode elseLabel = new LabelNode();

                insns.add(new VarInsnNode(Opcodes.ILOAD, 1));
                insns.add(new JumpInsnNode(Opcodes.IFEQ, elseLabel));
                // true → Module.enable() — triggers lifecycle onEnable via PatchModuleLifecycle
                insns.add(new VarInsnNode(Opcodes.ALOAD, 0));
                insns.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, moduleClass, "enable", "()V", false));
                insns.add(new InsnNode(Opcodes.RETURN));

                insns.add(elseLabel);
                insns.add(new VarInsnNode(Opcodes.ALOAD, 0));
                insns.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, moduleClass, "disable", "()V", false));
                insns.add(new VarInsnNode(Opcodes.ALOAD, 0));
                insns.add(new InsnNode(Opcodes.ICONST_1));
                insns.add(new FieldInsnNode(Opcodes.PUTFIELD, className, "resettingToNative", "Z"));
                insns.add(new InsnNode(Opcodes.RETURN));

                mn.instructions.clear();
                mn.instructions.add(insns);
                mn.tryCatchBlocks.clear();
                mn.localVariables = null;
                patched = true;
                System.err.println("FixAspectRatioSetEnabled: setEnabled → enable()/disable()+resettingToNative");
                break;
            }
        }

        if (patched) {
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
            cn.accept(cw);
            Files.write(target.toPath(), cw.toByteArray());
            Path bc = Path.of("build/classes/java/main/ru/destra/module/AspectRatioModule.class");
            if (Files.exists(bc)) Files.write(bc, cw.toByteArray());
            System.err.println("FixAspectRatioSetEnabled: patched " + target.getAbsolutePath());
        } else {
            System.err.println("FixAspectRatioSetEnabled: setEnabled method not found");
        }
    }
}
