import java.io.*;
import java.nio.file.*;
import java.util.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class RemoveRemapFalse {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, java.nio.charset.StandardCharsets.UTF_8));

        Path dir = Path.of(".precompiled/sg/mx");
        int patched = 0, skipped = 0;

        try (var stream = Files.list(dir)) {
            var files = stream.filter(p -> p.toString().endsWith(".class")).sorted().toList();
            System.out.println("Found " + files.size() + " classes");

            for (Path file : files) {
                byte[] bytes = Files.readAllBytes(file);
                ClassReader cr = new ClassReader(bytes);
                ClassNode cn = new ClassNode();
                cr.accept(cn, ClassReader.SKIP_CODE | ClassReader.SKIP_FRAMES);

                boolean changed = false;

                if (cn.visibleAnnotations != null) {
                    for (AnnotationNode an : cn.visibleAnnotations) {
                        if (an.desc.equals("Lorg/spongepowered/asm/mixin/Mixin;")) {
                            if (an.values != null) {
                                for (int i = 0; i < an.values.size(); i += 2) {
                                    String key = (String) an.values.get(i);
                                    if (key.equals("remap")) {
                                        an.values.remove(i + 1);
                                        an.values.remove(i);
                                        changed = true;
                                        System.out.println("  Removed remap from " + file.getFileName());
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }

                if (changed) {
                    ClassWriter cw = new ClassWriter(0);
                    cn.accept(cw);
                    Files.write(file, cw.toByteArray());
                    patched++;
                } else {
                    skipped++;
                }
            }
        }
        System.out.println("Done: " + patched + " patched, " + skipped + " unchanged");
    }
}
