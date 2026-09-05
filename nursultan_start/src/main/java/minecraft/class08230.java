/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 *  minecraft.class01383
 *  minecraft.class03345
 *  minecraft.class04995
 *  minecraft.class05163
 *  minecraft.class07209
 */
package minecraft;

import minecraft.class01296;
import minecraft.class01383;
import minecraft.class03345;
import minecraft.class04995;
import minecraft.class05163;
import minecraft.class07209;
import minecraft.class08202;
import minecraft.class08239;

public class class08230 {
    private final class08202 y;
    final class07209 N;

    public class08230(class01296 class012962, int n, int n2, int n3) {
        int n4 = class04995.L((int)(n * 2 + 1));
        int n5 = n * 16;
        class07209 class072092 = class012962.z();
        this.N = class012962.U();
        int n6 = class072092.method_10263() - n5;
        int n7 = n6 + n4 * 16 - 1;
        int n8 = n4 >= n2 ? n3 : class072092.method_10264() - n5;
        int n9 = n8 + n4 * 16 - 1;
        int n10 = class072092.method_10260() - n5;
        int n11 = n10 + n4 * 16 - 1;
        this.y = new class08202(this, new class05163(n6, n8, n10, n7, n9, n11));
    }

    boolean N(double d, double d2, double d3, double d4, double d5, double d6, int n) {
        int n2 = this.N.method_10263();
        int n3 = this.N.method_10264();
        int n4 = this.N.method_10260();
        return (double)n2 > d - (double)n && (double)n2 < d4 + (double)n && (double)n3 > d2 - (double)n && (double)n3 < d5 + (double)n && (double)n4 > d3 - (double)n && (double)n4 < d6 + (double)n;
    }

    public void N(class08239 class082392, class01383 class013832, int n) {
        this.y.N(class082392, false, class013832, 0, n, true);
    }

    public boolean N(class03345 class033452) {
        return this.y.N(class033452);
    }
}

