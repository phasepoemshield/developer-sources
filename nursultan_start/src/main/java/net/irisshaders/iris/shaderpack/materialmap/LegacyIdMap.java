/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  it.unimi.dsi.fastutil.Function
 *  it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 */
package net.irisshaders.iris.shaderpack.materialmap;

import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.Function;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.irisshaders.iris.shaderpack.materialmap.BlockEntry;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;

public class LegacyIdMap {
    private static final ImmutableList<String> COLORS = ImmutableList.of((Object)"white", (Object)"orange", (Object)"magenta", (Object)"light_blue", (Object)"yellow", (Object)"lime", (Object)"pink", (Object)"gray", (Object)"light_gray", (Object)"cyan", (Object)"purple", (Object)"blue", (Object[])new String[]{"brown", "green", "red", "black"});
    private static final ImmutableList<String> WOOD_TYPES = ImmutableList.of((Object)"oak", (Object)"birch", (Object)"jungle", (Object)"spruce", (Object)"acacia", (Object)"dark_oak");

    private static void add(Int2ObjectMap<List<BlockEntry>> int2ObjectMap, int n, BlockEntry ... blockEntryArray) {
        int2ObjectMap.put(n, Arrays.asList(blockEntryArray));
    }

    private static BlockEntry block(String string) {
        return new BlockEntry(new NamespacedId("minecraft", string), Collections.emptyMap());
    }

    private static void addMany(Int2ObjectLinkedOpenHashMap<List<BlockEntry>> int2ObjectLinkedOpenHashMap, int n, List<String> list, Function<String, BlockEntry> function) {
        ArrayList<BlockEntry> arrayList = new ArrayList<BlockEntry>();
        for (String string : list) {
            arrayList.add((BlockEntry)function.apply((Object)string));
        }
        int2ObjectLinkedOpenHashMap.put(n, arrayList);
    }

    public static void addLegacyValues(Int2ObjectLinkedOpenHashMap<List<BlockEntry>> int2ObjectLinkedOpenHashMap) {
        LegacyIdMap.add(int2ObjectLinkedOpenHashMap, 1, new BlockEntry[]{LegacyIdMap.block("stone"), LegacyIdMap.block("granite"), LegacyIdMap.block("diorite"), LegacyIdMap.block("andesite")});
        LegacyIdMap.add(int2ObjectLinkedOpenHashMap, 2, new BlockEntry[]{LegacyIdMap.block("grass_block")});
        LegacyIdMap.add(int2ObjectLinkedOpenHashMap, 4, new BlockEntry[]{LegacyIdMap.block("cobblestone")});
        LegacyIdMap.add(int2ObjectLinkedOpenHashMap, 50, new BlockEntry[]{LegacyIdMap.block("torch")});
        LegacyIdMap.add(int2ObjectLinkedOpenHashMap, 89, new BlockEntry[]{LegacyIdMap.block("glowstone")});
        LegacyIdMap.add(int2ObjectLinkedOpenHashMap, 124, new BlockEntry[]{LegacyIdMap.block("redstone_lamp")});
        LegacyIdMap.add(int2ObjectLinkedOpenHashMap, 12, new BlockEntry[]{LegacyIdMap.block("sand")});
        LegacyIdMap.add(int2ObjectLinkedOpenHashMap, 24, new BlockEntry[]{LegacyIdMap.block("sandstone")});
        LegacyIdMap.add(int2ObjectLinkedOpenHashMap, 41, new BlockEntry[]{LegacyIdMap.block("gold_block")});
        LegacyIdMap.add(int2ObjectLinkedOpenHashMap, 42, new BlockEntry[]{LegacyIdMap.block("iron_block")});
        LegacyIdMap.add(int2ObjectLinkedOpenHashMap, 57, new BlockEntry[]{LegacyIdMap.block("diamond_block")});
        LegacyIdMap.add(int2ObjectLinkedOpenHashMap, -123, new BlockEntry[]{LegacyIdMap.block("emerald_block")});
        LegacyIdMap.addMany(int2ObjectLinkedOpenHashMap, 35, COLORS, (Function<String, BlockEntry>)((Function)object -> LegacyIdMap.block(String.valueOf(object) + "_wool")));
        LegacyIdMap.add(int2ObjectLinkedOpenHashMap, 9, new BlockEntry[]{LegacyIdMap.block("water")});
        LegacyIdMap.add(int2ObjectLinkedOpenHashMap, 11, new BlockEntry[]{LegacyIdMap.block("lava")});
        LegacyIdMap.add(int2ObjectLinkedOpenHashMap, 79, new BlockEntry[]{LegacyIdMap.block("ice")});
        LegacyIdMap.addMany(int2ObjectLinkedOpenHashMap, 18, WOOD_TYPES, (Function<String, BlockEntry>)((Function)object -> LegacyIdMap.block(String.valueOf(object) + "_leaves")));
        LegacyIdMap.addMany(int2ObjectLinkedOpenHashMap, 95, COLORS, (Function<String, BlockEntry>)((Function)object -> LegacyIdMap.block(String.valueOf(object) + "_stained_glass")));
        LegacyIdMap.addMany(int2ObjectLinkedOpenHashMap, 160, COLORS, (Function<String, BlockEntry>)((Function)object -> LegacyIdMap.block(String.valueOf(object) + "_stained_glass_pane")));
        LegacyIdMap.add(int2ObjectLinkedOpenHashMap, 31, new BlockEntry[]{LegacyIdMap.block("grass"), LegacyIdMap.block("seagrass"), LegacyIdMap.block("sweet_berry_bush")});
        LegacyIdMap.add(int2ObjectLinkedOpenHashMap, 59, new BlockEntry[]{LegacyIdMap.block("wheat"), LegacyIdMap.block("carrots"), LegacyIdMap.block("potatoes")});
        LegacyIdMap.add(int2ObjectLinkedOpenHashMap, 37, new BlockEntry[]{LegacyIdMap.block("dandelion"), LegacyIdMap.block("poppy"), LegacyIdMap.block("blue_orchid"), LegacyIdMap.block("allium"), LegacyIdMap.block("azure_bluet"), LegacyIdMap.block("red_tulip"), LegacyIdMap.block("pink_tulip"), LegacyIdMap.block("white_tulip"), LegacyIdMap.block("orange_tulip"), LegacyIdMap.block("oxeye_daisy"), LegacyIdMap.block("cornflower"), LegacyIdMap.block("lily_of_the_valley"), LegacyIdMap.block("wither_rose")});
        LegacyIdMap.add(int2ObjectLinkedOpenHashMap, 175, new BlockEntry[]{LegacyIdMap.block("sunflower"), LegacyIdMap.block("lilac"), LegacyIdMap.block("tall_grass"), LegacyIdMap.block("large_fern"), LegacyIdMap.block("rose_bush"), LegacyIdMap.block("peony"), LegacyIdMap.block("tall_seagrass")});
        LegacyIdMap.add(int2ObjectLinkedOpenHashMap, 51, new BlockEntry[]{LegacyIdMap.block("fire")});
        LegacyIdMap.add(int2ObjectLinkedOpenHashMap, 111, new BlockEntry[]{LegacyIdMap.block("lily_pad")});
    }
}

