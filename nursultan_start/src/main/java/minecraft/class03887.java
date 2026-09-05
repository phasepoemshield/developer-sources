/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04562
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03865;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03881;
import minecraft.class03890;
import minecraft.class03903;
import minecraft.class03912;
import minecraft.class03979;
import minecraft.class04562;

public final class class03887
extends Record
implements class03877 {
    private final class04562<class03903, class03890> spline;
    private static final Codec<class04562<class03903, class03890>> L = class04562.N(class03890.N);
    private static final MapCodec<class03887> M = L.fieldOf("spline").xmap(class03887::new, class03887::u);
    public static final class03979<class03887> N = class03865.N(M);

    @Override
    public class03979<? extends class03877> L() {
        return N;
    }

    public class03887(class04562<class03903, class03890> class045622) {
        this.spline = class045622;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03887.class, "spline", "spline"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03887.class, "spline", "spline"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03887.class, "spline", "spline"}, this);
    }

    public class04562<class03903, class03890> u() {
        return this.spline;
    }

    @Override
    public double y() {
        return this.spline.L();
    }

    @Override
    public double N() {
        return this.spline.y();
    }

    @Override
    public class03877 N(class03881 class038812) {
        return class038812.apply(new class03887((class04562<class03903, class03890>)this.spline.N_48(class038902 -> class038902.N(class038812))));
    }

    @Override
    public void N(double[] dArray, class03912 class039122) {
        class039122.N(dArray, this);
    }

    @Override
    public double N(class03875 class038752) {
        return this.spline.N((Object)new class03903(class038752));
    }
}

