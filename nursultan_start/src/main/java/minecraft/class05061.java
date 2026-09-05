/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
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
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class01448;
import minecraft.class01455;
import minecraft.class01467;
import minecraft.class01476;
import minecraft.class01479;
import minecraft.class02142;
import minecraft.class04887;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class07209;

public class class05061
extends class01479 {
    public static final MapCodec<class05061> N = RecordCodecBuilder.mapCodec(instance -> class05061.y(instance).and((App)class02142.N((int)0, (int)24).fieldOf("crown_height").forGetter(class050612 -> class050612.y)).apply(instance, class05061::new));
    private final class02142 y;

    public class05061(class02142 class021422, class02142 class021423, class02142 class021424) {
        super(class021422, class021423);
        this.y = class021424;
    }

    protected boolean N(class06069 class060692, int n, int n2, int n3, int n4, boolean bl) {
        if (n + n3 >= 7) {
            return true;
        }
        return n * n + n3 * n3 > n4 * n4;
    }

    protected class01448<?> N() {
        return class01448.B;
    }

    public int N(class06069 class060692, int n, class01476 class014762) {
        return this.y.N(class060692);
    }

    protected void N(class04887 class048872, class01455 class014552, class06069 class060692, class01476 class014762, int n, class01467 class014672, int n2, int n3, int n4) {
        class07209 class072092 = class014672.N();
        int n5 = 0;
        for (int i = class072092.method_10264() - n2 + n4; i <= class072092.method_10264() + n4; ++i) {
            int n6 = class072092.method_10264() - i;
            int n7 = n3 + class014672.y() + class04995.y((float)n6 / (float)n2 * 3.5f);
            int n8 = n6 > 0 && n7 == n5 && (i & 1) == 0 ? n7 + 1 : n7;
            this.N(class048872, class014552, class060692, class014762, new class07209(class072092.method_10263(), i, class072092.method_10260()), n8, 0, class014672.L());
            n5 = n7;
        }
    }
}

