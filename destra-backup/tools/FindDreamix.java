import java.util.zip.*;
import java.util.*;
import java.io.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public class FindDreamix {
    public static void main(String[] args) throws Exception {
        try (ZipFile zf = new ZipFile(args[0])) {
            System.out.println("=== Classes IN ru/dreamix ===");
            for (var entry : zf.stream().toList()) {
                if (entry.getName().contains("dreamix")) {
                    System.out.println("  " + entry.getName());
                }
            }
            System.out.println("=== Classes referencing ru/dreamix ===");
            for (var entry : zf.stream().toList()) {
                if (!entry.getName().endsWith(".class")) continue;
                byte[] bytes;
                try (InputStream is = zf.getInputStream(entry)) { bytes = is.readAllBytes(); }
                ClassNode cn = new ClassNode();
                new ClassReader(bytes).accept(cn, 0);
                boolean found = false;
                for (MethodNode mn : cn.methods) {
                    if (mn.instructions == null) continue;
                    for (AbstractInsnNode insn : mn.instructions) {
                        String ref = null;
                        if (insn instanceof FieldInsnNode fin) ref = fin.owner;
                        if (insn instanceof MethodInsnNode min) ref = min.owner;
                        if (insn instanceof TypeInsnNode tin) ref = tin.desc;
                        if (insn instanceof LdcInsnNode ldc && ldc.cst instanceof String s && s.contains("dreamix")) {
                            System.out.println("  " + entry.getName() + " -> " + cn.name + "." + mn.name + " LDC: " + s);
                            found = true;
                        }
                        if (ref != null && ref.contains("dreamix")) {
                            System.out.println("  " + entry.getName() + " -> " + cn.name + "." + mn.name + " refs " + ref);
                            found = true;
                        }
                    }
                }
                if (cn.superName != null && cn.superName.contains("dreamix")) {
                    System.out.println("  " + entry.getName() + " extends " + cn.superName);
                }
                if (cn.interfaces != null) {
                    for (String i : cn.interfaces) {
                        if (i.contains("dreamix")) {
                            System.out.println("  " + entry.getName() + " implements " + i);
                        }
                    }
                }
            }
        }
    }
}
