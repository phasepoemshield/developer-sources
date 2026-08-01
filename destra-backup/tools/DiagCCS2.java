import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.zip.*;

public class DiagCCS2 {
    public static void main(String[] args) throws Exception {
        Path jar = Path.of("build/libs/destra-recovered-1.0.0.jar");
        String target = "ru/destra/misc/ChatCommandSender2.class";
        try (ZipFile zf = new ZipFile(jar.toFile())) {
            ZipEntry e = zf.getEntry(target);
            if (e == null) { System.out.println("NOT FOUND"); return; }
            byte[] bytes;
            try (InputStream is = zf.getInputStream(e)) { bytes = is.readAllBytes(); }
            System.out.println("Entry size: " + bytes.length);
            // Raw field count from bytes
            int magic = ((bytes[0]&0xff)<<24)|((bytes[1]&0xff)<<16)|((bytes[2]&0xff)<<8)|(bytes[3]&0xff);
            System.out.println("Magic: 0x" + Integer.toHexString(magic));
            // CP count at offset 8 (after magic(4) + minor(2) + major(2))
            int cpCount = ((bytes[8]&0xff)<<8)|(bytes[9]&0xff);
            System.out.println("CP count: " + cpCount);
            // access_flags at offset 6+cp... too complex to parse manually, use ASM
            ClassReader cr = new ClassReader(bytes);
            System.out.println("ASM className: " + cr.getClassName());
            System.out.println("ASM access: 0x" + Integer.toHexString(cr.getAccess()));
            ClassNode cn = new ClassNode();
            cr.accept(cn, ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
            System.out.println("ASM fields count: " + cn.fields.size());
            for (FieldNode f : cn.fields) {
                System.out.println("  field: " + f.name + " desc=" + f.desc + " access=0x" + Integer.toHexString(f.access) + " value=" + f.value);
            }
            System.out.println("ASM methods count: " + cn.methods.size());
            // Also try reading without SKIP flags
            ClassNode cn2 = new ClassNode();
            new ClassReader(bytes).accept(cn2, 0);
            System.out.println("ASM full fields count: " + cn2.fields.size());
            for (FieldNode f : cn2.fields) {
                System.out.println("  full field: " + f.name + " desc=" + f.desc + " access=0x" + Integer.toHexString(f.access));
            }
        }
    }
}
