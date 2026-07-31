import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.nio.charset.*;

public final class DumpS4Fields {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        String[] files = {
            ".precompiled/sg/ec/\u04414$\u0432.class",
            ".precompiled/sg/ec/\u04414$3.class"
        };
        for (String f : files) {
            Path p = Path.of(f);
            System.out.println("\n=== " + f + " ===");
            byte[] data = Files.readAllBytes(p);
            ClassReader cr = new ClassReader(data);
            ClassNode cn = new ClassNode();
            cr.accept(cn, 0);
            System.out.println("Fields:");
            for (FieldNode fld : cn.fields) {
                System.out.println("  " + fld.name + " " + fld.desc + " access=" + fld.access);
            }
            System.out.println("Methods:");
            for (MethodNode m : cn.methods) {
                System.out.println("  " + m.name + m.desc);
            }
        }
    }
}
