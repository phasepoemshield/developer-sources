/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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

public class class05078
extends class01479 {
    public static final MapCodec<class05078> N = RecordCodecBuilder.mapCodec(instance -> class05078.y(instance).apply(instance, class05078::new));

    public class05078(class02142 class021422, class02142 class021423) {
        super(class021422, class021423);
    }

    protected boolean y(class06069 class060692, int n, int n2, int n3, int n4, boolean bl) {
        if (!(n2 != 0 || !bl || n != -n4 && n < n4 || n3 != -n4 && n3 < n4)) {
            return true;
        }
        return super.y(class060692, n, n2, n3, n4, bl);
    }

    protected boolean N(class06069 class060692, int n, int n2, int n3, int n4, boolean bl) {
        if (n2 == -1 && !bl) {
            return n == n4 && n3 == n4;
        }
        if (n2 == 1) {
            return n + n3 > n4 * 2 - 2;
        }
        return false;
    }

    protected void N(class04887 class048872, class01455 class014552, class06069 class060692, class01476 class014762, int n, class01467 class014672, int n2, int n3, int n4) {
        class07209 class072092 = class014672.N().method_10086(n4);
        boolean bl = class014672.L();
        if (bl) {
            this.N(class048872, class014552, class060692, class014762, class072092, n3 + 2, -1, bl);
            this.N(class048872, class014552, class060692, class014762, class072092, n3 + 3, 0, bl);
            this.N(class048872, class014552, class060692, class014762, class072092, n3 + 2, 1, bl);
            if (class060692.Z()) {
                this.N(class048872, class014552, class060692, class014762, class072092, n3, 2, bl);
            }
        } else {
            this.N(class048872, class014552, class060692, class014762, class072092, n3 + 2, -1, bl);
            this.N(class048872, class014552, class060692, class014762, class072092, n3 + 1, 0, bl);
        }
    }

    protected class01448<?> N() {
        return class01448.Z;
    }

    public int N(class06069 class060692, int n, class01476 class014762) {
        return 4;
    }
}

