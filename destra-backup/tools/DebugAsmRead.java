import org.objectweb.asm.*;
import java.nio.file.*;

public final class DebugAsmRead {
    public static void main(String[] args) throws Exception {
        byte[] data = Files.readAllBytes(Path.of(args[0]));
        try {
            ClassReader cr = new ClassReader(data);
            System.out.println("OK: " + cr.getClassName() + " " + cr.getSuperName());
        } catch (Exception e) {
            System.err.println("FAILED: " + e);
            e.printStackTrace();
        }
    }
}
