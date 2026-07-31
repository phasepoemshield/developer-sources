import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;
import java.util.regex.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class GenerateRefmap {
    // class-scoped: yarnClassInternal -> (yarnMemberName -> intermMemberName)
    static Map<String, Map<String, String>> classFields = new HashMap<>();
    static Map<String, Map<String, String>> classMethods = new HashMap<>();
    // same but keyed by intermediary class name for super-class lookups
    static Map<String, Map<String, String>> classMethodsInterm = new HashMap<>();
    static Map<String, Map<String, String>> classMethodDescsInterm = new HashMap<>();
    // global class map: yarnClassInternal -> intermClassInternal
    static Map<String, String> classYarnToInterm = new HashMap<>();
    // global method name map (fallback, may have collisions)
    static Map<String, String> methodYarnToIntermGlobal = new HashMap<>();
    // descriptor-aware method map: yarnClass -> (yarnMethod+desc -> intermMethod)
    static Map<String, Map<String, String>> classMethodDescs = new HashMap<>();
    // superclass chain read from the Minecraft jar (intermName -> superIntermName)
    static Map<String, String> superClassMap = new HashMap<>();

    static Map<String, TreeMap<String, String>> mixinMaps = new TreeMap<>();

    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        parseMappings();
        loadSuperClasses();
        System.out.println("Maps: classes=" + classYarnToInterm.size() + " classFields=" + classFields.size() + " classMethods=" + classMethods.size() + " superClasses=" + superClassMap.size());

        Path precompiledDir = Path.of(".precompiled/sg/mx");
        try (var stream = Files.list(precompiledDir)) {
            var classes = stream.filter(p -> p.toString().endsWith(".class") && !p.toString().contains("$")).sorted().toList();
            System.out.println("Found " + classes.size() + " precompiled mixin classes");

            for (Path classFile : classes) {
                String className = classFile.getFileName().toString().replace(".class", "");
                String mixinInternal = "sg/mx/" + className;

                byte[] bytes = Files.readAllBytes(classFile);
                ClassReader cr = new ClassReader(bytes);
                ClassNode cn = new ClassNode();
                cr.accept(cn, 0);

                if (className.equals("MinecraftClientMixin") || className.equals("EntityMixin")) {
                    System.out.println("  DEBUG: Processing " + className + ", visibleAnnotations=" + (cn.visibleAnnotations != null ? cn.visibleAnnotations.size() : "null"));
                }

                TreeMap<String, String> map = new TreeMap<>();
                String targetClassYarn = null;
                String targetClassInterm = null;

                // Check both visible and invisible annotations
                List<AnnotationNode> allAnnotations = new ArrayList<>();
                if (cn.visibleAnnotations != null) allAnnotations.addAll(cn.visibleAnnotations);
                if (cn.invisibleAnnotations != null) allAnnotations.addAll(cn.invisibleAnnotations);

                for (AnnotationNode an : allAnnotations) {
                    if (an.desc.equals("Lorg/spongepowered/asm/mixin/Mixin;")) {
                        String[] result = processMixinAnnotation(an, map);
                        targetClassYarn = result[0];
                        targetClassInterm = result[1];
                        if (className.equals("MinecraftClientMixin") || className.equals("EntityMixin")) {
                            System.out.println("  DEBUG " + className + ": targetYarn=" + targetClassYarn + " targetInterm=" + targetClassInterm);
                        }
                    }
                }

                if (cn.fields != null) {
                    for (FieldNode fn : cn.fields) {
                        List<AnnotationNode> fieldAnns = new ArrayList<>();
                        if (fn.visibleAnnotations != null) fieldAnns.addAll(fn.visibleAnnotations);
                        if (fn.invisibleAnnotations != null) fieldAnns.addAll(fn.invisibleAnnotations);
                        for (AnnotationNode an : fieldAnns) {
                            if (an.desc.equals("Lorg/spongepowered/asm/mixin/Shadow;") ||
                                an.desc.equals("Lorg/spongepowered/asm/mixin/gen/Accessor;")) {
                                processShadowOrAccessor(fn, an, map, targetClassYarn, targetClassInterm);
                            }
                        }
                    }
                }

                if (cn.methods != null) {
                    for (MethodNode mn : cn.methods) {
                        List<AnnotationNode> methodAnns = new ArrayList<>();
                        if (mn.visibleAnnotations != null) methodAnns.addAll(mn.visibleAnnotations);
                        if (mn.invisibleAnnotations != null) methodAnns.addAll(mn.invisibleAnnotations);
                        for (AnnotationNode an : methodAnns) {
                            if (an.desc.equals("Lorg/spongepowered/asm/mixin/gen/Accessor;")) {
                                processAccessorMethod(mn, an, map, targetClassYarn, targetClassInterm);
                            }
                            processMethodAnnotation(an, map, targetClassYarn, targetClassInterm);
                        }
                    }
                }

                if (!map.isEmpty()) {
                    mixinMaps.put(mixinInternal, map);
                }
            }
        }

        Path existingRefmap = Path.of("build/classes/java/main/destra-recovered-refmap.json");
        if (Files.exists(existingRefmap)) {
            System.out.println("Merging with existing refmap: " + existingRefmap);
            mergeExistingRefmap(existingRefmap);
        }

        writeRefmap(Path.of("build/classes/java/main/destra-recovered-refmap.json"));
        System.out.println("Generated refmap with " + mixinMaps.size() + " mixins");
    }

    @SuppressWarnings("unchecked")
    static String[] processMixinAnnotation(AnnotationNode an, TreeMap<String, String> map) {
        if (an.values == null) return new String[]{null, null};
        String targetYarn = null;
        String targetInterm = null;
        for (int i = 0; i < an.values.size(); i += 2) {
            String key = (String) an.values.get(i);
            Object val = an.values.get(i + 1);
            if (key.equals("value")) {
                if (val instanceof List) {
                    for (Object v : (List<Object>) val) {
                        String yarnClass = typeToString(v);
                        if (yarnClass != null) {
                            String interm = remapClass(yarnClass);
                            if (interm != null) { map.put(yarnClass, interm); targetYarn = yarnClass; targetInterm = interm; }
                        }
                    }
                } else {
                    String yarnClass = typeToString(val);
                    if (yarnClass != null) {
                        String interm = remapClass(yarnClass);
                        if (interm != null) { map.put(yarnClass, interm); targetYarn = yarnClass; targetInterm = interm; }
                    }
                }
            } else if (key.equals("targets")) {
                if (val instanceof List) {
                    for (String v : (List<String>) val) {
                        String interm = remapClass(v);
                        if (interm != null) map.put(v, interm);
                    }
                }
            }
        }
        return new String[]{targetYarn, targetInterm};
    }

    static String typeToString(Object val) {
        if (val instanceof String) return (String) val;
        if (val instanceof org.objectweb.asm.Type) {
            return ((org.objectweb.asm.Type) val).getInternalName();
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    static void processAccessorMethod(MethodNode mn, AnnotationNode an, TreeMap<String, String> map, String targetYarn, String targetInterm) {
        String yarnFieldName = null;
        if (an.values != null) {
            for (int i = 0; i < an.values.size(); i += 2) {
                String key = (String) an.values.get(i);
                if (key.equals("value")) {
                    Object val = an.values.get(i + 1);
                    if (val instanceof String) {
                        yarnFieldName = (String) val;
                    }
                }
            }
        }
        if (yarnFieldName == null) {
            // Derive from method name: getFoo -> foo, setFoo -> foo, isFoo -> foo
            String methodName = mn.name;
            if (methodName.startsWith("get") || methodName.startsWith("set")) {
                yarnFieldName = Character.toLowerCase(methodName.charAt(3)) + methodName.substring(4);
            } else if (methodName.startsWith("is")) {
                yarnFieldName = Character.toLowerCase(methodName.charAt(2)) + methodName.substring(3);
            } else {
                yarnFieldName = methodName;
            }
        }
        String interm = lookupField(targetYarn, yarnFieldName);
        if (interm != null) {
            map.put(yarnFieldName, interm);
        }
    }

    @SuppressWarnings("unchecked")
    static void processShadowOrAccessor(FieldNode fn, AnnotationNode an, TreeMap<String, String> map, String targetYarn, String targetInterm) {
        String yarnFieldName = fn.name;
        if (an.values != null) {
            for (int i = 0; i < an.values.size(); i += 2) {
                String key = (String) an.values.get(i);
                if (key.equals("value")) {
                    Object val = an.values.get(i + 1);
                    if (val instanceof String) {
                        yarnFieldName = (String) val;
                    }
                }
            }
        }

        String interm = lookupField(targetYarn, yarnFieldName);
        if (interm != null) {
            map.put(yarnFieldName, interm);
            if (!fn.name.equals(yarnFieldName)) {
                map.put(fn.name, interm);
            }
        } else {
            // Debug: print when field lookup fails
            if (targetYarn != null && yarnFieldName.matches("[a-z].*")) {
                System.out.println("  DEBUG: field '" + yarnFieldName + "' not found in classFields for " + targetYarn + " (fn.name=" + fn.name + ")");
            }
        }
    }

    @SuppressWarnings("unchecked")
    static void processMethodAnnotation(AnnotationNode an, TreeMap<String, String> map, String targetYarn, String targetInterm) {
        if (an.values == null) return;
        for (int i = 0; i < an.values.size(); i += 2) {
            String key = (String) an.values.get(i);
            Object val = an.values.get(i + 1);
            if (key.equals("method")) {
                if (val instanceof List) {
                    for (String m : (List<String>) val) {
                        String interm = remapMethodRef(targetYarn, m);
                        if (interm != null) {
                            map.put(m, interm);
                        } else if (targetYarn != null && !m.equals("*")) {
                            System.out.println("  DEBUG method '" + m + "' not found in " + targetYarn + " (ann=" + an.desc + ")");
                        }
                    }
                } else if (val instanceof String) {
                    String interm = remapMethodRef(targetYarn, (String) val);
                    if (interm != null) {
                        map.put((String) val, interm);
                    } else if (targetYarn != null && !val.equals("*")) {
                        System.out.println("  DEBUG method '" + val + "' not found in " + targetYarn + " (ann=" + an.desc + ")");
                    }
                }
            } else if (key.equals("target")) {
                if (val instanceof String) {
                    String interm = remapTargetString((String) val, targetYarn);
                    if (interm != null) map.put((String) val, interm);
                }
            } else if (key.equals("at")) {
                if (val instanceof AnnotationNode) {
                    processAtTarget((AnnotationNode) val, map, targetYarn);
                } else if (val instanceof List) {
                    for (Object o : (List<?>) val) {
                        if (o instanceof AnnotationNode) {
                            processAtTarget((AnnotationNode) o, map, targetYarn);
                        }
                    }
                }
            }
        }
    }

    static void processAtTarget(AnnotationNode atAnn, TreeMap<String, String> map, String targetYarn) {
        if (atAnn.values == null) return;
        for (int j = 0; j < atAnn.values.size(); j += 2) {
            String atKey = (String) atAnn.values.get(j);
            Object atVal = atAnn.values.get(j + 1);
            if (atKey.equals("target") && atVal instanceof String) {
                String interm = remapTargetString((String) atVal, targetYarn);
                if (interm != null) map.put((String) atVal, interm);
            }
        }
    }

    static String lookupField(String targetYarnClass, String yarnFieldName) {
        if (targetYarnClass != null) {
            Map<String, String> fields = classFields.get(targetYarnClass);
            if (fields != null) {
                String interm = fields.get(yarnFieldName);
                if (interm != null) return interm;
            }
        }
        return null;
    }

    static void loadSuperClasses() {
        try {
            Path loomCache = Path.of(".gradle/loom-cache");
            if (!Files.exists(loomCache)) {
                System.out.println("loom-cache not found, skipping superclass loading");
                return;
            }
            Path minecraftJar = null;
            try (var stream = Files.walk(loomCache)) {
                minecraftJar = stream.filter(p -> p.toString().endsWith(".jar") && p.toString().contains("minecraft-merged")).findFirst().orElse(null);
            }
            if (minecraftJar == null) {
                System.out.println("No minecraft-merged jar found for superclass loading");
                return;
            }
            System.out.println("Loading superclasses from " + minecraftJar);
            try (var jar = new java.util.jar.JarFile(minecraftJar.toFile())) {
                var entries = jar.entries();
                while (entries.hasMoreElements()) {
                    var entry = entries.nextElement();
                    if (entry.getName().endsWith(".class")) {
                        try (var is = jar.getInputStream(entry)) {
                            ClassReader cr = new ClassReader(is);
                            ClassNode cn = new ClassNode();
                            cr.accept(cn, ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
                            superClassMap.put(cn.name, cn.superName);
                        }
                    }
                }
            }
            System.out.println("Loaded " + superClassMap.size() + " superclasses");
        } catch (Exception e) {
            System.out.println("Failed to load superclasses: " + e.getMessage());
        }
    }

    static String lookupMethod(String targetYarnClass, String yarnMethodName) {
        // If already intermediary format, return as-is
        if (yarnMethodName.matches("method_\\d+")) return yarnMethodName;
        if (targetYarnClass != null) {
            // 1. Check target class directly
            Map<String, String> methods = classMethods.get(targetYarnClass);
            if (methods != null) {
                String interm = methods.get(yarnMethodName);
                if (interm != null) return interm;
            }
            // 2. Check superclasses via intermediary chain
            String currentInterm = classYarnToInterm.get(targetYarnClass);
            if (currentInterm != null) {
                while (true) {
                    String superInterm = superClassMap.get(currentInterm);
                    if (superInterm == null) break;
                    methods = classMethodsInterm.get(superInterm);
                    if (methods != null) {
                        String interm = methods.get(yarnMethodName);
                        if (interm != null) return interm;
                    }
                    currentInterm = superInterm;
                }
            }
        }
        // Fallback to global map
        return methodYarnToIntermGlobal.get(yarnMethodName);
    }

    static String lookupMethodByDesc(String targetYarnClass, String yarnMethodName, String desc) {
        // If already intermediary format, return as-is
        if (yarnMethodName.matches("method_\\d+")) return yarnMethodName;
        // classMethodDescs is keyed by yarnName + INTERMEDIARY descriptor (mappings.tiny stores
        // the intermediary descriptor), so remap the input yarn descriptor before lookup.
        String intermDesc = remapDescriptor(desc);
        if (targetYarnClass != null) {
            // 1. Check target class directly
            Map<String, String> methods = classMethodDescs.get(targetYarnClass);
            if (methods != null) {
                String key = yarnMethodName + intermDesc;
                String interm = methods.get(key);
                if (interm != null) return interm;
            }
            // 2. Check superclasses via intermediary chain
            String currentInterm = classYarnToInterm.get(targetYarnClass);
            if (currentInterm != null) {
                while (true) {
                    String superInterm = superClassMap.get(currentInterm);
                    if (superInterm == null) break;
                    methods = classMethodDescsInterm.get(superInterm);
                    if (methods != null) {
                        String key = yarnMethodName + intermDesc;
                        String interm = methods.get(key);
                        if (interm != null) return interm;
                    }
                    currentInterm = superInterm;
                }
            }
            // 3. Fallback to name-only lookup
            String interm = lookupMethod(targetYarnClass, yarnMethodName);
            if (interm != null) return interm;
        }
        return null;
    }

    static String remapClass(String yarn) {
        String cleaned = yarn.replace('.', '/');
        if (cleaned.startsWith("L") && cleaned.endsWith(";")) cleaned = cleaned.substring(1, cleaned.length() - 1);
        return classYarnToInterm.get(cleaned);
    }

    static String remapMethodRef(String targetYarnClass, String methodRef) {
        if (methodRef.equals("*")) return null;
        String methodName = methodRef;
        String desc = null;
        int parenIdx = methodRef.indexOf('(');
        if (parenIdx >= 0) {
            methodName = methodRef.substring(0, parenIdx);
            desc = methodRef.substring(parenIdx);
        }
        String interm = lookupMethod(targetYarnClass, methodName);
        if (interm != null) {
            return desc != null ? interm + desc : interm;
        }
        return null;
    }

    static String remapDescriptor(String desc) {
        if (desc == null || desc.isEmpty()) return desc;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < desc.length()) {
            char c = desc.charAt(i);
            if (c == 'L') {
                int semi = desc.indexOf(';', i);
                if (semi < 0) {
                    sb.append(desc.substring(i));
                    break;
                }
                String yarnClass = desc.substring(i + 1, semi);
                String interm = classYarnToInterm.get(yarnClass);
                sb.append('L').append(interm != null ? interm : yarnClass).append(';');
                i = semi + 1;
            } else {
                sb.append(c);
                i++;
            }
        }
        return sb.toString();
    }

    static String remapTargetString(String target, String targetYarnClass) {
        // Target format: Lnet/minecraft/client/gl/Uniform;set(I)V
        // Extract the Yarn class and method BEFORE any replacement
        int semiIdx = target.indexOf(';');
        int parenIdx = target.indexOf('(');
        if (semiIdx >= 0 && parenIdx > semiIdx) {
            String yarnClass = target.substring(1, semiIdx);   // "net/minecraft/client/gl/Uniform"
            String yarnMethod = target.substring(semiIdx + 1, parenIdx); // "set"
            String desc = target.substring(parenIdx);           // "(I)V"

            String intermClass = remapClass(yarnClass);
            String intermMethod = lookupMethodByDesc(yarnClass, yarnMethod, desc);

            if (intermClass != null && intermMethod != null) {
                return "L" + intermClass + ";" + intermMethod + remapDescriptor(desc);
            }
            if (intermClass != null) {
                return "L" + intermClass + ";" + yarnMethod + remapDescriptor(desc);
            }
        }
        // Fallback: global class replacement only
        String result = target;
        boolean changed = false;
        for (var e : classYarnToInterm.entrySet()) {
            if (result.contains(e.getKey())) {
                result = result.replace(e.getKey(), e.getValue());
                changed = true;
            }
        }
        return changed ? result : null;
    }

    static void writeRefmap(Path outFile) throws IOException {
        StringBuilder json = new StringBuilder();
        json.append("{\n");
        json.append("  \"mappings\": {\n");
        boolean first = true;
        for (var entry : mixinMaps.entrySet()) {
            if (!first) json.append(",\n");
            first = false;
            json.append("    \"").append(entry.getKey()).append("\": {\n");
            var map = entry.getValue();
            boolean fe = true;
            for (var e : map.entrySet()) {
                if (!fe) json.append(",\n");
                fe = false;
                json.append("      \"").append(esc(e.getKey())).append("\": \"").append(esc(e.getValue())).append("\"");
            }
            json.append("\n    }");
        }
        json.append("\n  },\n");
        json.append("  \"data\": {\n");
        json.append("    \"named:intermediary\": {\n");
        first = true;
        for (var entry : mixinMaps.entrySet()) {
            if (!first) json.append(",\n");
            first = false;
            json.append("      \"").append(entry.getKey()).append("\": {\n");
            var map = entry.getValue();
            boolean fe = true;
            for (var e : map.entrySet()) {
                if (!fe) json.append(",\n");
                fe = false;
                json.append("        \"").append(esc(e.getKey())).append("\": \"").append(esc(e.getValue())).append("\"");
            }
            json.append("\n      }");
        }
        json.append("\n    }\n");
        json.append("  }\n");
        json.append("}\n");
        Files.createDirectories(outFile.getParent());
        Files.writeString(outFile, json.toString(), StandardCharsets.UTF_8);
    }

    static String esc(String s) { return s.replace("\\", "\\\\").replace("\"", "\\\""); }

    static void mergeExistingRefmap(Path file) throws IOException {
        String content = Files.readString(file, StandardCharsets.UTF_8);
        if (content.trim().equals("{}") || content.length() < 20) {
            System.out.println("Existing refmap is empty, skipping merge");
            return;
        }
        Pattern mixinPat = Pattern.compile("\"(sg/mx/\\w+)\"\\s*:\\s*\\{([^}]*)\\}");
        Matcher m = mixinPat.matcher(content);
        int merged = 0;
        while (m.find()) {
            String mixinName = m.group(1);
            String entries = m.group(2);
            TreeMap<String, String> existingMap = mixinMaps.computeIfAbsent(mixinName, k -> new TreeMap<>());
            Pattern entryPat = Pattern.compile("\"([^\"]+)\"\\s*:\\s*\"([^\"]+)\"");
            Matcher em = entryPat.matcher(entries);
            while (em.find()) {
                String key = em.group(1);
                String val = em.group(2);
                if (!existingMap.containsKey(key)) {
                    existingMap.put(key, val);
                    merged++;
                }
            }
        }
        System.out.println("Merged " + merged + " entries from existing refmap");
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
                                String desc = parts[mIdx + 1]; // descriptor like (I)V
                                classMethodDescs.computeIfAbsent(currentClassYarn, k -> new HashMap<>()).put(yarn + desc, interm);
                                String currentInterm = classYarnToInterm.get(currentClassYarn);
                                if (currentInterm != null) {
                                    classMethodsInterm.computeIfAbsent(currentInterm, k -> new HashMap<>()).put(yarn, interm);
                                    classMethodDescsInterm.computeIfAbsent(currentInterm, k -> new HashMap<>()).put(yarn + desc, interm);
                                }
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
    }
}
