import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class GenApiException {
    static final String NAME = "ru/dreamix/protection/api/exceptions/ApiException";

    public static void main(String[] args) throws Exception {
        ClassNode cn = new ClassNode();
        cn.version = Opcodes.V21;
        cn.access = Opcodes.ACC_PUBLIC;
        cn.name = NAME;
        cn.superName = "java/lang/RuntimeException";
        cn.interfaces = java.util.Collections.emptyList();

        // Constructor (String)
        MethodNode ctor = new MethodNode(Opcodes.ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
        ctor.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
        ctor.instructions.add(new VarInsnNode(Opcodes.ALOAD, 1));
        ctor.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;)V", false));
        ctor.instructions.add(new InsnNode(Opcodes.RETURN));
        ctor.maxStack = 2; ctor.maxLocals = 2;
        cn.methods.add(ctor);

        // No-arg constructor
        MethodNode ctor0 = new MethodNode(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
        ctor0.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
        ctor0.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "()V", false));
        ctor0.instructions.add(new InsnNode(Opcodes.RETURN));
        ctor0.maxStack = 1; ctor0.maxLocals = 1;
        cn.methods.add(ctor0);

        // (String, Throwable)
        MethodNode ctor2 = new MethodNode(Opcodes.ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", null, null);
        ctor2.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
        ctor2.instructions.add(new VarInsnNode(Opcodes.ALOAD, 1));
        ctor2.instructions.add(new VarInsnNode(Opcodes.ALOAD, 2));
        ctor2.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false));
        ctor2.instructions.add(new InsnNode(Opcodes.RETURN));
        ctor2.maxStack = 3; ctor2.maxLocals = 3;
        cn.methods.add(ctor2);

        // (Throwable)
        MethodNode ctor3 = new MethodNode(Opcodes.ACC_PUBLIC, "<init>", "(Ljava/lang/Throwable;)V", null, null);
        ctor3.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
        ctor3.instructions.add(new VarInsnNode(Opcodes.ALOAD, 1));
        ctor3.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/Throwable;)V", false));
        ctor3.instructions.add(new InsnNode(Opcodes.RETURN));
        ctor3.maxStack = 2; ctor3.maxLocals = 2;
        cn.methods.add(ctor3);

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] out = cw.toByteArray();

        Path target = Path.of(".precompiled/ru/dreamix/protection/api/exceptions/ApiException.class");
        Files.createDirectories(target.getParent());
        Files.write(target, out);
        System.out.println("Generated ApiException stub: " + target + " (" + out.length + " bytes)");
    }
}
