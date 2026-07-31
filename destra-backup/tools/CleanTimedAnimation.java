import java.nio.file.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class CleanTimedAnimation {
    static final String COOLDOWN_TIMER = "ru/destra/util/CooldownTimer";
    static final String DIRECTION = "ru/destra/util/Direction";
    static final String TIMED_ANIM = "ru/destra/animation/TimedAnimation";

    public static void main(String[] args) throws Exception {
        for (String path : args) patchFile(path);
    }

    static void patchFile(String path) throws Exception {
        Path classFile = Path.of(path);
        byte[] data = Files.readAllBytes(classFile);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        String timerDesc = "L" + COOLDOWN_TIMER + ";";
        String timerField = null;
        for (FieldNode f : cn.fields) {
            if (timerDesc.equals(f.desc) && (f.access & Opcodes.ACC_STATIC) == 0) {
                timerField = f.name;
                break;
            }
        }
        if (timerField == null) {
            System.out.println(cn.name + ": no timer field, skipping");
            return;
        }

        boolean isBase = cn.superName.equals("java/lang/Object");
        String durationField = null;
        String targetField = null;
        String directionField = null;
        if (isBase) {
            for (FieldNode f : cn.fields) {
                if ((f.access & Opcodes.ACC_STATIC) != 0) continue;
                if ("I".equals(f.desc) && durationField == null) durationField = f.name;
                else if ("D".equals(f.desc) && targetField == null) targetField = f.name;
                else if (("L" + DIRECTION + ";").equals(f.desc) && directionField == null) directionField = f.name;
            }
        }
        System.out.println(cn.name + ": super=" + cn.superName + " timer=" + timerField
                + " duration=" + durationField + " target=" + targetField + " direction=" + directionField);

        for (MethodNode m : cn.methods) {
            if (!"<init>".equals(m.name)) continue;
            if (m.desc.equals("(ID)V")) {
                rewriteCtor(cn, m, timerField, durationField, targetField, directionField, false, isBase);
                System.out.println(cn.name + ": rewrote <init>(ID)V");
            } else if (m.desc.equals("(IDL" + DIRECTION + ";)V")) {
                rewriteCtor(cn, m, timerField, durationField, targetField, directionField, true, isBase);
                System.out.println(cn.name + ": rewrote <init>(IDLDirection;)V");
            }
        }

        ClassWriter cw = new SafeClassWriter();
        cn.accept(cw);
        byte[] result = cw.toByteArray();
        Files.write(classFile, result);
        System.out.println(cn.name + ": cleaned " + data.length + " -> " + result.length + " bytes");
    }

    static void rewriteCtor(ClassNode cn, MethodNode m, String timerField,
            String durationField, String targetField, String directionField,
            boolean hasDirParam, boolean isBase) {
        InsnList insns = new InsnList();
        insns.add(new VarInsnNode(Opcodes.ALOAD, 0));
        if (isBase) {
            insns.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, cn.superName, "<init>", "()V", false));
        } else {
            String superDesc = hasDirParam ? "(IDL" + DIRECTION + ";)V" : "(ID)V";
            insns.add(new VarInsnNode(Opcodes.ILOAD, 1));
            insns.add(new VarInsnNode(Opcodes.DLOAD, 2));
            if (hasDirParam) insns.add(new VarInsnNode(Opcodes.ALOAD, 4));
            insns.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, cn.superName, "<init>", superDesc, false));
        }
        insns.add(new VarInsnNode(Opcodes.ALOAD, 0));
        insns.add(new TypeInsnNode(Opcodes.NEW, COOLDOWN_TIMER));
        insns.add(new InsnNode(Opcodes.DUP));
        insns.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, COOLDOWN_TIMER, "<init>", "()V", false));
        insns.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, timerField, "L" + COOLDOWN_TIMER + ";"));
        if (isBase) {
            if (durationField != null) {
                insns.add(new VarInsnNode(Opcodes.ALOAD, 0));
                insns.add(new VarInsnNode(Opcodes.ILOAD, 1));
                insns.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, durationField, "I"));
            }
            if (targetField != null) {
                insns.add(new VarInsnNode(Opcodes.ALOAD, 0));
                insns.add(new VarInsnNode(Opcodes.DLOAD, 2));
                insns.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, targetField, "D"));
            }
            if (directionField != null) {
                insns.add(new VarInsnNode(Opcodes.ALOAD, 0));
                if (hasDirParam) {
                    insns.add(new VarInsnNode(Opcodes.ALOAD, 4));
                } else {
                    insns.add(new FieldInsnNode(Opcodes.GETSTATIC, DIRECTION, "FORWARDS", "L" + DIRECTION + ";"));
                }
                insns.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, directionField, "L" + DIRECTION + ";"));
            }
        }
        insns.add(new InsnNode(Opcodes.RETURN));
        m.instructions = insns;
        m.maxStack = 4;
        m.maxLocals = hasDirParam ? 5 : 4;
        m.tryCatchBlocks = null;
        m.localVariables = null;
        m.visibleLocalVariableAnnotations = null;
        m.invisibleLocalVariableAnnotations = null;
    }

    static class SafeClassWriter extends ClassWriter {
        SafeClassWriter() { super(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS); }
        @Override
        protected String getCommonSuperClass(String type1, String type2) {
            return "java/lang/Object";
        }
    }
}
