/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00730
 *  minecraft.class00869
 *  minecraft.class03860
 *  minecraft.class04878
 *  minecraft.class04890
 *  minecraft.class05163
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07321
 *  minecraft.class08088
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00730;
import minecraft.class00869;
import minecraft.class03860;
import minecraft.class04878;
import minecraft.class04890;
import minecraft.class05163;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06456;
import minecraft.class06461;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07321;
import minecraft.class08088;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class06432
extends class06456 {
    private static final int N = 7;
    private static final int y = 11;
    private static final int L = 7;

    public class06432(int n, class05163 class051632, class07211 class072112) {
        super(class04878.b, n, class051632);
        this.N(class072112);
    }

    public class06432(class07001 class070012) {
        super(class04878.b, class070012);
    }

    public static @Nullable class06432 N(class03860 class038602, int n, int n2, int n3, int n4, class07211 class072112) {
        class05163 class051632 = class05163.N((int)n, (int)n2, (int)n3, (int)-2, (int)0, (int)0, (int)7, (int)11, (int)7, (class07211)class072112);
        if (!class06432.N(class051632) || class038602.N(class051632) != null) {
            return null;
        }
        return new class06432(n4, class051632, class072112);
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        this.N(class059742, class051632, 0, 0, 0, 6, 1, 6, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 0, 2, 0, 6, 10, 6, class00869.N.W(), class00869.N.W(), false);
        this.N(class059742, class051632, 0, 2, 0, 1, 8, 0, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 5, 2, 0, 6, 8, 0, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 0, 2, 1, 0, 8, 6, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 6, 2, 1, 6, 8, 6, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 1, 2, 6, 5, 8, 6, class00869.ML.W(), class00869.ML.W(), false);
        class00500 class005002 = (class00500)((class00500)class00869.Mu.W().y((class08092)class00730.i, (Comparable)Boolean.valueOf(true))).y((class08092)class00730.L, (Comparable)Boolean.valueOf(true));
        class00500 class005003 = (class00500)((class00500)class00869.Mu.W().y((class08092)class00730.y, (Comparable)Boolean.valueOf(true))).y((class08092)class00730.u, (Comparable)Boolean.valueOf(true));
        this.N(class059742, class051632, 0, 3, 2, 0, 5, 4, class005003, class005003, false);
        this.N(class059742, class051632, 6, 3, 2, 6, 5, 2, class005003, class005003, false);
        this.N(class059742, class051632, 6, 3, 4, 6, 5, 4, class005003, class005003, false);
        this.L(class059742, class00869.ML.W(), 5, 2, 5, class051632);
        this.N(class059742, class051632, 4, 2, 5, 4, 3, 5, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 3, 2, 5, 3, 4, 5, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 2, 2, 5, 2, 5, 5, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 1, 2, 5, 1, 6, 5, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 1, 7, 1, 5, 7, 4, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 6, 8, 2, 6, 8, 4, class00869.N.W(), class00869.N.W(), false);
        this.N(class059742, class051632, 2, 6, 0, 4, 8, 0, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 2, 5, 0, 4, 5, 0, class005002, class005002, false);
        for (int i = 0; i <= 6; ++i) {
            for (int j = 0; j <= 6; ++j) {
                this.N(class059742, class00869.ML.W(), i, -1, j, class051632);
            }
        }
    }

    public void N(class04890 class048902, class03860 class038602, class06069 class060692) {
        this.L((class06461)class048902, class038602, class060692, 6, 2, false);
    }
}

