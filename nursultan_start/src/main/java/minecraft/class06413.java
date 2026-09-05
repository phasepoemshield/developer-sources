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

public class class06413
extends class06041 {
    public static final MapCodec<class06413> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.DOUBLE.fieldOf("noise_level").forGetter(class064132 -> class064132.L), (App)Codec.INT.fieldOf("below_noise").forGetter(class064132 -> class064132.u), (App)Codec.INT.fieldOf("above_noise").forGetter(class064132 -> class064132.i)).apply(instance, class06413::new));
    private final double L;
    private final int u;
    private final int i;

    private class06413(double d, int n, int n2) {
        this.L = d;
        this.u = n;
        this.i = n2;
    }

    public class04323<?> N() {
        return class04323.B;
    }

    public static class06413 N(double d, int n, int n2) {
        return new class06413(d, n, n2);
    }

    protected int N(class06069 class060692, class07209 class072092) {
        return class00780.R.N((double)class072092.method_10263() / 200.0, (double)class072092.method_10260() / 200.0, false) < this.L ? this.u : this.i;
    }
}

