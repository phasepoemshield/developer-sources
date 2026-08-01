import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class VerifyMixins {
    static Map<String, Map<String, String>> classFields = new HashMap<>();
    static Map<String, Map<String, String>> classMethods = new HashMap<>();
    static Map<String, String> classYarnToInterm = new HashMap<>();
    static Map<String, String> methodYarnToIntermGlobal = new HashMap<>();
    static Set<String> badMixins = new TreeSet<>();

    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        parseMappings();

        // Load mixin config - parse JSON properly
        String configPath = "src/main/resources/destra.mixins.json";
        String config = Files.readString(Path.of(configPath), StandardCharsets.UTF_8);
        List<String> mixinNames = new ArrayList<>();
        boolean inClient = false;
        for (String line : config.split("\n")) {
            String trimmed = line.trim();
            if (trimmed.contains("\"client\"")) inClient = true;
            if (inClient && trimmed.startsWith("]")) inClient = false;
            if (inClient && trimmed.startsWith("\"")) {
                String name = trimmed.replaceAll("[\",\\s]", "");
                if (!name.isEmpty() && !name.equals("client")) {
                    mixinNames.add(name);
                }
            }
        }
        System.out.println("Config has " + mixinNames.size() + " mixins");

        Path precompiledDir = Path.of(".precompiled/sg/mx");
        Path sourceDir = Path.of("src/main/java/sg/mx");

        for (String mixinName : mixinNames) {
            Path classFile = precompiledDir.resolve(mixinName + ".class");
            Path sourceFile = sourceDir.resolve(mixinName + ".java");

            if (Files.exists(classFile)) {
                if (!verifyClass(mixinName, classFile)) {
                    badMixins.add(mixinName);
                }
            } else if (Files.exists(sourceFile)) {
                // Source mixins are compiled by Loom with proper refmap, skip verification
            } else {
                System.out.println("  MISSING: " + mixinName + " (not found in precompiled or source)");
                badMixins.add(mixinName);
            }
        }

        System.out.println("\n=== Bad mixins (" + badMixins.size() + ") ===");
        for (String m : badMixins) {
            System.out.println("  " + m);
        }

        // Generate new config without bad mixins
        StringBuilder newConfig = new StringBuilder();
        newConfig.append("{\n");
        newConfig.append("  \"required\": true,\n");
        newConfig.append("  \"minVersion\": \"0.8\",\n");
        newConfig.append("  \"package\": \"sg.mx\",\n");
        newConfig.append("  \"compatibilityLevel\": \"JAVA_21\",\n");
        newConfig.append("  \"client\": [\n");
        boolean first = true;
        for (String name : mixinNames) {
            if (badMixins.contains(name)) continue;
            if (!first) newConfig.append(",\n");
            first = false;
            newConfig.append("    \"").append(name).append("\"");
        }
        newConfig.append("\n  ],\n");
        newConfig.append("  \"injectors\": {\n");
        newConfig.append("    \"defaultRequire\": 0\n");
        newConfig.append("  }\n");
        newConfig.append("}\n");

        Files.writeString(Path.of(configPath), newConfig.toString(), StandardCharsets.UTF_8);
        System.out.println("\nUpdated config: removed " + badMixins.size() + " bad mixins, " + (mixinNames.size() - badMixins.size()) + " remaining");
    }

    static boolean verifyClass(String mixinName, Path classFile) throws IOException {
        byte[] bytes = Files.readAllBytes(classFile);
        ClassReader cr = new ClassReader(bytes);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        String targetClassYarn = null;
        List<AnnotationNode> allAnns = new ArrayList<>();
        if (cn.visibleAnnotations != null) allAnns.addAll(cn.visibleAnnotations);
        if (cn.invisibleAnnotations != null) allAnns.addAll(cn.invisibleAnnotations);

        for (AnnotationNode an : allAnns) {
            if (an.desc.equals("Lorg/spongepowered/asm/mixin/Mixin;")) {
                targetClassYarn = getMixinTarget(an);
            }
        }

        if (targetClassYarn == null) {
            // Mixin with targets= (string-based) - skip verification
            return true;
        }

        // Check @Shadow fields
        if (cn.fields != null) {
            for (FieldNode fn : cn.fields) {
                List<AnnotationNode> fieldAnns = new ArrayList<>();
                if (fn.visibleAnnotations != null) fieldAnns.addAll(fn.visibleAnnotations);
                if (fn.invisibleAnnotations != null) fieldAnns.addAll(fn.invisibleAnnotations);
                for (AnnotationNode an : fieldAnns) {
                    if (an.desc.equals("Lorg/spongepowered/asm/mixin/Shadow;")) {
                        String fieldName = fn.name;
                        if (an.values != null) {
                            for (int i = 0; i < an.values.size(); i += 2) {
                                if (((String)an.values.get(i)).equals("value") && an.values.get(i+1) instanceof String) {
                                    fieldName = (String) an.values.get(i+1);
                                }
                            }
                        }
                        if (!isFieldInClass(targetClassYarn, fieldName)) {
                            System.out.println("  BAD " + mixinName + ": @Shadow field '" + fieldName + "' not in " + targetClassYarn);
                            return false;
                        }
                    }
                    if (an.desc.equals("Lorg/spongepowered/asm/mixin/gen/Accessor;")) {
                        String fieldName = deriveFieldName(fn.name);
                        if (an.values != null) {
                            for (int i = 0; i < an.values.size(); i += 2) {
                                if (((String)an.values.get(i)).equals("value") && an.values.get(i+1) instanceof String) {
                                    fieldName = (String) an.values.get(i+1);
                                }
                            }
                        }
                        if (!isFieldInClass(targetClassYarn, fieldName)) {
                            System.out.println("  BAD " + mixinName + ": @Accessor field '" + fieldName + "' not in " + targetClassYarn);
                            return false;
                        }
                    }
                }
            }
        }

        // Check @Accessor on methods
        if (cn.methods != null) {
            for (MethodNode mn : cn.methods) {
                List<AnnotationNode> methodAnns = new ArrayList<>();
                if (mn.visibleAnnotations != null) methodAnns.addAll(mn.visibleAnnotations);
                if (mn.invisibleAnnotations != null) methodAnns.addAll(mn.invisibleAnnotations);
                for (AnnotationNode an : methodAnns) {
                    if (an.desc.equals("Lorg/spongepowered/asm/mixin/gen/Accessor;")) {
                        String fieldName = deriveFieldName(mn.name);
                        if (an.values != null) {
                            for (int i = 0; i < an.values.size(); i += 2) {
                                if (((String)an.values.get(i)).equals("value") && an.values.get(i+1) instanceof String) {
                                    fieldName = (String) an.values.get(i+1);
                                }
                            }
                        }
                        if (!isFieldInClass(targetClassYarn, fieldName)) {
                            System.out.println("  BAD " + mixinName + ": @Accessor(method) field '" + fieldName + "' not in " + targetClassYarn);
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }

    @SuppressWarnings("unchecked")
    static String getMixinTarget(AnnotationNode an) {
        if (an.values == null) return null;
        for (int i = 0; i < an.values.size(); i += 2) {
            String key = (String) an.values.get(i);
            Object val = an.values.get(i + 1);
            if (key.equals("value")) {
                if (val instanceof List) {
                    for (Object v : (List<Object>) val) {
                        if (v instanceof String) return (String) v;
                        if (v instanceof org.objectweb.asm.Type) return ((org.objectweb.asm.Type) v).getInternalName();
                    }
                } else if (val instanceof String) {
                    return (String) val;
                } else if (val instanceof org.objectweb.asm.Type) {
                    return ((org.objectweb.asm.Type) val).getInternalName();
                }
            }
        }
        return null;
    }

    static String deriveFieldName(String methodName) {
        if (methodName.startsWith("get") || methodName.startsWith("set")) {
            return Character.toLowerCase(methodName.charAt(3)) + methodName.substring(4);
        } else if (methodName.startsWith("is")) {
            return Character.toLowerCase(methodName.charAt(2)) + methodName.substring(3);
        }
        return methodName;
    }

    static boolean isFieldInClass(String yarnClass, String fieldName) {
        Map<String, String> fields = classFields.get(yarnClass);
        if (fields != null && fields.containsKey(fieldName)) return true;
        return false;
    }

    static boolean isMethodInClass(String yarnClass, String methodName) {
        Map<String, String> methods = classMethods.get(yarnClass);
        if (methods != null && methods.containsKey(methodName)) return true;
        return false;
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
            String currentClassYarn = null;
            while ((line = br.readLine()) != null) {
                if (line.isEmpty()) continue;
                char type = line.charAt(0);
                String[] parts = line.split("\t");
                if (type == 'c') {
                    if (parts.length >= 3) {
                        String intermName = parts[1];
                        String yarnName = parts[2];
                        classYarnToInterm.put(yarnName, intermName);
                        currentClassYarn = yarnName;
                        classFields.computeIfAbsent(yarnName, k -> new HashMap<>());
                        classMethods.computeIfAbsent(yarnName, k -> new HashMap<>());
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
                            if (currentClassYarn != null) {
                                classMethods.get(currentClassYarn).put(yarn, interm);
                            }
                            methodYarnToIntermGlobal.putIfAbsent(yarn, interm);
                        } else {
                            if (currentClassYarn != null) {
                                classFields.get(currentClassYarn).put(yarn, interm);
                            }
                        }
                    }
                }
            }
        } finally {
            if (zf != null) zf.close();
        }
        System.out.println("Loaded: classes=" + classYarnToInterm.size() + " fields=" + classFields.size() + " methods=" + classMethods.size());
    }
}
