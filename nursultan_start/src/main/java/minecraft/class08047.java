/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01194
 *  minecraft.class01231
 *  minecraft.class01894
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02484
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class03696
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04856
 *  minecraft.class04882
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06266
 *  minecraft.class06506
 *  minecraft.class06517
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07085
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07150
 *  minecraft.class07172
 *  minecraft.class07299
 *  minecraft.class07427
 *  minecraft.class07438
 *  minecraft.class07463
 *  minecraft.class07469
 *  minecraft.class07471
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class08591
 */
package minecraft;

import minecraft.class01194;
import minecraft.class01231;
import minecraft.class01894;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02484;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class03696;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04856;
import minecraft.class04882;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06266;
import minecraft.class06506;
import minecraft.class06517;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07085;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07150;
import minecraft.class07172;
import minecraft.class07299;
import minecraft.class07427;
import minecraft.class07438;
import minecraft.class07463;
import minecraft.class07469;
import minecraft.class07471;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07956;
import minecraft.class07957;
import minecraft.class07962;
import minecraft.class07984;
import minecraft.class07989;
import minecraft.class08005;
import minecraft.class08036;
import minecraft.class08591;

public class class08047
extends class04882
implements class07172 {
    private static final class01894 N = class01894.y((String)"drinking");
    private static final class07471 y = new class07471(N, -0.25, class07463.field_6328);
    private static final class02131<Boolean> R = class03289.N(class08047.class, (class04383)class02154.U);
    private int M;
    private class06266<class04882> B;
    private class04856<class08036> Z;

    public boolean M() {
        return (Boolean)this.method_5841().N(R);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(R, (Object)false);
    }

    public void method_5711(byte by) {
        if (by == 15) {
            for (int i = 0; i < this.field_5974.y(35) + 10; ++i) {
                this.method_73183().method_8406((class07126)class07107.Nb, this.method_23317() + this.field_5974.E() * (double)0.13f, this.method_5829().i + 0.5 + this.field_5974.E() * (double)0.13f, this.method_23321() + this.field_5974.E() * (double)0.13f, 0.0, 0.0, 0.0);
            }
        } else {
            super.method_5711(by);
        }
    }

    public class08047(class07078<? extends class08047> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public static class05300 B() {
        return class07150.Y().N(class05298.n, 26.0).N(class05298.l, 0.25);
    }

    protected class04891 s() {
        return class04909.IH;
    }

    public boolean v() {
        return false;
    }

    public class04891 E() {
        return class04909.Ic;
    }

    public void N(class04782 class047822, int n, boolean bl) {
    }

    public void N(boolean bl) {
        this.method_5841().N(R, (Object)bl);
    }

    public void N(class07438 class074382, float f) {
        if (this.M()) {
            return;
        }
        class06889 class068892 = class074382.method_18798();
        double d = class074382.method_23317() + class068892.M - this.method_23317();
        double d2 = class074382.method_23320() - (double)1.1f - this.method_23318();
        double d3 = class074382.method_23321() + class068892.Z - this.method_23321();
        double d4 = Math.sqrt(d * d + d3 * d3);
        class03556 class035562 = class06506.k;
        if (class074382 instanceof class04882) {
            class035562 = class074382.method_6032() <= 4.0f ? class06506.d : class06506.I;
            this.y(null);
        } else if (d4 >= 8.0 && !class074382.method_6059(class07047.y)) {
            class035562 = class06506.T;
        } else if (class074382.method_6032() >= 8.0f && !class074382.method_6059(class07047.j)) {
            class035562 = class06506.Q;
        } else if (d4 <= 3.0 && !class074382.method_6059(class07047.b) && this.field_5974.z() < 0.25f) {
            class035562 = class06506.e;
        }
        class07299 class072992 = this.method_73183();
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            class072992 = class06517.N((class06581)class06570.lO, (class03556)class035562);
            class08005.N(class08591::new, class047822, (class06584)class072992, (class07438)this, d, d2 + d4 * 0.2, d3, 0.75f, 8.0f);
        }
        if (!this.method_5701()) {
            this.method_73183().method_43128(null, this.method_23317(), this.method_23318(), this.method_23321(), class04909.IF, this.method_5634(), 1.0f, 0.8f + this.field_5974.z() * 0.4f);
        }
    }

    protected void l_() {
        super.l_();
        this.B = new class06266((class04882)this, class04882.class, true, (class074382, class047822) -> this.NQ() && class074382.method_5864() != class07078.yp);
        this.Z = new class04856((class04882)this, class08036.class, 10, true, false, null);
        this.e.N(1, (class07473)new class07427((class07079)this));
        this.e.N(2, (class07473)new class07984(this, 1.0, 60, 10.0f));
        this.e.N(2, (class07473)new class07957((class07475)this, 1.0));
        this.e.N(3, (class07473)new class07962((class07079)this, class08036.class, 8.0f));
        this.e.N(3, (class07473)new class07956((class07079)this));
        this.H.N(1, (class07473)new class07989((class07475)this, class04882.class));
        this.H.N(2, this.B);
        this.H.N(3, this.Z);
    }

    public class04891 method_6002() {
        return class04909.IX;
    }

    public void method_6007() {
        if (!this.method_73183().method_8608() && this.method_5805()) {
            this.B.E();
            if (this.B.U() <= 0) {
                this.Z.N(true);
            } else {
                this.Z.N(false);
            }
            if (this.M()) {
                if (this.M-- <= 0) {
                    this.N(false);
                    class06584 class065842 = this.method_6047();
                    this.method_5673(class07085.field_6173, class06584.E);
                    class06517 class065172 = (class06517)class065842.method_58694(class02484.h);
                    if (class065842.N(class06570.ns) && class065172 != null) {
                        class065172.N(arg_0 -> ((class08047)this).method_6092(arg_0), ((Float)class065842.a_(class02484.r, (Object)Float.valueOf(1.0f))).floatValue());
                    }
                    this.method_32876((class03556)class01194.E);
                    this.method_5996(class05298.l).L(y.N());
                }
            } else {
                class03556 class035562 = null;
                if (this.field_5974.z() < 0.15f && this.method_5777(class01231.N) && !this.method_6059(class07047.W)) {
                    class035562 = class06506.G;
                } else if (this.field_5974.z() < 0.15f && (this.method_5809() || this.method_6081() != null && this.method_6081().N(class03696.Z)) && !this.method_6059(class07047.E)) {
                    class035562 = class06506.E;
                } else if (this.field_5974.z() < 0.05f && this.method_6032() < this.method_6063()) {
                    class035562 = class06506.d;
                } else if (this.field_5974.z() < 0.5f && this.T() != null && !this.method_6059(class07047.N) && this.T().method_5858((class07049)this) > 121.0) {
                    class035562 = class06506.m;
                }
                if (class035562 != null) {
                    this.method_5673(class07085.field_6173, class06517.N((class06581)class06570.ns, (class03556)class035562));
                    this.M = this.method_6047().N((class07438)this);
                    this.N(true);
                    if (!this.method_5701()) {
                        this.method_73183().method_43128(null, this.method_23317(), this.method_23318(), this.method_23321(), class04909.Ia, this.method_5634(), 1.0f, 0.8f + this.field_5974.z() * 0.4f);
                    }
                    class07469 class074692 = this.method_5996(class05298.l);
                    class074692.L(N);
                    class074692.y(y);
                }
            }
            if (this.field_5974.z() < 7.5E-4f) {
                this.method_73183().method_8421((class07049)this, (byte)15);
            }
        }
        super.method_6007();
    }

    public float method_6036(class07072 class070722, float f) {
        f = super.method_6036(class070722, f);
        if (class070722.u() == this) {
            f = 0.0f;
        }
        if (class070722.N(class03696.U)) {
            f *= 0.15f;
        }
        return f;
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.Ip;
    }
}

