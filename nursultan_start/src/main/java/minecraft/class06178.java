/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00040
 *  minecraft.class00044
 *  minecraft.class00252
 *  minecraft.class00279
 *  minecraft.class00282
 *  minecraft.class00299
 *  minecraft.class00311
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01463
 *  minecraft.class01894
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class06608
 *  minecraft.class06613
 *  minecraft.class07299
 *  minecraft.class07482
 *  minecraft.class08036
 *  minecraft.class08044
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class00040;
import minecraft.class00044;
import minecraft.class00252;
import minecraft.class00279;
import minecraft.class00282;
import minecraft.class00299;
import minecraft.class00311;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01463;
import minecraft.class01894;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class06146;
import minecraft.class06156;
import minecraft.class06202;
import minecraft.class06608;
import minecraft.class06613;
import minecraft.class07299;
import minecraft.class07482;
import minecraft.class08036;
import minecraft.class08044;
import minecraft.class08394;

public class class06178
extends class01463<class06146> {
    private static final class01894 N = class01894.y((String)"container/stonecutter/scroller");
    private static final class01894 y = class01894.y((String)"container/stonecutter/scroller_disabled");
    private static final class01894 L = class01894.y((String)"container/stonecutter/recipe_selected");
    private static final class01894 u = class01894.y((String)"container/stonecutter/recipe_highlighted");
    private static final class01894 n = class01894.y((String)"container/stonecutter/recipe");
    private static final class01894 t = class01894.y((String)"textures/gui/container/stonecutter.png");
    private static final int G = 12;
    private static final int l = 15;
    private static final int d = 4;
    private static final int w = 3;
    private static final int k = 16;
    private static final int Y = 18;
    private static final int Q = 54;
    private static final int O = 52;
    private static final int g = 14;
    private float I;
    private boolean J;
    private int o;
    private boolean q;

    private void L() {
        this.q = ((class06146)this.m).P();
        if (!this.q) {
            this.I = 0.0f;
            this.o = 0;
        }
    }

    public class06178(class06146 class061462, class08044 class080442, class00392 class003922) {
        super((class07482)class061462, class080442, class003922);
        class061462.N(this::L);
        --this.U;
    }

    private boolean y() {
        return this.q && ((class06146)this.m).m() > 12;
    }

    protected int N() {
        return (((class06146)this.m).m() + 4 - 1) / 4 - 3;
    }

    protected void N(class01054 class010542, float f, int n, int n2) {
        int n3 = this.T;
        int n4 = this.b;
        class010542.N(class08394.Na, t, n3, n4, 0.0f, 0.0f, this.B, this.Z, 256, 256);
        int n5 = (int)(41.0f * this.I);
        class01894 class018942 = this.y() ? N : y;
        int n6 = n3 + 119;
        int n7 = n4 + 15 + n5;
        class010542.N(class08394.Na, class018942, n6, n7, 12, 15);
        if (n >= n6 && n < n6 + 12 && n2 >= n7 && n2 < n7 + 15) {
            class010542.N(this.J ? class06608.i : class06608.u);
        }
        int n8 = this.T + 52;
        int n9 = this.b + 14;
        int n10 = this.o + 12;
        this.N(class010542, n, n2, n8, n9, n10);
        this.N(class010542, n8, n9, n10);
    }

    private void N(class01054 class010542, int n, int n2, int n3, int n4, int n5) {
        for (int i = this.o; i < n5 && i < ((class06146)this.m).m(); ++i) {
            int n6 = i - this.o;
            int n7 = n3 + n6 % 4 * 16;
            int n8 = n6 / 4;
            int n9 = n4 + n8 * 18 + 2;
            class01894 class018942 = i == ((class06146)this.m).E() ? L : (n >= n7 && n2 >= n9 && n < n7 + 16 && n2 < n9 + 18 ? u : class06178.n);
            int n10 = n9 - 1;
            class010542.N(class08394.Na, class018942, n7, n10, 16, 18);
            if (n < n7 || n2 < n10 || n >= n7 + 16 || n2 >= n10 + 18) continue;
            class010542.N(class06608.u);
        }
    }

    private void N(class01054 class010542, int n, int n2, int n3) {
        class00279<class06156> var5 = ((class06146)this.m).W();
        class00311 class003112 = class00282.N((class07299)((class03448)this.field_22787.T_3));
        for (int i = this.o; i < n3 && i < var5.u(); ++i) {
            int n4 = i - this.o;
            int n5 = n + n4 % 4 * 16;
            int n6 = n4 / 4;
            int n7 = n2 + n6 * 18 + 2;
            class00299 class002992 = ((class00252)var5.i().get(i)).L().y();
            class010542.N(class002992.y(class003112), n5, n7);
        }
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.a_(class010542, n, n2);
    }

    public boolean method_25403(class06613 class066132, double d, double d2) {
        if (this.J && this.y()) {
            int n = this.b + 14;
            int n2 = n + 54;
            this.I = ((float)class066132.t() - (float)n - 7.5f) / ((float)(n2 - n) - 15.0f);
            this.I = class04995.N((float)this.I, (float)0.0f, (float)1.0f);
            this.o = (int)((double)(this.I * (float)this.N()) + 0.5) * 4;
            return true;
        }
        return super.method_25403(class066132, d, d2);
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        if (super.method_25401(d, d2, d3, d4)) {
            return true;
        }
        if (this.y()) {
            int n = this.N();
            float f = (float)d4 / (float)n;
            this.I = class04995.N((float)(this.I - f), (float)0.0f, (float)1.0f);
            this.o = (int)((double)(this.I * (float)n) + 0.5) * 4;
        }
        return true;
    }

    public boolean method_25406(class06613 class066132) {
        this.J = false;
        return super.method_25406(class066132);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.q) {
            int n = this.T + 52;
            int n2 = this.b + 14;
            int n3 = this.o + 12;
            for (int i = this.o; i < n3; ++i) {
                int n4 = i - this.o;
                double d = class066132.n() - (double)(n + n4 % 4 * 16);
                double d2 = class066132.t() - (double)(n2 + n4 / 4 * 18);
                if (!(d >= 0.0) || !(d2 >= 0.0) || !(d < 16.0) || !(d2 < 18.0) || !((class06146)this.m).y((class08036)((class04453)this.field_22787.T_4), i)) continue;
                class06202.Nq().Nr().N((class00044)class00040.N((class04891)class04909.OX, (float)1.0f));
                ((class03443)this.field_22787.T_2).N(((class06146)this.m).b, i);
                return true;
            }
            n = this.T + 119;
            n2 = this.b + 9;
            if (class066132.n() >= (double)n && class066132.n() < (double)(n + 12) && class066132.t() >= (double)n2 && class066132.t() < (double)(n2 + 54)) {
                this.J = true;
            }
        }
        return super.method_25402(class066132, bl);
    }

    protected void a_(class01054 class010542, int n, int n2) {
        super.a_(class010542, n, n2);
        if (this.q) {
            int n3 = this.T + 52;
            int n4 = this.b + 14;
            int n5 = this.o + 12;
            class00279<class06156> var7 = ((class06146)this.m).W();
            for (int i = this.o; i < n5 && i < var7.u(); ++i) {
                int n6 = i - this.o;
                int n7 = n3 + n6 % 4 * 16;
                int n8 = n4 + n6 / 4 * 18 + 2;
                if (n < n7 || n >= n7 + 16 || n2 < n8 || n2 >= n8 + 18) continue;
                class00311 class003112 = class00282.N((class07299)((class03448)this.field_22787.T_3));
                class00299 class002992 = ((class00252)var7.i().get(i)).L().y();
                class010542.y(this.field_22793, class002992.y(class003112), n, n2);
            }
        }
    }
}

