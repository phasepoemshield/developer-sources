/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07107
 *  minecraft.class07126
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class06069;
import minecraft.class07107;
import minecraft.class07126;

public final class class06024
extends Record {
    private final class07126 particle;
    private final float probability;
    public static final Codec<class06024> N = RecordCodecBuilder.create(instance -> instance.group((App)class07107.yE.fieldOf("particle").forGetter(class060242 -> class060242.particle), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").forGetter(class060242 -> Float.valueOf(class060242.probability))).apply(instance, class06024::new));

    public class06024(class07126 class071262, float f) {
        this.particle = class071262;
        this.probability = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06024.class, "particle;probability", "particle", "probability"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06024.class, "particle;probability", "particle", "probability"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06024.class, "particle;probability", "particle", "probability"}, this);
    }

    public float y() {
        return this.probability;
    }

    public class07126 N() {
        return this.particle;
    }

    public static List<class06024> N(class07126 class071262, float f) {
        return List.of(new class06024(class071262, f));
    }

    public boolean N(class06069 class060692) {
        return class060692.z() <= this.probability;
    }
}

