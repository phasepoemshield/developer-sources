import java.io.*;
import java.nio.file.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class PatchPublicMethodsStdout {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) { System.err.println("Usage: PatchPublicMethodsStdout <classfile> [methodName ...]"); System.exit(1); }
        byte[] data = Files.readAllBytes(Path.of(args[0]));
        ClassNode cn = new ClassNode();
        new ClassReader(data).accept(cn, 0);
        java.util.Set<String> targets = new java.util.HashSet<>();
        for (int i = 1; i < args.length; i++) targets.add(args[i]);

        for (MethodNode mn : cn.methods) {
            if (targets.isEmpty() || targets.contains(mn.name)) {
                int acc = mn.access;
                acc &= ~Opcodes.ACC_PRIVATE;
                acc &= ~Opcodes.ACC_PROTECTED;
                acc |= Opcodes.ACC_PUBLIC;
                mn.access = acc;
                System.err.println("  " + mn.name + mn.desc + " -> public (0x" + Integer.toHexString(mn.access) + ")");
            }
        }
        for (FieldNode fn : cn.fields) {
            if (targets.isEmpty() || targets.contains(fn.name)) {
                int acc = fn.access;
                acc &= ~Opcodes.ACC_PRIVATE;
                acc &= ~Opcodes.ACC_PROTECTED;
                acc |= Opcodes.ACC_PUBLIC;
                fn.access = acc;
                System.err.println("  field " + fn.name + " " + fn.desc + " -> public (0x" + Integer.toHexString(fn.access) + ")");
            }
        }

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        FileOutputStream rawOut = new FileOutputStream(FileDescriptor.out);
        rawOut.write(out);
        rawOut.flush();
        rawOut.close();
        System.err.println("Written " + out.length + " bytes to stdout");
    }
}
