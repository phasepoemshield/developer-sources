/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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

public class class05169
extends class06476 {
    public class05169(class07211 class072112, class06433 class064332) {
        super(class04878.p, 1, class072112, class064332, 1, 2, 1);
    }

    public class05169(class07001 class070012) {
        super(class04878.p, class070012);
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        if (this.d.N / 25 > 0) {
            this.N(class059742, class051632, 0, 0, this.d.L[class07211.field_11033.L()]);
        }
        class06433 class064332 = this.d.y[class07211.field_11036.L()];
        if (class064332.y[class07211.field_11036.L()] == null) {
            this.N(class059742, class051632, 1, 8, 1, 6, 8, 6, y);
        }
        this.N(class059742, class051632, 0, 4, 0, 0, 4, 7, L, L, false);
        this.N(class059742, class051632, 7, 4, 0, 7, 4, 7, L, L, false);
        this.N(class059742, class051632, 1, 4, 0, 6, 4, 0, L, L, false);
        this.N(class059742, class051632, 1, 4, 7, 6, 4, 7, L, L, false);
        this.N(class059742, class051632, 2, 4, 1, 2, 4, 2, L, L, false);
        this.N(class059742, class051632, 1, 4, 2, 1, 4, 2, L, L, false);
        this.N(class059742, class051632, 5, 4, 1, 5, 4, 2, L, L, false);
        this.N(class059742, class051632, 6, 4, 2, 6, 4, 2, L, L, false);
        this.N(class059742, class051632, 2, 4, 5, 2, 4, 6, L, L, false);
        this.N(class059742, class051632, 1, 4, 5, 1, 4, 5, L, L, false);
        this.N(class059742, class051632, 5, 4, 5, 5, 4, 6, L, L, false);
        this.N(class059742, class051632, 6, 4, 5, 6, 4, 5, L, L, false);
        class06433 class064333 = this.d;
        for (int i = 1; i <= 5; i += 4) {
            int n = 0;
            if (class064333.L[class07211.field_11035.L()]) {
                this.N(class059742, class051632, 2, i, n, 2, i + 2, n, L, L, false);
                this.N(class059742, class051632, 5, i, n, 5, i + 2, n, L, L, false);
                this.N(class059742, class051632, 3, i + 2, n, 4, i + 2, n, L, L, false);
            } else {
                this.N(class059742, class051632, 0, i, n, 7, i + 2, n, L, L, false);
                this.N(class059742, class051632, 0, i + 1, n, 7, i + 1, n, y, y, false);
            }
            n = 7;
            if (class064333.L[class07211.field_11043.L()]) {
                this.N(class059742, class051632, 2, i, n, 2, i + 2, n, L, L, false);
                this.N(class059742, class051632, 5, i, n, 5, i + 2, n, L, L, false);
                this.N(class059742, class051632, 3, i + 2, n, 4, i + 2, n, L, L, false);
            } else {
                this.N(class059742, class051632, 0, i, n, 7, i + 2, n, L, L, false);
                this.N(class059742, class051632, 0, i + 1, n, 7, i + 1, n, y, y, false);
            }
            int n2 = 0;
            if (class064333.L[class07211.field_11039.L()]) {
                this.N(class059742, class051632, n2, i, 2, n2, i + 2, 2, L, L, false);
                this.N(class059742, class051632, n2, i, 5, n2, i + 2, 5, L, L, false);
                this.N(class059742, class051632, n2, i + 2, 3, n2, i + 2, 4, L, L, false);
            } else {
                this.N(class059742, class051632, n2, i, 0, n2, i + 2, 7, L, L, false);
                this.N(class059742, class051632, n2, i + 1, 0, n2, i + 1, 7, y, y, false);
            }
            n2 = 7;
            if (class064333.L[class07211.field_11034.L()]) {
                this.N(class059742, class051632, n2, i, 2, n2, i + 2, 2, L, L, false);
                this.N(class059742, class051632, n2, i, 5, n2, i + 2, 5, L, L, false);
                this.N(class059742, class051632, n2, i + 2, 3, n2, i + 2, 4, L, L, false);
            } else {
                this.N(class059742, class051632, n2, i, 0, n2, i + 2, 7, L, L, false);
                this.N(class059742, class051632, n2, i + 1, 0, n2, i + 1, 7, y, y, false);
            }
            class064333 = class064332;
        }
    }
}

