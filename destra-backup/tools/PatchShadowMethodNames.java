import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.zip.*;

public final class PatchShadowMethodNames {
    static Map<String, Map<String, String>> refmapMappings;
    static Map<String, Map<String, List<String>>> mcMethodsByArgs = new HashMap<>();
    static Map<String, Map<String, List<String>>> mcMethodsByDesc = new HashMap<>();
    static Map<String, String> globalNamedToInterm = new HashMap<>();
    static Map<String, Map<String, String>> globalMethodMappings = new HashMap<>();

    public static void main(String[] args) throws Exception {
        Path refmapPath = Path.of("build/refmap-merged.json");
        if (!Files.exists(refmapPath)) { System.out.println("refmap not found, skipping"); return; }
        loadRefmap(refmapPath);
        // Load global named->intermediary class mappings from mappings.tiny (covers all MC classes,
        // not just the subset in refmap — needed to remap @Shadow method arg types like Vec3d).
        Path mappingsPath = Path.of("mappings/mappings.tiny");
        if (Files.exists(mappingsPath)) loadMappingsTiny(mappingsPath);
        String mcJar = System.getProperty("mc.jar");
        if (mcJar != null && Files.exists(Path.of(mcJar))) loadMinecraft(mcJar);
        System.out.println("Loaded refmap with " + refmapMappings.size() + " class entries, global mappings: " + globalNamedToInterm.size() + ", MC classes: " + mcMethodsByArgs.size());

        Path dir = Path.of(".precompiled/sg/mx");
        if (!Files.exists(dir)) { System.out.println("no sg/mx dir"); return; }
        List<Path> classes = new ArrayList<>();
        try (var s = Files.list(dir)) { s.filter(p -> p.toString().endsWith(".class")).forEach(classes::add); }
        Collections.sort(classes);

        int renamedMethods = 0, patchedClasses = 0, refsUpdated = 0;
        for (Path p : classes) {
            byte[] data = Files.readAllBytes(p);
            ClassReader cr = new ClassReader(data);
            ClassNode cn = new ClassNode();
            cr.accept(cn, 0);
            Map<String, String> classMap = refmapMappings.get(cn.name);
            if (classMap == null) continue;

            // Find @Shadow/@Invoker/@Accessor methods that need renaming
            Map<String, String> renames = new LinkedHashMap<>();
            for (MethodNode m : cn.methods) {
                // Check both visible and invisible annotations for @Shadow and @Invoker
                AnnotationNode shadow = null;
                for (List<AnnotationNode> anns : java.util.Arrays.asList(m.visibleAnnotations, m.invisibleAnnotations)) {
                    if (anns == null) continue;
                    for (var a : anns) {
                        if ("Lorg/spongepowered/asm/mixin/Shadow;".equals(a.desc) || "Lorg/spongepowered/asm/mixin/gen/Invoker;".equals(a.desc)) { shadow = a; break; }
                    }
                    if (shadow != null) break;
                }
                if (shadow == null) continue;
                if (Boolean.getBoolean("debug")) System.out.println("  DBG " + p.getFileName() + " :: @Shadow/@Invoker/@Accessor method " + m.name + m.desc + " ann=" + shadow.desc);

                // For @Invoker/@Accessor, also update the annotation's "value" (target method/field name).
                // Mixin uses the annotation value to find the target in the target class, NOT the method name.
                if (("Lorg/spongepowered/asm/mixin/gen/Invoker;".equals(shadow.desc) || "Lorg/spongepowered/asm/mixin/gen/Accessor;".equals(shadow.desc)) && shadow.values != null) {
                    boolean annChanged = false;
                    for (int vi = 0; vi < shadow.values.size(); vi += 2) {
                        if ("value".equals(shadow.values.get(vi))) {
                            Object val = shadow.values.get(vi + 1);
                            if (val instanceof String) {
                                String yarnName = (String) val;
                                String mappedVal = classMap.get(yarnName);
                                if (mappedVal == null) {
                                    String targetInterm = findMixinTargetInterm(cn, classMap);
                                    if (targetInterm != null && "Lorg/spongepowered/asm/mixin/gen/Invoker;".equals(shadow.desc)) {
                                        String fullDesc = remapDesc(m.desc, classMap);
                                        mappedVal = findMethodByFullDesc(targetInterm, fullDesc);
                                    }
                                }
                                if (mappedVal != null && !mappedVal.equals(yarnName)) {
                                    shadow.values.set(vi + 1, mappedVal);
                                    annChanged = true;
                                    System.out.println("  " + p.getFileName() + " :: @" + ("Lorg/spongepowered/asm/mixin/gen/Invoker;".equals(shadow.desc) ? "Invoker" : "Accessor") + " value " + yarnName + " -> " + mappedVal);
                                }
                            }
                            break;
                        }
                    }
                    if (annChanged) {
                        // Mark class as changed so it gets written
                        renames.put("__ann_only__", "__ann_only__"); // dummy to non-empty
                    }
                }

                String mapped = classMap.get(m.name);
                // For @Invoker/@Accessor: do NOT rename the method name — it's just a proxy name.
                // Only the annotation value needs to point to the correct intermediary method.
                // Renaming the method to the same name as the target causes infinite recursion.
                if ("Lorg/spongepowered/asm/mixin/gen/Invoker;".equals(shadow.desc) || "Lorg/spongepowered/asm/mixin/gen/Accessor;".equals(shadow.desc)) {
                    continue;
                }
                if (mapped != null && mapped.startsWith("method_") && !mapped.equals(m.name)) {
                    renames.put(m.name + m.desc, mapped);
                    renamedMethods++;
                    continue;
                }
                if (mapped == null) {
                    // No per-class refmap mapping — find by FULL signature (args + return type) in target class.
                    if (m.name.startsWith("method_") || m.name.startsWith("field_")) continue;
                    String targetInterm = findMixinTargetInterm(cn, classMap);
                    if (targetInterm != null) {
                        String fullDesc = remapDesc(m.desc, classMap);
                        String candidate = findMethodByFullDesc(targetInterm, fullDesc);
                        if (candidate != null && !candidate.equals(m.name) && candidate.startsWith("method_")) {
                            renames.put(m.name + m.desc, candidate);
                            renamedMethods++;
                            System.out.println("  " + p.getFileName() + " :: @Shadow method " + m.name + " (no refmap) -> " + candidate + " (by desc=" + fullDesc + ")");
                        }
                    }
                    continue;
                }
                if (mapped.equals(m.name) || !mapped.startsWith("method_")) continue;
                renames.put(m.name + m.desc, mapped);
            }
            if (renames.isEmpty()) continue;

            // Rename methods
            for (MethodNode m : cn.methods) {
                String key = m.name + m.desc;
                if (renames.containsKey(key)) m.name = renames.get(key);
            }

            // Update internal method refs (invokevirtual/invokespecial to this mixin class)
            for (MethodNode m : cn.methods) {
                if (m.instructions == null) continue;
                for (AbstractInsnNode n = m.instructions.getFirst(); n != null; n = n.getNext()) {
                    if (n instanceof MethodInsnNode min && min.owner.equals(cn.name)) {
                        String key = min.name + min.desc;
                        if (renames.containsKey(key)) {
                            min.name = renames.get(key);
                            refsUpdated++;
                        }
                    }
                }
            }

            ClassWriter cw = new ClassWriter(0);
            cn.accept(cw);
            byte[] out = cw.toByteArray();
            Files.write(p, out);
            Path bc = Path.of("build/classes/java/main/sg/mx/" + p.getFileName());
            if (Files.exists(bc)) Files.write(bc, out);
            patchedClasses++;
            for (var e : renames.entrySet()) {
                System.out.println("  " + p.getFileName() + " :: @Shadow method " + e.getKey() + " -> " + e.getValue());
            }
        }
        System.out.println("Renamed " + renamedMethods + " @Shadow methods in " + patchedClasses + " classes, updated " + refsUpdated + " method refs");
    }

