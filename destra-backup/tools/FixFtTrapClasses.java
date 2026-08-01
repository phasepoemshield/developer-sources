import java.io.*;
import java.nio.file.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class FixFtTrapClasses {
    public static void main(String[] args) throws Exception {
        fixN0055(".precompiled/sg/ec/N0055.class");
        fixN0056(".precompiled/sg/ec/N0056.class");
    }

    // N0055 = П (trap type): FT_DRAKONKA / FT_TRAPKA static fields, щД=String name, шц=long durationMs
    static void fixN0055(String path) throws Exception {
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassNode cn = new ClassNode();
        new ClassReader(data).accept(cn, 0);

        // Add constructor (String name, long duration) that sets щД and шц
        boolean hasCtor = false;
        for (MethodNode m : cn.methods) {
            if (m.name.equals("<init>") && m.desc.equals("(Ljava/lang/String;J)V")) { hasCtor = true; break; }
        }
        if (!hasCtor) {
            MethodNode ctor = new MethodNode(0, "<init>", "(Ljava/lang/String;J)V", null, null);
            ctor.instructions = new InsnList();
            ctor.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
            ctor.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false));
            // this.щД = arg1
            String nameField = findFieldName(cn, "Ljava/lang/String;");
            String durField = findFieldName(cn, "J");
            ctor.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
            ctor.instructions.add(new VarInsnNode(Opcodes.ALOAD, 1));
            ctor.instructions.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, nameField, "Ljava/lang/String;"));
            // this.шц = arg2
            ctor.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
            ctor.instructions.add(new VarInsnNode(Opcodes.LLOAD, 2));
            ctor.instructions.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, durField, "J"));
            ctor.instructions.add(new InsnNode(Opcodes.RETURN));
            ctor.maxStack = 3;
            ctor.maxLocals = 4;
            cn.methods.add(ctor);
            System.err.println("N0055: added <init>(String, long) nameField=" + nameField + " durField=" + durField);
        }

        // Always (re)create <clinit> with correct durations
        cn.methods.removeIf(m -> m.name.equals("<clinit>"));
        {
            MethodNode clinit = new MethodNode(Opcodes.ACC_STATIC, "<clinit>", "()V", null, null);
            clinit.instructions = new InsnList();
            // FT_DRAKONKA = new N0055("Драконья трапка", 30000L)
            clinit.instructions.add(new TypeInsnNode(Opcodes.NEW, cn.name));
            clinit.instructions.add(new InsnNode(Opcodes.DUP));
            clinit.instructions.add(new LdcInsnNode("\u0414\u0440\u0430\u043a\u043e\u043d\u044c\u044f \u0442\u0440\u0430\u043f\u043a\u0430"));
            clinit.instructions.add(new LdcInsnNode(Long.valueOf(30000L)));
            clinit.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, cn.name, "<init>", "(Ljava/lang/String;J)V", false));
            clinit.instructions.add(new FieldInsnNode(Opcodes.PUTSTATIC, cn.name, "FT_DRAKONKA", "Lsg/ec/N0055;"));
            // FT_TRAPKA = new N0055("трапка", 15000L)
            clinit.instructions.add(new TypeInsnNode(Opcodes.NEW, cn.name));
            clinit.instructions.add(new InsnNode(Opcodes.DUP));
            clinit.instructions.add(new LdcInsnNode("\u0442\u0440\u0430\u043f\u043a\u0430"));
            clinit.instructions.add(new LdcInsnNode(Long.valueOf(15000L)));
            clinit.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, cn.name, "<init>", "(Ljava/lang/String;J)V", false));
            clinit.instructions.add(new FieldInsnNode(Opcodes.PUTSTATIC, cn.name, "FT_TRAPKA", "Lsg/ec/N0055;"));
            clinit.instructions.add(new InsnNode(Opcodes.RETURN));
            clinit.maxStack = 4;
            clinit.maxLocals = 0;
            cn.methods.add(clinit);
            System.err.println("N0055: added <clinit> (FT_DRAKONKA + FT_TRAPKA)");
        }

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cn.accept(cw);
        Files.write(Path.of(path), cw.toByteArray());
        System.err.println("Written N0055: " + cw.toByteArray().length + " bytes");
    }

    // N0056 = с (trap object): ctor(FunTimeHelperModule, Vec3d, N0055) must store ь=Vec3d, р=new CooldownTimer(), щ=N0055
    static void fixN0056(String path) throws Exception {
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassNode cn = new ClassNode();
        new ClassReader(data).accept(cn, 0);

        // Find field names by descriptor
        String vecField = null, timerField = null, typeField = null;
        for (FieldNode fn : cn.fields) {
            if (fn.desc.equals("Lnet/minecraft/util/math/Vec3d;")) vecField = fn.name;
            else if (fn.desc.equals("Lru/destra/util/CooldownTimer;")) timerField = fn.name;
            else if (fn.desc.equals("Lsg/ec/N0055;")) typeField = fn.name;
        }
        System.err.println("N0056: vecField=" + vecField + " timerField=" + timerField + " typeField=" + typeField);

        // Replace constructor (Lru/destra/module/FunTimeHelperModule;Lnet/minecraft/util/math/Vec3d;Lsg/ec/N0055;)V
        String ctorDesc = "(Lru/destra/module/FunTimeHelperModule;Lnet/minecraft/util/math/Vec3d;Lsg/ec/N0055;)V";
        cn.methods.removeIf(m -> m.name.equals("<init>") && m.desc.equals(ctorDesc));

        MethodNode ctor = new MethodNode(Opcodes.ACC_PUBLIC, "<init>", ctorDesc, null, null);
        ctor.instructions = new InsnList();
        ctor.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
        ctor.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false));
        // this.ь = arg2 (Vec3d)
        ctor.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
        ctor.instructions.add(new VarInsnNode(Opcodes.ALOAD, 2));
        ctor.instructions.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, vecField, "Lnet/minecraft/util/math/Vec3d;"));
        // this.р = new CooldownTimer(); this.р.reset();
        ctor.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
        ctor.instructions.add(new TypeInsnNode(Opcodes.NEW, "ru/destra/util/CooldownTimer"));
        ctor.instructions.add(new InsnNode(Opcodes.DUP));
        ctor.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "ru/destra/util/CooldownTimer", "<init>", "()V", false));
        ctor.instructions.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, timerField, "Lru/destra/util/CooldownTimer;"));
        // this.р.reset() — set lastResetTime = currentTimeMillis
        ctor.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
        ctor.instructions.add(new FieldInsnNode(Opcodes.GETFIELD, cn.name, timerField, "Lru/destra/util/CooldownTimer;"));
        ctor.instructions.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "ru/destra/util/CooldownTimer", "reset", "()V", false));
        // this.щ = arg3 (N0055)
        ctor.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
        ctor.instructions.add(new VarInsnNode(Opcodes.ALOAD, 3));
        ctor.instructions.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, typeField, "Lsg/ec/N0055;"));
        ctor.instructions.add(new InsnNode(Opcodes.RETURN));
        ctor.maxStack = 3;
        ctor.maxLocals = 4;
        cn.methods.add(ctor);

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cn.accept(cw);
        Files.write(Path.of(path), cw.toByteArray());
        System.err.println("Written N0056: " + cw.toByteArray().length + " bytes");
    }

    static String findFieldName(ClassNode cn, String desc) {
        for (FieldNode fn : cn.fields) {
            if (fn.desc.equals(desc)) return fn.name;
        }
        return null;
    }
}
