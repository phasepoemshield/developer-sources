import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.zip.*;

public final class PatchStaleInjectTargets {
    static Map<String, McClass> mcClasses = new HashMap<>();
    static Map<String, Map<String, String>> refmap;
    static Map<String, String> globalNamedToInterm = new HashMap<>(); // named class -> intermediary

    static class McClass {
        String name, superName;
        // args-desc-prefix -> list of method names (methods with those args)
        Map<String, List<String>> methodsByArgs = new HashMap<>();
        Set<String> allMethodNames = new HashSet<>();
    }

    public static void main(String[] args) throws Exception {
        String mcJar = System.getProperty("mc.jar");
        if (mcJar == null || !Files.exists(Path.of(mcJar))) { System.out.println("mc.jar not found"); return; }
        loadMinecraft(mcJar);
        loadRefmap(Path.of("build/refmap-merged.json"));
        System.out.println("MC classes: " + mcClasses.size() + ", refmap: " + refmap.size());

        Path dir = Path.of(".precompiled/sg/mx");
        List<Path> classes = new ArrayList<>();
        try (var s = Files.list(dir)) { s.filter(p -> p.toString().endsWith(".class")).forEach(classes::add); }
        Collections.sort(classes);

        int fixed = 0, skipped = 0, noCandidate = 0;
        for (Path p : classes) {
            byte[] data = Files.readAllBytes(p);
            ClassReader cr = new ClassReader(data);
            ClassNode cn = new ClassNode();
            cr.accept(cn, 0);
            Map<String, String> classMap = refmap.get(cn.name);

            String targetInterm = findMixinTarget(cn, classMap);
            if (targetInterm == null) continue;

            boolean changed = false;
            for (MethodNode m : cn.methods) {
                if (m.visibleAnnotations == null) continue;
                for (AnnotationNode a : m.visibleAnnotations) {
                    if (!"Lorg/spongepowered/asm/mixin/injection/Inject;".equals(a.desc)) continue;
                    String targetMethod = null;
                    int methodIdx = -1;
                    boolean hasRequire0 = false;
                    if (a.values != null) {
                        for (int i = 0; i < a.values.size(); i += 2) {
                            if ("method".equals(a.values.get(i))) {
                                Object v = a.values.get(i + 1);
                                if (v instanceof List<?> list && !list.isEmpty() && list.get(0) instanceof String s) { targetMethod = s; methodIdx = i + 1; }
                            }
                            if ("require".equals(a.values.get(i))) {
                                Object v = a.values.get(i + 1);
                                if (v instanceof Integer ii && ii == 0) hasRequire0 = true;
                            }
                        }
                    }
                    if (targetMethod == null || !hasRequire0) continue; // only fix require=0 ones

                    String mapped = classMap != null ? classMap.get(targetMethod) : null;
                    String lookupName = mapped != null ? mapped : targetMethod;

                    // Already valid?
                    McClass tc = resolveWithSuper(targetInterm);
                    if (tc != null && tc.allMethodNames.contains(lookupName)) continue;

                    // Find candidate by args signature
                    String argsPrefix = extractArgs(m.desc, classMap); // "(args...)"
                    if (argsPrefix == null) continue;
                    String candidate = findMethodByArgs(targetInterm, argsPrefix);
                    if (candidate == null) { noCandidate++; continue; }
                    if (candidate.equals(lookupName)) continue; // already correct

                    // Update the method annotation: replace targetMethod with candidate (intermediary name)
                    // The annotation method value is a List<String>; update first element
                    Object v = a.values.get(methodIdx);
                    if (v instanceof List<?> list) {
                        @SuppressWarnings("unchecked") List<Object> ll = (List<Object>) list;
                        ll.set(0, candidate);
                    }
                    changed = true;
                    fixed++;
                    System.out.println("  " + p.getFileName() + " :: @Inject " + targetMethod + " (->" + lookupName + ") -> " + candidate + " (args=" + argsPrefix + ")");
                }
            }

            if (changed) {
                ClassWriter cw = new ClassWriter(0);
                cn.accept(cw);
                byte[] out = cw.toByteArray();
                Files.write(p, out);
                Path bc = Path.of("build/classes/java/main/sg/mx/" + p.getFileName());
                if (Files.exists(bc)) Files.write(bc, out);
            }
        }
        System.out.println("Fixed " + fixed + " stale inject targets, no candidate for " + noCandidate);
    }

