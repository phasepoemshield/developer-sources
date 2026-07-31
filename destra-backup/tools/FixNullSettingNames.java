import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

// Fix null setting-name fields across all modules.
//
// Root cause: the decompiler/recovery mangled obfuscated Cyrillic field names differently in
// <clinit> (PUTSTATIC) vs <init> (GETSTATIC). Homoglyphs like И(U+0418) vs Й(U+0419), х(U+0445)
// vs с(U+0441) look identical when rendered but are different codepoints. The clinit writes to
// field "хФ" but the constructor reads "сФ" -> null at runtime -> SettingSanitizer.safeName
// falls back to "Boolean"/"Number"/"SettingGroup" -> every setting shows "boolean".
//
// Fix strategy per null-read field:
//  1. Find the clinit-written field with the most similar name (smallest codepoint edit distance,
//     same length preferred). Homoglyph swaps differ by 1-2 codepoints. Use its mojibake value.
//  2. If no similar clinit field (readable-named constants like AUTO_SEARCH_SETTING_NAME that the
//     decompiler simply forgot to initialize), derive a human-readable label from the field name.
//  3. Replace the constructor's GETSTATIC with LDC of the resolved value.
//
// This makes every setting have a unique non-null name so modules FUNCTION (toggle, render, etc.)
// even when the label is mojibake garbage (obfuscated case) or a derived English label (readable case).
public final class FixNullSettingNames {
    // Per-module override: real Cyrillic labels for obfuscated null fields, keyed by
    // "ClassName.fieldName" (fieldName as \\uXXXX escapes). Used when we know the real label.
    static final Map<String, String> OVERRIDES = new HashMap<>();

    public static void main(String[] args) throws Exception {
        String root = args.length > 0 ? args[0] : ".precompiled/ru/destra/module";
        int totalPatched = 0, totalModules = 0;
        List<Path> classes = new ArrayList<>();
        Files.walk(Path.of(root)).filter(p -> p.toString().endsWith(".class")).sorted().forEach(classes::add);
        for (Path p : classes) {
            int n = patchClass(p);
            if (n > 0) {
                totalModules++;
                totalPatched += n;
                // also update build/classes copy
                Path bc = Path.of("build/classes/java/main/" + p.toString().replace('\\','/').substring(".precompiled/".length()));
                if (Files.exists(bc)) Files.write(bc, Files.readAllBytes(p));
            }
        }
        System.out.println("FixNullSettingNames: patched " + totalPatched + " null fields across " + totalModules + " modules");
    }

    static int patchClass(Path classFile) throws Exception {
        byte[] data = Files.readAllBytes(classFile);
        ClassNode cn = new ClassNode();
        new ClassReader(data).accept(cn, 0);
        String className = cn.name.replace('/', '.');

        // Collect clinit writes: fieldName -> ldc String value
        Map<String, String> clinitWrites = new HashMap<>();
        for (MethodNode m : cn.methods) {
            if (!m.name.equals("<clinit>")) continue;
            for (int i = 0; i < m.instructions.size(); i++) {
                AbstractInsnNode n = m.instructions.get(i);
                if (n instanceof LdcInsnNode ldc && ldc.cst instanceof String s) {
                    if (i + 1 < m.instructions.size() && m.instructions.get(i + 1) instanceof FieldInsnNode fin && fin.getOpcode() == Opcodes.PUTSTATIC) {
                        clinitWrites.put(fin.name, s);
                    }
                }
            }
        }
        if (clinitWrites.isEmpty()) return 0;

        int patched = 0;
        for (MethodNode m : cn.methods) {
            if (m.name.equals("<clinit>")) continue; // don't touch clinit writes
            // Iterate; we modify instructions so use index carefully
            for (int i = 0; i < m.instructions.size(); i++) {
                AbstractInsnNode n = m.instructions.get(i);
                if (!(n instanceof FieldInsnNode fin)) continue;
                if (fin.getOpcode() != Opcodes.GETSTATIC || !fin.desc.equals("Ljava/lang/String;")) continue;
                // Is this field written in clinit?
                if (clinitWrites.containsKey(fin.name)) continue;
                // This is a null-read field. Resolve a value.
                String resolved = resolveValue(className, fin.name, clinitWrites);
                if (resolved == null) continue;
                // Replace GETSTATIC with LDC
                m.instructions.insert(fin, new LdcInsnNode(resolved));
                m.instructions.remove(fin);
                patched++;
                System.out.println("  " + className + "." + escape(fin.name) + " [" + m.name + "] -> \"" + abbrev(resolved) + "\"");
            }
        }
        if (patched == 0) return 0;
        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(classFile, out);
        return patched;
    }

