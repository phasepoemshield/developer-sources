import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;

// Read raw UTF-8 bytes of each ldc/putstatic String from <clinit> and try conversion chains
// to recover original Russian text.
public class RecoverStrings {
    public static void main(String[] args) throws Exception {
        byte[] b = Files.readAllBytes(Path.of(args[0]));
        ClassNode cn = new ClassNode();
        new ClassReader(b).accept(cn, 0);

        String[] chains = {"UTF-8", "windows-1251", "ISO-8859-1", "windows-1252", "KOI8-R", "IBM866", "x-MacCyrillic"};
        Map<String,String> results = new LinkedHashMap<>();

        for (MethodNode m : cn.methods) {
            if (!m.name.equals("<clinit>")) continue;
            for (int i = 0; i < m.instructions.size(); i++) {
                AbstractInsnNode n = m.instructions.get(i);
                if (!(n instanceof LdcInsnNode ldc) || !(ldc.cst instanceof String s)) continue;
                // Skip non-text strings
                if (s.isEmpty() || s.matches("[\\x00-\\x7F]+")) continue;
                // s is the Java String; its UTF-8 bytes are what's in the class file
                byte[] utf8Bytes = s.getBytes(StandardCharsets.UTF_8);
                // Try: interpret utf8Bytes as charset X, then re-encode... no.
                // The mojibake happened because original bytes were decoded with wrong charset.
                // To recover: s.getBytes(wrongCharset) -> originalBytes -> new String(originalBytes, correctCharset)
                // Try all pairs:
                String best = null;
                for (String wrong : chains) {
                    byte[] origBytes;
                    try { origBytes = s.getBytes(wrong); } catch (Exception e) { continue; }
                    for (String correct : chains) {
                        if (wrong.equals(correct)) continue;
                        try {
                            String rec = new String(origBytes, correct);
                            if (isReadableCyrillic(rec) && rec.length() <= s.length()+2) {
                                if (best == null) best = wrong + "->" + correct + ": " + rec;
                                else if (!best.contains(rec)) best += "  |  " + wrong + "->" + correct + ": " + rec;
                            }
                        } catch (Exception e) {}
                    }
                }
                if (best != null) {
                    results.put(s, best);
                } else {
                    results.put(s, "(no recovery) raw_cps=" + cps(s));
                }
            }
        }

        StringBuilder out = new StringBuilder();
        for (var e : results.entrySet()) {
            out.append("MOJI: ").append(e.getKey()).append("\n");
            out.append("  -> ").append(e.getValue()).append("\n");
        }
        Files.writeString(Path.of(args.length > 1 ? args[1] : "temp_check/recover.txt"), out.toString(), StandardCharsets.UTF_8);
        System.out.println("Written " + results.size() + " entries");
    }

    static boolean isReadableCyrillic(String s) {
        if (s.isEmpty()) return false;
        int cyr = 0, ascii = 0, bad = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 0x0400 && c <= 0x04FF) cyr++;
            else if (c >= 0x0020 && c <= 0x007E) ascii++;
            else if (c == '\u00a0' || c == '\u00ab' || c == '\u00bb' || c == '\u2010' || c == '\u2013' || c == '\u2014' || c == '\u2018' || c == '\u2019' || c == '\u201c' || c == '\u201d' || c == '\u2026' || c == '\u00a4') ascii++;
            else bad++;
        }
        return bad == 0 && (cyr > 0 || ascii > 0) && cyr * 100 / Math.max(1,s.length()) >= 30;
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
