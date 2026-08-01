import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ClassDump {
    public static void main(String[] args) throws Exception {
        for (String p : args) {
            byte[] b = Files.readAllBytes(Path.of(p));
            ClassNode cn = new ClassNode();
            new ClassReader(b).accept(cn, 0);
            System.out.println("==== " + cn.name.replace('/', '.') + " ====");
            System.out.println("super: " + cn.superName + "  interfaces: " + cn.interfaces);
            System.out.println("access: 0x" + Integer.toHexString(cn.access));
            System.out.println("-- fields --");
            for (FieldNode f : cn.fields) {
                System.out.println("  " + "0x"+Integer.toHexString(f.access) + " " + f.name + " : " + f.desc + "  val=" + f.value);
            }
            System.out.println("-- methods --");
            for (MethodNode m : cn.methods) {
                System.out.println("  " + "0x"+Integer.toHexString(m.access) + " " + m.name + m.desc);
            }
            System.out.println("-- strings --");
            TreeSet<String> strs = new TreeSet<>();
            for (MethodNode m : cn.methods) {
                for (int i = 0; i < m.instructions.size(); i++) {
                    AbstractInsnNode n = m.instructions.get(i);
                    if (n instanceof LdcInsnNode ldc && ldc.cst instanceof String s) strs.add(s);
                }
            }
            for (String s : strs) System.out.println("  \"" + s.replace("\\","\\\\").replace("\"","\\\"") + "\"");
        }
    }
}
