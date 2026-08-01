import java.util.zip.*;
import java.io.*;

public class ListEntries {
    public static void main(String[] args) throws Exception {
        try (ZipFile zf = new ZipFile(args[0])) {
            System.out.println("Total entries: " + zf.size());
            for (var e : zf.stream().toList()) {
                if (e.getName().contains("ChatCommand")) {
                    System.out.println("  " + e.getName() + " size=" + e.getSize() + " csize=" + e.getCompressedSize());
                }
            }
        }
    }
}
