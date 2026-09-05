/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04878
 *  minecraft.class05163
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07321
 *  minecraft.class08088
 */
package minecraft;

import minecraft.class04878;
import minecraft.class05163;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06476;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07321;
import minecraft.class08088;

public class class06443
extends class06476 {
    private int N;

    public class06443(class07211 class072112, class05163 class051632, int n) {
        super(class04878.D, class072112, 1, class051632);
        this.N = n & 1;
    }

    public class06443(class07001 class070012) {
        super(class04878.D, class070012);
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        if (this.N == 0) {
            int n;
            for (n = 0; n < 4; ++n) {
                this.N(class059742, class051632, 10 - n, 3 - n, 20 - n, 12 + n, 3 - n, 20, L, L, false);
            }
            this.N(class059742, class051632, 7, 0, 6, 15, 0, 16, L, L, false);
            this.N(class059742, class051632, 6, 0, 6, 6, 3, 20, L, L, false);
            this.N(class059742, class051632, 16, 0, 6, 16, 3, 20, L, L, false);
            this.N(class059742, class051632, 7, 1, 7, 7, 1, 20, L, L, false);
            this.N(class059742, class051632, 15, 1, 7, 15, 1, 20, L, L, false);
            this.N(class059742, class051632, 7, 1, 6, 9, 3, 6, L, L, false);
            this.N(class059742, class051632, 13, 1, 6, 15, 3, 6, L, L, false);
            this.N(class059742, class051632, 8, 1, 7, 9, 1, 7, L, L, false);
            this.N(class059742, class051632, 13, 1, 7, 14, 1, 7, L, L, false);
            this.N(class059742, class051632, 9, 0, 5, 13, 0, 5, L, L, false);
            this.N(class059742, class051632, 10, 0, 7, 12, 0, 7, u, u, false);
            this.N(class059742, class051632, 8, 0, 10, 8, 0, 12, u, u, false);
            this.N(class059742, class051632, 14, 0, 10, 14, 0, 12, u, u, false);
            for (n = 18; n >= 7; n -= 3) {
                this.L(class059742, R, 6, 3, n, class051632);
                this.L(class059742, R, 16, 3, n, class051632);
            }
            this.L(class059742, R, 10, 0, 10, class051632);
            this.L(class059742, R, 12, 0, 10, class051632);
            this.L(class059742, R, 10, 0, 12, class051632);
            this.L(class059742, R, 12, 0, 12, class051632);
            this.L(class059742, R, 8, 3, 6, class051632);
            this.L(class059742, R, 14, 3, 6, class051632);
            this.L(class059742, L, 4, 2, 4, class051632);
            this.L(class059742, R, 4, 1, 4, class051632);
            this.L(class059742, L, 4, 0, 4, class051632);
            this.L(class059742, L, 18, 2, 4, class051632);
            this.L(class059742, R, 18, 1, 4, class051632);
            this.L(class059742, L, 18, 0, 4, class051632);
            this.L(class059742, L, 4, 2, 18, class051632);
            this.L(class059742, R, 4, 1, 18, class051632);
            this.L(class059742, L, 4, 0, 18, class051632);
            this.L(class059742, L, 18, 2, 18, class051632);
            this.L(class059742, R, 18, 1, 18, class051632);
            this.L(class059742, L, 18, 0, 18, class051632);
            this.L(class059742, L, 9, 7, 20, class051632);
            this.L(class059742, L, 13, 7, 20, class051632);
            this.N(class059742, class051632, 6, 0, 21, 7, 4, 21, L, L, false);
            this.N(class059742, class051632, 15, 0, 21, 16, 4, 21, L, L, false);
            this.N(class059742, class051632, 11, 2, 16);
        } else if (this.N == 1) {
            int n;
            this.N(class059742, class051632, 9, 3, 18, 13, 3, 20, L, L, false);
            this.N(class059742, class051632, 9, 0, 18, 9, 2, 18, L, L, false);
            this.N(class059742, class051632, 13, 0, 18, 13, 2, 18, L, L, false);
            int n2 = 9;
            int n3 = 20;
            int n4 = 5;
            for (n = 0; n < 2; ++n) {
                this.L(class059742, L, n2, 6, 20, class051632);
                this.L(class059742, R, n2, 5, 20, class051632);
                this.L(class059742, L, n2, 4, 20, class051632);
                n2 = 13;
            }
            this.N(class059742, class051632, 7, 3, 7, 15, 3, 14, L, L, false);
            n2 = 10;
            for (n = 0; n < 2; ++n) {
                this.N(class059742, class051632, n2, 0, 10, n2, 6, 10, L, L, false);
                this.N(class059742, class051632, n2, 0, 12, n2, 6, 12, L, L, false);
                this.L(class059742, R, n2, 0, 10, class051632);
                this.L(class059742, R, n2, 0, 12, class051632);
                this.L(class059742, R, n2, 4, 10, class051632);
                this.L(class059742, R, n2, 4, 12, class051632);
                n2 = 12;
            }
            n2 = 8;
            for (n = 0; n < 2; ++n) {
                this.N(class059742, class051632, n2, 0, 7, n2, 2, 7, L, L, false);
                this.N(class059742, class051632, n2, 0, 14, n2, 2, 14, L, L, false);
                n2 = 14;
            }
            this.N(class059742, class051632, 8, 3, 8, 8, 3, 13, u, u, false);
            this.N(class059742, class051632, 14, 3, 8, 14, 3, 13, u, u, false);
            this.N(class059742, class051632, 11, 5, 13);
        }
    }
}

