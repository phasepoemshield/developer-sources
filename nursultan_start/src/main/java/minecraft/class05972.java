/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicLike
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.OptionalDynamic
 *  minecraft.class06962
 *  org.apache.commons.lang3.math.NumberUtils
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.apache.commons.lang3.mutable.MutableInt
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicLike;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.OptionalDynamic;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class05948;
import minecraft.class06962;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableInt;

public class class05972
extends DataFix {
    private static final String N = "minecraft:village";
    private static final String y = "minecraft:desert_pyramid";
    private static final String L = "minecraft:igloo";
    private static final String u = "minecraft:jungle_pyramid";
    private static final String i = "minecraft:swamp_hut";
    private static final String R = "minecraft:pillager_outpost";
    private static final String M = "minecraft:endcity";
    private static final String B = "minecraft:mansion";
    private static final String Z = "minecraft:monument";
    private static final ImmutableMap<String, class05948> z = ImmutableMap.builder().put((Object)"minecraft:village", (Object)new class05948(32, 8, 10387312)).put((Object)"minecraft:desert_pyramid", (Object)new class05948(32, 8, 14357617)).put((Object)"minecraft:igloo", (Object)new class05948(32, 8, 14357618)).put((Object)"minecraft:jungle_pyramid", (Object)new class05948(32, 8, 14357619)).put((Object)"minecraft:swamp_hut", (Object)new class05948(32, 8, 14357620)).put((Object)"minecraft:pillager_outpost", (Object)new class05948(32, 8, 165745296)).put((Object)"minecraft:monument", (Object)new class05948(32, 5, 10387313)).put((Object)"minecraft:endcity", (Object)new class05948(20, 11, 10387313)).put((Object)"minecraft:mansion", (Object)new class05948(80, 20, 10387319)).build();

    public class05972(Schema schema) {
        super(schema, true);
    }

    private static /* synthetic */ void N(ImmutableMap.Builder builder, DynamicOps dynamicOps, String string) {
        builder.put(dynamicOps.createString("legacy_custom_options"), dynamicOps.createString(string));
    }

    private static <T> Dynamic<T> N(Dynamic<T> dynamic, long l, boolean bl, boolean bl2) {
        ImmutableMap.Builder builder = ImmutableMap.builder().put((Object)dynamic.createString("type"), (Object)dynamic.createString("minecraft:vanilla_layered")).put((Object)dynamic.createString("seed"), (Object)dynamic.createLong(l)).put((Object)dynamic.createString("large_biomes"), (Object)dynamic.createBoolean(bl2));
        if (bl) {
            builder.put((Object)dynamic.createString("legacy_biome_init_layer"), (Object)dynamic.createBoolean(bl));
        }
        return dynamic.createMap((Map)builder.build());
    }

    private static <T> Map<Dynamic<T>, Dynamic<T>> N(DynamicOps<T> dynamicOps, OptionalDynamic<T> optionalDynamic) {
        MutableInt mutableInt = new MutableInt(32);
        MutableInt mutableInt2 = new MutableInt(3);
        MutableInt mutableInt3 = new MutableInt(128);
        MutableBoolean mutableBoolean = new MutableBoolean(false);
        HashMap hashMap = Maps.newHashMap();
        if (optionalDynamic.result().isEmpty()) {
            mutableBoolean.setTrue();
            hashMap.put(N, (class05948)z.get((Object)N));
        }
        optionalDynamic.get("structures").flatMap(Dynamic::getMapValues).ifSuccess(map2 -> map2.forEach((dynamic, dynamic2) -> dynamic2.getMapValues().result().ifPresent(map2 -> map2.forEach((dynamic2, dynamic3) -> {
            String string = dynamic.asString("");
            String string2 = dynamic2.asString("");
            String string3 = dynamic3.asString("");
            if ("stronghold".equals(string)) {
                mutableBoolean.setTrue();
                switch (string2) {
                    case "distance": {
                        mutableInt.setValue(class05972.N(string3, mutableInt.intValue(), 1));
                        return;
                    }
                    case "spread": {
                        mutableInt2.setValue(class05972.N(string3, mutableInt2.intValue(), 1));
                        return;
                    }
                    case "count": {
                        mutableInt3.setValue(class05972.N(string3, mutableInt3.intValue(), 1));
                        return;
                    }
                }
                return;
            }
            switch (string2) {
                case "distance": {
                    switch (string) {
                        case "village": {
                            class05972.N(hashMap, N, string3, 9);
                            return;
                        }
                        case "biome_1": {
                            class05972.N(hashMap, y, string3, 9);
                            class05972.N(hashMap, L, string3, 9);
                            class05972.N(hashMap, u, string3, 9);
                            class05972.N(hashMap, i, string3, 9);
                            class05972.N(hashMap, R, string3, 9);
                            return;
                        }
                        case "endcity": {
                            class05972.N(hashMap, M, string3, 1);
                            return;
                        }
                        case "mansion": {
                            class05972.N(hashMap, B, string3, 1);
                            return;
                        }
                    }
                    return;
                }
                case "separation": {
                    if ("oceanmonument".equals(string)) {
                        class05948 class059482 = hashMap.getOrDefault(Z, (class05948)z.get((Object)Z));
                        int n = class05972.N(string3, class059482.L, 1);
                        hashMap.put(Z, new class05948(n, class059482.L, class059482.u));
                    }
                    return;
                }
                case "spacing": {
                    if ("oceanmonument".equals(string)) {
                        class05972.N(hashMap, Z, string3, 1);
                    }
                    return;
                }
            }
        }))));
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.put((Object)optionalDynamic.createString("structures"), (Object)optionalDynamic.createMap(hashMap.entrySet().stream().collect(Collectors.toMap(entry -> optionalDynamic.createString((String)entry.getKey()), entry -> ((class05948)entry.getValue()).N(dynamicOps)))));
        if (mutableBoolean.isTrue()) {
            builder.put((Object)optionalDynamic.createString("stronghold"), (Object)optionalDynamic.createMap((Map)ImmutableMap.of((Object)optionalDynamic.createString("distance"), (Object)optionalDynamic.createInt(mutableInt.intValue()), (Object)optionalDynamic.createString("spread"), (Object)optionalDynamic.createInt(mutableInt2.intValue()), (Object)optionalDynamic.createString("count"), (Object)optionalDynamic.createInt(mutableInt3.intValue()))));
        }
        return builder.build();
    }

    protected static <T> T N(Dynamic<T> dynamic, long l, Dynamic<T> dynamic2, boolean bl) {
        DynamicOps dynamicOps = dynamic.getOps();
        return (T)dynamicOps.createMap((Map)ImmutableMap.of((Object)dynamicOps.createString("minecraft:overworld"), (Object)dynamicOps.createMap((Map)ImmutableMap.of((Object)dynamicOps.createString("type"), (Object)dynamicOps.createString("minecraft:overworld" + (bl ? "_caves" : "")), (Object)dynamicOps.createString("generator"), (Object)dynamic2.getValue())), (Object)dynamicOps.createString("minecraft:the_nether"), (Object)dynamicOps.createMap((Map)ImmutableMap.of((Object)dynamicOps.createString("type"), (Object)dynamicOps.createString("minecraft:the_nether"), (Object)dynamicOps.createString("generator"), (Object)class05972.N(l, dynamic, dynamic.createString("minecraft:nether"), dynamic.createMap((Map)ImmutableMap.of((Object)dynamic.createString("type"), (Object)dynamic.createString("minecraft:multi_noise"), (Object)dynamic.createString("seed"), (Object)dynamic.createLong(l), (Object)dynamic.createString("preset"), (Object)dynamic.createString("minecraft:nether")))).getValue())), (Object)dynamicOps.createString("minecraft:the_end"), (Object)dynamicOps.createMap((Map)ImmutableMap.of((Object)dynamicOps.createString("type"), (Object)dynamicOps.createString("minecraft:the_end"), (Object)dynamicOps.createString("generator"), (Object)class05972.N(l, dynamic, dynamic.createString("minecraft:end"), dynamic.createMap((Map)ImmutableMap.of((Object)dynamic.createString("type"), (Object)dynamic.createString("minecraft:the_end"), (Object)dynamic.createString("seed"), (Object)dynamic.createLong(l)))).getValue()))));
    }

    protected static <T> Dynamic<T> N(Dynamic<T> dynamic, long l) {
        return class05972.N(l, dynamic, dynamic.createString("minecraft:overworld"), class05972.N(dynamic, l, false, false));
    }

    private static <T> Dynamic<T> N(Dynamic<T> dynamic2) {
        OptionalDynamic optionalDynamic;
        Dynamic dynamic3;
        DynamicOps dynamicOps = dynamic2.getOps();
        long l = dynamic2.get("RandomSeed").asLong(0L);
        Optional optional = dynamic2.get("generatorName").asString().map(string -> string.toLowerCase(Locale.ROOT)).result();
        Optional optional2 = dynamic2.get("legacy_custom_options").asString().result().map(Optional::of).orElseGet(() -> {
            if (optional.equals(Optional.of("customized"))) {
                return dynamic2.get("generatorOptions").asString().result();
            }
            return Optional.empty();
        });
        boolean bl = false;
        if (optional.equals(Optional.of("customized"))) {
            dynamic3 = class05972.N(dynamic2, l);
        } else if (optional.isEmpty()) {
            dynamic3 = class05972.N(dynamic2, l);
        } else {
            switch ((String)optional.get()) {
                case "flat": {
                    optionalDynamic = dynamic2.get("generatorOptions");
                    Map<Dynamic<T>, Dynamic<T>> map = class05972.N(dynamicOps, optionalDynamic);
                    dynamic3 = dynamic2.createMap((Map)ImmutableMap.of((Object)dynamic2.createString("type"), (Object)dynamic2.createString("minecraft:flat"), (Object)dynamic2.createString("settings"), (Object)dynamic2.createMap((Map)ImmutableMap.of((Object)dynamic2.createString("structures"), (Object)dynamic2.createMap(map), (Object)dynamic2.createString("layers"), (Object)optionalDynamic.get("layers").result().orElseGet(() -> dynamic2.createList(Stream.of(dynamic2.createMap((Map)ImmutableMap.of((Object)dynamic2.createString("height"), (Object)dynamic2.createInt(1), (Object)dynamic2.createString("block"), (Object)dynamic2.createString("minecraft:bedrock"))), dynamic2.createMap((Map)ImmutableMap.of((Object)dynamic2.createString("height"), (Object)dynamic2.createInt(2), (Object)dynamic2.createString("block"), (Object)dynamic2.createString("minecraft:dirt"))), dynamic2.createMap((Map)ImmutableMap.of((Object)dynamic2.createString("height"), (Object)dynamic2.createInt(1), (Object)dynamic2.createString("block"), (Object)dynamic2.createString("minecraft:grass_block")))))), (Object)dynamic2.createString("biome"), (Object)dynamic2.createString(optionalDynamic.get("biome").asString("minecraft:plains"))))));
                    break;
                }
                case "debug_all_block_states": {
                    dynamic3 = dynamic2.createMap((Map)ImmutableMap.of((Object)dynamic2.createString("type"), (Object)dynamic2.createString("minecraft:debug")));
                    break;
                }
                case "buffet": {
                    Dynamic dynamic4;
                    Dynamic dynamic5;
                    OptionalDynamic optionalDynamic2 = dynamic2.get("generatorOptions");
                    Optional optional3 = optionalDynamic2.get("chunk_generator").get("type").asString().result();
                    if (Objects.equals(optional3, Optional.of("minecraft:caves"))) {
                        dynamic5 = dynamic2.createString("minecraft:caves");
                        bl = true;
                    } else {
                        dynamic5 = Objects.equals(optional3, Optional.of("minecraft:floating_islands")) ? dynamic2.createString("minecraft:floating_islands") : dynamic2.createString("minecraft:overworld");
                    }
                    Dynamic dynamic6 = optionalDynamic2.get("biome_source").result().orElseGet(() -> dynamic2.createMap((Map)ImmutableMap.of((Object)dynamic2.createString("type"), (Object)dynamic2.createString("minecraft:fixed"))));
                    if (dynamic6.get("type").asString().result().equals(Optional.of("minecraft:fixed"))) {
                        String string2 = dynamic6.get("options").get("biomes").asStream().findFirst().flatMap(dynamic -> dynamic.asString().result()).orElse("minecraft:ocean");
                        dynamic4 = dynamic6.remove("options").set("biome", dynamic2.createString(string2));
                    } else {
                        dynamic4 = dynamic6;
                    }
                    dynamic3 = class05972.N(l, dynamic2, dynamic5, dynamic4);
                    break;
                }
                default: {
                    boolean bl2 = ((String)optional.get()).equals("default");
                    boolean bl3 = ((String)optional.get()).equals("default_1_1") || bl2 && dynamic2.get("generatorVersion").asInt(0) == 0;
                    boolean bl4 = ((String)optional.get()).equals("amplified");
                    boolean bl5 = ((String)optional.get()).equals("largebiomes");
                    dynamic3 = class05972.N(l, dynamic2, dynamic2.createString(bl4 ? "minecraft:amplified" : "minecraft:overworld"), class05972.N(dynamic2, l, bl3, bl5));
                }
            }
        }
        boolean bl6 = dynamic2.get("MapFeatures").asBoolean(true);
        boolean bl7 = dynamic2.get("BonusChest").asBoolean(false);
        optionalDynamic = ImmutableMap.builder();
        optionalDynamic.put(dynamicOps.createString("seed"), dynamicOps.createLong(l));
        optionalDynamic.put(dynamicOps.createString("generate_features"), dynamicOps.createBoolean(bl6));
        optionalDynamic.put(dynamicOps.createString("bonus_chest"), dynamicOps.createBoolean(bl7));
        optionalDynamic.put(dynamicOps.createString("dimensions"), class05972.N(dynamic2, l, dynamic3, bl));
        optional2.ifPresent(arg_0 -> class05972.N((ImmutableMap.Builder)optionalDynamic, dynamicOps, arg_0));
        return new Dynamic(dynamicOps, dynamicOps.createMap((Map)optionalDynamic.build()));
    }

    private static <T> Dynamic<T> N(long l, DynamicLike<T> dynamicLike, Dynamic<T> dynamic, Dynamic<T> dynamic2) {
        return dynamicLike.createMap((Map)ImmutableMap.of((Object)dynamicLike.createString("type"), (Object)dynamicLike.createString("minecraft:noise"), (Object)dynamicLike.createString("biome_source"), dynamic2, (Object)dynamicLike.createString("seed"), (Object)dynamicLike.createLong(l), (Object)dynamicLike.createString("settings"), dynamic));
    }

    private static void N(Map<String, class05948> map, String string, String string2, int n) {
        class05948 class059482 = map.getOrDefault(string, (class05948)z.get((Object)string));
        int n2 = class05972.N(string2, class059482.y, n);
        map.put(string, new class05948(n2, class059482.L, class059482.u));
    }

    private static int N(String string, int n, int n2) {
        return Math.max(n2, class05972.N(string, n));
    }

    private static int N(String string, int n) {
        return NumberUtils.toInt((String)string, (int)n);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("WorldGenSettings building", this.getInputSchema().getType(class06962.A), typed -> typed.update(DSL.remainderFinder(), class05972::N));
    }
}

