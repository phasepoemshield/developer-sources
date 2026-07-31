import java.io.*;
import java.nio.file.*;
import java.util.*;

public final class DumpFilenames {
    public static void main(String[] args) throws Exception {
        Path dir = Path.of(".precompiled/sg/ec");
        Files.list(dir).forEach(p -> {
            String n = p.getFileName().toString();
            if (n.contains("RoundedRect") || n.equals("RoundedRectImpl.class")) {
                System.out.print("Name: '" + n + "' hex:");
                for (byte b : n.getBytes(java.nio.charset.StandardCharsets.UTF_8)) {
                    System.out.printf(" %02x", b);
                }
                System.out.println(" length=" + n.length() + " size=" + p.toFile().length());
            }
        });
        System.out.println("--- checking exact path ---");
        Path exact = dir.resolve("RoundedRectImpl.class");
        System.out.println("Files.exists: " + Files.exists(exact));
        System.out.println("Files.notExists: " + Files.notExists(exact));
        try {
            byte[] data = Files.readAllBytes(exact);
            System.out.println("Read OK: " + data.length + " bytes");
        } catch (Exception e) {
            System.out.println("Read failed: " + e);
        }
    }
}
