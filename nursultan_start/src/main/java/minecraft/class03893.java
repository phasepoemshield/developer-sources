/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03865;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03881;
import minecraft.class03912;
import minecraft.class03979;

final class class03893
extends Record
implements class03877 {
    private final class03877 input;
    private final double minInclusive;
    private final double maxExclusive;
    private final class03877 whenInRange;
    private final class03877 whenOutOfRange;
    public static final MapCodec<class03893> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03877.R.fieldOf("input").forGetter(class03893::u), (App)class03865.y.fieldOf("min_inclusive").forGetter(class03893::i), (App)class03865.y.fieldOf("max_exclusive").forGetter(class03893::W), (App)class03877.R.fieldOf("when_in_range").forGetter(class03893::m), (App)class03877.R.fieldOf("when_out_of_range").forGetter(class03893::P)).apply(instance, class03893::new));
    public static final class03979<class03893> y = class03865.N(N);

    @Override
    public class03979<? extends class03877> L() {
        return y;
    }

    public class03877 P() {
        return this.whenOutOfRange;
    }

    class03893(class03877 class038772, double d, double d2, class03877 class038773, class03877 class038774) {
        this.input = class038772;
        this.minInclusive = d;
        this.maxExclusive = d2;
        this.whenInRange = class038773;
        this.whenOutOfRange = class038774;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03893.class, "input;minInclusive;maxExclusive;whenInRange;whenOutOfRange", "input", "minInclusive", "maxExclusive", "whenInRange", "whenOutOfRange"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03893.class, "input;minInclusive;maxExclusive;whenInRange;whenOutOfRange", "input", "minInclusive", "maxExclusive", "whenInRange", "whenOutOfRange"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03893.class, "input;minInclusive;maxExclusive;whenInRange;whenOutOfRange", "input", "minInclusive", "maxExclusive", "whenInRange", "whenOutOfRange"}, this);
    }

    public double i() {
        return this.minInclusive;
    }

    public class03877 m() {
        return this.whenInRange;
    }

    public class03877 u() {
        return this.input;
    }

    @Override
    public double y() {
        return Math.max(this.whenInRange.y(), this.whenOutOfRange.y());
    }

    @Override
    public double N(class03875 class038752) {
        double d = this.input.N(class038752);
        if (d >= this.minInclusive && d < this.maxExclusive) {
            return this.whenInRange.N(class038752);
        }
        return this.whenOutOfRange.N(class038752);
    }

    @Override
    public double N() {
        return Math.min(this.whenInRange.N(), this.whenOutOfRange.N());
    }

    @Override
    public void N(double[] dArray, class03912 class039122) {
        this.input.N(dArray, class039122);
        for (int i = 0; i < dArray.length; ++i) {
            double d = dArray[i];
            dArray[i] = d >= this.minInclusive && d < this.maxExclusive ? this.whenInRange.N(class039122.L(i)) : this.whenOutOfRange.N(class039122.L(i));
        }
    }

    @Override
    public class03877 N(class03881 class038812) {
        return class038812.apply(new class03893(this.input.N(class038812), this.minInclusive, this.maxExclusive, this.whenInRange.N(class038812), this.whenOutOfRange.N(class038812)));
    }

    public double W() {
        return this.maxExclusive;
    }
}

