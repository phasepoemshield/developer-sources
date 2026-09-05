/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01448
 *  minecraft.class01455
 *  minecraft.class01460
 *  minecraft.class01467
 *  minecraft.class01476
 *  minecraft.class02142
 *  minecraft.class04887
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class01448;
import minecraft.class01455;
import minecraft.class01460;
import minecraft.class01467;
import minecraft.class01476;
import minecraft.class02142;
import minecraft.class04887;
import minecraft.class06069;

public class class05047
extends class01460 {
    public static final MapCodec<class05047> R = RecordCodecBuilder.mapCodec(instance -> class05047.N(instance).apply(instance, class05047::new));

    public class05047(class02142 class021422, class02142 class021423, int n) {
        super(class021422, class021423, n);
    }

    protected void N(class04887 class048872, class01455 class014552, class06069 class060692, class01476 class014762, int n, class01467 class014672, int n2, int n3, int n4) {
        for (int i = n4; i >= n4 - n2; --i) {
            int n5 = n3 + class014672.y() - 1 - i;
            this.N(class048872, class014552, class060692, class014762, class014672.N(), n5, i, class014672.L());
        }
    }

    protected class01448<?> N() {
        return class01448.i;
    }

    protected boolean N(class06069 class060692, int n, int n2, int n3, int n4, boolean bl) {
        return n == n4 && n3 == n4 && class060692.y(2) == 0;
    }
}

