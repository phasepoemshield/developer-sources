/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10285
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04995
 *  minecraft.class06338
 *  minecraft.class07376
 */
package minecraft;

import Nursultan.class10285;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
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
import minecraft.class04995;
import minecraft.class06338;
import minecraft.class07376;

final class class03889
extends Record
implements class03877 {
    private final class03877 density;
    private final class03877 upperBound;
    private final int lowerBound;
    private final int cellHeight;
    private static final MapCodec<class03889> Z = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03877.R.fieldOf("density").forGetter(class03889::u), (App)class03877.R.fieldOf("upper_bound").forGetter(class03889::i), (App)Codec.intRange((int)(class07376.i * 2), (int)(class07376.u * 2)).fieldOf("lower_bound").forGetter(class03889::W), (App)class06338.b.fieldOf("cell_height").forGetter(class03889::m)).apply(instance, class03889::new));
    public static final class03979<class03889> N = class03865.N(Z);

    @Override
    public class03979<? extends class03877> L() {
        return N;
    }

    class03889(class03877 class038772, class03877 class038773, int n, int n2) {
        this.density = class038772;
        this.upperBound = class038773;
        this.lowerBound = n;
        this.cellHeight = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03889.class, "density;upperBound;lowerBound;cellHeight", "density", "upperBound", "lowerBound", "cellHeight"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03889.class, "density;upperBound;lowerBound;cellHeight", "density", "upperBound", "lowerBound", "cellHeight"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03889.class, "density;upperBound;lowerBound;cellHeight", "density", "upperBound", "lowerBound", "cellHeight"}, this);
    }

    public class03877 i() {
        return this.upperBound;
    }

    public int m() {
        return this.cellHeight;
    }

    public class03877 u() {
        return this.density;
    }

    @Override
    public double y() {
        return Math.max((double)this.lowerBound, this.upperBound.y());
    }

    @Override
    public class03877 N(class03881 class038812) {
        return class038812.apply(new class03889(this.density.N(class038812), this.upperBound.N(class038812), this.lowerBound, this.cellHeight));
    }

    @Override
    public double N(class03875 class038752) {
        int n = class04995.N((double)(this.upperBound.N(class038752) / (double)this.cellHeight)) * this.cellHeight;
        if (n <= this.lowerBound) {
            return this.lowerBound;
        }
        for (int i = n; i >= this.lowerBound; i -= this.cellHeight) {
            class10285 class102852 = new class10285(class038752.y(), i, class038752.u());
            if (!(this.density.N((class03875)class102852) > 0.0)) continue;
            return i;
        }
        return this.lowerBound;
    }

    @Override
    public void N(double[] dArray, class03912 class039122) {
        class039122.N(dArray, this);
    }

    @Override
    public double N() {
        return this.lowerBound;
    }

    public int W() {
        return this.lowerBound;
    }
}

