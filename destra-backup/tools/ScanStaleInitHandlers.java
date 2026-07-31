import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public final class ScanStaleInitHandlers {
    public static void main(String[] args) throws Exception {
        Path dir = Path.of(".precompiled/sg/mx");
        if (!Files.exists(dir)) { System.out.println("no sg/mx dir"); return; }
        List<Path> classes = new ArrayList<>();
        try (var s = Files.list(dir)) { s.filter(p -> p.toString().endsWith(".class")).forEach(classes::add); }
        Collections.sort(classes);
        int hits = 0;
        for (Path p : classes) {
            ClassReader cr = new ClassReader(Files.readAllBytes(p));
            ClassNode cn = new ClassNode();
            cr.accept(cn, 0);
            for (MethodNode m : cn.methods) {
                if (m.desc == null) continue;
                if (m.desc.contains("CallbackInfo") && m.desc.contains("Lnet/minecraft/client/MinecraftClient;")) {
                    boolean inject = m.visibleAnnotations != null && m.visibleAnnotations.stream()
                        .anyMatch(a -> "Lorg/spongepowered/asm/mixin/injection/Inject;".equals(a.desc));
                    System.out.println((inject ? "[@Inject] " : "        ") + p.getFileName() + " :: " + m.name + m.desc);
                    hits++;
                }
            }
        }
        System.out.println("total handlers with MC+CallbackInfo: " + hits);
    }
}
