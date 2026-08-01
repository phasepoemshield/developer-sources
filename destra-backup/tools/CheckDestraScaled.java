import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;

public final class CheckDestraScaled {
    public static void main(String[] args) throws Exception {
        // Check if there's a mixin providing destra$getScaledWidth
        File mixinDir = new File("src/main/java/sg/mx");
        if (mixinDir.exists()) {
            for (File f : mixinDir.listFiles((d, n) -> n.endsWith(".java"))) {
                String content = new String(Files.readAllBytes(f.toPath()));
                if (content.contains("destra$getScaled") || content.contains("getScaledWidth") || content.contains("getScaledHeight")) {
                    System.out.println("Found in: " + f.getName());
                    // Print relevant lines
                    for (String line : content.split("\n")) {
                        if (line.contains("destra$getScaled") || line.contains("getScaledWidth") || line.contains("getScaledHeight") || line.contains("ScaledResolution")) {
                            System.out.println("  " + line.trim());
                        }
                    }
                }
            }
        }
        
        // Check ScaledResolution class
        String path = ".precompiled/ru/destra/render/ScaledResolution.class";
        File f = new File(path);
        if (f.exists()) {
            byte[] data = Files.readAllBytes(f.toPath());
            ClassReader cr = new ClassReader(data);
            ClassNode cn = new ClassNode();
            cr.accept(cn, 0);
            System.out.println("\n=== ScaledResolution methods ===");
            for (MethodNode m : cn.methods) {
                System.out.printf("  %s %s instr=%d%n", m.name, m.desc, m.instructions.size());
            }
        }
    }
}