    static String resolveValue(String className, String fieldName, Map<String, String> clinitWrites) {
        // Check override first
        String key = className + "." + escape(fieldName);
        if (OVERRIDES.containsKey(key)) return OVERRIDES.get(key);

        // 1. Find most similar clinit-written field name (homoglyph match)
        String bestField = null;
        int bestDist = Integer.MAX_VALUE;
        for (String w : clinitWrites.keySet()) {
            if (w.length() != fieldName.length()) continue;
            int d = codepointDistance(fieldName, w);
            if (d < bestDist) { bestDist = d; bestField = w; }
        }
        // Accept if very similar (1-2 codepoint diff for homoglyph swap, same length)
        if (bestField != null && bestDist <= 4 && bestDist > 0) {
            return clinitWrites.get(bestField);
        }
        // Also try: same first char + same length, slightly larger distance
        if (bestField != null && bestDist <= 6 && fieldName.length() >= 2) {
            return clinitWrites.get(bestField);
        }

        // 2. For MODULE_NAME / HUD_ELEMENT_* / DRAG_ELEMENT_* — use class simple name (better
        //    than deriveFromName which gives "Module"; safeName fallback would use class name
        //    anyway, so this matches the intended behavior without leaving null)
        if (fieldName.equals("MODULE_NAME") || fieldName.equals("MODULE_DESCRIPTION")) {
            String simple = className.substring(className.lastIndexOf('.') + 1);
            return simple;
        }
        if (fieldName.startsWith("HUD_ELEMENT_") || fieldName.startsWith("DRAG_ELEMENT_")) {
            String simple = className.substring(className.lastIndexOf('.') + 1);
            return simple;
        }
        // 3. Derive from field name (readable constants)
        if (isReadable(fieldName)) {
            return deriveFromName(fieldName);
        }
        // 4. Fallback
        return "Setting";
    }

    static int codepointDistance(String a, String b) {
        if (a.length() != b.length()) return Math.abs(a.length() - b.length()) * 100;
        int d = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) d++;
        }
        return d;
    }

    static boolean isReadable(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < 0x20 || c >= 0x7f) return false;
        }
        return true;
    }

    static String deriveFromName(String name) {
        // AUTO_SEARCH_SETTING_NAME -> Auto Search
        String s = name;
        if (s.endsWith("_NAME")) s = s.substring(0, s.length() - 5);
        if (s.endsWith("_LABEL")) s = s.substring(0, s.length() - 6);
        if (s.endsWith("_ID")) s = s.substring(0, s.length() - 3);
        // Remove common prefixes
        s = s.replaceFirst("^SETTING_", "");
        s = s.replaceFirst("^MODE_", "");
        s = s.replaceFirst("^SOUND_MODE_", "Sound ");
        s = s.replaceFirst("^HUD_ELEMENT_", "HUD ");
        s = s.replaceFirst("^MODULE_", "Module ");
        s = s.replaceFirst("^DEFAULT_", "Default ");
        s = s.replaceFirst("^SHADER_STYLE_OPTION_", "Shader Style ");
        s = s.replaceFirst("^HUE_MODE_OPTION_", "Hue ");
        // Split on underscores, title-case
        String[] parts = s.split("_+");
        StringBuilder sb = new StringBuilder();
        for (String p : parts) {
            if (p.isEmpty()) continue;
            if (sb.length() > 0) sb.append(' ');
            sb.append(Character.toUpperCase(p.charAt(0)));
            if (p.length() > 1) sb.append(p.substring(1).toLowerCase());
        }
        String result = sb.toString().trim();
        return result.isEmpty() ? name : result;
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

    static String abbrev(String s) {
        String r = s.length() > 40 ? s.substring(0, 40) + "…" : s;
        return r;
    }
}
