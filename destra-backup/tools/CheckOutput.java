import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;

public final class CheckOutput {
    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        byte[] bytes = Files.readAllBytes(Path.of("tools_out/mixin_src/sg/mx/GameRendererMixin.java"));
        String text = new String(bytes, StandardCharsets.UTF_8);
        String[] lines = text.split("\n");
        for (int i = 44; i < 58; i++) {
            System.out.println((i+1) + ": " + lines[i]);
        }
        // Check if any field has = sign
        boolean hasValue = text.contains("= 0.017453292F");
        System.out.println("Has value: " + hasValue);
    }
}
