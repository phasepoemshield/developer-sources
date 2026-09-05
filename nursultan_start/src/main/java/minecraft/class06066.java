/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class03875
 *  minecraft.class03877
 *  minecraft.class03908
 *  minecraft.class03979
 *  minecraft.class04042
 *  minecraft.class04860
 *  minecraft.class04995
 *  minecraft.class05008
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;
import java.util.stream.IntStream;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03908;
import minecraft.class03979;
import minecraft.class04042;
import minecraft.class04860;
import minecraft.class04995;
import minecraft.class05008;
import minecraft.class06069;

public class class06066
implements class03908 {
    private static final Codec<Double> y = Codec.doubleRange((double)0.001, (double)1000.0);
    private static final MapCodec<class06066> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)y.fieldOf("xz_scale").forGetter(class060662 -> class060662.s), (App)y.fieldOf("y_scale").forGetter(class060662 -> class060662.T), (App)y.fieldOf("xz_factor").forGetter(class060662 -> class060662.E), (App)y.fieldOf("y_factor").forGetter(class060662 -> class060662.W), (App)Codec.doubleRange((double)1.0, (double)8.0).fieldOf("smear_scale_multiplier").forGetter(class060662 -> class060662.m)).apply(instance, class06066::N));
    public static final class03979<class06066> N = class03979.N(L);
    private final class05008 M;
    private final class05008 B;
    private final class05008 Z;
    private final double z;
    private final double U;
    private final double E;
    private final double W;
    private final double m;
    private final double P;
    private final double s;
    private final double T;

    public class03979<? extends class03877> L() {
        return N;
    }

    public class06066(class06069 class060692, double d, double d2, double d3, double d4, double d5) {
        this(class05008.N((class06069)class060692, (IntStream)IntStream.rangeClosed(-15, 0)), class05008.N((class06069)class060692, (IntStream)IntStream.rangeClosed(-15, 0)), class05008.N((class06069)class060692, (IntStream)IntStream.rangeClosed(-7, 0)), d, d2, d3, d4, d5);
    }

    private class06066(class05008 class050082, class05008 class050083, class05008 class050084, double d, double d2, double d3, double d4, double d5) {
        this.M = class050082;
        this.B = class050083;
        this.Z = class050084;
        this.s = d;
        this.T = d2;
        this.E = d3;
        this.W = d4;
        this.m = d5;
        this.z = 684.412 * this.s;
        this.U = 684.412 * this.T;
        this.P = class050082.N(this.U);
    }

    public double y() {
        return this.P;
    }

    public class06066 N(class06069 class060692) {
        return new class06066(class060692, this.s, this.T, this.E, this.W, this.m);
    }

    public static class06066 N(double d, double d2, double d3, double d4, double d5) {
        return new class06066((class06069)new class04042(0L), d, d2, d3, d4, d5);
    }

    public double N() {
        return -this.y();
    }

    public void N(StringBuilder stringBuilder) {
        stringBuilder.append("BlendedNoise{minLimitNoise=");
        this.M.N(stringBuilder);
        stringBuilder.append(", maxLimitNoise=");
        this.B.N(stringBuilder);
        stringBuilder.append(", mainNoise=");
        this.Z.N(stringBuilder);
        stringBuilder.append(String.format(Locale.ROOT, ", xzScale=%.3f, yScale=%.3f, xzMainScale=%.3f, yMainScale=%.3f, cellWidth=4, cellHeight=8", 684.412, 684.412, 8.555150000000001, 4.277575000000001)).append('}');
    }

    public double N(class03875 class038752) {
        double d = (double)class038752.y() * this.z;
        double d2 = (double)class038752.L() * this.U;
        double d3 = (double)class038752.u() * this.z;
        double d4 = d / this.E;
        double d5 = d2 / this.W;
        double d6 = d3 / this.E;
        double d7 = this.U * this.m;
        double d8 = d7 / this.W;
        double d9 = 0.0;
        double d10 = 0.0;
        double d11 = 0.0;
        boolean bl = true;
        double d12 = 1.0;
        for (int i = 0; i < 8; ++i) {
            class04860 class048602 = this.Z.N(i);
            if (class048602 != null) {
                d11 += class048602.N(class05008.y((double)(d4 * d12)), class05008.y((double)(d5 * d12)), class05008.y((double)(d6 * d12)), d8 * d12, d5 * d12) / d12;
            }
            d12 /= 2.0;
        }
        double d13 = (d11 / 10.0 + 1.0) / 2.0;
        boolean bl2 = d13 >= 1.0;
        boolean bl3 = d13 <= 0.0;
        d12 = 1.0;
        for (int i = 0; i < 16; ++i) {
            class04860 class048603;
            double d14 = class05008.y((double)(d * d12));
            double d15 = class05008.y((double)(d2 * d12));
            double d16 = class05008.y((double)(d3 * d12));
            double d17 = d7 * d12;
            if (!bl2 && (class048603 = this.M.N(i)) != null) {
                d9 += class048603.N(d14, d15, d16, d17, d2 * d12) / d12;
            }
            if (!bl3 && (class048603 = this.B.N(i)) != null) {
                d10 += class048603.N(d14, d15, d16, d17, d2 * d12) / d12;
            }
            d12 /= 2.0;
        }
        return class04995.y((double)d13, (double)(d9 / 512.0), (double)(d10 / 512.0)) / 128.0;
    }
}

