import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class FindModuleLayout {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/gui/ClickGuiScreen.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        System.out.println("=== ClickGuiScreen methods ===");
        for (MethodNode m : cn.methods) {
            System.out.printf("  %s %s instr=%d%n", m.name, m.desc, m.instructions.size());
        }

        // Check fields
        System.out.println("\n=== Fields ===");
        for (FieldNode fn : cn.fields) {
            System.out.printf("  %s %s%n", fn.desc, fn.name);
        }
    }
}
