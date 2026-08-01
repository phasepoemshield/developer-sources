import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;

/**
 * After Module.enable(Z) sets enabled=true and Module.Д(Z) sets enabled=false,
 * call destra$invokeLifecycle(enabled) which reflectively runs onEnable/onDisable
 * and onEnabledChanged(boolean) when present on the concrete module class.
 */
public final class PatchModuleLifecycle {
    static final String MODULE = "ru/destra/core/Module";

    public static void main(String[] args) throws Exception {
        Path p = Path.of(args.length > 0 ? args[0] : ".precompiled/ru/destra/core/Module.class");
        ClassNode cn = new ClassNode();
        new ClassReader(Files.readAllBytes(p)).accept(cn, ClassReader.EXPAND_FRAMES);

        boolean changed = false;
        for (MethodNode mn : cn.methods) {
            if ("enable".equals(mn.name) && "(Z)V".equals(mn.desc)) {
                changed |= injectBeforeReturn(mn, true);
            }
            if ("Д".equals(mn.name) && "(Z)V".equals(mn.desc)) {
                changed |= injectBeforeReturn(mn, false);
            }
        }

        if (!hasHelper(cn)) {
            cn.methods.add(buildHelper());
            changed = true;
            System.out.println("Added Module.destra$invokeLifecycle(Z)");
        }

        if (!changed) {
            System.out.println("PatchModuleLifecycle: nothing to do");
            return;
        }

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(p, out);
        Path bc = Path.of("build/classes/java/main/ru/destra/core/Module.class");
        if (Files.exists(bc)) Files.write(bc, out);
        System.out.println("PatchModuleLifecycle: wrote " + out.length + " bytes");
    }

    static boolean hasHelper(ClassNode cn) {
        for (MethodNode mn : cn.methods) {
            if ("destra$invokeLifecycle".equals(mn.name) && "(Z)V".equals(mn.desc)) return true;
        }
        return false;
    }

    static boolean injectBeforeReturn(MethodNode mn, boolean enabling) {
        for (AbstractInsnNode insn : mn.instructions) {
            if (insn instanceof MethodInsnNode min && "destra$invokeLifecycle".equals(min.name)) {
                return false;
            }
        }
        AbstractInsnNode ret = null;
        for (AbstractInsnNode insn = mn.instructions.getLast(); insn != null; insn = insn.getPrevious()) {
            if (insn.getOpcode() == Opcodes.RETURN) {
                ret = insn;
                break;
            }
        }
        if (ret == null) return false;
        InsnList inject = new InsnList();
        inject.add(new VarInsnNode(Opcodes.ALOAD, 0));
        inject.add(new InsnNode(enabling ? Opcodes.ICONST_1 : Opcodes.ICONST_0));
        inject.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, MODULE, "destra$invokeLifecycle", "(Z)V", false));
        mn.instructions.insertBefore(ret, inject);
        System.out.println("  Injected lifecycle into " + mn.name + mn.desc + " enabling=" + enabling);
        return true;
    }

    static MethodNode buildHelper() {
        MethodNode m = new MethodNode(Opcodes.ACC_PROTECTED, "destra$invokeLifecycle", "(Z)V", null, null);
        Label s1 = new Label(), e1 = new Label(), h1 = new Label();
        Label s2 = new Label(), e2 = new Label(), h2 = new Label();
        Label done = new Label();
        Label elseName = new Label(), gotName = new Label();

        m.visitCode();
        m.visitTryCatchBlock(s1, e1, h1, "java/lang/Throwable");
        m.visitTryCatchBlock(s2, e2, h2, "java/lang/Throwable");

        // --- onEnable / onDisable ---
        m.visitLabel(s1);
        m.visitVarInsn(Opcodes.ALOAD, 0);
        m.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
        m.visitVarInsn(Opcodes.ASTORE, 2);
        m.visitVarInsn(Opcodes.ILOAD, 1);
        m.visitJumpInsn(Opcodes.IFEQ, elseName);
        m.visitLdcInsn("onEnable");
        m.visitJumpInsn(Opcodes.GOTO, gotName);
        m.visitLabel(elseName);
        m.visitLdcInsn("onDisable");
        m.visitLabel(gotName);
        m.visitVarInsn(Opcodes.ASTORE, 3);
        m.visitVarInsn(Opcodes.ALOAD, 2);
        m.visitVarInsn(Opcodes.ALOAD, 3);
        m.visitInsn(Opcodes.ICONST_0);
        m.visitTypeInsn(Opcodes.ANEWARRAY, "java/lang/Class");
        m.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Class", "getDeclaredMethod",
                "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
        m.visitVarInsn(Opcodes.ASTORE, 4);
        m.visitVarInsn(Opcodes.ALOAD, 4);
        m.visitInsn(Opcodes.ICONST_1);
        m.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/reflect/Method", "setAccessible", "(Z)V", false);
        m.visitVarInsn(Opcodes.ALOAD, 4);
        m.visitVarInsn(Opcodes.ALOAD, 0);
        m.visitInsn(Opcodes.ICONST_0);
        m.visitTypeInsn(Opcodes.ANEWARRAY, "java/lang/Object");
        m.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/reflect/Method", "invoke",
                "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        m.visitInsn(Opcodes.POP);
        m.visitLabel(e1);
        m.visitJumpInsn(Opcodes.GOTO, s2);
        m.visitLabel(h1);
        m.visitInsn(Opcodes.POP);

        // --- onEnabledChanged(boolean) ---
        m.visitLabel(s2);
        m.visitVarInsn(Opcodes.ALOAD, 0);
        m.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
        m.visitLdcInsn("onEnabledChanged");
        m.visitInsn(Opcodes.ICONST_1);
        m.visitTypeInsn(Opcodes.ANEWARRAY, "java/lang/Class");
        m.visitInsn(Opcodes.DUP);
        m.visitInsn(Opcodes.ICONST_0);
        m.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/Boolean", "TYPE", "Ljava/lang/Class;");
        m.visitInsn(Opcodes.AASTORE);
        m.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Class", "getDeclaredMethod",
                "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
        m.visitVarInsn(Opcodes.ASTORE, 4);
        m.visitVarInsn(Opcodes.ALOAD, 4);
        m.visitInsn(Opcodes.ICONST_1);
        m.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/reflect/Method", "setAccessible", "(Z)V", false);
        m.visitVarInsn(Opcodes.ALOAD, 4);
        m.visitVarInsn(Opcodes.ALOAD, 0);
        m.visitInsn(Opcodes.ICONST_1);
        m.visitTypeInsn(Opcodes.ANEWARRAY, "java/lang/Object");
        m.visitInsn(Opcodes.DUP);
        m.visitInsn(Opcodes.ICONST_0);
        m.visitVarInsn(Opcodes.ILOAD, 1);
        m.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
        m.visitInsn(Opcodes.AASTORE);
        m.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/reflect/Method", "invoke",
                "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        m.visitInsn(Opcodes.POP);
        m.visitLabel(e2);
        m.visitJumpInsn(Opcodes.GOTO, done);
        m.visitLabel(h2);
        m.visitInsn(Opcodes.POP);
        m.visitLabel(done);
        m.visitInsn(Opcodes.RETURN);
        m.visitMaxs(6, 5);
        m.visitEnd();
        return m;
    }
}
