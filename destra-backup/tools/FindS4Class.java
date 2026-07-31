import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;

public final class FindS4Class {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        Path dir = Path.of(".precompiled/sg/ec");
        String target = "\u04414"; // с4
        System.out.println("Looking for: '" + target + "'");
        Files.list(dir).forEach(p -> {
            String n = p.getFileName().toString();
            if (n.startsWith(target) || n.contains(target)) {
                System.out.println("FOUND: " + n + " size=" + p.toFile().length());
            }
        });
        // also check exact
        Path exact = dir.resolve(target + ".class");
        System.out.println(target + ".class exists: " + Files.exists(exact));
        Path inner3 = dir.resolve(target + "$3.class");
        Path innerv = dir.resolve(target + "$\u0432.class");
        System.out.println(target + "$3.class exists: " + Files.exists(inner3));
        System.out.println(target + "$в.class exists: " + Files.exists(innerv));
    }
}
