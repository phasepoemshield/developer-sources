/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
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
import minecraft.class06069;
import minecraft.class07209;

public class class01442
extends class01479 {
    public static final MapCodec<class01442> N = RecordCodecBuilder.mapCodec(instance -> class01442.y(instance).and((App)class02142.N((int)0, (int)24).fieldOf("trunk_height").forGetter(class014422 -> class014422.y)).apply(instance, class01442::new));
    private final class02142 y;

    public class01442(class02142 class021422, class02142 class021423, class02142 class021424) {
        super(class021422, class021423);
        this.y = class021424;
    }

    protected boolean N(class06069 class060692, int n, int n2, int n3, int n4, boolean bl) {
        return n == n4 && n3 == n4 && n4 > 0;
    }

    protected class01448<?> N() {
        return class01448.y;
    }

    public int N(class06069 class060692, int n, class01476 class014762) {
        return Math.max(4, n - this.y.N(class060692));
    }

    protected void N(class04887 class048872, class01455 class014552, class06069 class060692, class01476 class014762, int n, class01467 class014672, int n2, int n3, int n4) {
        class07209 class072092 = class014672.N();
        int n5 = class060692.y(2);
        int n6 = 1;
        int n7 = 0;
        for (int i = n4; i >= -n2; --i) {
            this.N(class048872, class014552, class060692, class014762, class072092, n5, i, class014672.L());
            if (n5 >= n6) {
                n5 = n7;
                n7 = 1;
                n6 = Math.min(n6 + 1, n3 + class014672.y());
                continue;
            }
            ++n5;
        }
    }
}

