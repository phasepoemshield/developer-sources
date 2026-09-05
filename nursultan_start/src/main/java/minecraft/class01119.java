/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class01119 {
    private static final Codec<Double> R = Codec.doubleRange((double)0.01, (double)50.0);
    public static final Codec<class01119> N = RecordCodecBuilder.create(instance -> instance.group((App)R.fieldOf("filling").orElse((Object)1.7).forGetter(class011192 -> class011192.y), (App)R.fieldOf("inner_layer").orElse((Object)2.2).forGetter(class011192 -> class011192.L), (App)R.fieldOf("middle_layer").orElse((Object)3.2).forGetter(class011192 -> class011192.u), (App)R.fieldOf("outer_layer").orElse((Object)4.2).forGetter(class011192 -> class011192.i)).apply(instance, class01119::new));
    public final double y;
    public final double L;
    public final double u;
    public final double i;

    public class01119(double d, double d2, double d3, double d4) {
        this.y = d;
        this.L = d2;
        this.u = d3;
        this.i = d4;
    }
}

