/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class03860
 *  minecraft.class05163
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class07001
 *  minecraft.class07100
 *  minecraft.class07196
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07321
 *  minecraft.class08059
 *  minecraft.class08088
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00869;
import minecraft.class03860;
import minecraft.class04878;
import minecraft.class04890;
import minecraft.class04898;
import minecraft.class04931;
import minecraft.class04933;
import minecraft.class05163;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class07001;
import minecraft.class07100;
import minecraft.class07196;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07321;
import minecraft.class08059;
import minecraft.class08088;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class04925
extends class04931 {
    protected static final int N = 9;
    protected static final int y = 5;
    protected static final int L = 11;

    public class04925(int n, class06069 class060692, class05163 class051632, class07211 class072112) {
        super(class04878.w, n, class051632);
        this.N(class072112);
        this.i = this.N(class060692);
    }

    public class04925(class07001 class070012) {
        super(class04878.w, class070012);
    }

    public static @Nullable class04925 N(class03860 class038602, class06069 class060692, int n, int n2, int n3, class07211 class072112, int n4) {
        class05163 class051632 = class05163.N((int)n, (int)n2, (int)n3, (int)-1, (int)-1, (int)0, (int)9, (int)5, (int)11, (class07211)class072112);
        if (!class04925.N(class051632) || class038602.N(class051632) != null) {
            return null;
        }
        return new class04925(n4, class060692, class051632, class072112);
    }

    @Override
    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        this.N(class059742, class051632, 0, 0, 0, 8, 4, 10, true, class060692, class04933.L);
        this.N(class059742, class060692, class051632, this.i, 1, 1, 0);
        this.N(class059742, class051632, 1, 1, 10, 3, 3, 10, w, w, false);
        this.N(class059742, class051632, 4, 1, 1, 4, 3, 1, false, class060692, class04933.L);
        this.N(class059742, class051632, 4, 1, 3, 4, 3, 3, false, class060692, class04933.L);
        this.N(class059742, class051632, 4, 1, 7, 4, 3, 7, false, class060692, class04933.L);
        this.N(class059742, class051632, 4, 1, 9, 4, 3, 9, false, class060692, class04933.L);
        for (int i = 1; i <= 3; ++i) {
            this.L(class059742, (class00500)((class00500)class00869.RQ.W().y((class08092)class07100.y, (Comparable)Boolean.valueOf(true))).y((class08092)class07100.u, (Comparable)Boolean.valueOf(true)), 4, i, 4, class051632);
            this.L(class059742, (class00500)((class00500)((class00500)class00869.RQ.W().y((class08092)class07100.y, (Comparable)Boolean.valueOf(true))).y((class08092)class07100.u, (Comparable)Boolean.valueOf(true))).y((class08092)class07100.L, (Comparable)Boolean.valueOf(true)), 4, i, 5, class051632);
            this.L(class059742, (class00500)((class00500)class00869.RQ.W().y((class08092)class07100.y, (Comparable)Boolean.valueOf(true))).y((class08092)class07100.u, (Comparable)Boolean.valueOf(true)), 4, i, 6, class051632);
            this.L(class059742, (class00500)((class00500)class00869.RQ.W().y((class08092)class07100.i, (Comparable)Boolean.valueOf(true))).y((class08092)class07100.L, (Comparable)Boolean.valueOf(true)), 5, i, 5, class051632);
            this.L(class059742, (class00500)((class00500)class00869.RQ.W().y((class08092)class07100.i, (Comparable)Boolean.valueOf(true))).y((class08092)class07100.L, (Comparable)Boolean.valueOf(true)), 6, i, 5, class051632);
            this.L(class059742, (class00500)((class00500)class00869.RQ.W().y((class08092)class07100.i, (Comparable)Boolean.valueOf(true))).y((class08092)class07100.L, (Comparable)Boolean.valueOf(true)), 7, i, 5, class051632);
        }
        this.L(class059742, (class00500)((class00500)class00869.RQ.W().y((class08092)class07100.y, (Comparable)Boolean.valueOf(true))).y((class08092)class07100.u, (Comparable)Boolean.valueOf(true)), 4, 3, 2, class051632);
        this.L(class059742, (class00500)((class00500)class00869.RQ.W().y((class08092)class07100.y, (Comparable)Boolean.valueOf(true))).y((class08092)class07100.u, (Comparable)Boolean.valueOf(true)), 4, 3, 8, class051632);
        class00500 class005002 = (class00500)class00869.ur.W().y((class08092)class07196.y, (Comparable)class07211.field_11039);
        class00500 class005003 = (class00500)((class00500)class00869.ur.W().y((class08092)class07196.y, (Comparable)class07211.field_11039)).y((class08092)class07196.L, (Comparable)class08059.field_12609);
        this.L(class059742, class005002, 4, 1, 2, class051632);
        this.L(class059742, class005003, 4, 2, 2, class051632);
        this.L(class059742, class005002, 4, 1, 8, class051632);
        this.L(class059742, class005003, 4, 2, 8, class051632);
    }

    @Override
    public void N(class04890 class048902, class03860 class038602, class06069 class060692) {
        this.N((class04898)class048902, class038602, class060692, 1, 1);
    }
}

