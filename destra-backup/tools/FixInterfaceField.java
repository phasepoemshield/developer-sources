import java.io.*;
import java.nio.file.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class FixInterfaceField {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));
        Path file = Path.of(".precompiled/ru/destra/misc/ChatCommandSender2.class");
        byte[] bytes = Files.readAllBytes(file);
        ClassReader cr = new ClassReader(bytes);
        ClassNode cn = new ClassNode();
        cr.accept(cn, ClassReader.EXPAND_FRAMES);

        boolean changed = false;
        if ((cn.access & Opcodes.ACC_INTERFACE) != 0 && cn.fields != null) {
            for (FieldNode fn : cn.fields) {
                // Interface fields must be public static final (0x19)
                // Force all interface fields to 0x19
                int newAccess = Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC | Opcodes.ACC_FINAL;
                if (fn.access != newAccess) {
                    System.out.println("Fixing field " + fn.name + ": 0x" + Integer.toHexString(fn.access) + " -> 0x" + Integer.toHexString(newAccess));
                    fn.access = newAccess;
                    changed = true;
                }
            }
        }

        // Always rewrite with COMPUTE_FRAMES to fix missing stackmap frames
        if (changed || (cn.access & Opcodes.ACC_INTERFACE) != 0) {
            ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES);
            cn.accept(cw);
            Files.write(file, cw.toByteArray());
            if (changed) {
                System.out.println("Fixed: " + file);
            } else {
                System.out.println("Recomputed frames: " + file);
            }
        } else {
            System.out.println("No changes needed");
        }
    }
}
