import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.zip.*;

public final class ScanAllMixinIssues {
    // minecraft intermediary: className -> {methods: name+desc -> exists, fields: name -> desc}
    static Map<String, McClass> mcClasses = new HashMap<>();
    static Map<String, Map<String, String>> refmap;

    static class McClass {
        String name;
        String superName;
        Set<String> methods = new HashSet<>(); // "name+desc"
        Set<String> methodNames = new HashSet<>();
        Map<String, String> fields = new HashMap<>(); // name -> desc
    }

    public static void main(String[] args) throws Exception {
        String mcJar = System.getProperty("mc.jar");
        if (mcJar == null || !Files.exists(Path.of(mcJar))) {
            System.out.println("mc.jar not found: " + mcJar);
            return;
        }
        loadMinecraft(mcJar);
        loadRefmap(Path.of("build/refmap-merged.json"));
        System.out.println("MC classes: " + mcClasses.size() + ", refmap entries: " + refmap.size());

        Path dir = Path.of(System.getProperty("scan.dir", ".precompiled/sg/mx"));
        List<Path> classes = new ArrayList<>();
        try (var s = Files.list(dir)) { s.filter(p -> p.toString().endsWith(".class")).forEach(classes::add); }
        Collections.sort(classes);

        int issues = 0;
        for (Path p : classes) {
            ClassNode cn = new ClassNode();
            new ClassReader(Files.readAllBytes(p)).accept(cn, ClassReader.SKIP_CODE | ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
            String mixinName = cn.name;
            Map<String, String> classMap = refmap.get(mixinName);

            // Find @Mixin target
            String targetInterm = null;
            if (cn.visibleAnnotations != null) {
                for (AnnotationNode an : cn.visibleAnnotations) {
                    if ("Lorg/spongepowered/asm/mixin/Mixin;".equals(an.desc) && an.values != null) {
                        for (int i = 0; i < an.values.size(); i += 2) {
                            if ("value".equals(an.values.get(i))) {
                                Object v = an.values.get(i + 1);
                                if (v instanceof List<?> list && !list.isEmpty() && list.get(0) instanceof String s) {
                                    // s is like "Lnet/minecraft/class_310;" or named
                                    String cls = s;
                                    if (cls.startsWith("L") && cls.endsWith(";")) cls = cls.substring(1, cls.length() - 1);
                                    if (classMap != null && classMap.containsKey(cls)) cls = classMap.get(cls);
                                    targetInterm = cls;
                                }
                            }
                        }
                    }
                }
            }
            if (targetInterm == null) continue;
            McClass target = resolveMcClass(targetInterm);
            if (target == null) {
                System.out.println("ISSUE " + p.getFileName() + ": @Mixin target not found: " + targetInterm);
                issues++;
                continue;
            }

            // Check @Shadow fields
            for (FieldNode f : cn.fields) {
                if (f.visibleAnnotations == null) continue;
                boolean isShadow = false;
                for (AnnotationNode a : f.visibleAnnotations) if ("Lorg/spongepowered/asm/mixin/Shadow;".equals(a.desc)) { isShadow = true; break; }
                if (!isShadow) continue;
                String mapped = classMap != null ? classMap.get(f.name) : null;
                String lookupName = mapped != null ? mapped : f.name;
                // resolve field desc to intermediary (field desc uses named classes, remap)
                String intermDesc = remapDesc(f.desc, classMap);
                // walk up hierarchy
                boolean found = false;
                McClass cc = target;
                while (cc != null) {
                    String fd = cc.fields.get(lookupName);
                    if (fd != null) { found = true; break; }
                    cc = cc.superName != null ? resolveMcClass(cc.superName) : null;
                }
                if (!found) {
                    System.out.println("ISSUE " + p.getFileName() + ": @Shadow field " + f.name + " (->" + lookupName + ") not in " + targetInterm);
                    issues++;
                }
            }

            // Check @Shadow methods
            for (MethodNode m : cn.methods) {
                if (m.visibleAnnotations == null) continue;
                boolean isShadow = false;
                for (AnnotationNode a : m.visibleAnnotations) if ("Lorg/spongepowered/asm/mixin/Shadow;".equals(a.desc)) { isShadow = true; break; }
                if (!isShadow) continue;
                String mapped = classMap != null ? classMap.get(m.name) : null;
                String lookupName = mapped != null ? mapped : m.name;
                String intermDesc = remapDesc(m.desc, classMap);
                boolean found = false;
                McClass cc = target;
                while (cc != null) {
                    if (cc.methods.contains(lookupName + intermDesc)) { found = true; break; }
                    cc = cc.superName != null ? resolveMcClass(cc.superName) : null;
                }
                if (!found) {
                    System.out.println("ISSUE " + p.getFileName() + ": @Shadow method " + m.name + " (->" + lookupName + ")" + intermDesc + " not in " + targetInterm);
                    issues++;
                }
            }

            // Check @Inject methods
            for (MethodNode m : cn.methods) {
                if (m.visibleAnnotations == null) continue;
                for (AnnotationNode a : m.visibleAnnotations) {
                    if (!"Lorg/spongepowered/asm/mixin/injection/Inject;".equals(a.desc)) continue;
                    String targetMethod = null;
                    if (a.values != null) {
                        for (int i = 0; i < a.values.size(); i += 2) {
                            if ("method".equals(a.values.get(i))) {
                                Object v = a.values.get(i + 1);
                                if (v instanceof List<?> list && !list.isEmpty() && list.get(0) instanceof String s) targetMethod = s;
                            }
                        }
                    }
                    if (targetMethod == null) continue;
                    String mapped = classMap != null ? classMap.get(targetMethod) : null;
                    String lookupName = mapped != null ? mapped : targetMethod;
                    String handlerDesc = m.desc;
                    String argsPart = extractArgs(handlerDesc, classMap); // "(arg1arg2...argN)" without CallbackInfo
                    if (argsPart == null) continue;
                    // Match: target method with name=lookupName and desc starting with argsPart (return type may differ for CIR)
                    boolean found = false;
                    McClass cc = target;
                    while (cc != null) {
                        for (String md : cc.methods) {
                            if (md.startsWith(lookupName + argsPart)) { found = true; break; }
                        }
                        if (found) break;
                        cc = cc.superName != null ? resolveMcClass(cc.superName) : null;
                    }
                    if (!found) {
                        boolean nameExists = false;
                        McClass cc2 = target;
                        while (cc2 != null) {
                            if (cc2.methodNames.contains(lookupName)) { nameExists = true; break; }
                            cc2 = cc2.superName != null ? resolveMcClass(cc2.superName) : null;
                        }
                        if (nameExists) {
                            System.out.println("ISSUE " + p.getFileName() + ": @Inject " + targetMethod + " (->" + lookupName + ") desc/arg mismatch. Expected args=" + argsPart + " in " + targetInterm);
                        } else {
                            System.out.println("ISSUE " + p.getFileName() + ": @Inject " + targetMethod + " (->" + lookupName + ") method not in " + targetInterm);
                        }
                        issues++;
                    }
                }
            }
        }
        System.out.println("\n=== TOTAL ISSUES: " + issues + " ===");
    }

    static McClass resolveMcClass(String name) {
        return mcClasses.get(name);
    }

    static String remapDesc(String desc, Map<String, String> classMap) {
        if (desc == null || classMap == null) return desc;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < desc.length()) {
            char c = desc.charAt(i);
            if (c == 'L') {
                int end = desc.indexOf(';', i);
                String cls = desc.substring(i + 1, end);
                String mapped = classMap.get(cls);
                if (mapped != null) cls = mapped;
                sb.append('L').append(cls).append(';');
                i = end + 1;
            } else { sb.append(c); i++; }
        }
        return sb.toString();
    }

