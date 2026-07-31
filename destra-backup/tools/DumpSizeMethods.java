import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;

public final class DumpSizeMethods {
    public static void main(String[] args) throws Exception {
        for (String path : new String[]{".precompiled/ru/destra/gui/Size.class", ".precompiled/ru/destra/gui/CornerRadius.class"}) {
            byte[] data = java.nio.file.Files.readAllBytes(java.nio.file.Path.of(path));
            ClassReader cr = new ClassReader(data);
            ClassNode cn = new ClassNode();
            cr.accept(cn, 0);
            System.out.println("\n=== " + cn.name + " ===");
            System.out.println("Fields:");
            for (FieldNode f : cn.fields) System.out.println("  " + f.name + " " + f.desc + " access=" + f.access);
            System.out.println("Methods:");
            for (MethodNode m : cn.methods) System.out.println("  " + m.name + m.desc);
        }
    }
}