    static boolean isUniqueByArgs(String targetInterm, String argsPrefix) {
        Map<String, List<String>> byArgs = mcMethodsByArgs.get(targetInterm);
        if (byArgs == null) return false;
        List<String> names = byArgs.get(argsPrefix);
        return names != null && names.size() == 1;
    }

    static String findMethodByFullDesc(String targetInterm, String fullDesc) {
        Map<String, List<String>> byDesc = mcMethodsByDesc.get(targetInterm);
        if (byDesc == null) return null;
        List<String> names = byDesc.get(fullDesc);
        if (names == null || names.isEmpty()) return null;
        for (String n : names) if (n.startsWith("method_")) return n;
        return names.get(0);
    }

    static boolean isUniqueByFullDesc(String targetInterm, String fullDesc) {
        Map<String, List<String>> byDesc = mcMethodsByDesc.get(targetInterm);
        if (byDesc == null) return false;
        List<String> names = byDesc.get(fullDesc);
        return names != null && names.size() == 1;
    }

    static String findMixinTarget(ClassNode cn, Map<String, String> classMap) {
        String interm = findMixinTargetInterm(cn, classMap);
        if (interm == null) return null;
        // Convert intermediary back to named for globalMethodMappings lookup
        for (var e : globalNamedToInterm.entrySet()) {
            if (e.getValue().equals(interm)) return e.getKey();
        }
        return null;
    }

