import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;

public final class PatchChinaHatClinit {
    static final String CLASS = "ru/destra/module/ChinaHatModule";
    static final String INIT_STATIC = "initStaticResources";
    static final Set<String> INIT_FIELDS = new HashSet<>(Arrays.asList(
            "TRIANGLE_RENDER_LAYER", "SIN_TABLE", "COS_TABLE"
    ));

    public static void main(String[] args) throws Exception {
        Path classFile = Path.of(".precompiled/ru/destra/module/ChinaHatModule.class");
        byte[] data = Files.readAllBytes(classFile);

        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, ClassReader.EXPAND_FRAMES);

        int finalRemoved = 0;
        for (FieldNode f : cn.fields) {
            if (INIT_FIELDS.contains(f.name) && (f.access & Opcodes.ACC_FINAL) != 0) {
                f.access &= ~Opcodes.ACC_FINAL;
                finalRemoved++;
                System.out.println("  Removed FINAL from field: " + f.name + " " + f.desc);
            }
        }

        boolean hasInitCall = false;
        for (MethodNode m : cn.methods) {
            if ("<clinit>".equals(m.name) && "()V".equals(m.desc)) {
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
                } else {
                    System.out.println("  <clinit> already has initStaticResources() call");
                }
            }
        }

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cn.accept(cw);
        byte[] result = cw.toByteArray();
        Files.write(classFile, result);
        System.out.println("ASM patched ChinaHatModule: " + data.length + " -> " + result.length
                + " bytes (finalRemoved=" + finalRemoved + ", initCall=" + !hasInitCall + ")");
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
        System.out.println("  Injected initStaticResources() call into <clinit> (wrapped in try-catch)");
    }
}
