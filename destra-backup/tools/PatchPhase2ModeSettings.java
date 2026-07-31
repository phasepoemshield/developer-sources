import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;

/**
 * Phase-2: for each *Module with a collapsed ModeSetting (identical mode LDCs),
 * try to recover distinct labels from ModeSetting.is(getstatic FIELD) where FIELD
 * is initialized in <clinit> to a String. If we collect exactly N distinct labels
 * for an N-mode setting, rewrite the ctor LDCs.
 */
public final class PatchPhase2ModeSettings {
    public static void main(String[] args) throws Exception {
        Path dir = Path.of(".precompiled/ru/destra/module");
        int fixedModules = 0;
        try (var stream = Files.list(dir)) {
            for (Path p : stream.filter(x -> x.getFileName().toString().endsWith("Module.class")).sorted().toList()) {
                if (patchFile(p)) fixedModules++;
            }
        }
        System.out.println("PatchPhase2ModeSettings: fixed " + fixedModules + " module file(s)");
    }

    static boolean patchFile(Path p) throws Exception {
        ClassNode cn = new ClassNode();
        new ClassReader(Files.readAllBytes(p)).accept(cn, 0);

        Map<String, String> staticStrings = new HashMap<>();
        for (MethodNode mn : cn.methods) {
            if (!"<clinit>".equals(mn.name)) continue;
            AbstractInsnNode[] insns = mn.instructions.toArray();
            for (int i = 0; i < insns.length - 1; i++) {
                if (insns[i] instanceof LdcInsnNode ldc && ldc.cst instanceof String
                        && insns[i + 1] instanceof FieldInsnNode fin
                        && fin.getOpcode() == Opcodes.PUTSTATIC
                        && "Ljava/lang/String;".equals(fin.desc)) {
                    staticStrings.put(fin.name, (String) ldc.cst);
                }
            }
        }

        // Collect ModeSetting.is(getstatic X) string values in appearance order (unique)
        LinkedHashSet<String> isLabels = new LinkedHashSet<>();
        for (MethodNode mn : cn.methods) {
            AbstractInsnNode[] insns = mn.instructions.toArray();
            for (int i = 0; i < insns.length - 1; i++) {
                if (insns[i] instanceof FieldInsnNode fin
                        && fin.getOpcode() == Opcodes.GETSTATIC
                        && "Ljava/lang/String;".equals(fin.desc)
                        && insns[i + 1] instanceof MethodInsnNode min
                        && "ru/destra/setting/ModeSetting".equals(min.owner)
                        && "is".equals(min.name)) {
                    String v = staticStrings.get(fin.name);
                    if (v != null && !v.isEmpty()) isLabels.add(v);
                }
            }
        }

        MethodNode init = null;
        for (MethodNode mn : cn.methods) {
            if ("<init>".equals(mn.name)) { init = mn; break; }
        }
        if (init == null) return false;

        AbstractInsnNode[] insns = init.instructions.toArray();
        boolean changed = false;
        for (int i = 0; i < insns.length; i++) {
            if (!(insns[i] instanceof MethodInsnNode min)) continue;
            if (!"ru/destra/setting/ModeSetting".equals(min.owner) || !"<init>".equals(min.name)) continue;
            if (!"(Ljava/lang/String;Lru/destra/core/Module;[Ljava/lang/String;)V".equals(min.desc)) continue;

            int anew = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (insns[j] instanceof TypeInsnNode tin
                        && tin.getOpcode() == Opcodes.ANEWARRAY
                        && "java/lang/String".equals(tin.desc)) {
                    anew = j; break;
                }
            }
            if (anew < 0) continue;

            List<LdcInsnNode> ldcs = new ArrayList<>();
            for (int j = anew + 1; j < i; j++) {
                if (insns[j] instanceof LdcInsnNode ldc && ldc.cst instanceof String) {
                    AbstractInsnNode n = insns[j].getNext();
                    int hops = 0;
                    boolean aastore = false;
                    while (n != null && hops < 4) {
                        if (n.getOpcode() == Opcodes.AASTORE) { aastore = true; break; }
                        if (n instanceof MethodInsnNode) break;
                        n = n.getNext(); hops++;
                    }
                    if (aastore) ldcs.add(ldc);
                }
            }
            if (ldcs.size() < 2) continue;
            boolean collapsed = ldcs.stream().map(l -> (String) l.cst).distinct().count() == 1;
            if (!collapsed) continue;

            // Prefer is()-derived labels when count matches
            List<String> labels = new ArrayList<>(isLabels);
            if (labels.size() == ldcs.size()) {
                for (int k = 0; k < ldcs.size(); k++) ldcs.get(k).cst = labels.get(k);
                System.out.println(cn.name + ": restored " + labels + " from is() fields");
                changed = true;
            } else if (labels.size() > 1 && labels.size() < ldcs.size()) {
                // Partial: fill first labels.size(), leave rest as "Mode N"
                for (int k = 0; k < ldcs.size(); k++) {
                    ldcs.get(k).cst = k < labels.size() ? labels.get(k) : ("Mode" + (k + 1));
                }
                System.out.println(cn.name + ": partial restore " + labels + " + ModeN fillers (arity=" + ldcs.size() + ")");
                changed = true;
            } else {
                // Last resort: Mode1..ModeN so UI at least distinguishes indices
                for (int k = 0; k < ldcs.size(); k++) {
                    ldcs.get(k).cst = "Mode" + (k + 1);
                }
                System.out.println(cn.name + ": collapsed → Mode1..Mode" + ldcs.size() + " (no is() labels)");
                changed = true;
            }
        }

        if (!changed) return false;
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(p, out);
        Path bc = Path.of("build/classes/java/main/" + cn.name + ".class");
        if (Files.exists(bc)) Files.write(bc, out);
        return true;
    }
}
