/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00554
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01198
 *  minecraft.class01296
 *  minecraft.class04552
 *  minecraft.class04995
 *  minecraft.class05015
 *  minecraft.class05474
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class08050
 */
package minecraft;

import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00554;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01198;
import minecraft.class01296;
import minecraft.class04552;
import minecraft.class04995;
import minecraft.class05015;
import minecraft.class05474;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class08050;

public class class03480 {
    private static final int y = 16;
    public static final int N = Integer.MIN_VALUE;
    private final int L;
    private final class04552 u;
    private final class07218 i = new class07218();
    private final class07218 R = new class07218();

    private static int L(int n, int n2) {
        return n + n2 * 16;
    }

    private int L(int n) {
        if (n == this.L) {
            return Integer.MIN_VALUE;
        }
        return n;
    }

    public class03480(class05474 class054742) {
        this.L = class054742.method_31607() - 1;
        int n = class04995.R((int)(class054742.method_31600() + 1 - this.L + 1));
        this.u = new class01198(n, 256);
    }

    private int y(int n) {
        return this.u.N(n) + this.L;
    }

    private void y(int n, int n2) {
        this.u.y(n, n2 - this.L);
    }

    public int N() {
        int n = Integer.MIN_VALUE;
        for (int i = 0; i < this.u.y(); ++i) {
            int n2 = this.u.N(i);
            if (n2 <= n) continue;
            n = n2;
        }
        return this.L(n + this.L);
    }

    private void N(int n) {
        int n2 = n - this.L;
        for (int i = 0; i < this.u.y(); ++i) {
            this.u.y(i, n2);
        }
    }

    public int N(int n, int n2) {
        int n3 = this.y(class03480.L(n, n2));
        return this.L(n3);
    }

    public void N(class08050 class080502) {
        int n = class080502.N();
        if (n == -1) {
            this.N(this.L);
            return;
        }
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                int n2 = Math.max(this.N(class080502, n, j, i), this.L);
                this.y(class03480.L(j, i), n2);
            }
        }
    }

    public boolean N(class07290 class072902, int n, int n2, int n3) {
        class00500 class005002;
        class07218 class072182;
        class00500 class005003;
        int n4 = n2 + 1;
        int n5 = class03480.L(n, n3);
        int n6 = this.y(n5);
        if (n4 < n6) {
            return false;
        }
        class07218 class072183 = this.i.N(n, n2 + 1, n3);
        if (this.N(class072902, n5, n6, (class07209)class072183, class005003 = class072902.method_8320((class07209)class072183), (class07209)(class072182 = this.R.N(n, n2, n3)), class005002 = class072902.method_8320((class07209)class072182))) {
            return true;
        }
        class07218 class072184 = this.i.N(n, n2 - 1, n3);
        class00500 class005004 = class072902.method_8320((class07209)class072184);
        return this.N(class072902, n5, n6, (class07209)class072182, class005002, (class07209)class072184, class005004);
    }

    private boolean N(class07290 class072902, int n, int n2, class07209 class072092, class00500 class005002, class07209 class072093, class00500 class005003) {
        int n3 = class072092.method_10264();
        if (class03480.N(class005002, class005003)) {
            if (n3 > n2) {
                this.y(n, n3);
                return true;
            }
        } else if (n3 == n2) {
            this.y(n, this.N(class072902, class072093, class005003));
            return true;
        }
        return false;
    }

    private int N(class07290 class072902, class07209 class072092, class00500 class005002) {
        class07218 class072182 = this.i.N((class00753)class072092);
        class07218 class072183 = this.R.N((class00753)class072092, class07211.field_11033);
        class00500 class005003 = class005002;
        while (class072183.method_10264() >= this.L) {
            class00500 class005004 = class072902.method_8320((class07209)class072183);
            if (class03480.N(class005003, class005004)) {
                return class072182.method_10264();
            }
            class005003 = class005004;
            class072182.N((class00753)class072183);
            class072183.N(class07211.field_11033);
        }
        return this.L;
    }

    private static boolean N(class00500 class005002, class00500 class005003) {
        if (class005003.z() != 0) {
            return true;
        }
        class00494 class004942 = class05015.N((class00500)class005002, (class07211)class07211.field_11033);
        class00494 class004943 = class05015.N((class00500)class005003, (class07211)class07211.field_11036);
        return class00389.y((class00494)class004942, (class00494)class004943);
    }

    private int N(class08050 class080502, int n, int n2, int n3) {
        int n4 = class01296.L((int)(class080502.method_31604(n) + 1));
        class07218 class072182 = this.i.N(n2, n4, n3);
        class07218 class072183 = this.R.N((class00753)class072182, class07211.field_11033);
        class00500 class005002 = class00869.N.W();
        for (int i = n; i >= 0; --i) {
            int n5;
            class00554 class005542 = class080502.y(i);
            if (class005542.L()) {
                class005002 = class00869.N.W();
                n5 = class080502.method_31604(i);
                class072182.method_10099(class01296.L((int)n5));
                class072183.method_10099(class072182.method_10264() - 1);
                continue;
            }
            for (n5 = 15; n5 >= 0; --n5) {
                class00500 class005003 = class005542.N(n2, n5, n3);
                if (class03480.N(class005002, class005003)) {
                    return class072182.method_10264();
                }
                class005002 = class005003;
                class072182.N((class00753)class072183);
                class072183.N(class07211.field_11033);
            }
        }
        return this.L;
    }
}

