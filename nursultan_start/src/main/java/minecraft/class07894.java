/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10750
 *  Nursultan.class10844
 *  Nursultan.class10861
 *  Nursultan.class10862
 *  com.viaversion.viafabricplus.features.entity.metadata_handling.WolfHealthTracker1_14_4
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00500
 *  minecraft.class00681
 *  minecraft.class00683
 *  minecraft.class00751
 *  minecraft.class01001
 *  minecraft.class01042
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01226
 *  minecraft.class01251
 *  minecraft.class01279
 *  minecraft.class01317
 *  minecraft.class01517
 *  minecraft.class01894
 *  minecraft.class02131
 *  minecraft.class02135
 *  minecraft.class02154
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02503
 *  minecraft.class02505
 *  minecraft.class02523
 *  minecraft.class02666
 *  minecraft.class02812
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class03696
 *  minecraft.class04227
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04425
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05349
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06559
 *  minecraft.class06563
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07082
 *  minecraft.class07085
 *  minecraft.class07092
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07295
 *  minecraft.class07299
 *  minecraft.class07323
 *  minecraft.class07427
 *  minecraft.class07434
 *  minecraft.class07436
 *  minecraft.class07438
 *  minecraft.class07444
 *  minecraft.class07446
 *  minecraft.class07453
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07523
 *  minecraft.class07528
 *  minecraft.class07550
 *  minecraft.class07633
 *  minecraft.class07952
 *  minecraft.class07956
 *  minecraft.class07957
 *  minecraft.class07958
 *  minecraft.class07962
 *  minecraft.class07982
 *  minecraft.class07989
 *  minecraft.class07997
 *  minecraft.class07999
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08372
 *  minecraft.class08519
 *  minecraft.class08526
 *  minecraft.class08577
 *  minecraft.class08579
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10750;
import Nursultan.class10844;
import Nursultan.class10861;
import Nursultan.class10862;
import com.viaversion.viafabricplus.features.entity.metadata_handling.WolfHealthTracker1_14_4;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class00681;
import minecraft.class00683;
import minecraft.class00751;
import minecraft.class01001;
import minecraft.class01042;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01226;
import minecraft.class01251;
import minecraft.class01279;
import minecraft.class01317;
import minecraft.class01517;
import minecraft.class01894;
import minecraft.class02131;
import minecraft.class02135;
import minecraft.class02154;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02503;
import minecraft.class02505;
import minecraft.class02523;
import minecraft.class02666;
import minecraft.class02812;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class03696;
import minecraft.class04227;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04425;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05349;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06559;
import minecraft.class06563;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07082;
import minecraft.class07085;
import minecraft.class07092;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07295;
import minecraft.class07299;
import minecraft.class07323;
import minecraft.class07427;
import minecraft.class07434;
import minecraft.class07436;
import minecraft.class07438;
import minecraft.class07444;
import minecraft.class07446;
import minecraft.class07453;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07523;
import minecraft.class07528;
import minecraft.class07550;
import minecraft.class07633;
import minecraft.class07862;
import minecraft.class07864;
import minecraft.class07872;
import minecraft.class07952;
import minecraft.class07956;
import minecraft.class07957;
import minecraft.class07958;
import minecraft.class07962;
import minecraft.class07982;
import minecraft.class07989;
import minecraft.class07997;
import minecraft.class07999;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08372;
import minecraft.class08519;
import minecraft.class08526;
import minecraft.class08577;
import minecraft.class08579;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07894
extends class07453
implements class01279 {
    private static final class02131<Boolean> L = class03289.N(class07894.class, (class04383)class02154.U);
    private static final class02131<Integer> u = class03289.N(class07894.class, (class04383)class02154.y);
    private static final class02131<Long> i = class03289.N(class07894.class, (class04383)class02154.L);
    private static final class02131<class03556<class02505>> R = class03289.N(class07894.class, (class04383)class02154.w);
    private static final class02131<class03556<class08519>> M = class03289.N(class07894.class, (class04383)class02154.k);
    public static final class01317 N = (class074382, class047822) -> {
        class07078 class070782 = class074382.method_5864();
        return class070782 == class07078.yz || class070782 == class07078.yM || class070782 == class07078.Ni;
    };
    private static final float p = 8.0f;
    private static final float F = 40.0f;
    private static final float A = 0.125f;
    public static final float y = 0.62831855f;
    private static final class06563 f = class06563.field_7964;
    private float C;
    private float S;
    private boolean x;
    private boolean D;
    private float h;
    private float r;
    private static final class02135 NN = class01517.N((int)20, (int)39);
    private @Nullable class08372<class07438> Ny;

    private void w() {
        this.D = false;
        this.h = 0.0f;
        this.r = 0.0f;
    }

    protected void method_66649(class02666 class026662) {
        this.method_66650(class026662, class02484.NO);
        this.method_66650(class026662, class02484.Ng);
        this.method_66650(class026662, class02484.NI);
        super.method_66649(class026662);
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class00751 class007512 = this.method_56673().L(class04227.yQ);
        class042932.N(R, (Object)class08577.N((class01042)this.method_56673(), (class05946)class02503.z));
        class042932.N(M, (Object)((class03556)class007512.N(class08526.N).or(() -> ((class00751)class007512).N()).orElseThrow()));
        class042932.N(L, (Object)false);
        class042932.N(u, (Object)f.N());
        class042932.N(i, (Object)-1L);
    }

    public void method_5773() {
        super.method_5773();
        if (!this.method_5805()) {
            return;
        }
        this.S = this.C;
        this.C = this.G() ? (this.C += (1.0f - this.C) * 0.4f) : (this.C += (0.0f - this.C) * 0.4f);
        if (this.method_5721()) {
            this.x = true;
            if (this.D && !this.method_73183().method_8608()) {
                this.method_73183().method_8421((class07049)this, (byte)56);
                this.w();
            }
        } else if ((this.x || this.D) && this.D) {
            if (this.h == 0.0f) {
                this.method_5783(class04909.JM, this.method_6107(), (this.field_5974.z() - this.field_5974.z()) * 0.2f + 1.0f);
                this.method_32876((class03556)class01194.n);
            }
            this.r = this.h;
            this.h += 0.05f;
            if (this.r >= 2.0f) {
                this.x = false;
                this.D = false;
                this.r = 0.0f;
                this.h = 0.0f;
            }
            if (this.h > 0.4f) {
                float f = (float)this.method_23318();
                int n = (int)(class04995.m((double)((this.h - 0.4f) * (float)Math.PI)) * 7.0f);
                class06889 class068892 = this.method_18798();
                for (int i = 0; i < n; ++i) {
                    float f2 = (this.field_5974.z() * 2.0f - 1.0f) * this.method_17681() * 0.5f;
                    float f3 = (this.field_5974.z() * 2.0f - 1.0f) * this.method_17681() * 0.5f;
                    this.method_73183().method_8406((class07126)class07107.NT, this.method_23317() + (double)f2, (double)(f + 0.8f), this.method_23321() + (double)f3, class068892.M, class068892.B, class068892.Z);
                }
            }
        }
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        if (this.method_5679(class047822, class070722)) {
            return false;
        }
        this.Z(false);
        return super.method_64397(class047822, class070722, f);
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        this.method_5783(class04909.JB, 0.15f, 1.0f);
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("CollarColor", class06563.field_56666, (Object)this.t());
        class08577.N((class08329)class083292, this.l());
        this.N(class083292);
        this.d().i().ifPresent(class059462 -> class083292.N("sound_variant", class05946.N((class05946)class04227.yQ), class059462));
    }

    public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        if (class024772 == class02484.NO) {
            return (T)class07894.method_66651(class024772, this.l());
        }
        if (class024772 == class02484.Ng) {
            return (T)class07894.method_66651(class024772, this.d());
        }
        if (class024772 == class02484.NI) {
            return (T)class07894.method_66651(class024772, (Object)this.t());
        }
        return (T)super.method_58694(class024772);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        class08577.N((class08299)class082992, (class05946)class04227.yY).ifPresent(this::N);
        this.N(class082992.N("CollarColor", class06563.field_56666).orElse(f));
        this.N(this.method_73183(), class082992);
        class082992.N("sound_variant", class05946.N((class05946)class04227.yQ)).flatMap(class059462 -> this.method_56673().L(class04227.yQ).N(class059462)).ifPresent(this::y);
    }

    public void method_5711(byte by) {
        if (by == 8) {
            this.D = true;
            this.h = 0.0f;
            this.r = 0.0f;
        } else if (by == 56) {
            this.w();
        } else {
            super.method_5711(by);
        }
    }

    public class07894(class07078<? extends class07894> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.N(false, false);
        this.N(class04425.field_33534, -1.0f);
        this.N(class04425.field_36432, -1.0f);
    }

    public float i(float f) {
        return class04995.B((float)f, (float)this.r, (float)this.h);
    }

    protected class04891 s() {
        if (this.P_()) {
            return (class04891)((class08519)this.d().N()).L().N();
        }
        if (this.field_5974.y(3) == 0) {
            class07894 class078942;
            if (this.NQ() && this.y(class078942 = this) < 20.0f) {
                return (class04891)((class08519)this.d().N()).R().N();
            }
            return (class04891)((class08519)this.d().N()).i().N();
        }
        return (class04891)((class08519)this.d().N()).N().N();
    }

    public float n() {
        if (this.P_()) {
            return 1.5393804f;
        }
        if (this.NQ()) {
            float f = this.method_6063();
            class07894 class078942 = this;
            float f2 = (f - this.y(class078942)) / f;
            return (0.55f - f2 * 0.4f) * (float)Math.PI;
        }
        return 0.62831855f;
    }

    private class03556<class02505> l() {
        return (class03556)this.field_6011.N(R);
    }

    private class03556<class08519> d() {
        return (class03556)this.field_6011.N(M);
    }

    public class01894 m() {
        class02505 class025052 = (class02505)this.l().N();
        if (this.NQ()) {
            return class025052.y().y().y();
        }
        if (this.P_()) {
            return class025052.y().L().y();
        }
        return class025052.y().N().y();
    }

    public class06563 t() {
        return class06563.N((int)((Integer)this.field_6011.N(u)));
    }

    public boolean g() {
        return !this.P_();
    }

    public static class05300 v() {
        return class07633.Ne().N(class05298.l, (double)0.3f).N(class05298.n, 8.0).N(class05298.u, 4.0);
    }

    public float u(float f) {
        if (!this.x) {
            return 1.0f;
        }
        return Math.min(0.75f + class04995.B((float)f, (float)this.r, (float)this.h) / 2.0f * 0.25f, 1.0f);
    }

    private float y(class07894 class078942) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4)) {
            return WolfHealthTracker1_14_4.getWolfHealth((class07438)this);
        }
        return class078942.method_6032();
    }

    private void y(class03556<class08519> class035562) {
        this.field_6011.N(M, class035562);
    }

    public long E() {
        return (Long)this.field_6011.N(i);
    }

    public boolean N(class07633 class076332) {
        if (class076332 == this) {
            return false;
        }
        if (!this.NQ()) {
            return false;
        }
        if (!(class076332 instanceof class07894)) {
            return false;
        }
        class07894 class078942 = (class07894)class076332;
        if (!class078942.NQ()) {
            return false;
        }
        if (class078942.Ng()) {
            return false;
        }
        return this.NX() && class078942.NX();
    }

    public boolean N(class06584 class065842) {
        return class065842.N(class01226.No);
    }

    public boolean N(class07438 class074382, class07438 class074383) {
        Object object;
        if (class074382 instanceof class07550 || class074382 instanceof class07523 || class074382 instanceof class00681) {
            return false;
        }
        if (class074382 instanceof class07894) {
            class07894 class078942 = (class07894)class074382;
            return !class078942.NQ() || class078942.L_() != class074383;
        }
        if (class074382 instanceof class08036) {
            object = (class08036)class074382;
            if (class074383 instanceof class08036 && !((class08036)class074383).method_7256((class08036)object)) {
                return false;
            }
        }
        if (class074382 instanceof class07862 && ((class07862)((Object)(object = (class07862)class074382))).I()) {
            return false;
        }
        return !(class074382 instanceof class07453) || !(object = (class07453)class074382).NQ();
    }

    public static boolean N(class07078<class07894> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        return class072842.method_8320(class072092.method_10074()).N(class01210.Ln) && class07894.N((class07295)class072842, (class07209)class072092);
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        if (class074462 instanceof class10844) {
            class10844 class108442 = (class10844)class074462;
            this.N((class03556<class02505>)class108442.N);
        } else {
            Optional optional = class08577.N((class08579)class08579.N((class01001)class010012, (class07209)this.method_24515()), (class05946)class04227.yY);
            if (optional.isPresent()) {
                this.N((class03556<class02505>)((class03556)optional.get()));
                class074462 = new class10844((class03556)optional.get());
            }
        }
        this.y((class03556<class08519>)class08526.N((class01042)this.method_56673(), (class06069)class010012.method_8409()));
        return super.N(class010012, class070522, class061132, class074462);
    }

    public @Nullable class07894 y(class04782 class047822, class07077 class070772) {
        class07894 class078942 = (class07894)class07078.yC.N((class07299)class047822, class06113.field_16466);
        if (class078942 != null && class070772 instanceof class07894) {
            class07894 class078943 = (class07894)class070772;
            if (this.field_5974.Z()) {
                class078942.N(this.l());
            } else {
                class078942.N(class078943.l());
            }
            if (this.NQ()) {
                class078942.a_(this.NI());
                class078942.N(true, true);
                class06563 class065632 = this.t();
                class06563 class065633 = class078943.t();
                class078942.N(class06563.N((class04782)class047822, (class06563)class065632, (class06563)class065633));
            }
            class078942.y((class03556<class08519>)class08526.N((class01042)this.method_56673(), (class06069)this.field_5974));
        }
        return class078942;
    }

    public void N(boolean bl) {
        this.field_6011.N(L, (Object)bl);
    }

    public void N(long l) {
        this.field_6011.N(i, (Object)l);
    }

    private void N(class06563 class065632) {
        this.field_6011.N(u, (Object)class065632.N());
    }

    private boolean N(class07072 class070722) {
        return this.NZ().N(class06570.sA) && !class070722.N(class03696.Q);
    }

    private void N(class03556<class02505> class035562) {
        this.field_6011.N(R, class035562);
    }

    static /* synthetic */ class06069 N(class07894 class078942) {
        return class078942.field_5974;
    }

    private void N(class08036 class080362, class07050 class070502, CallbackInfoReturnable callbackInfoReturnable) {
        class06584 class065842 = class080362.method_5998(class070502);
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4)) {
            class06581 class065812 = class065842.B();
            if (this.NQ()) {
                class06563 class065632;
                class05349 class053492 = (class05349)class065842.method_58694(class02484.d);
                if (class053492 != null) {
                    if (this.N(class065842) && WolfHealthTracker1_14_4.getWolfHealth((class07438)this) < 20.0f) {
                        if (!class080362.method_31549().u) {
                            class065842.B(1);
                        }
                        this.method_6025(class053492.N());
                        callbackInfoReturnable.setReturnValue((Object)class07082.N);
                        return;
                    }
                } else if (class065812 instanceof class06559 && (class065632 = ((class06559)class065812).N()) != this.t()) {
                    this.N(class065632);
                    if (!class080362.method_31549().u) {
                        class065842.B(1);
                    }
                    callbackInfoReturnable.setReturnValue((Object)class07082.N);
                    return;
                }
            } else if (class065812 == class06570.vO && !this.P_()) {
                if (!class080362.method_31549().u) {
                    class065842.B(1);
                }
                callbackInfoReturnable.setReturnValue((Object)class07082.N);
                return;
            }
            callbackInfoReturnable.setReturnValue((Object)super.N(class080362, class070502));
        } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_5) && this.NQ() && class065842.N(class06570.vr) && this.L((class07438)class080362) && this.NU() && (!class07323.N((class06584)this.NZ(), (class02477)class02523.I) || class080362.method_68878())) {
            this.method_43077(class04909.Nk);
            callbackInfoReturnable.setReturnValue((Object)class07082.N);
        }
    }

    public void N(@Nullable class08372<class07438> class083722) {
        this.Ny = class083722;
    }

    private void N(class08036 class080362) {
        if (this.field_5974.y(3) == 0) {
            this.u(class080362);
            this.V.W();
            this.y(null);
            this.Z(true);
            this.method_73183().method_8421((class07049)this, (byte)7);
        } else {
            this.method_73183().method_8421((class07049)this, (byte)6);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public class07082 N(class08036 class080362, class07050 class070502) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class080362, class070502, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07082)callbackInfoReturnable.getReturnValue();
        }
        class06584 class065842 = class080362.method_5998(class070502);
        class06581 class065812 = class065842.B();
        if (this.NQ()) {
            class07894 class078942;
            if (this.N(class065842) && this.y(class078942 = this) < this.method_6063()) {
                this.N(class080362, class070502, class065842);
                class05349 class053492 = (class05349)class065842.method_58694(class02484.d);
                float f = class053492 != null ? (float)class053492.N() : 1.0f;
                this.method_6025(2.0f * f);
                return class07082.N;
            }
            if (class065812 instanceof class06559) {
                class06559 class065592 = (class06559)class065812;
                if (this.L((class07438)class080362)) {
                    class06563 class065632 = class065592.N();
                    if (class065632 == this.t()) return super.N(class080362, class070502);
                    this.N(class065632);
                    class065842.N(1, (class07438)class080362);
                    return class07082.N;
                }
            }
            if (this.method_63623(class065842, class07085.field_48824) && !this.NU() && this.L((class07438)class080362) && !this.method_6109()) {
                this.u(class065842.L(1));
                class065842.N(1, (class07438)class080362);
                return class07082.N;
            }
            if (this.Ng() && this.NU() && this.L((class07438)class080362) && this.NZ().m() && this.NZ().L(class065842)) {
                class065842.B(1);
                this.method_43077(class04909.JR);
                class06584 class065843 = this.NZ();
                int n = (int)((float)class065843.s() * 0.125f);
                class065843.y(Math.max(0, class065843.P() - n));
                return class07082.N;
            }
            class07082 class070822 = super.N(class080362, class070502);
            if (class070822.N() || !this.L((class07438)class080362)) return class070822;
            this.Z(!this.NJ());
            ((class07438)this).fields_6212a028292fd3c078969e3ee4c71d9e8_4 = false;
            this.V.W();
            this.y(null);
            return class07082.N.y();
        }
        if (this.method_73183().method_8608() || !class065842.N(class06570.vO) || this.P_()) return super.N(class080362, class070502);
        class065842.N(1, (class07438)class080362);
        this.N(class080362);
        return class07082.y;
    }

    public @Nullable class08372<class07438> W() {
        return this.Ny;
    }

    public float R(float f) {
        return class04995.B((float)f, (float)this.S, (float)this.C) * 0.15f * (float)Math.PI;
    }

    public int Ni() {
        if (this.Ng()) {
            return 20;
        }
        return super.Ni();
    }

    public boolean G() {
        return (Boolean)this.field_6011.N(L);
    }

    protected void NO() {
        if (this.NQ()) {
            this.method_5996(class05298.n).N(40.0);
            this.method_6033(40.0f);
        } else {
            this.method_5996(class05298.n).N(8.0);
        }
    }

    public class06889 ac_() {
        return new class06889(0.0, (double)(0.6f * this.method_5751()), (double)(this.method_17681() * 0.4f));
    }

    protected <T> boolean method_66654(class02477<T> class024772, T t) {
        if (class024772 == class02484.NO) {
            this.N((class03556<class02505>)((class03556)class07894.method_66651((class02477)class02484.NO, t)));
            return true;
        }
        if (class024772 == class02484.Ng) {
            this.y((class03556<class08519>)((class03556)class07894.method_66651((class02477)class02484.Ng, t)));
            return true;
        }
        if (class024772 == class02484.NI) {
            this.N((class06563)class07894.method_66651((class02477)class02484.NI, t));
            return true;
        }
        return super.method_66654(class024772, t);
    }

    protected void l_() {
        this.e.N(1, (class07473)new class07427((class07079)this));
        this.e.N(1, (class07473)new class10750((class07453)this, 1.5, class03696.J));
        this.e.N(2, (class07473)new class07958((class07453)this));
        this.e.N(3, new class07864(this, this, class00683.class, 24.0f, 1.5, 1.5));
        this.e.N(4, (class07473)new class07982((class07079)this, 0.4f));
        this.e.N(5, (class07473)new class07999((class07475)this, 1.0, true));
        this.e.N(6, (class07473)new class07444((class07453)this, 1.0, 10.0f, 2.0f));
        this.e.N(7, (class07473)new class07434((class07633)this, 1.0));
        this.e.N(8, (class07473)new class07957((class07475)this, 1.0));
        this.e.N(9, (class07473)new class07436(this, 8.0f));
        this.e.N(10, (class07473)new class07962((class07079)this, class08036.class, 8.0f));
        this.e.N(10, (class07473)new class07956((class07079)this));
        this.H.N(1, (class07473)new class10861((class07453)this));
        this.H.N(2, (class07473)new class10862((class07453)this));
        this.H.N(3, (class07473)new class07989((class07475)this, new Class[0]).N(new Class[0]));
        this.H.N(4, (class07473)new class07952((class07079)this, class08036.class, 10, true, false, (arg_0, arg_1) -> ((class07894)this).N(arg_0, arg_1)));
        this.H.N(5, (class07473)new class07997((class07453)this, class07633.class, false, N));
        this.H.N(6, (class07473)new class07997((class07453)this, class07872.class, false, class07872.y));
        this.H.N(7, (class07473)new class07952((class07079)this, class07528.class, false));
        this.H.N(8, (class07473)new class01251((class07079)this, true));
    }

    public int n_() {
        return 8;
    }

    public class04891 method_6002() {
        return (class04891)((class08519)this.d().N()).y().N();
    }

    public float method_6107() {
        return 0.4f;
    }

    public void method_6007() {
        super.method_6007();
        if (!this.method_73183().method_8608() && this.x && !this.D && !this.Nw() && this.method_24828()) {
            this.D = true;
            this.h = 0.0f;
            this.r = 0.0f;
            this.method_73183().method_8421((class07049)this, (byte)8);
        }
        if (!this.method_73183().method_8608()) {
            this.N((class04782)this.method_73183(), true);
        }
    }

    public void method_6074(class04782 class047822, class07072 class070722, float f) {
        if (!this.N(class070722)) {
            super.method_6074(class047822, class070722, f);
            return;
        }
        class06584 class065842 = this.NZ();
        int n = class065842.P();
        int n2 = class065842.s();
        class065842.N(class04995.u((float)f), (class07438)this, class07085.field_48824);
        if (class02812.y.N(n, n2) != class02812.y.N(this.NZ())) {
            this.method_43077(class04909.Ju);
            class047822.method_65096((class07126)new class07092(class07107.S, class06570.sF.E()), this.method_23317(), this.method_23318() + 1.0, this.method_23321(), 20, 0.2, 0.1, 0.2, 0.1);
        }
    }

    public void method_6078(class07072 class070722) {
        this.x = false;
        this.D = false;
        this.r = 0.0f;
        this.h = 0.0f;
        super.method_6078(class070722);
    }

    public class04891 method_6011(class07072 class070722) {
        if (this.N(class070722)) {
            return class04909.Ji;
        }
        return (class04891)((class08519)this.d().N()).u().N();
    }

    public void method_6105(class07072 class070722, float f) {
        this.method_57292(class070722, f, new class07085[]{class07085.field_48824});
    }

    public void W_() {
        this.y(NN.N(this.field_5974));
    }
}

