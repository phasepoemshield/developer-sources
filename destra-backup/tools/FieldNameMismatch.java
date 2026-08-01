import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

// Compare field names used in GETSTATIC (constructor, reads) vs PUTSTATIC (clinit, writes).
// Obfuscated Cyrillic field names can look identical when rendered but be different Unicode
// codepoints -> the constructor reads a field that <clinit> never wrote -> null at runtime ->
// SettingSanitizer.safeName falls back to "Boolean"/"Number"/"SettingGroup".
public class FieldNameMismatch {
    public static void main(String[] args) throws Exception {
        byte[] b = Files.readAllBytes(Path.of(args[0]));
        ClassNode cn = new ClassNode();
        new ClassReader(b).accept(cn, 0);

        // Collect declared static String fields
        Set<String> declared = new TreeSet<>();
        for (FieldNode f : cn.fields) {
            if ((f.access & Opcodes.ACC_STATIC) != 0 && f.desc.equals("Ljava/lang/String;")) {
                declared.add(f.name);
            }
        }

        // Track PUTSTATIC String fields in <clinit> (writes)
        Set<String> written = new TreeSet<>();
        // Track GETSTATIC String fields in <init> (reads)
        Set<String> readInInit = new TreeSet<>();
        // Track ALL GETSTATIC String fields
        Set<String> readAll = new TreeSet<>();

        for (MethodNode m : cn.methods) {
            for (int i = 0; i < m.instructions.size(); i++) {
                AbstractInsnNode n = m.instructions.get(i);
                if (!(n instanceof FieldInsnNode fin)) continue;
                if (!fin.desc.equals("Ljava/lang/String;")) continue;
                if (fin.getOpcode() == Opcodes.PUTSTATIC && m.name.equals("<clinit>")) written.add(fin.name);
                if (fin.getOpcode() == Opcodes.GETSTATIC) {
                    readAll.add(fin.name);
                    if (m.name.equals("<init>")) readInInit.add(fin.name);
                }
            }
        }

        System.out.println("Declared static String fields: " + declared.size());
        System.out.println("Written in <clinit>: " + written.size());
        System.out.println("Read in <init>: " + readInInit.size());
        System.out.println("Read anywhere: " + readAll.size());

        // Fields read in <init> but NEVER written in clinit -> null at runtime
        Set<String> neverWritten = new TreeSet<>(readInInit);
        neverWritten.removeAll(written);
        System.out.println("\n=== READ IN <init> BUT NEVER WRITTEN (-> null at runtime): " + neverWritten.size() + " ===");
        for (String s : neverWritten) {
            System.out.println("  field=" + escape(s) + "  declared=" + declared.contains(s));
        }

        // Fields written in clinit but never read
        Set<String> neverRead = new TreeSet<>(written);
        neverRead.removeAll(readAll);
        System.out.println("\n=== WRITTEN IN <clinit> BUT NEVER READ: " + neverRead.size() + " ===");
        for (String s : neverRead) {
            System.out.println("  field=" + escape(s));
        }

        // Declared but neither written nor read
        Set<String> orphan = new TreeSet<>(declared);
        orphan.removeAll(written);
        orphan.removeAll(readAll);
        System.out.println("\n=== DECLARED BUT UNUSED: " + orphan.size() + " ===");
        for (String s : orphan) System.out.println("  field=" + escape(s));

        // Detailed: for each read-in-init field, show exact codepoints
        System.out.println("\n=== CODEPOINT DETAIL (read in init vs written in clinit) ===");
        for (String s : readInInit) {
            boolean w = written.contains(s);
            System.out.println("  read: " + escape(s) + "  written=" + w + "  cps=" + cps(s));
        }
    }

    static String escape(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 0x20 && c < 0x7f) sb.append(c);
            else sb.append(String.format("\\u%04x", (int)c));
        }
        return sb.toString();
    }

    static String cps(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i > 0) sb.append(',');
            sb.append(String.format("U+%04X", (int)s.charAt(i)));
        }
        return sb.toString();
    }
}
