import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class FixRemoveInaccessibleInterface {
    public static void main(String[] args) throws Exception {
        Path p = Path.of(".precompiled/ru/destra/render/CustomHandShaderRenderer.class");
        ClassNode cn = new ClassNode();
        new ClassReader(Files.readAllBytes(p)).accept(cn, 0);
        // Remove inaccessible nested interface (EnchantmentHelper$ContextAwareConsumer = class_1890$class_9702)
        // This is a decompiler artifact — a shader renderer has no business implementing an enchantment interface.
        String removed = null;
        if (cn.interfaces != null) {
            var it = cn.interfaces.iterator();
            while (it.hasNext()) {
                String iface = it.next();
                if (iface.contains("class_1890") || iface.contains("EnchantmentHelper") || iface.contains("ContextAwareConsumer")) {
                    removed = iface;
                    it.remove();
                }
            }
        }
        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(p, out);
        Path bc = Path.of("build/classes/java/main/ru/destra/render/CustomHandShaderRenderer.class");
        if (Files.exists(bc)) Files.write(bc, out);
        System.out.println("Removed interface: " + removed + " from CustomHandShaderRenderer (" + out.length + " bytes)");
    }
}
