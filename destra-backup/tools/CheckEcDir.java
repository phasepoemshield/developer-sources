import java.io.*;
import java.nio.file.*;

public final class CheckEcDir {
    public static void main(String[] args) throws Exception {
        Path ecDir = Path.of(".precompiled/sg/ec");
        System.out.println("exists: " + Files.exists(ecDir));
        System.out.println("isDir: " + Files.isDirectory(ecDir));
        try (var stream = Files.list(ecDir)) {
            long count = stream.filter(Files::isRegularFile).count();
            System.out.println("file count: " + count);
        }
        // Also check with File API
        File dir = ecDir.toFile();
        File[] files = dir.listFiles();
        System.out.println("File.listFiles count: " + (files == null ? "null" : files.length));
        if (files != null) {
            for (File f : files) {
                if (f.getName().contains("N0049") || f.getName().contains("N0050") || f.getName().contains("RoundedRect"))
                    System.out.println("  " + f.getName() + " " + f.length());
            }
        }
        // Check parent
        Path sgDir = Path.of(".precompiled/sg");
        try (var stream = Files.list(sgDir)) {
            stream.forEach(p -> System.out.println("  sg child: " + p.getFileName()));
        }
    }
}
