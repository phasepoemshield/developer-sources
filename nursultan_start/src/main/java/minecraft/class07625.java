/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00803
 *  minecraft.class01251
 *  minecraft.class01279
 *  minecraft.class01517
 *  minecraft.class02131
 *  minecraft.class02135
 *  minecraft.class02154
 *  minecraft.class02812
 *  minecraft.class02842
 *  minecraft.class03289
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05192
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05487
 *  minecraft.class05696
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07542
 *  minecraft.class07550
 *  minecraft.class07952
 *  minecraft.class07956
 *  minecraft.class07962
 *  minecraft.class07971
 *  minecraft.class07975
 *  minecraft.class07989
 *  minecraft.class07995
 *  minecraft.class07999
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08372
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00803;
import minecraft.class01251;
import minecraft.class01279;
import minecraft.class01517;
import minecraft.class02131;
import minecraft.class02135;
import minecraft.class02154;
import minecraft.class02812;
import minecraft.class02842;
import minecraft.class03289;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05192;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05487;
import minecraft.class05696;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07542;
import minecraft.class07550;
import minecraft.class07649;
import minecraft.class07952;
import minecraft.class07956;
import minecraft.class07962;
import minecraft.class07971;
import minecraft.class07975;
import minecraft.class07989;
import minecraft.class07995;
import minecraft.class07999;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08372;
import org.jspecify.annotations.Nullable;

