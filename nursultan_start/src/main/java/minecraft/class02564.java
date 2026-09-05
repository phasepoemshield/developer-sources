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

public class class02564
extends class04050 {
    public static final MapCodec<class02564> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.INT.fieldOf("max_water_depth").forGetter(class025642 -> class025642.L)).apply(instance, class02564::new));
    private final int L;

    private class02564(int n) {
        this.L = n;
    }

    protected boolean y(class01034 class010342, class06069 class060692, class07209 class072092) {
        int n = class010342.N(class07830.field_13200, class072092.method_10263(), class072092.method_10260());
        return class010342.N(class07830.field_13202, class072092.method_10263(), class072092.method_10260()) - n <= this.L;
    }

    public class04323<?> N() {
        return class04323.u;
    }

    public static class02564 N(int n) {
        return new class02564(n);
    }
}

