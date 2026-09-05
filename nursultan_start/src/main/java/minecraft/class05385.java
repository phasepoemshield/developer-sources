/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00040
 *  minecraft.class00044
 *  minecraft.class00392
 *  minecraft.class00412
 *  minecraft.class01054
 *  minecraft.class01463
 *  minecraft.class01540
 *  minecraft.class01686
 *  minecraft.class01894
 *  minecraft.class02484
 *  minecraft.class02708
 *  minecraft.class03386
 *  minecraft.class03443
 *  minecraft.class03556
 *  minecraft.class04453
 *  minecraft.class04802
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05911
 *  minecraft.class06202
 *  minecraft.class06559
 *  minecraft.class06563
 *  minecraft.class06584
 *  minecraft.class06608
 *  minecraft.class06613
 *  minecraft.class06920
 *  minecraft.class06937
 *  minecraft.class06951
 *  minecraft.class07482
 *  minecraft.class08036
 *  minecraft.class08044
 *  minecraft.class08388
 *  minecraft.class08394
 *  minecraft.class08842
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import minecraft.class00040;
import minecraft.class00044;
import minecraft.class00392;
import minecraft.class00412;
import minecraft.class01054;
import minecraft.class01463;
import minecraft.class01540;
import minecraft.class01686;
import minecraft.class01894;
import minecraft.class02484;
import minecraft.class02708;
import minecraft.class03386;
import minecraft.class03443;
import minecraft.class03556;
import minecraft.class04453;
import minecraft.class04802;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05911;
import minecraft.class06202;
import minecraft.class06559;
import minecraft.class06563;
import minecraft.class06584;
import minecraft.class06608;
import minecraft.class06613;
import minecraft.class06920;
import minecraft.class06937;
import minecraft.class06951;
import minecraft.class07482;
import minecraft.class08036;
import minecraft.class08044;
import minecraft.class08388;
import minecraft.class08394;
import minecraft.class08842;
import org.jspecify.annotations.Nullable;

