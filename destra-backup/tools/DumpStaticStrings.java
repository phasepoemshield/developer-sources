import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class DumpStaticStrings {
    public static void main(String[] args) throws Exception {
        byte[] b = Files.readAllBytes(Path.of(args[0]));
        ClassNode cn = new ClassNode();
        new ClassReader(b).accept(cn, 0);
        // Map field -> clinit value (from Ldc String followed by putstatic)
        Map<String, Object> clinitVals = new LinkedHashMap<>();
        for (MethodNode m : cn.methods) {
            if (!m.name.equals("<clinit>")) continue;
            for (int i = 0; i < m.instructions.size(); i++) {
                AbstractInsnNode n = m.instructions.get(i);
                if (n instanceof LdcInsnNode ldc && ldc.cst instanceof String s) {
                    // look ahead for putstatic
                    AbstractInsnNode nx = m.instructions.get(i + 1);
                    if (nx instanceof FieldInsnNode fin && fin.getOpcode() == Opcodes.PUTSTATIC) {
                        clinitVals.put(fin.name, s);
                    }
                }
            }
        }
        // Now scan constructor for getstatic used as setting name (followed by invokespecial BooleanSetting/SettingGroup/ModeSetting/NumberSetting init or anewarray)
        System.out.println("=== <clinit> static String fields (" + clinitVals.size() + ") ===");
        for (var e : clinitVals.entrySet()) {
            String v = String.valueOf(e.getValue());
            // show raw + reinterpreted
            String reinterp = "";
            try { reinterp = new String(v.getBytes("Windows-1251"), "UTF-8"); } catch (Exception ex) {}
            System.out.println("  " + e.getKey() + " = \"" + v + "\"  | cp1251->utf8: \"" + reinterp + "\"");
        }
    }
}
