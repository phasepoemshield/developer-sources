import org.objectweb.asm.*;
import java.io.*;
import java.nio.file.*;

public final class DumpThisClass {
    public static void main(String[] args) throws Exception {
        File f = new File(".precompiled/sg/ec/N0003.class");
        byte[] data = Files.readAllBytes(f.toPath());
        System.out.println("File size: " + data.length);
        ClassReader cr = new ClassReader(data);
        String name = cr.getClassName();
        System.out.println("getClassName: " + name);
        System.out.print("getClassName hex:");
        for (byte b : name.getBytes(java.nio.charset.StandardCharsets.UTF_8)) {
            System.out.printf(" %02x", b);
        }
        System.out.println();
        // Also dump raw this_class from constant pool
        // CP count at offset 8
        int cpCount = ((data[8] & 0xFF) << 8) | (data[9] & 0xFF);
        System.out.println("CP count: " + cpCount);
        // Find first UTF8 entry with "sg/ec"
        int pos = 10;
        for (int i = 1; i < cpCount; i++) {
            int tag = data[pos] & 0xFF; pos++;
            switch (tag) {
                case 1: { int len = ((data[pos]&0xFF)<<8)|(data[pos+1]&0xFF); pos+=2;
                    byte[] str = new byte[len];
                    System.arraycopy(data, pos, str, 0, len);
                    String s = new String(str, java.nio.charset.StandardCharsets.UTF_8);
                    if (s.contains("sg/ec")) {
                        System.out.println("CP["+i+"] tag=1: \"" + s + "\" hex:" + bytesHex(str));
                    }
                    pos += len; break; }
                case 3: case 4: pos += 4; break;
                case 5: case 6: pos += 8; i++; break;
                case 7: case 8: case 16: case 19: case 20: pos += 2; break;
                case 9: case 10: case 11: case 12: case 17: case 18: pos += 4; break;
                case 15: pos += 3; break;
                default: System.out.println("Unknown tag " + tag + " at cp " + i); return;
            }
        }
    }
    static String bytesHex(byte[] b) {
        StringBuilder sb = new StringBuilder();
        for (byte x : b) sb.append(String.format(" %02x", x));
        return sb.toString();
    }
}
