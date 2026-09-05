/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00746
 *  minecraft.class00753
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class00746;
import minecraft.class00753;
import minecraft.class01466;
import minecraft.class01469;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class08092;

public class class01552
extends class01469 {
    public class01552(Codec<class01466> codec) {
        super(codec);
    }

    @Override
    protected void N(class07284 class072842, class06069 class060692, class07209 class072092, int n, class07218 class072182, class01466 class014662) {
        int n2 = class014662.u;
        for (int i = -n2; i <= n2; ++i) {
            for (int j = -n2; j <= n2; ++j) {
                boolean bl;
                boolean bl2 = i == -n2;
                boolean bl3 = i == n2;
                boolean bl4 = j == -n2;
                boolean bl5 = j == n2;
                boolean bl6 = bl2 || bl3;
                boolean bl7 = bl = bl4 || bl5;
                if (bl6 && bl) continue;
                class072182.N((class00753)class072092, i, n, j);
                boolean bl8 = bl2 || bl && i == 1 - n2;
                boolean bl9 = bl3 || bl && i == n2 - 1;
                boolean bl10 = bl4 || bl6 && j == 1 - n2;
                boolean bl11 = bl5 || bl6 && j == n2 - 1;
                class00500 class005002 = class014662.y.N(class060692, class072092);
                if (class005002.y((class08092)class00746.i) && class005002.y((class08092)class00746.L) && class005002.y((class08092)class00746.y) && class005002.y((class08092)class00746.u)) {
                    class005002 = (class00500)((class00500)((class00500)((class00500)class005002.y((class08092)class00746.i, (Comparable)Boolean.valueOf(bl8))).y((class08092)class00746.L, (Comparable)Boolean.valueOf(bl9))).y((class08092)class00746.y, (Comparable)Boolean.valueOf(bl10))).y((class08092)class00746.u, (Comparable)Boolean.valueOf(bl11));
                }
                this.N(class072842, class072182, class005002);
            }
        }
    }

    @Override
    protected int N(int n, int n2, int n3, int n4) {
        return n4 <= 3 ? 0 : n3;
    }
}

