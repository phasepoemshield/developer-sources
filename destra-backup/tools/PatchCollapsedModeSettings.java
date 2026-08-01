import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.nio.file.*;
import java.util.*;

/**
 * Restores ModeSetting constructor mode-label LDCs that were collapsed by string decryption
 * (same string repeated N times). Also fixes CustomHands/KillEffect comparison is() still work
 * via static fields that are already correct when modes match.
 */
public final class PatchCollapsedModeSettings {
    static final Map<String, List<ModeFix>> FIXES = new LinkedHashMap<>();

    static {
        // AspectRatio: single ModeSetting with 5 modes
        FIXES.put("ru/destra/module/AspectRatioModule", List.of(
                new ModeFix("modeSetting", new String[]{"16:9", "4:3", "21:9", "16:10", "Кастом"})
        ));
        // CustomHands
        FIXES.put("ru/destra/module/CustomHandsModule", List.of(
                new ModeFix("styleSetting", new String[]{"Небула", "Космос", "Гироид", "Фенель", "Облака"})
        ));
        // KillEffect: 4 styles (lightning is fallback / 4th)
        FIXES.put("ru/destra/module/KillEffectModule", List.of(
                new ModeFix("styleSetting", new String[]{"Призрак", "Луч", "Партиклы", "Молния"})
        ));
        // ChinaHat: mode (2) + shader style (5)
        FIXES.put("ru/destra/module/ChinaHatModule", List.of(
                new ModeFix("modeSetting", new String[]{"Классик", "Шейдерный"}),
                new ModeFix("shaderStyleSetting", new String[]{"Небула", "Космос", "Гироид", "Фенель", "Облака"})
        ));
        // WorldCustomizer: fog(2) + sky shader(6) + weather(3) + time(3). Mode1/Mode2 placeholders break is() checks.
        FIXES.put("ru/destra/module/WorldCustomizerModule", List.of(
                new ModeFix("fogMode", new String[]{"Простой", "Плавный"}),
                new ModeFix("skyShaderStyle", new String[]{"Небула", "Космос", "Гироид", "Фенель", "Облака", "Аврора"}),
                new ModeFix("weatherMode", new String[]{"Ясно", "Дождь", "Гроза"}),
                new ModeFix("timeMode", new String[]{"День", "Ночь", "Свое"})
        ));
        // BlockOverlay: render mode (2) + shader style (5 collapsed to Шейдерный/Обычный/Mode3/…)
        FIXES.put("ru/destra/module/BlockOverlayModule", List.of(
                new ModeFix("renderModeSetting", new String[]{"Шейдерный", "Обычный"}),
                new ModeFix("shaderStyleSetting", new String[]{"Небула", "Космос", "Гироид", "Фенель", "Облака"})
        ));
    }

    public static void main(String[] args) throws Exception {
        for (Map.Entry<String, List<ModeFix>> e : FIXES.entrySet()) {
            patchClass(e.getKey(), e.getValue());
        }
    }

