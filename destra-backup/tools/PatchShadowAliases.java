import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public final class PatchShadowAliases {
    static Map<String, Map<String, String>> refmapMappings;

    public static void main(String[] args) throws Exception {
        Path refmapPath = Path.of("build/refmap-merged.json");
        if (!Files.exists(refmapPath)) { System.out.println("refmap not found, skipping"); return; }
        loadRefmap(refmapPath);

        Path dir = Path.of(".precompiled/sg/mx");
        if (!Files.exists(dir)) { System.out.println("no sg/mx dir"); return; }
        List<Path> classes = new ArrayList<>();
        try (var s = Files.list(dir)) { s.filter(p -> p.toString().endsWith(".class")).forEach(classes::add); }
        Collections.sort(classes);

        int patchedFields = 0, patchedClasses = 0;
        for (Path p : classes) {
            byte[] data = Files.readAllBytes(p);
            ClassReader cr = new ClassReader(data);
            ClassNode cn = new ClassNode();
            cr.accept(cn, 0);
            String mixinKey = cn.name.replace('/', '.');
            // refmap uses slashed name
            Map<String, String> classMap = refmapMappings.get(cn.name);
            if (classMap == null) continue;

            boolean changed = false;
            for (FieldNode f : cn.fields) {
                if (f.visibleAnnotations == null) continue;
                AnnotationNode shadow = null;
                for (var a : f.visibleAnnotations) {
                    if ("Lorg/spongepowered/asm/mixin/Shadow;".equals(a.desc)) { shadow = a; break; }
                }
                if (shadow == null) continue;

                String mapped = classMap.get(f.name);
                if (mapped == null || mapped.equals(f.name)) continue;
                if (mapped.startsWith("field_") == false) continue;

                Set<String> existingAliases = new HashSet<>();
                Set<String> existingValues = new HashSet<>();
                if (shadow.values != null) {
                    for (int i = 0; i < shadow.values.size(); i += 2) {
                        if ("aliases".equals(shadow.values.get(i))) {
                            Object v = shadow.values.get(i + 1);
                            if (v instanceof List) { for (var o : (List<?>) v) { existingAliases.add(String.valueOf(o)); existingValues.add(String.valueOf(o)); } }
                        }
                    }
                }
                if (existingAliases.contains(mapped)) continue;

                if (shadow.values == null) shadow.values = new ArrayList<>();
                shadow.values.add("aliases");
                List<String> aliases = new ArrayList<>(existingAliases);
                aliases.add(mapped);
                shadow.values.add(aliases);

                changed = true;
                patchedFields++;
                System.out.println("  " + p.getFileName() + " :: @Shadow " + f.name + " + aliases={" + String.join(",", aliases) + "}");
            }

            if (changed) {
                ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES) {
                    @Override protected String getCommonSuperClass(String a, String b) { return "java/lang/Object"; }
                };
                cn.accept(cw);
                byte[] out = cw.toByteArray();
                Files.write(p, out);
                Path bc = Path.of("build/classes/java/main/sg/mx/" + p.getFileName());
                if (Files.exists(bc)) Files.write(bc, out);
                patchedClasses++;
            }
        }
        System.out.println("Patched " + patchedFields + " @Shadow fields in " + patchedClasses + " mixin classes");
    }

    @SuppressWarnings("unchecked")
    static void loadRefmap(Path p) throws Exception {
        String json = Files.readString(p, StandardCharsets.UTF_8);
        // Minimal JSON parse: extract "mappings" object then each class object
        refmapMappings = new HashMap<>();
        int mIdx = json.indexOf("\"mappings\"");
        if (mIdx < 0) { System.out.println("no mappings key in refmap"); return; }
        int objStart = json.indexOf('{', mIdx);
        int objEnd = matchingBrace(json, objStart);
        String mappingsObj = json.substring(objStart + 1, objEnd);
        // iterate class entries
        int i = 0;
        while (i < mappingsObj.length()) {
            int q1 = mappingsObj.indexOf('"', i);
            if (q1 < 0) break;
            int q2 = mappingsObj.indexOf('"', q1 + 1);
            String className = mappingsObj.substring(q1 + 1, q2);
            int cBrace = mappingsObj.indexOf('{', q2);
            int cEnd = matchingBrace(mappingsObj, cBrace);
            String classBody = mappingsObj.substring(cBrace + 1, cEnd);
            Map<String, String> classMap = new HashMap<>();
            int j = 0;
            while (j < classBody.length()) {
                int kq1 = classBody.indexOf('"', j);
                if (kq1 < 0) break;
                int kq2 = classBody.indexOf('"', kq1 + 1);
                String key = classBody.substring(kq1 + 1, kq2);
                int vq1 = classBody.indexOf('"', kq2 + 1);
                int vq2 = classBody.indexOf('"', vq1 + 1);
                String val = classBody.substring(vq1 + 1, vq2);
                classMap.put(key, val);
                j = vq2 + 1;
            }
            refmapMappings.put(className, classMap);
            i = cEnd + 1;
        }
        System.out.println("Loaded refmap with " + refmapMappings.size() + " class entries");
    }

    static int matchingBrace(String s, int open) {
        int depth = 0;
        for (int k = open; k < s.length(); k++) {
            char c = s.charAt(k);
            if (c == '{') depth++;
            else if (c == '}') { depth--; if (depth == 0) return k; }
        }
        return s.length() - 1;
    }
}
