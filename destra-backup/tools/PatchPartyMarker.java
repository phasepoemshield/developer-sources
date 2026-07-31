import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class PatchPartyMarker {
    static final String PATH = ".precompiled/ru/destra/module/PartyMarkerModule.class";

    public static void main(String[] args) throws Exception {
        byte[] data = Files.readAllBytes(Path.of(PATH));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        boolean injected = false;

        for (MethodNode m : cn.methods) {
            if ("<clinit>".equals(m.name)) {
                AbstractInsnNode ret = null;
                for (AbstractInsnNode insn : m.instructions) {
                    if (insn.getOpcode() == Opcodes.RETURN) { ret = insn; break; }
                }
                if (ret != null) {
                    InsnList inject = new InsnList();
                    inject.add(new TypeInsnNode(Opcodes.NEW, "java/util/concurrent/ConcurrentLinkedQueue"));
                    inject.add(new InsnNode(Opcodes.DUP));
                    inject.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "java/util/concurrent/ConcurrentLinkedQueue", "<init>", "()V", false));
                    inject.add(new FieldInsnNode(Opcodes.PUTSTATIC, cn.name, "markerQueue", "Ljava/util/Queue;"));
                    m.instructions.insertBefore(ret, inject);
                    System.out.println("Injected markerQueue init into existing <clinit>");
                    injected = true;
                }
                break;
            }
        }

        if (!injected) {
            MethodNode clinit = new MethodNode(Opcodes.ACC_STATIC, "<clinit>", "()V", null, null);
            clinit.instructions.add(new TypeInsnNode(Opcodes.NEW, "java/util/concurrent/ConcurrentLinkedQueue"));
            clinit.instructions.add(new InsnNode(Opcodes.DUP));
            clinit.instructions.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "java/util/concurrent/ConcurrentLinkedQueue", "<init>", "()V", false));
            clinit.instructions.add(new FieldInsnNode(Opcodes.PUTSTATIC, cn.name, "markerQueue", "Ljava/util/Queue;"));
            clinit.instructions.add(new InsnNode(Opcodes.RETURN));
            cn.methods.add(clinit);
            System.out.println("Created new <clinit> with markerQueue init");
        }

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] result = cw.toByteArray();
        FileOutputStream fos = new FileOutputStream(PATH);
        fos.write(result);
        fos.flush();
        fos.getFD().sync();
        fos.close();
        System.out.println("Written " + result.length + " bytes");
    }
}
