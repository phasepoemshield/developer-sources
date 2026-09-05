/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.OptionalDynamic
 *  it.unimi.dsi.fastutil.ints.Int2IntFunction
 *  it.unimi.dsi.fastutil.ints.Int2IntLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 *  minecraft.class03021
 *  minecraft.class06962
 *  minecraft.class07529
 *  minecraft.class07536
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import it.unimi.dsi.fastutil.ints.Int2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import minecraft.class03021;
import minecraft.class06962;
import minecraft.class07529;
import minecraft.class07536;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public class class03316
extends DataFix {
    public static final String N = "__context";
    private static final String u = "ChunkHeightAndBiomeFix";
    private static final int i = 16;
    private static final int R = 24;
    private static final int M = -4;
    public static final int y = 4096;
    private static final int B = 64;
    private static final int Z = 9;
    private static final long z = 511L;
    private static final int U = 64;
    private static final String[] E = new String[]{"WORLD_SURFACE_WG", "WORLD_SURFACE", "WORLD_SURFACE_IGNORE_SNOW", "OCEAN_FLOOR_WG", "OCEAN_FLOOR", "MOTION_BLOCKING", "MOTION_BLOCKING_NO_LEAVES"};
    private static final Set<String> W = Set.of("surface", "carvers", "liquid_carvers", "features", "light", "spawn", "heightmaps", "full");
    private static final Set<String> m = Set.of("noise", "surface", "carvers", "liquid_carvers", "features", "light", "spawn", "heightmaps", "full");
    private static final Set<String> P = Set.of("minecraft:air", "minecraft:basalt", "minecraft:bedrock", "minecraft:blackstone", "minecraft:calcite", "minecraft:cave_air", "minecraft:coarse_dirt", "minecraft:crimson_nylium", "minecraft:dirt", "minecraft:end_stone", "minecraft:grass_block", "minecraft:gravel", "minecraft:ice", "minecraft:lava", "minecraft:mycelium", "minecraft:nether_wart_block", "minecraft:netherrack", "minecraft:orange_terracotta", "minecraft:packed_ice", "minecraft:podzol", "minecraft:powder_snow", "minecraft:red_sand", "minecraft:red_sandstone", "minecraft:sand", "minecraft:sandstone", "minecraft:snow_block", "minecraft:soul_sand", "minecraft:soul_soil", "minecraft:stone", "minecraft:terracotta", "minecraft:warped_nylium", "minecraft:warped_wart_block", "minecraft:water", "minecraft:white_terracotta");
    private static final int s = 16;
    private static final int T = 64;
    private static final int b = 1008;
    public static final String L = "minecraft:plains";
    private static final Int2ObjectMap<String> j = new Int2ObjectOpenHashMap();

    private static Dynamic<?> L(Dynamic<?> dynamic) {
        return dynamic.createLongList(dynamic.asLongStream().map(l -> {
            long l2 = 0L;
            int n = 0;
            while (n + 9 <= 64) {
                long l3 = l >> n & 0x1FFL;
                long l4 = l3 == 0L ? 0L : Math.min(l3 + 64L, 511L);
                l2 |= l4 << n;
                n += 9;
            }
            return l2;
        }));
    }

    public class03316(Schema schema) {
        super(schema, true);
    }

    private static Dynamic<?> u(Dynamic<?> dynamic) {
        return dynamic.createMap((Map)ImmutableMap.of((Object)dynamic.createString("palette"), dynamic));
    }

    private static Dynamic<?> y(Dynamic<?> dynamic, Dynamic<?> dynamic2) {
        List list = dynamic.asStream().collect(Collectors.toCollection(ArrayList::new));
        if (list.size() == 1) {
            return class03316.u(dynamic);
        }
        Dynamic<?> var0 = class03316.N(dynamic, dynamic2, list);
        return class03316.N(var0, dynamic2);
    }

    private static Dynamic<?> y(Dynamic<?> dynamic2) {
        return dynamic2.update("Heightmaps", dynamic -> {
            for (String string : E) {
                dynamic = dynamic.update(string, class03316::L);
            }
            return dynamic;
        });
    }

    private static Dynamic<?>[] N(Dynamic<?> dynamic, boolean bl, int n3, MutableBoolean mutableBoolean) {
        Object[] objectArray = new Dynamic[bl ? 24 : 16];
        int[] nArray = dynamic.get("Biomes").asIntStreamOpt().result().map(IntStream::toArray).orElse(null);
        if (nArray != null && nArray.length == 1536) {
            mutableBoolean.setValue(true);
            for (int i = 0; i < 24; ++i) {
                int n4 = i;
                objectArray[i] = class03316.N(dynamic, n2 -> class03316.N(nArray, n4 * 64 + n2));
            }
        } else if (nArray != null && nArray.length == 1024) {
            int n5;
            int n6 = 0;
            while (n6 < 16) {
                int n7 = n6 - n3;
                n5 = n6++;
                objectArray[n7] = class03316.N(dynamic, n2 -> class03316.N(nArray, n5 * 64 + n2));
            }
            if (bl) {
                Dynamic<?> var6 = class03316.N(dynamic, n -> class03316.N(nArray, n % 16));
                Dynamic<?> var7 = class03316.N(dynamic, n -> class03316.N(nArray, n % 16 + 1008));
                for (n5 = 0; n5 < 4; ++n5) {
                    objectArray[n5] = var6;
                }
                for (n5 = 20; n5 < 24; ++n5) {
                    objectArray[n5] = var7;
                }
            }
        } else {
            Arrays.fill(objectArray, class03316.u(dynamic.createList(Stream.of(dynamic.createString(L)))));
        }
        return objectArray;
    }

    private Dynamic<?> N(Dynamic<?> dynamic2, Set<String> set) {
        return dynamic2.update("Status", dynamic -> {
            String string = dynamic.asString("empty");
            if (W.contains(string)) {
                return dynamic;
            }
            set.remove("minecraft:air");
            boolean bl = !set.isEmpty();
            set.removeAll(P);
            if (!set.isEmpty()) {
                return dynamic.createString("liquid_carvers");
            }
            if ("noise".equals(string) || bl) {
                return dynamic.createString("noise");
            }
            if ("biomes".equals(string)) {
                return dynamic.createString("structure_references");
            }
            return dynamic;
        });
    }

    private static /* synthetic */ Dynamic N(Set set, Dynamic dynamic, int n, Dynamic[] dynamicArray, IntSet intSet, MutableObject mutableObject, Dynamic dynamic2) {
        int n2 = dynamic2.get("Y").asInt(0);
        Dynamic dynamic3 = (Dynamic)DataFixUtils.orElse(dynamic2.get("Palette").result().flatMap(dynamic4 -> {
            dynamic4.asStream().map(dynamic -> dynamic.get("Name").asString("minecraft:air")).forEach(set::add);
            return dynamic2.get("BlockStates").result().map(dynamic2 -> class03316.y(dynamic4, dynamic2));
        }), (Object)dynamic);
        Dynamic dynamic5 = dynamic2;
        int n3 = n2 - n;
        if (n3 >= 0 && n3 < dynamicArray.length) {
            dynamic5 = dynamic5.set("biomes", dynamicArray[n3]);
        }
        intSet.add(n2);
        if (dynamic2.get("Y").asInt(Integer.MAX_VALUE) == 0) {
            mutableObject.setValue(() -> {
                List list = dynamic3.get("palette").asList(Function.identity());
                long[] lArray = dynamic3.get("data").asLongStream().toArray();
                return new class03021(list, lArray);
            });
        }
        return dynamic5.set("block_states", dynamic3).remove("Palette").remove("BlockStates");
    }

    private static Dynamic<?> N(Dynamic<?> dynamic, Int2IntFunction int2IntFunction) {
        int n2;
        Int2IntLinkedOpenHashMap int2IntLinkedOpenHashMap = new Int2IntLinkedOpenHashMap();
        for (int i = 0; i < 64; ++i) {
            n2 = int2IntFunction.applyAsInt(i);
            if (int2IntLinkedOpenHashMap.containsKey(n2)) continue;
            int2IntLinkedOpenHashMap.put(n2, int2IntLinkedOpenHashMap.size());
        }
        Dynamic dynamic2 = dynamic.createList(int2IntLinkedOpenHashMap.keySet().stream().map(n -> dynamic.createString((String)j.getOrDefault(n.intValue(), (Object)L))));
        n2 = class03316.N(int2IntLinkedOpenHashMap.size());
        if (n2 == 0) {
            return class03316.u(dynamic2);
        }
        int n3 = 64 / n2;
        long[] lArray = new long[(64 + n3 - 1) / n3];
        int n4 = 0;
        int n5 = 0;
        for (int i = 0; i < 64; ++i) {
            int n6 = int2IntFunction.applyAsInt(i);
            int n7 = n4++;
            lArray[n7] = lArray[n7] | (long)int2IntLinkedOpenHashMap.get(n6) << n5;
            if ((n5 += n2) + n2 <= 64) continue;
            n5 = 0;
        }
        Dynamic var10 = dynamic.createLongList(Arrays.stream(lArray));
        return class03316.N(dynamic2, var10);
    }

    private static Dynamic<?> N(Dynamic<?> dynamic, Dynamic<?> dynamic2) {
        return dynamic.createMap((Map)ImmutableMap.of((Object)dynamic.createString("palette"), dynamic, (Object)dynamic.createString("data"), dynamic2));
    }

    private static Dynamic<?> N(Dynamic<?> dynamic, Dynamic<?> dynamic2, List<Dynamic<?>> list) {
        int n;
        int n2;
        long l = dynamic2.asLongStream().count() * 64L / 4096L;
        if (l > (long)(n2 = class03316.N(n = list.size()))) {
            Dynamic dynamic3 = dynamic.createMap((Map)ImmutableMap.of((Object)dynamic.createString("Name"), (Object)dynamic.createString("minecraft:air")));
            int n3 = (1 << (int)(l - 1L)) + 1 - n;
            for (int i = 0; i < n3; ++i) {
                list.add(dynamic3);
            }
            return dynamic.createList(list.stream());
        }
        return dynamic;
    }

    public static int N(int n) {
        if (n == 0) {
            return 0;
        }
        return (int)Math.ceil(Math.log(n) / Math.log(2.0));
    }

    private static <T> Dynamic<T> N(Dynamic<T> dynamic2) {
        return dynamic2.update("Indices", dynamic -> {
            HashMap hashMap = new HashMap();
            dynamic.getMapValues().ifSuccess(map2 -> map2.forEach((dynamic, dynamic2) -> {
                try {
                    dynamic.asString().result().map(Integer::parseInt).ifPresent(n -> {
                        int n2 = n - -4;
                        hashMap.put(dynamic.createString(Integer.toString(n2)), dynamic2);
                    });
                }
                catch (NumberFormatException numberFormatException) {
                    // empty catch block
                }
            }));
            return dynamic.createMap(hashMap);
        });
    }

    private static Dynamic<?> N(Dynamic<?> dynamic, int n, int n2) {
        Dynamic dynamic2 = dynamic.get("CarvingMasks").orElseEmptyMap();
        dynamic2 = dynamic2.updateMapValues(pair -> {
            long[] lArray = BitSet.valueOf(((Dynamic)pair.getSecond()).asByteBuffer().array()).toLongArray();
            long[] lArray2 = new long[64 * n];
            System.arraycopy(lArray, 0, lArray2, 64 * n2, lArray.length);
            return Pair.of((Object)((Dynamic)pair.getFirst()), (Object)dynamic.createLongList(LongStream.of(lArray2)));
        });
        return dynamic.set("CarvingMasks", dynamic2);
    }

    private static Dynamic<?> N(Dynamic<?> dynamic, String string) {
        List list = dynamic.get(string).orElseEmptyList().asStream().collect(Collectors.toCollection(ArrayList::new));
        if (list.size() == 24) {
            return dynamic;
        }
        Dynamic dynamic2 = dynamic.emptyList();
        for (int i = 0; i < 4; ++i) {
            list.add(0, dynamic2);
            list.add(dynamic2);
        }
        return dynamic.set(string, dynamic.createList(list.stream()));
    }

    private static Dynamic<?> N(Dynamic<?> dynamic, boolean bl, boolean bl2, boolean bl3, Supplier<@Nullable class03021> supplier) {
        Dynamic var6;
        String string;
        dynamic = dynamic.remove("Biomes");
        if (!bl) {
            return class03316.N(dynamic, 16, 0);
        }
        if (bl2) {
            return class03316.N(dynamic, 24, 0);
        }
        Dynamic<?> var0 = class03316.y(dynamic);
        var0 = class03316.N(var0, "LiquidsToBeTicked");
        var0 = class03316.N(var0, "PostProcessing");
        var0 = class03316.N(var0, "ToBeTicked");
        var0 = class03316.N(var0, 24, 4);
        dynamic = var0.update("UpgradeData", class03316::N);
        if (!bl3) {
            return dynamic;
        }
        Optional var5 = dynamic.get("Status").result();
        if (var5.isPresent() && !"empty".equals(string = (var6 = (Dynamic)var5.get()).asString(""))) {
            class03021 class030212;
            dynamic = dynamic.set("blending_data", dynamic.createMap((Map)ImmutableMap.of((Object)dynamic.createString("old_noise"), (Object)dynamic.createBoolean(m.contains(string)))));
            if (!class07529.NJ && (class030212 = supplier.get()) != null) {
                BitSet bitSet = new BitSet(256);
                boolean bl4 = string.equals("noise");
                for (int i = 0; i < 16; ++i) {
                    for (int j = 0; j < 16; ++j) {
                        Dynamic var13 = class030212.N(j, 0, i);
                        boolean bl5 = var13 != null && "minecraft:bedrock".equals(var13.get("Name").asString(""));
                        if (var13 != null && "minecraft:air".equals(var13.get("Name").asString(""))) {
                            bitSet.set(i * 16 + j);
                        }
                        bl4 |= bl5;
                    }
                }
                if (bl4 && bitSet.cardinality() != bitSet.size()) {
                    Dynamic var11 = "full".equals(string) ? dynamic.createString("heightmaps") : var6;
                    dynamic = dynamic.set("below_zero_retrogen", dynamic.createMap((Map)ImmutableMap.of((Object)dynamic.createString("target_status"), (Object)var11, (Object)dynamic.createString("missing_bedrock"), (Object)dynamic.createLongList(LongStream.of(bitSet.toLongArray())))));
                    dynamic = dynamic.set("Status", dynamic.createString("empty"));
                }
                dynamic = dynamic.set("isLightOn", dynamic.createBoolean(false));
            }
        }
        return dynamic;
    }

    private static int N(int[] nArray, int n) {
        return nArray[n] & 0xFF;
    }

    protected TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(class06962.u);
        OpticFinder var2 = var1.findField("Level");
        OpticFinder var3 = var2.type().findField("Sections");
        Type var5 = this.getOutputSchema().getType(class06962.u);
        Type var6 = var5.findField("Level").type();
        Type var7 = var6.findField("Sections").type();
        return this.fixTypeEverywhereTyped(u, var1, var5, typed -> typed.updateTyped(var2, var6, typed3 -> {
            Dynamic var5 = (Dynamic)typed3.get(DSL.remainderFinder());
            OptionalDynamic var6 = ((Dynamic)typed.get(DSL.remainderFinder())).get(N);
            String string = var6.get("dimension").asString().result().orElse("");
            String string2 = var6.get("generator").asString().result().orElse("");
            boolean bl = "minecraft:overworld".equals(string);
            MutableBoolean mutableBoolean = new MutableBoolean();
            int n = bl ? -4 : 0;
            Dynamic<?>[] var12 = class03316.N(var5, bl, n, mutableBoolean);
            Dynamic<?> var13 = class03316.u(var5.createList(Stream.of(var5.createMap((Map)ImmutableMap.of((Object)var5.createString("Name"), (Object)var5.createString("minecraft:air"))))));
            HashSet hashSet = Sets.newHashSet();
            MutableObject mutableObject = new MutableObject(() -> null);
            Typed var4 = typed3.updateTyped(var3, var7, typed -> {
                IntOpenHashSet intOpenHashSet = new IntOpenHashSet();
                List list = ((Dynamic)typed.write().result().orElseThrow(() -> new IllegalStateException("Malformed Chunk.Level.Sections"))).asStream().map(arg_0 -> class03316.N(hashSet, var13, n, var12, (IntSet)intOpenHashSet, mutableObject, arg_0)).collect(Collectors.toCollection(ArrayList::new));
                for (int i = 0; i < var12.length; ++i) {
                    int n2 = i + n;
                    if (!intOpenHashSet.add(n2)) continue;
                    Dynamic dynamic3 = var5.createMap(Map.of(var5.createString("Y"), var5.createInt(n2)));
                    dynamic3 = dynamic3.set("block_states", var13);
                    dynamic3 = dynamic3.set("biomes", var12[i]);
                    list.add(dynamic3);
                }
                return class07536.N((Type)var7, (Dynamic)var5.createList(list.stream()));
            });
            return var4.update(DSL.remainderFinder(), dynamic -> {
                Dynamic<?> var6;
                if (bl) {
                    var6 = this.N((Dynamic<?>)dynamic, hashSet);
                }
                return class03316.N(var6, bl, mutableBoolean.booleanValue(), "minecraft:noise".equals(string2), (Supplier)mutableObject.get());
            });
        }));
    }

    static {
        j.put(0, (Object)"minecraft:ocean");
        j.put(1, (Object)L);
        j.put(2, (Object)"minecraft:desert");
        j.put(3, (Object)"minecraft:mountains");
        j.put(4, (Object)"minecraft:forest");
        j.put(5, (Object)"minecraft:taiga");
        j.put(6, (Object)"minecraft:swamp");
        j.put(7, (Object)"minecraft:river");
        j.put(8, (Object)"minecraft:nether_wastes");
        j.put(9, (Object)"minecraft:the_end");
        j.put(10, (Object)"minecraft:frozen_ocean");
        j.put(11, (Object)"minecraft:frozen_river");
        j.put(12, (Object)"minecraft:snowy_tundra");
        j.put(13, (Object)"minecraft:snowy_mountains");
        j.put(14, (Object)"minecraft:mushroom_fields");
        j.put(15, (Object)"minecraft:mushroom_field_shore");
        j.put(16, (Object)"minecraft:beach");
        j.put(17, (Object)"minecraft:desert_hills");
        j.put(18, (Object)"minecraft:wooded_hills");
        j.put(19, (Object)"minecraft:taiga_hills");
        j.put(20, (Object)"minecraft:mountain_edge");
        j.put(21, (Object)"minecraft:jungle");
        j.put(22, (Object)"minecraft:jungle_hills");
        j.put(23, (Object)"minecraft:jungle_edge");
        j.put(24, (Object)"minecraft:deep_ocean");
        j.put(25, (Object)"minecraft:stone_shore");
        j.put(26, (Object)"minecraft:snowy_beach");
        j.put(27, (Object)"minecraft:birch_forest");
        j.put(28, (Object)"minecraft:birch_forest_hills");
        j.put(29, (Object)"minecraft:dark_forest");
        j.put(30, (Object)"minecraft:snowy_taiga");
        j.put(31, (Object)"minecraft:snowy_taiga_hills");
        j.put(32, (Object)"minecraft:giant_tree_taiga");
        j.put(33, (Object)"minecraft:giant_tree_taiga_hills");
        j.put(34, (Object)"minecraft:wooded_mountains");
        j.put(35, (Object)"minecraft:savanna");
        j.put(36, (Object)"minecraft:savanna_plateau");
        j.put(37, (Object)"minecraft:badlands");
        j.put(38, (Object)"minecraft:wooded_badlands_plateau");
        j.put(39, (Object)"minecraft:badlands_plateau");
        j.put(40, (Object)"minecraft:small_end_islands");
        j.put(41, (Object)"minecraft:end_midlands");
        j.put(42, (Object)"minecraft:end_highlands");
        j.put(43, (Object)"minecraft:end_barrens");
        j.put(44, (Object)"minecraft:warm_ocean");
        j.put(45, (Object)"minecraft:lukewarm_ocean");
        j.put(46, (Object)"minecraft:cold_ocean");
        j.put(47, (Object)"minecraft:deep_warm_ocean");
        j.put(48, (Object)"minecraft:deep_lukewarm_ocean");
        j.put(49, (Object)"minecraft:deep_cold_ocean");
        j.put(50, (Object)"minecraft:deep_frozen_ocean");
        j.put(127, (Object)"minecraft:the_void");
        j.put(129, (Object)"minecraft:sunflower_plains");
        j.put(130, (Object)"minecraft:desert_lakes");
        j.put(131, (Object)"minecraft:gravelly_mountains");
        j.put(132, (Object)"minecraft:flower_forest");
        j.put(133, (Object)"minecraft:taiga_mountains");
        j.put(134, (Object)"minecraft:swamp_hills");
        j.put(140, (Object)"minecraft:ice_spikes");
        j.put(149, (Object)"minecraft:modified_jungle");
        j.put(151, (Object)"minecraft:modified_jungle_edge");
        j.put(155, (Object)"minecraft:tall_birch_forest");
        j.put(156, (Object)"minecraft:tall_birch_hills");
        j.put(157, (Object)"minecraft:dark_forest_hills");
        j.put(158, (Object)"minecraft:snowy_taiga_mountains");
        j.put(160, (Object)"minecraft:giant_spruce_taiga");
        j.put(161, (Object)"minecraft:giant_spruce_taiga_hills");
        j.put(162, (Object)"minecraft:modified_gravelly_mountains");
        j.put(163, (Object)"minecraft:shattered_savanna");
        j.put(164, (Object)"minecraft:shattered_savanna_plateau");
        j.put(165, (Object)"minecraft:eroded_badlands");
        j.put(166, (Object)"minecraft:modified_wooded_badlands_plateau");
        j.put(167, (Object)"minecraft:modified_badlands_plateau");
        j.put(168, (Object)"minecraft:bamboo_jungle");
        j.put(169, (Object)"minecraft:bamboo_jungle_hills");
        j.put(170, (Object)"minecraft:soul_sand_valley");
        j.put(171, (Object)"minecraft:crimson_forest");
        j.put(172, (Object)"minecraft:warped_forest");
        j.put(173, (Object)"minecraft:basalt_deltas");
        j.put(174, (Object)"minecraft:dripstone_caves");
        j.put(175, (Object)"minecraft:lush_caves");
        j.put(177, (Object)"minecraft:meadow");
        j.put(178, (Object)"minecraft:grove");
        j.put(179, (Object)"minecraft:snowy_slopes");
        j.put(180, (Object)"minecraft:snowcapped_peaks");
        j.put(181, (Object)"minecraft:lofty_peaks");
        j.put(182, (Object)"minecraft:stony_peaks");
    }
}