public class class07625
extends class07649
implements class01279 {
    protected static final class02131<Byte> N = class03289.N(class07625.class, (class04383)class02154.N);
    private static final int y = 25;
    private static final boolean L = false;
    private int u;
    private int i;
    private static final class02135 R = class01517.N((int)20, (int)39);
    private long M;
    private @Nullable class08372<class07438> B;

    public void M(boolean bl) {
        byte by = (Byte)this.field_6011.N(N);
        if (bl) {
            this.field_6011.N(N, (Object)((byte)(by | 1)));
        } else {
            this.field_6011.N(N, (Object)((byte)(by & 0xFFFFFFFE)));
        }
    }

    public static class05300 M() {
        return class07079.H().N(class05298.n, 100.0).N(class05298.l, 0.25).N(class05298.b, 1.0).N(class05298.u, 15.0).N(class05298.O, 1.0);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(N, (Object)0);
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        class02842 class028422 = this.m();
        boolean bl = super.method_64397(class047822, class070722, f);
        if (bl && this.m() != class028422) {
            this.method_5783(class04909.sv, 1.0f, 1.0f);
        }
        return bl;
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(class04909.sl, 1.0f, 1.0f);
    }

    public boolean method_27298() {
        return this.method_18798().z() > 2.500000277905201E-7 && this.field_5974.y(5) == 0;
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("PlayerCreated", this.t());
        this.N(class083292);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.M(class082992.N("PlayerCreated", false));
        this.N(this.method_73183(), class082992);
    }

    public void method_5711(byte by) {
        if (by == 4) {
            this.u = 10;
            this.method_5783(class04909.sj, 1.0f, 1.0f);
        } else if (by == 11) {
            this.i = 400;
        } else if (by == 34) {
            this.i = 0;
        } else {
            super.method_5711(by);
        }
    }

    public class07625(class07078<? extends class07625> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public int n() {
        return this.i;
    }

    public class02842 m() {
        return class02812.N.N(this.method_6032() / this.method_6063());
    }

    public boolean t() {
        return ((Byte)this.field_6011.N(N) & 1) != 0;
    }

    public int v() {
        return this.u;
    }

    public long E() {
        return this.M;
    }

    public void N(boolean bl) {
        if (bl) {
            this.i = 400;
            this.method_73183().method_8421((class07049)this, (byte)11);
        } else {
            this.i = 0;
            this.method_73183().method_8421((class07049)this, (byte)34);
        }
    }

    public boolean N(class05487 class054872) {
        class07209 class072092 = this.method_24515();
        class07209 class072093 = class072092.method_10074();
        if (class054872.method_8320(class072093).y((class07290)class054872, class072093, (class07049)this)) {
            for (int i = 1; i < 3; ++i) {
                class00500 class005002;
                class07209 class072094 = class072092.method_10086(i);
                if (class00803.N((class07290)class054872, (class07209)class072094, (class00500)(class005002 = class054872.method_8320(class072094)), (class04688)class005002.Y(), (class07078)class07078.Nn)) continue;
                return false;
            }
            return class00803.N((class07290)class054872, (class07209)class072092, (class00500)class054872.method_8320(class072092), (class04688)class04684.N.M(), (class07078)class07078.Nn) && class054872.method_8606((class07049)this);
        }
        return false;
    }

    protected class07082 N(class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        if (!class065842.N(class06570.TM)) {
            return class07082.i;
        }
        float f = this.method_6032();
        this.method_6025(25.0f);
        if (this.method_6032() == f) {
            return class07082.i;
        }
        float f2 = 1.0f + (this.field_5974.z() - this.field_5974.z()) * 0.2f;
        this.method_5783(class04909.sG, 1.0f, f2);
        class065842.N(1, (class07438)class080362);
        return class07082.N;
    }

    public void N(long l) {
        this.M = l;
    }

    public void N(@Nullable class08372<class07438> class083722) {
        this.B = class083722;
    }

    public @Nullable class08372<class07438> W() {
        return this.B;
    }

    private float G() {
        return (float)this.method_45325(class05298.u);
    }

    public class06889 ac_() {
        return new class06889(0.0, (double)(0.875f * this.method_5751()), (double)(this.method_17681() * 0.4f));
    }

    protected void l_() {
        this.e.N(1, (class07473)new class07999((class07475)this, 1.0, true));
        this.e.N(2, (class07473)new class07971((class07475)this, 0.9, 32.0f));
        this.e.N(2, (class07473)new class05696((class07475)this, 0.6, false));
        this.e.N(4, (class07473)new class05192((class07475)this, 0.6));
        this.e.N(5, (class07473)new class07995(this));
        this.e.N(7, (class07473)new class07962((class07079)this, class08036.class, 6.0f));
        this.e.N(8, (class07473)new class07956((class07079)this));
        this.H.N(1, (class07473)new class07975(this));
        this.H.N(2, (class07473)new class07989((class07475)this, new Class[0]));
        this.H.N(3, (class07473)new class07952((class07079)this, class08036.class, 10, true, false, (arg_0, arg_1) -> ((class07625)this).N(arg_0, arg_1)));
        this.H.N(3, (class07473)new class07952((class07079)this, class07079.class, 5, false, false, (class074382, class047822) -> class074382 instanceof class07542 && !(class074382 instanceof class07550)));
        this.H.N(4, (class07473)new class01251((class07079)this, false));
    }

    public void method_6087(class07049 class070492) {
        if (class070492 instanceof class07542 && !(class070492 instanceof class07550) && this.method_59922().y(20) == 0) {
            this.y((class07438)class070492);
        }
        super.method_6087(class070492);
    }

    @Override
    public class04891 method_6002() {
        return class04909.sn;
    }

    public void method_6007() {
        super.method_6007();
        if (this.u > 0) {
            --this.u;
        }
        if (this.i > 0) {
            --this.i;
        }
        if (!this.method_73183().method_8608()) {
            this.N((class04782)this.method_73183(), true);
        }
    }

    public int method_6130(int n) {
        return n;
    }

    public boolean method_6121(class04782 class047822, class07049 class070492) {
        this.u = 10;
        class047822.method_8421((class07049)this, (byte)4);
        float f = this.G();
        float f2 = (int)f > 0 ? f / 2.0f + (float)this.field_5974.y((int)f) : f;
        class07072 class070722 = this.method_48923().y((class07438)this);
        boolean bl = class070492.method_64397(class047822, class070722, f2);
        if (bl) {
            double d;
            if (class070492 instanceof class07438) {
                class07438 class074382 = (class07438)class070492;
                d = class074382.method_45325(class05298.b);
            } else {
                d = 0.0;
            }
            double d2 = d;
            double d3 = Math.max(0.0, 1.0 - d2);
            class070492.method_18799(class070492.method_18798().y(0.0, (double)0.4f * d3, 0.0));
            class07323.N((class04782)class047822, (class07049)class070492, (class07072)class070722);
        }
        this.method_5783(class04909.sj, 1.0f, 1.0f);
        return bl;
    }

    public void method_6078(class07072 class070722) {
        super.method_6078(class070722);
    }

    @Override
    public class04891 method_6011(class07072 class070722) {
        return class04909.st;
    }

    public boolean method_5973(class07078<?> class070782) {
        if (this.t() && class070782 == class07078.Ly) {
            return false;
        }
        if (class070782 == class07078.q) {
            return false;
        }
        return super.method_5973(class070782);
    }

    public void W_() {
        this.y(R.N(this.field_5974));
    }
}

