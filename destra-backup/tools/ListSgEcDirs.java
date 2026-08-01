import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;

public final class ListSgEcDirs {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        Path dir = Path.of(".precompiled/sg/ec");
        System.out.println("=== Subdirectories in sg/ec ===");
        Files.list(dir).filter(Files::isDirectory).forEach(p -> {
            String n = p.getFileName().toString();
            System.out.print("Dir: " + n + " hex:");
            for (byte b : n.getBytes(StandardCharsets.UTF_8)) System.out.printf(" %02x", b);
            System.out.println();
        });
        System.out.println("=== Looking for с4 (U+0441 U+0034) ===");
        Path s4 = dir.resolve("\u0441\u0034");
        System.out.println("с4 exists: " + Files.exists(s4));
        if (Files.exists(s4)) {
            Files.list(s4).forEach(p -> System.out.println("  " + p.getFileName()));
        }
    }
}
