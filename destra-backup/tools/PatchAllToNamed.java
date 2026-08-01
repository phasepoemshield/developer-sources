import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import java.util.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class PatchAllToNamed {
    static Map<String, Map<String, String>> classFieldsInterm = new HashMap<>();
    static Map<String, Map<String, String>> classMethodsInterm = new HashMap<>();
    static Map<String, Map<String, String>> classMethodDescsInterm = new HashMap<>();
    static Map<String, String> classIntermToYarn = new HashMap<>();

    public static void main(String[] args) throws Exception {
        System.setOut(new java.io.PrintStream(System.out, true, StandardCharsets.UTF_8));
        parseMappings();
        System.out.println("Maps: classes=" + classIntermToYarn.size());

        Path dir = args.length > 0 ? Path.of(args[0]) : Path.of(".precompiled/sg/mx");
        int patched = 0;
        try (var stream = Files.list(dir)) {
            var files = stream.filter(p -> p.toString().endsWith(".class") && !p.toString().contains("$")).sorted().toList();
            for (Path file : files) {
                if (patchClass(file)) patched++;
            }
        }
        System.out.println("Patched " + patched + " classes to named");
    }

    static boolean patchClass(Path file) throws IOException {
        byte[] bytes = Files.readAllBytes(file);
        ClassReader cr = new ClassReader(bytes);
        ClassNode cn = new ClassNode();
        cr.accept(cn, 0);

        String targetInterm = null;
        List<AnnotationNode> allAnns = new ArrayList<>();
        if (cn.visibleAnnotations != null) allAnns.addAll(cn.visibleAnnotations);
        if (cn.invisibleAnnotations != null) allAnns.addAll(cn.invisibleAnnotations);

        for (AnnotationNode an : allAnns) {
            if (an.desc.equals("Lorg/spongepowered/asm/mixin/Mixin;")) {
                targetInterm = getMixinTarget(an);
                remapMixinAnnotation(an);
            }
        }

        if (targetInterm == null) return false;

        Map<String, String> fieldRenames = new HashMap<>();

        if (cn.fields != null) {
            for (FieldNode fn : cn.fields) {
                List<AnnotationNode> fieldAnns = new ArrayList<>();
                if (fn.visibleAnnotations != null) fieldAnns.addAll(fn.visibleAnnotations);
                if (fn.invisibleAnnotations != null) fieldAnns.addAll(fn.invisibleAnnotations);
                for (AnnotationNode an : fieldAnns) {
                    if (an.desc.equals("Lorg/spongepowered/asm/mixin/Shadow;")) {
                        String intermName = fn.name;
                        if (an.values != null) {
                            for (int i = 0; i < an.values.size(); i += 2) {
                                if (((String)an.values.get(i)).equals("value") && an.values.get(i+1) instanceof String) {
                                    intermName = (String) an.values.get(i+1);
                                }
                            }
                        }
                        String yarn = lookupField(targetInterm, intermName);
                        if (yarn != null && !yarn.equals(intermName)) {
                            fieldRenames.put(fn.name, yarn);
                            fn.name = yarn;
                            if (an.values != null) {
                                for (int i = 0; i < an.values.size(); i += 2) {
                                    if (((String)an.values.get(i)).equals("value") && an.values.get(i+1) instanceof String) {
                                        an.values.set(i+1, yarn);
                                    }
                                }
                            }
                        }
                    }
                    if (an.desc.equals("Lorg/spongepowered/asm/mixin/gen/Accessor;")) {
                        String intermName = fn.name;
                        if (an.values != null) {
                            for (int i = 0; i < an.values.size(); i += 2) {
                                if (((String)an.values.get(i)).equals("value") && an.values.get(i+1) instanceof String) {
                                    intermName = (String) an.values.get(i+1);
                                }
                            }
                        }
                        String yarn = lookupField(targetInterm, intermName);
                        if (yarn != null && !yarn.equals(intermName)) {
                            if (an.values != null) {
                                for (int i = 0; i < an.values.size(); i += 2) {
                                    if (((String)an.values.get(i)).equals("value") && an.values.get(i+1) instanceof String) {
                                        an.values.set(i+1, yarn);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if (cn.methods != null) {
            for (MethodNode mn : cn.methods) {
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

                List<AnnotationNode> methodAnns = new ArrayList<>();
                if (mn.visibleAnnotations != null) methodAnns.addAll(mn.visibleAnnotations);
                if (mn.invisibleAnnotations != null) methodAnns.addAll(mn.invisibleAnnotations);
                for (AnnotationNode an : methodAnns) {
                    patchMethodAnnotation(an, targetInterm);
                }
            }
        }

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        Files.write(file, cw.toByteArray());
        System.out.println("  Patched: " + file.getFileName() + " (target=" + targetInterm + ", fields=" + fieldRenames + ")");
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
                        String yarn = remapClass(list.get(j));
                        if (yarn != null) list.set(j, yarn);
                    }
                }
            }
        }
    }

    static Object remapTypeObj(Object obj) {
        if (obj instanceof String) {
            String yarn = remapClass((String) obj);
            return yarn != null ? yarn : obj;
        }
        if (obj instanceof org.objectweb.asm.Type) {
            org.objectweb.asm.Type t = (org.objectweb.asm.Type) obj;
            String yarn = remapClass(t.getInternalName());
            if (yarn != null) return org.objectweb.asm.Type.getObjectType(yarn);
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    static void patchMethodAnnotation(AnnotationNode an, String targetInterm) {
        if (an.values == null) return;
        if (an.desc.equals("Lorg/spongepowered/asm/mixin/gen/Accessor;")) {
            for (int i = 0; i < an.values.size(); i += 2) {
                String key = (String) an.values.get(i);
                if (key.equals("value") && an.values.get(i + 1) instanceof String) {
                    String intermField = (String) an.values.get(i + 1);
                    String yarn = lookupField(targetInterm, intermField);
                    if (yarn != null) {
                        an.values.set(i + 1, yarn);
                    }
                }
            }
            return;
        }
        if (an.desc.equals("Lorg/spongepowered/asm/mixin/gen/Invoker;")) {
            for (int i = 0; i < an.values.size(); i += 2) {
                String key = (String) an.values.get(i);
                if (key.equals("value") && an.values.get(i + 1) instanceof String) {
                    String intermMethod = (String) an.values.get(i + 1);
                    String yarn = lookupMethod(targetInterm, intermMethod);
                    if (yarn != null) {
                        an.values.set(i + 1, yarn);
                    }
                }
            }
            return;
        }
        if (an.desc.equals("Lorg/spongepowered/asm/mixin/Shadow;")) {
            for (int i = 0; i < an.values.size(); i += 2) {
                String key = (String) an.values.get(i);
                if (key.equals("value") && an.values.get(i + 1) instanceof String) {
                    String intermField = (String) an.values.get(i + 1);
                    String yarn = lookupField(targetInterm, intermField);
                    if (yarn != null) {
                        an.values.set(i + 1, yarn);
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
                        list.set(j, remapMethodRef(targetInterm, list.get(j)));
                    }
                } else if (val instanceof String) {
                    an.values.set(i + 1, remapMethodRef(targetInterm, (String) val));
                }
            } else if (key.equals("target")) {
                if (val instanceof String) {
                    an.values.set(i + 1, remapTargetString((String) val, targetInterm));
                }
            } else if (key.equals("at") && val instanceof AnnotationNode) {
                AnnotationNode atAnn = (AnnotationNode) val;
                if (atAnn.values != null) {
                    for (int j = 0; j < atAnn.values.size(); j += 2) {
                        String atKey = (String) atAnn.values.get(j);
                        Object atVal = atAnn.values.get(j + 1);
                        if (atKey.equals("target") && atVal instanceof String) {
                            atAnn.values.set(j + 1, remapTargetString((String) atVal, targetInterm));
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
                        String interm = typeToString(v);
                        if (interm != null) return interm;
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

    static String lookupField(String intermClass, String fieldName) {
        Map<String, String> fields = classFieldsInterm.get(intermClass);
        if (fields != null) return fields.get(fieldName);
        for (var e : classIntermToYarn.entrySet()) {
            if (e.getValue().equals(intermClass)) {
                Map<String, String> fields2 = classFieldsInterm.get(e.getKey());
                if (fields2 != null) return fields2.get(fieldName);
            }
        }
        return null;
    }

    static String lookupMethod(String intermClass, String methodName) {
        Map<String, String> methods = classMethodsInterm.get(intermClass);
        if (methods != null) {
            String yarn = methods.get(methodName);
            if (yarn != null) return yarn;
        }
        for (var e : classIntermToYarn.entrySet()) {
            if (e.getValue().equals(intermClass)) {
                Map<String, String> methods2 = classMethodsInterm.get(e.getKey());
                if (methods2 != null) {
                    String yarn = methods2.get(methodName);
                    if (yarn != null) return yarn;
                }
            }
        }
        // Inherited methods live on superinterfaces/superclasses (e.g. ChatScreen
        // mouseClicked is declared on Element). Intermediary names are globally unique.
        for (Map<String, String> methods2 : classMethodsInterm.values()) {
            String yarn = methods2.get(methodName);
            if (yarn != null) return yarn;
        }
        return null;
    }

    static String lookupMethodByDesc(String intermClass, String methodName, String desc) {
        Map<String, String> methods = classMethodDescsInterm.get(intermClass);
        if (methods != null) {
            String yarn = methods.get(methodName + desc);
            if (yarn != null) return yarn;
        }
        String key = methodName + desc;
        for (Map<String, String> methods2 : classMethodDescsInterm.values()) {
            String yarn = methods2.get(key);
            if (yarn != null) return yarn;
        }
        return lookupMethod(intermClass, methodName);
    }

    static String remapClass(String interm) {
        String cleaned = interm.replace('.', '/');
        if (cleaned.startsWith("L") && cleaned.endsWith(";")) cleaned = cleaned.substring(1, cleaned.length() - 1);
        return classIntermToYarn.get(cleaned);
    }

    static String remapMethodRef(String targetInterm, String methodRef) {
        if (methodRef.equals("*")) return methodRef;
        String methodName = methodRef;
        String desc = null;
        int parenIdx = methodRef.indexOf('(');
        if (parenIdx >= 0) {
            methodName = methodRef.substring(0, parenIdx);
            desc = methodRef.substring(parenIdx);
        }
        String yarn = lookupMethod(targetInterm, methodName);
        if (yarn != null) {
            return desc != null ? yarn + desc : yarn;
        }
        return methodRef;
    }

    static String remapTargetString(String target, String targetInterm) {
        // First extract the intermediary class and method from target BEFORE any replacement
        int semiIdx = target.indexOf(';');
        int parenIdx = target.indexOf('(');
        if (semiIdx >= 0 && parenIdx > semiIdx) {
            String intermClass = target.substring(1, semiIdx);
            String intermMethod = target.substring(semiIdx + 1, parenIdx);
            String desc = target.substring(parenIdx);

            String yarnClass = remapClass(intermClass);
            String yarnMethod = lookupMethodByDesc(intermClass, intermMethod, desc);

            if (yarnClass != null && yarnMethod != null) {
                return "L" + yarnClass + ";" + yarnMethod + desc;
            }
            if (yarnClass != null) {
                return "L" + yarnClass + ";" + intermMethod + desc;
            }
        }
        // Fallback: global class replacement only
        String result = target;
        for (var e : classIntermToYarn.entrySet()) {
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
            String currentClassInterm = null;
            while ((line = br.readLine()) != null) {
                if (line.isEmpty()) continue;
                char type = line.charAt(0);
                String[] parts = line.split("\t");
                if (type == 'c') {
                    if (parts.length >= 3) {
                        classIntermToYarn.put(parts[1], parts[2]);
                        currentClassInterm = parts[1];
                        classFieldsInterm.computeIfAbsent(currentClassInterm, k -> new HashMap<>());
                        classMethodsInterm.computeIfAbsent(currentClassInterm, k -> new HashMap<>());
                    }
                } else if (type == '\t') {
                    int mIdx = -1;
                    for (int i = 0; i < parts.length; i++) {
                        if (parts[i].equals("m") || parts[i].equals("f")) { mIdx = i; break; }
                    }
                    if (mIdx >= 0 && parts.length >= mIdx + 4 && currentClassInterm != null) {
                        String memberType = parts[mIdx];
                        String desc = parts[mIdx + 1];
                        String interm = parts[mIdx + 2];
                        String yarn = parts[mIdx + 3];
                        if (memberType.equals("m")) {
                            classMethodsInterm.get(currentClassInterm).put(interm, yarn);
                            classMethodDescsInterm.computeIfAbsent(currentClassInterm, k -> new HashMap<>()).put(interm + desc, yarn);
                        } else {
                            classFieldsInterm.get(currentClassInterm).put(interm, yarn);
                        }
                    }
                }
            }
        } finally {
            if (zf != null) zf.close();
        }
    }
}
