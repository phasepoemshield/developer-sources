import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;
import static java.nio.charset.StandardCharsets.*;

public class DumpStringsUtf8 {
    public static void main(String[] args) throws Exception {
        byte[] b = Files.readAllBytes(Path.of(args[0]));
        ClassNode cn = new ClassNode();
        new ClassReader(b).accept(cn, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("==== ").append(cn.name).append(" ====\n");
        // All ldc strings from all methods
        TreeSet<String> strs = new TreeSet<>();
        for (MethodNode m : cn.methods) {
            for (int i = 0; i < m.instructions.size(); i++) {
                AbstractInsnNode n = m.instructions.get(i);
                if (n instanceof LdcInsnNode ldc && ldc.cst instanceof String s) strs.add(s);
            }
        }
        for (String s : strs) {
            sb.append("RAW: ").append(s).append("\n");
            // try reverse double-encoding: utf8 bytes -> cp1251 string -> ? 
            // Most common: original cp1251 bytes were decoded as latin1 then re-encoded utf8
            try {
                String r1 = new String(s.getBytes(UTF_8), ISO_8859_1);
                String r2 = new String(r1.getBytes("Windows-1251"), UTF_8);
                sb.append("  utf8->latin1->cp1251->utf8: ").append(r2).append("\n");
            } catch (Exception e) {}
            try {
                String r = new String(s.getBytes(ISO_8859_1), UTF_8);
                sb.append("  latin1->utf8: ").append(r).append("\n");
            } catch (Exception e) {}
            try {
                String r = new String(s.getBytes("Windows-1251"), UTF_8);
                sb.append("  cp1251->utf8: ").append(r).append("\n");
            } catch (Exception e) {}
        }
        Files.writeString(Path.of(args.length > 1 ? args[1] : "temp_check/strings_dump.txt"), sb.toString(), StandardCharsets.UTF_8);
    }
}
