/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10090
 *  minecraft.class00500
 *  minecraft.class00751
 *  minecraft.class00780
 *  minecraft.class00795
 *  minecraft.class00869
 *  minecraft.class01818
 *  minecraft.class01820
 *  minecraft.class01837
 *  minecraft.class01894
 *  minecraft.class03028
 *  minecraft.class03556
 *  minecraft.class04039
 *  minecraft.class04084
 *  minecraft.class04227
 *  minecraft.class04995
 *  minecraft.class05041
 *  minecraft.class05474
 *  minecraft.class05517
 *  minecraft.class06057
 *  minecraft.class06069
 *  minecraft.class06080
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07321
 *  minecraft.class07376
 *  minecraft.class07830
 *  minecraft.class08050
 */
package minecraft;

import Nursultan.class10090;
import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;
import minecraft.class00500;
import minecraft.class00751;
import minecraft.class00780;
import minecraft.class00795;
import minecraft.class00869;
import minecraft.class01818;
import minecraft.class01820;
import minecraft.class01837;
import minecraft.class01894;
import minecraft.class03003;
import minecraft.class03008;
import minecraft.class03028;
import minecraft.class03556;
import minecraft.class04039;
import minecraft.class04084;
import minecraft.class04227;
import minecraft.class04995;
import minecraft.class05041;
import minecraft.class05474;
import minecraft.class05517;
import minecraft.class06057;
import minecraft.class06069;
import minecraft.class06080;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07321;
import minecraft.class07376;
import minecraft.class07830;
import minecraft.class08050;

public class class03019 {
    private static final class00500 N = class00869.ZN.W();
    private static final class00500 y = class00869.Zy.W();
    private static final class00500 L = class00869.zj.W();
    private static final class00500 u = class00869.Zi.W();
    private static final class00500 i = class00869.ZW.W();
    private static final class00500 R = class00869.ZP.W();
    private static final class00500 M = class00869.ZZ.W();
    private static final class00500 B = class00869.zn.W();
    private static final class00500 Z = class00869.ib.W();
    private final class00500 z;
    private final int U;
    private final class00500[] E;
    private final class05041 W;
    private final class05041 m;
    private final class05041 P;
    private final class05041 s;
    private final class05041 T;
    private final class05041 b;
    private final class05041 j;
    private final class01818 v;
    private final class05041 n;
    private final class05041 t;

    public class03019(class04084 class040842, class00500 class005002, int n, class01818 class018182) {
        this.z = class005002;
        this.U = n;
        this.v = class018182;
        this.W = class040842.N(class03008.a);
        this.E = class03019.N(class018182.N(class01894.y((String)"clay_bands")));
        this.n = class040842.N(class03008.c);
        this.t = class040842.N(class03008.X);
        this.m = class040842.N(class03008.p);
        this.P = class040842.N(class03008.F);
        this.s = class040842.N(class03008.A);
        this.T = class040842.N(class03008.f);
        this.b = class040842.N(class03008.C);
        this.j = class040842.N(class03008.S);
    }

    protected double y(int n, int n2) {
        return this.t.N((double)n, 0.0, (double)n2);
    }

    private static void N(class06069 class060692, class00500[] class00500Array, int n, class00500 class005002) {
        int n2 = class060692.N(6, 15);
        for (int i = 0; i < n2; ++i) {
            int n3 = n + class060692.y(3);
            int n4 = class060692.y(class00500Array.length);
            for (int j = 0; n4 + j < class00500Array.length && j < n3; ++j) {
                class00500Array[n4 + j] = class005002;
            }
        }
    }

    private static class00500[] N(class06069 class060692) {
        int n;
        Object[] objectArray = new class00500[192];
        Arrays.fill(objectArray, L);
        for (n = 0; n < objectArray.length; ++n) {
            if ((n += class060692.y(5) + 1) >= objectArray.length) continue;
            objectArray[n] = y;
        }
        class03019.N(class060692, (class00500[])objectArray, 1, u);
        class03019.N(class060692, (class00500[])objectArray, 2, i);
        class03019.N(class060692, (class00500[])objectArray, 1, R);
        n = class060692.N(9, 15);
        int n2 = 0;
        for (int i = 0; n2 < n && i < objectArray.length; ++n2, i += class060692.y(16) + 4) {
            objectArray[i] = N;
            if (i - 1 > 0 && class060692.Z()) {
                objectArray[i - 1] = M;
            }
            if (i + 1 >= objectArray.length || !class060692.Z()) continue;
            objectArray[i + 1] = M;
        }
        return objectArray;
    }

    private void N(int n, class00780 class007802, class01820 class018202, class07218 class072182, int n2, int n3, int n4) {
        double d;
        double d2 = 1.28;
        double d3 = Math.min(Math.abs(this.j.N((double)n2, 0.0, (double)n3) * 8.25), this.T.N((double)n2 * 1.28, 0.0, (double)n3 * 1.28) * 15.0);
        if (d3 <= 1.8) {
            return;
        }
        double d4 = 1.17;
        double d5 = 1.5;
        double d6 = Math.abs(this.b.N((double)n2 * 1.17, 0.0, (double)n3 * 1.17) * 1.5);
        double d7 = Math.min(d3 * d3 * 1.2, Math.ceil(d6 * 40.0) + 14.0);
        if (class007802.u((class07209)class072182.N(n2, this.U, n3), this.U)) {
            d7 -= 2.0;
        }
        if (d7 > 2.0) {
            d = (double)this.U - d7 - 7.0;
            d7 += (double)this.U;
        } else {
            d7 = 0.0;
            d = 0.0;
        }
        double d8 = d7;
        class06069 class060692 = this.v.N(n2, 0, n3);
        int n5 = 2 + class060692.y(4);
        int n6 = this.U + 18 + class060692.y(10);
        int n7 = 0;
        for (int i = Math.max(n4, (int)d8 + 1); i >= n; --i) {
            if (!(class018202.N(i).P() && i < (int)d8 && class060692.U() > 0.01) && (!class018202.N(i).N(class00869.K) || i <= (int)d || i >= this.U || d == 0.0 || !(class060692.U() > 0.15))) continue;
            if (n7 <= n5 && i > n6) {
                class018202.N(i, Z);
                ++n7;
                continue;
            }
            class018202.N(i, B);
        }
    }

