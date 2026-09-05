/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10750
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00734
 *  minecraft.class01001
 *  minecraft.class01042
 *  minecraft.class01226
 *  minecraft.class01312
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class03648
 *  minecraft.class04227
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05349
 *  minecraft.class05946
 *  minecraft.class06097
 *  minecraft.class06113
 *  minecraft.class06559
 *  minecraft.class06563
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07427
 *  minecraft.class07434
 *  minecraft.class07438
 *  minecraft.class07444
 *  minecraft.class07446
 *  minecraft.class07453
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07872
 *  minecraft.class07879
 *  minecraft.class07957
 *  minecraft.class07958
 *  minecraft.class07960
 *  minecraft.class07962
 *  minecraft.class07982
 *  minecraft.class07983
 *  minecraft.class07987
 *  minecraft.class07997
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08574
 *  minecraft.class08577
 *  minecraft.class08579
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10750;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Iterator;
import minecraft.class00734;
import minecraft.class01001;
import minecraft.class01042;
import minecraft.class01226;
import minecraft.class01312;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class03648;
import minecraft.class04227;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05349;
import minecraft.class05946;
import minecraft.class06097;
import minecraft.class06113;
import minecraft.class06559;
import minecraft.class06563;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07427;
import minecraft.class07434;
import minecraft.class07438;
import minecraft.class07444;
import minecraft.class07446;
import minecraft.class07453;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07613;
import minecraft.class07615;
import minecraft.class07633;
import minecraft.class07636;
import minecraft.class07872;
import minecraft.class07879;
import minecraft.class07957;
import minecraft.class07958;
import minecraft.class07960;
import minecraft.class07962;
import minecraft.class07982;
import minecraft.class07983;
import minecraft.class07987;
import minecraft.class07997;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08574;
import minecraft.class08577;
import minecraft.class08579;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07617
extends class07453 {
    public static final double N = 0.6;
    public static final double y = 0.8;
    public static final double L = 1.33;
    private static final class02131<class03556<class03648>> u = class03289.N(class07617.class, (class04383)class02154.G);
    private static final class02131<Boolean> i = class03289.N(class07617.class, (class04383)class02154.U);
    private static final class02131<Boolean> R = class03289.N(class07617.class, (class04383)class02154.U);
    private static final class02131<Integer> M = class03289.N(class07617.class, (class04383)class02154.y);
    private static final class05946<class03648> p = class08574.y;
    private static final class06563 F = class06563.field_7964;
    private @Nullable class07613<class08036> A;
    private @Nullable class07960 f;
    private float C;
    private float S;
    private float x;
    private float D;
    private boolean h;
    private float r;
    private float NN;

    private void w() {
        this.S = this.C;
        this.D = this.x;
        if (this.W()) {
            this.C = Math.min(1.0f, this.C + 0.15f);
            this.x = Math.min(1.0f, this.x + 0.08f);
        } else {
            this.C = Math.max(0.0f, this.C - 0.22f);
            this.x = Math.max(0.0f, this.x - 0.13f);
        }
    }

    protected void method_66649(class02666 class026662) {
        this.method_66650(class026662, class02484.ND);
        this.method_66650(class026662, class02484.Nh);
        super.method_66649(class026662);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(u, (Object)class08577.N((class01042)this.method_56673(), p));
        class042932.N(i, (Object)false);
        class042932.N(R, (Object)false);
        class042932.N(M, (Object)F.N());
    }

    public void method_5773() {
        super.method_5773();
        if (this.f != null && this.f.U() && !this.NQ() && this.field_6012 % 100 == 0) {
            this.method_5783(class04909.iG, 1.0f, 1.0f);
        }
        this.d();
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class08577.N((class08329)class083292, this.B());
        class083292.N("CollarColor", class06563.field_56666, (Object)this.v());
    }

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        if (class024772 == class02484.ND) {
            return (T)class07617.method_66651(class024772, this.B());
        }
        if (class024772 == class02484.Nh) {
            return (T)class07617.method_66651(class024772, (Object)this.v());
        }
        return (T)super.method_58694(class024772);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        class08577.N((class08299)class082992, (class05946)class04227.Nf).ifPresent(this::N);
        this.N(class082992.N("CollarColor", class06563.field_56666).orElse(F));
    }

    public boolean method_21749() {
        return this.method_18276() || super.method_21749();
    }

    public class07617(class07078<? extends class07617> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.l();
    }

    public class03556<class03648> B() {
        return (class03556)this.field_6011.N(u);
    }

    public float i(float f) {
        return class04995.B((float)f, (float)this.D, (float)this.x);
    }

    protected @Nullable class04891 s() {
        if (this.NQ()) {
            if (this.NX()) {
                return class04909.id;
            }
            if (this.field_5974.y(4) == 0) {
                return class04909.iw;
            }
            return class04909.ib;
        }
        return class04909.ij;
    }

    public void n() {
        this.method_56078(class04909.it);
    }

    protected void l() {
        if (this.A == null) {
            this.A = new class07613<class08036>(this, class08036.class, 16.0f, 0.8, 1.33);
        }
        this.e.N(this.A);
        if (!this.NQ()) {
            this.e.N(4, this.A);
        }
    }

    private void d() {
        if ((this.W() || this.m()) && this.field_6012 % 5 == 0) {
            this.method_5783(class04909.id, 0.6f + 0.4f * (this.field_5974.z() - this.field_5974.z()), 1.0f);
        }
        this.w();
        this.Y();
        this.h = false;
        if (this.W()) {
            class07209 class072092 = this.method_24515();
            Iterator var3 = this.method_73183().N(class08036.class, new class00734(class072092).L(2.0, 2.0, 2.0)).iterator();
            while (var3.hasNext()) {
                if (!((class08036)var3.next()).method_6113()) continue;
                this.h = true;
                break;
            }
        }
    }

    boolean m() {
        return (Boolean)this.field_6011.N(R);
    }

    public static class05300 t() {
        return class07633.Ne().N(class05298.n, 10.0).N(class05298.l, (double)0.3f).N(class05298.u, 3.0);
    }

    public class06563 v() {
        return class06563.N((int)((Integer)this.field_6011.N(M)));
    }

    void z(boolean bl) {
        this.field_6011.N(R, (Object)bl);
    }

    public float u(float f) {
        return class04995.B((float)f, (float)this.S, (float)this.C);
    }

    private void N(class08036 class080362) {
        if (this.field_5974.y(3) == 0) {
            this.u(class080362);
            this.Z(true);
            this.method_73183().method_8421((class07049)this, (byte)7);
        } else {
            this.method_73183().method_8421((class07049)this, (byte)6);
        }
    }

    public boolean N(class07633 class076332) {
        if (!this.NQ()) {
            return false;
        }
        if (!(class076332 instanceof class07617)) {
            return false;
        }
        class07617 class076172 = (class07617)((Object)class076332);
        return class076172.NQ() && super.N(class076332);
    }

    public @Nullable class07617 y(class04782 class047822, class07077 class070772) {
        class07617 class076172 = (class07617)class07078.l.N((class07299)class047822, class06113.field_16466);
        if (class076172 != null && class070772 instanceof class07617) {
            class07617 class076173 = (class07617)class070772;
            if (this.field_5974.Z()) {
                class076172.N(this.B());
            } else {
                class076172.N(class076173.B());
            }
            if (this.NQ()) {
                class076172.a_(this.NI());
                class076172.N(true, true);
                class06563 class065632 = this.v();
                class06563 class065633 = class076173.v();
                class076172.N(class06563.N((class04782)class047822, (class06563)class065632, (class06563)class065633));
            }
        }
        return class076172;
    }

    public boolean N(class06584 class065842) {
        return class065842.N(class01226.Nq);
    }

    public class07082 N(class08036 class080362, class07050 class070502) {
        class07082 class070822;
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class080362, class070502, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07082)callbackInfoReturnable.getReturnValue();
        }
        class06584 class065842 = class080362.method_5998(class070502);
        class06581 class065812 = class065842.B();
        if (this.NQ()) {
            if (this.L((class07438)class080362)) {
                class06559 class065592;
                if (class065812 instanceof class06559) {
                    class065592 = (class06559)class065812;
                    class06563 class065632 = class065592.N();
                    if (class065632 != this.v()) {
                        if (!this.method_73183().method_8608()) {
                            this.N(class065632);
                            class065842.N(1, (class07438)class080362);
                            this.NW();
                        }
                        return class07082.N;
                    }
                } else if (this.N(class065842) && this.method_6032() < this.method_6063()) {
                    if (!this.method_73183().method_8608()) {
                        this.N(class080362, class070502, class065842);
                        class05349 class053492 = (class05349)class065842.method_58694(class02484.d);
                        this.method_6025(class053492 != null ? (float)class053492.N() : 1.0f);
                        this.O();
                    }
                    return class07082.N;
                }
                if (!(class065592 = super.N(class080362, class070502)).N()) {
                    this.Z(!this.NJ());
                    return class07082.N;
                }
                return class065592;
            }
        } else if (this.N(class065842)) {
            if (!this.method_73183().method_8608()) {
                this.N(class080362, class070502, class065842);
                this.N(class080362);
                this.NW();
                this.O();
            }
            return class07082.N;
        }
        if ((class070822 = super.N(class080362, class070502)).N()) {
            this.NW();
        }
        return class070822;
    }

    public boolean N(double d) {
        return !this.NQ() && this.field_6012 > 2400;
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        class074462 = super.N(class010012, class070522, class061132, class074462);
        class08577.N((class08579)class08579.N((class01001)class010012, (class07209)this.method_24515()), (class05946)class04227.Nf).ifPresent(this::N);
        return class074462;
    }

    public void N(boolean bl, boolean bl2) {
        super.N(bl, bl2);
        this.l();
    }

    private void N(class06563 class065632) {
        this.field_6011.N(M, (Object)class065632.N());
    }

    private void N(class08036 class080362, class07050 class070502, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_3)) {
            class06584 class065842 = class080362.method_5998(class070502);
            if (this.NQ() && this.L((class07438)class080362)) {
                callbackInfoReturnable.setReturnValue((Object)class07082.N);
            } else {
                callbackInfoReturnable.setReturnValue(!this.N(class065842) || !(this.method_6032() < this.method_6063()) && this.NQ() ? class07082.i : class07082.N);
            }
        }
    }

    public void N(boolean bl) {
        this.field_6011.N(i, (Object)bl);
    }

    public void N(class04782 class047822) {
        if (this.F().y()) {
            double d = this.F().L();
            if (d == 0.6) {
                this.method_18380(class01312.field_18081);
                this.method_5728(false);
            } else if (d == 1.33) {
                this.method_18380(class01312.field_18076);
                this.method_5728(true);
            } else {
                this.method_18380(class01312.field_18076);
                this.method_5728(false);
            }
        } else {
            this.method_18380(class01312.field_18076);
            this.method_5728(false);
        }
    }

    private void N(class03556<class03648> class035562) {
        this.field_6011.N(u, class035562);
    }

    public boolean W() {
        return (Boolean)this.field_6011.N(i);
    }

    public float R(float f) {
        return class04995.B((float)f, (float)this.NN, (float)this.r);
    }

    protected void O() {
        this.method_5783(class04909.in, 1.0f, 1.0f);
    }

    public boolean G() {
        return this.h;
    }

    private void Y() {
        this.NN = this.r;
        this.r = this.m() ? Math.min(1.0f, this.r + 0.1f) : Math.max(0.0f, this.r - 0.13f);
    }

    protected <T> boolean method_66654(class02477<T> class024772, T t) {
        if (class024772 == class02484.ND) {
            this.N((class03556<class03648>)((class03556)class07617.method_66651((class02477)class02484.ND, t)));
            return true;
        }
        if (class024772 == class02484.Nh) {
            this.N((class06563)class07617.method_66651((class02477)class02484.Nh, t));
            return true;
        }
        return super.method_66654(class024772, t);
    }

    public int m_() {
        return 120;
    }

    protected void l_() {
        this.f = new class07615(this, 0.6, class065842 -> class065842.N(class01226.Nq), true);
        this.e.N(1, (class07473)new class07427((class07079)this));
        this.e.N(1, (class07473)new class10750((class07453)this, 1.5));
        this.e.N(2, (class07473)new class07958((class07453)this));
        this.e.N(3, (class07473)new class07636(this));
        this.e.N(4, (class07473)this.f);
        this.e.N(5, (class07473)new class06097(this, 1.1, 8));
        this.e.N(6, (class07473)new class07444((class07453)this, 1.0, 10.0f, 5.0f));
        this.e.N(7, (class07473)new class07987(this, 0.8));
        this.e.N(8, (class07473)new class07982((class07079)this, 0.3f));
        this.e.N(9, (class07473)new class07983((class07079)this));
        this.e.N(10, (class07473)new class07434((class07633)((Object)this), 0.8));
        this.e.N(11, (class07473)new class07957((class07475)this, 0.8, 1.0000001E-5f));
        this.e.N(12, (class07473)new class07962((class07079)this, class08036.class, 10.0f));
        this.H.N(1, (class07473)new class07997((class07453)this, class07879.class, false, null));
        this.H.N(1, (class07473)new class07997((class07453)this, class07872.class, false, class07872.y));
    }

    public class04891 method_6002() {
        return class04909.iv;
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.il;
    }
}

