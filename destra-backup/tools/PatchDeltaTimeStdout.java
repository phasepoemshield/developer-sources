import java.io.*;
import java.nio.file.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class PatchDeltaTimeStdout {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) { System.err.println("Usage: PatchDeltaTimeStdout <classfile>"); System.exit(1); }
        byte[] data = Files.readAllBytes(Path.of(args[0]));
        ClassNode cn = new ClassNode();
        new ClassReader(data).accept(cn, 0);

        for (MethodNode mn : cn.methods) {
            // Interpolation.getDeltaTime()D and InterpolationUtil.6()D -> return 0.05
            if ((mn.name.equals("getDeltaTime") || mn.name.equals("6")) && mn.desc.equals("()D")) {
                InsnList body = new InsnList();
                body.add(new LdcInsnNode(0.05));
                body.add(new InsnNode(Opcodes.DRETURN));
                mn.instructions = body;
                mn.maxStack = 2; mn.maxLocals = 0;
                mn.tryCatchBlocks = null;
                System.err.println("Patched " + mn.name + "()D -> return 0.05");
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
