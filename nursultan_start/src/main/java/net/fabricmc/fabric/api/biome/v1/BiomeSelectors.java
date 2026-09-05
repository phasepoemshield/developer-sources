/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class00780
 *  minecraft.class01002
 *  minecraft.class01016
 *  minecraft.class01255
 *  minecraft.class03530
 *  minecraft.class04523
 *  minecraft.class05946
 *  minecraft.class07078
 *  minecraft.class07428
 *  net.fabricmc.fabric.impl.biome.modification.BuiltInRegistryKeys
 */
package net.fabricmc.fabric.api.biome.v1;

import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class00780;
import minecraft.class01002;
import minecraft.class01016;
import minecraft.class01255;
import minecraft.class03530;
import minecraft.class04523;
import minecraft.class05946;
import minecraft.class07078;
import minecraft.class07428;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.impl.biome.modification.BuiltInRegistryKeys;

public final class BiomeSelectors {
    private BiomeSelectors() {
    }

    public static Predicate<BiomeSelectionContext> all() {
        return biomeSelectionContext -> true;
    }

    public static Predicate<BiomeSelectionContext> tag(class03530<class00780> class035302) {
        return biomeSelectionContext -> biomeSelectionContext.hasTag(class035302);
    }

    public static Predicate<BiomeSelectionContext> vanilla() {
        return biomeSelectionContext -> biomeSelectionContext.getBiomeKey().N().y().equals("minecraft") && BuiltInRegistryKeys.isBuiltinBiome(biomeSelectionContext.getBiomeKey());
    }

    public static Predicate<BiomeSelectionContext> foundInTheNether() {
        return biomeSelectionContext -> biomeSelectionContext.canGenerateIn((class05946<class01255>)class01255.L);
    }

    @SafeVarargs
    public static Predicate<BiomeSelectionContext> includeByKey(class05946<class00780> ... class05946Array) {
        return BiomeSelectors.includeByKey((Collection<class05946<class00780>>)ImmutableSet.copyOf((Object[])class05946Array));
    }

    public static Predicate<BiomeSelectionContext> includeByKey(Collection<class05946<class00780>> collection) {
        return biomeSelectionContext -> collection.contains(biomeSelectionContext.getBiomeKey());
    }

    public static Predicate<BiomeSelectionContext> spawnsOneOf(Set<class07078<?>> set) {
        return biomeSelectionContext -> {
            class01002 class010022 = biomeSelectionContext.getBiome().N();
            for (class07428 class074282 : class07428.values()) {
                for (class04523 class045232 : class010022.N(class074282).u()) {
                    if (!set.contains(((class01016)class045232.N()).N())) continue;
                    return true;
                }
            }
            return false;
        };
    }

    public static Predicate<BiomeSelectionContext> spawnsOneOf(class07078<?> ... class07078Array) {
        return BiomeSelectors.spawnsOneOf(ImmutableSet.copyOf((Object[])class07078Array));
    }

    @SafeVarargs
    public static Predicate<BiomeSelectionContext> excludeByKey(class05946<class00780> ... class05946Array) {
        return BiomeSelectors.excludeByKey((Collection<class05946<class00780>>)ImmutableSet.copyOf((Object[])class05946Array));
    }

    public static Predicate<BiomeSelectionContext> excludeByKey(Collection<class05946<class00780>> collection) {
        return biomeSelectionContext -> !collection.contains(biomeSelectionContext.getBiomeKey());
    }

    public static Predicate<BiomeSelectionContext> foundInOverworld() {
        return biomeSelectionContext -> biomeSelectionContext.canGenerateIn((class05946<class01255>)class01255.y);
    }

    public static Predicate<BiomeSelectionContext> foundInTheEnd() {
        return biomeSelectionContext -> biomeSelectionContext.canGenerateIn((class05946<class01255>)class01255.u);
    }
}

