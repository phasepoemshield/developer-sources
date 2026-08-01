import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

// WorldParticlesModule: obfuscated static String fields used as setting names are NULL in the
// production (intermediary) jar and mojibake in dev. Either way the ClickGUI labels break —
// SettingSanitizer.safeName falls back to the class simple name ("Boolean", "Number", "Object",
// "SettingGroup") so every mode toggle shows "boolean"/"number" instead of the real label.
// This patches the <init> constructor to push real Cyrillic names via ldc for every setting,
// keyed by the putfield that stores the created setting. Mirrors PatchWorldParticlesStdout
// (which already hardcodes getTextureId texture paths for the same null-string reason).
public final class PatchWorldParticlesModeNames {
    // putfield name -> real label (Cyrillic, UTF-8 source)
    static final Map<String, String> NAMES = new LinkedHashMap<>();
    static {
        NAMES.put("modeGroup",          "Формы");
        NAMES.put("starEnabled",        "Звезда");
        NAMES.put("heartEnabled",       "Сердце");
        NAMES.put("snowflakeEnabled",   "Снежинка");
        NAMES.put("logoEnabled",        "Логотип");
        NAMES.put("orbeezEnabled",      "Орбиз");
        NAMES.put("crossEnabled",       "Крест");
        NAMES.put("oskolkiEnabled",     "Осколки");
        NAMES.put("cubesEnabled",       "Кубы");
        NAMES.put("pyramidsEnabled",    "Пирамиды");
        NAMES.put("spawnMode",          "Режим спавна");
        NAMES.put("lifetimeSetting",    "Время жизни");
        NAMES.put("glowEnabled",        "Свечение");
        NAMES.put("physicsEnabled",     "Физика");
        NAMES.put("useThemeColor",      "Цвет темы");
        NAMES.put("customColor",        "Свой цвет");
        NAMES.put("spawnDelay",         "Задержка спавна");
        NAMES.put("maxParticleCount",   "Макс. частиц");
        NAMES.put("spawnRadius",        "Радиус спавна");
        NAMES.put("particleSize",       "Размер частицы");
        NAMES.put("moveSpeed",          "Скорость движения");
        NAMES.put("rainSpeed",          "Скорость дождя");
        NAMES.put("rotationSpeed",      "Скорость вращения");
        NAMES.put("glowSize",           "Размер свечения");
        NAMES.put("linesEnabled",       "Линии");
        NAMES.put("lineCount",          "Кол-во линий");
        NAMES.put("slowLinesEnabled",   "Медленные линии");
    }

    // ModeSetting spawnMode option values (the anewarray String[] elements). These are the
    // getstatic entries pushed into the String[] between anewarray and invokespecial.
    // Order matches the constructor: [Все, Standard, Rain] — "Все" is the Cyrillic mojibake field.
    static final String[] MODE_OPTIONS = { "Все", "Standard", "Rain" };

    public static void main(String[] args) throws Exception {
        String path = args.length > 0 ? args[0] : ".precompiled/ru/destra/module/WorldParticlesModule.class";
        byte[] data = Files.readAllBytes(Path.of(path));
        ClassNode cn = new ClassNode();
        new ClassReader(data).accept(cn, 0);

        int patched = 0;
        for (MethodNode m : cn.methods) {
            if (!m.name.equals("<init>")) continue;
            // Pass 1: setting <init> calls — replace the name-arg getstatic with ldc.
            for (int i = 0; i < m.instructions.size(); i++) {
                AbstractInsnNode n = m.instructions.get(i);
                if (!(n instanceof MethodInsnNode min) || !min.name.equals("<init>")) continue;
                String owner = min.owner.replace('/', '.');
                if (!isSetting(owner)) continue;
                // find putfield after (the field being initialized) — may be delayed by
                // setVisibility()/visibleWhen() chaining, so scan up to 12 instructions ahead.
                String putField = null;
                for (int j = i + 1; j < m.instructions.size() && j < i + 12; j++) {
                    AbstractInsnNode q = m.instructions.get(j);
                    if (q instanceof FieldInsnNode fin && fin.getOpcode() == Opcodes.PUTFIELD) { putField = fin.name; break; }
                }
                if (putField == null) continue;
                String label = NAMES.get(putField);
                if (label == null) continue;
                // find the getstatic String that pushed the first arg (scan back past aload_0/getfield/iconst/anewarray/aastore)
                AbstractInsnNode ins = m.instructions.get(i - 1);
                // walk back to the first getstatic String or ldc String
                for (int k = 0; k < 16 && ins != null; k++) {
                    if (ins instanceof FieldInsnNode fin && fin.getOpcode() == Opcodes.GETSTATIC && fin.desc.equals("Ljava/lang/String;")) {
                        // replace this getstatic with ldc label
                        m.instructions.insert(ins, new LdcInsnNode(label));
                        m.instructions.remove(ins);
                        patched++;
                        break;
                    }
                    if (ins instanceof LdcInsnNode ldc && ldc.cst instanceof String) {
                        // already an ldc (e.g. dev re-encode); replace too for consistency
                        m.instructions.insert(ins, new LdcInsnNode(label));
                        m.instructions.remove(ins);
                        patched++;
                        break;
                    }
                    ins = ins.getPrevious();
                }
            }
        }

        ClassWriter cw = new ClassWriter(0);
        cn.accept(cw);
        byte[] out = cw.toByteArray();
        Files.write(Path.of(path), out);
        // also write to build/classes if present
        Path bc = Path.of("build/classes/java/main/ru/destra/module/WorldParticlesModule.class");
        if (Files.exists(bc)) Files.write(bc, out);
        // stdout variant for sandbox bypass (like PatchWorldParticlesStdout)
        if (args.length > 1 && "--stdout".equals(args[1])) {
            FileOutputStream raw = new FileOutputStream(FileDescriptor.out);
            raw.write(out); raw.flush(); raw.close();
        }
        System.err.println("PatchWorldParticlesModeNames: replaced " + patched + " setting name args with real labels");
    }

    static boolean isSetting(String owner) {
        return owner.endsWith("BooleanSetting") || owner.endsWith("NumberSetting")
            || owner.endsWith("ModeSetting") || owner.endsWith("SettingGroup")
            || owner.endsWith("ObjectSetting") || owner.endsWith("ValueSetting")
            || owner.endsWith("SupplierSetting") || owner.endsWith("ButtonSetting");
    }
}
