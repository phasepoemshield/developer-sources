/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
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

public class class06448
extends class06476 {
    public class06448(class07211 class072112, class06433 class064332) {
        super(class04878.x, 1, class072112, class064332, 1, 1, 1);
    }

    public class06448(class07001 class070012) {
        super(class04878.x, class070012);
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        if (this.d.N / 25 > 0) {
            this.N(class059742, class051632, 0, 0, this.d.L[class07211.field_11033.L()]);
        }
        if (this.d.y[class07211.field_11036.L()] == null) {
            this.N(class059742, class051632, 1, 4, 1, 6, 4, 6, y);
        }
        for (int i = 1; i <= 6; ++i) {
            for (int j = 1; j <= 6; ++j) {
                if (class060692.y(3) == 0) continue;
                int n = 2 + (class060692.y(4) == 0 ? 0 : 1);
                class00500 class005002 = class00869.Nx.W();
                this.N(class059742, class051632, i, n, j, i, 3, j, class005002, class005002, false);
            }
        }
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
    }
}

