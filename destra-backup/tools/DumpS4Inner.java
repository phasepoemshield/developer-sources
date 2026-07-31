import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.nio.charset.*;

public final class DumpS4Inner {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        String[] files = {
            ".precompiled/sg/ec/\u04414$3.class",
            ".precompiled/sg/ec/\u04414$\u0432.class"
        };
        for (String f : files) {
            Path p = Path.of(f);
            System.out.println("\n=== " + f + " ===");
            if (!Files.exists(p)) { System.out.println("MISSING"); continue; }
            byte[] data = Files.readAllBytes(p);
            ClassReader cr = new ClassReader(data);
            ClassNode cn = new ClassNode();
            cr.accept(cn, 0);
            int major = ((data[6] & 0xFF) << 8) | (data[7] & 0xFF);
            System.out.println("name: " + cn.name + " super: " + cn.superName + " version: Java " + (major - 44));
            System.out.println("access: " + cn.access + " static=" + ((cn.access & Opcodes.ACC_STATIC) != 0));
            if (cn.innerClasses != null) {
                for (InnerClassNode ic : cn.innerClasses) {
                    System.out.println("  inner: name=" + ic.name + " outer=" + ic.outerName + " innerName=" + ic.innerName);
                }
            }
            // check for outer class ref in constructor
            for (MethodNode m : cn.methods) {
                if ("<init>".equals(m.name)) {
                    System.out.println("  <init>" + m.desc);
                }
            }
        }
    }
}
