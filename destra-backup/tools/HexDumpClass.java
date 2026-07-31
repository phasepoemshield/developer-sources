import java.util.zip.*;
import java.nio.file.*;

public final class HexDumpClass {
    public static void main(String[] args) throws Exception {
        byte[] b;
        try (ZipFile zf = new ZipFile(args[0])) {
            var e = zf.stream().filter(x -> x.getName().equals("ru/destra/misc/ChatCommandSender2.class")).findFirst().get();
            b = zf.getInputStream(e).readAllBytes();
        }
        // Find "mc" field name in constant pool: it's typically the string "mc"
        // Search for the bytes 00 02 6D 63 (Utf8 tag=1, length=2, 'm','c')
        // But let's just dump hex around offset where field flags should be
        // After constant pool, interfaces, etc.
        
        // Easier: search for the field access pattern
        // After interfaces_count (2 bytes) + interfaces (0), fields_count (2 bytes), then field_info
        int pos = 8; // skip magic + minor + major
        int cpCount = ((b[pos] & 0xFF) << 8) | (b[pos + 1] & 0xFF);
        pos += 2;
        System.out.println("cp_count=" + cpCount);
        
        // Skip constant pool entries
        for (int i = 1; i < cpCount; i++) {
            int tag = b[pos] & 0xFF;
            pos++;
            switch (tag) {
                case 1: { int len = ((b[pos] & 0xFF) << 8) | (b[pos + 1] & 0xFF); pos += 2 + len; break; }
                case 3: case 4: case 9: case 10: case 11: case 12: case 17: case 18: case 19: case 20: pos += 4; break;
                case 5: case 6: pos += 8; i++; break;
                case 7: case 8: case 16: pos += 2; break;
                case 15: pos += 3; break;
                default: System.out.println("Unknown tag " + tag + " at offset " + (pos - 1)); 
                    // Dump hex from here
                    for (int j = Math.max(0, pos - 5); j < Math.min(b.length, pos + 20); j++) {
                        System.out.printf("%04X: %02X (%c)%n", j, b[j] & 0xFF, (b[j] >= 32 && b[j] < 127) ? (char)b[j] : '.');
                    }
                    return;
            }
        }
        
        System.out.println("CP end at offset " + pos);
        
        // access_flags
        int classAccess = ((b[pos] & 0xFF) << 8) | (b[pos + 1] & 0xFF);
        System.out.printf("Class access at %d: 0x%04X%n", pos, classAccess);
        pos += 2;
        pos += 2 + 2; // this_class, super_class
        
        // interfaces_count
        int ifaceCount = ((b[pos] & 0xFF) << 8) | (b[pos + 1] & 0xFF);
        pos += 2 + ifaceCount * 2;
        
        // fields_count
        int fieldCount = ((b[pos] & 0xFF) << 8) | (b[pos + 1] & 0xFF);
        pos += 2;
        System.out.println("fields_count=" + fieldCount + " at offset " + (pos - 2));
        
        // field_info
        int fAccess = ((b[pos] & 0xFF) << 8) | (b[pos + 1] & 0xFF);
        System.out.printf("Field mc access at %d: 0x%04X%n", pos, fAccess);
        System.out.printf("Raw bytes: %02X %02X %02X %02X %02X %02X %02X %02X%n", 
            b[pos] & 0xFF, b[pos+1] & 0xFF, b[pos+2] & 0xFF, b[pos+3] & 0xFF,
            b[pos+4] & 0xFF, b[pos+5] & 0xFF, b[pos+6] & 0xFF, b[pos+7] & 0xFF);
    }
}
