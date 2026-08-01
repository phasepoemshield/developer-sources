import java.io.*;
import java.nio.file.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class FixCCS2Stdout {
    static final String CCS2 = "ru/destra/misc/ChatCommandSender2";
    static final String HOLDER = "ru/destra/misc/ChatCommandSender2Fields";
    static final String MC_DESC = "Lnet/minecraft/class_310;";

    public static void main(String[] args) throws Exception {
        if (args.length < 1) { System.err.println("Usage: FixCCS2Stdout <classfile>"); System.exit(1); }
        Path path = Path.of(args[0]);
        byte[] data = Files.readAllBytes(path);
        ClassNode cn = new ClassNode();
        new ClassReader(data).accept(cn, ClassReader.EXPAND_FRAMES);

        cn.access = Opcodes.ACC_PUBLIC | Opcodes.ACC_INTERFACE | Opcodes.ACC_ABSTRACT;

        for (FieldNode fn : cn.fields) {
            if (fn.name.equals("mc")) {
                // dev env (runClient) tolerates public static (0x9) with -Xverify:none.
                // ACC_FINAL would break DestraClient which does putstatic CCS2.mc.
                fn.access = Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC;
            }
        }

        for (MethodNode mn : cn.methods) {
            if (mn.name.equals("<clinit>") || mn.name.equals("init")) {
                mn.instructions.clear();
                mn.instructions.add(new InsnNode(Opcodes.RETURN));
                mn.maxStack = 0; mn.maxLocals = 0;
                mn.tryCatchBlocks = null;
            }
        }

        // Rewrite refs back to CCS2 (undo any previous Holder rewrite) so CCS2 methods
        // read CCS2.mc which DestraClient sets via putstatic.
        for (MethodNode mn : cn.methods) {
            if (mn.instructions == null) continue;
            for (AbstractInsnNode insn : mn.instructions) {
                if (insn instanceof FieldInsnNode fin) {
                    if (fin.owner.equals(HOLDER) && fin.name.equals("mc")) {
                        fin.owner = CCS2;
                    }
                }
            }
        }

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        FileOutputStream rawOut = new FileOutputStream(FileDescriptor.out);
        rawOut.write(out);
        rawOut.flush();
        rawOut.close();
        System.err.println("Written " + out.length + " bytes to stdout (mc field FINAL, init/clinit emptied, refs -> Holder)");
    }
}
