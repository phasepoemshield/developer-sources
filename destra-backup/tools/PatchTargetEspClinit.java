import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;

public final class PatchTargetEspClinit {
    static final String CLASS = "ru/destra/module/TargetEspModule";
    static final String INIT_STATIC = "initStaticResources";

    public static void main(String[] args) throws Exception {
        Path classFile = Path.of(".precompiled/ru/destra/module/TargetEspModule.class");
        byte[] data = Files.readAllBytes(classFile);

        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, ClassReader.EXPAND_FRAMES);

        boolean patchedClinit = false;
        boolean patchedInit = false;

        for (MethodNode m : cn.methods) {
            if ("<clinit>".equals(m.name) && "()V".equals(m.desc)) {
                patchClinit(m);
                patchedClinit = true;
            } else if ("<init>".equals(m.name) && "()V".equals(m.desc)) {
                removeInitStaticFromInit(m);
            }
        }

        if (!patchedClinit) System.out.println("WARNING: <clinit> not found");

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS | ClassWriter.COMPUTE_FRAMES) {
            @Override
            protected String getCommonSuperClass(String type1, String type2) {
                if (type1.startsWith("net/minecraft/") || type2.startsWith("net/minecraft/")) return "java/lang/Object";
                try { return super.getCommonSuperClass(type1, type2); }
                catch (Throwable e) { return "java/lang/Object"; }
            }
        };
        cn.accept(cw);
        byte[] result = cw.toByteArray();
        Files.write(classFile, result);
        System.out.println("ASM patched TargetEspModule: " + data.length + " -> " + result.length + " bytes");
    }

    static void patchClinit(MethodNode m) {
        int removedCalls = 0;
        int removedTryCatch = 0;

        List<TryCatchBlockNode> toRemoveTCB = new ArrayList<>();
        for (TryCatchBlockNode tcb : m.tryCatchBlocks) {
            if ("java/lang/Throwable".equals(tcb.type) || tcb.type == null) {
                boolean isInitCallRange = false;
                for (AbstractInsnNode insn = tcb.start; insn != null && insn != tcb.end; insn = insn.getNext()) {
                    if (insn instanceof MethodInsnNode) {
                        MethodInsnNode min = (MethodInsnNode) insn;
                        if (min.getOpcode() == Opcodes.INVOKESTATIC && INIT_STATIC.equals(min.name)) {
                            isInitCallRange = true;
                            break;
                        }
                    }
                }
                if (isInitCallRange) {
                    toRemoveTCB.add(tcb);
                    removedTryCatch++;
                }
            }
        }
        m.tryCatchBlocks.removeAll(toRemoveTCB);

        List<AbstractInsnNode> toRemove = new ArrayList<>();
        for (AbstractInsnNode insn : m.instructions) {
            if (insn instanceof MethodInsnNode) {
                MethodInsnNode min = (MethodInsnNode) insn;
                if (min.getOpcode() == Opcodes.INVOKESTATIC && INIT_STATIC.equals(min.name)
                        && "()V".equals(min.desc) && CLASS.equals(min.owner)) {
                    toRemove.add(insn);
                    removedCalls++;
                }
            }
        }
        for (AbstractInsnNode insn : toRemove) {
            m.instructions.remove(insn);
        }

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

        TryCatchBlockNode tcb = new TryCatchBlockNode(start, end, handler, "java/lang/Throwable");
        m.tryCatchBlocks.add(tcb);

        System.out.println("  <clinit>: removed " + removedCalls + " duplicate call(s), "
                + removedTryCatch + " broken try-catch(es), injected 1 clean try-catch");
    }

    static void removeInitStaticFromInit(MethodNode m) {
        List<AbstractInsnNode> toRemove = new ArrayList<>();
        for (AbstractInsnNode insn : m.instructions) {
            if (insn instanceof MethodInsnNode) {
                MethodInsnNode min = (MethodInsnNode) insn;
                if (min.getOpcode() == Opcodes.INVOKESTATIC && INIT_STATIC.equals(min.name)
                        && "()V".equals(min.desc) && CLASS.equals(min.owner)) {
                    toRemove.add(insn);
                }
            }
        }
        for (AbstractInsnNode insn : toRemove) {
            m.instructions.remove(insn);
        }
        if (!toRemove.isEmpty()) {
            System.out.println("  <init>: removed " + toRemove.size() + " illegal initStaticResources() call(s) from constructor");
        }
    }
}
