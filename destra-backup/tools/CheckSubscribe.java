import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class CheckSubscribe {
    public static void main(String[] args) throws Exception {
        for (String p : args) {
            ClassNode cn = new ClassNode();
            new ClassReader(Files.readAllBytes(Path.of(p))).accept(cn, 0);
            System.out.println("==== " + cn.name.replace('/','.') + " ====");
            boolean any = false;
            for (MethodNode m : cn.methods) {
                boolean sub = false;
                if (m.visibleAnnotations != null) {
                    for (AnnotationNode a : m.visibleAnnotations) {
                        if (a.desc.contains("Subscribe")) { sub = true; break; }
                    }
                }
                if (m.invisibleAnnotations != null) {
                    for (AnnotationNode a : m.invisibleAnnotations) {
                        if (a.desc.contains("Subscribe")) { sub = true; break; }
                    }
                }
                if (sub || m.name.startsWith("onRender") || m.name.startsWith("onWorld") || m.name.startsWith("onTick") || m.name.equals("onRenderTick") || m.name.equals("onRender2D") || m.name.equals("onRender3D") || m.name.equals("onWorldRender")) {
                    System.out.println("  " + (sub ? "@Sub " : "      ") + m.name + m.desc);
                    any = true;
                }
            }
            if (!any) System.out.println("  (no @Subscribe or onRender* methods)");
        }
    }
}
