import java.io.*;
import java.nio.file.*;
import java.util.*;

public final class BumpClassVersions {
    public static void main(String[] args) throws Exception {
        Path root = Path.of(".precompiled");
        int bumped = 0, already = 0, skipped = 0;
        try (var s = Files.walk(root)) {
            var files = s.filter(p -> p.toString().endsWith(".class")).toList();
            for (Path p : files) {
                byte[] b = Files.readAllBytes(p);
                if (b.length < 8) { skipped++; continue; }
                int minor = ((b[4] & 0xff) << 8) | (b[5] & 0xff);
                int major = ((b[6] & 0xff) << 8) | (b[7] & 0xff);
                if (major >= 65) { already++; continue; }
                // bump to Java 21 (major 65, minor 0)
                b[4] = 0; b[5] = 0; b[6] = 0; b[7] = 65;
                Files.write(p, b);
                bumped++;
                // also bump in build/classes if exists
                Path bc = Path.of("build/classes/java/main/" + root.relativize(p).toString().replace('\\','/'));
                if (Files.exists(bc)) {
                    byte[] bb = Files.readAllBytes(bc);
                    if (bb.length >= 8) { bb[4]=0; bb[5]=0; bb[6]=0; bb[7]=65; Files.write(bc, bb); }
                }
            }
        }
        System.out.println("Bumped " + bumped + " classes to Java 21, already OK " + already + ", skipped " + skipped);
    }
}
