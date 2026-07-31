import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;

public final class CleanNonAscii {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        Path ecDir = Path.of(".precompiled/sg/ec");
        int deleted = 0;
        int kept = 0;
        try (var stream = Files.list(ecDir)) {
            for (Path p : (Iterable<Path>) stream::iterator) {
                String name = p.getFileName().toString();
                if (!name.endsWith(".class")) continue;
                boolean nonAscii = false;
                for (int i = 0; i < name.length(); i++) {
                    if (name.charAt(i) > 127) { nonAscii = true; break; }
                }
                if (nonAscii) {
                    Files.delete(p);
                    System.out.println("DELETED: " + name);
                    deleted++;
                } else {
                    kept++;
                }
            }
        }
        System.out.println("Deleted " + deleted + " non-ASCII files, kept " + kept + " ASCII files");
    }
}
