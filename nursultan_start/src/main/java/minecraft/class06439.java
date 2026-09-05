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

public class class06439
extends class06456 {
    private static final int N = 5;
    private static final int y = 10;
    private static final int L = 19;

    public class06439(int n, class06069 class060692, class05163 class051632, class07211 class072112) {
        super(class04878.M, n, class051632);
        this.N(class072112);
    }

    public class06439(class07001 class070012) {
        super(class04878.M, class070012);
    }

    public static @Nullable class06439 N(class03860 class038602, class06069 class060692, int n, int n2, int n3, class07211 class072112, int n4) {
        class05163 class051632 = class05163.N((int)n, (int)n2, (int)n3, (int)-1, (int)-3, (int)0, (int)5, (int)10, (int)19, (class07211)class072112);
        if (!class06439.N(class051632) || class038602.N(class051632) != null) {
            return null;
        }
        return new class06439(n4, class060692, class051632, class072112);
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        this.N(class059742, class051632, 0, 3, 0, 4, 4, 18, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 1, 5, 0, 3, 7, 18, class00869.N.W(), class00869.N.W(), false);
        this.N(class059742, class051632, 0, 5, 0, 0, 5, 18, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 4, 5, 0, 4, 5, 18, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 0, 2, 0, 4, 2, 5, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 0, 2, 13, 4, 2, 18, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 0, 0, 0, 4, 1, 3, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 0, 0, 15, 4, 1, 18, class00869.ML.W(), class00869.ML.W(), false);
        for (int i = 0; i <= 4; ++i) {
            for (int j = 0; j <= 2; ++j) {
                this.N(class059742, class00869.ML.W(), i, -1, j, class051632);
                this.N(class059742, class00869.ML.W(), i, -1, 18 - j, class051632);
            }
        }
        class00500 class005002 = (class00500)((class00500)class00869.Mu.W().y((class08092)class00730.y, (Comparable)Boolean.valueOf(true))).y((class08092)class00730.u, (Comparable)Boolean.valueOf(true));
        class00500 class005003 = (class00500)class005002.y((class08092)class00730.L, (Comparable)Boolean.valueOf(true));
        class00500 class005004 = (class00500)class005002.y((class08092)class00730.i, (Comparable)Boolean.valueOf(true));
        this.N(class059742, class051632, 0, 1, 1, 0, 4, 1, class005003, class005003, false);
        this.N(class059742, class051632, 0, 3, 4, 0, 4, 4, class005003, class005003, false);
        this.N(class059742, class051632, 0, 3, 14, 0, 4, 14, class005003, class005003, false);
        this.N(class059742, class051632, 0, 1, 17, 0, 4, 17, class005003, class005003, false);
        this.N(class059742, class051632, 4, 1, 1, 4, 4, 1, class005004, class005004, false);
        this.N(class059742, class051632, 4, 3, 4, 4, 4, 4, class005004, class005004, false);
        this.N(class059742, class051632, 4, 3, 14, 4, 4, 14, class005004, class005004, false);
        this.N(class059742, class051632, 4, 1, 17, 4, 4, 17, class005004, class005004, false);
    }

    public void N(class04890 class048902, class03860 class038602, class06069 class060692) {
        this.N((class06461)class048902, class038602, class060692, 1, 3, false);
    }
}

