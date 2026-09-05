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

public final class class03878
extends Record
implements class03877 {
    private final class03877 shiftX;
    private final class03877 shiftY;
    private final class03877 shiftZ;
    private final double xzScale;
    private final double yScale;
    private final class03876 noise;
    private static final MapCodec<class03878> U = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03877.R.fieldOf("shift_x").forGetter(class03878::u), (App)class03877.R.fieldOf("shift_y").forGetter(class03878::i), (App)class03877.R.fieldOf("shift_z").forGetter(class03878::W), (App)Codec.DOUBLE.fieldOf("xz_scale").forGetter(class03878::m), (App)Codec.DOUBLE.fieldOf("y_scale").forGetter(class03878::P), (App)class03876.N.fieldOf("noise").forGetter(class03878::s)).apply(instance, class03878::new));
    public static final class03979<class03878> N = class03865.N(U);

    @Override
    public class03979<? extends class03877> L() {
        return N;
    }

    public double P() {
        return this.yScale;
    }

    public class03878(class03877 class038772, class03877 class038773, class03877 class038774, double d, double d2, class03876 class038762) {
        this.shiftX = class038772;
        this.shiftY = class038773;
        this.shiftZ = class038774;
        this.xzScale = d;
        this.yScale = d2;
        this.noise = class038762;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03878.class, "shiftX;shiftY;shiftZ;xzScale;yScale;noise", "shiftX", "shiftY", "shiftZ", "xzScale", "yScale", "noise"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03878.class, "shiftX;shiftY;shiftZ;xzScale;yScale;noise", "shiftX", "shiftY", "shiftZ", "xzScale", "yScale", "noise"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03878.class, "shiftX;shiftY;shiftZ;xzScale;yScale;noise", "shiftX", "shiftY", "shiftZ", "xzScale", "yScale", "noise"}, this);
    }

    public class03877 i() {
        return this.shiftY;
    }

    public class03876 s() {
        return this.noise;
    }

    public double m() {
        return this.xzScale;
    }

    public class03877 u() {
        return this.shiftX;
    }

    @Override
    public double y() {
        return this.noise.N();
    }

    @Override
    public double N() {
        return -this.y();
    }

    @Override
    public double N(class03875 class038752) {
        double d = (double)class038752.y() * this.xzScale + this.shiftX.N(class038752);
        double d2 = (double)class038752.L() * this.yScale + this.shiftY.N(class038752);
        double d3 = (double)class038752.u() * this.xzScale + this.shiftZ.N(class038752);
        return this.noise.N(d, d2, d3);
    }

    @Override
    public class03877 N(class03881 class038812) {
        return class038812.apply(new class03878(this.shiftX.N(class038812), this.shiftY.N(class038812), this.shiftZ.N(class038812), this.xzScale, this.yScale, class038812.N(this.noise)));
    }

    @Override
    public void N(double[] dArray, class03912 class039122) {
        class039122.N(dArray, this);
    }

    public class03877 W() {
        return this.shiftZ;
    }
}