    static String findMixinTargetNamed(ClassNode cn, Map<String, String> classMap) {
        return findMixinTarget(cn, classMap);
    }

    static String findMixinTargetInterm(ClassNode cn, Map<String, String> classMap) {
        for (List<AnnotationNode> anns : java.util.Arrays.asList(cn.visibleAnnotations, cn.invisibleAnnotations)) {
            if (anns == null) continue;
            for (AnnotationNode an : anns) {
                if (!"Lorg/spongepowered/asm/mixin/Mixin;".equals(an.desc) || an.values == null) continue;
                for (int i = 0; i < an.values.size(); i += 2) {
                    if (!"value".equals(an.values.get(i))) continue;
                    Object v = an.values.get(i + 1);
                    if (v instanceof List<?> list && !list.isEmpty()) {
                        Object first = list.get(0);
                        String cls = null;
                        if (first instanceof String s) cls = s;
                        else if (first instanceof org.objectweb.asm.Type t) cls = t.getDescriptor();
                        if (cls != null) {
                            if (cls.startsWith("L") && cls.endsWith(";")) cls = cls.substring(1, cls.length() - 1);
                            if (classMap.containsKey(cls)) cls = classMap.get(cls);
                            return cls;
                        }
                    }
                }
            }
        }
        return null;
    }

    static String findMethodByArgs(String targetInterm, String argsPrefix) {
        Map<String, List<String>> byArgs = mcMethodsByArgs.get(targetInterm);
        if (byArgs == null) return null;
        List<String> names = byArgs.get(argsPrefix);
        if (names == null || names.isEmpty()) return null;
        for (String n : names) if (n.startsWith("method_")) return n;
        return names.get(0);
    }

    static String extractArgs(String handlerDesc, Map<String, String> classMap) {
        int paren = handlerDesc.indexOf(')');
        if (paren < 0) return null;
        String args = handlerDesc.substring(0, paren);
        List<String> argTypes = new ArrayList<>();
        int i = 1;
        while (i < args.length()) {
            char c = args.charAt(i);
            if (c == 'L') { int end = args.indexOf(';', i); argTypes.add(args.substring(i, end + 1)); i = end + 1; }
            else if (c == '[') { StringBuilder arr = new StringBuilder(); while (args.charAt(i) == '[') { arr.append('['); i++; } if (args.charAt(i) == 'L') { int end = args.indexOf(';', i); arr.append(args.substring(i, end + 1)); i = end + 1; } else { arr.append(args.charAt(i)); i++; } argTypes.add(arr.toString()); }
            else { argTypes.add(String.valueOf(c)); i++; }
        }
        StringBuilder sb = new StringBuilder("(");
        for (String a : argTypes) sb.append(remapDesc(a, classMap));
        sb.append(")");
        return sb.toString();
    }

