import java.io.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class GenHolderStdout {
    static final String HOLDER = "ru/destra/misc/ChatCommandSender2Fields";
    static final String MC_DESC = "Lnet/minecraft/class_310;";

    public static void main(String[] args) throws Exception {
        ClassNode cn = new ClassNode();
        cn.version = Opcodes.V21;
        cn.access = Opcodes.ACC_PUBLIC;
        cn.name = HOLDER;
        cn.superName = "java/lang/Object";
        cn.fields.add(new FieldNode(Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC, "mc", MC_DESC, null, null));

        MethodNode clinit = new MethodNode(Opcodes.ACC_STATIC, "<clinit>", "()V", null, null);
        clinit.instructions.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "net/minecraft/class_310", "method_1551", "()" + MC_DESC, false));
        clinit.instructions.add(new FieldInsnNode(Opcodes.PUTSTATIC, HOLDER, "mc", MC_DESC));
        clinit.instructions.add(new InsnNode(Opcodes.RETURN));
        clinit.maxStack = 1; clinit.maxLocals = 0;
        cn.methods.add(clinit);

        MethodNode ctor = new MethodNode(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
        ctor.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
        ctor.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false));
        ctor.instructions.add(new InsnNode(Opcodes.RETURN));
        ctor.maxStack = 1; ctor.maxLocals = 1;
        cn.methods.add(ctor);

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        FileOutputStream rawOut = new FileOutputStream(FileDescriptor.out);
        rawOut.write(out);
        rawOut.flush();
        rawOut.close();
        System.err.println("Written holder " + out.length + " bytes to stdout");
    }
}
