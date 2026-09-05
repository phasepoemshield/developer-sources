/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  java.lang.MatchException
 *  minecraft.class00780
 *  minecraft.class00801
 *  minecraft.class03556
 *  minecraft.class03557
 *  minecraft.class04453
 *  minecraft.class05946
 *  minecraft.class06202
 *  net.irisshaders.iris.gl.uniform.FloatSupplier
 *  net.irisshaders.iris.gl.uniform.UniformHolder
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 *  net.irisshaders.iris.mixinterface.ExtendedBiome
 *  net.irisshaders.iris.parsing.BiomeCategories
 */
package net.irisshaders.iris.uniforms;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.function.IntSupplier;
import java.util.function.ToIntFunction;
import minecraft.class00780;
import minecraft.class00801;
import minecraft.class03556;
import minecraft.class03557;
import minecraft.class04453;
import minecraft.class05946;
import minecraft.class06202;
import net.irisshaders.iris.gl.uniform.FloatSupplier;
import net.irisshaders.iris.gl.uniform.UniformHolder;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.mixinterface.ExtendedBiome;
import net.irisshaders.iris.parsing.BiomeCategories;
import net.irisshaders.iris.uniforms.BiomeUniforms$ToFloatFunction;

public class BiomeUniforms {
    private static final Object2IntMap<class05946<class00780>> biomeMap = new Object2IntOpenHashMap();

    private static BiomeCategories getBiomeCategory(class03556<class00780> class035562) {
        if (class035562.N(class03557.NL)) {
            return BiomeCategories.NONE;
        }
        if (class035562.N(class03557.c)) {
            return BiomeCategories.ICY;
        }
        if (class035562.N(class03557.M)) {
            return BiomeCategories.EXTREME_HILLS;
        }
        if (class035562.N(class03557.B)) {
            return BiomeCategories.TAIGA;
        }
        if (class035562.N(class03557.y)) {
            return BiomeCategories.OCEAN;
        }
        if (class035562.N(class03557.Z)) {
            return BiomeCategories.JUNGLE;
        }
        if (class035562.N(class03557.z)) {
            return BiomeCategories.FOREST;
        }
        if (class035562.N(class03557.R)) {
            return BiomeCategories.MESA;
        }
        if (class035562.N(class03557.W)) {
            return BiomeCategories.NETHER;
        }
        if (class035562.N(class03557.m)) {
            return BiomeCategories.THE_END;
        }
        if (class035562.N(class03557.L)) {
            return BiomeCategories.BEACH;
        }
        if (class035562.N(class03557.T)) {
            return BiomeCategories.DESERT;
        }
        if (class035562.N(class03557.u)) {
            return BiomeCategories.RIVER;
        }
        if (class035562.N(class03557.Nm)) {
            return BiomeCategories.SWAMP;
        }
        if (class035562.N(class03557.Ny)) {
            return BiomeCategories.MUSHROOM;
        }
        if (class035562.N(class03557.i)) {
            return BiomeCategories.MOUNTAIN;
        }
        return BiomeCategories.PLAINS;
    }

    public static Object2IntMap<class05946<class00780>> getBiomeMap() {
        return biomeMap;
    }

    public static void addBiomeUniforms(UniformHolder uniformHolder) {
        uniformHolder.uniform1i(UniformUpdateFrequency.PER_TICK, "biome", BiomeUniforms.playerI(class044532 -> biomeMap.getInt(class044532.method_73183().i(class044532.method_24515()).i().orElse(null)))).uniform1i(UniformUpdateFrequency.PER_TICK, "biome_category", BiomeUniforms.playerI(class044532 -> {
            class03556 class035562 = class044532.method_73183().i(class044532.method_24515());
            ExtendedBiome extendedBiome = (ExtendedBiome)class035562.N();
            if (extendedBiome.getBiomeCategory() == -1) {
                extendedBiome.setBiomeCategory(BiomeUniforms.getBiomeCategory((class03556<class00780>)class035562).ordinal());
                return extendedBiome.getBiomeCategory();
            }
            return extendedBiome.getBiomeCategory();
        })).uniform1i(UniformUpdateFrequency.PER_TICK, "biome_precipitation", BiomeUniforms.playerI(class044532 -> {
            class00801 class008012 = ((class00780)class044532.method_73183().i(class044532.method_24515()).N()).N(class044532.method_24515(), class044532.method_73183().method_8615());
            return switch (class008012) {
                default -> throw new MatchException(null, null);
                case class00801.field_9384 -> 0;
                case class00801.field_9382 -> 1;
                case class00801.field_9383 -> 2;
            };
        })).uniform1f(UniformUpdateFrequency.PER_TICK, "rainfall", BiomeUniforms.playerF(class044532 -> ((ExtendedBiome)class044532.method_73183().i(class044532.method_24515()).N()).getDownfall())).uniform1f(UniformUpdateFrequency.PER_TICK, "temperature", BiomeUniforms.playerF(class044532 -> ((class00780)class044532.method_73183().i(class044532.method_24515()).N()).i()));
    }

    static IntSupplier playerI(ToIntFunction<class04453> toIntFunction) {
        return () -> {
            class04453 class044532 = (class04453)class06202.Nq().T_4;
            if (class044532 == null) {
                return 0;
            }
            return toIntFunction.applyAsInt(class044532);
        };
    }

    static FloatSupplier playerF(BiomeUniforms$ToFloatFunction<class04453> biomeUniforms$ToFloatFunction) {
        return () -> {
            class04453 class044532 = (class04453)class06202.Nq().T_4;
            if (class044532 == null) {
                return 0.0f;
            }
            return biomeUniforms$ToFloatFunction.applyAsFloat(class044532);
        };
    }
}

