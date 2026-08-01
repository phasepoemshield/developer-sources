import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

// Comprehensive check: scan ALL methods (not just <init>) for GETSTATIC of static String fields
// that are NEVER written in <clinit>. These would be null at runtime.
public class CheckAllNullReads {
    public static void main(String[] args) throws Exception {
        String root = args.length > 0 ? args[0] : ".precompiled/ru/destra/module";
        int affected = 0;
        List<String> report = new ArrayList<>();
        Files.walk(Path.of(root)).filter(p -> p.toString().endsWith(".class")).sorted().forEach(p -> {
            try {
                String r = analyze(p);
                if (r != null) report.add(r);
            } catch (Exception e) { report.add("ERR " + p + ": " + e.getMessage()); }
        });
        for (String r : report) { System.out.println(r); if (r.startsWith("MODULE")) affected++; }
        System.out.println("\n=== Affected modules: " + affected + " ===");
    }

    static String analyze(Path p) throws Exception {
        ClassNode cn = new ClassNode();
        new ClassReader(Files.readAllBytes(p)).accept(cn, 0);
        if (!isModule(cn)) return null;
        Set<String> written = new TreeSet<>();
        Set<String> readAll = new TreeSet<>();
        for (MethodNode m : cn.methods) {
            for (int i = 0; i < m.instructions.size(); i++) {
                AbstractInsnNode n = m.instructions.get(i);
                if (!(n instanceof FieldInsnNode fin)) continue;
                if (!fin.desc.equals("Ljava/lang/String;")) continue;
                if (fin.getOpcode() == Opcodes.PUTSTATIC && m.name.equals("<clinit>")) written.add(fin.name);
                if (fin.getOpcode() == Opcodes.GETSTATIC) readAll.add(fin.name + "@" + m.name);
            }
        }
        // Find read fields never written
        Set<String> neverWritten = new TreeSet<>();
        for (String r : readAll) {
            String field = r.substring(0, r.indexOf('@'));
            if (!written.contains(field)) neverWritten.add(r);
        }
        if (neverWritten.isEmpty()) return null;
        StringBuilder sb = new StringBuilder();
        sb.append("MODULE ").append(cn.name.replace('/','.')).append("  null-reads=").append(neverWritten.size()).append("\n");
        for (String s : neverWritten) sb.append("  ").append(escape(s)).append("\n");
        return sb.toString();
    }

    static boolean isModule(ClassNode cn) {
        String s = cn.superName;
        while (s != null) {
            if (s.equals("ru/destra/core/Module") || s.equals("ru/destra/module/HudModule")) return true;
            if (s.equals("java/lang/Object")) return false;
            s = null;
        }
        return false;
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
}
