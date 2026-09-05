/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01463
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class04654
 *  minecraft.class04995
 *  minecraft.class05216
 *  minecraft.class05666
 *  minecraft.class05936
 *  minecraft.class06584
 *  minecraft.class06608
 *  minecraft.class06613
 *  minecraft.class06952
 *  minecraft.class07316
 *  minecraft.class07324
 *  minecraft.class07351
 *  minecraft.class07482
 *  minecraft.class08044
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01463;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class04654;
import minecraft.class04995;
import minecraft.class05216;
import minecraft.class05393;
import minecraft.class05666;
import minecraft.class05936;
import minecraft.class06584;
import minecraft.class06608;
import minecraft.class06613;
import minecraft.class06952;
import minecraft.class07316;
import minecraft.class07324;
import minecraft.class07351;
import minecraft.class07482;
import minecraft.class08044;
import minecraft.class08394;

public class class05417
extends class01463<class06952> {
    private static final class01894 y = class01894.y((String)"container/villager/out_of_stock");
    private static final class01894 L = class01894.y((String)"container/villager/experience_bar_background");
    private static final class01894 u = class01894.y((String)"container/villager/experience_bar_current");
    private static final class01894 n = class01894.y((String)"container/villager/experience_bar_result");
    private static final class01894 t = class01894.y((String)"container/villager/scroller");
    private static final class01894 G = class01894.y((String)"container/villager/scroller_disabled");
    private static final class01894 l = class01894.y((String)"container/villager/trade_arrow_out_of_stock");
    private static final class01894 d = class01894.y((String)"container/villager/trade_arrow");
    private static final class01894 w = class01894.y((String)"container/villager/discount_strikethrough");
    private static final class01894 k = class01894.y((String)"textures/gui/container/villager.png");
    private static final int Y = 512;
    private static final int Q = 256;
    private static final int O = 99;
    private static final int g = 136;
    private static final int I = 16;
    private static final int J = 5;
    private static final int o = 35;
    private static final int q = 68;
    private static final int K = 6;
    private static final int V = 7;
    private static final int e = 5;
    private static final int H = 20;
    private static final int c = 88;
    private static final int X = 27;
    private static final int a = 6;
    private static final int p = 139;
    private static final int F = 18;
    private static final int A = 94;
    private static final class00392 f = class00392.L((String)"merchant.trades");
    private static final class00392 C = class00392.L((String)"merchant.deprecated");
    private int S;
    private final class05393[] x = new class05393[7];
    int N;
    private boolean D;

    static /* synthetic */ class01590 L(class05417 class054172) {
        return class054172.field_22793;
    }

    public class05417(class06952 class069522, class08044 class080442, class00392 class003922) {
        super((class07482)class069522, class080442, class003922);
        this.B = 276;
        this.E = 107;
    }

    protected void u(class01054 class010542, int n, int n2) {
        int n3 = ((class06952)this.m).m();
        if (n3 > 0 && n3 <= 5 && ((class06952)this.m).T()) {
            class05216 class052162 = class00392.N((String)"merchant.title", (Object[])new Object[]{this.field_22785, class00392.L((String)("merchant.level." + n3))});
            int n4 = this.field_22793.N((class05936)class052162);
            int n5 = 49 + this.B / 2 - n4 / 2;
            class010542.N(this.field_22793, (class00392)class052162, n5, 6, -12566464, false);
        } else {
            class010542.N(this.field_22793, this.field_22785, 49 + this.B / 2 - this.field_22793.N((class05936)this.field_22785) / 2, 6, -12566464, false);
        }
        class010542.N(this.field_22793, this.P, this.E, this.W, -12566464, false);
        int n6 = this.field_22793.N((class05936)f);
        class010542.N(this.field_22793, f, 5 - n6 / 2 + 48, 6, -12566464, false);
    }

    static /* synthetic */ class01590 y(class05417 class054172) {
        return class054172.field_22793;
    }

    private void N(class01054 class010542, class06584 class065842, class06584 class065843, int n, int n2) {
        class010542.y(class065842, n, n2);
        if (class065843.c() == class065842.c()) {
            class010542.N(this.field_22793, class065842, n, n2);
        } else {
            class010542.N(this.field_22793, class065843, n, n2, class065843.c() == 1 ? "1" : null);
            class010542.N(this.field_22793, class065842, n + 14, n2, class065842.c() == 1 ? "1" : null);
            class010542.N(class08394.Na, w, n + 7, n2 + 12, 9, 2);
        }
    }

    private boolean N(int n) {
        return n > 7;
    }

    static /* synthetic */ class01590 N(class05417 class054172) {
        return class054172.field_22793;
    }

    private void N() {
        ((class06952)this.m).N(this.S);
        ((class06952)this.m).B(this.S);
        this.field_22787.NE().N((class00381)new class07351(this.S));
    }

    private void N(class01054 class010542, int n, int n2, int n3, int n4, class07316 class073162) {
        int n5 = class073162.size() + 1 - 7;
        if (n5 > 1) {
            int n6 = 139 - (27 + (n5 - 1) * 139 / n5);
            int n7 = 1 + n6 / n5 + 139 / n5;
            int n8 = 113;
            int n9 = Math.min(113, this.N * n7);
            if (this.N == n5 - 1) {
                n9 = 113;
            }
            int n10 = n + 94;
            int n11 = n2 + 18 + n9;
            class010542.N(class08394.Na, t, n10, n11, 6, 27);
            if (n3 >= n10 && n3 < n + 94 + 6 && n4 >= n11 && n4 <= n11 + 27) {
                class010542.N(this.D ? class06608.i : class06608.u);
            }
        } else {
            class010542.N(class08394.Na, G, n + 94, n2 + 18, 6, 27);
        }
    }

    private void N(class01054 class010542, int n, int n2, class07324 class073242) {
        int n3 = ((class06952)this.m).m();
        int n4 = ((class06952)this.m).E();
        if (n3 >= 5) {
            return;
        }
        class010542.N(class08394.Na, L, n + 136, n2 + 16, 102, 5);
        int n5 = class05666.y((int)n3);
        if (n4 < n5 || !class05666.u((int)n3)) {
            return;
        }
        int n6 = 102;
        float f = 102.0f / (float)(class05666.L((int)n3) - n5);
        int n7 = Math.min(class04995.y((float)(f * (float)(n4 - n5))), 102);
        class010542.N(class08394.Na, u, 102, 5, 0, 0, n + 136, n2 + 16, n7, 5);
        int n8 = ((class06952)this.m).W();
        if (n8 > 0) {
            int n9 = Math.min(class04995.y((float)((float)n8 * f)), 102 - n7);
            class010542.N(class08394.Na, class05417.n, 102, 5, n7, 0, n + 136 + n7, n2 + 16, n9, 5);
        }
    }

    protected void N(class01054 class010542, float f, int n, int n2) {
        int n3 = (this.field_22789 - this.B) / 2;
        int n4 = (this.field_22790 - this.Z) / 2;
        class010542.N(class08394.Na, k, n3, n4, 0.0f, 0.0f, this.B, this.Z, 512, 256);
        class07316 class073162 = ((class06952)this.m).s();
        if (!class073162.isEmpty()) {
            int n5 = this.S;
            if (n5 < 0 || n5 >= class073162.size()) {
                return;
            }
            if (((class07324)class073162.get(n5)).b()) {
                class010542.N(class08394.Na, y, this.T + 83 + 99, this.b + 35, 28, 21);
            }
        }
    }

    private void N(class01054 class010542, class07324 class073242, int n, int n2) {
        if (class073242.b()) {
            class010542.N(class08394.Na, l, n + 5 + 35 + 20, n2 + 3, 10, 9);
        } else {
            class010542.N(class08394.Na, d, n + 5 + 35 + 20, n2 + 3, 10, 9);
        }
    }

    public void N(class01054 class010542, int n, int n2, float f) {
        super.N(class010542, n, n2, f);
        class07316 class073162 = ((class06952)this.m).s();
        if (!class073162.isEmpty()) {
            class07324 class07324222;
            int n3 = (this.field_22789 - this.B) / 2;
            int n4 = (this.field_22790 - this.Z) / 2;
            int n5 = n4 + 16 + 1;
            int n6 = n3 + 5 + 5;
            this.N(class010542, n3, n4, n, n2, class073162);
            int n7 = 0;
            for (class07324 class07324222 : class073162) {
                if (this.N(class073162.size()) && (n7 < this.N || n7 >= 7 + this.N)) {
                    ++n7;
                    continue;
                }
                class05393[] class05393Array = class07324222.N();
                class06584 class065842 = class07324222.y();
                class06584 class065843 = class07324222.L();
                class06584 object = class07324222.R();
                int n8 = n5 + 2;
                this.N(class010542, class065842, (class06584)class05393Array, n6, n8);
                if (!class065843.R()) {
                    class010542.y(class065843, n3 + 5 + 35, n8);
                    class010542.N(this.field_22793, class065843, n3 + 5 + 35, n8);
                }
                this.N(class010542, class07324222, n3, n8);
                class010542.y(object, n3 + 5 + 68, n8);
                class010542.N(this.field_22793, object, n3 + 5 + 68, n8);
                n5 += 20;
                ++n7;
            }
            int n9 = this.S;
            class07324222 = (class07324)class073162.get(n9);
            if (((class06952)this.m).T()) {
                this.N(class010542, n3, n4, class07324222);
            }
            if (class07324222.b() && this.N(186, 35, 22, 21, n, n2) && ((class06952)this.m).P()) {
                class010542.N(this.field_22793, C, n, n2);
            }
            for (class05393 class053932 : this.x) {
                if (class053932.method_25367()) {
                    class053932.N(class010542, n, n2);
                }
                class053932.field_22764 = class053932.N < ((class06952)this.m).s().size();
            }
        }
        this.a_(class010542, n, n2);
    }

    public void method_25426() {
        super.method_25426();
        int n = (this.field_22789 - this.B) / 2;
        int n2 = (this.field_22790 - this.Z) / 2 + 16 + 2;
        for (int i = 0; i < 7; ++i) {
            this.x[i] = (class05393)this.method_37063((class04654)new class05393(this, n + 5, n2, i, class053622 -> {
                if (class053622 instanceof class05393) {
                    this.S = ((class05393)class053622).y() + this.N;
                    this.N();
                }
            }));
            n2 += 20;
        }
    }

    public boolean method_25403(class06613 class066132, double d, double d2) {
        int n = ((class06952)this.m).s().size();
        if (this.D) {
            int n2 = this.b + 18;
            int n3 = n2 + 139;
            int n4 = n - 7;
            float f = ((float)class066132.t() - (float)n2 - 13.5f) / ((float)(n3 - n2) - 27.0f);
            f = f * (float)n4 + 0.5f;
            this.N = class04995.N((int)((int)f), (int)0, (int)n4);
            return true;
        }
        return super.method_25403(class066132, d, d2);
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        if (super.method_25401(d, d2, d3, d4)) {
            return true;
        }
        int n = ((class06952)this.m).s().size();
        if (this.N(n)) {
            int n2 = n - 7;
            this.N = class04995.N((int)((int)((double)this.N - d4)), (int)0, (int)n2);
        }
        return true;
    }

    public boolean method_25406(class06613 class066132) {
        this.D = false;
        return super.method_25406(class066132);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        int n = (this.field_22789 - this.B) / 2;
        int n2 = (this.field_22790 - this.Z) / 2;
        if (this.N(((class06952)this.m).s().size()) && class066132.n() > (double)(n + 94) && class066132.n() < (double)(n + 94 + 6) && class066132.t() > (double)(n2 + 18) && class066132.t() <= (double)(n2 + 18 + 139 + 1)) {
            this.D = true;
        }
        return super.method_25402(class066132, bl);
    }
}

