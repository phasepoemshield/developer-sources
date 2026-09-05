/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Hash$Strategy
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenCustomHashMap
 *  minecraft.class00780
 *  minecraft.class00795
 *  minecraft.class02055
 *  minecraft.class03222
 *  minecraft.class03556
 *  minecraft.class04860
 *  minecraft.class05946
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.biome;

import it.unimi.dsi.fastutil.Hash;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenCustomHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.stream.Collectors;
import minecraft.class00780;
import minecraft.class00795;
import minecraft.class02055;
import minecraft.class03222;
import minecraft.class03556;
import minecraft.class04860;
import minecraft.class05946;
import net.fabricmc.fabric.impl.biome.MultiNoiseSamplerHooks;
import net.fabricmc.fabric.impl.biome.TheEndBiomeData;
import net.fabricmc.fabric.impl.biome.TheEndBiomeData$RegistryKeyHashStrategy;
import net.fabricmc.fabric.impl.biome.WeightedPicker;
import org.jspecify.annotations.Nullable;

public class TheEndBiomeData$Overrides {
    public final Set<class03556<class00780>> customBiomes;
    private final class03556<class00780> endMidlands;
    private final class03556<class00780> endBarrens;
    private final class03556<class00780> endHighlands;
    private final @Nullable Map<class03556<class00780>, WeightedPicker<class03556<class00780>>> endBiomesMap;
    private final @Nullable Map<class03556<class00780>, WeightedPicker<class03556<class00780>>> endMidlandsMap;
    private final @Nullable Map<class03556<class00780>, WeightedPicker<class03556<class00780>>> endBarrensMap;
    private final Map<class03222, class04860> samplers = new WeakHashMap<class03222, class04860>();

    public TheEndBiomeData$Overrides(class02055<class00780> class020552) {
        this.customBiomes = TheEndBiomeData.ADDED_BIOMES.stream().map(arg_0 -> class020552.y(arg_0)).collect(Collectors.toSet());
        this.endMidlands = class020552.y(class00795.NU);
        this.endBarrens = class020552.y(class00795.NW);
        this.endHighlands = class020552.y(class00795.Nz);
        this.endBiomesMap = this.resolveOverrides(class020552, TheEndBiomeData.END_BIOMES_MAP, (class05946<class00780>)class00795.NZ);
        this.endMidlandsMap = this.resolveOverrides(class020552, TheEndBiomeData.END_MIDLANDS_MAP, (class05946<class00780>)class00795.NU);
        this.endBarrensMap = this.resolveOverrides(class020552, TheEndBiomeData.END_BARRENS_MAP, (class05946<class00780>)class00795.NW);
    }

    private <T extends class03556<class00780>> T pick(T t, T t2, Map<T, WeightedPicker<T>> map, int n, int n2, class03222 class032222) {
        WeightedPicker<T> weightedPicker;
        block6: {
            block5: {
                if (map == null) {
                    return t2;
                }
                weightedPicker = map.get(t);
                if (weightedPicker == null) {
                    return t2;
                }
                int n3 = weightedPicker.getEntryCount();
                if (n3 == 0) break block5;
                if (n3 != 1) break block6;
                if (!t.N(arg_0 -> this.endHighlands.N(arg_0))) break block6;
            }
            return t2;
        }
        return (T)((class03556)weightedPicker.pickFromNoise(((MultiNoiseSamplerHooks)class032222).fabric_getEndBiomesSampler(), (double)n / 64.0, 0.0, (double)n2 / 64.0));
    }

    public class03556<class00780> pick(int n, int n2, int n3, class03222 class032222, class03556<class00780> class035562) {
        block5: {
            boolean bl;
            block4: {
                bl = class035562.N(arg_0 -> this.endMidlands.N(arg_0));
                if (bl) break block4;
                if (!class035562.N(arg_0 -> this.endBarrens.N(arg_0))) break block5;
            }
            class03556<class00780> class035563 = this.pick(this.endHighlands, this.endHighlands, this.endBiomesMap, n, n3, class032222);
            Map<class03556<class00780>, WeightedPicker<class03556<class00780>>> map = bl ? this.endMidlandsMap : this.endBarrensMap;
            return this.pick(class035563, class035562, map, n, n3, class032222);
        }
        if (!TheEndBiomeData.END_BIOMES_MAP.containsKey(class035562.i().orElseThrow())) {
            throw new IllegalStateException("Biome is not an End biome: " + String.valueOf(class035562));
        }
        return this.pick(class035562, class035562, this.endBiomesMap, n, n3, class032222);
    }

    private @Nullable Map<class03556<class00780>, WeightedPicker<class03556<class00780>>> resolveOverrides(class02055<class00780> class020552, Map<class05946<class00780>, WeightedPicker<class05946<class00780>>> map, class05946<class00780> class059462) {
        Object2ObjectOpenCustomHashMap object2ObjectOpenCustomHashMap = new Object2ObjectOpenCustomHashMap(map.size(), (Hash.Strategy)TheEndBiomeData$RegistryKeyHashStrategy.INSTANCE);
        for (Map.Entry<class05946<class00780>, WeightedPicker<class05946<class00780>>> entry : map.entrySet()) {
            WeightedPicker<class05946<class00780>> weightedPicker = entry.getValue();
            int n = weightedPicker.getEntryCount();
            if (n == 0 || n == 1 && entry.getKey() == class059462) continue;
            object2ObjectOpenCustomHashMap.put(class020552.y(entry.getKey()), weightedPicker.map(arg_0 -> class020552.y(arg_0)));
        }
        return object2ObjectOpenCustomHashMap.isEmpty() ? null : object2ObjectOpenCustomHashMap;
    }
}

