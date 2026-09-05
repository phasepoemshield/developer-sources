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

public class class06442
extends class06476 {
    public class06442(class07211 class072112, class05163 class051632) {
        super(class04878.C, class072112, 1, class051632);
    }

    public class06442(class07001 class070012) {
        super(class04878.C, class070012);
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        int n;
        this.N(class059742, class051632, 2, -1, 2, 11, -1, 11, L, L, false);
        this.N(class059742, class051632, 0, -1, 0, 1, -1, 11, y, y, false);
        this.N(class059742, class051632, 12, -1, 0, 13, -1, 11, y, y, false);
        this.N(class059742, class051632, 2, -1, 0, 11, -1, 1, y, y, false);
        this.N(class059742, class051632, 2, -1, 12, 11, -1, 13, y, y, false);
        this.N(class059742, class051632, 0, 0, 0, 0, 0, 13, L, L, false);
        this.N(class059742, class051632, 13, 0, 0, 13, 0, 13, L, L, false);
        this.N(class059742, class051632, 1, 0, 0, 12, 0, 0, L, L, false);
        this.N(class059742, class051632, 1, 0, 13, 12, 0, 13, L, L, false);
        for (n = 2; n <= 11; n += 3) {
            this.L(class059742, R, 0, 0, n, class051632);
            this.L(class059742, R, 13, 0, n, class051632);
            this.L(class059742, R, n, 0, 0, class051632);
        }
        this.N(class059742, class051632, 2, 0, 3, 4, 0, 9, L, L, false);
        this.N(class059742, class051632, 9, 0, 3, 11, 0, 9, L, L, false);
        this.N(class059742, class051632, 4, 0, 9, 9, 0, 11, L, L, false);
        this.L(class059742, L, 5, 0, 8, class051632);
        this.L(class059742, L, 8, 0, 8, class051632);
        this.L(class059742, L, 10, 0, 10, class051632);
        this.L(class059742, L, 3, 0, 10, class051632);
        this.N(class059742, class051632, 3, 0, 3, 3, 0, 7, u, u, false);
        this.N(class059742, class051632, 10, 0, 3, 10, 0, 7, u, u, false);
        this.N(class059742, class051632, 6, 0, 10, 7, 0, 10, u, u, false);
        n = 3;
        for (int i = 0; i < 2; ++i) {
            for (int j = 2; j <= 8; j += 3) {
                this.N(class059742, class051632, n, 0, j, n, 2, j, L, L, false);
            }
            n = 10;
        }
        this.N(class059742, class051632, 5, 0, 10, 5, 2, 10, L, L, false);
        this.N(class059742, class051632, 8, 0, 10, 8, 2, 10, L, L, false);
        this.N(class059742, class051632, 6, -1, 7, 7, -1, 8, u, u, false);
        this.N(class059742, class051632, 6, -1, 3, 7, -1, 4);
        this.N(class059742, class051632, 6, 1, 6);
    }
}

