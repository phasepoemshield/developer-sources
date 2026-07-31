import java.io.*;
import java.nio.file.*;
import java.util.*;

public final class ListSgEc {
    public static void main(String[] args) throws Exception {
        Path dir = Path.of(".precompiled/sg/ec");
        List<String> names = new ArrayList<>();
        Files.list(dir).forEach(p -> {
            String n = p.getFileName().toString();
            long size = p.toFile().length();
            boolean ascii = true;
            for (int i = 0; i < n.length(); i++) if (n.charAt(i) > 127) ascii = false;
            names.add((ascii ? "ASCII  " : "NONASCII") + " " + size + " " + n);
        });
        Collections.sort(names);
        for (String s : names) {
            if (s.contains("RoundedRect") || !s.startsWith("ASCII"))
                System.out.println(s);
        }
        System.out.println("---");
        System.out.println("RoundedRectImpl exists: " + Files.exists(dir.resolve("RoundedRectImpl.class")));
        System.out.println("\u0432\u044c.class exists: " + Files.exists(dir.resolve("\u0432\u044c.class")));

        Path rrb = Path.of(".precompiled/ru/destra/render/RoundedRectBuilder.class");
        if (Files.exists(rrb)) {
            byte[] data = Files.readAllBytes(rrb);
            boolean hasOld = containsUtf8(data, "sg/ec/\u0432\u044c");
            boolean hasNew = containsUtf8(data, "sg/ec/RoundedRectImpl");
            System.out.println("RoundedRectBuilder: hasOld=" + hasOld + " hasNew=" + hasNew);
        }
        Path gru = Path.of(".precompiled/ru/destra/render/GuiRenderUtil.class");
        if (Files.exists(gru)) {
            byte[] data = Files.readAllBytes(gru);
            boolean hasOld = containsUtf8(data, "sg/ec/\u0432\u044c");
            boolean hasNew = containsUtf8(data, "sg/ec/RoundedRectImpl");
            System.out.println("GuiRenderUtil: hasOld=" + hasOld + " hasNew=" + hasNew);
        }
    }

    static boolean containsUtf8(byte[] data, String s) {
        byte[] target = s.getBytes(java.nio.charset.StandardCharsets.UTF_8);
        outer:
        for (int i = 0; i <= data.length - target.length; i++) {
            for (int j = 0; j < target.length; j++) {
                if (data[i + j] != target[j]) continue outer;
            }
            return true;
        }
        return false;
    }
}
