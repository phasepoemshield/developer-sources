import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;
import java.util.regex.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class PatchMixinAnnotationsToIntermediary {
    static Map<String, String> classYarnToInterm = new HashMap<>();
    static Map<String, String> methodYarnToInterm = new HashMap<>();
    static Map<String, String> fieldYarnToInterm = new HashMap<>();

    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        parseMappings();
        System.out.println("Maps: classes=" + classYarnToInterm.size() + " methods=" + methodYarnToInterm.size() + " fields=" + fieldYarnToInterm.size());

        Path dir = Path.of(".precompiled/sg/mx");
        int patched = 0;
        try (var stream = Files.list(dir)) {
            var files = stream.filter(p -> p.toString().endsWith(".class") && !p.toString().contains("$")).sorted().toList();
            System.out.println("Found " + files.size() + " classes");

            for (Path file : files) {
                byte[] bytes = Files.readAllBytes(file);
                ClassReader cr = new ClassReader(bytes);
                ClassNode cn = new ClassNode();
                cr.accept(cn, 0);

                boolean changed = false;
                String targetClassInterm = null;

                if (cn.visibleAnnotations != null) {
                    for (AnnotationNode an : cn.visibleAnnotations) {
                        if (an.desc.equals("Lorg/spongepowered/asm/mixin/Mixin;")) {
                            targetClassInterm = patchMixinAnnotation(an);
                            changed = true;
                        }
                    }
                }

                if (cn.fields != null) {
                    for (FieldNode fn : cn.fields) {
                        if (fn.visibleAnnotations != null) {
                            for (AnnotationNode an : fn.visibleAnnotations) {
                                if (an.desc.equals("Lorg/spongepowered/asm/mixin/Shadow;") ||
                                    an.desc.equals("Lorg/spongepowered/asm/mixin/gen/Accessor;")) {
                                    changed |= patchShadowAccessor(an, fn, targetClassInterm);
                                }
                            }
                        }
                    }
                }

                if (cn.methods != null) {
                    for (MethodNode mn : cn.methods) {
                        if (mn.visibleAnnotations != null) {
                            for (AnnotationNode an : mn.visibleAnnotations) {
                                changed |= patchInjectOrModify(an, targetClassInterm);
                            }
                        }
                    }
                }

                if (changed) {
                    ClassWriter cw = new ClassWriter(0);
                    cn.accept(cw);
                    Files.write(file, cw.toByteArray());
                    patched++;
                    System.out.println("  Patched: " + file.getFileName());
                }
            }
        }
        System.out.println("Done: " + patched + " classes patched");
    }

    @SuppressWarnings("unchecked")
    static String patchMixinAnnotation(AnnotationNode an) {
        if (an.values == null) return null;
        String targetClass = null;
        for (int i = 0; i < an.values.size(); i += 2) {
            String key = (String) an.values.get(i);
            Object val = an.values.get(i + 1);
            if (key.equals("value")) {
                if (val instanceof List) {
                    List<String> list = (List<String>) val;
                    for (int j = 0; j < list.size(); j++) {
                        String interm = remapClass(list.get(j));
                        if (interm != null) { list.set(j, interm); targetClass = interm; }
                    }
                } else if (val instanceof String) {
                    String interm = remapClass((String) val);
                    if (interm != null) { an.values.set(i + 1, interm); targetClass = interm; }
                }
            } else if (key.equals("targets")) {
                if (val instanceof List) {
                    List<String> list = (List<String>) val;
                    for (int j = 0; j < list.size(); j++) {
                        String interm = remapClass(list.get(j));
                        if (interm != null) list.set(j, interm);
                    }
                }
            }
        }
        return targetClass;
    }

    @SuppressWarnings("unchecked")
    static boolean patchShadowAccessor(AnnotationNode an, FieldNode fn, String targetClass) {
        boolean changed = false;
        if (an.values != null) {
            for (int i = 0; i < an.values.size(); i += 2) {
                String key = (String) an.values.get(i);
                if (key.equals("value")) {
                    Object val = an.values.get(i + 1);
                    if (val instanceof String) {
                        String yarnName = (String) val;
                        String interm = fieldYarnToInterm.get(yarnName);
                        if (interm != null) { an.values.set(i + 1, interm); changed = true; }
                    }
                }
            }
        }
        // Also patch the field name itself if it's a Yarn name
        String interm = fieldYarnToInterm.get(fn.name);
        if (interm != null) { fn.name = interm; changed = true; }
        return changed;
    }

    @SuppressWarnings("unchecked")
    static boolean patchInjectOrModify(AnnotationNode an, String targetClass) {
        boolean changed = false;
        if (an.values == null) return false;
        for (int i = 0; i < an.values.size(); i += 2) {
            String key = (String) an.values.get(i);
            Object val = an.values.get(i + 1);
            if (key.equals("method")) {
                if (val instanceof List) {
                    List<String> list = (List<String>) val;
                    for (int j = 0; j < list.size(); j++) {
                        String patched = remapMethodRef(list.get(j));
                        if (patched != null) { list.set(j, patched); changed = true; }
                    }
                } else if (val instanceof String) {
                    String patched = remapMethodRef((String) val);
                    if (patched != null) { an.values.set(i + 1, patched); changed = true; }
                }
            } else if (key.equals("target")) {
                if (val instanceof String) {
                    String patched = remapTargetString((String) val);
                    if (patched != null) { an.values.set(i + 1, patched); changed = true; }
                }
            }
        }
        return changed;
    }

    static String remapClass(String yarn) {
        String cleaned = yarn.replace('.', '/');
        if (cleaned.startsWith("L") && cleaned.endsWith(";")) cleaned = cleaned.substring(1, cleaned.length() - 1);
        return classYarnToInterm.get(cleaned);
    }

    static String remapMethodRef(String methodRef) {
        if (methodRef.equals("*")) return null;
        String methodName = methodRef;
        String desc = null;
        int parenIdx = methodRef.indexOf('(');
        if (parenIdx >= 0) {
            methodName = methodRef.substring(0, parenIdx);
            desc = methodRef.substring(parenIdx);
        }
        String interm = methodYarnToInterm.get(methodName);
        if (interm != null) {
            return desc != null ? interm + desc : interm;
        }
        return null;
    }

    static String remapTargetString(String target) {
        String result = target;
        boolean changed = false;
        // Remap classes
        for (var e : classYarnToInterm.entrySet()) {
            if (result.contains(e.getKey())) {
                result = result.replace(e.getKey(), e.getValue());
                changed = true;
            }
        }
        // Remap methods (be careful not to replace substrings incorrectly)
        for (var e : methodYarnToInterm.entrySet()) {
            String yarnMethod = e.getKey();
            // Only replace if it looks like a method name boundary
            String pattern = yarnMethod + "(";
            if (result.contains(pattern)) {
                result = result.replace(pattern, e.getValue() + "(");
                changed = true;
            }
        }
        return changed ? result : null;
    }

    static void parseMappings() throws IOException {
        InputStream stream = null;
        java.util.zip.ZipFile zf = null;
        Path localTiny = Path.of("mappings/mappings.tiny");
        if (Files.exists(localTiny)) {
            stream = Files.newInputStream(localTiny);
        } else {
            String userHome = System.getProperty("user.home");
            Path yarnDir = Path.of(userHome, ".gradle/caches/modules-2/files-2.1/net.fabricmc/yarn");
            Path foundJar = null;
            if (Files.exists(yarnDir)) {
                try (var s = Files.walk(yarnDir)) {
                    foundJar = s.filter(p -> p.getFileName().toString().endsWith(".jar")).findFirst().orElse(null);
                }
            }
            if (foundJar != null) {
                zf = new java.util.zip.ZipFile(foundJar.toFile());
                java.util.zip.ZipEntry entry = zf.getEntry("mappings/mappings.tiny");
                if (entry != null) stream = zf.getInputStream(entry);
            }
        }
        if (stream == null) throw new FileNotFoundException("mappings/mappings.tiny not found");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.isEmpty()) continue;
                char type = line.charAt(0);
                String[] parts = line.split("\t");
                if (type == 'c') {
                    if (parts.length >= 3) {
                        classYarnToInterm.put(parts[2], parts[1]);
                    }
                } else if (type == '\t') {
                    int mIdx = -1;
                    for (int i = 0; i < parts.length; i++) {
                        if (parts[i].equals("m") || parts[i].equals("f")) { mIdx = i; break; }
                    }
                    if (mIdx >= 0 && parts.length >= mIdx + 4) {
                        String memberType = parts[mIdx];
                        String interm = parts[mIdx + 2];
                        String yarn = parts[mIdx + 3];
                        if (memberType.equals("m")) {
                            methodYarnToInterm.put(yarn, interm);
                        } else {
                            fieldYarnToInterm.put(yarn, interm);
                        }
                    }
                }
            }
        } finally {
            if (zf != null) zf.close();
        }
    }
}
