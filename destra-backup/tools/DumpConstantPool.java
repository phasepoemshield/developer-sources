import java.util.zip.*;
import java.io.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public class DumpConstantPool {
    public static void main(String[] args) throws Exception {
        String target = args.length > 1 ? args[1] : "ru/destra/util/ColorUtil";
        try (ZipFile zf = new ZipFile(args[0])) {
            var entry = zf.getEntry(target + ".class");
            if (entry == null) { System.err.println("NOT FOUND: " + target); return; }
            byte[] bytes;
            try (InputStream is = zf.getInputStream(entry)) { bytes = is.readAllBytes(); }

            ClassReader cr = new ClassReader(bytes);
            ClassNode cn = new ClassNode();
            cr.accept(cn, ClassReader.SKIP_CODE);

            System.out.println("Class: " + cn.name + " access=0x" + Integer.toHexString(cn.access));
            System.out.println("Super: " + cn.superName);
            System.out.println("Interfaces: " + cn.interfaces);
            System.out.println("Fields:");
            for (FieldNode fn : cn.fields) {
                System.out.println("  " + fn.name + " " + fn.desc + " access=0x" + Integer.toHexString(fn.access));
            }
            System.out.println("Methods:");
            for (MethodNode mn : cn.methods) {
                System.out.println("  " + mn.name + mn.desc + " access=0x" + Integer.toHexString(mn.access));
            }

            System.out.println("\n=== Raw constant pool dump ===");
            dumpConstantPool(bytes);
        }
    }

    static void dumpConstantPool(byte[] bytes) {
        // class file format:
        // u4 magic, u2 minor, u2 major, u2 cp_count, cp entries...
        int pos = 8;
        int cpCount = ((bytes[pos] & 0xFF) << 8) | (bytes[pos+1] & 0xFF);
        pos += 2;
        System.out.println("cp_count = " + cpCount);
        for (int i = 1; i < cpCount; i++) {
            int tag = bytes[pos] & 0xFF;
            pos++;
            String entry;
            switch (tag) {
                case 1: // Utf8
                    int len = ((bytes[pos] & 0xFF) << 8) | (bytes[pos+1] & 0xFF);
                    pos += 2;
                    String s = new String(bytes, pos, len);
                    pos += len;
                    entry = "Utf8[" + len + "]: " + s;
                    break;
                case 3: // Integer
                    entry = "Integer: " + readInt(bytes, pos);
                    pos += 4;
                    break;
                case 4: // Float
                    entry = "Float: " + Float.intBitsToFloat(readInt(bytes, pos));
                    pos += 4;
                    break;
                case 5: // Long
                    entry = "Long: " + readLong(bytes, pos);
                    pos += 8;
                    i++; // long takes 2 slots
                    break;
                case 6: // Double
                    entry = "Double: " + Double.longBitsToDouble(readLong(bytes, pos));
                    pos += 8;
                    i++; // double takes 2 slots
                    break;
                case 7: // Class
                    entry = "Class: #" + readU2(bytes, pos);
                    pos += 2;
                    break;
                case 8: // String
                    entry = "String: #" + readU2(bytes, pos);
                    pos += 2;
                    break;
                case 9: // Fieldref
                    entry = "Fieldref: class=#" + readU2(bytes, pos) + " nameAndType=#" + readU2(bytes, pos+2);
                    pos += 4;
                    break;
                case 10: // Methodref
                    entry = "Methodref: class=#" + readU2(bytes, pos) + " nameAndType=#" + readU2(bytes, pos+2);
                    pos += 4;
                    break;
                case 11: // InterfaceMethodref
                    entry = "InterfaceMethodref: class=#" + readU2(bytes, pos) + " nameAndType=#" + readU2(bytes, pos+2);
                    pos += 4;
                    break;
                case 12: // NameAndType
                    entry = "NameAndType: name=#" + readU2(bytes, pos) + " desc=#" + readU2(bytes, pos+2);
                    pos += 4;
                    break;
                case 15: // MethodHandle
                    entry = "MethodHandle: kind=" + (bytes[pos] & 0xFF) + " ref=#" + readU2(bytes, pos+1);
                    pos += 3;
                    break;
                case 16: // MethodType
                    entry = "MethodType: desc=#" + readU2(bytes, pos);
                    pos += 2;
                    break;
                case 17: // Dynamic
                    entry = "Dynamic: bsm=#" + readU2(bytes, pos) + " desc=#" + readU2(bytes, pos+2);
                    pos += 4;
                    break;
                case 18: // InvokeDynamic
                    entry = "InvokeDynamic: bsm=#" + readU2(bytes, pos) + " nameAndType=#" + readU2(bytes, pos+2);
                    pos += 4;
                    break;
                case 19: // Module
                    entry = "Module: #" + readU2(bytes, pos);
                    pos += 2;
                    break;
                case 20: // Package
                    entry = "Package: #" + readU2(bytes, pos);
                    pos += 2;
                    break;
                default:
                    entry = "UNKNOWN TAG " + tag + " at pos " + (pos-1);
                    System.out.println("#" + i + " " + entry);
                    return;
            }
            System.out.println("#" + i + " (tag=" + tag + ") " + entry);
        }
        System.out.println("\nConstant pool ends at pos " + pos + " (total bytes " + bytes.length + ")");
    }

    static int readInt(byte[] b, int p) {
        return ((b[p] & 0xFF) << 24) | ((b[p+1] & 0xFF) << 16) | ((b[p+2] & 0xFF) << 8) | (b[p+3] & 0xFF);
    }
    static long readLong(byte[] b, int p) {
        return (((long)readInt(b, p)) << 32) | (readInt(b, p+4) & 0xFFFFFFFFL);
    }
    static int readU2(byte[] b, int p) {
        return ((b[p] & 0xFF) << 8) | (b[p+1] & 0xFF);
    }
}
