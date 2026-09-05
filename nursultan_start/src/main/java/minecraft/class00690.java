/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  minecraft.class00143
 *  minecraft.class00500
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01328
 *  minecraft.class01763
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02753
 *  minecraft.class02765
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class03696
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05334
 *  minecraft.class06403
 *  minecraft.class06889
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07057
 *  minecraft.class07062
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07276
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class07451
 *  minecraft.class07542
 *  minecraft.class07830
 *  minecraft.class07856
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import minecraft.class00143;
import minecraft.class00500;
import minecraft.class00676;
import minecraft.class00684;
import minecraft.class00695;
import minecraft.class00699;
import minecraft.class00702;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01328;
import minecraft.class01763;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02753;
import minecraft.class02765;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class03696;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05334;
import minecraft.class06403;
import minecraft.class06889;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07057;
import minecraft.class07062;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07276;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class07451;
import minecraft.class07542;
import minecraft.class07830;
import minecraft.class07856;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00690
extends class07079
implements class07542 {
    private static final Logger T = LogUtils.getLogger();
    public static final class02131<Integer> N = class03289.N(class00690.class, (class04383)class02154.y);
    private static final class01328 b = class01328.N().N(64.0);
    private static final int c = 200;
    private static final int X = 400;
    private static final float a = 0.25f;
    private static final String p = "DragonDeathTime";
    private static final String F = "DragonPhase";
    private static final int A = 0;
    public final class02765 y = new class02765();
    private final class00695[] f;
    public final class00695 L;
    private final class00695 C;
    public final class00695 u;
    private final class00695 S;
    private final class00695 x;
    private final class00695 D;
    private final class00695 h;
    private final class00695 r;
    public float i;
    public float R;
    public boolean M;
    public int B = 0;
    public float Z;
    public @Nullable class00676 W;
    private @Nullable class07856 NN;
    private class07209 Ny = class07209.field_10980;
    private final class00684 NL;
    private int NE = 100;
    private float NW;
    private final class01763[] Nm = new class01763[24];
    private final int[] NP = new int[24];
    private final class05334 Ns = new class05334();

    private float L(double d) {
        return (float)class04995.i((double)d);
    }

    public class07209 M() {
        return this.Ny;
    }

    public void method_5674(class02131<?> class021312) {
        if (N.equals(class021312) && this.method_73183().method_8608()) {
            this.NL.N(class00702.N((Integer)this.method_5841().N(N)));
        }
        super.method_5674(class021312);
    }

    public void method_31471(class07276 class072762) {
        super.method_31471(class072762);
        class00695[] class00695Array = this.E();
        for (int i = 0; i < class00695Array.length; ++i) {
            class00695Array[i].method_5838(i + class072762.N() + 1);
        }
    }

    public void method_5982() {
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(N, (Object)class00702.U.y());
    }

    public void method_5768(class04782 class047822) {
        this.method_5650(class07062.field_26998);
        this.method_32876((class03556)class01194.s);
        if (this.NN != null) {
            this.NN.y(this);
            this.NN.N(this);
        }
    }

    public class04911 method_5634() {
        return class04911.field_15251;
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        return this.N(class047822, this.u, class070722, f);
    }

    public void method_5801() {
        if (this.method_73183().method_8608() && !this.method_5701()) {
            this.method_73183().method_8486(this.method_23317(), this.method_23318(), this.method_23321(), class04909.ze, this.method_5634(), 5.0f, 0.8f + this.field_5974.z() * 0.3f, false);
        }
    }

    public boolean method_5776() {
        float f = class04995.P((double)(this.R * ((float)Math.PI * 2)));
        return class04995.P((double)(this.i * ((float)Math.PI * 2))) <= -0.3f && f >= -0.3f;
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N(F, this.NL.N().B().y());
        class083292.N(p, this.B);
    }

    public boolean method_5863() {
        return false;
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        class082992.i(F).ifPresent(n -> this.NL.N(class00702.N(n)));
        this.B = class082992.N(p, 0);
    }

    protected boolean method_5860(class07049 class070492) {
        return false;
    }

    public boolean method_5822(boolean bl) {
        return false;
    }

    public class00690(class07078<? extends class00690> class070782, class07299 class072992) {
        super(class07078.f, class072992);
        this.L = new class00695(this, "head", 1.0f, 1.0f);
        this.C = new class00695(this, "neck", 3.0f, 3.0f);
        this.u = new class00695(this, "body", 5.0f, 3.0f);
        this.S = new class00695(this, "tail", 2.0f, 2.0f);
        this.x = new class00695(this, "tail", 2.0f, 2.0f);
        this.D = new class00695(this, "tail", 2.0f, 2.0f);
        this.h = new class00695(this, "wing", 4.0f, 2.0f);
        this.r = new class00695(this, "wing", 4.0f, 2.0f);
        this.f = new class00695[]{this.L, this.C, this.u, this.S, this.x, this.D, this.h, this.r};
        this.method_6033(this.method_6063());
        this.field_5960 = true;
        this.NL = new class00684(this);
    }

    public static class05300 B() {
        return class07079.H().N(class05298.n, 200.0).N(class05298.z, 16.0);
    }

    public int Z() {
        if (this.Nm[0] == null) {
            for (int i = 0; i < 24; ++i) {
                int n;
                int n2;
                int n3 = 5;
                int n4 = i;
                if (i < 12) {
                    n2 = class04995.y((float)(60.0f * class04995.P((double)(2.0f * ((float)(-Math.PI) + 0.2617994f * (float)n4)))));
                    n = class04995.y((float)(60.0f * class04995.m((double)(2.0f * ((float)(-Math.PI) + 0.2617994f * (float)n4)))));
                } else if (i < 20) {
                    n2 = class04995.y((float)(40.0f * class04995.P((double)(2.0f * ((float)(-Math.PI) + 0.3926991f * (float)(n4 -= 12))))));
                    n = class04995.y((float)(40.0f * class04995.m((double)(2.0f * ((float)(-Math.PI) + 0.3926991f * (float)n4)))));
                    n3 += 10;
                } else {
                    n2 = class04995.y((float)(20.0f * class04995.P((double)(2.0f * ((float)(-Math.PI) + 0.7853982f * (float)(n4 -= 20))))));
                    n = class04995.y((float)(20.0f * class04995.m((double)(2.0f * ((float)(-Math.PI) + 0.7853982f * (float)n4)))));
                }
                int n5 = Math.max(73, this.method_73183().N(class07830.field_13203, new class07209(n2, 0, n)).method_10264() + n3);
                this.Nm[i] = new class01763(n2, n5, n);
            }
            this.NP[0] = 6146;
            this.NP[1] = 8197;
            this.NP[2] = 8202;
            this.NP[3] = 16404;
            this.NP[4] = 32808;
            this.NP[5] = 32848;
            this.NP[6] = 65696;
            this.NP[7] = 131392;
            this.NP[8] = 131712;
            this.NP[9] = 263424;
            this.NP[10] = 526848;
            this.NP[11] = 525313;
            this.NP[12] = 1581057;
            this.NP[13] = 3166214;
            this.NP[14] = 2138120;
            this.NP[15] = 6373424;
            this.NP[16] = 4358208;
            this.NP[17] = 12910976;
            this.NP[18] = 9044480;
            this.NP[19] = 9706496;
            this.NP[20] = 15216640;
            this.NP[21] = 0xD0E000;
            this.NP[22] = 11763712;
            this.NP[23] = 0x7E0000;
        }
        return this.N(this.method_23317(), this.method_23318(), this.method_23321());
    }

    protected class04891 s() {
        return class04909.zq;
    }

    private void n() {
        if (this.W != null) {
            if (this.W.method_31481()) {
                this.W = null;
            } else if (this.field_6012 % 10 == 0 && this.method_6032() < this.method_6063()) {
                this.method_6033(this.method_6032() + 1.0f);
            }
        }
        if (this.field_5974.y(10) == 0) {
            List var1 = this.method_73183().N(class00676.class, this.method_5829().M(32.0));
            class00676 class006762 = null;
            double d = Double.MAX_VALUE;
            for (class00676 class006763 : var1) {
                double d2 = class006763.method_5858((class07049)this);
                if (!(d2 < d)) continue;
                d = d2;
                class006762 = class006763;
            }
            this.W = class006762;
        }
    }

    public @Nullable class07856 m() {
        return this.NN;
    }

    private float v() {
        if (this.NL.N().N()) {
            return -1.0f;
        }
        class02753 class027532 = this.y.N(5);
        class02753 class027533 = this.y.N(0);
        return (float)(class027532.N() - class027533.N());
    }

    public class06889 u(float f) {
        class06889 class068892;
        class00699 class006992 = this.NL.N();
        class00702<? extends class00699> var3 = class006992.B();
        if (var3 == class00702.u || var3 == class00702.i) {
            class07209 class072092 = this.method_73183().N(class07830.field_13203, class06403.N((class07209)this.Ny));
            float f2 = Math.max((float)Math.sqrt(class072092.method_19770((class00737)this.method_73189())) / 4.0f, 1.0f);
            float f3 = 6.0f / f2;
            float f4 = this.method_36455();
            float f5 = 1.5f;
            this.method_36457(-f3 * 1.5f * 5.0f);
            class068892 = this.method_5828(f);
            this.method_36457(f4);
        } else if (class006992.N()) {
            float f6 = this.method_36455();
            float f7 = 1.5f;
            this.method_36457(-45.0f);
            class068892 = this.method_5828(f);
            this.method_36457(f6);
        } else {
            class068892 = this.method_5828(f);
        }
        return class068892;
    }

    private void y(class04782 class047822, List<class07049> list) {
        for (class07049 class070492 : list) {
            if (!(class070492 instanceof class07438)) continue;
            class07072 class070722 = this.method_48923().y((class07438)this);
            class070492.method_64397(class047822, class070722, 10.0f);
            class07323.N((class04782)class047822, (class07049)class070492, (class07072)class070722);
        }
    }

    public class00695[] E() {
        return this.f;
    }

    public void N(class07856 class078562) {
        this.NN = class078562;
    }

    public @Nullable class00143 N(int n, int n2, @Nullable class01763 class017632) {
        class01763 class017633;
        for (int i = 0; i < 24; ++i) {
            class017633 = this.Nm[i];
            class017633.Z = false;
            class017633.M = 0.0f;
            class017633.i = 0.0f;
            class017633.R = 0.0f;
            class017633.B = null;
            class017633.u = -1;
        }
        class01763 class017634 = this.Nm[n];
        class017633 = this.Nm[n2];
        class017634.i = 0.0f;
        class017634.M = class017634.R = class017634.N(class017633);
        this.Ns.N();
        this.Ns.N(class017634);
        class01763 class017635 = class017634;
        int n3 = 0;
        if (this.NN == null || this.NN.i() == 0) {
            n3 = 12;
        }
        while (!this.Ns.i()) {
            int n4;
            class01763 class017636 = this.Ns.L();
            if (class017636.equals((Object)class017633)) {
                if (class017632 != null) {
                    class017632.B = class017633;
                    class017633 = class017632;
                }
                return this.N(class017634, class017633);
            }
            if (class017636.N(class017633) < class017635.N(class017633)) {
                class017635 = class017636;
            }
            class017636.Z = true;
            int n5 = 0;
            for (n4 = 0; n4 < 24; ++n4) {
                if (this.Nm[n4] != class017636) continue;
                n5 = n4;
                break;
            }
            for (n4 = n3; n4 < 24; ++n4) {
                if ((this.NP[n5] & 1 << n4) <= 0) continue;
                class01763 class017637 = this.Nm[n4];
                if (class017637.Z) continue;
                float f = class017636.i + class017636.N(class017637);
                if (class017637.R() && !(f < class017637.i)) continue;
                class017637.B = class017636;
                class017637.i = f;
                class017637.R = class017637.N(class017633);
                if (class017637.R()) {
                    this.Ns.N(class017637, class017637.i + class017637.R);
                    continue;
                }
                class017637.M = class017637.i + class017637.R;
                this.Ns.N(class017637);
            }
        }
        if (class017635 == class017634) {
            return null;
        }
        T.debug("Failed to find path from {} to {}", (Object)n, (Object)n2);
        if (class017632 != null) {
            class017632.B = class017635;
            class017635 = class017632;
        }
        return this.N(class017634, class017635);
    }

    public void N(class07209 class072092) {
        this.Ny = class072092;
    }

    public void N(class04782 class047822, class00676 class006762, class07209 class072092, class07072 class070722) {
        class07049 class070492 = class070722.u();
        class08036 class080362 = class070492 instanceof class08036 ? (class08036)class070492 : class047822.N(b, (double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260());
        if (class006762 == this.W) {
            this.N(class047822, this.L, this.method_48923().u((class07049)class006762, (class07049)class080362), 10.0f);
        }
        this.NL.N().N(class006762, class072092, class070722, class080362);
    }

    private boolean N(class04782 class047822, class00734 class007342) {
        int n = class04995.N((double)class007342.N);
        int n2 = class04995.N((double)class007342.y);
        int n3 = class04995.N((double)class007342.L);
        int n4 = class04995.N((double)class007342.u);
        int n5 = class04995.N((double)class007342.i);
        int n6 = class04995.N((double)class007342.R);
        boolean bl = false;
        boolean bl2 = false;
        for (int i = n; i <= n4; ++i) {
            for (int j = n2; j <= n5; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    class07209 class072092 = new class07209(i, j, k);
                    class00500 class005002 = class047822.method_8320(class072092);
                    if (class005002.P() || class005002.N(class01210.NF)) continue;
                    if (!((Boolean)class047822.method_64395().N(class07305.I)).booleanValue() || class005002.N(class01210.Np)) {
                        bl = true;
                        continue;
                    }
                    bl2 = class047822.method_8650(class072092, false) || bl2;
                }
            }
        }
        if (bl2) {
            class07209 class072093 = new class07209(n + this.field_5974.y(n4 - n + 1), n2 + this.field_5974.y(n5 - n2 + 1), n3 + this.field_5974.y(n6 - n3 + 1));
            class047822.N(2008, class072093, 0);
        }
        return bl;
    }

    protected void N(class04782 class047822, class07072 class070722, float f) {
        super.method_64397(class047822, class070722, f);
    }

    public int N(double d, double d2, double d3) {
        float f = 10000.0f;
        int n = 0;
        class01763 class017632 = new class01763(class04995.N((double)d), class04995.N((double)d2), class04995.N((double)d3));
        int n2 = 0;
        if (this.NN == null || this.NN.i() == 0) {
            n2 = 12;
        }
        for (int i = n2; i < 24; ++i) {
            float f2;
            if (this.Nm[i] == null || !((f2 = this.Nm[i].L(class017632)) < f)) continue;
            f = f2;
            n = i;
        }
        return n;
    }

    public boolean N(class04782 class047822, class00695 class006952, class07072 class070722, float f) {
        if (this.NL.N().B() == class00702.z) {
            return false;
        }
        f = this.NL.N().N(class070722, f);
        if (class006952 != this.L) {
            f = f / 4.0f + Math.min(f, 1.0f);
        }
        if (f < 0.01f) {
            return false;
        }
        if (class070722.u() instanceof class08036 || class070722.N(class03696.d)) {
            float f2 = this.method_6032();
            this.N(class047822, class070722, f);
            if (this.method_29504() && !this.NL.N().N()) {
                this.method_6033(1.0f);
                this.NL.N(class00702.z);
            }
            if (this.NL.N().N()) {
                this.NW = this.NW + f2 - this.method_6032();
                if (this.NW > 0.25f * this.method_6063()) {
                    this.NW = 0.0f;
                    this.NL.N(class00702.i);
                }
            }
        }
        return true;
    }

    private void N(class00695 class006952, double d, double d2, double d3) {
        class006952.method_5814(this.method_23317() + d, this.method_23318() + d2, this.method_23321() + d3);
    }

    private class00143 N(class01763 class017632, class01763 class017633) {
        ArrayList arrayList = Lists.newArrayList();
        class01763 class017634 = class017633;
        arrayList.add(0, class017634);
        while (class017634.B != null) {
            class017634 = class017634.B;
            arrayList.add(0, class017634);
        }
        return new class00143((List)arrayList, new class07209(class017633.N, class017633.y, class017633.L), true);
    }

    private void N(class04782 class047822, List<class07049> list) {
        double d = (this.u.method_5829().N + this.u.method_5829().u) / 2.0;
        double d2 = (this.u.method_5829().L + this.u.method_5829().R) / 2.0;
        for (class07049 class070492 : list) {
            if (!(class070492 instanceof class07438)) continue;
            class07438 class074382 = (class07438)class070492;
            double d3 = class070492.method_23317() - d;
            double d4 = class070492.method_23321() - d2;
            double d5 = Math.max(d3 * d3 + d4 * d4, 0.1);
            class070492.method_5762(d3 / d5 * 4.0, (double)0.2f, d4 / d5 * 4.0);
            if (this.NL.N().N() || class074382.method_6117() >= class070492.field_6012 - 2) continue;
            class07072 class070722 = this.method_48923().y((class07438)this);
            class070492.method_64397(class047822, class070722, 5.0f);
            class07323.N((class04782)class047822, (class07049)class070492, (class07072)class070722);
        }
    }

    public class00684 W() {
        return this.NL;
    }

    public float method_56077(float f) {
        return 1.0f;
    }

    public float method_6107() {
        return 5.0f;
    }

    public void method_6007() {
        float f;
        float f2;
        float f3;
        class06889[] class06889Array;
        class04782 class047822;
        class07299 class072992;
        this.method_33573();
        if (this.method_73183().method_8608()) {
            this.method_6033(this.method_6032());
            if (!this.method_5701() && !this.NL.N().N() && --this.NE < 0) {
                this.method_73183().method_8486(this.method_23317(), this.method_23318(), this.method_23321(), class04909.zH, this.method_5634(), 2.5f, 0.8f + this.field_5974.z() * 0.3f, false);
                this.NE = 200 + this.field_5974.y(200);
            }
        }
        if (this.NN == null && (class072992 = this.method_73183()) instanceof class04782 && (class072992 = (class047822 = (class04782)class072992).method_29198()) != null && this.method_5667().equals(class072992.Z())) {
            this.NN = class072992;
        }
        this.i = this.R;
        if (this.method_29504()) {
            float f4 = (this.field_5974.z() - 0.5f) * 8.0f;
            float f5 = (this.field_5974.z() - 0.5f) * 4.0f;
            float f6 = (this.field_5974.z() - 0.5f) * 8.0f;
            this.method_73183().method_8406((class07126)class07107.l, this.method_23317() + (double)f4, this.method_23318() + 2.0 + (double)f5, this.method_23321() + (double)f6, 0.0, 0.0, 0.0);
            return;
        }
        this.n();
        class047822 = this.method_18798();
        float f7 = 0.2f / ((float)class047822.Z() * 10.0f + 1.0f);
        this.R = this.NL.N().N() ? (this.R += 0.1f) : (this.M ? (this.R += f7 * 0.5f) : (this.R += (f7 *= (float)Math.pow(2.0, class047822.B))));
        this.method_36456(class04995.R((float)this.method_36454()));
        if (this.Nt()) {
            this.R = 0.5f;
            return;
        }
        this.y.N(this.method_23318(), this.method_36454());
        Object object = this.method_73183();
        if (!(object instanceof class04782)) {
            ((class07438)this).fields_7212a028292fd3c078969e3ee4c71d9e8_3.method_66271();
            this.NL.N().y();
        } else {
            class06889 class068892;
            class06889Array = (class06889[])object;
            object = this.NL.N();
            object.N((class04782)class06889Array);
            if (this.NL.N() != object) {
                object = this.NL.N();
                object.N((class04782)class06889Array);
            }
            if ((class068892 = object.R()) != null) {
                double d = class068892.M - this.method_23317();
                double d2 = class068892.B - this.method_23318();
                double d3 = class068892.Z - this.method_23321();
                double d4 = d * d + d2 * d2 + d3 * d3;
                float f8 = object.i();
                double d5 = Math.sqrt(d * d + d3 * d3);
                if (d5 > 0.0) {
                    d2 = class04995.N((double)(d2 / d5), (double)(-f8), (double)f8);
                }
                this.method_18799(this.method_18798().y(0.0, d2 * 0.01, 0.0));
                this.method_36456(class04995.R((float)this.method_36454()));
                class06889 class068893 = class068892.N(this.method_23317(), this.method_23318(), this.method_23321()).u();
                class06889 class068894 = new class06889((double)class04995.m((double)(this.method_36454() * ((float)Math.PI / 180))), this.method_18798().B, (double)(-class04995.P((double)(this.method_36454() * ((float)Math.PI / 180))))).u();
                f3 = Math.max(((float)class068894.y(class068893) + 0.5f) / 1.5f, 0.0f);
                if (Math.abs(d) > (double)1.0E-5f || Math.abs(d3) > (double)1.0E-5f) {
                    f2 = class04995.N((float)class04995.R((float)(180.0f - (float)class04995.u((double)d, (double)d3) * 57.295776f - this.method_36454())), (float)-50.0f, (float)50.0f);
                    this.Z *= 0.8f;
                    this.Z += f2 * object.M();
                    this.method_36456(this.method_36454() + this.Z * 0.1f);
                }
                f2 = (float)(2.0 / (d4 + 1.0));
                f = 0.06f;
                this.method_5724(0.06f * (f3 * f2 + (1.0f - f2)), new class06889(0.0, 0.0, -1.0));
                if (this.M) {
                    this.method_5784(class07451.field_6308, this.method_18798().L((double)0.8f));
                } else {
                    this.method_5784(class07451.field_6308, this.method_18798());
                }
                class06889 class068895 = this.method_18798().u();
                double d6 = 0.8 + 0.15 * (class068895.y(class068894) + 1.0) / 2.0;
                this.method_18799(this.method_18798().u(d6, (double)0.91f, d6));
            }
        }
        if (!this.method_73183().method_8608()) {
            this.method_61409();
        }
        ((class07438)this).fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(this.method_36454());
        class06889Array = new class06889[this.f.length];
        for (int i = 0; i < this.f.length; ++i) {
            class06889Array[i] = new class06889(this.f[i].method_23317(), this.f[i].method_23318(), this.f[i].method_23321());
        }
        float f9 = (float)(this.y.N(5).N() - this.y.N(10).N()) * 10.0f * ((float)Math.PI / 180);
        float f10 = class04995.P((double)f9);
        float f11 = class04995.m((double)f9);
        float f12 = this.method_36454() * ((float)Math.PI / 180);
        float f13 = class04995.m((double)f12);
        float f14 = class04995.P((double)f12);
        this.N(this.u, f13 * 0.5f, 0.0, (double)(-f14 * 0.5f));
        this.N(this.h, f14 * 4.5f, 2.0, (double)(f13 * 4.5f));
        this.N(this.r, f14 * -4.5f, 2.0, (double)(f13 * -4.5f));
        class07299 class072993 = this.method_73183();
        if (class072993 instanceof class04782) {
            class04782 class047823 = (class04782)class072993;
            if (((class07438)this).fields_2212a028292fd3c078969e3ee4c71d9e8_0 == 0) {
                this.N(class047823, class047823.method_8333((class07049)this, this.h.method_5829().L(4.0, 2.0, 4.0).u(0.0, -2.0, 0.0), class07042.i));
                this.N(class047823, class047823.method_8333((class07049)this, this.r.method_5829().L(4.0, 2.0, 4.0).u(0.0, -2.0, 0.0), class07042.i));
                this.y(class047823, class047823.method_8333((class07049)this, this.L.method_5829().M(1.0), class07042.i));
                this.y(class047823, class047823.method_8333((class07049)this, this.C.method_5829().M(1.0), class07042.i));
            }
        }
        float f15 = class04995.m((double)(this.method_36454() * ((float)Math.PI / 180) - this.Z * 0.01f));
        float f16 = class04995.P((double)(this.method_36454() * ((float)Math.PI / 180) - this.Z * 0.01f));
        float f17 = this.v();
        this.N(this.L, f15 * 6.5f * f10, f17 + f11 * 6.5f, (double)(-f16 * 6.5f * f10));
        this.N(this.C, f15 * 5.5f * f10, f17 + f11 * 5.5f, (double)(-f16 * 5.5f * f10));
        class02753 class027532 = this.y.N(5);
        for (int i = 0; i < 3; ++i) {
            class00695 class006952 = null;
            if (i == 0) {
                class006952 = this.S;
            }
            if (i == 1) {
                class006952 = this.x;
            }
            if (i == 2) {
                class006952 = this.D;
            }
            class02753 class027533 = this.y.N(12 + i * 2);
            float f18 = this.method_36454() * ((float)Math.PI / 180) + this.L(class027533.y() - class027532.y()) * ((float)Math.PI / 180);
            float f19 = class04995.m((double)f18);
            f3 = class04995.P((double)f18);
            f2 = 1.5f;
            f = (float)(i + 1) * 2.0f;
            this.N(class006952, -(f13 * 1.5f + f19 * f) * f10, class027533.N() - class027532.N() - (double)((f + 1.5f) * f11) + 1.5, (double)((f14 * 1.5f + f3 * f) * f10));
        }
        class07299 class072994 = this.method_73183();
        if (class072994 instanceof class04782) {
            class04782 class047824 = (class04782)class072994;
            this.M = this.N(class047824, this.L.method_5829()) | this.N(class047824, this.C.method_5829()) | this.N(class047824, this.u.method_5829());
            if (this.NN != null) {
                this.NN.y(this);
            }
        }
        for (int i = 0; i < this.f.length; ++i) {
            this.f[i].field_6014 = class06889Array[i].M;
            this.f[i].field_6036 = class06889Array[i].B;
            this.f[i].field_5969 = class06889Array[i].Z;
            this.f[i].field_6038 = class06889Array[i].M;
            this.f[i].field_5971 = class06889Array[i].B;
            this.f[i].field_5989 = class06889Array[i].Z;
        }
    }

    public boolean method_18395(class07438 class074382) {
        return class074382.method_33190();
    }

    public boolean method_37222(class07055 class070552, @Nullable class07049 class070492) {
        return false;
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.zc;
    }

    public void method_6108() {
        class07299 class072992;
        class04782 class047822;
        if (this.NN != null) {
            this.NN.y(this);
        }
        ++this.B;
        if (this.B >= 180 && this.B <= 200) {
            float f = (this.field_5974.z() - 0.5f) * 8.0f;
            float f2 = (this.field_5974.z() - 0.5f) * 4.0f;
            float f3 = (this.field_5974.z() - 0.5f) * 8.0f;
            this.method_73183().method_8406((class07126)class07107.G, this.method_23317() + (double)f, this.method_23318() + 2.0 + (double)f2, this.method_23321() + (double)f3, 0.0, 0.0, 0.0);
        }
        int n = 500;
        if (this.NN != null && !this.NN.R()) {
            n = 12000;
        }
        if ((class047822 = this.method_73183()) instanceof class04782) {
            class04782 class047823 = class047822;
            if (this.B > 150 && this.B % 5 == 0 && ((Boolean)class047823.method_64395().N(class07305.O)).booleanValue()) {
                class07057.N((class04782)class047823, (class06889)this.method_73189(), (int)class04995.y((float)((float)n * 0.08f)));
            }
            if (this.B == 1 && !this.method_5701()) {
                class047823.method_8474(1028, this.method_24515(), 0);
            }
        }
        class06889 class068892 = new class06889(0.0, (double)0.1f, 0.0);
        this.method_5784(class07451.field_6308, class068892);
        for (class00695 class006952 : this.f) {
            class006952.method_22862();
            class006952.method_33574(class006952.method_73189().i(class068892));
        }
        if (this.B == 200 && (class072992 = this.method_73183()) instanceof class04782) {
            class047822 = (class04782)class072992;
            if (((Boolean)class047822.method_64395().N(class07305.O)).booleanValue()) {
                class07057.N((class04782)class047822, (class06889)this.method_73189(), (int)class04995.y((float)((float)n * 0.2f)));
            }
            if (this.NN != null) {
                this.NN.N(this);
            }
            this.method_5650(class07062.field_26998);
            this.method_32876((class03556)class01194.s);
        }
    }
}

