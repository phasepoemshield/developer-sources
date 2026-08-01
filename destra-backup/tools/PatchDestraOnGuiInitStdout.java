import java.io.*;
import java.nio.file.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class PatchDestraOnGuiInitStdout {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) { System.err.println("Usage: PatchDestraOnGuiInitStdout <classfile>"); System.exit(1); }
        byte[] data = Files.readAllBytes(Path.of(args[0]));
        ClassNode cn = new ClassNode();
        new ClassReader(data).accept(cn, 0);

        for (MethodNode mn : cn.methods) {
            if (mn.name.equals("onGuiInit") && mn.desc.equals("(Lnet/minecraft/client/gui/screen/Screen;)V")) {
                InsnList body = new InsnList();
                body.add(new InsnNode(Opcodes.RETURN));
                mn.instructions = body;
                mn.maxStack = 0; mn.maxLocals = 2;
                mn.tryCatchBlocks = null;
                mn.localVariables = null;
                System.err.println("Emptied onGuiInit(Screen)V -> RETURN");
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
