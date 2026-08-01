import java.nio.file.*;
public class FileCopy {
    public static void main(String[] args) throws Exception {
        Path src = Path.of(args[0]);
        Path dst = Path.of(args[1]);
        byte[] data = Files.readAllBytes(src);
        System.out.println("Read " + data.length + " bytes from " + src);
        Files.write(dst, data);
        byte[] verify = Files.readAllBytes(dst);
        System.out.println("Wrote " + verify.length + " bytes to " + dst);
        boolean match = java.util.Arrays.equals(data, verify);
        System.out.println("Match: " + match);
        // Also check via cmd
        System.out.println("Exists: " + Files.exists(dst));
        System.out.println("Readable: " + Files.isReadable(dst));
        System.out.println("Size on disk: " + Files.size(dst));
    }
}