    static String remapDesc(String desc, Map<String, String> classMap) {
        if (desc == null) return desc;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < desc.length()) {
            char c = desc.charAt(i);
            if (c == 'L') {
                int end = desc.indexOf(';', i);
                String cls = desc.substring(i + 1, end);
                String mapped = classMap != null ? classMap.get(cls) : null;
                if (mapped == null) mapped = globalNamedToInterm.get(cls);
                if (mapped != null) cls = mapped;
                sb.append('L').append(cls).append(';');
                i = end + 1;
            } else { sb.append(c); i++; }
        }
        return sb.toString();
    }

    static void loadMinecraft(String jarPath) throws Exception {
        try (ZipFile zf = new ZipFile(jarPath)) {
            for (var e = zf.entries(); e.hasMoreElements(); ) {
                var en = e.nextElement();
                if (!en.getName().endsWith(".class")) continue;
                try {
                    ClassReader cr = new ClassReader(zf.getInputStream(en).readAllBytes());
                    String name = cr.getClassName();
                    Map<String, List<String>> byArgs = new HashMap<>();
                    Map<String, List<String>> byDesc = new HashMap<>();
                    cr.accept(new ClassVisitor(Opcodes.ASM9) {
                        @Override public MethodVisitor visitMethod(int access, String name, String desc, String sig, String[] ex) {
                            int paren = desc.indexOf(')');
                            String argsPrefix = desc.substring(0, paren + 1);
                            byArgs.computeIfAbsent(argsPrefix, k -> new ArrayList<>()).add(name);
                            byDesc.computeIfAbsent(desc, k -> new ArrayList<>()).add(name);
                            return null;
                        }
                    }, ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
                    mcMethodsByArgs.put(name, byArgs);
                    mcMethodsByDesc.put(name, byDesc);
                } catch (Exception ex) {}
            }
        }
    }

    @SuppressWarnings("unchecked")
    static void loadRefmap(Path p) throws Exception {
        String json = Files.readString(p, StandardCharsets.UTF_8);
        refmapMappings = new HashMap<>();
        int mIdx = json.indexOf("\"mappings\"");
        if (mIdx < 0) { System.out.println("no mappings key in refmap"); return; }
        int objStart = json.indexOf('{', mIdx);
        int objEnd = matchingBrace(json, objStart);
        String mappingsObj = json.substring(objStart + 1, objEnd);
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
                if (key.contains("/") && val.contains("/") && (val.startsWith("net/minecraft/class_") || val.startsWith("com/mojang/") || val.startsWith("net/fabricmc/"))) {
                    globalNamedToInterm.put(key, val);
                }
                j = vq2 + 1;
            }
            refmapMappings.put(className, classMap);
            i = cEnd + 1;
        }
    }

    static void loadMappingsTiny(Path p) throws Exception {
        // Parse tiny v2: class lines "c\tintermediary\tnamed", method lines "m\tdesc\tintermediaryMethod\tnamedMethod"
        String currentClassNamed = null;
        Map<String, String> currentMethodMap = null;
        for (String line : Files.readAllLines(p, StandardCharsets.UTF_8)) {
            if (line.startsWith("c\t")) {
                // Save previous class methods
                if (currentClassNamed != null && currentMethodMap != null) {
                    globalMethodMappings.put(currentClassNamed, currentMethodMap);
                }
                String[] parts = line.split("\t");
                if (parts.length >= 3) {
                    globalNamedToInterm.put(parts[2], parts[1]);
                    currentClassNamed = parts[2];
                    currentMethodMap = new HashMap<>();
                }
            } else if (line.startsWith("\tm\t") && currentMethodMap != null) {
                String[] parts = line.split("\t");
                // parts[0]="" (leading tab), parts[1]="m", parts[2]=desc, parts[3]=intermMethod, parts[4]=namedMethod
                if (parts.length >= 5) {
                    currentMethodMap.put(parts[4], parts[3]); // named method -> intermediary method
                }
            }
        }
        if (currentClassNamed != null && currentMethodMap != null) {
            globalMethodMappings.put(currentClassNamed, currentMethodMap);
        }
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
