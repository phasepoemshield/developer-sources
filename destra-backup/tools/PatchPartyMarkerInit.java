import java.io.*;
import java.nio.file.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class PatchPartyMarkerInit {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) { System.err.println("Usage: PatchPartyMarkerInit <classfile>"); System.exit(1); }
        String classFile = args[0];
        byte[] data = Files.readAllBytes(Path.of(classFile));
        ClassNode cn = new ClassNode();
        new ClassReader(data).accept(cn, 0);

        // Find <clinit> and inject: markerQueue = new ConcurrentLinkedQueue();
        for (MethodNode mn : cn.methods) {
            if (mn.name.equals("<clinit>")) {
                System.err.println("Patching PartyMarkerModule.<clinit>()");
                AbstractInsnNode ret = null;
                for (AbstractInsnNode insn : mn.instructions) {
                    if (insn.getOpcode() == Opcodes.RETURN) {
                        ret = insn;
                        break;
                    }
                }
                if (ret == null) {
                    System.err.println("  ERROR: No RETURN found");
                    continue;
                }

                InsnList inject = new InsnList();
                inject.add(new TypeInsnNode(Opcodes.NEW, "java/util/concurrent/ConcurrentLinkedQueue"));
                inject.add(new InsnNode(Opcodes.DUP));
                inject.add(new MethodInsnNode(Opcodes.INVOKESPECIAL, "java/util/concurrent/ConcurrentLinkedQueue", "<init>", "()V", false));
                inject.add(new FieldInsnNode(Opcodes.PUTSTATIC, cn.name, "markerQueue", "Ljava/util/Queue;"));
                mn.instructions.insertBefore(ret, inject);
                System.err.println("  Injected markerQueue = new ConcurrentLinkedQueue()");
                break;
            }
        }

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(Path.of(classFile), out);
        System.err.println("Written " + out.length + " bytes to " + classFile);
    }
}
