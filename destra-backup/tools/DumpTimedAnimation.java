import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;

public final class DumpTimedAnimation {
    public static void main(String[] args) throws Exception {
        for (String className : new String[]{
            ".precompiled/ru/destra/animation/TimedAnimation.class",
            ".precompiled/ru/destra/animation/AccelerateAnimation.class",
            ".precompiled/ru/destra/animation/DirectionalAnimation.class"
        }) {
            System.out.println("=== " + className + " ===");
            ClassReader cr = new ClassReader(Files.readAllBytes(Path.of(className)));
            ClassNode cn = new ClassNode();
            cr.accept(cn, 0);
            for (MethodNode m : cn.methods) {
                System.out.println("  " + m.name + " " + m.desc + " access=" + Integer.toHexString(m.access));
            }
        }
    }
}
