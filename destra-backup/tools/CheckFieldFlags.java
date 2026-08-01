import java.io.*;
import java.nio.file.*;
import java.util.zip.*;

public final class CheckFieldFlags {
    public static void main(String[] args) throws Exception {
        Path jar = Path.of(args[0]);
        byte[] classBytes;
        try (ZipFile zf = new ZipFile(jar.toFile())) {
            var entry = zf.stream().filter(e -> e.getName().equals("ru/destra/misc/ChatCommandSender2.class")).findFirst().get();
            classBytes = zf.getInputStream(entry).readAllBytes();
        }
        System.out.println("Class size: " + classBytes.length);
        // Parse class file manually to find field access flags
        // magic(4) + minor(2) + major(2) + cp_count(2) = offset 10
        int pos = 10;
        int cpCount = ((classBytes[pos] & 0xFF) << 8) | (classBytes[pos + 1] & 0xFF);
        pos += 2;
        System.out.println("Constant pool count: " + cpCount);
        // Skip constant pool
        for (int i = 1; i < cpCount; i++) {
            int tag = classBytes[pos] & 0xFF;
            pos++;
            switch (tag) {
                case 1: { // Utf8
                    int len = ((classBytes[pos] & 0xFF) << 8) | (classBytes[pos + 1] & 0xFF);
                    pos += 2 + len;
                    break;
                }
                case 3: case 4: case 9: case 10: case 11: case 12: case 17: case 18: case 19: case 20: pos += 4; break;
                case 5: case 6: pos += 8; i++; break; // Long/Double take 2 slots
                case 7: case 8: case 16: pos += 2; break;
                default: System.out.println("Unknown CP tag: " + tag); return;
            }
        }
        // access_flags(2) + this_class(2) + super_class(2) + interfaces_count(2) + interfaces
        int accessFlags = ((classBytes[pos] & 0xFF) << 8) | (classBytes[pos + 1] & 0xFF);
        pos += 2;
        System.out.println("Class access: 0x" + Integer.toHexString(accessFlags));
        pos += 2 + 2 + 2; // this_class, super_class, interfaces_count
        // Skip interfaces array
        int ifaceCount = ((classBytes[pos - 2] & 0xFF) << 8) | (classBytes[pos - 1] & 0xFF);
        pos += ifaceCount * 2;
        // fields_count
        int fieldCount = ((classBytes[pos] & 0xFF) << 8) | (classBytes[pos + 1] & 0xFF);
        pos += 2;
        System.out.println("Field count: " + fieldCount);
        for (int i = 0; i < fieldCount; i++) {
            int fAccess = ((classBytes[pos] & 0xFF) << 8) | (classBytes[pos + 1] & 0xFF);
            int fNameIdx = ((classBytes[pos + 2] & 0xFF) << 8) | (classBytes[pos + 3] & 0xFF);
            int fDescIdx = ((classBytes[pos + 4] & 0xFF) << 8) | (classBytes[pos + 5] & 0xFF);
            int fAttrCount = ((classBytes[pos + 6] & 0xFF) << 8) | (classBytes[pos + 7] & 0xFF);
            pos += 8;
            System.out.println("Field " + i + ": access=0x" + Integer.toHexString(fAccess) + " name_idx=" + fNameIdx + " desc_idx=" + fDescIdx + " attr_count=" + fAttrCount);
            // Skip attributes
            for (int a = 0; a < fAttrCount; a++) {
                pos += 2; // attr name index
                int attrLen = ((classBytes[pos] & 0xFF) << 16) | ((classBytes[pos + 1] & 0xFF) << 8) | (classBytes[pos + 2] & 0xFF);
                pos += 3 + attrLen;
            }
        }
        // Now check methods
        int methodCount = ((classBytes[pos] & 0xFF) << 8) | (classBytes[pos + 1] & 0xFF);
        pos += 2;
        System.out.println("Method count: " + methodCount);
        for (int i = 0; i < methodCount; i++) {
            int mAccess = ((classBytes[pos] & 0xFF) << 8) | (classBytes[pos + 1] & 0xFF);
            int mNameIdx = ((classBytes[pos + 2] & 0xFF) << 8) | (classBytes[pos + 3] & 0xFF);
            int mDescIdx = ((classBytes[pos + 4] & 0xFF) << 8) | (classBytes[pos + 5] & 0xFF);
            int mAttrCount = ((classBytes[pos + 6] & 0xFF) << 8) | (classBytes[pos + 7] & 0xFF);
            pos += 8;
            System.out.println("Method " + i + ": access=0x" + Integer.toHexString(mAccess) + " name_idx=" + mNameIdx + " desc_idx=" + mDescIdx + " attr_count=" + mAttrCount);
            for (int a = 0; a < mAttrCount; a++) {
                pos += 2;
                int attrLen = ((classBytes[pos] & 0xFF) << 16) | ((classBytes[pos + 1] & 0xFF) << 8) | (classBytes[pos + 2] & 0xFF);
                pos += 3 + attrLen;
            }
        }
    }
}
