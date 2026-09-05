/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00143
 *  minecraft.class01763
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08028
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import minecraft.class00143;
import minecraft.class00690;
import minecraft.class00692;
import minecraft.class00702;
import minecraft.class01763;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08028;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00686
extends class00692 {
    private static final Logger y = LogUtils.getLogger();
    private static final int L = 5;
    private int u;
    private @Nullable class00143 i;
    private @Nullable class06889 R;
    private @Nullable class07438 M;
    private boolean B;

    @Override
    public void L() {
        this.u = 0;
        this.R = null;
        this.i = null;
        this.M = null;
    }

    public class00686(class00690 class006902) {
        super(class006902);
    }

    public class00702<class00686> B() {
        return class00702.y;
    }

    private void Z() {
        if (this.i == null || this.i.L()) {
            int n;
            int n2 = n = this.N.Z();
            if (this.N.method_59922().y(8) == 0) {
                this.B = !this.B;
                n2 += 6;
            }
            n2 = this.B ? ++n2 : --n2;
            if (this.N.m() == null || this.N.m().i() <= 0) {
                n2 -= 12;
                n2 &= 7;
                n2 += 12;
            } else if ((n2 %= 12) < 0) {
                n2 += 12;
            }
            this.i = this.N.N(n, n2, null);
            if (this.i != null) {
                this.i.N();
            }
        }
        this.z();
    }

    private void z() {
        if (this.i != null && !this.i.L()) {
            double d;
            class07209 class072092 = this.i.M();
            this.i.N();
            double d2 = class072092.method_10263();
            double d3 = class072092.method_10260();
            while ((d = (double)((float)class072092.method_10264() + this.N.method_59922().z() * 20.0f)) < (double)class072092.method_10264()) {
            }
            this.R = new class06889(d2, d, d3);
        }
    }

    public void N(class07438 class074382) {
        this.M = class074382;
        int n = this.N.Z();
        int n2 = this.N.N(this.M.method_23317(), this.M.method_23318(), this.M.method_23321());
        int n3 = this.M.method_31477();
        int n4 = this.M.method_31479();
        double d = (double)n3 - this.N.method_23317();
        double d2 = (double)n4 - this.N.method_23321();
        double d3 = Math.sqrt(d * d + d2 * d2);
        double d4 = Math.min((double)0.4f + d3 / 80.0 - 1.0, 10.0);
        int n5 = class04995.N((double)(this.M.method_23318() + d4));
        class01763 class017632 = new class01763(n3, n5, n4);
        this.i = this.N.N(n, n2, class017632);
        if (this.i != null) {
            this.i.N();
            this.z();
        }
    }

    @Override
    public void N(class04782 class047822) {
        double d;
        double d2;
        double d3;
        if (this.M == null) {
            y.warn("Skipping player strafe phase because no player was found");
            this.N.W().N(class00702.N);
            return;
        }
        if (this.i != null && this.i.L()) {
            d3 = this.M.method_23317();
            d2 = this.M.method_23321();
            double d4 = d3 - this.N.method_23317();
            double d5 = d2 - this.N.method_23321();
            d = Math.sqrt(d4 * d4 + d5 * d5);
            double d6 = Math.min((double)0.4f + d / 80.0 - 1.0, 10.0);
            this.R = new class06889(d3, this.M.method_23318() + d6, d2);
        }
        double d7 = d3 = this.R == null ? 0.0 : this.R.L(this.N.method_23317(), this.N.method_23318(), this.N.method_23321());
        if (d3 < 100.0 || d3 > 22500.0) {
            this.Z();
        }
        d2 = 64.0;
        if (this.M.method_5858((class07049)this.N) < 4096.0) {
            if (this.N.method_6057((class07049)this.M)) {
                ++this.u;
                class06889 class068892 = new class06889(this.M.method_23317() - this.N.method_23317(), 0.0, this.M.method_23321() - this.N.method_23321()).u();
                float f = (float)new class06889((double)class04995.m((double)(this.N.method_36454() * ((float)Math.PI / 180))), 0.0, (double)(-class04995.P((double)(this.N.method_36454() * ((float)Math.PI / 180))))).u().y(class068892);
                float f2 = (float)(Math.acos(f) * 57.2957763671875);
                f2 += 0.5f;
                if (this.u >= 5 && f2 >= 0.0f && f2 < 10.0f) {
                    d = 1.0;
                    class06889 class068893 = this.N.method_5828(1.0f);
                    double d8 = this.N.L.method_23317() - class068893.M * 1.0;
                    double d9 = this.N.L.method_23323(0.5) + 0.5;
                    double d10 = this.N.L.method_23321() - class068893.Z * 1.0;
                    double d11 = this.M.method_23317() - d8;
                    double d12 = this.M.method_23323(0.5) - d9;
                    double d13 = this.M.method_23321() - d10;
                    class06889 class068894 = new class06889(d11, d12, d13);
                    if (!this.N.method_5701()) {
                        class047822.method_8444(null, 1017, this.N.method_24515(), 0);
                    }
                    class08028 class080282 = new class08028((class07299)class047822, (class07438)this.N, class068894.u());
                    class080282.method_5808(d8, d9, d10, 0.0f, 0.0f);
                    class047822.method_8649((class07049)class080282);
                    this.u = 0;
                    if (this.i != null) {
                        while (!this.i.L()) {
                            this.i.N();
                        }
                    }
                    this.N.W().N(class00702.N);
                }
            } else if (this.u > 0) {
                --this.u;
            }
        } else if (this.u > 0) {
            --this.u;
        }
    }

    @Override
    public @Nullable class06889 R() {
        return this.R;
    }
}

