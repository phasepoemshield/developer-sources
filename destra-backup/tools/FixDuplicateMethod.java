import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class FixDuplicateMethod {
    public static void main(String[] args) throws Exception {
        Path p = Path.of(".precompiled/sg/mx/ClientPlayNetworkHandlerMixin.class");
        ClassNode cn = new ClassNode();
        new ClassReader(Files.readAllBytes(p)).accept(cn, 0);
        int i = 0;
        for (MethodNode m : cn.methods) {
            // Methods named by their descriptor (decompiler artifact) — rename to intermediary.
            // sendChatMessage -> method_45729, sendChatCommand -> method_45730 (from refmap).
            if (m.name.startsWith("(") && "(Ljava/lang/String;)V".equals(m.desc)) {
                m.name = i == 0 ? "method_45729" : "method_45730";
                i++;
            }
        }
        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        Files.write(p, cw.toByteArray());
        Path bc = Path.of("build/classes/java/main/sg/mx/ClientPlayNetworkHandlerMixin.class");
        if (Files.exists(bc)) Files.write(bc, cw.toByteArray());
        System.out.println("Fixed: renamed " + i + " methods with desc-as-name -> method_45729/method_45730");
    }
}
