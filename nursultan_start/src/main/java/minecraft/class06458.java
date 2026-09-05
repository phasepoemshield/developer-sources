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
 *  minecraft.class07746
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
import minecraft.class07746;
import minecraft.class08088;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class06458
extends class06456 {
    private static final int N = 13;
    private static final int y = 14;
    private static final int L = 13;

    public class06458(int n, class05163 class051632, class07211 class072112) {
        super(class04878.P, n, class051632);
        this.N(class072112);
    }

    public class06458(class07001 class070012) {
        super(class04878.P, class070012);
    }

    public static @Nullable class06458 N(class03860 class038602, int n, int n2, int n3, class07211 class072112, int n4) {
        class05163 class051632 = class05163.N((int)n, (int)n2, (int)n3, (int)-5, (int)-3, (int)0, (int)13, (int)14, (int)13, (class07211)class072112);
        if (!class06458.N(class051632) || class038602.N(class051632) != null) {
            return null;
        }
        return new class06458(n4, class051632, class072112);
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        int n;
        int n2;
        int n3;
        int n4;
        this.N(class059742, class051632, 0, 3, 0, 12, 4, 12, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 0, 5, 0, 12, 13, 12, class00869.N.W(), class00869.N.W(), false);
        this.N(class059742, class051632, 0, 5, 0, 1, 12, 12, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 11, 5, 0, 12, 12, 12, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 2, 5, 11, 4, 12, 12, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 8, 5, 11, 10, 12, 12, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 5, 9, 11, 7, 12, 12, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 2, 5, 0, 4, 12, 1, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 8, 5, 0, 10, 12, 1, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 5, 9, 0, 7, 12, 1, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 2, 11, 2, 10, 12, 10, class00869.ML.W(), class00869.ML.W(), false);
        class00500 class005002 = (class00500)((class00500)class00869.Mu.W().y((class08092)class00730.i, (Comparable)Boolean.valueOf(true))).y((class08092)class00730.L, (Comparable)Boolean.valueOf(true));
        class00500 class005003 = (class00500)((class00500)class00869.Mu.W().y((class08092)class00730.y, (Comparable)Boolean.valueOf(true))).y((class08092)class00730.u, (Comparable)Boolean.valueOf(true));
        class00500 class005004 = (class00500)class005003.y((class08092)class00730.i, (Comparable)Boolean.valueOf(true));
        class00500 class005005 = (class00500)class005003.y((class08092)class00730.L, (Comparable)Boolean.valueOf(true));
        for (n4 = 1; n4 <= 11; n4 += 2) {
            this.N(class059742, class051632, n4, 10, 0, n4, 11, 0, class005002, class005002, false);
            this.N(class059742, class051632, n4, 10, 12, n4, 11, 12, class005002, class005002, false);
            this.N(class059742, class051632, 0, 10, n4, 0, 11, n4, class005003, class005003, false);
            this.N(class059742, class051632, 12, 10, n4, 12, 11, n4, class005003, class005003, false);
            this.L(class059742, class00869.ML.W(), n4, 13, 0, class051632);
            this.L(class059742, class00869.ML.W(), n4, 13, 12, class051632);
            this.L(class059742, class00869.ML.W(), 0, 13, n4, class051632);
            this.L(class059742, class00869.ML.W(), 12, 13, n4, class051632);
            if (n4 == 11) continue;
            this.L(class059742, class005002, n4 + 1, 13, 0, class051632);
            this.L(class059742, class005002, n4 + 1, 13, 12, class051632);
            this.L(class059742, class005003, 0, 13, n4 + 1, class051632);
            this.L(class059742, class005003, 12, 13, n4 + 1, class051632);
        }
        this.L(class059742, (class00500)((class00500)class00869.Mu.W().y((class08092)class00730.y, (Comparable)Boolean.valueOf(true))).y((class08092)class00730.L, (Comparable)Boolean.valueOf(true)), 0, 13, 0, class051632);
        this.L(class059742, (class00500)((class00500)class00869.Mu.W().y((class08092)class00730.u, (Comparable)Boolean.valueOf(true))).y((class08092)class00730.L, (Comparable)Boolean.valueOf(true)), 0, 13, 12, class051632);
        this.L(class059742, (class00500)((class00500)class00869.Mu.W().y((class08092)class00730.u, (Comparable)Boolean.valueOf(true))).y((class08092)class00730.i, (Comparable)Boolean.valueOf(true)), 12, 13, 12, class051632);
        this.L(class059742, (class00500)((class00500)class00869.Mu.W().y((class08092)class00730.y, (Comparable)Boolean.valueOf(true))).y((class08092)class00730.i, (Comparable)Boolean.valueOf(true)), 12, 13, 0, class051632);
        for (n4 = 3; n4 <= 9; n4 += 2) {
            this.N(class059742, class051632, 1, 7, n4, 1, 8, n4, class005004, class005004, false);
            this.N(class059742, class051632, 11, 7, n4, 11, 8, n4, class005005, class005005, false);
        }
        class00500 class005006 = (class00500)class00869.Mi.W().y((class08092)class07746.y, (Comparable)class07211.field_11043);
        for (n3 = 0; n3 <= 6; ++n3) {
            int n5 = n3 + 4;
            for (n2 = 5; n2 <= 7; ++n2) {
                this.L(class059742, class005006, n2, 5 + n3, n5, class051632);
            }
            if (n5 >= 5 && n5 <= 8) {
                this.N(class059742, class051632, 5, 5, n5, 7, n3 + 4, n5, class00869.ML.W(), class00869.ML.W(), false);
            } else if (n5 >= 9 && n5 <= 10) {
                this.N(class059742, class051632, 5, 8, n5, 7, n3 + 4, n5, class00869.ML.W(), class00869.ML.W(), false);
            }
            if (n3 < 1) continue;
            this.N(class059742, class051632, 5, 6 + n3, n5, 7, 9 + n3, n5, class00869.N.W(), class00869.N.W(), false);
        }
        for (n3 = 5; n3 <= 7; ++n3) {
            this.L(class059742, class005006, n3, 12, 11, class051632);
        }
        this.N(class059742, class051632, 5, 6, 7, 5, 7, 7, class005005, class005005, false);
        this.N(class059742, class051632, 7, 6, 7, 7, 7, 7, class005004, class005004, false);
        this.N(class059742, class051632, 5, 13, 12, 7, 13, 12, class00869.N.W(), class00869.N.W(), false);
        this.N(class059742, class051632, 2, 5, 2, 3, 5, 3, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 2, 5, 9, 3, 5, 10, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 2, 5, 4, 2, 5, 8, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 9, 5, 2, 10, 5, 3, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 9, 5, 9, 10, 5, 10, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 10, 5, 4, 10, 5, 8, class00869.ML.W(), class00869.ML.W(), false);
        class00500 class005007 = (class00500)class005006.y((class08092)class07746.y, (Comparable)class07211.field_11034);
        class00500 class005008 = (class00500)class005006.y((class08092)class07746.y, (Comparable)class07211.field_11039);
        this.L(class059742, class005008, 4, 5, 2, class051632);
        this.L(class059742, class005008, 4, 5, 3, class051632);
        this.L(class059742, class005008, 4, 5, 9, class051632);
        this.L(class059742, class005008, 4, 5, 10, class051632);
        this.L(class059742, class005007, 8, 5, 2, class051632);
        this.L(class059742, class005007, 8, 5, 3, class051632);
        this.L(class059742, class005007, 8, 5, 9, class051632);
        this.L(class059742, class005007, 8, 5, 10, class051632);
        this.N(class059742, class051632, 3, 4, 4, 4, 4, 8, class00869.iw.W(), class00869.iw.W(), false);
        this.N(class059742, class051632, 8, 4, 4, 9, 4, 8, class00869.iw.W(), class00869.iw.W(), false);
        this.N(class059742, class051632, 3, 5, 4, 4, 5, 8, class00869.MR.W(), class00869.MR.W(), false);
        this.N(class059742, class051632, 8, 5, 4, 9, 5, 8, class00869.MR.W(), class00869.MR.W(), false);
        this.N(class059742, class051632, 4, 2, 0, 8, 2, 12, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 0, 2, 4, 12, 2, 8, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 4, 0, 0, 8, 1, 3, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 4, 0, 9, 8, 1, 12, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 0, 0, 4, 3, 1, 8, class00869.ML.W(), class00869.ML.W(), false);
        this.N(class059742, class051632, 9, 0, 4, 12, 1, 8, class00869.ML.W(), class00869.ML.W(), false);
        for (n2 = 4; n2 <= 8; ++n2) {
            for (n = 0; n <= 2; ++n) {
                this.N(class059742, class00869.ML.W(), n2, -1, n, class051632);
                this.N(class059742, class00869.ML.W(), n2, -1, 12 - n, class051632);
            }
        }
        for (n2 = 0; n2 <= 2; ++n2) {
            for (n = 4; n <= 8; ++n) {
                this.N(class059742, class00869.ML.W(), n2, -1, n, class051632);
                this.N(class059742, class00869.ML.W(), 12 - n2, -1, n, class051632);
            }
        }
    }

    public void N(class04890 class048902, class03860 class038602, class06069 class060692) {
        this.N((class06461)class048902, class038602, class060692, 5, 3, true);
        this.N((class06461)class048902, class038602, class060692, 5, 11, true);
    }
}

