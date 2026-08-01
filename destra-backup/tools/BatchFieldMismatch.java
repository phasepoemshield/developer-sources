import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

// Batch-run FieldNameMismatch logic across all module classes.
// Reports modules with fields READ in <init> but NEVER WRITTEN in <clinit> (-> null at runtime).
public class BatchFieldMismatch {
    public static void main(String[] args) throws Exception {
        String root = args.length > 0 ? args[0] : ".precompiled/ru/destra/module";
        int totalModules = 0, affectedModules = 0, totalNullFields = 0;
        List<String> report = new ArrayList<>();
        Files.walk(Path.of(root)).filter(p -> p.toString().endsWith(".class")).sorted().forEach(p -> {
            try {
                String res = analyze(p);
                if (res != null) report.add(res);
            } catch (Exception e) { report.add("ERR " + p + ": " + e.getMessage()); }
        });
        StringBuilder out = new StringBuilder();
        for (String r : report) {
            out.append(r).append("\n");
            if (r.startsWith("MODULE")) { affectedModules++; }
        }
        Files.writeString(Path.of("temp_check/field_mismatch_report.txt"), out.toString(), java.nio.charset.StandardCharsets.UTF_8);
        System.out.println("Report written. Affected modules: " + affectedModules);
    }

    static String analyze(Path p) throws Exception {
        ClassNode cn = new ClassNode();
        new ClassReader(Files.readAllBytes(p)).accept(cn, 0);
        // Only module classes (extend Module/HudModule)
        if (!isModule(cn)) return null;

        Set<String> written = new TreeSet<>();
        Set<String> readInInit = new TreeSet<>();
        for (MethodNode m : cn.methods) {
            for (int i = 0; i < m.instructions.size(); i++) {
                AbstractInsnNode n = m.instructions.get(i);
                if (!(n instanceof FieldInsnNode fin)) continue;
                if (!fin.desc.equals("Ljava/lang/String;")) continue;
                if (fin.getOpcode() == Opcodes.PUTSTATIC && m.name.equals("<clinit>")) written.add(fin.name);
                if (fin.getOpcode() == Opcodes.GETSTATIC && m.name.equals("<init>")) readInInit.add(fin.name);
            }
        }
        Set<String> neverWritten = new TreeSet<>(readInInit);
        neverWritten.removeAll(written);
        if (neverWritten.isEmpty()) return null;
        StringBuilder sb = new StringBuilder();
        sb.append("MODULE ").append(cn.name.replace('/','.')).append("  null-fields=").append(neverWritten.size())
          .append("  read=").append(readInInit.size()).append(" written=").append(written.size()).append("\n");
        for (String s : neverWritten) sb.append("  ").append(escape(s)).append("\n");
        return sb.toString();
    }

    static java.util.Map<String, ClassNode> cache = new HashMap<>();
    static boolean isModule(ClassNode cn) {
        String s = cn.superName;
        while (s != null) {
            if (s.equals("ru/destra/core/Module") || s.equals("ru/destra/module/HudModule")) return true;
            if (s.equals("java/lang/Object")) return false;
            // don't have full class tree here; just check common supers
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
