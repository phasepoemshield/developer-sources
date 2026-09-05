/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  minecraft.class02269
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.BitSet;
import java.util.Map;
import java.util.Objects;
import minecraft.class02269;

class class05830 {
    static final BitSet N = new BitSet(256);
    static final BitSet y = new BitSet(256);
    static final Dynamic<?> L = class02269.N((String)"minecraft:pumpkin");
    static final Dynamic<?> u = class02269.N((String)"minecraft:podzol", Map.of("snowy", "true"));
    static final Dynamic<?> i = class02269.N((String)"minecraft:grass_block", Map.of("snowy", "true"));
    static final Dynamic<?> R = class02269.N((String)"minecraft:mycelium", Map.of("snowy", "true"));
    static final Dynamic<?> M = class02269.N((String)"minecraft:sunflower", Map.of("half", "upper"));
    static final Dynamic<?> B = class02269.N((String)"minecraft:lilac", Map.of("half", "upper"));
    static final Dynamic<?> Z = class02269.N((String)"minecraft:tall_grass", Map.of("half", "upper"));
    static final Dynamic<?> z = class02269.N((String)"minecraft:large_fern", Map.of("half", "upper"));
    static final Dynamic<?> U = class02269.N((String)"minecraft:rose_bush", Map.of("half", "upper"));
    static final Dynamic<?> E = class02269.N((String)"minecraft:peony", Map.of("half", "upper"));
    static final Map<String, Dynamic<?>> W = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap -> {
        hashMap.put("minecraft:air0", class02269.N((String)"minecraft:flower_pot"));
        hashMap.put("minecraft:red_flower0", class02269.N((String)"minecraft:potted_poppy"));
        hashMap.put("minecraft:red_flower1", class02269.N((String)"minecraft:potted_blue_orchid"));
        hashMap.put("minecraft:red_flower2", class02269.N((String)"minecraft:potted_allium"));
        hashMap.put("minecraft:red_flower3", class02269.N((String)"minecraft:potted_azure_bluet"));
        hashMap.put("minecraft:red_flower4", class02269.N((String)"minecraft:potted_red_tulip"));
        hashMap.put("minecraft:red_flower5", class02269.N((String)"minecraft:potted_orange_tulip"));
        hashMap.put("minecraft:red_flower6", class02269.N((String)"minecraft:potted_white_tulip"));
        hashMap.put("minecraft:red_flower7", class02269.N((String)"minecraft:potted_pink_tulip"));
        hashMap.put("minecraft:red_flower8", class02269.N((String)"minecraft:potted_oxeye_daisy"));
        hashMap.put("minecraft:yellow_flower0", class02269.N((String)"minecraft:potted_dandelion"));
        hashMap.put("minecraft:sapling0", class02269.N((String)"minecraft:potted_oak_sapling"));
        hashMap.put("minecraft:sapling1", class02269.N((String)"minecraft:potted_spruce_sapling"));
        hashMap.put("minecraft:sapling2", class02269.N((String)"minecraft:potted_birch_sapling"));
        hashMap.put("minecraft:sapling3", class02269.N((String)"minecraft:potted_jungle_sapling"));
        hashMap.put("minecraft:sapling4", class02269.N((String)"minecraft:potted_acacia_sapling"));
        hashMap.put("minecraft:sapling5", class02269.N((String)"minecraft:potted_dark_oak_sapling"));
        hashMap.put("minecraft:red_mushroom0", class02269.N((String)"minecraft:potted_red_mushroom"));
        hashMap.put("minecraft:brown_mushroom0", class02269.N((String)"minecraft:potted_brown_mushroom"));
        hashMap.put("minecraft:deadbush0", class02269.N((String)"minecraft:potted_dead_bush"));
        hashMap.put("minecraft:tallgrass2", class02269.N((String)"minecraft:potted_fern"));
        hashMap.put("minecraft:cactus0", class02269.N((String)"minecraft:potted_cactus"));
    });
    static final Map<String, Dynamic<?>> m = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap -> {
        class05830.N(hashMap, 0, "skeleton", "skull");
        class05830.N(hashMap, 1, "wither_skeleton", "skull");
        class05830.N(hashMap, 2, "zombie", "head");
        class05830.N(hashMap, 3, "player", "head");
        class05830.N(hashMap, 4, "creeper", "head");
        class05830.N(hashMap, 5, "dragon", "head");
    });
    static final Map<String, Dynamic<?>> P = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap -> {
        class05830.N(hashMap, "oak_door");
        class05830.N(hashMap, "iron_door");
        class05830.N(hashMap, "spruce_door");
        class05830.N(hashMap, "birch_door");
        class05830.N(hashMap, "jungle_door");
        class05830.N(hashMap, "acacia_door");
        class05830.N(hashMap, "dark_oak_door");
    });
    static final Map<String, Dynamic<?>> s = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap -> {
        for (int i = 0; i < 26; ++i) {
            hashMap.put("true" + i, class02269.N((String)"minecraft:note_block", Map.of("powered", "true", "note", String.valueOf(i))));
            hashMap.put("false" + i, class02269.N((String)"minecraft:note_block", Map.of("powered", "false", "note", String.valueOf(i))));
        }
    });
    private static final Int2ObjectMap<String> v = (Int2ObjectMap)DataFixUtils.make((Object)new Int2ObjectOpenHashMap(), int2ObjectOpenHashMap -> {
        int2ObjectOpenHashMap.put(0, (Object)"white");
        int2ObjectOpenHashMap.put(1, (Object)"orange");
        int2ObjectOpenHashMap.put(2, (Object)"magenta");
        int2ObjectOpenHashMap.put(3, (Object)"light_blue");
        int2ObjectOpenHashMap.put(4, (Object)"yellow");
        int2ObjectOpenHashMap.put(5, (Object)"lime");
        int2ObjectOpenHashMap.put(6, (Object)"pink");
        int2ObjectOpenHashMap.put(7, (Object)"gray");
        int2ObjectOpenHashMap.put(8, (Object)"light_gray");
        int2ObjectOpenHashMap.put(9, (Object)"cyan");
        int2ObjectOpenHashMap.put(10, (Object)"purple");
        int2ObjectOpenHashMap.put(11, (Object)"blue");
        int2ObjectOpenHashMap.put(12, (Object)"brown");
        int2ObjectOpenHashMap.put(13, (Object)"green");
        int2ObjectOpenHashMap.put(14, (Object)"red");
        int2ObjectOpenHashMap.put(15, (Object)"black");
    });
    static final Map<String, Dynamic<?>> T = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap -> {
        for (Int2ObjectMap.Entry entry : v.int2ObjectEntrySet()) {
            if (Objects.equals(entry.getValue(), "red")) continue;
            class05830.N(hashMap, entry.getIntKey(), (String)entry.getValue());
        }
    });
    static final Map<String, Dynamic<?>> b = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap -> {
        for (Int2ObjectMap.Entry entry : v.int2ObjectEntrySet()) {
            if (Objects.equals(entry.getValue(), "white")) continue;
            class05830.y(hashMap, 15 - entry.getIntKey(), (String)entry.getValue());
        }
    });
    static final Dynamic<?> j;

    private class05830() {
    }

    static {
        y.set(2);
        y.set(3);
        y.set(110);
        y.set(140);
        y.set(144);
        y.set(25);
        y.set(86);
        y.set(26);
        y.set(176);
        y.set(177);
        y.set(175);
        y.set(64);
        y.set(71);
        y.set(193);
        y.set(194);
        y.set(195);
        y.set(196);
        y.set(197);
        N.set(54);
        N.set(146);
        N.set(25);
        N.set(26);
        N.set(51);
        N.set(53);
        N.set(67);
        N.set(108);
        N.set(109);
        N.set(114);
        N.set(128);
        N.set(134);
        N.set(135);
        N.set(136);
        N.set(156);
        N.set(163);
        N.set(164);
        N.set(180);
        N.set(203);
        N.set(55);
        N.set(85);
        N.set(113);
        N.set(188);
        N.set(189);
        N.set(190);
        N.set(191);
        N.set(192);
        N.set(93);
        N.set(94);
        N.set(101);
        N.set(102);
        N.set(160);
        N.set(106);
        N.set(107);
        N.set(183);
        N.set(184);
        N.set(185);
        N.set(186);
        N.set(187);
        N.set(132);
        N.set(139);
        N.set(199);
        j = class02269.N((String)"minecraft:air");
    }

    private static void y(Map<String, Dynamic<?>> map, int n, String string) {
        for (int i = 0; i < 16; ++i) {
            map.put(i + "_" + n, class02269.N((String)("minecraft:" + string + "_banner"), Map.of("rotation", String.valueOf(i))));
        }
        map.put("north_" + n, class02269.N((String)("minecraft:" + string + "_wall_banner"), Map.of("facing", "north")));
        map.put("south_" + n, class02269.N((String)("minecraft:" + string + "_wall_banner"), Map.of("facing", "south")));
        map.put("west_" + n, class02269.N((String)("minecraft:" + string + "_wall_banner"), Map.of("facing", "west")));
        map.put("east_" + n, class02269.N((String)("minecraft:" + string + "_wall_banner"), Map.of("facing", "east")));
    }

    private static void N(Map<String, Dynamic<?>> map, int n, String string) {
        map.put("southfalsefoot" + n, class02269.N((String)("minecraft:" + string + "_bed"), Map.of("facing", "south", "occupied", "false", "part", "foot")));
        map.put("westfalsefoot" + n, class02269.N((String)("minecraft:" + string + "_bed"), Map.of("facing", "west", "occupied", "false", "part", "foot")));
        map.put("northfalsefoot" + n, class02269.N((String)("minecraft:" + string + "_bed"), Map.of("facing", "north", "occupied", "false", "part", "foot")));
        map.put("eastfalsefoot" + n, class02269.N((String)("minecraft:" + string + "_bed"), Map.of("facing", "east", "occupied", "false", "part", "foot")));
        map.put("southfalsehead" + n, class02269.N((String)("minecraft:" + string + "_bed"), Map.of("facing", "south", "occupied", "false", "part", "head")));
        map.put("westfalsehead" + n, class02269.N((String)("minecraft:" + string + "_bed"), Map.of("facing", "west", "occupied", "false", "part", "head")));
        map.put("northfalsehead" + n, class02269.N((String)("minecraft:" + string + "_bed"), Map.of("facing", "north", "occupied", "false", "part", "head")));
        map.put("eastfalsehead" + n, class02269.N((String)("minecraft:" + string + "_bed"), Map.of("facing", "east", "occupied", "false", "part", "head")));
        map.put("southtruehead" + n, class02269.N((String)("minecraft:" + string + "_bed"), Map.of("facing", "south", "occupied", "true", "part", "head")));
        map.put("westtruehead" + n, class02269.N((String)("minecraft:" + string + "_bed"), Map.of("facing", "west", "occupied", "true", "part", "head")));
        map.put("northtruehead" + n, class02269.N((String)("minecraft:" + string + "_bed"), Map.of("facing", "north", "occupied", "true", "part", "head")));
        map.put("easttruehead" + n, class02269.N((String)("minecraft:" + string + "_bed"), Map.of("facing", "east", "occupied", "true", "part", "head")));
    }

    private static void N(Map<String, Dynamic<?>> map, int n, String string, String string2) {
        map.put(n + "north", class02269.N((String)("minecraft:" + string + "_wall_" + string2), Map.of("facing", "north")));
        map.put(n + "east", class02269.N((String)("minecraft:" + string + "_wall_" + string2), Map.of("facing", "east")));
        map.put(n + "south", class02269.N((String)("minecraft:" + string + "_wall_" + string2), Map.of("facing", "south")));
        map.put(n + "west", class02269.N((String)("minecraft:" + string + "_wall_" + string2), Map.of("facing", "west")));
        for (int i = 0; i < 16; ++i) {
            map.put("" + n + i, class02269.N((String)("minecraft:" + string + "_" + string2), Map.of("rotation", String.valueOf(i))));
        }
    }

    private static void N(Map<String, Dynamic<?>> map, String string) {
        String string2 = "minecraft:" + string;
        map.put("minecraft:" + string + "eastlowerleftfalsefalse", class02269.N((String)string2, Map.of("facing", "east", "half", "lower", "hinge", "left", "open", "false", "powered", "false")));
        map.put("minecraft:" + string + "eastlowerleftfalsetrue", class02269.N((String)string2, Map.of("facing", "east", "half", "lower", "hinge", "left", "open", "false", "powered", "true")));
        map.put("minecraft:" + string + "eastlowerlefttruefalse", class02269.N((String)string2, Map.of("facing", "east", "half", "lower", "hinge", "left", "open", "true", "powered", "false")));
        map.put("minecraft:" + string + "eastlowerlefttruetrue", class02269.N((String)string2, Map.of("facing", "east", "half", "lower", "hinge", "left", "open", "true", "powered", "true")));
        map.put("minecraft:" + string + "eastlowerrightfalsefalse", class02269.N((String)string2, Map.of("facing", "east", "half", "lower", "hinge", "right", "open", "false", "powered", "false")));
        map.put("minecraft:" + string + "eastlowerrightfalsetrue", class02269.N((String)string2, Map.of("facing", "east", "half", "lower", "hinge", "right", "open", "false", "powered", "true")));
        map.put("minecraft:" + string + "eastlowerrighttruefalse", class02269.N((String)string2, Map.of("facing", "east", "half", "lower", "hinge", "right", "open", "true", "powered", "false")));
        map.put("minecraft:" + string + "eastlowerrighttruetrue", class02269.N((String)string2, Map.of("facing", "east", "half", "lower", "hinge", "right", "open", "true", "powered", "true")));
        map.put("minecraft:" + string + "eastupperleftfalsefalse", class02269.N((String)string2, Map.of("facing", "east", "half", "upper", "hinge", "left", "open", "false", "powered", "false")));
        map.put("minecraft:" + string + "eastupperleftfalsetrue", class02269.N((String)string2, Map.of("facing", "east", "half", "upper", "hinge", "left", "open", "false", "powered", "true")));
        map.put("minecraft:" + string + "eastupperlefttruefalse", class02269.N((String)string2, Map.of("facing", "east", "half", "upper", "hinge", "left", "open", "true", "powered", "false")));
        map.put("minecraft:" + string + "eastupperlefttruetrue", class02269.N((String)string2, Map.of("facing", "east", "half", "upper", "hinge", "left", "open", "true", "powered", "true")));
        map.put("minecraft:" + string + "eastupperrightfalsefalse", class02269.N((String)string2, Map.of("facing", "east", "half", "upper", "hinge", "right", "open", "false", "powered", "false")));
        map.put("minecraft:" + string + "eastupperrightfalsetrue", class02269.N((String)string2, Map.of("facing", "east", "half", "upper", "hinge", "right", "open", "false", "powered", "true")));
        map.put("minecraft:" + string + "eastupperrighttruefalse", class02269.N((String)string2, Map.of("facing", "east", "half", "upper", "hinge", "right", "open", "true", "powered", "false")));
        map.put("minecraft:" + string + "eastupperrighttruetrue", class02269.N((String)string2, Map.of("facing", "east", "half", "upper", "hinge", "right", "open", "true", "powered", "true")));
        map.put("minecraft:" + string + "northlowerleftfalsefalse", class02269.N((String)string2, Map.of("facing", "north", "half", "lower", "hinge", "left", "open", "false", "powered", "false")));
        map.put("minecraft:" + string + "northlowerleftfalsetrue", class02269.N((String)string2, Map.of("facing", "north", "half", "lower", "hinge", "left", "open", "false", "powered", "true")));
        map.put("minecraft:" + string + "northlowerlefttruefalse", class02269.N((String)string2, Map.of("facing", "north", "half", "lower", "hinge", "left", "open", "true", "powered", "false")));
        map.put("minecraft:" + string + "northlowerlefttruetrue", class02269.N((String)string2, Map.of("facing", "north", "half", "lower", "hinge", "left", "open", "true", "powered", "true")));
        map.put("minecraft:" + string + "northlowerrightfalsefalse", class02269.N((String)string2, Map.of("facing", "north", "half", "lower", "hinge", "right", "open", "false", "powered", "false")));
        map.put("minecraft:" + string + "northlowerrightfalsetrue", class02269.N((String)string2, Map.of("facing", "north", "half", "lower", "hinge", "right", "open", "false", "powered", "true")));
        map.put("minecraft:" + string + "northlowerrighttruefalse", class02269.N((String)string2, Map.of("facing", "north", "half", "lower", "hinge", "right", "open", "true", "powered", "false")));
        map.put("minecraft:" + string + "northlowerrighttruetrue", class02269.N((String)string2, Map.of("facing", "north", "half", "lower", "hinge", "right", "open", "true", "powered", "true")));
        map.put("minecraft:" + string + "northupperleftfalsefalse", class02269.N((String)string2, Map.of("facing", "north", "half", "upper", "hinge", "left", "open", "false", "powered", "false")));
        map.put("minecraft:" + string + "northupperleftfalsetrue", class02269.N((String)string2, Map.of("facing", "north", "half", "upper", "hinge", "left", "open", "false", "powered", "true")));
        map.put("minecraft:" + string + "northupperlefttruefalse", class02269.N((String)string2, Map.of("facing", "north", "half", "upper", "hinge", "left", "open", "true", "powered", "false")));
        map.put("minecraft:" + string + "northupperlefttruetrue", class02269.N((String)string2, Map.of("facing", "north", "half", "upper", "hinge", "left", "open", "true", "powered", "true")));
        map.put("minecraft:" + string + "northupperrightfalsefalse", class02269.N((String)string2, Map.of("facing", "north", "half", "upper", "hinge", "right", "open", "false", "powered", "false")));
        map.put("minecraft:" + string + "northupperrightfalsetrue", class02269.N((String)string2, Map.of("facing", "north", "half", "upper", "hinge", "right", "open", "false", "powered", "true")));
        map.put("minecraft:" + string + "northupperrighttruefalse", class02269.N((String)string2, Map.of("facing", "north", "half", "upper", "hinge", "right", "open", "true", "powered", "false")));
        map.put("minecraft:" + string + "northupperrighttruetrue", class02269.N((String)string2, Map.of("facing", "north", "half", "upper", "hinge", "right", "open", "true", "powered", "true")));
        map.put("minecraft:" + string + "southlowerleftfalsefalse", class02269.N((String)string2, Map.of("facing", "south", "half", "lower", "hinge", "left", "open", "false", "powered", "false")));
        map.put("minecraft:" + string + "southlowerleftfalsetrue", class02269.N((String)string2, Map.of("facing", "south", "half", "lower", "hinge", "left", "open", "false", "powered", "true")));
        map.put("minecraft:" + string + "southlowerlefttruefalse", class02269.N((String)string2, Map.of("facing", "south", "half", "lower", "hinge", "left", "open", "true", "powered", "false")));
        map.put("minecraft:" + string + "southlowerlefttruetrue", class02269.N((String)string2, Map.of("facing", "south", "half", "lower", "hinge", "left", "open", "true", "powered", "true")));
        map.put("minecraft:" + string + "southlowerrightfalsefalse", class02269.N((String)string2, Map.of("facing", "south", "half", "lower", "hinge", "right", "open", "false", "powered", "false")));
        map.put("minecraft:" + string + "southlowerrightfalsetrue", class02269.N((String)string2, Map.of("facing", "south", "half", "lower", "hinge", "right", "open", "false", "powered", "true")));
        map.put("minecraft:" + string + "southlowerrighttruefalse", class02269.N((String)string2, Map.of("facing", "south", "half", "lower", "hinge", "right", "open", "true", "powered", "false")));
        map.put("minecraft:" + string + "southlowerrighttruetrue", class02269.N((String)string2, Map.of("facing", "south", "half", "lower", "hinge", "right", "open", "true", "powered", "true")));
        map.put("minecraft:" + string + "southupperleftfalsefalse", class02269.N((String)string2, Map.of("facing", "south", "half", "upper", "hinge", "left", "open", "false", "powered", "false")));
        map.put("minecraft:" + string + "southupperleftfalsetrue", class02269.N((String)string2, Map.of("facing", "south", "half", "upper", "hinge", "left", "open", "false", "powered", "true")));
        map.put("minecraft:" + string + "southupperlefttruefalse", class02269.N((String)string2, Map.of("facing", "south", "half", "upper", "hinge", "left", "open", "true", "powered", "false")));
        map.put("minecraft:" + string + "southupperlefttruetrue", class02269.N((String)string2, Map.of("facing", "south", "half", "upper", "hinge", "left", "open", "true", "powered", "true")));
        map.put("minecraft:" + string + "southupperrightfalsefalse", class02269.N((String)string2, Map.of("facing", "south", "half", "upper", "hinge", "right", "open", "false", "powered", "false")));
        map.put("minecraft:" + string + "southupperrightfalsetrue", class02269.N((String)string2, Map.of("facing", "south", "half", "upper", "hinge", "right", "open", "false", "powered", "true")));
        map.put("minecraft:" + string + "southupperrighttruefalse", class02269.N((String)string2, Map.of("facing", "south", "half", "upper", "hinge", "right", "open", "true", "powered", "false")));
        map.put("minecraft:" + string + "southupperrighttruetrue", class02269.N((String)string2, Map.of("facing", "south", "half", "upper", "hinge", "right", "open", "true", "powered", "true")));
        map.put("minecraft:" + string + "westlowerleftfalsefalse", class02269.N((String)string2, Map.of("facing", "west", "half", "lower", "hinge", "left", "open", "false", "powered", "false")));
        map.put("minecraft:" + string + "westlowerleftfalsetrue", class02269.N((String)string2, Map.of("facing", "west", "half", "lower", "hinge", "left", "open", "false", "powered", "true")));
        map.put("minecraft:" + string + "westlowerlefttruefalse", class02269.N((String)string2, Map.of("facing", "west", "half", "lower", "hinge", "left", "open", "true", "powered", "false")));
        map.put("minecraft:" + string + "westlowerlefttruetrue", class02269.N((String)string2, Map.of("facing", "west", "half", "lower", "hinge", "left", "open", "true", "powered", "true")));
        map.put("minecraft:" + string + "westlowerrightfalsefalse", class02269.N((String)string2, Map.of("facing", "west", "half", "lower", "hinge", "right", "open", "false", "powered", "false")));
        map.put("minecraft:" + string + "westlowerrightfalsetrue", class02269.N((String)string2, Map.of("facing", "west", "half", "lower", "hinge", "right", "open", "false", "powered", "true")));
        map.put("minecraft:" + string + "westlowerrighttruefalse", class02269.N((String)string2, Map.of("facing", "west", "half", "lower", "hinge", "right", "open", "true", "powered", "false")));
        map.put("minecraft:" + string + "westlowerrighttruetrue", class02269.N((String)string2, Map.of("facing", "west", "half", "lower", "hinge", "right", "open", "true", "powered", "true")));
        map.put("minecraft:" + string + "westupperleftfalsefalse", class02269.N((String)string2, Map.of("facing", "west", "half", "upper", "hinge", "left", "open", "false", "powered", "false")));
        map.put("minecraft:" + string + "westupperleftfalsetrue", class02269.N((String)string2, Map.of("facing", "west", "half", "upper", "hinge", "left", "open", "false", "powered", "true")));
        map.put("minecraft:" + string + "westupperlefttruefalse", class02269.N((String)string2, Map.of("facing", "west", "half", "upper", "hinge", "left", "open", "true", "powered", "false")));
        map.put("minecraft:" + string + "westupperlefttruetrue", class02269.N((String)string2, Map.of("facing", "west", "half", "upper", "hinge", "left", "open", "true", "powered", "true")));
        map.put("minecraft:" + string + "westupperrightfalsefalse", class02269.N((String)string2, Map.of("facing", "west", "half", "upper", "hinge", "right", "open", "false", "powered", "false")));
        map.put("minecraft:" + string + "westupperrightfalsetrue", class02269.N((String)string2, Map.of("facing", "west", "half", "upper", "hinge", "right", "open", "false", "powered", "true")));
        map.put("minecraft:" + string + "westupperrighttruefalse", class02269.N((String)string2, Map.of("facing", "west", "half", "upper", "hinge", "right", "open", "true", "powered", "false")));
        map.put("minecraft:" + string + "westupperrighttruetrue", class02269.N((String)string2, Map.of("facing", "west", "half", "upper", "hinge", "right", "open", "true", "powered", "true")));
    }
}

