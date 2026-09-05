/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00389
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00483
 *  minecraft.class00494
 *  minecraft.class00498
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01437
 *  minecraft.class01929
 *  minecraft.class02752
 *  minecraft.class04227
 *  minecraft.class04641
 *  minecraft.class04770
 *  minecraft.class04995
 *  minecraft.class06665
 *  minecraft.class06889
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07451
 *  minecraft.class08083
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08329
 *  net.caffeinemc.mods.lithium.common.shapes.OffsetVoxelShapeCache
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import java.util.Iterator;
import java.util.List;
import minecraft.class00389;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00483;
import minecraft.class00494;
import minecraft.class00498;
import minecraft.class00500;
import minecraft.class00513;
import minecraft.class00734;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01437;
import minecraft.class01929;
import minecraft.class02752;
import minecraft.class04227;
import minecraft.class04641;
import minecraft.class04770;
import minecraft.class04995;
import minecraft.class06665;
import minecraft.class06889;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07451;
import minecraft.class08083;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08329;
import net.caffeinemc.mods.lithium.common.shapes.OffsetVoxelShapeCache;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00510
extends class00394 {
    private static final int y = 2;
    private static final double L = 0.01;
    public static final double N = 0.51;
    private static final class00500 u = class00869.N.W();
    private static final float i = 0.0f;
    private static final boolean R = false;
    private static final boolean M = false;
    private class00500 B = u;
    private class07211 Z;
    private boolean m = false;
    private boolean P = false;
    private static final ThreadLocal<class07211> s = ThreadLocal.withInitial(() -> null);
    private float T = 0.0f;
    private float b = 0.0f;
    private long j;
    private int v;
    private static final class00494[] n = class00510.m();

    public float L(float f) {
        return (float)this.Z.s() * this.i(this.N(f));
    }

    public class07211 L() {
        return this.Z;
    }

    public class00500 M() {
        return this.B;
    }

    public class00510(class07209 class072092, class00500 class005002) {
        super(class00404.field_11897, class072092, class005002);
    }

    public class00510(class07209 class072092, class00500 class005002, class00500 class005003, class07211 class072112, boolean bl, boolean bl2) {
        this(class072092, class005002);
        this.B = class005003;
        this.Z = class072112;
        this.m = bl;
        this.P = bl2;
    }

    public void B() {
        if (this.z != null && (this.b < 1.0f || this.z.method_8608())) {
            this.b = this.T = 1.0f;
            this.z.method_8544(this.U);
            this.r_();
            if (this.z.method_8320(this.U).N(class00869.LN)) {
                class00500 class005002 = this.P ? class00869.N.W() : class00891.a_((class00500)this.B, (class07284)this.z, (class07209)this.U);
                this.z.method_8652(this.U, class005002, 3);
                this.z.method_8492(this.U, class005002.i(), class02752.N((class07299)this.z, (class07211)this.Z(), null));
            }
        }
    }

    public class07211 Z() {
        return this.m ? this.Z : this.Z.b();
    }

    private float i(float f) {
        return this.m ? f - 1.0f : 1.0f - f;
    }

    private static class00494[] m() {
        float[] fArray = new float[]{0.0f, 0.5f, 1.0f};
        class07211[] class07211Array = class07211.values();
        class00494[] class00494Array = new class00494[fArray.length * class07211Array.length];
        for (class07211 class072112 : class07211Array) {
            class00494 class004942 = ((class00500)((class00500)class00869.yq.W().y((class08092)class00513.L, (Comparable)Boolean.valueOf(true))).y((class08092)class00513.y, (Comparable)class072112)).M(null, null);
            for (float f : fArray) {
                boolean bl = f < 0.25f;
                class00494 class004943 = ((class00500)((class00500)class00869.yK.W().y((class08092)class00483.y, (Comparable)class072112)).y((class08092)class00483.u, (Comparable)Boolean.valueOf(bl))).M(null, null).method_1096((double)((float)class072112.P() * f), (double)((float)class072112.s() * f), (double)((float)class072112.T() * f));
                class00494Array[class00510.N((float)f, (class07211)class072112)] = class00389.N((class00494)class004942, (class00494)class004943);
            }
        }
        return class00494Array;
    }

    private class00500 U() {
        if (!this.N() && this.u() && this.B.i() instanceof class00513) {
            return (class00500)((class00500)((class00500)class00869.yK.W().y((class08092)class00483.u, (Comparable)Boolean.valueOf(this.T > 0.25f))).y((class08092)class00483.L, (Comparable)(this.B.N(class00869.yd) ? class08083.field_12634 : class08083.field_12637))).y((class08092)class00483.y, (Comparable)((class07211)this.B.L((class08092)class00513.y)));
        }
        return this.B;
    }

    public long z() {
        return this.j;
    }

    public float u(float f) {
        return (float)this.Z.T() * this.i(this.N(f));
    }

    public boolean u() {
        return this.P;
    }

    private static void y(class07299 class072992, class07209 class072092, float f, class00510 class005102) {
        if (!class005102.E()) {
            return;
        }
        class07211 class072112 = class005102.R();
        if (!class072112.z().L()) {
            return;
        }
        double d = class005102.B.M((class07290)class072992, class072092).method_1105(class07185.field_11052);
        class00734 class007342 = class00510.N(class072092, new class00734(0.0, d, 0.0, 1.0, 1.5000010000000001, 1.0), class005102);
        double d2 = f - class005102.T;
        for (class07049 class070493 : class072992.method_8333((class07049)null, class007342, class070492 -> class00510.N(class007342, class070492, class072092))) {
            class00510.N(class072112, class070493, d2, class072112);
        }
    }

    public float y(float f) {
        return (float)this.Z.P() * this.i(this.N(f));
    }

    private boolean E() {
        return this.B.N(class00869.TM);
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        class083292.N("blockState", class00500.N, (Object)this.B);
        class083292.N("facing", class07211.field_57037, (Object)this.Z);
        class083292.N("progress", this.b);
        class083292.N("extending", this.m);
        class083292.N("source", this.P);
    }

    private static int N(float f, class07211 class072112) {
        if (f != 0.0f && f != 0.5f && f != 1.0f) {
            return -1;
        }
        return (int)(2.0f * f) + 3 * class072112.L();
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002, class00510 class005102) {
        class005102.j = class072992.N();
        class005102.b = class005102.T;
        if (class005102.b >= 1.0f) {
            if (class072992.method_8608() && class005102.v < 5) {
                ++class005102.v;
                return;
            }
            class072992.method_8544(class072092);
            class005102.r_();
            if (class072992.method_8320(class072092).N(class00869.LN)) {
                class00500 class005003 = class00891.a_((class00500)class005102.B, (class07284)class072992, (class07209)class072092);
                if (class005003.P()) {
                    class072992.method_8652(class072092, class005102.B, 340);
                    class00891.N((class00500)class005102.B, (class00500)class005003, (class07284)class072992, (class07209)class072092, (int)3);
                } else {
                    if (class005003.y((class08092)class06665.q) && ((Boolean)class005003.L((class08092)class06665.q)).booleanValue()) {
                        class005003 = (class00500)class005003.y((class08092)class06665.q, (Comparable)Boolean.valueOf(false));
                    }
                    class072992.method_8652(class072092, class005003, 67);
                    class072992.method_8492(class072092, class005003.i(), class02752.N((class07299)class072992, (class07211)class005102.Z(), null));
                }
            }
            return;
        }
        float f = class005102.T + 0.5f;
        class00510.N(class072992, class072092, f, class005102);
        class00510.y(class072992, class072092, f, class005102);
        class005102.T = f;
        if (class005102.T >= 1.0f) {
            class005102.T = 1.0f;
        }
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        this.B = class082992.N("blockState", class00500.N).orElse(u);
        this.Z = class082992.N("facing", class07211.field_57037).orElse(class07211.field_11033);
        this.b = this.T = class082992.N("progress", 0.0f);
        this.m = class082992.N("extending", false);
        this.P = class082992.N("source", false);
    }

    private void N(class07290 class072902, class07209 class072092, CallbackInfoReturnable callbackInfoReturnable, class00494 class004942, class07211 class072112, class00500 class005002, float f) {
        float f2 = Math.abs(f);
        if (f2 != 0.0f && f2 != 0.5f && f2 != 1.0f) {
            return;
        }
        if (this.m || !this.P || !(this.B.i() instanceof class00513)) {
            class00494 class004943 = class005002.M(class072902, class072092);
            class00494 class004944 = class00510.N(class004943, f2, f < 0.0f ? this.Z.b() : this.Z);
            callbackInfoReturnable.setReturnValue((Object)class004944);
        } else {
            int n = class00510.N(f, this.Z);
            callbackInfoReturnable.setReturnValue((Object)class00510.n[n]);
        }
    }

    private static class00494 N(class00494 class004942, float f, class07211 class072112) {
        class00494 class004943 = ((OffsetVoxelShapeCache)class004942).lithium$getOffsetSimplifiedShape(f, class072112);
        if (class004943 == null) {
            class004943 = class004942.method_1096((double)((float)class072112.P() * f), (double)((float)class072112.s() * f), (double)((float)class072112.T() * f)).method_1097();
            ((OffsetVoxelShapeCache)class004942).lithium$setShape(f, class072112, class004943);
        }
        return class004943;
    }

    public void N(class07299 class072992) {
        super.N(class072992);
        if (class072992.N_51(class04227.Z).N(this.B.i().s().B()).isEmpty()) {
            this.B = class00869.N.W();
        }
    }

    public class00494 N(class07290 class072902, class07209 class072092) {
        class00494 class004942 = !this.m && this.P && this.B.i() instanceof class00513 ? ((class00500)this.B.y((class08092)class00513.L, (Comparable)Boolean.valueOf(true))).M(class072902, class072092) : class00389.N();
        class07211 class072112 = s.get();
        if ((double)this.T < 1.0 && class072112 == this.R()) {
            return class004942;
        }
        class00500 class005002 = this.u() ? (class00500)((class00500)class00869.yK.W().y((class08092)class00483.y, (Comparable)this.Z)).y((class08092)class00483.u, (Comparable)Boolean.valueOf(this.m != 1.0f - this.T < 0.25f)) : this.B;
        float f = this.i(this.T);
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class072902, class072092, callbackInfoReturnable, class004942, class072112, class005002, f);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        double d = (float)this.Z.P() * f;
        double d2 = (float)this.Z.s() * f;
        double d3 = (float)this.Z.T() * f;
        return class00389.N((class00494)class004942, (class00494)class005002.M(class072902, class072092).method_1096(d, d2, d3));
    }

    private static boolean N(class00734 class007342, class07049 class070492, class07209 class072092) {
        return class070492.method_5657() == class04641.field_15974 && class070492.method_24828() && (class070492.method_51849(class072092) || class070492.method_23317() >= class007342.N && class070492.method_23317() <= class007342.u && class070492.method_23321() >= class007342.L && class070492.method_23321() <= class007342.R);
    }

    public class07001 N(class01929 class019292) {
        return this.u(class019292);
    }

    private static void N(class07211 class072112, class07049 class070492, double d, class07211 class072113) {
        s.set(class072112);
        class06889 class068892 = class070492.method_73189();
        class070492.method_5784(class07451.field_6310, new class06889(d * (double)class072113.P(), d * (double)class072113.s(), d * (double)class072113.T()));
        class070492.method_64166(class068892, class070492.method_73189());
        class070492.method_68259();
        s.set(null);
    }

    private static void N(class07299 class072992, class07209 class072092, float f, class00510 class005102) {
        class07211 class072112 = class005102.R();
        double d = f - class005102.T;
        class00494 class004942 = class005102.U().M((class07290)class072992, class072092);
        if (class004942.method_1110()) {
            return;
        }
        class00734 class007342 = class00510.N(class072092, class004942.method_1107(), class005102);
        List var9 = class072992.N_70(null, class01437.N((class00734)class007342, (class07211)class072112, (double)d).y(class007342));
        if (var9.isEmpty()) {
            return;
        }
        List var10 = class004942.method_1090();
        boolean bl = class005102.B.N(class00869.Zc);
        for (class07049 class070492 : var9) {
            class00734 class007343;
            class00734 class007344;
            class00734 class007345;
            if (class070492.method_5657() == class04641.field_15975) continue;
            if (bl) {
                if (class070492 instanceof class04770) continue;
                class06889 class068892 = class070492.method_18798();
                double d2 = class068892.M;
                double d3 = class068892.B;
                double d4 = class068892.Z;
                switch (class00498.N[class072112.z().ordinal()]) {
                    case 1: {
                        d2 = class072112.P();
                        break;
                    }
                    case 2: {
                        d3 = class072112.s();
                        break;
                    }
                    case 3: {
                        d4 = class072112.T();
                    }
                }
                class070492.method_18800(d2, d3, d4);
            }
            double d5 = 0.0;
            Iterator var16 = var10.iterator();
            while (!(!var16.hasNext() || (class007345 = class01437.N((class00734)class00510.N(class072092, class007344 = (class00734)var16.next(), class005102), (class07211)class072112, (double)d)).L(class007343 = class070492.method_5829()) && (d5 = Math.max(d5, class00510.N(class007345, class072112, class007343))) >= d)) {
            }
            if (d5 <= 0.0) continue;
            d5 = Math.min(d5, d) + 0.01;
            class00510.N(class072112, class070492, d5, class072112);
            if (class005102.m || !class005102.P) continue;
            class00510.N(class072092, class070492, class072112, d);
        }
    }

    public float N(float f) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        return class04995.B((float)f, (float)this.b, (float)this.T);
    }

    public boolean N() {
        return this.m;
    }

    public void N(class07209 class072092, class00500 class005002) {
        this.B();
    }

    private static class00734 N(class07209 class072092, class00734 class007342, class00510 class005102) {
        double d = class005102.i(class005102.T);
        return class007342.u((double)class072092.method_10263() + d * (double)class005102.Z.P(), (double)class072092.method_10264() + d * (double)class005102.Z.s(), (double)class072092.method_10260() + d * (double)class005102.Z.T());
    }

    private static double N(class00734 class007342, class07211 class072112, class00734 class007343) {
        switch (class00498.y[class072112.ordinal()]) {
            case 1: {
                return class007342.u - class007343.N;
            }
            case 2: {
                return class007343.u - class007342.N;
            }
            default: {
                return class007342.i - class007343.y;
            }
            case 4: {
                return class007343.i - class007342.y;
            }
            case 5: {
                return class007342.R - class007343.L;
            }
            case 6: 
        }
        return class007343.R - class007342.L;
    }

    private static void N(class07209 class072092, class07049 class070492, class07211 class072112, double d) {
        double d2;
        class07211 class072113;
        double d3;
        class00734 class007342;
        class00734 class007343 = class070492.method_5829();
        if (class007343.L(class007342 = class00389.y().method_1107().N(class072092)) && Math.abs((d3 = class00510.N(class007342, class072113 = class072112.b(), class007343) + 0.01) - (d2 = class00510.N(class007342, class072113, class007343.N(class007342)) + 0.01)) < 0.01) {
            d3 = Math.min(d3, d) + 0.01;
            class00510.N(class072112, class070492, d3, class072113);
        }
    }

    public class07211 R() {
        return this.m ? this.Z : this.Z.b();
    }
}

