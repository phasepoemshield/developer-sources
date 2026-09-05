/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Function;
import minecraft.class03877;
import minecraft.class03881;

public final class class03866
extends Record {
    private final class03877 barrierNoise;
    private final class03877 fluidLevelFloodednessNoise;
    private final class03877 fluidLevelSpreadNoise;
    private final class03877 lavaNoise;
    private final class03877 temperature;
    private final class03877 vegetation;
    private final class03877 continents;
    private final class03877 erosion;
    private final class03877 depth;
    private final class03877 ridges;
    private final class03877 preliminarySurfaceLevel;
    private final class03877 finalDensity;
    private final class03877 veinToggle;
    private final class03877 veinRidged;
    private final class03877 veinGap;
    public static final Codec<class03866> N = RecordCodecBuilder.create(instance -> instance.group(class03866.N("barrier", class03866::N), class03866.N("fluid_level_floodedness", class03866::y), class03866.N("fluid_level_spread", class03866::L), class03866.N("lava", class03866::u), class03866.N("temperature", class03866::i), class03866.N("vegetation", class03866::R), class03866.N("continents", class03866::M), class03866.N("erosion", class03866::B), class03866.N("depth", class03866::Z), class03866.N("ridges", class03866::z), class03866.N("preliminary_surface_level", class03866::U), class03866.N("final_density", class03866::E), class03866.N("vein_toggle", class03866::W), class03866.N("vein_ridged", class03866::m), class03866.N("vein_gap", class03866::P)).apply(instance, class03866::new));

    public class03877 L() {
        return this.fluidLevelSpreadNoise;
    }

    public class03877 M() {
        return this.continents;
    }

    public class03877 P() {
        return this.veinGap;
    }

    public class03866(class03877 class038772, class03877 class038773, class03877 class038774, class03877 class038775, class03877 class038776, class03877 class038777, class03877 class038778, class03877 class038779, class03877 class0387710, class03877 class0387711, class03877 class0387712, class03877 class0387713, class03877 class0387714, class03877 class0387715, class03877 class0387716) {
        this.barrierNoise = class038772;
        this.fluidLevelFloodednessNoise = class038773;
        this.fluidLevelSpreadNoise = class038774;
        this.lavaNoise = class038775;
        this.temperature = class038776;
        this.vegetation = class038777;
        this.continents = class038778;
        this.erosion = class038779;
        this.depth = class0387710;
        this.ridges = class0387711;
        this.preliminarySurfaceLevel = class0387712;
        this.finalDensity = class0387713;
        this.veinToggle = class0387714;
        this.veinRidged = class0387715;
        this.veinGap = class0387716;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03866.class, "barrierNoise;fluidLevelFloodednessNoise;fluidLevelSpreadNoise;lavaNoise;temperature;vegetation;continents;erosion;depth;ridges;preliminarySurfaceLevel;finalDensity;veinToggle;veinRidged;veinGap", "barrierNoise", "fluidLevelFloodednessNoise", "fluidLevelSpreadNoise", "lavaNoise", "temperature", "vegetation", "continents", "erosion", "depth", "ridges", "preliminarySurfaceLevel", "finalDensity", "veinToggle", "veinRidged", "veinGap"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03866.class, "barrierNoise;fluidLevelFloodednessNoise;fluidLevelSpreadNoise;lavaNoise;temperature;vegetation;continents;erosion;depth;ridges;preliminarySurfaceLevel;finalDensity;veinToggle;veinRidged;veinGap", "barrierNoise", "fluidLevelFloodednessNoise", "fluidLevelSpreadNoise", "lavaNoise", "temperature", "vegetation", "continents", "erosion", "depth", "ridges", "preliminarySurfaceLevel", "finalDensity", "veinToggle", "veinRidged", "veinGap"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03866.class, "barrierNoise;fluidLevelFloodednessNoise;fluidLevelSpreadNoise;lavaNoise;temperature;vegetation;continents;erosion;depth;ridges;preliminarySurfaceLevel;finalDensity;veinToggle;veinRidged;veinGap", "barrierNoise", "fluidLevelFloodednessNoise", "fluidLevelSpreadNoise", "lavaNoise", "temperature", "vegetation", "continents", "erosion", "depth", "ridges", "preliminarySurfaceLevel", "finalDensity", "veinToggle", "veinRidged", "veinGap"}, this);
    }

    public class03877 B() {
        return this.erosion;
    }

    public class03877 Z() {
        return this.depth;
    }

    public class03877 i() {
        return this.temperature;
    }

    public class03877 m() {
        return this.veinRidged;
    }

    public class03877 U() {
        return this.preliminarySurfaceLevel;
    }

    public class03877 z() {
        return this.ridges;
    }

    public class03877 u() {
        return this.lavaNoise;
    }

    public class03877 y() {
        return this.fluidLevelFloodednessNoise;
    }

    public class03877 E() {
        return this.finalDensity;
    }

    private static RecordCodecBuilder<class03866, class03877> N(String string, Function<class03866, class03877> function) {
        return class03877.R.fieldOf(string).forGetter(function);
    }

    public class03877 N() {
        return this.barrierNoise;
    }

    public class03866 N(class03881 class038812) {
        return new class03866(this.barrierNoise.N(class038812), this.fluidLevelFloodednessNoise.N(class038812), this.fluidLevelSpreadNoise.N(class038812), this.lavaNoise.N(class038812), this.temperature.N(class038812), this.vegetation.N(class038812), this.continents.N(class038812), this.erosion.N(class038812), this.depth.N(class038812), this.ridges.N(class038812), this.preliminarySurfaceLevel.N(class038812), this.finalDensity.N(class038812), this.veinToggle.N(class038812), this.veinRidged.N(class038812), this.veinGap.N(class038812));
    }

    public class03877 W() {
        return this.veinToggle;
    }

    public class03877 R() {
        return this.vegetation;
    }
}