    static void patchClass(String internalName, List<ModeFix> fixes) throws Exception {
        Path p = Path.of(".precompiled/" + internalName + ".class");
        if (!Files.exists(p)) {
            System.out.println("Skip missing: " + p);
            return;
        }
        ClassNode cn = new ClassNode();
        new ClassReader(Files.readAllBytes(p)).accept(cn, 0);

        MethodNode init = null;
        for (MethodNode mn : cn.methods) {
            if ("<init>".equals(mn.name)) { init = mn; break; }
        }
        if (init == null) {
            System.out.println("No <init> in " + internalName);
            return;
        }

        int total = 0;
        for (ModeFix fix : fixes) {
            total += patchModeSettingInInit(init, fix.modes);
            System.out.println(internalName + "." + fix.field + " -> " + Arrays.toString(fix.modes));
        }

        // ChinaHat: also fix clinit comparison fields that were collapsed to "Классик"
        if ("ru/destra/module/ChinaHatModule".equals(internalName)) {
            total += fixChinaHatClinitStrings(cn);
        }

        if (total == 0) {
            System.out.println(internalName + ": no LDC changes (already patched?)");
        }

        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_MAXS);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(p, out);
        Path bc = Path.of("build/classes/java/main/" + internalName + ".class");
        if (Files.exists(bc)) Files.write(bc, out);
        System.out.println("Wrote " + p + " (" + out.length + " bytes, ldcFixes=" + total + ")");
    }

    /**
     * Find ModeSetting.<init>(String, Module, String[]) sequences and replace the
     * array element LDCs with the provided modes (in order of appearance).
     */
    static int patchModeSettingInInit(MethodNode init, String[] modes) {
        AbstractInsnNode[] insns = init.instructions.toArray();
        int patched = 0;
        for (int i = 0; i < insns.length; i++) {
            if (!(insns[i] instanceof MethodInsnNode min)) continue;
            if (!"ru/destra/setting/ModeSetting".equals(min.owner)) continue;
            if (!"<init>".equals(min.name)) continue;
            if (!"(Ljava/lang/String;Lru/destra/core/Module;[Ljava/lang/String;)V".equals(min.desc)) continue;

            // Walk backwards to find anewarray String and collect aastore ldc slots
            List<LdcInsnNode> modeLdcs = new ArrayList<>();
            for (int j = i - 1; j >= 0 && modeLdcs.size() < 16; j--) {
                AbstractInsnNode n = insns[j];
                if (n instanceof TypeInsnNode tin
                        && tin.getOpcode() == Opcodes.ANEWARRAY
                        && "java/lang/String".equals(tin.desc)) {
                    break;
                }
                if (n instanceof LdcInsnNode ldc && ldc.cst instanceof String) {
                    // Likely a mode string if followed eventually by aastore
                    AbstractInsnNode next = n.getNext();
                    // pattern: ldc; aastore  OR  iconst; ldc; aastore
                    while (next != null && next.getOpcode() != Opcodes.AASTORE
                            && !(next instanceof MethodInsnNode)
                            && next != insns[i]) {
                        if (next.getOpcode() == Opcodes.AASTORE) break;
                        next = next.getNext();
                    }
                    if (next != null && next.getOpcode() == Opcodes.AASTORE) {
                        modeLdcs.add(0, ldc); // we're walking backwards
                    }
                }
                if (n instanceof MethodInsnNode) break; // hit previous call
            }

            // More reliable: between anewarray and invokespecial, collect LDCs that are String and precede aastore
            int anew = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (insns[j] instanceof TypeInsnNode tin
                        && tin.getOpcode() == Opcodes.ANEWARRAY
                        && "java/lang/String".equals(tin.desc)) {
                    anew = j;
                    break;
                }
            }
            if (anew < 0) continue;

            List<LdcInsnNode> ldcs = new ArrayList<>();
            for (int j = anew + 1; j < i; j++) {
                if (insns[j] instanceof LdcInsnNode ldc && ldc.cst instanceof String) {
                    // Only count if this ldc is stored into the array (aastore soon after)
                    AbstractInsnNode n = insns[j].getNext();
                    int hops = 0;
                    boolean aastore = false;
                    while (n != null && hops < 4) {
                        if (n.getOpcode() == Opcodes.AASTORE) { aastore = true; break; }
                        if (n instanceof MethodInsnNode || n instanceof TypeInsnNode) break;
                        n = n.getNext();
                        hops++;
                    }
                    if (aastore) ldcs.add(ldc);
                }
            }

            if (ldcs.size() != modes.length) {
                // Not this ModeSetting (different arity) — skip
                continue;
            }

            // Check if collapsed (all equal) or already correct
            boolean collapsed = true;
            String first = (String) ldcs.get(0).cst;
            for (LdcInsnNode ldc : ldcs) {
                if (!first.equals(ldc.cst)) { collapsed = false; break; }
            }
            boolean already = true;
            for (int k = 0; k < modes.length; k++) {
                if (!modes[k].equals(ldcs.get(k).cst)) { already = false; break; }
            }
            if (already) continue;
            if (!collapsed && !already) {
                // Different strings but not our target — still overwrite if sizes match and labels look wrong
                boolean modePlaceholder = false;
                for (LdcInsnNode ldc : ldcs) {
                    String s = (String) ldc.cst;
                    if (s != null && (s.startsWith("Mode") || s.matches("Mode\\s*\\d+"))) {
                        modePlaceholder = true;
                        break;
                    }
                }
                // BlockOverlay shader styles were decrypted into render-mode labels (Шейдерный/Обычный + Mode3…)
                boolean blockOverlayStyleJunk = modes.length == 5 && first.equals("Шейдерный");
                if (!(modePlaceholder || blockOverlayStyleJunk
                        || first.equals("Режим") || first.equals("Небула") || first.equals("Размер основания")
                        || first.equals("Классик") && modes.length == 2)) {
                    continue;
                }
            }

            for (int k = 0; k < modes.length; k++) {
                ldcs.get(k).cst = modes[k];
                patched++;
            }
            // Only patch one matching ModeSetting per ModeFix call — return after first match of this size
            return patched;
        }
        return patched;
    }

    static int fixChinaHatClinitStrings(ClassNode cn) {
        int n = 0;
        for (MethodNode mn : cn.methods) {
            if (!"<clinit>".equals(mn.name)) continue;
            // шД8 = Классик (keep), шДI used for non-baby classic check — should also be Классик
            // Second mode label "Шейдерный" should be assigned to fields used for non-classic branch
            // Currently шДI/шДЫ/шД1 all = Классик. For is() checks: classic branch uses Классик;
            // else branch runs when not classic — so modes[0]=Классик, modes[1]=Шейдерный is enough
            // if comparison fields stay "Классик". No clinit change required for comparisons.
            // Fix shader-related collapsed fields if any assign "Режим"
            for (AbstractInsnNode insn : mn.instructions) {
                if (insn instanceof LdcInsnNode ldc && "Режим".equals(ldc.cst)) {
                    // leave label field шфЬ as Режим (setting name) — only fix if putstatic to mode compare fields
                }
            }
        }
        return n;
    }

    static final class ModeFix {
        final String field;
        final String[] modes;
        ModeFix(String field, String[] modes) {
            this.field = field;
            this.modes = modes;
        }
    }
}
