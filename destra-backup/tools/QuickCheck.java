import java.nio.file.*;
public class QuickCheck {
    public static void main(String[] args) throws Exception {
        String path = "D:/destra-backup/.precompiled/ru/destra/gui/ClickGuiScreen.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        System.out.println("File: " + path);
        System.out.println("Size: " + data.length);
        int cpCount = ((data[8] & 0xFF) << 8) | (data[9] & 0xFF);
        System.out.println("CP count: " + cpCount);
        int tc = ((data[10 + cpCount * 5] & 0xFF) << 8) | (data[11 + cpCount * 5] & 0xFF);
        System.out.println("Quick this_class guess: " + tc);
    }
}
