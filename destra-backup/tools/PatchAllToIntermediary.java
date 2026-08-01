import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;
import java.util.regex.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class PatchAllToIntermediary {
    static Map<String, Map<String, String>> classFields = new HashMap<>();
    static Map<String, Map<String, String>> classMethods = new HashMap<>();
    static Map<String, Map<String, String>> classMethodDescs = new HashMap<>();
    static Map<String, String> classYarnToInterm = new HashMap<>();

    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        parseMappings();
        System.out.println("Maps: classes=" + classYarnToInterm.size());

        Path dir = args.length > 0 ? Path.of(args[0]) : Path.of(".precompiled/sg/mx");
        int patched = 0;
        try (var stream = Files.list(dir)) {
            var files = stream.filter(p -> p.toString().endsWith(".class") && !p.toString().contains("$")).sorted().toList();
            for (Path file : files) {
                if (patchClass(file)) patched++;
            }
        }
        System.out.println("Patched " + patched + " classes");
    }

    static boolean patchClass(Path file) throws IOException {
        byte[] bytes = Files.readAllBytes(file);
        ClassReader cr = new ClassReader(bytes);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        String targetYarn = null;
        List<AnnotationNode> allAnns = new ArrayList<>();
        if (cn.visibleAnnotations != null) allAnns.addAll(cn.visibleAnnotations);
        if (cn.invisibleAnnotations != null) allAnns.addAll(cn.invisibleAnnotations);

        for (AnnotationNode an : allAnns) {
            if (an.desc.equals("Lorg/spongepowered/asm/mixin/Mixin;")) {
                // Get Yarn target BEFORE remapping the annotation
                targetYarn = getMixinTarget(an);
                // Remap the @Mixin value/targets to intermediary
                remapMixinAnnotation(an);
            }
        }

        if (targetYarn == null) return false;

        // Map of field renames: yarnName -> intermName
        Map<String, String> fieldRenames = new HashMap<>();

        // Patch @Shadow fields
        if (cn.fields != null) {
            for (FieldNode fn : cn.fields) {
                List<AnnotationNode> fieldAnns = new ArrayList<>();
                if (fn.visibleAnnotations != null) fieldAnns.addAll(fn.visibleAnnotations);
                if (fn.invisibleAnnotations != null) fieldAnns.addAll(fn.invisibleAnnotations);
                for (AnnotationNode an : fieldAnns) {
                    if (an.desc.equals("Lorg/spongepowered/asm/mixin/Shadow;")) {
                        String yarnName = fn.name;
                        // Check if annotation has explicit value
                        if (an.values != null) {
                            for (int i = 0; i < an.values.size(); i += 2) {
                                if (((String)an.values.get(i)).equals("value") && an.values.get(i+1) instanceof String) {
                                    yarnName = (String) an.values.get(i+1);
                                }
                            }
                        }
                        String interm = lookupField(targetYarn, yarnName);
                        if (interm != null && !interm.equals(yarnName)) {
                            fieldRenames.put(fn.name, interm);
                            fn.name = interm;
                            // Update annotation value if present
                            if (an.values != null) {
                                for (int i = 0; i < an.values.size(); i += 2) {
                                    if (((String)an.values.get(i)).equals("value") && an.values.get(i+1) instanceof String) {
                                        an.values.set(i+1, interm);
                                    }
                                }
                            }
                        }
                    }
                    if (an.desc.equals("Lorg/spongepowered/asm/mixin/gen/Accessor;")) {
                        String yarnName = deriveFieldName(fn.name);
                        if (an.values != null) {
                            for (int i = 0; i < an.values.size(); i += 2) {
                                if (((String)an.values.get(i)).equals("value") && an.values.get(i+1) instanceof String) {
                                    yarnName = (String) an.values.get(i+1);
                                }
                            }
                        }
                        String interm = lookupField(targetYarn, yarnName);
                        if (interm != null && !interm.equals(yarnName)) {
                            if (an.values != null) {
                                for (int i = 0; i < an.values.size(); i += 2) {
                                    if (((String)an.values.get(i)).equals("value") && an.values.get(i+1) instanceof String) {
                                        an.values.set(i+1, interm);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        // Patch method annotations and rename field references in bytecode
        if (cn.methods != null) {
            for (MethodNode mn : cn.methods) {
                // Rename field references in bytecode
                if (mn.instructions != null && !fieldRenames.isEmpty()) {
                    for (AbstractInsnNode insn : mn.instructions) {
                        if (insn instanceof FieldInsnNode) {
                            FieldInsnNode fin = (FieldInsnNode) insn;
                            if (fieldRenames.containsKey(fin.name)) {
                                fin.name = fieldRenames.get(fin.name);
                            }
                        }
                    }
                }

                // Patch annotations on methods
                List<AnnotationNode> methodAnns = new ArrayList<>();
                if (mn.visibleAnnotations != null) methodAnns.addAll(mn.visibleAnnotations);
                if (mn.invisibleAnnotations != null) methodAnns.addAll(mn.invisibleAnnotations);
                for (AnnotationNode an : methodAnns) {
                    patchMethodAnnotation(an, targetYarn);
                }
            }
        }

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        Files.write(file, cw.toByteArray());
        System.out.println("  Patched: " + file.getFileName() + " (target=" + targetYarn + ", fields=" + fieldRenames + ")");
        return true;
    }

    @SuppressWarnings("unchecked")
    static void remapMixinAnnotation(AnnotationNode an) {
        if (an.values == null) return;
        for (int i = 0; i < an.values.size(); i += 2) {
            String key = (String) an.values.get(i);
            Object val = an.values.get(i + 1);
            if (key.equals("value")) {
                if (val instanceof List) {
                    List<Object> list = (List<Object>) val;
                    for (int j = 0; j < list.size(); j++) {
                        list.set(j, remapTypeObj(list.get(j)));
                    }
                } else {
                    an.values.set(i + 1, remapTypeObj(val));
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
    }

    static Object remapTypeObj(Object obj) {
        if (obj instanceof String) {
            String interm = remapClass((String) obj);
            return interm != null ? interm : obj;
        }
        if (obj instanceof org.objectweb.asm.Type) {
            org.objectweb.asm.Type t = (org.objectweb.asm.Type) obj;
            String interm = remapClass(t.getInternalName());
            if (interm != null) return org.objectweb.asm.Type.getObjectType(interm);
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    static void patchMethodAnnotation(AnnotationNode an, String targetYarn) {
        if (an.values == null) return;
        // Handle @Accessor: remap "value" (field name) to intermediary
        if (an.desc.equals("Lorg/spongepowered/asm/mixin/gen/Accessor;")) {
            for (int i = 0; i < an.values.size(); i += 2) {
                String key = (String) an.values.get(i);
                if (key.equals("value") && an.values.get(i + 1) instanceof String) {
                    String yarnField = (String) an.values.get(i + 1);
                    String interm = lookupField(targetYarn, yarnField);
                    if (interm != null) {
                        an.values.set(i + 1, interm);
                    }
                }
            }
            return;
        }
        // Handle @Shadow on methods (for @Shadow methods): remap "value" to intermediary
        if (an.desc.equals("Lorg/spongepowered/asm/mixin/Shadow;")) {
            for (int i = 0; i < an.values.size(); i += 2) {
                String key = (String) an.values.get(i);
                if (key.equals("value") && an.values.get(i + 1) instanceof String) {
                    String yarnField = (String) an.values.get(i + 1);
                    String interm = lookupField(targetYarn, yarnField);
                    if (interm != null) {
                        an.values.set(i + 1, interm);
                    }
                }
            }
            return;
        }
        for (int i = 0; i < an.values.size(); i += 2) {
            String key = (String) an.values.get(i);
            Object val = an.values.get(i + 1);
            if (key.equals("method")) {
                if (val instanceof List) {
                    List<String> list = (List<String>) val;
                    for (int j = 0; j < list.size(); j++) {
                        list.set(j, remapMethodRef(targetYarn, list.get(j)));
                    }
                } else if (val instanceof String) {
                    an.values.set(i + 1, remapMethodRef(targetYarn, (String) val));
                }
            } else if (key.equals("target")) {
                if (val instanceof String) {
                    an.values.set(i + 1, remapTargetString((String) val, targetYarn));
                }
            } else if (key.equals("at") && val instanceof AnnotationNode) {
                AnnotationNode atAnn = (AnnotationNode) val;
                if (atAnn.values != null) {
                    for (int j = 0; j < atAnn.values.size(); j += 2) {
                        String atKey = (String) atAnn.values.get(j);
                        Object atVal = atAnn.values.get(j + 1);
                        if (atKey.equals("target") && atVal instanceof String) {
                            atAnn.values.set(j + 1, remapTargetString((String) atVal, targetYarn));
                        }
                    }
                }
            }
        }
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
                        String yarn = typeToString(v);
                        if (yarn != null) return yarn;
                    }
                } else {
                    return typeToString(val);
                }
            }
        }
        return null;
    }

    static String typeToString(Object val) {
        if (val instanceof String) return (String) val;
        if (val instanceof org.objectweb.asm.Type) return ((org.objectweb.asm.Type) val).getInternalName();
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

    static String lookupField(String yarnClass, String fieldName) {
        // Try Yarn class name first
        Map<String, String> fields = classFields.get(yarnClass);
        if (fields != null) return fields.get(fieldName);
        // Try intermediary class name (reverse lookup)
        for (var e : classYarnToInterm.entrySet()) {
            if (e.getValue().equals(yarnClass)) {
                Map<String, String> fields2 = classFields.get(e.getKey());
                if (fields2 != null) return fields2.get(fieldName);
            }
        }
        return null;
    }

    static String lookupMethod(String yarnClass, String methodName) {
        // Try Yarn class name first
        Map<String, String> methods = classMethods.get(yarnClass);
        if (methods != null) return methods.get(methodName);
        // Try intermediary class name (reverse lookup)
        for (var e : classYarnToInterm.entrySet()) {
            if (e.getValue().equals(yarnClass)) {
                Map<String, String> methods2 = classMethods.get(e.getKey());
                if (methods2 != null) return methods2.get(methodName);
            }
        }
        return null;
    }

    static String lookupMethodByDesc(String yarnClass, String methodName, String desc) {
        Map<String, String> methods = classMethodDescs.get(yarnClass);
        if (methods != null) {
            String interm = methods.get(methodName + desc);
            if (interm != null) return interm;
        }
        return lookupMethod(yarnClass, methodName);
    }

    static String remapClass(String yarn) {
        String cleaned = yarn.replace('.', '/');
        if (cleaned.startsWith("L") && cleaned.endsWith(";")) cleaned = cleaned.substring(1, cleaned.length() - 1);
        return classYarnToInterm.get(cleaned);
    }

    static String remapMethodRef(String targetYarn, String methodRef) {
        if (methodRef.equals("*")) return methodRef;
        String methodName = methodRef;
        String desc = null;
        int parenIdx = methodRef.indexOf('(');
        if (parenIdx >= 0) {
            methodName = methodRef.substring(0, parenIdx);
            desc = methodRef.substring(parenIdx);
        }
        String interm = lookupMethod(targetYarn, methodName);
        if (interm != null) {
            return desc != null ? interm + desc : interm;
        }
        return methodRef;
    }

    static String remapTargetString(String target, String targetYarn) {
        // Target format: Lnet/minecraft/client/gl/Uniform;set(I)V
        // We need to remap BOTH the class AND the method name to intermediary.
        int semiIdx = target.indexOf(';');
        int parenIdx = target.indexOf('(');
        if (semiIdx >= 0 && parenIdx > semiIdx) {
            // Extract Yarn class name and method name BEFORE any replacement
            String yarnClass = target.substring(1, semiIdx); // "net/minecraft/client/gl/Uniform"
            String yarnMethod = target.substring(semiIdx + 1, parenIdx); // "set"
            String desc = target.substring(parenIdx); // "(I)V"

            String intermClass = remapClass(yarnClass);
            String intermMethod = lookupMethodByDesc(yarnClass, yarnMethod, desc);

            if (intermClass != null && intermMethod != null) {
                return "L" + intermClass + ";" + intermMethod + desc;
            }
            // Fallback: at least remap the class
            if (intermClass != null) {
                return "L" + intermClass + ";" + yarnMethod + desc;
            }
        }
        // Fallback: global class replacement
        String result = target;
        for (var e : classYarnToInterm.entrySet()) {
            result = result.replace(e.getKey(), e.getValue());
        }
        return result;
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
                        classYarnToInterm.put(parts[2], parts[1]);
                        currentClassYarn = parts[2];
                        classFields.computeIfAbsent(currentClassYarn, k -> new HashMap<>());
                        classMethods.computeIfAbsent(currentClassYarn, k -> new HashMap<>());
                    }
                } else if (type == '\t') {
                    int mIdx = -1;
                    for (int i = 0; i < parts.length; i++) {
                        if (parts[i].equals("m") || parts[i].equals("f")) { mIdx = i; break; }
                    }
                    if (mIdx >= 0 && parts.length >= mIdx + 4 && currentClassYarn != null) {
                        String memberType = parts[mIdx];
                        String desc = parts[mIdx + 1];
                        String interm = parts[mIdx + 2];
                        String yarn = parts[mIdx + 3];
                        if (memberType.equals("m")) {
                            classMethods.get(currentClassYarn).put(yarn, interm);
                            classMethodDescs.computeIfAbsent(currentClassYarn, k -> new HashMap<>()).put(yarn + desc, interm);
                        } else {
                            classFields.get(currentClassYarn).put(yarn, interm);
                        }
                    }
                }
            }
        } finally {
            if (zf != null) zf.close();
        }
    }
}
