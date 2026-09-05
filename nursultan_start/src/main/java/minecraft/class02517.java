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
 *  minecraft.class06042
 *  minecraft.class06052
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06042;
import minecraft.class06052;
import minecraft.class06069;

public final class class02517
extends Record {
    private final float movementScale;
    private final class06052 base;
    public static final MapCodec<class02517> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.FLOAT.optionalFieldOf("movement_scale", (Object)Float.valueOf(0.0f)).forGetter(class02517::N), (App)class06052.L.optionalFieldOf("base", (Object)class06042.N).forGetter(class02517::y)).apply(instance, class02517::new));

    public class02517(float f, class06052 class060522) {
        this.movementScale = f;
        this.base = class060522;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02517.class, "movementScale;base", "movementScale", "base"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02517.class, "movementScale;base", "movementScale", "base"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02517.class, "movementScale;base", "movementScale", "base"}, this);
    }

    public class06052 y() {
        return this.base;
    }

    public float N() {
        return this.movementScale;
    }

    public double N(double d, class06069 class060692) {
        return d * (double)this.movementScale + (double)this.base.N(class060692);
    }
}

