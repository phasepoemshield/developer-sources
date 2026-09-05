/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01231
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class06139
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07618
 */
package minecraft;

import minecraft.class01231;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class06139;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07618;

public class class07961
extends class06139 {
    private static final int[] N = new int[]{0, 1, 4, 5, 6, 7};
    private final class07618 y;
    private final int L;
    private boolean u;

    public void L() {
        class07211 class072112 = this.y.method_5755();
        this.y.method_18799(this.y.method_18798().y((double)class072112.P() * 0.6, 0.7, (double)class072112.T() * 0.6));
        this.y.f().W();
    }

    public class07961(class07618 class076182, int n) {
        this.y = class076182;
        this.L = class07961.y((int)n);
    }

    public void i() {
        class06889 class068892;
        boolean bl = this.u;
        if (!bl) {
            class068892 = this.y.method_73183().method_8316(this.y.method_24515());
            this.u = class068892.N(class01231.N);
        }
        if (this.u && !bl) {
            this.y.method_5783(class04909.Zk, 1.0f, 1.0f);
        }
        class068892 = this.y.method_18798();
        if (class068892.B * class068892.B < (double)0.03f && this.y.method_36455() != 0.0f) {
            this.y.method_36457(class04995.Z((float)0.2f, (float)this.y.method_36455(), (float)0.0f));
        } else if (class068892.M() > (double)1.0E-5f) {
            double d = class068892.Z();
            double d2 = Math.atan2(-class068892.B, d) * 57.2957763671875;
            this.y.method_36457((float)d2);
        }
    }

    public void u() {
        this.y.method_36457(0.0f);
    }

    public boolean y() {
        double d = this.y.method_18798().B;
        return !(d * d < (double)0.03f && this.y.method_36455() != 0.0f && Math.abs(this.y.method_36455()) < 10.0f && this.y.method_5799() || this.y.method_24828());
    }

    private boolean y(class07209 class072092, int n, int n2, int n3) {
        return this.y.method_73183().method_8320(class072092.method_10069(n * n3, 1, n2 * n3)).P() && this.y.method_73183().method_8320(class072092.method_10069(n * n3, 2, n2 * n3)).P();
    }

    public boolean N() {
        if (this.y.method_59922().y(this.L) != 0) {
            return false;
        }
        class07211 class072112 = this.y.method_5755();
        int n = class072112.P();
        int n2 = class072112.T();
        class07209 class072092 = this.y.method_24515();
        for (int n3 : N) {
            if (this.N(class072092, n, n2, n3) && this.y(class072092, n, n2, n3)) continue;
            return false;
        }
        return true;
    }

    private boolean N(class07209 class072092, int n, int n2, int n3) {
        class07209 class072093 = class072092.method_10069(n * n3, 0, n2 * n3);
        return this.y.method_73183().method_8316(class072093).N(class01231.N) && !this.y.method_73183().method_8320(class072093).M();
    }

    public boolean O_() {
        return false;
    }
}

