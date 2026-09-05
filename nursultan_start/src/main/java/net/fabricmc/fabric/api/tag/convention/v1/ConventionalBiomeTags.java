/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00780
 *  minecraft.class03530
 *  net.fabricmc.fabric.impl.tag.convention.TagRegistration
 */
package net.fabricmc.fabric.api.tag.convention.v1;

import minecraft.class00780;
import minecraft.class03530;
import net.fabricmc.fabric.impl.tag.convention.TagRegistration;

@Deprecated
public final class ConventionalBiomeTags {
    public static final class03530<class00780> IN_OVERWORLD = ConventionalBiomeTags.register("in_overworld");
    public static final class03530<class00780> IN_THE_END = ConventionalBiomeTags.register("in_the_end");
    public static final class03530<class00780> IN_NETHER = ConventionalBiomeTags.register("in_nether");
    public static final class03530<class00780> TAIGA = ConventionalBiomeTags.register("taiga");
    public static final class03530<class00780> EXTREME_HILLS = ConventionalBiomeTags.register("extreme_hills");
    public static final class03530<class00780> WINDSWEPT = ConventionalBiomeTags.register("windswept");
    public static final class03530<class00780> JUNGLE = ConventionalBiomeTags.register("jungle");
    public static final class03530<class00780> MESA = ConventionalBiomeTags.register("mesa");
    public static final class03530<class00780> PLAINS = ConventionalBiomeTags.register("plains");
    public static final class03530<class00780> SAVANNA = ConventionalBiomeTags.register("savanna");
    public static final class03530<class00780> ICY = ConventionalBiomeTags.register("icy");
    public static final class03530<class00780> AQUATIC_ICY = ConventionalBiomeTags.register("aquatic_icy");
    public static final class03530<class00780> BEACH = ConventionalBiomeTags.register("beach");
    public static final class03530<class00780> FOREST = ConventionalBiomeTags.register("forest");
    public static final class03530<class00780> BIRCH_FOREST = ConventionalBiomeTags.register("birch_forest");
    public static final class03530<class00780> OCEAN = ConventionalBiomeTags.register("ocean");
    public static final class03530<class00780> DESERT = ConventionalBiomeTags.register("desert");
    public static final class03530<class00780> RIVER = ConventionalBiomeTags.register("river");
    public static final class03530<class00780> SWAMP = ConventionalBiomeTags.register("swamp");
    public static final class03530<class00780> MUSHROOM = ConventionalBiomeTags.register("mushroom");
    public static final class03530<class00780> UNDERGROUND = ConventionalBiomeTags.register("underground");
    public static final class03530<class00780> MOUNTAIN = ConventionalBiomeTags.register("mountain");
    public static final class03530<class00780> CLIMATE_HOT = ConventionalBiomeTags.register("climate_hot");
    public static final class03530<class00780> CLIMATE_TEMPERATE = ConventionalBiomeTags.register("climate_temperate");
    public static final class03530<class00780> CLIMATE_COLD = ConventionalBiomeTags.register("climate_cold");
    public static final class03530<class00780> CLIMATE_WET = ConventionalBiomeTags.register("climate_wet");
    public static final class03530<class00780> CLIMATE_DRY = ConventionalBiomeTags.register("climate_dry");
    public static final class03530<class00780> VEGETATION_SPARSE = ConventionalBiomeTags.register("vegetation_sparse");
    public static final class03530<class00780> VEGETATION_DENSE = ConventionalBiomeTags.register("vegetation_dense");
    public static final class03530<class00780> TREE_CONIFEROUS = ConventionalBiomeTags.register("tree_coniferous");
    public static final class03530<class00780> TREE_SAVANNA = ConventionalBiomeTags.register("tree_savanna");
    public static final class03530<class00780> TREE_JUNGLE = ConventionalBiomeTags.register("tree_jungle");
    public static final class03530<class00780> TREE_DECIDUOUS = ConventionalBiomeTags.register("tree_deciduous");
    public static final class03530<class00780> VOID = ConventionalBiomeTags.register("void");
    public static final class03530<class00780> MOUNTAIN_PEAK = ConventionalBiomeTags.register("mountain_peak");
    public static final class03530<class00780> MOUNTAIN_SLOPE = ConventionalBiomeTags.register("mountain_slope");
    public static final class03530<class00780> AQUATIC = ConventionalBiomeTags.register("aquatic");
    public static final class03530<class00780> WASTELAND = ConventionalBiomeTags.register("wasteland");
    public static final class03530<class00780> DEAD = ConventionalBiomeTags.register("dead");
    public static final class03530<class00780> FLORAL = ConventionalBiomeTags.register("floral");
    public static final class03530<class00780> SNOWY = ConventionalBiomeTags.register("snowy");
    public static final class03530<class00780> BADLANDS = ConventionalBiomeTags.register("badlands");
    public static final class03530<class00780> CAVES = ConventionalBiomeTags.register("caves");
    public static final class03530<class00780> END_ISLANDS = ConventionalBiomeTags.register("end_islands");
    public static final class03530<class00780> NETHER_FORESTS = ConventionalBiomeTags.register("nether_forests");
    public static final class03530<class00780> SNOWY_PLAINS = ConventionalBiomeTags.register("snowy_plains");
    public static final class03530<class00780> STONY_SHORES = ConventionalBiomeTags.register("stony_shores");
    public static final class03530<class00780> FLOWER_FORESTS = ConventionalBiomeTags.register("flower_forests");
    public static final class03530<class00780> DEEP_OCEAN = ConventionalBiomeTags.register("deep_ocean");
    public static final class03530<class00780> SHALLOW_OCEAN = ConventionalBiomeTags.register("shallow_ocean");

    private ConventionalBiomeTags() {
    }

    private static class03530<class00780> register(String string) {
        return TagRegistration.BIOME_TAG_REGISTRATION.registerC(string);
    }
}

