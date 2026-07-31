import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;

public final class ScanSgEcVersions {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        Path dir = Path.of(".precompiled/sg/ec");
        Files.list(dir).filter(Files::isRegularFile).filter(p -> p.toString().endsWith(".class")).forEach(p -> {
            try {
                byte[] data = Files.readAllBytes(p);
                int major = ((data[6] & 0xFF) << 8) | (data[7] & 0xFF);
                String n = p.getFileName().toString();
                boolean ascii = true;
                for (int i = 0; i < n.length(); i++) if (n.charAt(i) > 127) ascii = false;
                if (major > 65) {
                    System.out.println("Java" + (major - 44) + " ascii=" + ascii + " " + n);
                }
            } catch (IOException e) {}
        });
    }
}
