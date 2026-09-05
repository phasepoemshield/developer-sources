/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00473
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class07047
 *  minecraft.class07048
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07103
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07299
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00473;
import minecraft.class00685;
import minecraft.class00690;
import minecraft.class00702;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07048;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07103;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07299;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

public class class00706
extends class00685 {
    private static final int y = 200;
    private static final int L = 4;
    private static final int u = 10;
    private int i;
    private int R;
    private @Nullable class07048 M;

    @Override
    public void L() {
        this.i = 0;
        ++this.R;
    }

    public class00706(class00690 class006902) {
        super(class006902);
    }

    public class00702<class00706> B() {
        return class00702.R;
    }

    public void Z() {
        this.R = 0;
    }

    @Override
    public void u() {
        if (this.M != null) {
            this.M.method_31472();
            this.M = null;
        }
    }

    @Override
    public void y() {
        ++this.i;
        if (this.i % 2 == 0 && this.i < 10) {
            class06889 class068892 = this.N.u(1.0f).u();
            class068892.y(-0.7853982f);
            double d = this.N.L.method_23317();
            double d2 = this.N.L.method_23323(0.5);
            double d3 = this.N.L.method_23321();
            for (int i = 0; i < 8; ++i) {
                double d4 = d + this.N.method_59922().E() / 2.0;
                double d5 = d2 + this.N.method_59922().E() / 2.0;
                double d6 = d3 + this.N.method_59922().E() / 2.0;
                for (int j = 0; j < 6; ++j) {
                    this.N.method_73183().method_8406((class07126)class00473.N((class07103)class07107.Z, (float)1.0f), d4, d5, d6, -class068892.M * (double)0.08f * (double)j, -class068892.B * (double)0.6f, -class068892.Z * (double)0.08f * (double)j);
                }
                class068892.y(0.19634955f);
            }
        }
    }

    @Override
    public void N(class04782 class047822) {
        ++this.i;
        if (this.i >= 200) {
            if (this.R >= 4) {
                this.N.W().N(class00702.i);
            } else {
                this.N.W().N(class00702.M);
            }
        } else if (this.i == 10) {
            double d;
            class06889 class068892 = new class06889(this.N.L.method_23317() - this.N.method_23317(), 0.0, this.N.L.method_23321() - this.N.method_23321()).u();
            float f = 5.0f;
            double d2 = this.N.L.method_23317() + class068892.M * 5.0 / 2.0;
            double d3 = this.N.L.method_23321() + class068892.Z * 5.0 / 2.0;
            double d4 = d = this.N.L.method_23323(0.5);
            class07218 class072182 = new class07218(d2, d4, d3);
            while (class047822.R((class07209)class072182)) {
                if ((d4 -= 1.0) < 0.0) {
                    d4 = d;
                    break;
                }
                class072182.N(d2, d4, d3);
            }
            d4 = class04995.N((double)d4) + 1;
            this.M = new class07048((class07299)class047822, d2, d4, d3);
            this.M.N((class07438)this.N);
            this.M.N(5.0f);
            this.M.N(200);
            this.M.N((class07126)class00473.N((class07103)class07107.Z, (float)1.0f));
            this.M.y(0.25f);
            this.M.N(new class07055(class07047.M));
            class047822.method_8649((class07049)this.M);
        }
    }
}

