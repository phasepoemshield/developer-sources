/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  minecraft.class00780
 *  minecraft.class00795
 *  minecraft.class02055
 *  minecraft.class05946
 */
package net.fabricmc.fabric.impl.biome;

import com.google.common.base.Preconditions;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import minecraft.class00780;
import minecraft.class00795;
import minecraft.class02055;
import minecraft.class05946;
import net.fabricmc.fabric.impl.biome.TheEndBiomeData$Overrides;
import net.fabricmc.fabric.impl.biome.WeightedPicker;

public final class TheEndBiomeData {
    public static final ThreadLocal<class02055<class00780>> biomeRegistry = new ThreadLocal();
    public static final Set<class05946<class00780>> ADDED_BIOMES = new HashSet<class05946<class00780>>();
    static final Map<class05946<class00780>, WeightedPicker<class05946<class00780>>> END_BIOMES_MAP = new IdentityHashMap<class05946<class00780>, WeightedPicker<class05946<class00780>>>();
    static final Map<class05946<class00780>, WeightedPicker<class05946<class00780>>> END_MIDLANDS_MAP = new IdentityHashMap<class05946<class00780>, WeightedPicker<class05946<class00780>>>();
    static final Map<class05946<class00780>, WeightedPicker<class05946<class00780>>> END_BARRENS_MAP = new IdentityHashMap<class05946<class00780>, WeightedPicker<class05946<class00780>>>();

    private TheEndBiomeData() {
    }

    public static TheEndBiomeData$Overrides createOverrides(class02055<class00780> class020552) {
        return new TheEndBiomeData$Overrides(class020552);
    }

    public static void addEndBiomeReplacement(class05946<class00780> class059463, class05946<class00780> class059464, double d) {
        Preconditions.checkNotNull(class059463, (Object)"replaced entry is null");
        Preconditions.checkNotNull(class059464, (Object)"variant entry is null");
        Preconditions.checkArgument((d > 0.0 ? 1 : 0) != 0, (String)"Weight is less than or equal to 0.0 (got %s)", (Object)d);
        END_BIOMES_MAP.computeIfAbsent(class059463, class059462 -> new WeightedPicker()).add(class059464, d);
        ADDED_BIOMES.add(class059464);
    }

    public static void addEndBarrensReplacement(class05946<class00780> class059463, class05946<class00780> class059464, double d) {
        Preconditions.checkNotNull(class059463, (Object)"highlands entry is null");
        Preconditions.checkNotNull(class059464, (Object)"midlands entry is null");
        Preconditions.checkArgument((d > 0.0 ? 1 : 0) != 0, (String)"Weight is less than or equal to 0.0 (got %s)", (Object)d);
        END_BARRENS_MAP.computeIfAbsent(class059463, class059462 -> new WeightedPicker()).add(class059464, d);
        ADDED_BIOMES.add(class059464);
    }

    public static void addEndMidlandsReplacement(class05946<class00780> class059463, class05946<class00780> class059464, double d) {
        Preconditions.checkNotNull(class059463, (Object)"highlands entry is null");
        Preconditions.checkNotNull(class059464, (Object)"midlands entry is null");
        Preconditions.checkArgument((d > 0.0 ? 1 : 0) != 0, (String)"Weight is less than or equal to 0.0 (got %s)", (Object)d);
        END_MIDLANDS_MAP.computeIfAbsent(class059463, class059462 -> new WeightedPicker()).add(class059464, d);
        ADDED_BIOMES.add(class059464);
    }

    static {
        END_BIOMES_MAP.computeIfAbsent((class05946<class00780>)class00795.NZ, class059462 -> new WeightedPicker()).add(class00795.NZ, 1.0);
        END_BIOMES_MAP.computeIfAbsent((class05946<class00780>)class00795.Nz, class059462 -> new WeightedPicker()).add(class00795.Nz, 1.0);
        END_BIOMES_MAP.computeIfAbsent((class05946<class00780>)class00795.NE, class059462 -> new WeightedPicker()).add(class00795.NE, 1.0);
        END_MIDLANDS_MAP.computeIfAbsent((class05946<class00780>)class00795.Nz, class059462 -> new WeightedPicker()).add(class00795.NU, 1.0);
        END_BARRENS_MAP.computeIfAbsent((class05946<class00780>)class00795.Nz, class059462 -> new WeightedPicker()).add(class00795.NW, 1.0);
    }
}

