import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;

public final class PatchTextRenderCallback {
    public static void main(String[] args) throws Exception {
        String path = ".precompiled/ru/destra/font/TextRenderCallback.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassReader cr = new ClassReader(data);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        boolean removed = cn.methods.removeIf(m -> m.name.equals("test") && m.desc.equals("(Ljava/lang/Object;)Z"));
        if (removed) {
            System.out.println("  Removed stray default test(Object)Z from TextRenderCallback");
        } else {
            System.out.println("  test(Object)Z not present, skipping");
        }

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] result = cw.toByteArray();
        Path tmp = Path.of(path + ".tmp");
        Files.write(tmp, result);
        Files.delete(Path.of(path));
        Files.move(tmp, Path.of(path));
        System.out.println("Written " + result.length + " bytes to " + path);
    }
}
