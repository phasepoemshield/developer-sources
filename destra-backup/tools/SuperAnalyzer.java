import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class SuperAnalyzer {
    static Map<String, ClassNode> allClasses = new HashMap<>();
    static Map<String, String> issues = new LinkedHashMap<>();
    static int totalIssues = 0;

    public static void main(String[] args) throws Exception {
        String root = args.length > 0 ? args[0] : ".precompiled/ru/destra";
        // Phase 1: load ALL destra classes
        Files.walk(Path.of(root)).filter(p -> p.toString().endsWith(".class")).forEach(p -> {
            try {
                ClassNode cn = new ClassNode();
                new ClassReader(Files.readAllBytes(p)).accept(cn, ClassReader.SKIP_FRAMES);
                allClasses.put(cn.name, cn);
            } catch (Exception e) { System.err.println("LOAD FAIL " + p + ": " + e.getMessage()); }
        });
        System.out.println("Loaded " + allClasses.size() + " destra classes from " + root);

        // Phase 2: analyze each MODULE class
        List<ClassNode> modules = new ArrayList<>();
        for (ClassNode cn : allClasses.values()) {
            if (isModule(cn)) modules.add(cn);
        }
        modules.sort(Comparator.comparing(c -> c.name));
        System.out.println("Module classes: " + modules.size() + "\n");

        for (ClassNode m : modules) analyzeModule(m);

        System.out.println("\n================== SUMMARY ==================");
        System.out.println("Total issues: " + totalIssues);
        System.out.println(issues.toString().replace(",", ",\n"));
    }

    static boolean isModule(ClassNode cn) {
        String s = cn.superName;
        while (s != null && allClasses.containsKey(s)) {
            if (s.equals("ru/destra/core/Module") || s.equals("ru/destra/module/HudModule")) return true;
            s = allClasses.get(s).superName;
        }
        return false;
    }

    static void issue(String key, String msg) {
        totalIssues++;
        issues.merge(key, msg, (a, b) -> a + "\n      " + b);
    }

    static void analyzeModule(ClassNode cn) {
        String name = cn.name.replace('/', '.');
        StringBuilder sb = new StringBuilder();
        int mc = 0; // module issue count

        // 1. Superclass
        String sup = cn.superName == null ? "-" : cn.superName.replace('/', '.');

        // 2. Collect <clinit> static String field values
        Map<String, String> staticStr = new HashMap<>();
        Map<String, String> staticStrQual = new HashMap<>(); // quality
        for (MethodNode m : cn.methods) {
            if (!m.name.equals("<clinit>")) continue;
            for (int i = 0; i < m.instructions.size(); i++) {
                AbstractInsnNode n = m.instructions.get(i);
                if (n instanceof LdcInsnNode ldc && ldc.cst instanceof String s) {
                    if (i + 1 < m.instructions.size() && m.instructions.get(i + 1) instanceof FieldInsnNode fin && fin.getOpcode() == Opcodes.PUTSTATIC) {
                        String qual = classifyStr(s);
                        staticStr.put(fin.name, s);
                        staticStrQual.put(fin.name, qual);
                    }
                }
            }
        }

        // 3. Constructor: trace setting creation and name args
        int nNum = 0, nBool = 0, nMode = 0, nGroup = 0, nOther = 0;
        int nullNameSettings = 0;
        List<String> nullNameFields = new ArrayList<>();
        List<String> mojibakeNameFields = new ArrayList<>();
        for (MethodNode m : cn.methods) {
            if (!m.name.equals("<init>")) continue;
            for (int i = 0; i < m.instructions.size(); i++) {
                AbstractInsnNode n = m.instructions.get(i);
                if (n instanceof MethodInsnNode min && min.name.equals("<init>")) {
                    String typ = min.owner.replace('/', '.');
                    if (typ.endsWith("NumberSetting")) nNum++;
                    else if (typ.endsWith("BooleanSetting")) nBool++;
                    else if (typ.endsWith("ModeSetting")) nMode++;
                    else if (typ.endsWith("SettingGroup")) nGroup++;
                    else if (typ.endsWith("Setting") && !typ.endsWith("NumberSetting") && !typ.endsWith("BooleanSetting") && !typ.endsWith("ModeSetting") && !typ.endsWith("SettingGroup")) nOther++;
                    // Check the name arg: it's typically the getstatic/ldc right before the (module/group) arg
                    String nameArg = traceNameArg(m, i, min.desc);
                    if (nameArg != null && (nameArg.equals("NULL") || nameArg.equals("MOJIBAKE") || nameArg.equals("BLANK"))) {
                        // identify which field is being initialized: look for putfield after invokespecial
                        String fld = tracePutFieldAfter(m, i);
                        if (nameArg.equals("NULL")) { nullNameSettings++; nullNameFields.add(fld); }
                        else mojibakeNameFields.add(fld + "(" + nameArg + ")");
                    }
                }
            }
        }

        // 4. invokedynamic count
        int indy = 0;
        for (MethodNode m : cn.methods) {
            for (int i = 0; i < m.instructions.size(); i++) {
                if (m.instructions.get(i) instanceof InvokeDynamicInsnNode) indy++;
            }
        }

        // 5. @Subscribe methods
        int subs = 0;
        for (MethodNode m : cn.methods) {
            if (m.visibleAnnotations != null) {
                for (AnnotationNode a : m.visibleAnnotations) {
                    if (a.desc != null && a.desc.contains("Subscribe")) subs++;
                }
            }
        }

        // 6. References to missing destra classes
        List<String> missing = new ArrayList<>();
        for (MethodNode m : cn.methods) {
            for (int i = 0; i < m.instructions.size(); i++) {
                AbstractInsnNode n = m.instructions.get(i);
                if (n instanceof MethodInsnNode min && min.owner.startsWith("ru/destra/") && !allClasses.containsKey(min.owner) && !missing.contains(min.owner)) {
                    missing.add(min.owner.replace('/', '.'));
                }
                if (n instanceof TypeInsnNode tin && tin.desc.startsWith("ru/destra/") && !allClasses.containsKey(tin.desc.replace('/','.')) && !missing.contains(tin.desc)) {
                    missing.add(tin.desc.replace('/', '.'));
                }
            }
        }

        // 7. onRender2D / onRender3D presence (HUD modules)
        boolean hasRender2D = false, hasRender3D = false;
        for (MethodNode m : cn.methods) {
            if (m.name.equals("onRender2D")) hasRender2D = true;
            if (m.name.equals("onRender3D")) hasRender3D = true;
        }

        // Report
        sb.append("  super=").append(sup);
        sb.append("  settings: N=").append(nNum).append(" B=").append(nBool).append(" M=").append(nMode).append(" G=").append(nGroup).append(" O=").append(nOther);
        sb.append("  indy=").append(indy).append("  @Sub=").append(subs);
        sb.append("  r2D=").append(hasRender2D).append(" r3D=").append(hasRender3D);
        System.out.println("[" + name + "]");
        System.out.println(sb);

        if (nullNameSettings > 0) {
            System.out.println("    !! NULL-NAME SETTINGS: " + nullNameSettings + " -> " + nullNameFields);
            issue(name, "NULL-NAME settings: " + nullNameFields);
            mc++;
        }
        if (!mojibakeNameFields.isEmpty()) {
            System.out.println("    ~  mojibake/blank-name settings: " + mojibakeNameFields.size() + " " + mojibakeNameFields);
            mc++;
        }
        if (!missing.isEmpty()) {
            System.out.println("    !! MISSING DEPS: " + missing);
            issue(name, "Missing class refs: " + missing);
            mc++;
        }
        // Check static str fields that are read in constructor but never set in clinit
        // (detected via nullNameFields above). Also check clinit for null ldc (shouldn't happen).
        if (mc == 0) System.out.println("    ok");
    }

    // Trace the name argument for a setting <init> call.
    // Setting ctors: (String name, ...). The name is the FIRST arg.
    // We scan backwards from the callsite to find what loaded the first arg.
    static String traceNameArg(MethodNode m, int callIdx, String desc) {
        // Parse first arg type from desc
        int paren = desc.indexOf(')');
        if (paren < 0 || desc.length() < 2) return null;
        char first = desc.charAt(1);
        if (first != 'L' && first != '[') return null; // first arg not a reference (String)
        // Walk backwards counting stack slots to find the instruction that pushed arg0
        // Simulate a simple backward scan: find the nearest Ldc or GetStatic that could be the String arg
        // This is approximate; we look back up to ~12 instructions for a Ldc-String or GetStatic whose result
        // flows into position 0 of the call.
        // Heuristic: the name is usually loaded right before the second arg (module/group bool/etc).
        // For BooleanSetting(group): (String, SettingGroup, Z) -> name pushed, then getfield modeGroup, then iconst -> name is 3rd from top
        // For BooleanSetting(module): (String, Module, Z) -> name, aload_0, iconst
        // For NumberSetting: (String, Module, FFFF) -> name, aload_0, fconst...
        // For ModeSetting: (String, Module, [String]) -> name, aload_0, anewarray, ..., aastore
        // For SettingGroup: (String, Module) -> name, aload_0
        // Simplest: scan back, collect Ldc-String and GetStatic entries; the FIRST one encountered
        // going backwards past aload_0 (the module) is the name.
        int aload0seen = 0;
        for (int i = callIdx - 1; i >= 0 && i > callIdx - 20; i--) {
            AbstractInsnNode n = m.instructions.get(i);
            if (n instanceof VarInsnNode vn && vn.getOpcode() == Opcodes.ALOAD && vn.var == 0) { aload0seen++; continue; }
            if (n instanceof FieldInsnNode fin && fin.getOpcode() == Opcodes.GETSTATIC && fin.desc.equals("Ljava/lang/String;")) {
                // is this field set in clinit? We'd need clinit map; return marker
                return "GETSTATIC:" + fin.name;
            }
            if (n instanceof LdcInsnNode ldc && ldc.cst instanceof String s) {
                return classifyStr(s) + ":\"" + abbrev(s) + "\"";
            }
            if (n instanceof InsnNode in && in.getOpcode() == Opcodes.ACONST_NULL) {
                return "NULL";
            }
        }
        return null;
    }

    // Find the putfield right after a setting <init> (the field being initialized)
    static String tracePutFieldAfter(MethodNode m, int callIdx) {
        for (int i = callIdx + 1; i < m.instructions.size() && i < callIdx + 4; i++) {
            AbstractInsnNode n = m.instructions.get(i);
            if (n instanceof FieldInsnNode fin && fin.getOpcode() == Opcodes.PUTFIELD) return fin.name;
        }
        return "?";
    }

    static String classifyStr(String s) {
        if (s == null) return "NULL";
        if (s.isBlank()) return "BLANK";
        // mojibake detection: contains replacement char or high ratio of non-printable/non-latin
        int bad = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '\ufffd') bad++;
            else if (c > 0xFFFD) bad++;
        }
        if (bad > 0) return "MOJIBAKE";
        return "OK";
    }

    static String abbrev(String s) {
        String r = s.length() > 30 ? s.substring(0, 30) + "…" : s;
        return r.replace("\n", "\\n");
    }
}
