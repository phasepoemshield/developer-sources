/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class04995
 *  minecraft.class05022
 *  minecraft.class06069
 *  minecraft.class06075
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03908;
import minecraft.class03979;
import minecraft.class04995;
import minecraft.class05022;
import minecraft.class06069;
import minecraft.class06075;

public final class class03906
implements class03908 {
    public static final class03979<class03906> N = class03979.N(MapCodec.unit((Object)new class03906(0L)));
    private static final float y = -0.9f;
    private final class05022 L;

    @Override
    public class03979<? extends class03877> L() {
        return N;
    }

    public class03906(long l) {
        class06075 class060752 = new class06075(l);
        class060752.L(17292);
        this.L = new class05022((class06069)class060752);
    }

    @Override
    public double y() {
        return 0.5625;
    }

    @Override
    public double N() {
        return -0.84375;
    }

    private static float N(class05022 class050222, int n, int n2) {
        int n3 = n / 2;
        int n4 = n2 / 2;
        int n5 = n % 2;
        int n6 = n2 % 2;
        float f = 100.0f - class04995.N((float)(n * n + n2 * n2)) * 8.0f;
        f = class04995.N((float)f, (float)-100.0f, (float)80.0f);
        for (int i = -12; i <= 12; ++i) {
            for (int j = -12; j <= 12; ++j) {
                long l = n3 + i;
                long l2 = n4 + j;
                if (l * l + l2 * l2 <= 4096L || !(class050222.N((double)l, (double)l2) < (double)-0.9f)) continue;
                float f2 = (class04995.L((float)l) * 3439.0f + class04995.L((float)l2) * 147.0f) % 13.0f + 9.0f;
                float f3 = n5 - i * 2;
                float f4 = n6 - j * 2;
                float f5 = 100.0f - class04995.N((float)(f3 * f3 + f4 * f4)) * f2;
                f5 = class04995.N((float)f5, (float)-100.0f, (float)80.0f);
                f = Math.max(f, f5);
            }
        }
        return f;
    }

    @Override
    public double N(class03875 class038752) {
        return ((double)class03906.N(this.L, class038752.y() / 8, class038752.u() / 8) - 8.0) / 128.0;
    }
}

