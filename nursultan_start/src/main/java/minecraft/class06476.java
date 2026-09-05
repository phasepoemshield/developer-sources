/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01001
 *  minecraft.class03298
 *  minecraft.class04878
 *  minecraft.class04890
 *  minecraft.class05163
 *  minecraft.class05166
 *  minecraft.class05974
 *  minecraft.class06113
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07520
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01001;
import minecraft.class03298;
import minecraft.class04878;
import minecraft.class04890;
import minecraft.class05163;
import minecraft.class05166;
import minecraft.class05974;
import minecraft.class06113;
import minecraft.class06433;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07520;

public abstract class class06476
extends class04890 {
    protected static final class00500 y = class00869.ZF.W();
    protected static final class00500 L = class00869.ZA.W();
    protected static final class00500 u = class00869.Zf.W();
    protected static final class00500 i = L;
    protected static final class00500 R = class00869.zN.W();
    protected static final boolean M = true;
    protected static final class00500 B = class00869.K.W();
    protected static final Set<class00891> Z = ImmutableSet.builder().add((Object)class00869.iT).add((Object)class00869.zn).add((Object)class00869.mf).add((Object)B.i()).build();
    protected static final int z = 8;
    protected static final int U = 8;
    protected static final int E = 4;
    protected static final int W = 5;
    protected static final int m = 5;
    protected static final int P = 3;
    protected static final int s = 25;
    protected static final int T = 75;
    protected static final int b = class06476.y(2, 0, 0);
    protected static final int j = class06476.y(2, 2, 0);
    protected static final int v = class06476.y(0, 1, 0);
    protected static final int n = class06476.y(4, 1, 0);
    protected static final int t = 1001;
    protected static final int G = 1002;
    protected static final int l = 1003;
    protected class06433 d;

    public class06476(class04878 class048782, class07001 class070012) {
        super(class048782, class070012);
    }

    public class06476(class04878 class048782, class07211 class072112, int n, class05163 class051632) {
        super(class048782, n, class051632);
        this.N(class072112);
    }

    protected class06476(class04878 class048782, int n, class07211 class072112, class06433 class064332, int n2, int n3, int n4) {
        super(class048782, n, class06476.N(class072112, class064332, n2, n3, n4));
        this.N(class072112);
        this.d = class064332;
    }

    protected static int y(int n, int n2, int n3) {
        return n2 * 25 + n3 * 5 + n;
    }

    protected void N(class05974 class059742, class05163 class051632, int n, int n2, int n3, int n4, int n5, int n6, class00500 class005002) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (this.N((class07290)class059742, j, i, k, class051632) != B) continue;
                    this.L(class059742, class005002, j, i, k, class051632);
                }
            }
        }
    }

    protected boolean N(class05163 class051632, int n, int n2, int n3, int n4) {
        int n5 = this.N(n, n2);
        int n6 = this.y(n, n2);
        int n7 = this.N(n3, n4);
        int n8 = this.y(n3, n4);
        return class051632.N(Math.min(n5, n7), Math.min(n6, n8), Math.max(n5, n7), Math.max(n6, n8));
    }

    protected void N(class05974 class059742, class05163 class051632, int n, int n2, int n3) {
        class07520 class075202;
        class07218 class072182 = this.L(n, n2, n3);
        if (class051632.y((class00753)class072182) && (class075202 = (class07520)class07078.p.N((class07299)class059742.method_8410(), class06113.field_16474)) != null) {
            class075202.method_6025(class075202.method_6063());
            class075202.method_5808((double)class072182.method_10263() + 0.5, (double)class072182.method_10264(), (double)class072182.method_10260() + 0.5, 0.0f, 0.0f);
            class075202.N((class01001)class059742, class059742.method_8404(class075202.method_24515()), class06113.field_16474, null);
            class059742.y((class07049)class075202);
        }
    }

    protected void N(class05974 class059742, class05163 class051632, int n, int n2, int n3, int n4, int n5, int n6) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    class00500 class005002 = this.N((class07290)class059742, j, i, k, class051632);
                    if (Z.contains(class005002.i())) continue;
                    if (this.L(i) >= class059742.method_8615() && class005002 != B) {
                        this.L(class059742, class00869.N.W(), j, i, k, class051632);
                        continue;
                    }
                    this.L(class059742, B, j, i, k, class051632);
                }
            }
        }
    }

    protected void N(class05974 class059742, class05163 class051632, int n, int n2, boolean bl) {
        if (bl) {
            this.N(class059742, class051632, n + 0, 0, n2 + 0, n + 2, 0, n2 + 8 - 1, y, y, false);
            this.N(class059742, class051632, n + 5, 0, n2 + 0, n + 8 - 1, 0, n2 + 8 - 1, y, y, false);
            this.N(class059742, class051632, n + 3, 0, n2 + 0, n + 4, 0, n2 + 2, y, y, false);
            this.N(class059742, class051632, n + 3, 0, n2 + 5, n + 4, 0, n2 + 8 - 1, y, y, false);
            this.N(class059742, class051632, n + 3, 0, n2 + 2, n + 4, 0, n2 + 2, L, L, false);
            this.N(class059742, class051632, n + 3, 0, n2 + 5, n + 4, 0, n2 + 5, L, L, false);
            this.N(class059742, class051632, n + 2, 0, n2 + 3, n + 2, 0, n2 + 4, L, L, false);
            this.N(class059742, class051632, n + 5, 0, n2 + 3, n + 5, 0, n2 + 4, L, L, false);
        } else {
            this.N(class059742, class051632, n + 0, 0, n2 + 0, n + 8 - 1, 0, n2 + 8 - 1, y, y, false);
        }
    }

    private static class05163 N(class07211 class072112, class06433 class064332, int n, int n2, int n3) {
        int n4 = class064332.N;
        int n5 = n4 % 5;
        int n6 = n4 / 5 % 5;
        int n7 = n4 / 25;
        class05163 class051632 = class06476.N((int)0, (int)0, (int)0, (class07211)class072112, (int)(n * 8), (int)(n2 * 4), (int)(n3 * 8));
        switch (class05166.N[class072112.ordinal()]) {
            case 1: {
                class051632.N(n5 * 8, n7 * 4, -(n6 + n3) * 8 + 1);
                break;
            }
            case 2: {
                class051632.N(n5 * 8, n7 * 4, n6 * 8);
                break;
            }
            case 3: {
                class051632.N(-(n6 + n3) * 8 + 1, n7 * 4, n5 * 8);
                break;
            }
            default: {
                class051632.N(n6 * 8, n7 * 4, n5 * 8);
            }
        }
        return class051632;
    }

    protected void N(class03298 class032982, class07001 class070012) {
    }
}

