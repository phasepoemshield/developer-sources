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
 *  minecraft.class04995
 *  minecraft.class07376
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03865;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03908;
import minecraft.class03979;
import minecraft.class04995;
import minecraft.class07376;

final class class03902
extends Record
implements class03908 {
    private final int fromY;
    private final int toY;
    private final double fromValue;
    private final double toValue;
    private static final MapCodec<class03902> Z = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.intRange((int)(class07376.i * 2), (int)(class07376.u * 2)).fieldOf("from_y").forGetter(class03902::u), (App)Codec.intRange((int)(class07376.i * 2), (int)(class07376.u * 2)).fieldOf("to_y").forGetter(class03902::i), (App)class03865.y.fieldOf("from_value").forGetter(class03902::W), (App)class03865.y.fieldOf("to_value").forGetter(class03902::m)).apply(instance, class03902::new));
    public static final class03979<class03902> N = class03865.N(Z);

    @Override
    public class03979<? extends class03877> L() {
        return N;
    }

    class03902(int n, int n2, double d, double d2) {
        this.fromY = n;
        this.toY = n2;
        this.fromValue = d;
        this.toValue = d2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03902.class, "fromY;toY;fromValue;toValue", "fromY", "toY", "fromValue", "toValue"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03902.class, "fromY;toY;fromValue;toValue", "fromY", "toY", "fromValue", "toValue"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03902.class, "fromY;toY;fromValue;toValue", "fromY", "toY", "fromValue", "toValue"}, this);
    }

    public int i() {
        return this.toY;
    }

    public double m() {
        return this.toValue;
    }

    public int u() {
        return this.fromY;
    }

    @Override
    public double y() {
        return Math.max(this.fromValue, this.toValue);
    }

    @Override
    public double N(class03875 class038752) {
        return class04995.N((double)class038752.L(), (double)this.fromY, (double)this.toY, (double)this.fromValue, (double)this.toValue);
    }

    @Override
    public double N() {
        return Math.min(this.fromValue, this.toValue);
    }

    public double W() {
        return this.fromValue;
    }
}

