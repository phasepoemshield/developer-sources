/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.OptionalDynamic
 *  minecraft.class00622
 *  minecraft.class02269
 *  minecraft.class03731
 *  minecraft.class04995
 *  minecraft.class06962
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.base.Splitter;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.OptionalDynamic;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00622;
import minecraft.class02269;
import minecraft.class02825;
import minecraft.class03731;
import minecraft.class04995;
import minecraft.class06962;
import org.jspecify.annotations.Nullable;

public class class02849
extends DataFix {
    private static final int N = 1;
    private static final int y = 2;
    private static final int L = 4;
    private static final int u = 8;
    private static final int i = 16;
    private static final int R = 32;
    private static final int M = 64;
    private static final int B = 128;
    private static final Set<String> Z = Set.of("minecraft:potion", "minecraft:splash_potion", "minecraft:lingering_potion", "minecraft:tipped_arrow");
    private static final Set<String> z = Set.of("minecraft:pufferfish_bucket", "minecraft:salmon_bucket", "minecraft:cod_bucket", "minecraft:tropical_fish_bucket", "minecraft:axolotl_bucket", "minecraft:tadpole_bucket");
    private static final List<String> U = List.of("NoAI", "Silent", "NoGravity", "Glowing", "Invulnerable", "Health", "Age", "Variant", "HuntingCooldown", "BucketVariantTag");
    private static final Set<String> E = Set.of("attached", "bottom", "conditional", "disarmed", "drag", "enabled", "extended", "eye", "falling", "hanging", "has_bottle_0", "has_bottle_1", "has_bottle_2", "has_record", "has_book", "inverted", "in_wall", "lit", "locked", "occupied", "open", "persistent", "powered", "short", "signal_fire", "snowy", "triggered", "unstable", "waterlogged", "berries", "bloom", "shrieking", "can_summon", "up", "down", "north", "east", "south", "west", "slot_0_occupied", "slot_1_occupied", "slot_2_occupied", "slot_3_occupied", "slot_4_occupied", "slot_5_occupied", "cracked", "crafting");
    private static final Splitter W = Splitter.on((char)',');

    private static void L(class02825 class028252, Dynamic<?> dynamic) {
        Dynamic<?> var2 = class02849.i(class028252, dynamic);
        if (var2 != null) {
            class028252.N("minecraft:writable_book_content", dynamic.emptyMap().set("pages", var2));
        }
    }

    private static Optional<Pair<String, Integer>> L(Dynamic<?> dynamic) {
        return dynamic.get("id").asString().apply2stable((string, number) -> Pair.of((Object)string, (Object)class04995.N((int)number.intValue(), (int)0, (int)255)), dynamic.get("lvl").asNumber()).result();
    }

    private static void L(class02825 class028252, Dynamic<?> dynamic, int n) {
        OptionalDynamic<?> var3 = class028252.N("AttributeModifiers");
        if (var3.result().isEmpty()) {
            return;
        }
        boolean bl = (n & 2) != 0;
        List list = var3.asList(class02849::u);
        Dynamic dynamic2 = dynamic.emptyMap().set("modifiers", dynamic.createList(list.stream()));
        if (bl) {
            dynamic2 = dynamic2.set("show_in_tooltip", dynamic.createBoolean(false));
        }
        class028252.N("minecraft:attribute_modifiers", dynamic2);
    }

    private static void M(class02825 class028252, Dynamic<?> dynamic) {
        Optional var2 = class028252.N("LodestonePos").result();
        Optional var3 = class028252.N("LodestoneDimension").result();
        if (var2.isEmpty() && var3.isEmpty()) {
            return;
        }
        boolean bl = class028252.N("LodestoneTracked").asBoolean(true);
        Dynamic dynamic2 = dynamic.emptyMap();
        if (var2.isPresent() && var3.isPresent()) {
            dynamic2 = dynamic2.set("target", dynamic.emptyMap().set("pos", (Dynamic)var2.get()).set("dimension", (Dynamic)var3.get()));
        }
        if (!bl) {
            dynamic2 = dynamic2.set("tracked", dynamic.createBoolean(false));
        }
        class028252.N("minecraft:lodestone_tracker", dynamic2);
    }

    public class02849(Schema schema) {
        super(schema, true);
    }

    private static @Nullable Dynamic<?> i(class02825 class028252, Dynamic<?> dynamic2) {
        List list = class028252.N("pages").asList(dynamic -> dynamic.asString(""));
        Map map = class028252.N("filtered_pages").asMap(dynamic -> dynamic.asString("0"), dynamic -> dynamic.asString(""));
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); ++i) {
            String string = (String)list.get(i);
            String string2 = (String)map.get(String.valueOf(i));
            arrayList.add(class02849.N(dynamic2, string, Optional.ofNullable(string2)));
        }
        return dynamic2.createList(arrayList.stream());
    }

    private static Pair<Dynamic<?>, Dynamic<?>> i(Dynamic<?> dynamic) {
        Dynamic dynamic2 = (Dynamic)DataFixUtils.orElseGet((Optional)dynamic.get("id").result(), () -> dynamic.createString(""));
        Dynamic dynamic3 = dynamic.emptyMap().set("type", dynamic.createString(class02849.N(dynamic.get("type").asInt(0)))).set("x", dynamic.createDouble(dynamic.get("x").asDouble(0.0))).set("z", dynamic.createDouble(dynamic.get("z").asDouble(0.0))).set("rotation", dynamic.createFloat((float)dynamic.get("rot").asDouble(0.0)));
        return Pair.of((Object)dynamic2, (Object)dynamic3);
    }

    private static void u(class02825 class028252, Dynamic<?> dynamic) {
        Dynamic<?> var2 = class02849.i(class028252, dynamic);
        String string = class028252.N("title").asString("");
        Optional var4 = class028252.N("filtered_title").asString().result();
        Dynamic dynamic2 = dynamic.emptyMap();
        dynamic2 = dynamic2.set("title", class02849.N(dynamic, string, var4));
        Dynamic<?> var5 = class028252.N("author", dynamic2, "author");
        var5 = class028252.N("resolved", var5, "resolved");
        var5 = class028252.N("generation", var5, "generation");
        if (var2 != null) {
            dynamic2 = var5.set("pages", var2);
        }
        class028252.N("minecraft:written_book_content", dynamic2);
    }

    private static Dynamic<?> u(Dynamic<?> dynamic2) {
        Dynamic dynamic3 = dynamic2.emptyMap().set("name", dynamic2.createString("")).set("amount", dynamic2.createDouble(0.0)).set("operation", dynamic2.createString("add_value"));
        Dynamic var1 = Dynamic.copyField(dynamic2, (String)"AttributeName", (Dynamic)dynamic3, (String)"type");
        dynamic3 = Dynamic.copyField(dynamic2, (String)"Slot", (Dynamic)var1, (String)"slot");
        dynamic3 = Dynamic.copyField(dynamic2, (String)"UUID", (Dynamic)dynamic3, (String)"uuid");
        dynamic3 = Dynamic.copyField(dynamic2, (String)"Name", (Dynamic)dynamic3, (String)"name");
        dynamic3 = Dynamic.copyField(dynamic2, (String)"Amount", (Dynamic)dynamic3, (String)"amount");
        dynamic3 = Dynamic.copyAndFixField(dynamic2, (String)"Operation", (Dynamic)dynamic3, (String)"operation", dynamic -> dynamic.createString(switch (dynamic.asInt(0)) {
            default -> "add_value";
            case 1 -> "add_multiplied_base";
            case 2 -> "add_multiplied_total";
        }));
        return dynamic3;
    }

    private static void y(class02825 class028252, Dynamic<?> dynamic, int n) {
        class02849.y(class028252, dynamic, "CanDestroy", "minecraft:can_break", (n & 8) != 0);
        class02849.y(class028252, dynamic, "CanPlaceOn", "minecraft:can_place_on", (n & 0x10) != 0);
    }

    private static void y(class02825 class028252) {
        class028252.N("Fireworks", true, dynamic -> {
            Stream<Dynamic> stream = dynamic.get("Explosions").asStream().map(class02849::R);
            int n = dynamic.get("Flight").asInt(0);
            class028252.N("minecraft:fireworks", dynamic.emptyMap().set("explosions", dynamic.createList(stream)).set("flight_duration", dynamic.createByte((byte)n)));
            return dynamic.remove("Explosions").remove("Flight");
        });
    }

    private static Dynamic<?> y(Dynamic<?> dynamic) {
        return (Dynamic)DataFixUtils.orElse(dynamic.asMapOpt().result().map(stream -> stream.collect(Collectors.toMap(Pair::getFirst, pair -> {
            Optional optional;
            String string = ((Dynamic)pair.getFirst()).asString("");
            Dynamic dynamic = (Dynamic)pair.getSecond();
            if (E.contains(string) && (optional = dynamic.asBoolean().result()).isPresent()) {
                return dynamic.createString(String.valueOf(optional.get()));
            }
            optional = dynamic.asNumber().result();
            if (optional.isPresent()) {
                return dynamic.createString(((Number)optional.get()).toString());
            }
            return dynamic;
        }))).map(arg_0 -> dynamic.createMap(arg_0)), dynamic);
    }

    private static void y(class02825 class028252, Dynamic<?> dynamic) {
        Dynamic dynamic2 = dynamic.emptyMap();
        Optional<String> var3 = class028252.N("Potion").asString().result().filter(string -> !string.equals("minecraft:empty"));
        if (var3.isPresent()) {
            dynamic2 = dynamic2.set("potion", dynamic.createString(var3.get()));
        }
        Dynamic<?> var2 = class028252.N("CustomPotionColor", dynamic2, "custom_color");
        if (!(var2 = class028252.N("custom_potion_effects", var2, "custom_effects")).equals((Object)dynamic.emptyMap())) {
            class028252.N("minecraft:potion_contents", var2);
        }
    }

    private static void y(class02825 class028252, Dynamic<?> dynamic2, String string, String string2, boolean bl) {
        Optional var5 = class028252.N(string).result();
        if (var5.isEmpty()) {
            return;
        }
        Dynamic dynamic3 = dynamic2.emptyMap().set("predicates", dynamic2.createList(((Dynamic)var5.get()).asStream().map(dynamic -> (Dynamic)DataFixUtils.orElse((Optional)dynamic.asString().map(string -> class02849.N(dynamic, string)).result(), (Object)dynamic))));
        if (bl) {
            dynamic3 = dynamic3.set("show_in_tooltip", dynamic2.createBoolean(false));
        }
        class028252.N(string2, dynamic3);
    }

    private static void N(class02825 class028252, Dynamic<?> dynamic3) {
        Object object;
        int n = class028252.N("HideFlags").asInt(0);
        class028252.N("Damage", "minecraft:damage", dynamic3.createInt(0));
        class028252.N("RepairCost", "minecraft:repair_cost", dynamic3.createInt(0));
        class028252.N("CustomModelData", "minecraft:custom_model_data");
        class028252.N("BlockStateTag").result().ifPresent(dynamic -> class028252.N("minecraft:block_state", class02849.y(dynamic)));
        class028252.N("EntityTag", "minecraft:entity_data");
        class028252.N("BlockEntityTag", false, dynamic -> {
            String string = class00622.N((String)dynamic.get("id").asString(""));
            Dynamic dynamic2 = (dynamic = class02849.N(class028252, dynamic, string)).remove("id");
            if (dynamic2.equals((Object)dynamic.emptyMap())) {
                return dynamic2;
            }
            return dynamic;
        });
        class028252.N("BlockEntityTag", "minecraft:block_entity_data");
        if (class028252.N("Unbreakable").asBoolean(false)) {
            Dynamic dynamic4 = dynamic3.emptyMap();
            if ((n & 4) != 0) {
                dynamic4 = dynamic4.set("show_in_tooltip", dynamic3.createBoolean(false));
            }
            class028252.N("minecraft:unbreakable", dynamic4);
        }
        class02849.N(class028252, dynamic3, "Enchantments", "minecraft:enchantments", (n & 1) != 0);
        if (class028252.y("minecraft:enchanted_book")) {
            class02849.N(class028252, dynamic3, "StoredEnchantments", "minecraft:stored_enchantments", (n & 0x20) != 0);
        }
        class028252.N("display", false, dynamic -> class02849.N(class028252, dynamic, n));
        class02849.y(class028252, dynamic3, n);
        class02849.L(class028252, dynamic3, n);
        Optional var3 = class028252.N("Trim").result();
        if (var3.isPresent()) {
            Dynamic var4 = (Dynamic)var3.get();
            if ((n & 0x80) != 0) {
                object = var4.set("show_in_tooltip", var4.createBoolean(false));
            }
            class028252.N("minecraft:trim", (Dynamic<?>)object);
        }
        if ((n & 0x20) != 0) {
            class028252.N("minecraft:hide_additional_tooltip", dynamic3.emptyMap());
        }
        if (class028252.y("minecraft:crossbow")) {
            class028252.N("Charged");
            class028252.N("ChargedProjectiles", "minecraft:charged_projectiles", dynamic3.createList(Stream.empty()));
        }
        if (class028252.y("minecraft:bundle")) {
            class028252.N("Items", "minecraft:bundle_contents", dynamic3.createList(Stream.empty()));
        }
        if (class028252.y("minecraft:filled_map")) {
            class028252.N("map", "minecraft:map_id");
            object = class028252.N("Decorations").asStream().map(class02849::i).collect(Collectors.toMap(Pair::getFirst, Pair::getSecond, (dynamic, dynamic2) -> dynamic));
            if (!object.isEmpty()) {
                class028252.N("minecraft:map_decorations", dynamic3.createMap((Map)object));
            }
        }
        if (class028252.N(Z)) {
            class02849.y(class028252, dynamic3);
        }
        if (class028252.y("minecraft:writable_book")) {
            class02849.L(class028252, dynamic3);
        }
        if (class028252.y("minecraft:written_book")) {
            class02849.u(class028252, dynamic3);
        }
        if (class028252.y("minecraft:suspicious_stew")) {
            class028252.N("effects", "minecraft:suspicious_stew_effects");
        }
        if (class028252.y("minecraft:debug_stick")) {
            class028252.N("DebugProperty", "minecraft:debug_stick_state");
        }
        if (class028252.N(z)) {
            class02849.R(class028252, dynamic3);
        }
        if (class028252.y("minecraft:goat_horn")) {
            class028252.N("instrument", "minecraft:instrument");
        }
        if (class028252.y("minecraft:knowledge_book")) {
            class028252.N("Recipes", "minecraft:recipes");
        }
        if (class028252.y("minecraft:compass")) {
            class02849.M(class028252, dynamic3);
        }
        if (class028252.y("minecraft:firework_rocket")) {
            class02849.y(class028252);
        }
        if (class028252.y("minecraft:firework_star")) {
            class02849.N(class028252);
        }
        if (class028252.y("minecraft:player_head")) {
            class028252.N("SkullOwner").result().ifPresent(dynamic -> class028252.N("minecraft:profile", class02849.N(dynamic)));
        }
    }

    private static String N(int n) {
        return switch (n) {
            default -> "player";
            case 1 -> "frame";
            case 2 -> "red_marker";
            case 3 -> "blue_marker";
            case 4 -> "target_x";
            case 5 -> "target_point";
            case 6 -> "player_off_map";
            case 7 -> "player_off_limits";
            case 8 -> "mansion";
            case 9 -> "monument";
            case 10 -> "banner_white";
            case 11 -> "banner_orange";
            case 12 -> "banner_magenta";
            case 13 -> "banner_light_blue";
            case 14 -> "banner_yellow";
            case 15 -> "banner_lime";
            case 16 -> "banner_pink";
            case 17 -> "banner_gray";
            case 18 -> "banner_light_gray";
            case 19 -> "banner_cyan";
            case 20 -> "banner_purple";
            case 21 -> "banner_blue";
            case 22 -> "banner_brown";
            case 23 -> "banner_green";
            case 24 -> "banner_red";
            case 25 -> "banner_black";
            case 26 -> "red_x";
            case 27 -> "village_desert";
            case 28 -> "village_plains";
            case 29 -> "village_savanna";
            case 30 -> "village_snowy";
            case 31 -> "village_taiga";
            case 32 -> "jungle_temple";
            case 33 -> "swamp_hut";
        };
    }

    private static <T> Dynamic<T> N(class02825 class028252, Dynamic<T> dynamic2, String string) {
        class028252.N("minecraft:lock", dynamic2.get("Lock"));
        dynamic2 = dynamic2.remove("Lock");
        Optional optional = dynamic2.get("LootTable").result();
        if (optional.isPresent()) {
            String string2 = dynamic2.emptyMap().set("loot_table", (Dynamic)optional.get());
            long l = dynamic2.get("LootTableSeed").asLong(0L);
            if (l != 0L) {
                string2 = string2.set("seed", dynamic2.createLong(l));
            }
            class028252.N("minecraft:container_loot", (Dynamic<?>)string2);
            dynamic2 = dynamic2.remove("LootTable").remove("LootTableSeed");
        }
        return switch (string) {
            case "minecraft:skull" -> {
                class028252.N("minecraft:note_block_sound", dynamic2.get("note_block_sound"));
                yield dynamic2.remove("note_block_sound");
            }
            case "minecraft:decorated_pot" -> {
                class028252.N("minecraft:pot_decorations", dynamic2.get("sherds"));
                Optional var6_7 = dynamic2.get("item").result();
                if (var6_7.isPresent()) {
                    class028252.N("minecraft:container", dynamic2.createList(Stream.of(dynamic2.emptyMap().set("slot", dynamic2.createInt(0)).set("item", (Dynamic)var6_7.get()))));
                }
                yield dynamic2.remove("sherds").remove("item");
            }
            case "minecraft:banner" -> {
                class028252.N("minecraft:banner_patterns", dynamic2.get("patterns"));
                Optional var6 = dynamic2.get("Base").asNumber().result();
                if (var6.isPresent()) {
                    class028252.N("minecraft:base_color", dynamic2.createString(class02269.N((int)((Number)var6.get()).intValue())));
                }
                yield dynamic2.remove("patterns").remove("Base");
            }
            case "minecraft:shulker_box", "minecraft:chest", "minecraft:trapped_chest", "minecraft:furnace", "minecraft:ender_chest", "minecraft:dispenser", "minecraft:dropper", "minecraft:brewing_stand", "minecraft:hopper", "minecraft:barrel", "minecraft:smoker", "minecraft:blast_furnace", "minecraft:campfire", "minecraft:chiseled_bookshelf", "minecraft:crafter" -> {
                List var6_9 = dynamic2.get("Items").asList(dynamic -> dynamic.emptyMap().set("slot", dynamic.createInt(dynamic.get("Slot").asByte((byte)0) & 0xFF)).set("item", dynamic.remove("Slot")));
                if (!var6_9.isEmpty()) {
                    class028252.N("minecraft:container", dynamic2.createList(var6_9.stream()));
                }
                yield dynamic2.remove("Items");
            }
            case "minecraft:beehive" -> {
                class028252.N("minecraft:bees", dynamic2.get("bees"));
                yield dynamic2.remove("bees");
            }
            default -> dynamic2;
        };
    }

    private static Dynamic<?> N(class02825 class028252, Dynamic<?> dynamic2, int n) {
        Optional var6;
        boolean bl;
        dynamic2.get("Name").result().filter(class03731::N).ifPresent(dynamic -> class028252.N("minecraft:custom_name", (Dynamic<?>)dynamic));
        if (dynamic2.get("Lore").result().isPresent()) {
            class028252.N("minecraft:lore", dynamic2.createList(dynamic2.get("Lore").asStream().filter(class03731::N)));
        }
        Optional<Integer> optional = dynamic2.get("color").asNumber().result().map(Number::intValue);
        boolean bl2 = bl = (n & 0x40) != 0;
        if (optional.isPresent() || bl) {
            Dynamic dynamic3 = dynamic2.emptyMap().set("rgb", dynamic2.createInt(optional.orElse(10511680).intValue()));
            if (bl) {
                dynamic3 = dynamic3.set("show_in_tooltip", dynamic2.createBoolean(false));
            }
            class028252.N("minecraft:dyed_color", dynamic3);
        }
        if ((var6 = dynamic2.get("LocName").asString().result()).isPresent()) {
            class028252.N("minecraft:item_name", class03731.y((DynamicOps)dynamic2.getOps(), (String)((String)var6.get())));
        }
        if (class028252.y("minecraft:filled_map")) {
            class028252.N("minecraft:map_color", dynamic2.get("MapColor"));
            dynamic2 = dynamic2.remove("MapColor");
        }
        return dynamic2.remove("Name").remove("Lore").remove("color").remove("LocName");
    }

    private static @Nullable Dynamic<?> N(OptionalDynamic<?> optionalDynamic) {
        Map map = optionalDynamic.asMap(dynamic -> dynamic.asString(""), dynamic2 -> dynamic2.asList(dynamic -> {
            String string = dynamic.get("Value").asString("");
            Optional var2 = dynamic.get("Signature").asString().result();
            return Pair.of((Object)string, (Object)var2);
        }));
        if (map.isEmpty()) {
            return null;
        }
        return optionalDynamic.createList(map.entrySet().stream().flatMap(entry -> ((List)entry.getValue()).stream().map(pair -> {
            Dynamic dynamic = optionalDynamic.emptyMap().set("name", optionalDynamic.createString((String)entry.getKey())).set("value", optionalDynamic.createString((String)pair.getFirst()));
            Optional optional = (Optional)pair.getSecond();
            if (optional.isPresent()) {
                return dynamic.set("signature", optionalDynamic.createString((String)optional.get()));
            }
            return dynamic;
        })));
    }

    private static boolean N(String string) {
        if (string.length() > 16) {
            return false;
        }
        return string.chars().filter(n -> n <= 32 || n >= 127).findAny().isEmpty();
    }

    public static Dynamic<?> N(Dynamic<?> dynamic) {
        Optional var1 = dynamic.asString().result();
        if (var1.isPresent()) {
            if (class02849.N((String)var1.get())) {
                return dynamic.emptyMap().set("name", dynamic.createString((String)var1.get()));
            }
            return dynamic.emptyMap();
        }
        String string = dynamic.get("Name").asString("");
        Optional optional = dynamic.get("Id").result();
        Dynamic<?> var4 = class02849.N(dynamic.get("Properties"));
        Dynamic dynamic2 = dynamic.emptyMap();
        if (class02849.N(string)) {
            dynamic2 = dynamic2.set("name", dynamic.createString(string));
        }
        if (optional.isPresent()) {
            dynamic2 = dynamic2.set("id", (Dynamic)optional.get());
        }
        if (var4 != null) {
            dynamic2 = dynamic2.set("properties", var4);
        }
        return dynamic2;
    }

    private static Dynamic<?> N(Dynamic<?> dynamic, String string) {
        int n = string.indexOf(91);
        int n2 = string.indexOf(123);
        int n3 = string.length();
        if (n != -1) {
            n3 = n;
        }
        if (n2 != -1) {
            n3 = Math.min(n3, n2);
        }
        String string2 = string.substring(0, n3);
        Dynamic dynamic2 = dynamic.emptyMap().set("blocks", dynamic.createString(string2.trim()));
        int n4 = string.indexOf(93);
        if (n != -1 && n4 != -1) {
            Dynamic dynamic3 = dynamic.emptyMap();
            for (String string3 : W.split((CharSequence)string.substring(n + 1, n4))) {
                int n5 = string3.indexOf(61);
                if (n5 == -1) continue;
                String string4 = string3.substring(0, n5).trim();
                String string5 = string3.substring(n5 + 1).trim();
                dynamic3 = dynamic3.set(string4, dynamic.createString(string5));
            }
            dynamic2 = dynamic2.set("state", dynamic3);
        }
        int n6 = string.indexOf(125);
        if (n2 != -1 && n6 != -1) {
            dynamic2 = dynamic2.set("nbt", dynamic.createString(string.substring(n2, n6 + 1)));
        }
        return dynamic2;
    }

    private static Dynamic<?> N(Dynamic<?> dynamic, String string, Optional<String> optional) {
        Dynamic dynamic2 = dynamic.emptyMap().set("raw", dynamic.createString(string));
        if (optional.isPresent()) {
            dynamic2 = dynamic2.set("filtered", dynamic.createString(optional.get()));
        }
        return dynamic2;
    }

    private static void N(class02825 class028252) {
        class028252.N("Explosion", true, dynamic -> {
            class028252.N("minecraft:firework_explosion", class02849.R(dynamic));
            return dynamic.remove("Type").remove("Colors").remove("FadeColors").remove("Trail").remove("Flicker");
        });
    }

    private static void N(class02825 class028252, Dynamic<?> dynamic2, String string, String string2, boolean bl) {
        OptionalDynamic<?> var5 = class028252.N(string);
        List list = var5.asList(Function.identity()).stream().flatMap(dynamic -> class02849.L(dynamic).stream()).filter(pair -> (Integer)pair.getSecond() > 0).toList();
        if (!list.isEmpty() || bl) {
            Dynamic dynamic3 = dynamic2.emptyMap();
            Dynamic dynamic4 = dynamic2.emptyMap();
            for (Pair pair2 : list) {
                dynamic4 = dynamic4.set((String)pair2.getFirst(), dynamic2.createInt(((Integer)pair2.getSecond()).intValue()));
            }
            dynamic3 = dynamic3.set("levels", dynamic4);
            if (bl) {
                dynamic3 = dynamic3.set("show_in_tooltip", dynamic2.createBoolean(false));
            }
            class028252.N(string2, dynamic3);
        }
        if (var5.result().isPresent() && list.isEmpty()) {
            class028252.N("minecraft:enchantment_glint_override", dynamic2.createBoolean(true));
        }
    }

    private static Dynamic<?> R(Dynamic<?> dynamic) {
        dynamic = dynamic.set("shape", dynamic.createString(switch (dynamic.get("Type").asInt(0)) {
            default -> "small_ball";
            case 1 -> "large_ball";
            case 2 -> "star";
            case 3 -> "creeper";
            case 4 -> "burst";
        })).remove("Type");
        dynamic = dynamic.renameField("Colors", "colors");
        dynamic = dynamic.renameField("FadeColors", "fade_colors");
        dynamic = dynamic.renameField("Trail", "has_trail");
        dynamic = dynamic.renameField("Flicker", "has_twinkle");
        return dynamic;
    }

    private static void R(class02825 class028252, Dynamic<?> dynamic) {
        Dynamic<?> var2;
        Dynamic dynamic2 = dynamic.emptyMap();
        for (String string : U) {
            var2 = class028252.N(string, dynamic2, string);
        }
        if (!var2.equals((Object)dynamic.emptyMap())) {
            class028252.N("minecraft:bucket_entity_data", var2);
        }
    }

    protected TypeRewriteRule makeRule() {
        return this.writeFixAndRead("ItemStack componentization", this.getInputSchema().getType(class06962.l), this.getOutputSchema().getType(class06962.l), dynamic -> (Dynamic)DataFixUtils.orElse(class02825.N(dynamic).map(class028252 -> {
            class02849.N(class028252, class028252.N);
            return class028252.N();
        }), (Object)dynamic));
    }
}