public class class05385
extends class01463<class06951> {
    private static final class01894 N = class01894.y((String)"container/slot/banner");
    private static final class01894 y = class01894.y((String)"container/slot/dye");
    private static final class01894 L = class01894.y((String)"container/slot/banner_pattern");
    private static final class01894 u = class01894.y((String)"container/loom/scroller");
    private static final class01894 n = class01894.y((String)"container/loom/scroller_disabled");
    private static final class01894 t = class01894.y((String)"container/loom/pattern_selected");
    private static final class01894 G = class01894.y((String)"container/loom/pattern_highlighted");
    private static final class01894 l = class01894.y((String)"container/loom/pattern");
    private static final class01894 d = class01894.y((String)"container/loom/error");
    private static final class01894 w = class01894.y((String)"textures/gui/container/loom.png");
    private static final int k = 4;
    private static final int Y = 4;
    private static final int Q = 12;
    private static final int O = 15;
    private static final int g = 14;
    private static final int I = 56;
    private static final int J = 60;
    private static final int o = 13;
    private static final float q = 64.0f;
    private static final float K = 21.0f;
    private static final float V = 40.0f;
    private class08842 e;
    private @Nullable class02708 H;
    private class06584 c = class06584.E;
    private class06584 X = class06584.E;
    private class06584 a = class06584.E;
    private boolean p;
    private boolean F;
    private float A;
    private boolean f;
    private int C;

    public class05385(class06951 class069512, class08044 class080442, class00392 class003922) {
        super((class07482)class069512, class080442, class003922);
        class069512.N(this::y);
        this.U -= 2;
    }

    private void y() {
        class06584 class065842 = ((class06951)this.m).T().i();
        this.H = class065842.R() ? null : (class02708)class065842.a_(class02484.Nv, (Object)class02708.L);
        class06584 class065843 = ((class06951)this.m).m().i();
        class06584 class065844 = ((class06951)this.m).P().i();
        class06584 class065845 = ((class06951)this.m).s().i();
        class02708 class027082 = (class02708)class065843.a_(class02484.Nv, (Object)class02708.L);
        boolean bl = this.F = class027082.y().size() >= 6;
        if (this.F) {
            this.H = null;
        }
        if (!(class06584.N((class06584)class065843, (class06584)this.c) && class06584.N((class06584)class065844, (class06584)this.X) && class06584.N((class06584)class065845, (class06584)this.a))) {
            boolean bl2 = this.p = !class065843.R() && !class065844.R() && !this.F && !((class06951)this.m).E().isEmpty();
        }
        if (this.C >= this.N()) {
            this.C = 0;
            this.A = 0.0f;
        }
        this.c = class065843.t();
        this.X = class065844.t();
        this.a = class065845.t();
    }

    protected boolean N(double d, double d2, int n, int n2) {
        return d < (double)n || d2 < (double)n2 || d >= (double)(n + this.B) || d2 >= (double)(n2 + this.Z);
    }

    protected void N(class01054 class010542, float f, int n, int n2) {
        int n3;
        int n4 = this.T;
        int n5 = this.b;
        class010542.N(class08394.Na, w, n4, n5, 0.0f, 0.0f, this.B, this.Z, 256, 256);
        class06937 class069372 = ((class06951)this.m).m();
        class06937 class069373 = ((class06951)this.m).P();
        class06937 class069374 = ((class06951)this.m).s();
        class06937 class069375 = ((class06951)this.m).T();
        if (!class069372.R()) {
            class010542.N(class08394.Na, N, n4 + class069372.i, n5 + class069372.R, 16, 16);
        }
        if (!class069373.R()) {
            class010542.N(class08394.Na, y, n4 + class069373.i, n5 + class069373.R, 16, 16);
        }
        if (!class069374.R()) {
            class010542.N(class08394.Na, L, n4 + class069374.i, n5 + class069374.R, 16, 16);
        }
        int n6 = (int)(41.0f * this.A);
        class01894 class018942 = this.p ? u : class05385.n;
        int n7 = n4 + 119;
        int n8 = n5 + 13 + n6;
        class010542.N(class08394.Na, class018942, n7, n8, 12, 15);
        if (n >= n7 && n < n7 + 12 && n2 >= n8 && n2 < n8 + 15) {
            class010542.N(this.f ? class06608.i : class06608.u);
        }
        if (this.H != null && !this.F) {
            class06563 class065632 = ((class06920)class069375.i().B()).N();
            n3 = n4 + 141;
            int n9 = n5 + 8;
            class010542.N(this.e, class065632, this.H, n3, n9, n3 + 20, n9 + 40);
        } else if (this.F) {
            class010542.N(class08394.Na, d, n4 + class069375.i - 5, n5 + class069375.R - 5, 26, 26);
        }
        if (this.p) {
            int n10 = n4 + 60;
            n3 = n5 + 13;
            List var17 = ((class06951)this.m).E();
            block0: for (int i = 0; i < 4; ++i) {
                for (int j = 0; j < 4; ++j) {
                    class06563 class065633;
                    class01894 class018943;
                    boolean bl;
                    int n11 = (i + this.C) * 4 + j;
                    if (n11 >= var17.size()) break block0;
                    int n12 = n10 + j * 14;
                    int n13 = n3 + i * 14;
                    class03556 var24 = (class03556)var17.get(n11);
                    boolean bl2 = bl = n >= n12 && n2 >= n13 && n < n12 + 14 && n2 < n13 + 14;
                    if (n11 == ((class06951)this.m).W()) {
                        class018943 = t;
                    } else if (bl) {
                        class018943 = G;
                        class065633 = ((class06559)this.X.B()).N();
                        class010542.N((class00392)class00392.L((String)(((class00412)var24.N()).y() + "." + class065633.y())), n, n2);
                        class010542.N(class06608.u);
                    } else {
                        class018943 = l;
                    }
                    class010542.N(class08394.Na, class018943, n12, n13, 14, 14);
                    class065633 = class010542.N(class05911.N((class03556)var24));
                    this.N(class010542, n12, n13, (class08388)class065633);
                }
            }
        }
        ((class03386)class06202.Nq().i_5).v().N(class01540.field_60027);
    }

    private void N(class01054 class010542, int n, int n2, class08388 class083882) {
        class010542.i().pushMatrix();
        class010542.i().translate((float)(n + 4), (float)(n2 + 2));
        float f = class083882.method_4594();
        float f2 = f + (class083882.method_4577() - class083882.method_4594()) * 21.0f / 64.0f;
        float f3 = class083882.method_4575() - class083882.method_4593();
        float f4 = class083882.method_4593() + f3 / 64.0f;
        float f5 = f4 + f3 * 40.0f / 64.0f;
        int n3 = 5;
        int n4 = 10;
        class010542.N(0, 0, 5, 10, class06563.field_7944.L());
        class010542.N(class083882.method_45852(), 0, 0, 5, 10, f, f2, f4, f5);
        class010542.i().popMatrix();
    }

    private int N() {
        return class04995.R((int)((class06951)this.m).E().size(), (int)4);
    }

    public void method_25426() {
        super.method_25426();
        class01686 class016862 = this.field_22787.yt().N(class04802.s);
        this.e = new class08842(class016862);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.a_(class010542, n, n2);
    }

    public boolean method_25403(class06613 class066132, double d, double d2) {
        int n = this.N() - 4;
        if (this.f && this.p && n > 0) {
            int n2 = this.b + 13;
            int n3 = n2 + 56;
            this.A = ((float)class066132.t() - (float)n2 - 7.5f) / ((float)(n3 - n2) - 15.0f);
            this.A = class04995.N((float)this.A, (float)0.0f, (float)1.0f);
            this.C = Math.max((int)((double)(this.A * (float)n) + 0.5), 0);
            return true;
        }
        return super.method_25403(class066132, d, d2);
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        if (super.method_25401(d, d2, d3, d4)) {
            return true;
        }
        int n = this.N() - 4;
        if (this.p && n > 0) {
            float f = (float)d4 / (float)n;
            this.A = class04995.N((float)(this.A - f), (float)0.0f, (float)1.0f);
            this.C = Math.max((int)(this.A * (float)n + 0.5f), 0);
        }
        return true;
    }

    public boolean method_25406(class06613 class066132) {
        this.f = false;
        return super.method_25406(class066132);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.p) {
            int n = this.T + 60;
            int n2 = this.b + 13;
            for (int i = 0; i < 4; ++i) {
                for (int j = 0; j < 4; ++j) {
                    double d = class066132.n() - (double)(n + j * 14);
                    double d2 = class066132.t() - (double)(n2 + i * 14);
                    int n3 = (i + this.C) * 4 + j;
                    if (!(d >= 0.0) || !(d2 >= 0.0) || !(d < 14.0) || !(d2 < 14.0) || !((class06951)this.m).y((class08036)((class04453)this.field_22787.T_4), n3)) continue;
                    class06202.Nq().Nr().N((class00044)class00040.N((class04891)class04909.OV, (float)1.0f));
                    ((class03443)this.field_22787.T_2).N(((class06951)this.m).b, n3);
                    return true;
                }
            }
            n = this.T + 119;
            n2 = this.b + 9;
            if (class066132.n() >= (double)n && class066132.n() < (double)(n + 12) && class066132.t() >= (double)n2 && class066132.t() < (double)(n2 + 56)) {
                this.f = true;
            }
        }
        return super.method_25402(class066132, bl);
    }
}

