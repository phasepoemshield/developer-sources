/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.Hashing
 *  minecraft.class00780
 *  minecraft.class01146
 *  minecraft.class03556
 *  minecraft.class04995
 *  minecraft.class07209
 */
package minecraft;

import com.google.common.hash.Hashing;
import minecraft.class00780;
import minecraft.class01146;
import minecraft.class03556;
import minecraft.class04995;
import minecraft.class05527;
import minecraft.class05533;
import minecraft.class07209;

public class class05517 {
    public static final int N = class01146.N((int)8);
    private static final int y = 2;
    private static final int L = 4;
    private static final int u = 3;
    private final class05527 i;
    private final long R;

    public class05517(class05527 class055272, long l) {
        this.i = class055272;
        this.R = l;
    }

    private static double y(long l) {
        return ((double)Math.floorMod(l >> 24, 1024) / 1024.0 - 0.5) * 0.9;
    }

    public class03556<class00780> y(class07209 class072092) {
        int n = class01146.N((int)class072092.method_10263());
        int n2 = class01146.N((int)class072092.method_10264());
        int n3 = class01146.N((int)class072092.method_10260());
        return this.N(n, n2, n3);
    }

    public class03556<class00780> N(int n, int n2, int n3) {
        return this.i.method_16359(n, n2, n3);
    }

    private static double N(long l, int n, int n2, int n3, double d, double d2, double d3) {
        long l2 = l;
        l2 = class05533.N(l2, n);
        l2 = class05533.N(l2, n2);
        l2 = class05533.N(l2, n3);
        l2 = class05533.N(l2, n);
        l2 = class05533.N(l2, n2);
        l2 = class05533.N(l2, n3);
        double d4 = class05517.y(l2);
        l2 = class05533.N(l2, l);
        double d5 = class05517.y(l2);
        l2 = class05533.N(l2, l);
        double d6 = class05517.y(l2);
        return class04995.E((double)(d3 + d6)) + class04995.E((double)(d2 + d5)) + class04995.E((double)(d + d4));
    }

    public class05517 N(class05527 class055272) {
        return new class05517(class055272, this.R);
    }

    public static long N(long l) {
        return Hashing.sha256().hashLong(l).asLong();
    }

    public class03556<class00780> N(double d, double d2, double d3) {
        int n = class01146.N((int)class04995.N((double)d));
        int n2 = class01146.N((int)class04995.N((double)d2));
        int n3 = class01146.N((int)class04995.N((double)d3));
        return this.N(n, n2, n3);
    }

    public class03556<class00780> N(class07209 class072092) {
        int n;
        int n2;
        int n3;
        int n4 = class072092.method_10263() - 2;
        int n5 = class072092.method_10264() - 2;
        int n6 = class072092.method_10260() - 2;
        int n7 = n4 >> 2;
        int n8 = n5 >> 2;
        int n9 = n6 >> 2;
        double d = (double)(n4 & 3) / 4.0;
        double d2 = (double)(n5 & 3) / 4.0;
        double d3 = (double)(n6 & 3) / 4.0;
        int n10 = 0;
        double d4 = Double.POSITIVE_INFINITY;
        for (n3 = 0; n3 < 8; ++n3) {
            double d5;
            double d6;
            double d7;
            boolean bl;
            int n11;
            int n12;
            n2 = (n3 & 4) == 0 ? 1 : 0;
            int n13 = n2 != 0 ? n7 : n7 + 1;
            double d8 = class05517.N(this.R, n13, n12 = (n = (n3 & 2) == 0 ? 1 : 0) != 0 ? n8 : n8 + 1, n11 = (bl = (n3 & 1) == 0) ? n9 : n9 + 1, d7 = n2 != 0 ? d : d - 1.0, d6 = n != 0 ? d2 : d2 - 1.0, d5 = bl ? d3 : d3 - 1.0);
            if (!(d4 > d8)) continue;
            n10 = n3;
            d4 = d8;
        }
        n3 = (n10 & 4) == 0 ? n7 : n7 + 1;
        n2 = (n10 & 2) == 0 ? n8 : n8 + 1;
        n = (n10 & 1) == 0 ? n9 : n9 + 1;
        return this.i.method_16359(n3, n2, n);
    }
}

