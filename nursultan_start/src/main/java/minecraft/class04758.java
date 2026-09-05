/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Keyable
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00780
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04426
 *  minecraft.class05033
 *  minecraft.class05946
 *  minecraft.class06040
 *  minecraft.class07428
 *  minecraft.class07852
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Keyable;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class00780;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04426;
import minecraft.class05033;
import minecraft.class05946;
import minecraft.class06040;
import minecraft.class07428;
import minecraft.class07852;

public final class class04758
extends Record {
    final class03543<class00780> biomes;
    public final Map<class07428, class04426> spawnOverrides;
    public final class07852 step;
    public final class06040 terrainAdaptation;
    public static final class04758 i = new class04758((class03543<class00780>)class03543.N((class03556[])new class03556[0]), Map.of(), class07852.field_13173, class06040.field_28922);
    public static final MapCodec<class04758> R = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03541.N((class05946)class04227.NA).fieldOf("biomes").forGetter(class04758::N), (App)Codec.simpleMap((Codec)class07428.field_24655, (Codec)class04426.N, (Keyable)class05033.y((class05033[])class07428.values())).fieldOf("spawn_overrides").forGetter(class04758::y), (App)class07852.field_37680.fieldOf("step").forGetter(class04758::L), (App)class06040.field_38433.optionalFieldOf("terrain_adaptation", (Object)class04758.i.terrainAdaptation).forGetter(class04758::u)).apply(instance, class04758::new));

    public class07852 L() {
        return this.step;
    }

    public class04758(class03543<class00780> class035432) {
        this(class035432, class04758.i.spawnOverrides, class04758.i.step, class04758.i.terrainAdaptation);
    }

    public class04758(class03543<class00780> class035432, Map<class07428, class04426> map, class07852 class078522, class06040 class060402) {
        this.biomes = class035432;
        this.spawnOverrides = map;
        this.step = class078522;
        this.terrainAdaptation = class060402;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04758.class, "biomes;spawnOverrides;step;terrainAdaptation", "biomes", "spawnOverrides", "step", "terrainAdaptation"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04758.class, "biomes;spawnOverrides;step;terrainAdaptation", "biomes", "spawnOverrides", "step", "terrainAdaptation"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04758.class, "biomes;spawnOverrides;step;terrainAdaptation", "biomes", "spawnOverrides", "step", "terrainAdaptation"}, this);
    }

    public class06040 u() {
        return this.terrainAdaptation;
    }

    public Map<class07428, class04426> y() {
        return this.spawnOverrides;
    }

    public class03543<class00780> N() {
        return this.biomes;
    }
}

