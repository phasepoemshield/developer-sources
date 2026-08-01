import java.io.*;
import java.nio.file.*;

public final class CheckBuild {
    public static void main(String[] args) throws Exception {
        Path buildDir = Path.of("build/classes/java/main/sg/ec");
        if (!Files.exists(buildDir)) {
            System.out.println("BUILD sg/ec MISSING");
            return;
        }
        boolean hasOld = Files.exists(buildDir.resolve("\u0432\u044c.class"));
        boolean hasNew = Files.exists(buildDir.resolve("RoundedRectImpl.class"));
        System.out.println("BUILD: \u0432\u044c.class exists=" + hasOld);
        System.out.println("BUILD: RoundedRectImpl.class exists=" + hasNew);

        Path rrb = Path.of("build/classes/java/main/ru/destra/render/RoundedRectBuilder.class");
        if (Files.exists(rrb)) {
            byte[] data = Files.readAllBytes(rrb);
            boolean old = contains(data, "sg/ec/\u0432\u044c");
            boolean neu = contains(data, "sg/ec/RoundedRectImpl");
            System.out.println("BUILD RoundedRectBuilder: old=" + old + " new=" + neu);
        }

        Path gru = Path.of("build/classes/java/main/ru/destra/render/GuiRenderUtil.class");
        if (Files.exists(gru)) {
            byte[] data = Files.readAllBytes(gru);
            boolean old = contains(data, "sg/ec/\u0432\u044c");
            boolean neu = contains(data, "sg/ec/RoundedRectImpl");
            System.out.println("BUILD GuiRenderUtil: old=" + old + " new=" + neu);
        }
    }

    static boolean contains(byte[] data, String s) {
        byte[] t = s.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        outer: for (int i = 0; i <= data.length - t.length; i++) {
            for (int j = 0; j < t.length; j++) if (data[i+j] != t[j]) continue outer;
            return true;
        }
        return false;
    }
}
