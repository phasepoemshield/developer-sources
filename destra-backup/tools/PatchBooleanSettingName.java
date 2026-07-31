import java.io.*;
import java.nio.file.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class PatchBooleanSettingName {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) { System.err.println("Usage: PatchBooleanSettingName <classfile> [classfile2 ...]"); System.exit(1); }
        for (String classFile : args) {
            patchClass(classFile);
        }
    }

    static void patchClass(String classFile) throws Exception {
        byte[] data = Files.readAllBytes(Path.of(classFile));
        ClassNode cn = new ClassNode();
        new ClassReader(data).accept(cn, 0);

        boolean patched = false;

        for (MethodNode mn : cn.methods) {
            // Find the method named "э" that returns String
            if (mn.name.equals("\u044D") && mn.desc.equals("()Ljava/lang/String;")) {
                System.err.println("Patching " + cn.name + "." + mn.name + "() - returns empty string");
                // Replace body: ldc "" areturn -> aload_0, invokevirtual getName(), areturn
                mn.instructions.clear();
                mn.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
                mn.instructions.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, cn.name, "getName", "()Ljava/lang/String;", false));
                mn.instructions.add(new InsnNode(Opcodes.ARETURN));
                mn.maxStack = 2;
                mn.maxLocals = 1;
                patched = true;
                System.err.println("  Fixed: now calls getName()");
            }
        }

        if (!patched) {
            System.err.println("WARNING: No method э()Ljava/lang/String; found in " + cn.name);
        }

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(Path.of(classFile), out);
        System.err.println("Written " + out.length + " bytes to " + classFile);
    }
}
