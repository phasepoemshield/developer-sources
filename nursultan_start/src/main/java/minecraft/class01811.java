/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01034
 *  minecraft.class04050
 *  minecraft.class04323
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07830
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class01034;
import minecraft.class04050;
import minecraft.class04323;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07830;

public class class01811
extends class04050 {
    public static final MapCodec<class01811> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class07830.field_24772.fieldOf("heightmap").forGetter(class018112 -> class018112.L), (App)Codec.INT.optionalFieldOf("min_inclusive", (Object)Integer.MIN_VALUE).forGetter(class018112 -> class018112.u), (App)Codec.INT.optionalFieldOf("max_inclusive", (Object)Integer.MAX_VALUE).forGetter(class018112 -> class018112.i)).apply(instance, class01811::new));
    private final class07830 L;
    private final int u;
    private final int i;

    private class01811(class07830 class078302, int n, int n2) {
        this.L = class078302;
        this.u = n;
        this.i = n2;
    }

    protected boolean y(class01034 class010342, class06069 class060692, class07209 class072092) {
        long l = class010342.N(this.L, class072092.method_10263(), class072092.method_10260());
        long l2 = l + (long)this.u;
        long l3 = l + (long)this.i;
        return l2 <= (long)class072092.method_10264() && (long)class072092.method_10264() <= l3;
    }

    public static class01811 N(class07830 class078302, int n, int n2) {
        return new class01811(class078302, n, n2);
    }

    public class04323<?> N() {
        return class04323.L;
    }
}

