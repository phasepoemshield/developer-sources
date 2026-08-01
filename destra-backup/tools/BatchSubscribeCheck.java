import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class BatchSubscribeCheck {
    public static void main(String[] args) throws Exception {
        String root = args.length > 0 ? args[0] : ".precompiled/ru/destra/module";
        int[] counts = new int[3]; // total, withSub, withoutSub
        List<String> noSub = new ArrayList<>();
        Files.walk(Path.of(root)).filter(p -> p.toString().endsWith(".class")).sorted().forEach(p -> {
            try {
                ClassNode cn = new ClassNode();
                new ClassReader(Files.readAllBytes(p)).accept(cn, 0);
                if (!isModule(cn)) return;
                counts[0]++;
                boolean sub = false;
                for (MethodNode m : cn.methods) {
                    if (hasSub(m)) { sub = true; break; }
                }
                if (sub) counts[1]++;
                else { counts[2]++; noSub.add(cn.name.replace('/','.')); }
            } catch (Exception e) {}
        });
        System.out.println("Total modules: " + counts[0]);
        System.out.println("With @Subscribe: " + counts[1]);
        System.out.println("Without @Subscribe: " + counts[2]);
        System.out.println("\n=== Modules WITHOUT @Subscribe (use mixins or broken?) ===");
        for (String s : noSub) System.out.println("  " + s);
    }

    static boolean hasSub(MethodNode m) {
        if (m.visibleAnnotations != null) for (AnnotationNode a : m.visibleAnnotations) if (a.desc.contains("Subscribe")) return true;
        if (m.invisibleAnnotations != null) for (AnnotationNode a : m.invisibleAnnotations) if (a.desc.contains("Subscribe")) return true;
        return false;
    }

    static boolean isModule(ClassNode cn) {
        String s = cn.superName;
        while (s != null) {
            if (s.equals("ru/destra/core/Module") || s.equals("ru/destra/module/HudModule")) return true;
            if (s.equals("java/lang/Object")) return false;
            s = null;
        }
        return false;
    }
}
