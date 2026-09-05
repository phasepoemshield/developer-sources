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
import minecraft.class06433;
import minecraft.class06476;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07321;
import minecraft.class08088;

public class class06464
extends class06476 {
    private int N;

    public class06464(class07211 class072112, class06433 class064332, class06069 class060692) {
        super(class04878.S, 1, class072112, class064332, 1, 1, 1);
        this.N = class060692.y(3);
    }

    public class06464(class07001 class070012) {
        super(class04878.S, class070012);
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        boolean bl;
        if (this.d.N / 25 > 0) {
            this.N(class059742, class051632, 0, 0, this.d.L[class07211.field_11033.L()]);
        }
        if (this.d.y[class07211.field_11036.L()] == null) {
            this.N(class059742, class051632, 1, 4, 1, 6, 4, 6, y);
        }
        boolean bl2 = bl = this.N != 0 && class060692.Z() && !this.d.L[class07211.field_11033.L()] && !this.d.L[class07211.field_11036.L()] && this.d.L() > 1;
        if (this.N == 0) {
            this.N(class059742, class051632, 0, 1, 0, 2, 1, 2, L, L, false);
            this.N(class059742, class051632, 0, 3, 0, 2, 3, 2, L, L, false);
            this.N(class059742, class051632, 0, 2, 0, 0, 2, 2, y, y, false);
            this.N(class059742, class051632, 1, 2, 0, 2, 2, 0, y, y, false);
            this.L(class059742, R, 1, 2, 1, class051632);
            this.N(class059742, class051632, 5, 1, 0, 7, 1, 2, L, L, false);
            this.N(class059742, class051632, 5, 3, 0, 7, 3, 2, L, L, false);
            this.N(class059742, class051632, 7, 2, 0, 7, 2, 2, y, y, false);
            this.N(class059742, class051632, 5, 2, 0, 6, 2, 0, y, y, false);
            this.L(class059742, R, 6, 2, 1, class051632);
            this.N(class059742, class051632, 0, 1, 5, 2, 1, 7, L, L, false);
            this.N(class059742, class051632, 0, 3, 5, 2, 3, 7, L, L, false);
            this.N(class059742, class051632, 0, 2, 5, 0, 2, 7, y, y, false);
            this.N(class059742, class051632, 1, 2, 7, 2, 2, 7, y, y, false);
            this.L(class059742, R, 1, 2, 6, class051632);
            this.N(class059742, class051632, 5, 1, 5, 7, 1, 7, L, L, false);
            this.N(class059742, class051632, 5, 3, 5, 7, 3, 7, L, L, false);
            this.N(class059742, class051632, 7, 2, 5, 7, 2, 7, y, y, false);
            this.N(class059742, class051632, 5, 2, 7, 6, 2, 7, y, y, false);
            this.L(class059742, R, 6, 2, 6, class051632);
            if (this.d.L[class07211.field_11035.L()]) {
                this.N(class059742, class051632, 3, 3, 0, 4, 3, 0, L, L, false);
            } else {
                this.N(class059742, class051632, 3, 3, 0, 4, 3, 1, L, L, false);
                this.N(class059742, class051632, 3, 2, 0, 4, 2, 0, y, y, false);
                this.N(class059742, class051632, 3, 1, 0, 4, 1, 1, L, L, false);
            }
            if (this.d.L[class07211.field_11043.L()]) {
                this.N(class059742, class051632, 3, 3, 7, 4, 3, 7, L, L, false);
            } else {
                this.N(class059742, class051632, 3, 3, 6, 4, 3, 7, L, L, false);
                this.N(class059742, class051632, 3, 2, 7, 4, 2, 7, y, y, false);
                this.N(class059742, class051632, 3, 1, 6, 4, 1, 7, L, L, false);
            }
            if (this.d.L[class07211.field_11039.L()]) {
                this.N(class059742, class051632, 0, 3, 3, 0, 3, 4, L, L, false);
            } else {
                this.N(class059742, class051632, 0, 3, 3, 1, 3, 4, L, L, false);
                this.N(class059742, class051632, 0, 2, 3, 0, 2, 4, y, y, false);
                this.N(class059742, class051632, 0, 1, 3, 1, 1, 4, L, L, false);
            }
            if (this.d.L[class07211.field_11034.L()]) {
                this.N(class059742, class051632, 7, 3, 3, 7, 3, 4, L, L, false);
            } else {
                this.N(class059742, class051632, 6, 3, 3, 7, 3, 4, L, L, false);
                this.N(class059742, class051632, 7, 2, 3, 7, 2, 4, y, y, false);
                this.N(class059742, class051632, 6, 1, 3, 7, 1, 4, L, L, false);
            }
        } else if (this.N == 1) {
            this.N(class059742, class051632, 2, 1, 2, 2, 3, 2, L, L, false);
            this.N(class059742, class051632, 2, 1, 5, 2, 3, 5, L, L, false);
            this.N(class059742, class051632, 5, 1, 5, 5, 3, 5, L, L, false);
            this.N(class059742, class051632, 5, 1, 2, 5, 3, 2, L, L, false);
            this.L(class059742, R, 2, 2, 2, class051632);
            this.L(class059742, R, 2, 2, 5, class051632);
            this.L(class059742, R, 5, 2, 5, class051632);
            this.L(class059742, R, 5, 2, 2, class051632);
            this.N(class059742, class051632, 0, 1, 0, 1, 3, 0, L, L, false);
            this.N(class059742, class051632, 0, 1, 1, 0, 3, 1, L, L, false);
            this.N(class059742, class051632, 0, 1, 7, 1, 3, 7, L, L, false);
            this.N(class059742, class051632, 0, 1, 6, 0, 3, 6, L, L, false);
            this.N(class059742, class051632, 6, 1, 7, 7, 3, 7, L, L, false);
            this.N(class059742, class051632, 7, 1, 6, 7, 3, 6, L, L, false);
            this.N(class059742, class051632, 6, 1, 0, 7, 3, 0, L, L, false);
            this.N(class059742, class051632, 7, 1, 1, 7, 3, 1, L, L, false);
            this.L(class059742, y, 1, 2, 0, class051632);
            this.L(class059742, y, 0, 2, 1, class051632);
            this.L(class059742, y, 1, 2, 7, class051632);
            this.L(class059742, y, 0, 2, 6, class051632);
            this.L(class059742, y, 6, 2, 7, class051632);
            this.L(class059742, y, 7, 2, 6, class051632);
            this.L(class059742, y, 6, 2, 0, class051632);
            this.L(class059742, y, 7, 2, 1, class051632);
            if (!this.d.L[class07211.field_11035.L()]) {
                this.N(class059742, class051632, 1, 3, 0, 6, 3, 0, L, L, false);
                this.N(class059742, class051632, 1, 2, 0, 6, 2, 0, y, y, false);
                this.N(class059742, class051632, 1, 1, 0, 6, 1, 0, L, L, false);
            }
            if (!this.d.L[class07211.field_11043.L()]) {
                this.N(class059742, class051632, 1, 3, 7, 6, 3, 7, L, L, false);
                this.N(class059742, class051632, 1, 2, 7, 6, 2, 7, y, y, false);
                this.N(class059742, class051632, 1, 1, 7, 6, 1, 7, L, L, false);
            }
            if (!this.d.L[class07211.field_11039.L()]) {
                this.N(class059742, class051632, 0, 3, 1, 0, 3, 6, L, L, false);
                this.N(class059742, class051632, 0, 2, 1, 0, 2, 6, y, y, false);
                this.N(class059742, class051632, 0, 1, 1, 0, 1, 6, L, L, false);
            }
            if (!this.d.L[class07211.field_11034.L()]) {
                this.N(class059742, class051632, 7, 3, 1, 7, 3, 6, L, L, false);
                this.N(class059742, class051632, 7, 2, 1, 7, 2, 6, y, y, false);
                this.N(class059742, class051632, 7, 1, 1, 7, 1, 6, L, L, false);
            }
        } else if (this.N == 2) {
            this.N(class059742, class051632, 0, 1, 0, 0, 1, 7, L, L, false);
            this.N(class059742, class051632, 7, 1, 0, 7, 1, 7, L, L, false);
            this.N(class059742, class051632, 1, 1, 0, 6, 1, 0, L, L, false);
            this.N(class059742, class051632, 1, 1, 7, 6, 1, 7, L, L, false);
            this.N(class059742, class051632, 0, 2, 0, 0, 2, 7, u, u, false);
            this.N(class059742, class051632, 7, 2, 0, 7, 2, 7, u, u, false);
            this.N(class059742, class051632, 1, 2, 0, 6, 2, 0, u, u, false);
            this.N(class059742, class051632, 1, 2, 7, 6, 2, 7, u, u, false);
            this.N(class059742, class051632, 0, 3, 0, 0, 3, 7, L, L, false);
            this.N(class059742, class051632, 7, 3, 0, 7, 3, 7, L, L, false);
            this.N(class059742, class051632, 1, 3, 0, 6, 3, 0, L, L, false);
            this.N(class059742, class051632, 1, 3, 7, 6, 3, 7, L, L, false);
            this.N(class059742, class051632, 0, 1, 3, 0, 2, 4, u, u, false);
            this.N(class059742, class051632, 7, 1, 3, 7, 2, 4, u, u, false);
            this.N(class059742, class051632, 3, 1, 0, 4, 2, 0, u, u, false);
            this.N(class059742, class051632, 3, 1, 7, 4, 2, 7, u, u, false);
            if (this.d.L[class07211.field_11035.L()]) {
                this.N(class059742, class051632, 3, 1, 0, 4, 2, 0);
            }
            if (this.d.L[class07211.field_11043.L()]) {
                this.N(class059742, class051632, 3, 1, 7, 4, 2, 7);
            }
            if (this.d.L[class07211.field_11039.L()]) {
                this.N(class059742, class051632, 0, 1, 3, 0, 2, 4);
            }
            if (this.d.L[class07211.field_11034.L()]) {
                this.N(class059742, class051632, 7, 1, 3, 7, 2, 4);
            }
        }
        if (bl) {
            this.N(class059742, class051632, 3, 1, 3, 4, 1, 4, L, L, false);
            this.N(class059742, class051632, 3, 2, 3, 4, 2, 4, y, y, false);
            this.N(class059742, class051632, 3, 3, 3, 4, 3, 4, L, L, false);
        }
    }
}

