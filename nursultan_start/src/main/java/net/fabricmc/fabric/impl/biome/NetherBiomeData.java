/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00780
 *  minecraft.class03221
 *  minecraft.class03229
 *  minecraft.class03562
 *  minecraft.class05946
 */
package net.fabricmc.fabric.impl.biome;

import com.google.common.base.Preconditions;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import minecraft.class00780;
import minecraft.class03221;
import minecraft.class03229;
import minecraft.class03562;
import minecraft.class05946;

public final class NetherBiomeData {
    private static final Set<class05946<class00780>> NETHER_BIOMES = new HashSet<class05946<class00780>>();
    private static final Map<class05946<class00780>, class03229> NETHER_BIOME_NOISE_POINTS = new HashMap<class05946<class00780>, class03229>();

    private NetherBiomeData() {
    }

    public static <T> class03221<T> withModdedBiomeEntries(class03221<T> class032212, Function<class05946<class00780>, T> function) {
        if (NETHER_BIOME_NOISE_POINTS.isEmpty()) {
            return class032212;
        }
        ArrayList<Pair> arrayList = new ArrayList<Pair>(class032212.N());
        for (Map.Entry<class05946<class00780>, class03229> entry : NETHER_BIOME_NOISE_POINTS.entrySet()) {
            arrayList.add(Pair.of((Object)entry.getValue(), function.apply(entry.getKey())));
        }
        return new class03221(Collections.unmodifiableList(arrayList));
    }

    public static boolean canGenerateInNether(class05946<class00780> class059462) {
        return class03562.y.N().anyMatch(class059463 -> class059463.equals(class059462));
    }

    private static void clearBiomeSourceCache() {
        NETHER_BIOMES.clear();
    }

    public static void addNetherBiome(class05946<class00780> class059462, class03229 class032292) {
        Preconditions.checkArgument((class059462 != null ? 1 : 0) != 0, (Object)"Biome is null");
        Preconditions.checkArgument((class032292 != null ? 1 : 0) != 0, (Object)"MultiNoiseUtil.NoiseValuePoint is null");
        NETHER_BIOME_NOISE_POINTS.put(class059462, class032292);
        NetherBiomeData.clearBiomeSourceCache();
    }
}