    static String findMethodByArgs(String targetInterm, String argsPrefix) {
        McClass cc = resolveWithSuper(targetInterm);
        while (cc != null) {
            List<String> names = cc.methodsByArgs.get(argsPrefix);
            if (names != null && !names.isEmpty()) {
                // Prefer method_ names (intermediary), return first
                for (String n : names) if (n.startsWith("method_")) return n;
                return names.get(0);
            }
            cc = cc.superName != null ? resolveWithSuper(cc.superName) : null;
        }
        return null;
    }

    static McClass resolveWithSuper(String name) { return mcClasses.get(name); }

    static String findMixinTarget(ClassNode cn, Map<String, String> classMap) {
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
                            if (classMap != null && classMap.containsKey(cls)) cls = classMap.get(cls);
                            return cls;
                        }
                    }
                }
            }
        }
        return null;
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
        if (argTypes.isEmpty()) return null;
        String last = argTypes.get(argTypes.size() - 1);
        if (!last.contains("CallbackInfo")) return null;
        argTypes.remove(argTypes.size() - 1);
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
                    McClass mc = new McClass();
                    mc.name = cr.getClassName();
                    mc.superName = cr.getSuperName();
                    cr.accept(new ClassVisitor(Opcodes.ASM9) {
                        @Override public MethodVisitor visitMethod(int access, String name, String desc, String sig, String[] ex) {
                            mc.allMethodNames.add(name);
                            int paren = desc.indexOf(')');
                            String argsPrefix = desc.substring(0, paren + 1); // "(args...)"
                            mc.methodsByArgs.computeIfAbsent(argsPrefix, k -> new ArrayList<>()).add(name);
                            return null;
                        }
                    }, ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
                    mcClasses.put(mc.name, mc);
                } catch (Exception ex) {}
            }
        }
    }

    static void loadRefmap(Path p) throws Exception {
        refmap = new HashMap<>();
        if (!Files.exists(p)) return;
        String json = Files.readString(p, StandardCharsets.UTF_8);
        int mIdx = json.indexOf("\"mappings\"");
        if (mIdx < 0) return;
        int objStart = json.indexOf('{', mIdx);
        int objEnd = matchingBrace(json, objStart);
        String mappingsObj = json.substring(objStart + 1, objEnd);
        int i = 0;
        while (i < mappingsObj.length()) {
            int q1 = mappingsObj.indexOf('"', i); if (q1 < 0) break;
            int q2 = mappingsObj.indexOf('"', q1 + 1);
            String className = mappingsObj.substring(q1 + 1, q2);
            int cBrace = mappingsObj.indexOf('{', q2);
            int cEnd = matchingBrace(mappingsObj, cBrace);
            String classBody = mappingsObj.substring(cBrace + 1, cEnd);
            Map<String, String> classMap = new HashMap<>();
            int j = 0;
            while (j < classBody.length()) {
                int kq1 = classBody.indexOf('"', j); if (kq1 < 0) break;
                int kq2 = classBody.indexOf('"', kq1 + 1);
                String key = classBody.substring(kq1 + 1, kq2);
                int vq1 = classBody.indexOf('"', kq2 + 1);
                int vq2 = classBody.indexOf('"', vq1 + 1);
                String val = classBody.substring(vq1 + 1, vq2);
                classMap.put(key, val);
                j = vq2 + 1;
            }
            refmap.put(className, classMap);
            // Also populate global named->intermediary map (className here is the slashed mixin name,
            // but classMap values include "named/path" -> "intermediary/path" class mappings)
            for (var e : classMap.entrySet()) {
                if (e.getValue().startsWith("net/minecraft/class_") || e.getValue().startsWith("net/minecraft/") == false) {
                    // Only class mappings (contain /), skip method/field mappings (method_XXX, field_XXX, comp_XXX)
                    if (e.getKey().contains("/") && e.getValue().contains("/")) {
                        globalNamedToInterm.put(e.getKey(), e.getValue());
                    }
                }
            }
            i = cEnd + 1;
        }
    }

    static int matchingBrace(String s, int open) {
        int depth = 0;
        for (int k = open; k < s.length(); k++) { char c = s.charAt(k); if (c == '{') depth++; else if (c == '}') { depth--; if (depth == 0) return k; } }
        return s.length() - 1;
    }
}