    // From handler desc (args..., CallbackInfo/CIR)V extract the target method args "(arg1arg2...argN)"
    // without the trailing CallbackInfo/CallbackInfoReturnable. Returns "(args)" or null.
    static String extractArgs(String handlerDesc, Map<String, String> classMap) {
        int paren = handlerDesc.indexOf(')');
        if (paren < 0) return null;
        String args = handlerDesc.substring(0, paren); // "(arg1arg2..."
        List<String> argTypes = new ArrayList<>();
        int i = 1; // skip (
        while (i < args.length()) {
            char c = args.charAt(i);
            if (c == 'L') {
                int end = args.indexOf(';', i);
                argTypes.add(args.substring(i, end + 1));
                i = end + 1;
            } else if (c == '[') {
                StringBuilder arr = new StringBuilder();
                while (args.charAt(i) == '[') { arr.append('['); i++; }
                if (args.charAt(i) == 'L') {
                    int end = args.indexOf(';', i);
                    arr.append(args.substring(i, end + 1));
                    i = end + 1;
                } else { arr.append(args.charAt(i)); i++; }
                argTypes.add(arr.toString());
            } else {
                argTypes.add(String.valueOf(c));
                i++;
            }
        }
        if (argTypes.isEmpty()) return null;
        String last = argTypes.get(argTypes.size() - 1);
        if (!last.contains("CallbackInfo")) return null;
        argTypes.remove(argTypes.size() - 1);
        StringBuilder target = new StringBuilder("(");
        for (String a : argTypes) target.append(remapDesc(a, classMap));
        target.append(")");
        return target.toString();
    }

    @SuppressWarnings("unchecked")
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
                            mc.methods.add(name + desc);
                            mc.methodNames.add(name);
                            return null;
                        }
                        @Override public FieldVisitor visitField(int access, String name, String desc, String sig, Object value) {
                            mc.fields.put(name, desc);
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
        if (!Files.exists(p)) { System.out.println("refmap not found"); return; }
        String json = Files.readString(p, StandardCharsets.UTF_8);
        int mIdx = json.indexOf("\"mappings\"");
        if (mIdx < 0) return;
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
                j = vq2 + 1;
            }
            refmap.put(className, classMap);
            i = cEnd + 1;
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
