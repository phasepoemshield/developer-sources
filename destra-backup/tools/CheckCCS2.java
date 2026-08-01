import java.nio.file.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class CheckCCS2 {
    public static void main(String[] args) throws Exception {
        byte[] data = Files.readAllBytes(Path.of(args[0]));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);
        System.out.println("Class access: 0x" + Integer.toHexString(cn.access));
        for (FieldNode fn : cn.fields) {
            System.out.println("  field " + fn.name + " desc=" + fn.desc + " access=0x" + Integer.toHexString(fn.access));
        }
        // Force set ACC_FINAL
        for (FieldNode fn : cn.fields) {
            if (fn.name.equals("mc")) {
                fn.access = Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC | Opcodes.ACC_FINAL;
                System.out.println("  SET mc access=0x" + Integer.toHexString(fn.access));
            }
        }
        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(Path.of(args[0]), out);
        System.out.println("Wrote " + out.length + " bytes");
        // Re-read to verify
        byte[] data2 = Files.readAllBytes(Path.of(args[0]));
        ClassNode cn2 = new ClassNode();
        new ClassReader(data2).accept(cn2, 0);
        for (FieldNode fn : cn2.fields) {
            System.out.println("  RE-READ field " + fn.name + " access=0x" + Integer.toHexString(fn.access));
        }
    }
}
