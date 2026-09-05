/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
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

public class class05179
extends class06476 {
    public class05179(class07211 class072112, class06433 class064332) {
        super(class04878.F, 1, class072112, class064332, 1, 2, 2);
    }

    public class05179(class07001 class070012) {
        super(class04878.F, class070012);
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        class00500 class005002;
        int n;
        class06433 class064332 = this.d.y[class07211.field_11043.L()];
        class06433 class064333 = this.d;
        class06433 class064334 = class064332.y[class07211.field_11036.L()];
        class06433 class064335 = class064333.y[class07211.field_11036.L()];
        if (this.d.N / 25 > 0) {
            this.N(class059742, class051632, 0, 8, class064332.L[class07211.field_11033.L()]);
            this.N(class059742, class051632, 0, 0, class064333.L[class07211.field_11033.L()]);
        }
        if (class064335.y[class07211.field_11036.L()] == null) {
            this.N(class059742, class051632, 1, 8, 1, 6, 8, 7, y);
        }
        if (class064334.y[class07211.field_11036.L()] == null) {
            this.N(class059742, class051632, 1, 8, 8, 6, 8, 14, y);
        }
        for (n = 1; n <= 7; ++n) {
            class005002 = L;
            if (n == 2 || n == 6) {
                class005002 = y;
            }
            this.N(class059742, class051632, 0, n, 0, 0, n, 15, class005002, class005002, false);
            this.N(class059742, class051632, 7, n, 0, 7, n, 15, class005002, class005002, false);
            this.N(class059742, class051632, 1, n, 0, 6, n, 0, class005002, class005002, false);
            this.N(class059742, class051632, 1, n, 15, 6, n, 15, class005002, class005002, false);
        }
        for (n = 1; n <= 7; ++n) {
            class005002 = u;
            if (n == 2 || n == 6) {
                class005002 = R;
            }
            this.N(class059742, class051632, 3, n, 7, 4, n, 8, class005002, class005002, false);
        }
        if (class064333.L[class07211.field_11035.L()]) {
            this.N(class059742, class051632, 3, 1, 0, 4, 2, 0);
        }
        if (class064333.L[class07211.field_11034.L()]) {
            this.N(class059742, class051632, 7, 1, 3, 7, 2, 4);
        }
        if (class064333.L[class07211.field_11039.L()]) {
            this.N(class059742, class051632, 0, 1, 3, 0, 2, 4);
        }
        if (class064332.L[class07211.field_11043.L()]) {
            this.N(class059742, class051632, 3, 1, 15, 4, 2, 15);
        }
        if (class064332.L[class07211.field_11039.L()]) {
            this.N(class059742, class051632, 0, 1, 11, 0, 2, 12);
        }
        if (class064332.L[class07211.field_11034.L()]) {
            this.N(class059742, class051632, 7, 1, 11, 7, 2, 12);
        }
        if (class064335.L[class07211.field_11035.L()]) {
            this.N(class059742, class051632, 3, 5, 0, 4, 6, 0);
        }
        if (class064335.L[class07211.field_11034.L()]) {
            this.N(class059742, class051632, 7, 5, 3, 7, 6, 4);
            this.N(class059742, class051632, 5, 4, 2, 6, 4, 5, L, L, false);
            this.N(class059742, class051632, 6, 1, 2, 6, 3, 2, L, L, false);
            this.N(class059742, class051632, 6, 1, 5, 6, 3, 5, L, L, false);
        }
        if (class064335.L[class07211.field_11039.L()]) {
            this.N(class059742, class051632, 0, 5, 3, 0, 6, 4);
            this.N(class059742, class051632, 1, 4, 2, 2, 4, 5, L, L, false);
            this.N(class059742, class051632, 1, 1, 2, 1, 3, 2, L, L, false);
            this.N(class059742, class051632, 1, 1, 5, 1, 3, 5, L, L, false);
        }
        if (class064334.L[class07211.field_11043.L()]) {
            this.N(class059742, class051632, 3, 5, 15, 4, 6, 15);
        }
        if (class064334.L[class07211.field_11039.L()]) {
            this.N(class059742, class051632, 0, 5, 11, 0, 6, 12);
            this.N(class059742, class051632, 1, 4, 10, 2, 4, 13, L, L, false);
            this.N(class059742, class051632, 1, 1, 10, 1, 3, 10, L, L, false);
            this.N(class059742, class051632, 1, 1, 13, 1, 3, 13, L, L, false);
        }
        if (class064334.L[class07211.field_11034.L()]) {
            this.N(class059742, class051632, 7, 5, 11, 7, 6, 12);
            this.N(class059742, class051632, 5, 4, 10, 6, 4, 13, L, L, false);
            this.N(class059742, class051632, 6, 1, 10, 6, 3, 10, L, L, false);
            this.N(class059742, class051632, 6, 1, 13, 6, 3, 13, L, L, false);
        }
    }
}

