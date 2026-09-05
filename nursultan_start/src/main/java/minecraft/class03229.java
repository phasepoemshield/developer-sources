/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04995
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class03195;
import minecraft.class03216;
import minecraft.class03231;
import minecraft.class04995;

public final class class03229
extends Record {
    private final class03195 temperature;
    private final class03195 humidity;
    private final class03195 continentalness;
    private final class03195 erosion;
    private final class03195 depth;
    private final class03195 weirdness;
    private final long offset;
    public static final Codec<class03229> N = RecordCodecBuilder.create(instance -> instance.group((App)class03195.N.fieldOf("temperature").forGetter(class032292 -> class032292.temperature), (App)class03195.N.fieldOf("humidity").forGetter(class032292 -> class032292.humidity), (App)class03195.N.fieldOf("continentalness").forGetter(class032292 -> class032292.continentalness), (App)class03195.N.fieldOf("erosion").forGetter(class032292 -> class032292.erosion), (App)class03195.N.fieldOf("depth").forGetter(class032292 -> class032292.depth), (App)class03195.N.fieldOf("weirdness").forGetter(class032292 -> class032292.weirdness), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("offset").xmap(class03216::N, class03216::N).forGetter(class032292 -> class032292.offset)).apply(instance, class03229::new));

    public class03195 L() {
        return this.humidity;
    }

    public class03195 M() {
        return this.weirdness;
    }

    public class03229(class03195 class031952, class03195 class031953, class03195 class031954, class03195 class031955, class03195 class031956, class03195 class031957, long l) {
        this.temperature = class031952;
        this.humidity = class031953;
        this.continentalness = class031954;
        this.erosion = class031955;
        this.depth = class031956;
        this.weirdness = class031957;
        this.offset = l;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03229.class, "temperature;humidity;continentalness;erosion;depth;weirdness;offset", "temperature", "humidity", "continentalness", "erosion", "depth", "weirdness", "offset"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03229.class, "temperature;humidity;continentalness;erosion;depth;weirdness;offset", "temperature", "humidity", "continentalness", "erosion", "depth", "weirdness", "offset"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03229.class, "temperature;humidity;continentalness;erosion;depth;weirdness;offset", "temperature", "humidity", "continentalness", "erosion", "depth", "weirdness", "offset"}, this);
    }

    public long B() {
        return this.offset;
    }

    public class03195 i() {
        return this.erosion;
    }

    public class03195 u() {
        return this.continentalness;
    }

    public class03195 y() {
        return this.temperature;
    }

    long N(class03231 class032312) {
        return class04995.y((long)this.temperature.N(class032312.y())) + class04995.y((long)this.humidity.N(class032312.L())) + class04995.y((long)this.continentalness.N(class032312.u())) + class04995.y((long)this.erosion.N(class032312.i())) + class04995.y((long)this.depth.N(class032312.R())) + class04995.y((long)this.weirdness.N(class032312.M())) + class04995.y((long)this.offset);
    }

    protected List<class03195> N() {
        return ImmutableList.of((Object)((Object)this.temperature), (Object)((Object)this.humidity), (Object)((Object)this.continentalness), (Object)((Object)this.erosion), (Object)((Object)this.depth), (Object)((Object)this.weirdness), (Object)((Object)new class03195(this.offset, this.offset)));
    }

    public class03195 R() {
        return this.depth;
    }
}

