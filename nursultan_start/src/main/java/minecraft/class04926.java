/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00651
 *  minecraft.class00730
 *  minecraft.class00869
 *  minecraft.class03298
 *  minecraft.class03860
 *  minecraft.class05074
 *  minecraft.class05163
 *  minecraft.class05324
 *  minecraft.class05946
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06273
 *  minecraft.class07001
 *  minecraft.class07123
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07321
 *  minecraft.class08088
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00651;
import minecraft.class00730;
import minecraft.class00869;
import minecraft.class03298;
import minecraft.class03860;
import minecraft.class04878;
import minecraft.class04931;
import minecraft.class04933;
import minecraft.class05074;
import minecraft.class05163;
import minecraft.class05324;
import minecraft.class05946;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06273;
import minecraft.class07001;
import minecraft.class07123;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07321;
import minecraft.class08088;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class04926
extends class04931 {
    protected static final int N = 14;
    protected static final int y = 6;
    protected static final int L = 11;
    protected static final int u = 15;
    private final boolean R;

    public class04926(int n, class06069 class060692, class05163 class051632, class07211 class072112) {
        super(class04878.l, n, class051632);
        this.N(class072112);
        this.i = this.N(class060692);
        this.R = class051632.i() > 6;
    }

    public class04926(class07001 class070012) {
        super(class04878.l, class070012);
        this.R = class070012.y("Tall", false);
    }

    public static @Nullable class04926 N(class03860 class038602, class06069 class060692, int n, int n2, int n3, class07211 class072112, int n4) {
        class05163 class051632 = class05163.N((int)n, (int)n2, (int)n3, (int)-4, (int)-1, (int)0, (int)14, (int)11, (int)15, (class07211)class072112);
        if (!(class04926.N(class051632) && class038602.N(class051632) == null || class04926.N(class051632 = class05163.N((int)n, (int)n2, (int)n3, (int)-4, (int)-1, (int)0, (int)14, (int)6, (int)15, (class07211)class072112)) && class038602.N(class051632) == null)) {
            return null;
        }
        return new class04926(n4, class060692, class051632, class072112);
    }

    @Override
    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        int n;
        int n2 = 11;
        if (!this.R) {
            n2 = 6;
        }
        this.N(class059742, class051632, 0, 0, 0, 13, n2 - 1, 14, true, class060692, class04933.L);
        this.N(class059742, class060692, class051632, this.i, 4, 1, 0);
        this.N(class059742, class051632, class060692, 0.07f, 2, 1, 1, 11, 4, 13, class00869.yw.W(), class00869.yw.W(), false, false);
        boolean bl = true;
        int n3 = 12;
        for (n = 1; n <= 13; ++n) {
            if ((n - 1) % 4 == 0) {
                this.N(class059742, class051632, 1, 1, n, 1, 4, n, class00869.m.W(), class00869.m.W(), false);
                this.N(class059742, class051632, 12, 1, n, 12, 4, n, class00869.m.W(), class00869.m.W(), false);
                this.L(class059742, (class00500)class00869.LH.W().y((class08092)class00651.i, (Comparable)class07211.field_11034), 2, 3, n, class051632);
                this.L(class059742, (class00500)class00869.LH.W().y((class08092)class00651.i, (Comparable)class07211.field_11039), 11, 3, n, class051632);
                if (!this.R) continue;
                this.N(class059742, class051632, 1, 6, n, 1, 9, n, class00869.m.W(), class00869.m.W(), false);
                this.N(class059742, class051632, 12, 6, n, 12, 9, n, class00869.m.W(), class00869.m.W(), false);
                continue;
            }
            this.N(class059742, class051632, 1, 1, n, 1, 4, n, class00869.Lt.W(), class00869.Lt.W(), false);
            this.N(class059742, class051632, 12, 1, n, 12, 4, n, class00869.Lt.W(), class00869.Lt.W(), false);
            if (!this.R) continue;
            this.N(class059742, class051632, 1, 6, n, 1, 9, n, class00869.Lt.W(), class00869.Lt.W(), false);
            this.N(class059742, class051632, 12, 6, n, 12, 9, n, class00869.Lt.W(), class00869.Lt.W(), false);
        }
        for (n = 3; n < 12; n += 2) {
            this.N(class059742, class051632, 3, 1, n, 4, 3, n, class00869.Lt.W(), class00869.Lt.W(), false);
            this.N(class059742, class051632, 6, 1, n, 7, 3, n, class00869.Lt.W(), class00869.Lt.W(), false);
            this.N(class059742, class051632, 9, 1, n, 10, 3, n, class00869.Lt.W(), class00869.Lt.W(), false);
        }
        if (this.R) {
            this.N(class059742, class051632, 1, 5, 1, 3, 5, 13, class00869.m.W(), class00869.m.W(), false);
            this.N(class059742, class051632, 10, 5, 1, 12, 5, 13, class00869.m.W(), class00869.m.W(), false);
            this.N(class059742, class051632, 4, 5, 1, 9, 5, 2, class00869.m.W(), class00869.m.W(), false);
            this.N(class059742, class051632, 4, 5, 12, 9, 5, 13, class00869.m.W(), class00869.m.W(), false);
            this.L(class059742, class00869.m.W(), 9, 5, 11, class051632);
            this.L(class059742, class00869.m.W(), 8, 5, 11, class051632);
            this.L(class059742, class00869.m.W(), 9, 5, 10, class051632);
            class00500 class005002 = (class00500)((class00500)class00869.il.W().y((class08092)class00730.i, (Comparable)Boolean.valueOf(true))).y((class08092)class00730.L, (Comparable)Boolean.valueOf(true));
            class00500 class005003 = (class00500)((class00500)class00869.il.W().y((class08092)class00730.y, (Comparable)Boolean.valueOf(true))).y((class08092)class00730.u, (Comparable)Boolean.valueOf(true));
            this.N(class059742, class051632, 3, 6, 3, 3, 6, 11, class005003, class005003, false);
            this.N(class059742, class051632, 10, 6, 3, 10, 6, 9, class005003, class005003, false);
            this.N(class059742, class051632, 4, 6, 2, 9, 6, 2, class005002, class005002, false);
            this.N(class059742, class051632, 4, 6, 12, 7, 6, 12, class005002, class005002, false);
            this.L(class059742, (class00500)((class00500)class00869.il.W().y((class08092)class00730.y, (Comparable)Boolean.valueOf(true))).y((class08092)class00730.L, (Comparable)Boolean.valueOf(true)), 3, 6, 2, class051632);
            this.L(class059742, (class00500)((class00500)class00869.il.W().y((class08092)class00730.u, (Comparable)Boolean.valueOf(true))).y((class08092)class00730.L, (Comparable)Boolean.valueOf(true)), 3, 6, 12, class051632);
            this.L(class059742, (class00500)((class00500)class00869.il.W().y((class08092)class00730.y, (Comparable)Boolean.valueOf(true))).y((class08092)class00730.i, (Comparable)Boolean.valueOf(true)), 10, 6, 2, class051632);
            for (int i = 0; i <= 2; ++i) {
                this.L(class059742, (class00500)((class00500)class00869.il.W().y((class08092)class00730.u, (Comparable)Boolean.valueOf(true))).y((class08092)class00730.i, (Comparable)Boolean.valueOf(true)), 8 + i, 6, 12 - i, class051632);
                if (i == 2) continue;
                this.L(class059742, (class00500)((class00500)class00869.il.W().y((class08092)class00730.y, (Comparable)Boolean.valueOf(true))).y((class08092)class00730.L, (Comparable)Boolean.valueOf(true)), 8 + i, 6, 11 - i, class051632);
            }
            class00500 class005004 = (class00500)class00869.uW.W().y((class08092)class07123.y, (Comparable)class07211.field_11035);
            this.L(class059742, class005004, 10, 1, 13, class051632);
            this.L(class059742, class005004, 10, 2, 13, class051632);
            this.L(class059742, class005004, 10, 3, 13, class051632);
            this.L(class059742, class005004, 10, 4, 13, class051632);
            this.L(class059742, class005004, 10, 5, 13, class051632);
            this.L(class059742, class005004, 10, 6, 13, class051632);
            this.L(class059742, class005004, 10, 7, 13, class051632);
            int n4 = 7;
            int n5 = 7;
            class00500 class005005 = (class00500)class00869.il.W().y((class08092)class00730.L, (Comparable)Boolean.valueOf(true));
            this.L(class059742, class005005, 6, 9, 7, class051632);
            class00500 class005006 = (class00500)class00869.il.W().y((class08092)class00730.i, (Comparable)Boolean.valueOf(true));
            this.L(class059742, class005006, 7, 9, 7, class051632);
            this.L(class059742, class005005, 6, 8, 7, class051632);
            this.L(class059742, class005006, 7, 8, 7, class051632);
            class00500 class005007 = (class00500)((class00500)class005003.y((class08092)class00730.i, (Comparable)Boolean.valueOf(true))).y((class08092)class00730.L, (Comparable)Boolean.valueOf(true));
            this.L(class059742, class005007, 6, 7, 7, class051632);
            this.L(class059742, class005007, 7, 7, 7, class051632);
            this.L(class059742, class005005, 5, 7, 7, class051632);
            this.L(class059742, class005006, 8, 7, 7, class051632);
            this.L(class059742, (class00500)class005005.y((class08092)class00730.y, (Comparable)Boolean.valueOf(true)), 6, 7, 6, class051632);
            this.L(class059742, (class00500)class005005.y((class08092)class00730.u, (Comparable)Boolean.valueOf(true)), 6, 7, 8, class051632);
            this.L(class059742, (class00500)class005006.y((class08092)class00730.y, (Comparable)Boolean.valueOf(true)), 7, 7, 6, class051632);
            this.L(class059742, (class00500)class005006.y((class08092)class00730.u, (Comparable)Boolean.valueOf(true)), 7, 7, 8, class051632);
            class00500 class005008 = class00869.Le.W();
            this.L(class059742, class005008, 5, 8, 7, class051632);
            this.L(class059742, class005008, 8, 8, 7, class051632);
            this.L(class059742, class005008, 6, 8, 6, class051632);
            this.L(class059742, class005008, 6, 8, 8, class051632);
            this.L(class059742, class005008, 7, 8, 6, class051632);
            this.L(class059742, class005008, 7, 8, 8, class051632);
        }
        this.N(class059742, class051632, class060692, 3, 3, 5, (class05946<class05074>)class06273.t);
        if (this.R) {
            this.L(class059742, w, 12, 9, 1, class051632);
            this.N(class059742, class051632, class060692, 12, 8, 1, (class05946<class05074>)class06273.t);
        }
    }

    @Override
    protected void N(class03298 class032982, class07001 class070012) {
        super.N(class032982, class070012);
        class070012.N("Tall", this.R);
    }
}

