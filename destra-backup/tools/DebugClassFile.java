import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public final class DebugClassFile {
    private DebugClassFile() {
    }

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            throw new IllegalArgumentException("Expected class file path");
        }

        Path classFile = Path.of(args[0]);
        byte[] original = Files.readAllBytes(classFile);
        System.out.println("File size: " + original.length);

        int pos = 0;
        int magic = readU4(original, pos); pos += 4;
        System.out.println("Magic: " + Integer.toHexString(magic));
        int minor = readU2(original, pos); pos += 2;
        int major = readU2(original, pos); pos += 2;
        System.out.println("Version: " + major + "." + minor);
        int cpCount = readU2(original, pos); pos += 2;
        System.out.println("CP count: " + cpCount);

        int cpEnd = pos;
        for (int i = 1; i < cpCount; i++) {
            int tag = original[cpEnd] & 0xFF;
            cpEnd++;
            switch (tag) {
                case 1 -> {
                    int len = readU2(original, cpEnd);
                    cpEnd += 2 + len;
                }
                case 3, 4 -> cpEnd += 4;
                case 5, 6 -> { cpEnd += 8; i++; }
                case 7, 8, 16, 19, 20 -> cpEnd += 2;
                case 9, 10, 11, 12, 18, 17 -> cpEnd += 4;
                case 15 -> cpEnd += 3;
                default -> throw new IllegalStateException("Tag " + tag + " at offset " + (cpEnd - 1));
            }
        }
        System.out.println("CP end: " + cpEnd);

        int accessFlags = readU2(original, cpEnd); cpEnd += 2;
        int thisClass = readU2(original, cpEnd); cpEnd += 2;
        int superClass = readU2(original, cpEnd); cpEnd += 2;
        System.out.println("this_class: " + thisClass + ", super_class: " + superClass);

        int ifaceCount = readU2(original, cpEnd); cpEnd += 2;
        cpEnd += ifaceCount * 2;
        System.out.println("Interfaces done at: " + cpEnd);

        int fieldCount = readU2(original, cpEnd); cpEnd += 2;
        System.out.println("Field count: " + fieldCount);
        for (int i = 0; i < fieldCount; i++) {
            cpEnd = skipMember(original, cpEnd);
        }
        System.out.println("Fields done at: " + cpEnd);

        int methodCount = readU2(original, cpEnd); cpEnd += 2;
        System.out.println("Method count: " + methodCount);
        for (int i = 0; i < methodCount; i++) {
            int nameIdx = readU2(original, cpEnd + 2);
            int descIdx = readU2(original, cpEnd + 4);
            cpEnd = skipMember(original, cpEnd);
        }
        System.out.println("Methods done at: " + cpEnd);
        System.out.println("Class attrs at: " + cpEnd);

        System.out.println("\n--- Now testing findClinitCode ---");
        findClinit(original, cpEnd);
    }

    static int findClinit(byte[] data, int cpEnd) {
        int pos = cpEnd;
        int attrCount = readU2(data, pos); pos += 2;
        System.out.println("Class attr count: " + attrCount);
        for (int i = 0; i < attrCount; i++) {
            pos = skipAttribute(data, pos);
        }
        System.out.println("All done at: " + pos);
        return pos;
    }

    static int skipMember(byte[] data, int pos) {
        int access = readU2(data, pos); pos += 2;
        int name = readU2(data, pos); pos += 2;
        int desc = readU2(data, pos); pos += 2;
        int attrCount = readU2(data, pos); pos += 2;
        for (int i = 0; i < attrCount; i++) {
            pos = skipAttribute(data, pos);
        }
        return pos;
    }

    static int skipAttribute(byte[] data, int pos) {
        pos += 2;
        int len = readU4(data, pos);
        pos += 4 + len;
        return pos;
    }

    static int readU2(byte[] data, int pos) {
        return ((data[pos] & 0xFF) << 8) | (data[pos + 1] & 0xFF);
    }

    static int readU4(byte[] data, int pos) {
        return ((data[pos] & 0xFF) << 24) | ((data[pos + 1] & 0xFF) << 16)
            | ((data[pos + 2] & 0xFF) << 8) | (data[pos + 3] & 0xFF);
    }
}
