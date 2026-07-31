import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;

public final class PatchCrosshairClinit {
    static final String CLASS = "ru/destra/module/CrosshairModule";
    static final String INIT_STATIC = "resetToDefaultMatrix";

    public static void main(String[] args) throws Exception {
        Path classFile = Path.of(".precompiled/ru/destra/module/CrosshairModule.class");
        byte[] data = Files.readAllBytes(classFile);

        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, ClassReader.EXPAND_FRAMES);

        boolean patched = false;
        for (MethodNode m : cn.methods) {
            if ("<clinit>".equals(m.name) && "()V".equals(m.desc)) {
                boolean hasInitCall = false;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn instanceof MethodInsnNode) {
                        MethodInsnNode min = (MethodInsnNode) insn;
                        if (min.getOpcode() == Opcodes.INVOKESTATIC && INIT_STATIC.equals(min.name)) {
                            hasInitCall = true; break;
                        }
                    }
                }
                if (!hasInitCall) {
                    injectInitCall(m);
                    patched = true;
                } else {
                    System.out.println("  <clinit> already has resetToDefaultMatrix() call");
                }
            }
        }

        if (!patched) {
            System.out.println("PatchCrosshairClinit: no changes needed");
            return;
        }

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cn.accept(cw);
        byte[] result = cw.toByteArray();
        Files.write(classFile, result);
        System.out.println("ASM patched CrosshairModule: " + data.length + " -> " + result.length
                + " bytes (injected resetToDefaultMatrix into <clinit>)");
    }

    static void injectInitCall(MethodNode m) {
        AbstractInsnNode ret = null;
        for (AbstractInsnNode insn : m.instructions) {
            if (insn.getOpcode() == Opcodes.RETURN) { ret = insn; break; }
        }

        LabelNode start = new LabelNode();
        LabelNode end = new LabelNode();
        LabelNode handler = new LabelNode();
        LabelNode after = new LabelNode();

        InsnList inject = new InsnList();
        inject.add(start);
        inject.add(new MethodInsnNode(Opcodes.INVOKESTATIC, CLASS, INIT_STATIC, "()V", false));
        inject.add(end);
        inject.add(new JumpInsnNode(Opcodes.GOTO, after));
        inject.add(handler);
        inject.add(new FrameNode(Opcodes.F_SAME1, 0, null, 1, new Object[]{"java/lang/Throwable"}));
        inject.add(new InsnNode(Opcodes.POP));
        inject.add(after);
        if (ret != null) {
            m.instructions.insertBefore(ret, inject);
        } else {
            m.instructions.add(inject);
            m.instructions.add(new InsnNode(Opcodes.RETURN));
        }

        m.tryCatchBlocks.add(new TryCatchBlockNode(start, end, handler, "java/lang/Throwable"));
        System.out.println("  Injected resetToDefaultMatrix() call into <clinit> (wrapped in try-catch)");
    }
}
