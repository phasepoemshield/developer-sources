import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

/**
 * Smoke-test: extract bundled cosmetic zips the same way CustomModelManager does,
 * then scan for avatar.json entries.
 */
public final class VerifyCosmeticExtract {
    public static void main(String[] args) throws Exception {
        Path runModels = Path.of("run/destra/custom_models");
        Path bundled = runModels.resolve(".bundled");
        Files.createDirectories(bundled);

        ClassLoader cl = VerifyCosmeticExtract.class.getClassLoader();
        // Prefer src resources if not on classpath
        Path indexFile = Path.of("src/main/resources/assets/destra/custom_models/index.txt");
        List<String> names = Files.readAllLines(indexFile, StandardCharsets.UTF_8);
        int copied = 0;
        for (String raw : names) {
            String name = raw.trim();
            if (name.isBlank() || name.startsWith("#") || name.contains("/") || name.contains("\\")) continue;
            Path src = Path.of("src/main/resources/assets/destra/custom_models").resolve(name);
            if (!Files.isRegularFile(src)) {
                System.out.println("MISSING: " + src);
                continue;
            }
            Path dst = bundled.resolve(name).normalize();
            if (!dst.startsWith(bundled)) continue;
            byte[] bytes = Files.readAllBytes(src);
            boolean needWrite = !Files.exists(dst) || Files.size(dst) != bytes.length
                    || !Arrays.equals(Files.readAllBytes(dst), bytes);
            if (needWrite) {
                Files.write(dst, bytes);
                System.out.println("Extracted: " + name + " (" + bytes.length + " bytes)");
            } else {
                System.out.println("Up-to-date: " + name);
            }
            copied++;
        }

        System.out.println("--- scan ---");
        List<String> found = new ArrayList<>();
        try (Stream<Path> walk = Files.walk(runModels)) {
            walk.filter(Files::isRegularFile)
                    .filter(p -> p.getFileName().toString().toLowerCase().endsWith(".zip"))
                    .sorted()
                    .forEach(zip -> {
                        try (java.nio.file.FileSystem fs = FileSystems.newFileSystem(zip)) {
                            Path root = fs.getPath("/");
                            try (Stream<Path> inner = Files.walk(root)) {
                                inner.filter(Files::isRegularFile)
                                        .filter(p -> "avatar.json".equalsIgnoreCase(p.getFileName().toString()))
                                        .forEach(p -> {
                                            String parent = p.getParent() == null ? "" : p.getParent().toString();
                                            String label = zip.getFileName().toString().replaceAll("(?i)\\.zip$", "");
                                            if (parent != null && !parent.equals("/") && !parent.isBlank()) {
                                                String rel = parent.startsWith("/") ? parent.substring(1) : parent;
                                                if (!rel.isBlank() && !rel.equalsIgnoreCase(label)) {
                                                    label = label + "/" + rel;
                                                } else if (!rel.isBlank()) {
                                                    label = rel;
                                                }
                                            }
                                            found.add(label + "  <- " + zip.getFileName());
                                        });
                            }
                        } catch (Exception e) {
                            System.out.println("ZIP error " + zip + ": " + e);
                        }
                    });
        }
        found.forEach(System.out::println);
        System.out.println("Extracted/checked zips=" + copied + ", avatar models found=" + found.size());
        if (found.isEmpty()) {
            System.exit(1);
        }
    }
}
