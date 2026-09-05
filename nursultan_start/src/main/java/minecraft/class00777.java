/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00785;

public final class class00777
extends Record {
    private final boolean hasPrecipitation;
    final float temperature;
    final class00785 temperatureModifier;
    final float downfall;
    public static final MapCodec<class00777> u = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.BOOL.fieldOf("has_precipitation").forGetter(class007772 -> class007772.hasPrecipitation), (App)Codec.FLOAT.fieldOf("temperature").forGetter(class007772 -> Float.valueOf(class007772.temperature)), (App)class00785.field_26409.optionalFieldOf("temperature_modifier", (Object)class00785.field_26407).forGetter(class007772 -> class007772.temperatureModifier), (App)Codec.FLOAT.fieldOf("downfall").forGetter(class007772 -> Float.valueOf(class007772.downfall))).apply(instance, class00777::new));

    public class00785 L() {
        return this.temperatureModifier;
    }

    public class00777(boolean bl, float f, class00785 class007852, float f2) {
        this.hasPrecipitation = bl;
        this.temperature = f;
        this.temperatureModifier = class007852;
        this.downfall = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00777.class, "hasPrecipitation;temperature;temperatureModifier;downfall", "hasPrecipitation", "temperature", "temperatureModifier", "downfall"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00777.class, "hasPrecipitation;temperature;temperatureModifier;downfall", "hasPrecipitation", "temperature", "temperatureModifier", "downfall"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00777.class, "hasPrecipitation;temperature;temperatureModifier;downfall", "hasPrecipitation", "temperature", "temperatureModifier", "downfall"}, this);
    }

    public float u() {
        return this.downfall;
    }

    public float y() {
        return this.temperature;
    }

    public boolean N() {
        return this.hasPrecipitation;
    }
}

