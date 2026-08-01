import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;

public final class DumpSliderMethods {
    public static void main(String[] args) throws Exception {
        Path p = Path.of(".precompiled/ru/destra/gui/SliderElement.class");
        byte[] data = Files.readAllBytes(p);
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);
        System.out.println("=== SliderElement methods ===");
        for (MethodNode m : cn.methods) {
            System.out.println("  " + m.name + m.desc);
        }
    }
}
