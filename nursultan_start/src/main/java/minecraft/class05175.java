/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00513
 *  minecraft.class00637
 *  minecraft.class00659
 *  minecraft.class00664
 *  minecraft.class00869
 *  minecraft.class03298
 *  minecraft.class04878
 *  minecraft.class04894
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06273
 *  minecraft.class06657
 *  minecraft.class06859
 *  minecraft.class06884
 *  minecraft.class07001
 *  minecraft.class07127
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07321
 *  minecraft.class07746
 *  minecraft.class08075
 *  minecraft.class08088
 *  minecraft.class08092
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00513;
import minecraft.class00637;
import minecraft.class00659;
import minecraft.class00664;
import minecraft.class00869;
import minecraft.class03298;
import minecraft.class04878;
import minecraft.class04894;
import minecraft.class05163;
import minecraft.class05181;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06273;
import minecraft.class06657;
import minecraft.class06859;
import minecraft.class06884;
import minecraft.class07001;
import minecraft.class07127;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07321;
import minecraft.class07746;
import minecraft.class08075;
import minecraft.class08088;
import minecraft.class08092;

public class class05175
extends class04894 {
    public static final int N = 12;
    public static final int y = 15;
    private boolean M;
    private boolean B;
    private boolean Z;
    private boolean z;
    private static final class05181 U = new class05181();

    public class05175(class06069 class060692, int n, int n2) {
        super(class04878.J, n, 64, n2, 12, 10, 15, class05175.y((class06069)class060692));
    }

    public class05175(class07001 class070012) {
        super(class04878.J, class070012);
        this.M = class070012.y("placedMainChest", false);
        this.B = class070012.y("placedHiddenChest", false);
        this.Z = class070012.y("placedTrap1", false);
        this.z = class070012.y("placedTrap2", false);
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        int n;
        int n2;
        if (!this.N((class07284)class059742, class051632, 0)) {
            return;
        }
        this.N(class059742, class051632, 0, -4, 0, this.L - 1, 0, this.i - 1, false, class060692, U);
        this.N(class059742, class051632, 2, 1, 2, 9, 2, 2, false, class060692, U);
        this.N(class059742, class051632, 2, 1, 12, 9, 2, 12, false, class060692, U);
        this.N(class059742, class051632, 2, 1, 3, 2, 2, 11, false, class060692, U);
        this.N(class059742, class051632, 9, 1, 3, 9, 2, 11, false, class060692, U);
        this.N(class059742, class051632, 1, 3, 1, 10, 6, 1, false, class060692, U);
        this.N(class059742, class051632, 1, 3, 13, 10, 6, 13, false, class060692, U);
        this.N(class059742, class051632, 1, 3, 2, 1, 6, 12, false, class060692, U);
        this.N(class059742, class051632, 10, 3, 2, 10, 6, 12, false, class060692, U);
        this.N(class059742, class051632, 2, 3, 2, 9, 3, 12, false, class060692, U);
        this.N(class059742, class051632, 2, 6, 2, 9, 6, 12, false, class060692, U);
        this.N(class059742, class051632, 3, 7, 3, 8, 7, 11, false, class060692, U);
        this.N(class059742, class051632, 4, 8, 4, 7, 8, 10, false, class060692, U);
        this.y(class059742, class051632, 3, 1, 3, 8, 2, 11);
        this.y(class059742, class051632, 4, 3, 6, 7, 3, 9);
        this.y(class059742, class051632, 2, 4, 2, 9, 5, 12);
        this.y(class059742, class051632, 4, 6, 5, 7, 6, 9);
        this.y(class059742, class051632, 5, 7, 6, 6, 7, 8);
        this.y(class059742, class051632, 5, 1, 2, 6, 2, 2);
        this.y(class059742, class051632, 5, 2, 12, 6, 2, 12);
        this.y(class059742, class051632, 5, 5, 1, 6, 5, 1);
        this.y(class059742, class051632, 5, 5, 13, 6, 5, 13);
        this.L(class059742, class00869.N.W(), 1, 5, 5, class051632);
        this.L(class059742, class00869.N.W(), 10, 5, 5, class051632);
        this.L(class059742, class00869.N.W(), 1, 5, 9, class051632);
        this.L(class059742, class00869.N.W(), 10, 5, 9, class051632);
        for (n2 = 0; n2 <= 14; n2 += 14) {
            this.N(class059742, class051632, 2, 4, n2, 2, 5, n2, false, class060692, U);
            this.N(class059742, class051632, 4, 4, n2, 4, 5, n2, false, class060692, U);
            this.N(class059742, class051632, 7, 4, n2, 7, 5, n2, false, class060692, U);
            this.N(class059742, class051632, 9, 4, n2, 9, 5, n2, false, class060692, U);
        }
        this.N(class059742, class051632, 5, 6, 0, 6, 6, 0, false, class060692, U);
        for (n2 = 0; n2 <= 11; n2 += 11) {
            for (int i = 2; i <= 12; i += 2) {
                this.N(class059742, class051632, n2, 4, i, n2, 5, i, false, class060692, U);
            }
            this.N(class059742, class051632, n2, 6, 5, n2, 6, 5, false, class060692, U);
            this.N(class059742, class051632, n2, 6, 9, n2, 6, 9, false, class060692, U);
        }
        this.N(class059742, class051632, 2, 7, 2, 2, 9, 2, false, class060692, U);
        this.N(class059742, class051632, 9, 7, 2, 9, 9, 2, false, class060692, U);
        this.N(class059742, class051632, 2, 7, 12, 2, 9, 12, false, class060692, U);
        this.N(class059742, class051632, 9, 7, 12, 9, 9, 12, false, class060692, U);
        this.N(class059742, class051632, 4, 9, 4, 4, 9, 4, false, class060692, U);
        this.N(class059742, class051632, 7, 9, 4, 7, 9, 4, false, class060692, U);
        this.N(class059742, class051632, 4, 9, 10, 4, 9, 10, false, class060692, U);
        this.N(class059742, class051632, 7, 9, 10, 7, 9, 10, false, class060692, U);
        this.N(class059742, class051632, 5, 9, 7, 6, 9, 7, false, class060692, U);
        class00500 class005002 = (class00500)class00869.uP.W().y((class08092)class07746.y, (Comparable)class07211.field_11034);
        class00500 class005003 = (class00500)class00869.uP.W().y((class08092)class07746.y, (Comparable)class07211.field_11039);
        class00500 class005004 = (class00500)class00869.uP.W().y((class08092)class07746.y, (Comparable)class07211.field_11035);
        class00500 class005005 = (class00500)class00869.uP.W().y((class08092)class07746.y, (Comparable)class07211.field_11043);
        this.L(class059742, class005005, 5, 9, 6, class051632);
        this.L(class059742, class005005, 6, 9, 6, class051632);
        this.L(class059742, class005004, 5, 9, 8, class051632);
        this.L(class059742, class005004, 6, 9, 8, class051632);
        this.L(class059742, class005005, 4, 0, 0, class051632);
        this.L(class059742, class005005, 5, 0, 0, class051632);
        this.L(class059742, class005005, 6, 0, 0, class051632);
        this.L(class059742, class005005, 7, 0, 0, class051632);
        this.L(class059742, class005005, 4, 1, 8, class051632);
        this.L(class059742, class005005, 4, 2, 9, class051632);
        this.L(class059742, class005005, 4, 3, 10, class051632);
        this.L(class059742, class005005, 7, 1, 8, class051632);
        this.L(class059742, class005005, 7, 2, 9, class051632);
        this.L(class059742, class005005, 7, 3, 10, class051632);
        this.N(class059742, class051632, 4, 1, 9, 4, 1, 9, false, class060692, U);
        this.N(class059742, class051632, 7, 1, 9, 7, 1, 9, false, class060692, U);
        this.N(class059742, class051632, 4, 1, 10, 7, 2, 10, false, class060692, U);
        this.N(class059742, class051632, 5, 4, 5, 6, 4, 5, false, class060692, U);
        this.L(class059742, class005002, 4, 4, 5, class051632);
        this.L(class059742, class005003, 7, 4, 5, class051632);
        for (n = 0; n < 4; ++n) {
            this.L(class059742, class005004, 5, 0 - n, 6 + n, class051632);
            this.L(class059742, class005004, 6, 0 - n, 6 + n, class051632);
            this.y(class059742, class051632, 5, 0 - n, 7 + n, 6, 0 - n, 9 + n);
        }
        this.y(class059742, class051632, 1, -3, 12, 10, -1, 13);
        this.y(class059742, class051632, 1, -3, 1, 3, -1, 13);
        this.y(class059742, class051632, 1, -3, 1, 9, -1, 5);
        for (n = 1; n <= 13; n += 2) {
            this.N(class059742, class051632, 1, -3, n, 1, -2, n, false, class060692, U);
        }
        for (n = 2; n <= 12; n += 2) {
            this.N(class059742, class051632, 1, -1, n, 3, -1, n, false, class060692, U);
        }
        this.N(class059742, class051632, 2, -2, 1, 5, -2, 1, false, class060692, U);
        this.N(class059742, class051632, 7, -2, 1, 9, -2, 1, false, class060692, U);
        this.N(class059742, class051632, 6, -3, 1, 6, -3, 1, false, class060692, U);
        this.N(class059742, class051632, 6, -1, 1, 6, -1, 1, false, class060692, U);
        this.L(class059742, (class00500)((class00500)class00869.MG.W().y((class08092)class00637.y, (Comparable)class07211.field_11034)).y((class08092)class00637.u, (Comparable)Boolean.valueOf(true)), 1, -3, 8, class051632);
        this.L(class059742, (class00500)((class00500)class00869.MG.W().y((class08092)class00637.y, (Comparable)class07211.field_11039)).y((class08092)class00637.u, (Comparable)Boolean.valueOf(true)), 4, -3, 8, class051632);
        this.L(class059742, (class00500)((class00500)((class00500)class00869.Ml.W().y((class08092)class00664.R, (Comparable)Boolean.valueOf(true))).y((class08092)class00664.B, (Comparable)Boolean.valueOf(true))).y((class08092)class00664.L, (Comparable)Boolean.valueOf(true)), 2, -3, 8, class051632);
        this.L(class059742, (class00500)((class00500)((class00500)class00869.Ml.W().y((class08092)class00664.R, (Comparable)Boolean.valueOf(true))).y((class08092)class00664.B, (Comparable)Boolean.valueOf(true))).y((class08092)class00664.L, (Comparable)Boolean.valueOf(true)), 3, -3, 8, class051632);
        class00500 class005006 = (class00500)((class00500)class00869.Lf.W().y((class08092)class06884.y, (Comparable)class08075.field_12689)).y((class08092)class06884.u, (Comparable)class08075.field_12689);
        this.L(class059742, class005006, 5, -3, 7, class051632);
        this.L(class059742, class005006, 5, -3, 6, class051632);
        this.L(class059742, class005006, 5, -3, 5, class051632);
        this.L(class059742, class005006, 5, -3, 4, class051632);
        this.L(class059742, class005006, 5, -3, 3, class051632);
        this.L(class059742, class005006, 5, -3, 2, class051632);
        this.L(class059742, (class00500)((class00500)class00869.Lf.W().y((class08092)class06884.y, (Comparable)class08075.field_12689)).y((class08092)class06884.i, (Comparable)class08075.field_12689), 5, -3, 1, class051632);
        this.L(class059742, (class00500)((class00500)class00869.Lf.W().y((class08092)class06884.L, (Comparable)class08075.field_12689)).y((class08092)class06884.i, (Comparable)class08075.field_12689), 4, -3, 1, class051632);
        this.L(class059742, class00869.LK.W(), 3, -3, 1, class051632);
        if (!this.Z) {
            this.Z = this.N(class059742, class051632, class060692, 3, -2, 1, class07211.field_11043, class06273.k);
        }
        this.L(class059742, (class00500)class00869.Rc.W().y((class08092)class00659.i, (Comparable)Boolean.valueOf(true)), 3, -2, 2, class051632);
        this.L(class059742, (class00500)((class00500)class00869.MG.W().y((class08092)class00637.y, (Comparable)class07211.field_11043)).y((class08092)class00637.u, (Comparable)Boolean.valueOf(true)), 7, -3, 1, class051632);
        this.L(class059742, (class00500)((class00500)class00869.MG.W().y((class08092)class00637.y, (Comparable)class07211.field_11035)).y((class08092)class00637.u, (Comparable)Boolean.valueOf(true)), 7, -3, 5, class051632);
        this.L(class059742, (class00500)((class00500)((class00500)class00869.Ml.W().y((class08092)class00664.i, (Comparable)Boolean.valueOf(true))).y((class08092)class00664.M, (Comparable)Boolean.valueOf(true))).y((class08092)class00664.L, (Comparable)Boolean.valueOf(true)), 7, -3, 2, class051632);
        this.L(class059742, (class00500)((class00500)((class00500)class00869.Ml.W().y((class08092)class00664.i, (Comparable)Boolean.valueOf(true))).y((class08092)class00664.M, (Comparable)Boolean.valueOf(true))).y((class08092)class00664.L, (Comparable)Boolean.valueOf(true)), 7, -3, 3, class051632);
        this.L(class059742, (class00500)((class00500)((class00500)class00869.Ml.W().y((class08092)class00664.i, (Comparable)Boolean.valueOf(true))).y((class08092)class00664.M, (Comparable)Boolean.valueOf(true))).y((class08092)class00664.L, (Comparable)Boolean.valueOf(true)), 7, -3, 4, class051632);
        this.L(class059742, (class00500)((class00500)class00869.Lf.W().y((class08092)class06884.L, (Comparable)class08075.field_12689)).y((class08092)class06884.i, (Comparable)class08075.field_12689), 8, -3, 6, class051632);
        this.L(class059742, (class00500)((class00500)class00869.Lf.W().y((class08092)class06884.i, (Comparable)class08075.field_12689)).y((class08092)class06884.u, (Comparable)class08075.field_12689), 9, -3, 6, class051632);
        this.L(class059742, (class00500)((class00500)class00869.Lf.W().y((class08092)class06884.y, (Comparable)class08075.field_12689)).y((class08092)class06884.u, (Comparable)class08075.field_12686), 9, -3, 5, class051632);
        this.L(class059742, class00869.LK.W(), 9, -3, 4, class051632);
        this.L(class059742, class005006, 9, -2, 4, class051632);
        if (!this.z) {
            this.z = this.N(class059742, class051632, class060692, 9, -2, 3, class07211.field_11039, class06273.k);
        }
        this.L(class059742, (class00500)class00869.Rc.W().y((class08092)class00659.u, (Comparable)Boolean.valueOf(true)), 8, -1, 3, class051632);
        this.L(class059742, (class00500)class00869.Rc.W().y((class08092)class00659.u, (Comparable)Boolean.valueOf(true)), 8, -2, 3, class051632);
        if (!this.M) {
            this.M = this.N(class059742, class051632, class060692, 8, -3, 3, class06273.w);
        }
        this.L(class059742, class00869.LK.W(), 9, -3, 2, class051632);
        this.L(class059742, class00869.LK.W(), 8, -3, 1, class051632);
        this.L(class059742, class00869.LK.W(), 4, -3, 5, class051632);
        this.L(class059742, class00869.LK.W(), 5, -2, 5, class051632);
        this.L(class059742, class00869.LK.W(), 5, -1, 5, class051632);
        this.L(class059742, class00869.LK.W(), 6, -3, 5, class051632);
        this.L(class059742, class00869.LK.W(), 7, -2, 5, class051632);
        this.L(class059742, class00869.LK.W(), 7, -1, 5, class051632);
        this.L(class059742, class00869.LK.W(), 8, -3, 5, class051632);
        this.N(class059742, class051632, 9, -1, 1, 9, -1, 5, false, class060692, U);
        this.y(class059742, class051632, 8, -3, 8, 10, -1, 10);
        this.L(class059742, class00869.RT.W(), 8, -2, 11, class051632);
        this.L(class059742, class00869.RT.W(), 9, -2, 11, class051632);
        this.L(class059742, class00869.RT.W(), 10, -2, 11, class051632);
        class00500 class005007 = (class00500)((class00500)class00869.uD.W().y((class08092)class07127.R, (Comparable)class07211.field_11043)).y((class08092)class07127.L, (Comparable)class06657.field_12471);
        this.L(class059742, class005007, 8, -2, 12, class051632);
        this.L(class059742, class005007, 9, -2, 12, class051632);
        this.L(class059742, class005007, 10, -2, 12, class051632);
        this.N(class059742, class051632, 8, -3, 8, 8, -3, 10, false, class060692, U);
        this.N(class059742, class051632, 10, -3, 8, 10, -3, 10, false, class060692, U);
        this.L(class059742, class00869.LK.W(), 10, -2, 9, class051632);
        this.L(class059742, class005006, 8, -2, 9, class051632);
        this.L(class059742, class005006, 8, -2, 10, class051632);
        this.L(class059742, (class00500)((class00500)((class00500)((class00500)class00869.Lf.W().y((class08092)class06884.y, (Comparable)class08075.field_12689)).y((class08092)class06884.u, (Comparable)class08075.field_12689)).y((class08092)class06884.L, (Comparable)class08075.field_12689)).y((class08092)class06884.i, (Comparable)class08075.field_12689), 10, -1, 9, class051632);
        this.L(class059742, (class00500)class00869.yd.W().y((class08092)class00513.y, (Comparable)class07211.field_11036), 9, -2, 8, class051632);
        this.L(class059742, (class00500)class00869.yd.W().y((class08092)class00513.y, (Comparable)class07211.field_11039), 10, -2, 8, class051632);
        this.L(class059742, (class00500)class00869.yd.W().y((class08092)class00513.y, (Comparable)class07211.field_11039), 10, -1, 8, class051632);
        this.L(class059742, (class00500)class00869.iH.W().y((class08092)class06859.R, (Comparable)class07211.field_11043), 10, -2, 10, class051632);
        if (!this.B) {
            this.B = this.N(class059742, class051632, class060692, 9, -3, 10, class06273.w);
        }
    }

    protected void N(class03298 class032982, class07001 class070012) {
        super.N(class032982, class070012);
        class070012.N("placedMainChest", this.M);
        class070012.N("placedHiddenChest", this.B);
        class070012.N("placedTrap1", this.Z);
        class070012.N("placedTrap2", this.z);
    }
}

