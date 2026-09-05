/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01448
 *  minecraft.class01455
 *  minecraft.class01467
 *  minecraft.class01476
 *  minecraft.class01479
 *  minecraft.class02142
 *  minecraft.class04887
 *  minecraft.class06069
 */
package minecraft;

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

public class class05048
extends class01479 {
    public static final MapCodec<class05048> N = RecordCodecBuilder.mapCodec(instance -> class05048.y(instance).and((App)Codec.intRange((int)0, (int)16).fieldOf("height").forGetter(class050482 -> class050482.y)).apply(instance, class05048::new));
    protected final int y;

    public class05048(class02142 class021422, class02142 class021423, int n) {
        super(class021422, class021423);
        this.y = n;
    }

    protected boolean N(class06069 class060692, int n, int n2, int n3, int n4, boolean bl) {
        if (n + n3 >= 7) {
            return true;
        }
        return n * n + n3 * n3 > n4 * n4;
    }

    protected class01448<?> N() {
        return class01448.M;
    }

    public int N(class06069 class060692, int n, class01476 class014762) {
        return this.y;
    }

    protected void N(class04887 class048872, class01455 class014552, class06069 class060692, class01476 class014762, int n, class01467 class014672, int n2, int n3, int n4) {
        int n5 = class014672.L() ? n2 : 1 + class060692.y(2);
        for (int i = n4; i >= n4 - n5; --i) {
            int n6 = n3 + class014672.y() + 1 - i;
            this.N(class048872, class014552, class060692, class014762, class014672.N(), n6, i, class014672.L());
        }
    }
}

