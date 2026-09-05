/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class03298
 *  minecraft.class04878
 *  minecraft.class04894
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06273
 *  minecraft.class06993
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07221
 *  minecraft.class07284
 *  minecraft.class07321
 *  minecraft.class07746
 *  minecraft.class08088
 *  minecraft.class08092
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class03298;
import minecraft.class04878;
import minecraft.class04894;
import minecraft.class05163;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06273;
import minecraft.class06993;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07221;
import minecraft.class07284;
import minecraft.class07321;
import minecraft.class07746;
import minecraft.class08088;
import minecraft.class08092;

public class class05171
extends class04894 {
    public static final int N = 21;
    public static final int y = 21;
    private final boolean[] M = new boolean[4];
    private final List<class07209> B = new ArrayList<class07209>();
    private class07209 Z = class07209.field_10980;

    public class05171(class06069 class060692, int n, int n2) {
        super(class04878.e, n, 64, n2, 21, 15, 21, class05171.y((class06069)class060692));
    }

    public class05171(class07001 class070012) {
        super(class04878.e, class070012);
        this.M[0] = class070012.y("hasPlacedChest0", false);
        this.M[1] = class070012.y("hasPlacedChest1", false);
        this.M[2] = class070012.y("hasPlacedChest2", false);
        this.M[3] = class070012.y("hasPlacedChest3", false);
    }

    private void y(int n, int n2, int n3) {
        class07218 class072182 = this.L(n, n2, n3);
        this.B.add((class07209)class072182);
    }

    private void y(class07209 class072092, class05974 class059742, class05163 class051632) {
        int n = class072092.method_10263();
        int n2 = class072092.method_10264();
        int n3 = class072092.method_10260();
        class00500 class005002 = class00869.yi.W();
        class00500 class005003 = class00869.yu.W();
        this.N(class059742, class051632, n - 3, n2 + 1, n3 - 3, n - 3, n2 + 1, n3 + 2, class005002, class005002, true);
        this.N(class059742, class051632, n + 3, n2 + 1, n3 - 3, n + 3, n2 + 1, n3 + 2, class005002, class005002, true);
        this.N(class059742, class051632, n - 3, n2 + 1, n3 - 3, n + 3, n2 + 1, n3 - 2, class005002, class005002, true);
        this.N(class059742, class051632, n - 3, n2 + 1, n3 + 3, n + 3, n2 + 1, n3 + 3, class005002, class005002, true);
        this.N(class059742, class051632, n - 3, n2 + 2, n3 - 3, n - 3, n2 + 2, n3 + 2, class005003, class005003, true);
        this.N(class059742, class051632, n + 3, n2 + 2, n3 - 3, n + 3, n2 + 2, n3 + 2, class005003, class005003, true);
        this.N(class059742, class051632, n - 3, n2 + 2, n3 - 3, n + 3, n2 + 2, n3 - 2, class005003, class005003, true);
        this.N(class059742, class051632, n - 3, n2 + 2, n3 + 3, n + 3, n2 + 2, n3 + 3, class005003, class005003, true);
        this.N(class059742, class051632, n - 3, -1, n3 - 3, n - 3, -1, n3 + 2, class005002, class005002, true);
        this.N(class059742, class051632, n + 3, -1, n3 - 3, n + 3, -1, n3 + 2, class005002, class005002, true);
        this.N(class059742, class051632, n - 3, -1, n3 - 3, n + 3, -1, n3 - 2, class005002, class005002, true);
        this.N(class059742, class051632, n - 3, -1, n3 + 3, n + 3, -1, n3 + 3, class005002, class005002, true);
        this.N(n - 2, n2 + 1, n3 - 2, n + 2, n2 + 3, n3 + 2);
        this.N(class059742, class051632, n - 2, n2 + 4, n3 - 2, n + 2, n3 + 2);
        class00500 class005004 = class00869.Zy.W();
        class00500 class005005 = class00869.ZE.W();
        this.L(class059742, class005005, n, n2, n3, class051632);
        this.L(class059742, class005004, n + 1, n2, n3 - 1, class051632);
        this.L(class059742, class005004, n + 1, n2, n3 + 1, class051632);
        this.L(class059742, class005004, n - 1, n2, n3 - 1, class051632);
        this.L(class059742, class005004, n - 1, n2, n3 + 1, class051632);
        this.L(class059742, class005004, n + 2, n2, n3, class051632);
        this.L(class059742, class005004, n - 2, n2, n3, class051632);
        this.L(class059742, class005004, n, n2, n3 + 2, class051632);
        this.L(class059742, class005004, n, n2, n3 - 2, class051632);
        this.L(class059742, class005004, n + 3, n2, n3, class051632);
        this.y(n + 3, n2 + 1, n3);
        this.y(n + 3, n2 + 2, n3);
        this.L(class059742, class005002, n + 4, n2 + 1, n3, class051632);
        this.L(class059742, class005003, n + 4, n2 + 2, n3, class051632);
        this.L(class059742, class005004, n - 3, n2, n3, class051632);
        this.y(n - 3, n2 + 1, n3);
        this.y(n - 3, n2 + 2, n3);
        this.L(class059742, class005002, n - 4, n2 + 1, n3, class051632);
        this.L(class059742, class005003, n - 4, n2 + 2, n3, class051632);
        this.L(class059742, class005004, n, n2, n3 + 3, class051632);
        this.y(n, n2 + 1, n3 + 3);
        this.y(n, n2 + 2, n3 + 3);
        this.L(class059742, class005004, n, n2, n3 - 3, class051632);
        this.y(n, n2 + 1, n3 - 3);
        this.y(n, n2 + 2, n3 - 3);
        this.L(class059742, class005002, n, n2 + 1, n3 - 4, class051632);
        this.L(class059742, class005003, n, -2, n3 - 4, class051632);
    }

    public class07209 y() {
        return this.Z;
    }

    private void N(class05974 class059742, int n, int n2, int n3, class05163 class051632) {
        if (class059742.method_8409().z() < 0.33f) {
            class00500 class005002 = class00869.yL.W();
            this.L(class059742, class005002, n, n2, n3, class051632);
        } else {
            class00500 class005003 = class00869.e.W();
            this.L(class059742, class005003, n, n2, n3, class051632);
        }
    }

    private void N(class05974 class059742, class05163 class051632, int n, int n2, int n3, int n4, int n5) {
        int n6;
        for (int i = n; i <= n4; ++i) {
            for (n6 = n3; n6 <= n5; ++n6) {
                this.N(class059742, i, n2, n6, class051632);
            }
        }
        class06069 class060692 = class06069.y((long)class059742.method_8412()).L().N((class07209)this.L(n, n2, n3));
        n6 = class060692.N(n, n4);
        int n7 = class060692.N(n3, n5);
        this.Z = new class07209(this.N(n6, n7), this.L(n2), this.y(n6, n7));
    }

    public List<class07209> N() {
        return this.B;
    }

    protected void N(class03298 class032982, class07001 class070012) {
        super.N(class032982, class070012);
        class070012.N("hasPlacedChest0", this.M[0]);
        class070012.N("hasPlacedChest1", this.M[1]);
        class070012.N("hasPlacedChest2", this.M[2]);
        class070012.N("hasPlacedChest3", this.M[3]);
    }

    private void N(class07209 class072092, class05974 class059742, class05163 class051632) {
        int n = class072092.method_10263();
        int n2 = class072092.method_10264();
        int n3 = class072092.method_10260();
        class00500 class005002 = class00869.Mj.W();
        this.L(class059742, class005002.N(class06993.field_11465), 13, -1, 17, class051632);
        this.L(class059742, class005002.N(class06993.field_11465), 14, -2, 17, class051632);
        this.L(class059742, class005002.N(class06993.field_11465), 15, -3, 17, class051632);
        class00500 class005003 = class00869.e.W();
        class00500 class005004 = class00869.yL.W();
        boolean bl = class059742.method_8409().Z();
        this.L(class059742, class005003, n - 4, n2 + 4, n3 + 4, class051632);
        this.L(class059742, class005003, n - 3, n2 + 4, n3 + 4, class051632);
        this.L(class059742, class005003, n - 2, n2 + 4, n3 + 4, class051632);
        this.L(class059742, class005003, n - 1, n2 + 4, n3 + 4, class051632);
        this.L(class059742, class005003, n, n2 + 4, n3 + 4, class051632);
        this.L(class059742, class005003, n - 2, n2 + 3, n3 + 4, class051632);
        this.L(class059742, bl ? class005003 : class005004, n - 1, n2 + 3, n3 + 4, class051632);
        this.L(class059742, !bl ? class005003 : class005004, n, n2 + 3, n3 + 4, class051632);
        this.L(class059742, class005003, n - 1, n2 + 2, n3 + 4, class051632);
        this.L(class059742, class005004, n, n2 + 2, n3 + 4, class051632);
        this.L(class059742, class005003, n, n2 + 1, n3 + 4, class051632);
    }

    private void N(class05974 class059742, class05163 class051632) {
        class07209 class072092 = new class07209(16, -4, 13);
        this.N(class072092, class059742, class051632);
        this.y(class072092, class059742, class051632);
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        int n;
        int n2;
        if (!this.N((class07284)class059742, -class060692.y(3))) {
            return;
        }
        this.N(class059742, class051632, 0, -4, 0, this.L - 1, 0, this.i - 1, class00869.yL.W(), class00869.yL.W(), false);
        for (n2 = 1; n2 <= 9; ++n2) {
            this.N(class059742, class051632, n2, n2, n2, this.L - 1 - n2, n2, this.i - 1 - n2, class00869.yL.W(), class00869.yL.W(), false);
            this.N(class059742, class051632, n2 + 1, n2, n2 + 1, this.L - 2 - n2, n2, this.i - 2 - n2, class00869.N.W(), class00869.N.W(), false);
        }
        for (n2 = 0; n2 < this.L; ++n2) {
            for (int i = 0; i < this.i; ++i) {
                int n3 = -5;
                this.N(class059742, class00869.yL.W(), n2, -5, i, class051632);
            }
        }
        class00500 class005002 = (class00500)class00869.Mj.W().y((class08092)class07746.y, (Comparable)class07211.field_11043);
        class00500 class005003 = (class00500)class00869.Mj.W().y((class08092)class07746.y, (Comparable)class07211.field_11035);
        class00500 class005004 = (class00500)class00869.Mj.W().y((class08092)class07746.y, (Comparable)class07211.field_11034);
        class00500 class005005 = (class00500)class00869.Mj.W().y((class08092)class07746.y, (Comparable)class07211.field_11039);
        this.N(class059742, class051632, 0, 0, 0, 4, 9, 4, class00869.yL.W(), class00869.N.W(), false);
        this.N(class059742, class051632, 1, 10, 1, 3, 10, 3, class00869.yL.W(), class00869.yL.W(), false);
        this.L(class059742, class005002, 2, 10, 0, class051632);
        this.L(class059742, class005003, 2, 10, 4, class051632);
        this.L(class059742, class005004, 0, 10, 2, class051632);
        this.L(class059742, class005005, 4, 10, 2, class051632);
        this.N(class059742, class051632, this.L - 5, 0, 0, this.L - 1, 9, 4, class00869.yL.W(), class00869.N.W(), false);
        this.N(class059742, class051632, this.L - 4, 10, 1, this.L - 2, 10, 3, class00869.yL.W(), class00869.yL.W(), false);
        this.L(class059742, class005002, this.L - 3, 10, 0, class051632);
        this.L(class059742, class005003, this.L - 3, 10, 4, class051632);
        this.L(class059742, class005004, this.L - 5, 10, 2, class051632);
        this.L(class059742, class005005, this.L - 1, 10, 2, class051632);
        this.N(class059742, class051632, 8, 0, 0, 12, 4, 4, class00869.yL.W(), class00869.N.W(), false);
        this.N(class059742, class051632, 9, 1, 0, 11, 3, 4, class00869.N.W(), class00869.N.W(), false);
        this.L(class059742, class00869.yi.W(), 9, 1, 1, class051632);
        this.L(class059742, class00869.yi.W(), 9, 2, 1, class051632);
        this.L(class059742, class00869.yi.W(), 9, 3, 1, class051632);
        this.L(class059742, class00869.yi.W(), 10, 3, 1, class051632);
        this.L(class059742, class00869.yi.W(), 11, 3, 1, class051632);
        this.L(class059742, class00869.yi.W(), 11, 2, 1, class051632);
        this.L(class059742, class00869.yi.W(), 11, 1, 1, class051632);
        this.N(class059742, class051632, 4, 1, 1, 8, 3, 3, class00869.yL.W(), class00869.N.W(), false);
        this.N(class059742, class051632, 4, 1, 2, 8, 2, 2, class00869.N.W(), class00869.N.W(), false);
        this.N(class059742, class051632, 12, 1, 1, 16, 3, 3, class00869.yL.W(), class00869.N.W(), false);
        this.N(class059742, class051632, 12, 1, 2, 16, 2, 2, class00869.N.W(), class00869.N.W(), false);
        this.N(class059742, class051632, 5, 4, 5, this.L - 6, 4, this.i - 6, class00869.yL.W(), class00869.yL.W(), false);
        this.N(class059742, class051632, 9, 4, 9, 11, 4, 11, class00869.N.W(), class00869.N.W(), false);
        this.N(class059742, class051632, 8, 1, 8, 8, 3, 8, class00869.yi.W(), class00869.yi.W(), false);
        this.N(class059742, class051632, 12, 1, 8, 12, 3, 8, class00869.yi.W(), class00869.yi.W(), false);
        this.N(class059742, class051632, 8, 1, 12, 8, 3, 12, class00869.yi.W(), class00869.yi.W(), false);
        this.N(class059742, class051632, 12, 1, 12, 12, 3, 12, class00869.yi.W(), class00869.yi.W(), false);
        this.N(class059742, class051632, 1, 1, 5, 4, 4, 11, class00869.yL.W(), class00869.yL.W(), false);
        this.N(class059742, class051632, this.L - 5, 1, 5, this.L - 2, 4, 11, class00869.yL.W(), class00869.yL.W(), false);
        this.N(class059742, class051632, 6, 7, 9, 6, 7, 11, class00869.yL.W(), class00869.yL.W(), false);
        this.N(class059742, class051632, this.L - 7, 7, 9, this.L - 7, 7, 11, class00869.yL.W(), class00869.yL.W(), false);
        this.N(class059742, class051632, 5, 5, 9, 5, 7, 11, class00869.yi.W(), class00869.yi.W(), false);
        this.N(class059742, class051632, this.L - 6, 5, 9, this.L - 6, 7, 11, class00869.yi.W(), class00869.yi.W(), false);
        this.L(class059742, class00869.N.W(), 5, 5, 10, class051632);
        this.L(class059742, class00869.N.W(), 5, 6, 10, class051632);
        this.L(class059742, class00869.N.W(), 6, 6, 10, class051632);
        this.L(class059742, class00869.N.W(), this.L - 6, 5, 10, class051632);
        this.L(class059742, class00869.N.W(), this.L - 6, 6, 10, class051632);
        this.L(class059742, class00869.N.W(), this.L - 7, 6, 10, class051632);
        this.N(class059742, class051632, 2, 4, 4, 2, 6, 4, class00869.N.W(), class00869.N.W(), false);
        this.N(class059742, class051632, this.L - 3, 4, 4, this.L - 3, 6, 4, class00869.N.W(), class00869.N.W(), false);
        this.L(class059742, class005002, 2, 4, 5, class051632);
        this.L(class059742, class005002, 2, 3, 4, class051632);
        this.L(class059742, class005002, this.L - 3, 4, 5, class051632);
        this.L(class059742, class005002, this.L - 3, 3, 4, class051632);
        this.N(class059742, class051632, 1, 1, 3, 2, 2, 3, class00869.yL.W(), class00869.yL.W(), false);
        this.N(class059742, class051632, this.L - 3, 1, 3, this.L - 2, 2, 3, class00869.yL.W(), class00869.yL.W(), false);
        this.L(class059742, class00869.yL.W(), 1, 1, 2, class051632);
        this.L(class059742, class00869.yL.W(), this.L - 2, 1, 2, class051632);
        this.L(class059742, class00869.Ud.W(), 1, 2, 2, class051632);
        this.L(class059742, class00869.Ud.W(), this.L - 2, 2, 2, class051632);
        this.L(class059742, class005005, 2, 1, 2, class051632);
        this.L(class059742, class005004, this.L - 3, 1, 2, class051632);
        this.N(class059742, class051632, 4, 3, 5, 4, 3, 17, class00869.yL.W(), class00869.yL.W(), false);
        this.N(class059742, class051632, this.L - 5, 3, 5, this.L - 5, 3, 17, class00869.yL.W(), class00869.yL.W(), false);
        this.N(class059742, class051632, 3, 1, 5, 4, 2, 16, class00869.N.W(), class00869.N.W(), false);
        this.N(class059742, class051632, this.L - 6, 1, 5, this.L - 5, 2, 16, class00869.N.W(), class00869.N.W(), false);
        for (n = 5; n <= 17; n += 2) {
            this.L(class059742, class00869.yi.W(), 4, 1, n, class051632);
            this.L(class059742, class00869.yu.W(), 4, 2, n, class051632);
            this.L(class059742, class00869.yi.W(), this.L - 5, 1, n, class051632);
            this.L(class059742, class00869.yu.W(), this.L - 5, 2, n, class051632);
        }
        this.L(class059742, class00869.Zy.W(), 10, 0, 7, class051632);
        this.L(class059742, class00869.Zy.W(), 10, 0, 8, class051632);
        this.L(class059742, class00869.Zy.W(), 9, 0, 9, class051632);
        this.L(class059742, class00869.Zy.W(), 11, 0, 9, class051632);
        this.L(class059742, class00869.Zy.W(), 8, 0, 10, class051632);
        this.L(class059742, class00869.Zy.W(), 12, 0, 10, class051632);
        this.L(class059742, class00869.Zy.W(), 7, 0, 10, class051632);
        this.L(class059742, class00869.Zy.W(), 13, 0, 10, class051632);
        this.L(class059742, class00869.Zy.W(), 9, 0, 11, class051632);
        this.L(class059742, class00869.Zy.W(), 11, 0, 11, class051632);
        this.L(class059742, class00869.Zy.W(), 10, 0, 12, class051632);
        this.L(class059742, class00869.Zy.W(), 10, 0, 13, class051632);
        this.L(class059742, class00869.ZE.W(), 10, 0, 10, class051632);
        for (n = 0; n <= this.L - 1; n += this.L - 1) {
            this.L(class059742, class00869.yi.W(), n, 2, 1, class051632);
            this.L(class059742, class00869.Zy.W(), n, 2, 2, class051632);
            this.L(class059742, class00869.yi.W(), n, 2, 3, class051632);
            this.L(class059742, class00869.yi.W(), n, 3, 1, class051632);
            this.L(class059742, class00869.Zy.W(), n, 3, 2, class051632);
            this.L(class059742, class00869.yi.W(), n, 3, 3, class051632);
            this.L(class059742, class00869.Zy.W(), n, 4, 1, class051632);
            this.L(class059742, class00869.yu.W(), n, 4, 2, class051632);
            this.L(class059742, class00869.Zy.W(), n, 4, 3, class051632);
            this.L(class059742, class00869.yi.W(), n, 5, 1, class051632);
            this.L(class059742, class00869.Zy.W(), n, 5, 2, class051632);
            this.L(class059742, class00869.yi.W(), n, 5, 3, class051632);
            this.L(class059742, class00869.Zy.W(), n, 6, 1, class051632);
            this.L(class059742, class00869.yu.W(), n, 6, 2, class051632);
            this.L(class059742, class00869.Zy.W(), n, 6, 3, class051632);
            this.L(class059742, class00869.Zy.W(), n, 7, 1, class051632);
            this.L(class059742, class00869.Zy.W(), n, 7, 2, class051632);
            this.L(class059742, class00869.Zy.W(), n, 7, 3, class051632);
            this.L(class059742, class00869.yi.W(), n, 8, 1, class051632);
            this.L(class059742, class00869.yi.W(), n, 8, 2, class051632);
            this.L(class059742, class00869.yi.W(), n, 8, 3, class051632);
        }
        for (n = 2; n <= this.L - 3; n += this.L - 3 - 2) {
            this.L(class059742, class00869.yi.W(), n - 1, 2, 0, class051632);
            this.L(class059742, class00869.Zy.W(), n, 2, 0, class051632);
            this.L(class059742, class00869.yi.W(), n + 1, 2, 0, class051632);
            this.L(class059742, class00869.yi.W(), n - 1, 3, 0, class051632);
            this.L(class059742, class00869.Zy.W(), n, 3, 0, class051632);
            this.L(class059742, class00869.yi.W(), n + 1, 3, 0, class051632);
            this.L(class059742, class00869.Zy.W(), n - 1, 4, 0, class051632);
            this.L(class059742, class00869.yu.W(), n, 4, 0, class051632);
            this.L(class059742, class00869.Zy.W(), n + 1, 4, 0, class051632);
            this.L(class059742, class00869.yi.W(), n - 1, 5, 0, class051632);
            this.L(class059742, class00869.Zy.W(), n, 5, 0, class051632);
            this.L(class059742, class00869.yi.W(), n + 1, 5, 0, class051632);
            this.L(class059742, class00869.Zy.W(), n - 1, 6, 0, class051632);
            this.L(class059742, class00869.yu.W(), n, 6, 0, class051632);
            this.L(class059742, class00869.Zy.W(), n + 1, 6, 0, class051632);
            this.L(class059742, class00869.Zy.W(), n - 1, 7, 0, class051632);
            this.L(class059742, class00869.Zy.W(), n, 7, 0, class051632);
            this.L(class059742, class00869.Zy.W(), n + 1, 7, 0, class051632);
            this.L(class059742, class00869.yi.W(), n - 1, 8, 0, class051632);
            this.L(class059742, class00869.yi.W(), n, 8, 0, class051632);
            this.L(class059742, class00869.yi.W(), n + 1, 8, 0, class051632);
        }
        this.N(class059742, class051632, 8, 4, 0, 12, 6, 0, class00869.yi.W(), class00869.yi.W(), false);
        this.L(class059742, class00869.N.W(), 8, 6, 0, class051632);
        this.L(class059742, class00869.N.W(), 12, 6, 0, class051632);
        this.L(class059742, class00869.Zy.W(), 9, 5, 0, class051632);
        this.L(class059742, class00869.yu.W(), 10, 5, 0, class051632);
        this.L(class059742, class00869.Zy.W(), 11, 5, 0, class051632);
        this.N(class059742, class051632, 8, -14, 8, 12, -11, 12, class00869.yi.W(), class00869.yi.W(), false);
        this.N(class059742, class051632, 8, -10, 8, 12, -10, 12, class00869.yu.W(), class00869.yu.W(), false);
        this.N(class059742, class051632, 8, -9, 8, 12, -9, 12, class00869.yi.W(), class00869.yi.W(), false);
        this.N(class059742, class051632, 8, -8, 8, 12, -1, 12, class00869.yL.W(), class00869.yL.W(), false);
        this.N(class059742, class051632, 9, -11, 9, 11, -1, 11, class00869.N.W(), class00869.N.W(), false);
        this.L(class059742, class00869.uh.W(), 10, -11, 10, class051632);
        this.N(class059742, class051632, 9, -13, 9, 11, -13, 11, class00869.Ln.W(), class00869.N.W(), false);
        this.L(class059742, class00869.N.W(), 8, -11, 10, class051632);
        this.L(class059742, class00869.N.W(), 8, -10, 10, class051632);
        this.L(class059742, class00869.yu.W(), 7, -10, 10, class051632);
        this.L(class059742, class00869.yi.W(), 7, -11, 10, class051632);
        this.L(class059742, class00869.N.W(), 12, -11, 10, class051632);
        this.L(class059742, class00869.N.W(), 12, -10, 10, class051632);
        this.L(class059742, class00869.yu.W(), 13, -10, 10, class051632);
        this.L(class059742, class00869.yi.W(), 13, -11, 10, class051632);
        this.L(class059742, class00869.N.W(), 10, -11, 8, class051632);
        this.L(class059742, class00869.N.W(), 10, -10, 8, class051632);
        this.L(class059742, class00869.yu.W(), 10, -10, 7, class051632);
        this.L(class059742, class00869.yi.W(), 10, -11, 7, class051632);
        this.L(class059742, class00869.N.W(), 10, -11, 12, class051632);
        this.L(class059742, class00869.N.W(), 10, -10, 12, class051632);
        this.L(class059742, class00869.yu.W(), 10, -10, 13, class051632);
        this.L(class059742, class00869.yi.W(), 10, -11, 13, class051632);
        for (class07211 class072112 : class07221.field_11062) {
            if (this.M[class072112.u()]) continue;
            int n4 = class072112.P() * 2;
            int n5 = class072112.T() * 2;
            this.M[class072112.u()] = this.N(class059742, class051632, class060692, 10 + n4, -11, 10 + n5, class06273.d);
        }
        this.N(class059742, class051632);
    }

    private void N(int n, int n2, int n3, int n4, int n5, int n6) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    this.y(j, i, k);
                }
            }
        }
    }
}

