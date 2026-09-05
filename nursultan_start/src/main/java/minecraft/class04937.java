/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class03298
 *  minecraft.class03860
 *  minecraft.class05163
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class07001
 *  minecraft.class07078
 *  minecraft.class07100
 *  minecraft.class07200
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07235
 *  minecraft.class07321
 *  minecraft.class07746
 *  minecraft.class08088
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class03298;
import minecraft.class03860;
import minecraft.class04878;
import minecraft.class04890;
import minecraft.class04898;
import minecraft.class04900;
import minecraft.class04931;
import minecraft.class04933;
import minecraft.class05163;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class07001;
import minecraft.class07078;
import minecraft.class07100;
import minecraft.class07200;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07235;
import minecraft.class07321;
import minecraft.class07746;
import minecraft.class08088;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class04937
extends class04931 {
    protected static final int N = 11;
    protected static final int y = 8;
    protected static final int L = 16;
    private boolean u;

    public class04937(int n, class05163 class051632, class07211 class072112) {
        super(class04878.d, n, class051632);
        this.N(class072112);
    }

    public class04937(class07001 class070012) {
        super(class04878.d, class070012);
        this.u = class070012.y("Mob", false);
    }

    public static @Nullable class04937 N(class03860 class038602, int n, int n2, int n3, class07211 class072112, int n4) {
        class05163 class051632 = class05163.N((int)n, (int)n2, (int)n3, (int)-4, (int)-1, (int)0, (int)11, (int)8, (int)16, (class07211)class072112);
        if (!class04937.N(class051632) || class038602.N(class051632) != null) {
            return null;
        }
        return new class04937(n4, class051632, class072112);
    }

    @Override
    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        class07218 class072182;
        int n;
        this.N(class059742, class051632, 0, 0, 0, 10, 7, 15, false, class060692, class04933.L);
        this.N(class059742, class060692, class051632, class04900.field_15289, 4, 1, 0);
        int n2 = 6;
        this.N(class059742, class051632, 1, 6, 1, 1, 6, 14, false, class060692, class04933.L);
        this.N(class059742, class051632, 9, 6, 1, 9, 6, 14, false, class060692, class04933.L);
        this.N(class059742, class051632, 2, 6, 1, 8, 6, 2, false, class060692, class04933.L);
        this.N(class059742, class051632, 2, 6, 14, 8, 6, 14, false, class060692, class04933.L);
        this.N(class059742, class051632, 1, 1, 1, 2, 1, 4, false, class060692, class04933.L);
        this.N(class059742, class051632, 8, 1, 1, 9, 1, 4, false, class060692, class04933.L);
        this.N(class059742, class051632, 1, 1, 1, 1, 1, 3, class00869.V.W(), class00869.V.W(), false);
        this.N(class059742, class051632, 9, 1, 1, 9, 1, 3, class00869.V.W(), class00869.V.W(), false);
        this.N(class059742, class051632, 3, 1, 8, 7, 1, 12, false, class060692, class04933.L);
        this.N(class059742, class051632, 4, 1, 9, 6, 1, 11, class00869.V.W(), class00869.V.W(), false);
        class00500 class005002 = (class00500)((class00500)class00869.RQ.W().y((class08092)class07100.y, (Comparable)Boolean.valueOf(true))).y((class08092)class07100.u, (Comparable)Boolean.valueOf(true));
        class00500 class005003 = (class00500)((class00500)class00869.RQ.W().y((class08092)class07100.i, (Comparable)Boolean.valueOf(true))).y((class08092)class07100.L, (Comparable)Boolean.valueOf(true));
        for (n = 3; n < 14; n += 2) {
            this.N(class059742, class051632, 0, 3, n, 0, 4, n, class005002, class005002, false);
            this.N(class059742, class051632, 10, 3, n, 10, 4, n, class005002, class005002, false);
        }
        for (n = 2; n < 9; n += 2) {
            this.N(class059742, class051632, n, 3, 15, n, 4, 15, class005003, class005003, false);
        }
        class00500 class005004 = (class00500)class00869.RA.W().y((class08092)class07746.y, (Comparable)class07211.field_11043);
        this.N(class059742, class051632, 4, 1, 5, 6, 1, 7, false, class060692, class04933.L);
        this.N(class059742, class051632, 4, 2, 6, 6, 2, 7, false, class060692, class04933.L);
        this.N(class059742, class051632, 4, 3, 7, 6, 3, 7, false, class060692, class04933.L);
        for (int i = 4; i <= 6; ++i) {
            this.L(class059742, class005004, i, 1, 4, class051632);
            this.L(class059742, class005004, i, 2, 5, class051632);
            this.L(class059742, class005004, i, 3, 6, class051632);
        }
        class00500 class005005 = (class00500)class00869.Mm.W().y((class08092)class07200.y, (Comparable)class07211.field_11043);
        class00500 class005006 = (class00500)class00869.Mm.W().y((class08092)class07200.y, (Comparable)class07211.field_11035);
        class00500 class005007 = (class00500)class00869.Mm.W().y((class08092)class07200.y, (Comparable)class07211.field_11034);
        class00500 class005008 = (class00500)class00869.Mm.W().y((class08092)class07200.y, (Comparable)class07211.field_11039);
        boolean bl = true;
        boolean[] blArray = new boolean[12];
        for (int i = 0; i < blArray.length; ++i) {
            blArray[i] = class060692.z() > 0.9f;
            bl &= blArray[i];
        }
        this.L(class059742, (class00500)class005005.y((class08092)class07200.L, (Comparable)Boolean.valueOf(blArray[0])), 4, 3, 8, class051632);
        this.L(class059742, (class00500)class005005.y((class08092)class07200.L, (Comparable)Boolean.valueOf(blArray[1])), 5, 3, 8, class051632);
        this.L(class059742, (class00500)class005005.y((class08092)class07200.L, (Comparable)Boolean.valueOf(blArray[2])), 6, 3, 8, class051632);
        this.L(class059742, (class00500)class005006.y((class08092)class07200.L, (Comparable)Boolean.valueOf(blArray[3])), 4, 3, 12, class051632);
        this.L(class059742, (class00500)class005006.y((class08092)class07200.L, (Comparable)Boolean.valueOf(blArray[4])), 5, 3, 12, class051632);
        this.L(class059742, (class00500)class005006.y((class08092)class07200.L, (Comparable)Boolean.valueOf(blArray[5])), 6, 3, 12, class051632);
        this.L(class059742, (class00500)class005007.y((class08092)class07200.L, (Comparable)Boolean.valueOf(blArray[6])), 3, 3, 9, class051632);
        this.L(class059742, (class00500)class005007.y((class08092)class07200.L, (Comparable)Boolean.valueOf(blArray[7])), 3, 3, 10, class051632);
        this.L(class059742, (class00500)class005007.y((class08092)class07200.L, (Comparable)Boolean.valueOf(blArray[8])), 3, 3, 11, class051632);
        this.L(class059742, (class00500)class005008.y((class08092)class07200.L, (Comparable)Boolean.valueOf(blArray[9])), 7, 3, 9, class051632);
        this.L(class059742, (class00500)class005008.y((class08092)class07200.L, (Comparable)Boolean.valueOf(blArray[10])), 7, 3, 10, class051632);
        this.L(class059742, (class00500)class005008.y((class08092)class07200.L, (Comparable)Boolean.valueOf(blArray[11])), 7, 3, 11, class051632);
        if (bl) {
            class00500 class005009 = class00869.MW.W();
            this.L(class059742, class005009, 4, 3, 9, class051632);
            this.L(class059742, class005009, 5, 3, 9, class051632);
            this.L(class059742, class005009, 6, 3, 9, class051632);
            this.L(class059742, class005009, 4, 3, 10, class051632);
            this.L(class059742, class005009, 5, 3, 10, class051632);
            this.L(class059742, class005009, 6, 3, 10, class051632);
            this.L(class059742, class005009, 4, 3, 11, class051632);
            this.L(class059742, class005009, 5, 3, 11, class051632);
            this.L(class059742, class005009, 6, 3, 11, class051632);
        }
        if (!this.u && class051632.y((class00753)(class072182 = this.L(5, 3, 6)))) {
            this.u = true;
            class059742.method_8652((class07209)class072182, class00869.La.W(), 2);
            class00394 class003942 = class059742.method_8321((class07209)class072182);
            if (class003942 instanceof class07235) {
                ((class07235)class003942).N(class07078.yW, class060692);
            }
        }
    }

    @Override
    public void N(class04890 class048902, class03860 class038602, class06069 class060692) {
        if (class048902 != null) {
            ((class04898)class048902).y = this;
        }
    }

    @Override
    protected void N(class03298 class032982, class07001 class070012) {
        super.N(class032982, class070012);
        class070012.N("Mob", this.u);
    }
}

