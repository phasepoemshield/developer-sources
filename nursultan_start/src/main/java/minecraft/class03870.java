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
import minecraft.class03865;
import minecraft.class03875;
import minecraft.class03876;
import minecraft.class03877;
import minecraft.class03881;
import minecraft.class03912;
import minecraft.class03979;

public final class class03870
extends Record
implements class03877 {
    private final class03876 noise;
    @Deprecated
    private final double xzScale;
    private final double yScale;
    public static final MapCodec<class03870> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03876.N.fieldOf("noise").forGetter(class03870::u), (App)Codec.DOUBLE.fieldOf("xz_scale").forGetter(class03870::i), (App)Codec.DOUBLE.fieldOf("y_scale").forGetter(class03870::W)).apply(instance, class03870::new));
    public static final class03979<class03870> y = class03865.N(N);

    @Override
    public class03979<? extends class03877> L() {
        return y;
    }

    public class03870(class03876 class038762, @Deprecated double d, double d2) {
        this.noise = class038762;
        this.xzScale = d;
        this.yScale = d2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03870.class, "noise;xzScale;yScale", "noise", "xzScale", "yScale"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03870.class, "noise;xzScale;yScale", "noise", "xzScale", "yScale"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03870.class, "noise;xzScale;yScale", "noise", "xzScale", "yScale"}, this);
    }

    @Deprecated
    public double i() {
        return this.xzScale;
    }

    public class03876 u() {
        return this.noise;
    }

    @Override
    public double y() {
        return this.noise.N();
    }

    @Override
    public class03877 N(class03881 class038812) {
        return class038812.apply(new class03870(class038812.N(this.noise), this.xzScale, this.yScale));
    }

    @Override
    public void N(double[] dArray, class03912 class039122) {
        class039122.N(dArray, this);
    }

    @Override
    public double N(class03875 class038752) {
        return this.noise.N((double)class038752.y() * this.xzScale, (double)class038752.L() * this.yScale, (double)class038752.u() * this.xzScale);
    }

    @Override
    public double N() {
        return -this.y();
    }

    public double W() {
        return this.yScale;
    }
}

