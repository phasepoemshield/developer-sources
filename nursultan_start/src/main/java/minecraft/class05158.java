/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class04878
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06433
 *  minecraft.class06476
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07321
 *  minecraft.class08088
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00869;
import minecraft.class04878;
import minecraft.class05163;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06433;
import minecraft.class06476;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07321;
import minecraft.class08088;

public class class05158
extends class06476 {
    public class05158(class07211 class072112, class06433 class064332) {
        super(class04878.c, 1, class072112, class064332, 2, 2, 2);
    }

    public class05158(class07001 class070012) {
        super(class04878.c, class070012);
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        this.N(class059742, class051632, 1, 8, 0, 14, 8, 14, y);
        int n = 7;
        class00500 class005002 = L;
        this.N(class059742, class051632, 0, 7, 0, 0, 7, 15, class005002, class005002, false);
        this.N(class059742, class051632, 15, 7, 0, 15, 7, 15, class005002, class005002, false);
        this.N(class059742, class051632, 1, 7, 0, 15, 7, 0, class005002, class005002, false);
        this.N(class059742, class051632, 1, 7, 15, 14, 7, 15, class005002, class005002, false);
        for (n = 1; n <= 6; ++n) {
            class005002 = L;
            if (n == 2 || n == 6) {
                class005002 = y;
            }
            for (int i = 0; i <= 15; i += 15) {
                this.N(class059742, class051632, i, n, 0, i, n, 1, class005002, class005002, false);
                this.N(class059742, class051632, i, n, 6, i, n, 9, class005002, class005002, false);
                this.N(class059742, class051632, i, n, 14, i, n, 15, class005002, class005002, false);
            }
            this.N(class059742, class051632, 1, n, 0, 1, n, 0, class005002, class005002, false);
            this.N(class059742, class051632, 6, n, 0, 9, n, 0, class005002, class005002, false);
            this.N(class059742, class051632, 14, n, 0, 14, n, 0, class005002, class005002, false);
            this.N(class059742, class051632, 1, n, 15, 14, n, 15, class005002, class005002, false);
        }
        this.N(class059742, class051632, 6, 3, 6, 9, 6, 9, u, u, false);
        this.N(class059742, class051632, 7, 4, 7, 8, 5, 8, class00869.Lb.W(), class00869.Lb.W(), false);
        for (n = 3; n <= 6; n += 3) {
            for (int i = 6; i <= 9; i += 3) {
                this.L(class059742, R, i, n, 6, class051632);
                this.L(class059742, R, i, n, 9, class051632);
            }
        }
        this.N(class059742, class051632, 5, 1, 6, 5, 2, 6, L, L, false);
        this.N(class059742, class051632, 5, 1, 9, 5, 2, 9, L, L, false);
        this.N(class059742, class051632, 10, 1, 6, 10, 2, 6, L, L, false);
        this.N(class059742, class051632, 10, 1, 9, 10, 2, 9, L, L, false);
        this.N(class059742, class051632, 6, 1, 5, 6, 2, 5, L, L, false);
        this.N(class059742, class051632, 9, 1, 5, 9, 2, 5, L, L, false);
        this.N(class059742, class051632, 6, 1, 10, 6, 2, 10, L, L, false);
        this.N(class059742, class051632, 9, 1, 10, 9, 2, 10, L, L, false);
        this.N(class059742, class051632, 5, 2, 5, 5, 6, 5, L, L, false);
        this.N(class059742, class051632, 5, 2, 10, 5, 6, 10, L, L, false);
        this.N(class059742, class051632, 10, 2, 5, 10, 6, 5, L, L, false);
        this.N(class059742, class051632, 10, 2, 10, 10, 6, 10, L, L, false);
        this.N(class059742, class051632, 5, 7, 1, 5, 7, 6, L, L, false);
        this.N(class059742, class051632, 10, 7, 1, 10, 7, 6, L, L, false);
        this.N(class059742, class051632, 5, 7, 9, 5, 7, 14, L, L, false);
        this.N(class059742, class051632, 10, 7, 9, 10, 7, 14, L, L, false);
        this.N(class059742, class051632, 1, 7, 5, 6, 7, 5, L, L, false);
        this.N(class059742, class051632, 1, 7, 10, 6, 7, 10, L, L, false);
        this.N(class059742, class051632, 9, 7, 5, 14, 7, 5, L, L, false);
        this.N(class059742, class051632, 9, 7, 10, 14, 7, 10, L, L, false);
        this.N(class059742, class051632, 2, 1, 2, 2, 1, 3, L, L, false);
        this.N(class059742, class051632, 3, 1, 2, 3, 1, 2, L, L, false);
        this.N(class059742, class051632, 13, 1, 2, 13, 1, 3, L, L, false);
        this.N(class059742, class051632, 12, 1, 2, 12, 1, 2, L, L, false);
        this.N(class059742, class051632, 2, 1, 12, 2, 1, 13, L, L, false);
        this.N(class059742, class051632, 3, 1, 13, 3, 1, 13, L, L, false);
        this.N(class059742, class051632, 13, 1, 12, 13, 1, 13, L, L, false);
        this.N(class059742, class051632, 12, 1, 13, 12, 1, 13, L, L, false);
    }
}

