import java.io.*;
import java.nio.file.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class PatchN0069Constructor {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.err.println("Usage: PatchN0069Constructor <input> <output>");
            System.exit(1);
        }
        String classFile = args[0];
        String outFile = args[1];
        byte[] data = Files.readAllBytes(Path.of(classFile));
        ClassNode cn = new ClassNode();
        new ClassReader(data).accept(cn, 0);

        boolean patched = false;
        for (MethodNode mn : cn.methods) {
            if (mn.name.equals("<init>") && mn.desc.equals("(IIII)V")) {
                System.err.println("Patching N0069.<init>(IIII)V: restoring stripped field assignments");

                AbstractInsnNode ret = null;
                for (AbstractInsnNode insn : mn.instructions) {
                    if (insn.getOpcode() == Opcodes.RETURN) {
                        ret = insn;
                        break;
                    }
                }
                if (ret == null) {
                    System.err.println("  ERROR: no RETURN instruction found");
                    continue;
                }

                InsnList inject = new InsnList();
                // this.width = arg0
                inject.add(new VarInsnNode(Opcodes.ALOAD, 0));
                inject.add(new VarInsnNode(Opcodes.ILOAD, 1));
                inject.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, "width", "I"));
                // this.height = arg1
                inject.add(new VarInsnNode(Opcodes.ALOAD, 0));
                inject.add(new VarInsnNode(Opcodes.ILOAD, 2));
                inject.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, "height", "I"));
                // this.blurRadius = arg2
                inject.add(new VarInsnNode(Opcodes.ALOAD, 0));
                inject.add(new VarInsnNode(Opcodes.ILOAD, 3));
                inject.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, "blurRadius", "I"));
                // this.cornerRadius = arg3
                inject.add(new VarInsnNode(Opcodes.ALOAD, 0));
                inject.add(new VarInsnNode(Opcodes.ILOAD, 4));
                inject.add(new FieldInsnNode(Opcodes.PUTFIELD, cn.name, "cornerRadius", "I"));

                mn.instructions.insertBefore(ret, inject);
                mn.maxStack = 2;
                mn.maxLocals = 5;
                patched = true;
                System.err.println("  Restored width=arg0, height=arg1, blurRadius=arg2, cornerRadius=arg3");
                break;
            }
        }
        if (!patched) {
            System.err.println("N0069.<init>(IIII)V not found (already patched or wrong class)");
        }

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(Path.of(outFile), out);
        System.err.println("Written " + out.length + " bytes to " + outFile);
    }
}
