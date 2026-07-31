import java.util.zip.*;
import java.util.*;
import java.io.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public class FindCCS2Subs {
    static final String CCS2 = "ru/destra/misc/ChatCommandSender2";
    public static void main(String[] args) throws Exception {
        try (ZipFile zf = new ZipFile(args[0])) {
            for (var entry : zf.stream().toList()) {
                if (!entry.getName().endsWith(".class")) continue;
                byte[] bytes;
                try (InputStream is = zf.getInputStream(entry)) { bytes = is.readAllBytes(); }
                ClassNode cn = new ClassNode();
                new ClassReader(bytes).accept(cn, 0);
                if (cn.name.equals(CCS2)) continue;
                if (cn.superName != null && cn.superName.equals(CCS2)) {
                    System.out.println("EXTENDS: " + cn.name + " (interface=" + ((cn.access & Opcodes.ACC_INTERFACE) != 0) + ")");
                }
                if (cn.interfaces != null && cn.interfaces.contains(CCS2)) {
                    System.out.println("IMPLEMENTS: " + cn.name + " (interface=" + ((cn.access & Opcodes.ACC_INTERFACE) != 0) + ")");
                }
            }
        }
    }
}
