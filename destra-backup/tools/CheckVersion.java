import java.io.*;
import java.nio.file.*;

public final class CheckVersion {
    public static void main(String[] args) throws Exception {
        String[] paths = {
            "build/classes/java/main/sg/ec/RoundedRectImpl.class",
            ".precompiled/sg/ec/RoundedRectImpl.class",
            "build/classes/java/main/ru/destra/render/RoundedRectBuilder.class",
            "build/classes/java/main/ru/destra/render/GuiRenderUtil.class"
        };
        for (String p : paths) {
            Path path = Path.of(p);
            if (!Files.exists(path)) {
                System.out.println(p + ": MISSING");
                continue;
            }
            byte[] data = Files.readAllBytes(path);
            int major = ((data[6] & 0xFF) << 8) | (data[7] & 0xFF);
            int javaVer = major - 44;
            System.out.println(p + ": major=" + major + " (Java " + javaVer + ") size=" + data.length);
        }
    }
}
