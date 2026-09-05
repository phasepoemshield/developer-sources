/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00780
 *  minecraft.class04323
 *  minecraft.class06041
 *  minecraft.class06069
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00780;
import minecraft.class04323;
import minecraft.class06041;
import minecraft.class06069;
import minecraft.class07209;

public class class01600
extends class06041 {
    public static final MapCodec<class01600> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.INT.fieldOf("noise_to_count_ratio").forGetter(class016002 -> class016002.L), (App)Codec.DOUBLE.fieldOf("noise_factor").forGetter(class016002 -> class016002.u), (App)Codec.DOUBLE.fieldOf("noise_offset").orElse((Object)0.0).forGetter(class016002 -> class016002.i)).apply(instance, class01600::new));
    private final int L;
    private final double u;
    private final double i;

    private class01600(int n, double d, double d2) {
        this.L = n;
        this.u = d;
        this.i = d2;
    }

    public class04323<?> N() {
        return class04323.M;
    }

    public static class01600 N(int n, double d, double d2) {
        return new class01600(n, d, d2);
    }

    protected int N(class06069 class060692, class07209 class072092) {
        return (int)Math.ceil((class00780.R.N((double)class072092.method_10263() / this.u, (double)class072092.method_10260() / this.u, false) + this.i) * (double)this.L);
    }
}

