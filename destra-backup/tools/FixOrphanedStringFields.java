import java.io.*;
import java.nio.file.*;
import java.util.*;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.*;

public final class FixOrphanedStringFields {
    static final Map<String, String> VALUES = new HashMap<>();
    static {
        VALUES.put("SOUND_PISTON_CONTRACT", "block.piston.contract");
        VALUES.put("SOUND_PISTON_EXTEND", "block.piston.extend");
        VALUES.put("SOUND_EVOKER_FANGS", "entity.evoker_fangs.attack");
        VALUES.put("TRAP_TAG_TRAPKA", "\u0442\u0440\u0430\u043f\u043a\u0430");
        VALUES.put("TRAP_PREFIX_DRAGON", "\u0414\u0440\u0430\u043a\u043e\u043d\u044c\u044f");
        VALUES.put("SEPARATOR", " | ");
        VALUES.put("TRAP_TIMER_FORMAT", "%s \u0437\u0430\u043a\u043e\u043d\u0447\u0438\u0442\u0441\u044f \u0447\u0435\u0440\u0435\u0437 %s\u0441");
        VALUES.put("TEXT_PREFIX_RESET", "\u00a7f\u0001");
        VALUES.put("FORMAT_ONE_DECIMAL", "%.1f");
        VALUES.put("NBT_TAG_FREEZEBALL", "freezeball");
        VALUES.put("NBT_TAG_DON_ITEM", "don-item");
        VALUES.put("NBT_TAG_SPOOKY_ITEM", "spooky-item");
        VALUES.put("NBT_TAG_SPACETRAP", "spacetrap");
        VALUES.put("NBT_TAG_TRAP", "trap");
        VALUES.put("NBT_TAG_DUST", "dust");
        VALUES.put("NBT_TAG_DISORIENTATION", "disorientation");
        VALUES.put("NBT_TAG_PLAST", "plast");
        VALUES.put("NBT_TAG_SNOWBALL", "snowball");
        VALUES.put("NBT_TAG_GODS_AURA", "gods_aura");
        VALUES.put("NBT_TAG_SIXITEM", "sixitem");
        VALUES.put("NBT_TAG_FUNITEMS", "funitems");
        VALUES.put("CUSTOM_DATA_KEY", "minecraft:custom_data");

        VALUES.put("SOUND_MODE_OPTION_1", "Bell");
        VALUES.put("SOUND_MODE_OPTION_2", "Bonk");
        VALUES.put("SOUND_MODE_OPTION_3", "Bubble");
        VALUES.put("SOUND_MODE_OPTION_4", "Crime");
        VALUES.put("SOUND_MODE_OPTION_5", "Metallic");
        VALUES.put("RESOURCE_NAMESPACE", "destra");

        VALUES.put("хЮ", "Левая");
        VALUES.put("хл", "Правая");
        VALUES.put("衣ш", "Сущность");
        VALUES.put("衣щ", "Блок");

        VALUES.put("MODE_FLAT_NAME", "Обычный");
        VALUES.put("MODE_SHADER_NAME_ALT", "Шейдерный");
        VALUES.put("SHADER_STYLE_OPTION_1", "Glow");
        VALUES.put("SHADER_STYLE_OPTION_2", "Pulse");
        VALUES.put("SHADER_STYLE_OPTION_3", "Wave");
        VALUES.put("SHADER_STYLE_OPTION_4", "Rainbow");
        VALUES.put("SHADER_STYLE_OPTION_5", "Gradient");

        VALUES.put("MODE_ARMOR_AND_PLAYER_1", "Броня + игрок");
        VALUES.put("MODE_ARMOR", "Броня");
        VALUES.put("MODE_PLAYER", "Игрок");

        VALUES.put("Т诶", "Только в движении");
        VALUES.put("ТП", "При прыжке");

        VALUES.put("фн", "Линия");
        VALUES.put("ф西", "Партиклы");
        VALUES.put("фР", "Линия + партиклы");
        VALUES.put("фВ", "Glow");
        VALUES.put("фЧ", "Pulse");
        VALUES.put("Дш", "Wave");
        VALUES.put("Дщ", "Rainbow");
        VALUES.put("Дй", "Gradient");

        VALUES.put("西Ш", "Переключить слот");
        VALUES.put("西р", "Ничего");
        VALUES.put("西э", "Переключить слот");

        VALUES.put("AUTO_SEARCH_SETTING_NAME", "Автопоиск предмета");
        VALUES.put("FAKE_PLAYER_USERNAME", "FakePlayer");
    }

    public static void main(String[] args) throws Exception {
        Path root = Path.of(".precompiled");
        int fixed = 0, files = 0;
        try (var stream = Files.walk(root)) {
            var list = stream.filter(p -> p.toString().endsWith(".class")).sorted().toList();
            for (Path file : list) {
                if (fixFile(file)) { fixed++; files++; }
            }
        }
        System.out.println("FixOrphanedStringFields: fixed " + fixed + " field(s) in " + files + " file(s)");
    }

    static boolean fixFile(Path file) throws IOException {
        byte[] data = Files.readAllBytes(file);
        ClassNode cn = new ClassNode();
        new ClassReader(data).accept(cn, 0);

        boolean isFTH = cn.name.equals("ru/destra/module/FunTimeHelperModule");
        boolean isNbtReader = cn.name.equals("ru/destra/util/NbtItemReader");

        boolean changed = false;
        for (FieldNode fn : cn.fields) {
            if ((fn.access & Opcodes.ACC_STATIC) == 0 || (fn.access & Opcodes.ACC_FINAL) == 0) continue;
            if (!fn.desc.equals("Ljava/lang/String;")) continue;
            if (fn.visibleAnnotations != null) continue;

            boolean ftOnly = fn.name.equals("MODULE_NAME") || fn.name.equals("MODULE_DESCRIPTION")
                    || fn.name.equals("GROUP_NAME_RADIUS") || fn.name.equals("SETTING_DRAGON_TRAP")
                    || fn.name.equals("SETTING_FILL_HIGHLIGHT") || fn.name.equals("SETTING_TRAP_TIMER");

            if (fn.value != null) {
                if (ftOnly && !isFTH) {
                    fn.value = null;
                    changed = true;
                }
                continue;
            }

            if (ftOnly && !isFTH) continue;

            String val = VALUES.get(fn.name);
            if (val == null) continue;
            fn.value = val;
            System.out.println("  " + cn.name + "." + fn.name + " = \"" + val.replace("\n", "\\n") + "\"");
            changed = true;
        }

        if (changed) {
            ClassWriter cw = new ClassWriter(0);
            cn.accept(cw);
            Files.write(file, cw.toByteArray());
        }
        return changed;
    }
}
