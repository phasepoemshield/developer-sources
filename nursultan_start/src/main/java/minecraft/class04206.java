/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00201
 *  minecraft.class00225
 *  minecraft.class00229
 *  minecraft.class00273
 *  minecraft.class00293
 *  minecraft.class00301
 *  minecraft.class00305
 *  minecraft.class00319
 *  minecraft.class00404
 *  minecraft.class00429
 *  minecraft.class00455
 *  minecraft.class00549
 *  minecraft.class00588
 *  minecraft.class00607
 *  minecraft.class00608
 *  minecraft.class00731
 *  minecraft.class00751
 *  minecraft.class00765
 *  minecraft.class00831
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01182
 *  minecraft.class01194
 *  minecraft.class01235
 *  minecraft.class01448
 *  minecraft.class01473
 *  minecraft.class01624
 *  minecraft.class01757
 *  minecraft.class01787
 *  minecraft.class01894
 *  minecraft.class01944
 *  minecraft.class02055
 *  minecraft.class02139
 *  minecraft.class02158
 *  minecraft.class02195
 *  minecraft.class02246
 *  minecraft.class02477
 *  minecraft.class02482
 *  minecraft.class02484
 *  minecraft.class02487
 *  minecraft.class02523
 *  minecraft.class02530
 *  minecraft.class02536
 *  minecraft.class02546
 *  minecraft.class02548
 *  minecraft.class02560
 *  minecraft.class02561
 *  minecraft.class02819
 *  minecraft.class03028
 *  minecraft.class03109
 *  minecraft.class03129
 *  minecraft.class03368
 *  minecraft.class03549
 *  minecraft.class03619
 *  minecraft.class03622
 *  minecraft.class03631
 *  minecraft.class03705
 *  minecraft.class03771
 *  minecraft.class03862
 *  minecraft.class03865
 *  minecraft.class03877
 *  minecraft.class03914
 *  minecraft.class03924
 *  minecraft.class03927
 *  minecraft.class03939
 *  minecraft.class03942
 *  minecraft.class04017
 *  minecraft.class04054
 *  minecraft.class04227
 *  minecraft.class04238
 *  minecraft.class04241
 *  minecraft.class04323
 *  minecraft.class04367
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04821
 *  minecraft.class04837
 *  minecraft.class04878
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04922
 *  minecraft.class05052
 *  minecraft.class05235
 *  minecraft.class05240
 *  minecraft.class05267
 *  minecraft.class05298
 *  minecraft.class05301
 *  minecraft.class05312
 *  minecraft.class05340
 *  minecraft.class05359
 *  minecraft.class05369
 *  minecraft.class05378
 *  minecraft.class05523
 *  minecraft.class05660
 *  minecraft.class05672
 *  minecraft.class05838
 *  minecraft.class05851
 *  minecraft.class05930
 *  minecraft.class05946
 *  minecraft.class05950
 *  minecraft.class05955
 *  minecraft.class05959
 *  minecraft.class06061
 *  minecraft.class06222
 *  minecraft.class06332
 *  minecraft.class06339
 *  minecraft.class06341
 *  minecraft.class06353
 *  minecraft.class06391
 *  minecraft.class06506
 *  minecraft.class06514
 *  minecraft.class06525
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06583
 *  minecraft.class06750
 *  minecraft.class06789
 *  minecraft.class06799
 *  minecraft.class06834
 *  minecraft.class06839
 *  minecraft.class06848
 *  minecraft.class06911
 *  minecraft.class06912
 *  minecraft.class07047
 *  minecraft.class07078
 *  minecraft.class07084
 *  minecraft.class07099
 *  minecraft.class07103
 *  minecraft.class07107
 *  minecraft.class07219
 *  minecraft.class07305
 *  minecraft.class07439
 *  minecraft.class07468
 *  minecraft.class07536
 *  minecraft.class07693
 *  minecraft.class07908
 *  minecraft.class07925
 *  minecraft.class07940
 *  minecraft.class07945
 *  minecraft.class08088
 *  minecraft.class08159
 *  minecraft.class08164
 *  minecraft.class08171
 *  minecraft.class08183
 *  minecraft.class08217
 *  minecraft.class08568
 *  minecraft.class08587
 *  minecraft.class08747
 *  minecraft.class08752
 *  minecraft.class09003
 *  minecraft.class09015
 *  minecraft.class09018
 *  minecraft.class09028
 *  minecraft.class09034
 *  minecraft.class09037
 *  net.fabricmc.fabric.impl.item.DefaultItemComponentImpl
 *  net.fabricmc.fabric.mixin.registry.sync.BuiltInRegistriesAccessor
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;
import minecraft.class00201;
import minecraft.class00225;
import minecraft.class00229;
import minecraft.class00273;
import minecraft.class00293;
import minecraft.class00301;
import minecraft.class00305;
import minecraft.class00319;
import minecraft.class00404;
import minecraft.class00429;
import minecraft.class00455;
import minecraft.class00549;
import minecraft.class00588;
import minecraft.class00607;
import minecraft.class00608;
import minecraft.class00731;
import minecraft.class00751;
import minecraft.class00765;
import minecraft.class00831;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01182;
import minecraft.class01194;
import minecraft.class01235;
import minecraft.class01448;
import minecraft.class01473;
import minecraft.class01624;
import minecraft.class01757;
import minecraft.class01787;
import minecraft.class01894;
import minecraft.class01944;
import minecraft.class02055;
import minecraft.class02139;
import minecraft.class02158;
import minecraft.class02195;
import minecraft.class02246;
import minecraft.class02477;
import minecraft.class02482;
import minecraft.class02484;
import minecraft.class02487;
import minecraft.class02523;
import minecraft.class02530;
import minecraft.class02536;
import minecraft.class02546;
import minecraft.class02548;
import minecraft.class02560;
import minecraft.class02561;
import minecraft.class02819;
import minecraft.class03028;
import minecraft.class03109;
import minecraft.class03129;
import minecraft.class03368;
import minecraft.class03549;
import minecraft.class03619;
import minecraft.class03622;
import minecraft.class03631;
import minecraft.class03705;
import minecraft.class03771;
import minecraft.class03862;
import minecraft.class03865;
import minecraft.class03877;
import minecraft.class03914;
import minecraft.class03924;
import minecraft.class03927;
import minecraft.class03939;
import minecraft.class03942;
import minecraft.class04017;
import minecraft.class04054;
import minecraft.class04227;
import minecraft.class04238;
import minecraft.class04241;
import minecraft.class04323;
import minecraft.class04367;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04821;
import minecraft.class04837;
import minecraft.class04878;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04922;
import minecraft.class05052;
import minecraft.class05235;
import minecraft.class05240;
import minecraft.class05267;
import minecraft.class05298;
import minecraft.class05301;
import minecraft.class05312;
import minecraft.class05340;
import minecraft.class05359;
import minecraft.class05369;
import minecraft.class05378;
import minecraft.class05523;
import minecraft.class05660;
import minecraft.class05672;
import minecraft.class05838;
import minecraft.class05851;
import minecraft.class05930;
import minecraft.class05946;
import minecraft.class05950;
import minecraft.class05955;
import minecraft.class05959;
import minecraft.class06061;
import minecraft.class06222;
import minecraft.class06332;
import minecraft.class06339;
import minecraft.class06341;
import minecraft.class06353;
import minecraft.class06391;
import minecraft.class06506;
import minecraft.class06514;
import minecraft.class06525;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06583;
import minecraft.class06750;
import minecraft.class06789;
import minecraft.class06799;
import minecraft.class06834;
import minecraft.class06839;
import minecraft.class06848;
import minecraft.class06911;
import minecraft.class06912;
import minecraft.class07047;
import minecraft.class07078;
import minecraft.class07084;
import minecraft.class07099;
import minecraft.class07103;
import minecraft.class07107;
import minecraft.class07219;
import minecraft.class07305;
import minecraft.class07439;
import minecraft.class07468;
import minecraft.class07536;
import minecraft.class07693;
import minecraft.class07908;
import minecraft.class07925;
import minecraft.class07940;
import minecraft.class07945;
import minecraft.class08088;
import minecraft.class08159;
import minecraft.class08164;
import minecraft.class08171;
import minecraft.class08183;
import minecraft.class08217;
import minecraft.class08568;
import minecraft.class08587;
import minecraft.class08747;
import minecraft.class08752;
import minecraft.class09003;
import minecraft.class09015;
import minecraft.class09018;
import minecraft.class09028;
import minecraft.class09034;
import minecraft.class09037;
import net.fabricmc.fabric.impl.item.DefaultItemComponentImpl;
import net.fabricmc.fabric.mixin.registry.sync.BuiltInRegistriesAccessor;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04206
implements BuiltInRegistriesAccessor {
    private static final Logger NA = LogUtils.getLogger();
    private static final Map<class01894, Supplier<?>> Nf = Maps.newLinkedHashMap();
    private static final class07099<class07099<?>> NC = new class00731(class05946.N((class01894)class04227.N), Lifecycle.stable());
    public static final class04241<class01194> N = class04206.N(class04227.c, "step", class01194::N);
    public static final class00751<class04891> y = class04206.N(class04227.NG, class007512 -> class04909.sJ);
    public static final class04241<class04651> L = class04206.y(class04227.e, "empty", class007512 -> class04684.N);
    public static final class00751<class07084> u = class04206.N(class04227.Ni, class07047::N);
    public static final class04241<class00891> i = class04206.y(class04227.Z, "air", class007512 -> class00869.N);
    public static final class00751<class00455<?>> R = class04206.N(class04227.v, class00429::N);
    public static final class04241<class07078<?>> M = class04206.y(class04227.I, "pig", class007512 -> class07078.Nh);
    public static final class04241<class06581> B = class04206.y(class04227.F, "air", class007512 -> class06570.N);
    public static final class00751<class06525> Z = class04206.N(class04227.NW, class06506::N);
    public static final class00751<class07103<?>> z = class04206.N(class04227.NM, class007512 -> class07107.y);
    public static final class00751<class00404<?>> U = class04206.y(class04227.i, class007512 -> class00404.field_11903);
    public static final class00751<class01894> E = class04206.N(class04227.s, class007512 -> class01235.J);
    public static final class04241<class00549> W = class04206.N(class04227.E, "empty", class007512 -> class00549.L);
    public static final class00751<class05240<?>> m = class04206.N(class04227.Nv, class007512 -> class05240.N);
    public static final class00751<class03368<?>> P = class04206.N(class04227.Nj, class007512 -> class03368.y);
    public static final class00751<class05301<?>> s = class04206.N(class04227.NE, class007512 -> class05301.N);
    public static final class00751<class05851<?>> T = class04206.N(class04227.Nu, class007512 -> class05851.field_17329);
    public static final class00751<class05838<?>> b = class04206.N(class04227.NT, class007512 -> class05838.N);
    public static final class00751<class06514<?>> j = class04206.N(class04227.Ns, class007512 -> class06514.L);
    public static final class00751<class07468> v = class04206.N(class04227.L, class05298::N);
    public static final class00751<class01182<?>> n = class04206.N(class04227.NU, class007512 -> class01182.N);
    public static final class00751<class06799<?, ?>> t = class04206.N(class04227.W, class06789::N);
    public static final class00751<class04922<?>> G = class04206.N(class04227.Nd, class007512 -> class01235.L);
    public static final class04241<class05660> l = class04206.N(class04227.NH, "plains", class05660::N);
    public static final class04241<class05672> d = class04206.N(class04227.Ne, "none", class05672::N);
    public static final class00751<class05369> w = class04206.N(class04227.NZ, class03927::N);
    public static final class04241<class05378<?>> k = class04206.N(class04227.NL, "dummy", class007512 -> class05378.N);
    public static final class04241<class05340<?>> Y = class04206.N(class04227.Nn, "dummy", class007512 -> class05340.N);
    public static final class00751<class05359> Q = class04206.N(class04227.y, class007512 -> class05359.y);
    public static final class00751<class05950> O = class04206.N(class04227.D, class007512 -> class03942.y);
    public static final class00751<class05959<?>> g = class04206.N(class04227.C, class007512 -> class07439.i);
    public static final class00751<class05955> I = class04206.N(class04227.f, class007512 -> class07693.N);
    public static final class00751<class06341> J = class04206.N(class04227.x, class007512 -> class06339.y);
    public static final class00751<class04837> o = class04206.N(class04227.S, class007512 -> class04821.L);
    public static final class00751<class06353> q = class04206.N(class04227.h, class007512 -> class06332.L);
    public static final class00751<class06061<?>> K = class04206.N(class04227.V, class007512 -> class06061.N);
    public static final class00751<class02139<?>> V = class04206.N(class04227.p, class007512 -> class02139.N);
    public static final class00751<class03862<?>> e = class04206.N(class04227.X, class007512 -> class03862.N);
    public static final class00751<class04054<?>> H = class04206.N(class04227.R, class007512 -> class04054.U);
    public static final class00751<class02158<?>> c = class04206.N(class04227.z, class007512 -> class02158.N);
    public static final class00751<class06391<?>> X = class04206.N(class04227.K, class007512 -> class06391.I);
    public static final class00751<class03549<?>> a = class04206.N(class04227.Nk, class007512 -> class03549.N);
    public static final class00751<class04878> p = class04206.N(class04227.Nw, class007512 -> class04878.L);
    public static final class00751<class04367<?>> F = class04206.N(class04227.NO, class007512 -> class04367.R);
    public static final class00751<class04323<?>> A = class04206.N(class04227.NB, class007512 -> class04323.R);
    public static final class00751<class01473<?>> f = class04206.N(class04227.M, class007512 -> class01473.N);
    public static final class00751<class01448<?>> C = class04206.N(class04227.H, class007512 -> class01448.N);
    public static final class00751<class05312<?>> S = class04206.N(class04227.NV, class007512 -> class05312.N);
    public static final class00751<class03619<?>> x = class04206.N(class04227.Nb, class007512 -> class03619.N);
    public static final class00751<class05930<?>> D = class04206.N(class04227.NK, class007512 -> class05930.y);
    public static final class00751<class05052<?>> h = class04206.N(class04227.q, class007512 -> class05052.N);
    public static final class00751<MapCodec<? extends class00765>> r = class04206.N(class04227.u, class03939::N);
    public static final class00751<MapCodec<? extends class08088>> NN = class04206.N(class04227.U, class03924::N);
    public static final class00751<MapCodec<? extends class04017>> Ny = class04206.N(class04227.NN, class04017::N);
    public static final class00751<MapCodec<? extends class03028>> NL = class04206.N(class04227.Ny, class03028::N);
    public static final class00751<MapCodec<? extends class03877>> Nu = class04206.N(class04227.t, class03865::N);
    public static final class00751<MapCodec<? extends class00891>> Ni = class04206.N(class04227.B, class03705::N);
    public static final class00751<class05235<?>> NR = class04206.N(class04227.NQ, class007512 -> class05235.i);
    public static final class00751<class05267<?>> NM = class04206.N(class04227.NY, class007512 -> class05267.u);
    public static final class00751<MapCodec<? extends class03129>> NB = class04206.N(class04227.Nz, class03109::N);
    public static final class00751<class02246> NZ = class04206.N(class04227.n, class01944::N);
    public static final class00751<class06911> Nz = class04206.N(class04227.P, class03771::N);
    public static final class00751<class06583<?>> NU = class04206.N(class04227.yd, class06912::N);
    public static final class00751<class01757<?>> NE = class04206.N(class04227.NR, class01787::N);
    public static final class00751<class02477<?>> NW = class04206.N(class04227.b, class02484::N);
    public static final class00751<class06839<?>> Nm = class04206.N(class04227.j, class07305::N);
    public static final class00751<MapCodec<? extends class03622>> NP = class04206.N(class04227.g, class03631::N);
    public static final class00751<class02487<?>> Ns = class04206.N(class04227.T, class02482::N);
    public static final class00751<class02195> NT = class04206.N(class04227.r, class00831::N);
    public static final class00751<class02477<?>> Nb = class04206.N(class04227.d, class02523::N);
    public static final class00751<MapCodec<? extends class02546>> Nj = class04206.N(class04227.k, class02546::N);
    public static final class00751<MapCodec<? extends class02560>> Nv = class04206.N(class04227.w, class02560::N);
    public static final class00751<MapCodec<? extends class02548>> Nn = class04206.N(class04227.Y, class02548::y);
    public static final class00751<MapCodec<? extends class02536>> Nt = class04206.N(class04227.O, class02536::N);
    public static final class00751<MapCodec<? extends class02530>> NG = class04206.N(class04227.Q, class02561::N);
    public static final class00751<class08217<?>> Nl = class04206.N(class04227.m, class007512 -> class08217.N);
    public static final class00751<class00273<?>> Nd = class04206.N(class04227.NP, class00293::N);
    public static final class00751<class00319<?>> Nw = class04206.N(class04227.Nt, class00301::N);
    public static final class00751<class00305> Nk = class04206.N(class04227.Nm, class06222::N);
    public static final class00751<class01624> NY = class04206.N(class04227.Nq, class007512 -> class01624.P);
    public static final class00751<class07945<?, ?>> NQ = class04206.N(class04227.Nc, class07925::N);
    public static final class00751<class07940<?, ?>> NO = class04206.N(class04227.NX, class007512 -> class07908.N);
    public static final class00751<MapCodec<? extends class00225>> Ng = class04206.N(class04227.NI, class00225::N);
    public static final class00751<MapCodec<? extends class00201>> NI = class04206.N(class04227.No, class00201::N);
    public static final class00751<MapCodec<? extends class08568>> NJ = class04206.N(class04227.Nl, class08587::N);
    public static final class00751<MapCodec<? extends class09037>> No = class04206.N(class04227.l, class09028::N);
    public static final class00751<MapCodec<? extends class08752>> Nq = class04206.N(class04227.Ng, class08747::N);
    public static final class00751<MapCodec<? extends class09015>> NK = class04206.N(class04227.a, class09018::N);
    public static final class00751<MapCodec<? extends class09034>> NV = class04206.N(class04227.G, class09003::N);
    public static final class00751<MapCodec<? extends class08159>> Ne = class04206.N(class04227.Na, class08183::N);
    public static final class00751<MapCodec<? extends class08164>> NH = class04206.N(class04227.Np, class08171::N);
    public static final class00751<class00607<?>> Nc = class04206.N(class04227.J, class00608::N);
    public static final class00751<class06750<?>> NX = class04206.N(class04227.o, class00588::N);
    public static final class00751<MapCodec<? extends class06834>> Na = class04206.N(class04227.A, class06848::N);
    public static final class00751<Consumer<class05523>> Np = class04206.N(class04227.NJ, class00229::N);
    public static final class00751<? extends class00751<?>> NF = NC;
    private static boolean NS;

    private static void L(class00751<?> class007512) {
        ((class00731)class007512).P();
    }

    public static /* synthetic */ class07099 L() {
        return NC;
    }

    private static void u() {
        class04206.N(null);
        NF.W();
        for (class00751 class007512 : NF) {
            class04206.L(class007512);
            class007512.W();
        }
    }

    private static void y(CallbackInfo callbackInfo) {
        if (NS) {
            callbackInfo.cancel();
        }
        NS = true;
    }

    private static <T> class00751<T> y(class05946<? extends class00751<T>> class059462, class04238<T> class042382) {
        return class04206.N(class059462, new class00731(class059462, Lifecycle.stable(), true), class042382);
    }

    private static <T extends class00751<?>> void y(class00751<T> class007512) {
        class007512.forEach(class007513 -> {
            if (class007513.M().isEmpty()) {
                class07536.y((String)("Registry '" + String.valueOf(class007512.y(class007513)) + "' was empty after loading"));
            }
            if (class007513 instanceof class04241) {
                class01894 class018942 = ((class04241)class007513).y();
                Objects.requireNonNull(class007513.N(class018942), "Missing default of DefaultedMappedRegistry: " + String.valueOf(class018942));
            }
        });
    }

    public static void y() {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        class04206.y(callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        Nf.forEach((class018942, supplier) -> {
            if (supplier.get() == null) {
                NA.error("Unable to bootstrap registry '{}'", class018942);
            }
        });
    }

    private static <T> class04241<T> y(class05946<? extends class00751<T>> class059462, String string, class04238<T> class042382) {
        return (class04241)class04206.N(class059462, new class07219(string, class059462, Lifecycle.stable(), true), class042382);
    }

    public static void N() {
        class04206.y();
        class04206.u();
        class04206.y(NF);
    }

    public static <T> class02055<T> N(class00751<T> class007512) {
        return ((class07099)class007512).s();
    }

    private static <T> class04241<T> N(class05946<? extends class00751<T>> class059462, String string, class04238<T> class042382) {
        return (class04241)class04206.N(class059462, new class07219(string, class059462, Lifecycle.stable(), false), class042382);
    }

    private static void N(CallbackInfo callbackInfo) {
        DefaultItemComponentImpl.modifyItemComponents();
    }

    private static <T, R extends class07099<T>> R N(class05946<? extends class00751<T>> class059462, R r, class04238<T> class042382) {
        class03914.N(() -> "registry " + String.valueOf(class059462.N()));
        class01894 class018942 = class059462.N();
        Nf.put(class018942, () -> class042382.run((class00751)r));
        NC.N(class059462, r, class02819.N);
        return r;
    }

    private static <T> class00751<T> N(class05946<? extends class00751<T>> class059462, class04238<T> class042382) {
        return class04206.N(class059462, new class00731(class059462, Lifecycle.stable(), false), class042382);
    }
}

