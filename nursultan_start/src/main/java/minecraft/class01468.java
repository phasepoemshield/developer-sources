/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01448
 *  minecraft.class01455
 *  minecraft.class02142
 *  minecraft.class04887
 *  minecraft.class06069
 *  minecraft.class07209
 */
package minecraft;

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
import minecraft.class07209;

public class class01468
extends class01479 {
    public static final MapCodec<class01468> N = RecordCodecBuilder.mapCodec(instance -> class01468.y(instance).apply(instance, class01468::new));

    public class01468(class02142 class021422, class02142 class021423) {
        super(class021422, class021423);
    }

    @Override
    public int N(class06069 class060692, int n, class01476 class014762) {
        return 0;
    }

    @Override
    protected boolean N(class06069 class060692, int n, int n2, int n3, int n4, boolean bl) {
        if (n2 == 0) {
            return (n > 1 || n3 > 1) && n != 0 && n3 != 0;
        }
        return n == n4 && n3 == n4 && n4 > 0;
    }

    @Override
    protected class01448<?> N() {
        return class01448.u;
    }

    @Override
    protected void N(class04887 class048872, class01455 class014552, class06069 class060692, class01476 class014762, int n, class01467 class014672, int n2, int n3, int n4) {
        boolean bl = class014672.L();
        class07209 class072092 = class014672.N().method_10086(n4);
        this.N(class048872, class014552, class060692, class014762, class072092, n3 + class014672.y(), -1 - n2, bl);
        this.N(class048872, class014552, class060692, class014762, class072092, n3 - 1, -n2, bl);
        this.N(class048872, class014552, class060692, class014762, class072092, n3 + class014672.y() - 1, 0, bl);
    }
}

