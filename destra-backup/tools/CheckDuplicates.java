import java.util.zip.*;

public final class CheckDuplicates {
    public static void main(String[] args) throws Exception {
        try (ZipFile zf = new ZipFile(args[0])) {
            var entries = zf.stream().toList();
            entries.stream()
                .filter(e -> e.getName().contains("ChatCommandSender2"))
                .forEach(e -> System.out.println(e.getName() + " size=" + e.getSize() + " compressed=" + e.getCompressedSize()));
            System.out.println("Total entries: " + entries.size());
        }
    }
}
