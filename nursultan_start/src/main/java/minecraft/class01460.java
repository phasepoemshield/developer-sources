/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P3
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 *  minecraft.class01467
 *  minecraft.class01476
 *  minecraft.class01479
 *  minecraft.class02142
 *  minecraft.class04887
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class01448;
import minecraft.class01455;
import minecraft.class01467;
import minecraft.class01476;
import minecraft.class01479;
import minecraft.class02142;
import minecraft.class04887;
import minecraft.class06069;

public class class01460
extends class01479 {
    public static final MapCodec<class01460> N = RecordCodecBuilder.mapCodec(instance -> class01460.N(instance).apply(instance, class01460::new));
    protected final int y;

    public class01460(class02142 class021422, class02142 class021423, int n) {
        super(class021422, class021423);
        this.y = n;
    }

    protected static <P extends class01460> Products.P3<RecordCodecBuilder.Mu<P>, class02142, class02142, Integer> N(RecordCodecBuilder.Instance<P> instance) {
        return class01460.y(instance).and((App)Codec.intRange((int)0, (int)16).fieldOf("height").forGetter(class014602 -> class014602.y));
    }

    protected boolean N(class06069 class060692, int n, int n2, int n3, int n4, boolean bl) {
        return n == n4 && n3 == n4 && (class060692.y(2) == 0 || n2 == 0);
    }

    public int N(class06069 class060692, int n, class01476 class014762) {
        return this.y;
    }

    protected void N(class04887 class048872, class01455 class014552, class06069 class060692, class01476 class014762, int n, class01467 class014672, int n2, int n3, int n4) {
        for (int i = n4; i >= n4 - n2; --i) {
            int n5 = Math.max(n3 + class014672.y() - 1 - i / 2, 0);
            this.N(class048872, class014552, class060692, class014762, class014672.N(), n5, i, class014672.L());
        }
    }

    protected class01448<?> N() {
        return class01448.N;
    }
}