    public class00500 N(int n, int n2, int n3) {
        int n4 = (int)Math.round(this.W.N((double)n, 0.0, (double)n3) * 4.0);
        return this.E[(n2 + n4 + this.E.length) % this.E.length];
    }

    @Deprecated
    public Optional<class00500> N(class03028 class030282, class06080 class060802, Function<class07209, class03556<class00780>> function, class08050 class080502, class01837 class018372, class07209 class072092, boolean bl) {
        class04039 class040392 = new class04039(this, class060802.y(), class080502, class018372, function, class060802.N().L(class04227.NA), (class06057)class060802);
        class03003 class030032 = (class03003)class030282.apply((Object)class040392);
        int n = class072092.method_10263();
        int n2 = class072092.method_10264();
        int n3 = class072092.method_10260();
        class040392.N(n, n3);
        class040392.N(1, 1, bl ? n2 + 1 : Integer.MIN_VALUE, n, n2, n3);
        return Optional.ofNullable(class030032.tryApply(n, n2, n3));
    }

    protected int N(int n, int n2) {
        return (int)(this.n.N((double)n, 0.0, (double)n2) * 2.75 + 3.0 + this.v.N(n, 0, n2).U() * 0.25);
    }

    private boolean N(class00500 class005002) {
        return !class005002.P() && class005002.Y().W();
    }

    public int N() {
        return this.U;
    }

    public void N(class04084 class040842, class05517 class055172, class00751<class00780> class007512, boolean bl, class06057 class060572, class08050 class080502, class01837 class018372, class03028 class030282) {
        class07218 class072182 = new class07218();
        class07321 class073212 = class080502.R();
        int n = class073212.i();
        int n2 = class073212.R();
        class10090 class100902 = new class10090(this, class080502, class072182, class073212);
        class04039 class040392 = new class04039(this, class040842, class080502, class018372, arg_0 -> ((class05517)class055172).N(arg_0), class007512, class060572);
        class03003 class030032 = (class03003)class030282.apply((Object)class040392);
        class07218 class072183 = new class07218();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                int n3 = n + i;
                int n4 = n2 + j;
                int n5 = class080502.N(class07830.field_13194, i, j) + 1;
                class072182.method_20787(n3).method_20788(n4);
                class03556 var22 = class055172.N((class07209)class072183.N(n3, bl ? 0 : n5, n4));
                if (var22.N(class00795.Q)) {
                    this.N((class01820)class100902, n3, n4, n5, (class05474)class080502);
                }
                int n6 = class080502.N(class07830.field_13194, i, j) + 1;
                class040392.N(n3, n4);
                int n7 = 0;
                int n8 = Integer.MIN_VALUE;
                int n9 = Integer.MAX_VALUE;
                int n10 = class080502.method_31607();
                for (int k = n6; k >= n10; --k) {
                    class00500 class005002;
                    int n11;
                    class00500 class005003 = class100902.N(k);
                    if (class005003.P()) {
                        n7 = 0;
                        n8 = Integer.MIN_VALUE;
                        continue;
                    }
                    if (!class005003.Y().W()) {
                        if (n8 != Integer.MIN_VALUE) continue;
                        n8 = k + 1;
                        continue;
                    }
                    if (n9 >= k) {
                        n9 = class07376.M;
                        for (n11 = k - 1; n11 >= n10 - 1; --n11) {
                            class005002 = class100902.N(n11);
                            if (this.N(class005002)) continue;
                            n9 = n11 + 1;
                            break;
                        }
                    }
                    n11 = k - n9 + 1;
                    class040392.N(++n7, n11, n8, n3, k, n4);
                    if (class005003 != this.z || (class005002 = class030032.tryApply(n3, k, n4)) == null) continue;
                    class100902.N(k, class005002);
                }
                if (!var22.N(class00795.D) && !var22.N(class00795.h)) continue;
                this.N(class040392.L(), (class00780)var22.N(), (class01820)class100902, class072183, n3, n4, n5);
            }
        }
    }

    private void N(class01820 class018202, int n, int n2, int n3, class05474 class054742) {
        class00500 class005002;
        int n4;
        double d = 0.2;
        double d2 = Math.min(Math.abs(this.s.N((double)n, 0.0, (double)n2) * 8.25), this.m.N((double)n * 0.2, 0.0, (double)n2 * 0.2) * 15.0);
        if (d2 <= 0.0) {
            return;
        }
        double d3 = 0.75;
        double d4 = 1.5;
        double d5 = Math.abs(this.P.N((double)n * 0.75, 0.0, (double)n2 * 0.75) * 1.5);
        int n5 = class04995.N((double)(64.0 + Math.min(d2 * d2 * 2.5, Math.ceil(d5 * 50.0) + 24.0)));
        if (n3 > n5) {
            return;
        }
        for (n4 = n5; n4 >= class054742.method_31607() && !(class005002 = class018202.N(n4)).N(this.z.i()); --n4) {
            if (!class005002.N(class00869.K)) continue;
            return;
        }
        for (n4 = n5; n4 >= class054742.method_31607() && class018202.N(n4).P(); --n4) {
            class018202.N(n4, this.z);
        }
    }
}

