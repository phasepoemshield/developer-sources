/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11647
 *  minecraft.class00334
 *  minecraft.class00335
 *  minecraft.class00342
 *  minecraft.class00345
 *  minecraft.class00347
 *  minecraft.class00350
 *  minecraft.class00356
 *  minecraft.class00358
 *  minecraft.class00365
 *  minecraft.class00372
 *  minecraft.class00376
 *  minecraft.class01894
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class03252
 *  minecraft.class03270
 *  minecraft.class03662
 *  minecraft.class04995
 *  minecraft.class05433
 *  minecraft.class05946
 *  minecraft.class06558
 *  minecraft.class06570
 *  minecraft.class06572
 *  minecraft.class06581
 *  minecraft.class08548
 *  minecraft.class08699
 *  minecraft.class08811
 *  minecraft.class08819
 *  minecraft.class08821
 *  minecraft.class08825
 *  minecraft.class08830
 *  minecraft.class08833
 *  minecraft.class08840
 *  minecraft.class08841
 *  minecraft.class08843
 *  minecraft.class08895
 *  minecraft.class08897
 *  minecraft.class08901
 *  minecraft.class08906
 *  minecraft.class08909
 *  minecraft.class08912
 *  minecraft.class08916
 *  minecraft.class08929
 *  minecraft.class08934
 *  minecraft.class08940
 *  minecraft.class08941
 */
package minecraft;

import Nursultan.class11647;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;
import minecraft.class00334;
import minecraft.class00335;
import minecraft.class00342;
import minecraft.class00345;
import minecraft.class00347;
import minecraft.class00350;
import minecraft.class00356;
import minecraft.class00358;
import minecraft.class00365;
import minecraft.class00372;
import minecraft.class00376;
import minecraft.class01894;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class03252;
import minecraft.class03270;
import minecraft.class03662;
import minecraft.class04995;
import minecraft.class05387;
import minecraft.class05388;
import minecraft.class05403;
import minecraft.class05414;
import minecraft.class05433;
import minecraft.class05946;
import minecraft.class06558;
import minecraft.class06570;
import minecraft.class06572;
import minecraft.class06581;
import minecraft.class08548;
import minecraft.class08699;
import minecraft.class08811;
import minecraft.class08819;
import minecraft.class08821;
import minecraft.class08825;
import minecraft.class08830;
import minecraft.class08833;
import minecraft.class08840;
import minecraft.class08841;
import minecraft.class08843;
import minecraft.class08895;
import minecraft.class08897;
import minecraft.class08901;
import minecraft.class08906;
import minecraft.class08909;
import minecraft.class08912;
import minecraft.class08916;
import minecraft.class08929;
import minecraft.class08934;
import minecraft.class08940;
import minecraft.class08941;

public class class05422 {
    private static final class08843 B = class08825.N((int)-1);
    public static final class01894 N = class05422.N("helmet");
    public static final class01894 y = class05422.N("chestplate");
    public static final class01894 L = class05422.N("leggings");
    public static final class01894 u = class05422.N("boots");
    public static final List<class05414> i = List.of(new class05414(class08548.u, (class05946<class03252>)class03270.N), new class05414(class08548.i, (class05946<class03252>)class03270.y), new class05414(class08548.R, (class05946<class03252>)class03270.L), new class05414(class08548.M, (class05946<class03252>)class03270.u), new class05414(class08548.B, (class05946<class03252>)class03270.i), new class05414(class08548.Z, (class05946<class03252>)class03270.R), new class05414(class08548.z, (class05946<class03252>)class03270.M), new class05414(class08548.U, (class05946<class03252>)class03270.B), new class05414(class08548.E, (class05946<class03252>)class03270.Z), new class05414(class08548.W, (class05946<class03252>)class03270.z), new class05414(class08548.m, (class05946<class03252>)class03270.U));
    public final class08833 R;
    public final BiConsumer<class01894, class08819> M;

    public final void L(class06581 class065812) {
        List<class08912> var2 = this.y(class065812);
        this.R.N(class065812, class08825.N((class08909)class08825.N((class02477)class02484.NP), (class08895)class08825.N((class06572)new class08916(true, class08934.field_55390), (float)32.0f, var2), (class08895)class08825.N((class06572)new class08916(true, class08934.field_55391), (float)32.0f, var2)));
    }

    public final void M(class06581 class065812) {
        class08895 class088952 = class08825.N((class01894)class05387.N(class065812));
        class08895 class088953 = class08825.N((class01894)this.N(class065812, "_pulling_0", class05433.LZ));
        class08895 class088954 = class08825.N((class01894)this.N(class065812, "_pulling_1", class05433.LZ));
        class08895 class088955 = class08825.N((class01894)this.N(class065812, "_pulling_2", class05433.LZ));
        this.R.N(class065812, class08825.N((class08909)class08825.N(), (class08895)class08825.N((class06572)new class00334(false), (float)0.05f, (class08895)class088953, (class08912[])new class08912[]{class08825.N((class08895)class088954, (float)0.65f), class08825.N((class08895)class088955, (float)0.9f)}), (class08895)class088952));
    }

    public final void P(class06581 class065812) {
        class08895 class088952 = class08825.N((class01894)this.N(class065812, class05433.yD));
        class08895 class088953 = class08825.N((class01894)class05387.N(class065812, "_in_hand"), (class00335)new class00376());
        class08895 class088954 = class08825.N((class01894)class05387.N(class065812, "_throwing"), (class00335)new class00376());
        class08895 class088955 = class08825.N((class08909)class08825.N(), (class08895)class088954, (class08895)class088953);
        this.R.N(class065812, class05422.N(class088952, class088955));
    }

    public final void T(class06581 class065812) {
        class01894 class018942 = this.N(class065812, class05387.y("potion_overlay"), class05387.N(class065812));
        this.N(class065812, class018942);
    }

    public class05422(class08833 class088332, BiConsumer<class01894, class08819> biConsumer) {
        this.R = class088332;
        this.M = biConsumer;
    }

    public final void B(class06581 class065812) {
        class08895 class088952 = class08825.N((class01894)class05387.N(class065812));
        class08895 class088953 = class08825.N((class01894)this.N(class065812, "_pulling_0", class05433.Lz));
        class08895 class088954 = class08825.N((class01894)this.N(class065812, "_pulling_1", class05433.Lz));
        class08895 class088955 = class08825.N((class01894)this.N(class065812, "_pulling_2", class05433.Lz));
        class08895 class088956 = class08825.N((class01894)this.N(class065812, "_arrow", class05433.Lz));
        class08895 class088957 = class08825.N((class01894)this.N(class065812, "_firework", class05433.Lz));
        this.R.N(class065812, class08825.N((class00372)new class00345(), (class08895)class08825.N((class08909)class08825.N(), (class08895)class08825.N((class06572)new class08897(), (class08895)class088953, (class08912[])new class08912[]{class08825.N((class08895)class088954, (float)0.58f), class08825.N((class08895)class088955, (float)1.0f)}), (class08895)class088952), (class08940[])new class08940[]{class08825.N((Object)class06558.field_55207, (class08895)class088956), class08825.N((Object)class06558.field_55208, (class08895)class088957)}));
    }

    public final void Z(class06581 class065812) {
        class08895 class088952 = class08825.N((class01894)this.N(class065812, class05433.yD));
        class08895 class088953 = class08825.N((class01894)this.N(class065812, "_broken", class05433.yD));
        this.N(class065812, (class08909)new class08941(), class088953, class088952);
    }

    public final void i(class06581 class065812) {
        ArrayList<class08912> arrayList = new ArrayList<class08912>();
        class08895 class088952 = class08825.N((class01894)this.N(class065812, "_00", class05433.yD));
        arrayList.add(class08825.N((class08895)class088952, (float)0.0f));
        for (int i = 1; i < 64; ++i) {
            class08895 class088953 = class08825.N((class01894)this.N(class065812, String.format(Locale.ROOT, "_%02d", i), class05433.yD));
            arrayList.add(class08825.N((class08895)class088953, (float)((float)i - 0.5f)));
        }
        arrayList.add(class08825.N((class08895)class088952, (float)63.5f));
        this.R.N(class065812, class08825.N((class08895)class08825.N((class06572)new class00347(true, class00342.field_55558), (float)64.0f, arrayList), (class08895)class08825.N((class06572)new class00347(true, class00342.field_55557), (float)64.0f, arrayList)));
    }

    public final void b(class06581 class065812) {
        class01894 class018942 = this.N(class065812, class05387.N(class065812, "_head"), class05387.N(class065812, "_base"));
        this.N(class065812, class018942);
    }

    public final void s(class06581 class065812) {
        class08895 class088952 = class08825.N((class01894)this.N(class065812, class05433.yD));
        class08895 class088953 = class08825.N((class01894)class05433.LU.N(class065812, class05388.U(class05388.N(class065812, "_in_hand")), this.M));
        this.R.N(class065812, class05422.N(class088952, class088953), new class08906(true, false, 1.95f));
    }

    public final void m(class06581 class065812) {
        class08895 class088952 = class08825.N((class01894)this.N(class065812, class05433.yD));
        class08895 class088953 = class08825.N((class01894)class05387.N(class065812, "_in_hand"));
        this.R.N(class065812, class05422.N(class088952, class088953));
    }

    public final void j(class06581 class065812) {
        class01894 class018942 = class05388.L(class065812);
        class01894 class018943 = class05388.N(class065812, "_overlay");
        class01894 class018944 = class05433.yD.N(class065812, class05388.U(class018942), this.M);
        class01894 class018945 = class05387.N(class065812, "_dyed");
        class05433.Ly.N(class018945, class05388.L(class018942, class018943), this.M);
        this.R.N(class065812, class08825.N((class08909)class08825.N((class02477)class02484.F), (class08895)class08825.N((class01894)class018945, (class08843[])new class08843[]{B, new class08840(0)}), (class08895)class08825.N((class01894)class018944)));
    }

    public final void U(class06581 class065812) {
        class08895 class088952 = class08825.N((class01894)this.N(class065812, class05433.LN));
        class08895 class088953 = class08825.N((class01894)this.N(class065812, "_cast", class05433.LN));
        this.N(class065812, (class08909)new class08901(), class088953, class088952);
    }

    public final void z(class06581 class065812) {
        class08895 class088952 = class08825.N((class01894)class05387.N(class065812));
        class08895 class088953 = class08825.N((class01894)class05387.N(class065812, "_brushing_0"));
        class08895 class088954 = class08825.N((class01894)class05387.N(class065812, "_brushing_1"));
        class08895 class088955 = class08825.N((class01894)class05387.N(class065812, "_brushing_2"));
        this.R.N(class065812, class08825.N((class06572)new class00350(10.0f), (float)0.1f, (class08895)class088952, (class08912[])new class08912[]{class08825.N((class08895)class088953, (float)0.25f), class08825.N((class08895)class088954, (float)0.5f), class08825.N((class08895)class088955, (float)0.75f)}));
    }

    public final void u(class06581 class065812) {
        this.R.N(class065812, class08825.N((class06572)new class08916(true, class08934.field_55392), (float)32.0f, this.y(class065812)));
    }

    public final void y(class06581 class065812, class06581 class065813, class05403 class054032) {
        this.R.N(class065812, class08825.N((class01894)this.N(class065812, class065813, class054032)));
    }

    public final void y(class06581 class065812, int n) {
        class01894 class018942 = this.N(class065812, class05433.yD);
        this.R.N(class065812, class08825.N((class01894)class018942, (class08843[])new class08843[]{new class08840(n)}));
    }

    public final void y(class06581 class065812, class05403 class054032) {
        this.R.N(class065812, class08825.N((class01894)this.N(class065812, class054032)));
    }

    public final List<class08912> y(class06581 class065812) {
        ArrayList<class08912> arrayList = new ArrayList<class08912>();
        class08895 class088952 = class08825.N((class01894)this.N(class065812, "_16", class05433.yD));
        arrayList.add(class08825.N((class08895)class088952, (float)0.0f));
        for (int i = 1; i < 32; ++i) {
            int n = class04995.L((int)(i - 16), (int)32);
            class08895 class088953 = class08825.N((class01894)this.N(class065812, String.format(Locale.ROOT, "_%02d", n), class05433.yD));
            arrayList.add(class08825.N((class08895)class088953, (float)((float)i - 0.5f)));
        }
        arrayList.add(class08825.N((class08895)class088952, (float)31.5f));
        return arrayList;
    }

    public final void E(class06581 class065812) {
        class08895 class088952 = class08825.N((class01894)class05387.N(class065812));
        class08895 class088953 = class08825.N((class01894)class05387.y("tooting_goat_horn"));
        this.N(class065812, class08825.N(), class088953, class088952);
    }

    public static class08895 N(class08895 class088952, class08895 class088953) {
        return class08825.N((class00372)new class00356(), (class08895)class088953, (class08940[])new class08940[]{class08825.N(List.of(class03662.field_4317, class03662.field_4318, class03662.field_4319, class03662.field_61988), (class08895)class088952)});
    }

    public static class01894 N(String string) {
        return class01894.y((String)("trims/items/" + string + "_trim"));
    }

    public final void N(class06581 class065812, class01894 class018942) {
        this.R.N(class065812, class08825.N((class01894)class018942, (class08843[])new class08843[]{new class08811()}));
    }

    public void N() {
        this.y(class06570.sw, class05433.yD);
        this.y(class06570.sY, class05433.yD);
        this.y(class06570.sk, class05433.yD);
        this.y(class06570.sQ, class05433.yD);
        this.y(class06570.Ti, class05433.yD);
        this.y(class06570.sS, class05433.yD);
        this.y(class06570.sF, class05433.yD);
        this.y(class06570.GA, class05433.yD);
        this.y(class06570.sD, class05433.yD);
        this.y(class06570.Gv, class05433.yD);
        this.y(class06570.iz, class05433.yr);
        this.y(class06570.ni, class05433.yD);
        this.y(class06570.lw, class05433.yD);
        this.y(class06570.lY, class05433.yD);
        this.y(class06570.st, class05433.yD);
        this.y(class06570.sG, class05433.yD);
        this.y(class06570.vY, class05433.yD);
        this.y(class06570.nj, class05433.yD);
        this.y(class06570.nU, class05433.yr);
        this.y(class06570.vl, class05433.yD);
        this.y(class06570.vQ, class05433.yD);
        this.y(class06570.de, class05433.yD);
        this.y(class06570.jY, class05433.yD);
        this.y(class06570.sC, class05433.yD);
        this.y(class06570.bu, class05433.yD);
        this.y(class06570.jl, class05433.yD);
        this.y(class06570.GW, class05433.yr);
        this.y(class06570.vd, class05433.yD);
        this.y(class06570.jU, class05433.yD);
        this.y(class06570.sm, class05433.LN);
        this.y(class06570.sP, class05433.LN);
        this.y(class06570.sr, class05433.yD);
        this.y(class06570.sz, class05433.yD);
        this.y(class06570.nM, class05433.yD);
        this.y(class06570.lt, class05433.yD);
        this.y(class06570.jd, class05433.yD);
        this.i(class06570.vN);
        this.y(class06570.sh, class05433.yD);
        this.y(class06570.jv, class05433.yD);
        this.y(class06570.ly, class05433.yD);
        this.L(class06570.jJ);
        this.u(class06570.jo);
        this.y(class06570.nR, class05433.yD);
        this.y(class06570.nB, class05433.yD);
        this.y(class06570.vB, class05433.yD);
        this.y(class06570.lu, class05433.yD);
        this.y(class06570.bq, class05433.yD);
        this.y(class06570.GX, class05433.yD);
        this.y(class06570.vZ, class05433.yD);
        this.y(class06570.vx, class05433.yD);
        this.y(class06570.TB, class05433.yD);
        this.y(class06570.lA, class05433.yD);
        this.y(class06570.TZ, class05433.yD);
        this.y(class06570.Tt, class05433.yr);
        this.y(class06570.TG, class05433.yr);
        this.y(class06570.Tn, class05433.yr);
        this.y(class06570.Tv, class05433.yr);
        this.y(class06570.Tj, class05433.yr);
        this.y(class06570.Gf, class05433.yD);
        this.y(class06570.dl, class05433.yD);
        this.y(class06570.dO, class05433.yD);
        this.y(class06570.vt, class05433.yD);
        this.y(class06570.sO, class05433.yD);
        this.y(class06570.sg, class05433.yD);
        this.y(class06570.TN, class05433.yD);
        this.y(class06570.Ta, class05433.yr);
        this.y(class06570.Tp, class05433.yr);
        this.y(class06570.Gx, class05433.yD);
        this.y(class06570.dt, class05433.yD);
        this.y(class06570.TX, class05433.yr);
        this.y(class06570.Tc, class05433.yr);
        this.y(class06570.TH, class05433.yr);
        this.y(class06570.lQ, class05433.yD);
        this.y(class06570.ny, class05433.yD);
        this.y(class06570.jO, class05433.yD);
        this.y(class06570.jg, class05433.yD);
        this.y(class06570.jI, class05433.yD);
        this.y(class06570.Ty, class05433.yD);
        this.y(class06570.Gq, class05433.yD);
        this.y(class06570.nG, class05433.yD);
        this.y(class06570.nz, class05433.yD);
        this.y(class06570.ln, class05433.yD);
        this.y(class06570.GB, class05433.yD);
        this.y(class06570.nb, class05433.yD);
        this.y(class06570.dV, class05433.yD);
        this.y(class06570.GJ, class05433.yD);
        this.y(class06570.GZ, class05433.yD);
        this.y(class06570.bJ, class05433.yD);
        this.y(class06570.sf, class05433.yD);
        this.y(class06570.dq, class05433.yD);
        this.y(class06570.dQ, class05433.yD);
        this.y(class06570.sU, class05433.yD);
        this.y(class06570.nE, class05433.yD);
        this.y(class06570.nP, class05433.yD);
        this.y(class06570.nl, class05433.yD);
        this.y(class06570.dJ, class05433.yD);
        this.y(class06570.wy, class05433.yD);
        this.y(class06570.vL, class05433.yD);
        this.y(class06570.vU, class05433.yD);
        this.y(class06570.Gs, class05433.yD);
        this.y(class06570.Tz, class05433.yD);
        this.y(class06570.bV, class05433.yD);
        this.y(class06570.TI, class05433.yr);
        this.y(class06570.GG, class05433.yD);
        this.y(class06570.TJ, class05433.yr);
        this.y(class06570.GS, class05433.yD);
        this.y(class06570.dn, class05433.yD);
        this.y(class06570.Tg, class05433.yr);
        this.y(class06570.TO, class05433.yr);
        this.y(class06570.TQ, class05433.yr);
        this.y(class06570.TU, class05433.yD);
        this.y(class06570.nW, class05433.yD);
        this.y(class06570.vv, class05433.yD);
        this.y(class06570.vw, class05433.yD);
        this.y(class06570.bN, class05433.yD);
        this.y(class06570.dK, class05433.yD);
        this.y(class06570.dd, class05433.yD);
        this.y(class06570.wR, class05433.yD);
        this.y(class06570.wZ, class05433.yD);
        this.y(class06570.sW, class05433.yD);
        this.y(class06570.vz, class05433.yD);
        this.y(class06570.TR, class05433.yD);
        this.y(class06570.TV, class05433.yr);
        this.y(class06570.Te, class05433.yr);
        this.y(class06570.GC, class05433.yD);
        this.y(class06570.dv, class05433.yD);
        this.y(class06570.TM, class05433.yD);
        this.y(class06570.lF, class05433.yD);
        this.y(class06570.TK, class05433.yr);
        this.y(class06570.Tq, class05433.yr);
        this.y(class06570.To, class05433.yr);
        this.y(class06570.GP, class05433.yD);
        this.y(class06570.sl, class05433.yD);
        this.y(class06570.sd, class05433.yD);
        this.y(class06570.lf, class05433.yD);
        this.y(class06570.TL, class05433.yD);
        this.y(class06570.jW, class05433.yD);
        this.y(class06570.js, class05433.yD);
        this.y(class06570.vs, class05433.yD);
        this.y(class06570.vn, class05433.yD);
        this.y(class06570.vb, class05433.yD);
        this.y(class06570.vP, class05433.yD);
        this.y(class06570.nv, class05433.yD);
        this.y(class06570.so, class05433.yD);
        this.y(class06570.sq, class05433.yD);
        this.y(class06570.sK, class05433.yD);
        this.y(class06570.sV, class05433.yD);
        this.y(class06570.Gt, class05433.yD);
        this.y(class06570.nN, class05433.yD);
        this.y(class06570.jT, class05433.yD);
        this.y(class06570.sZ, class05433.yD);
        this.y(class06570.dI, class05433.yD);
        this.y(class06570.TD, class05433.yD);
        this.y(class06570.dT, class05433.yD);
        this.y(class06570.dZ, class05433.yh);
        this.y(class06570.lS, class05433.yh);
        this.y(class06570.lD, class05433.yh);
        this.y(class06570.lx, class05433.yh);
        this.y(class06570.lh, class05433.yh);
        this.y(class06570.lr, class05433.yh);
        this.y(class06570.dN, class05433.yh);
        this.y(class06570.dy, class05433.yh);
        this.y(class06570.dL, class05433.yh);
        this.y(class06570.du, class05433.yh);
        this.y(class06570.di, class05433.yh);
        this.y(class06570.dm, class05433.yh);
        this.y(class06570.dP, class05433.yh);
        this.y(class06570.dR, class05433.yh);
        this.y(class06570.dM, class05433.yh);
        this.y(class06570.dz, class05433.yh);
        this.y(class06570.dB, class05433.yh);
        this.y(class06570.dU, class05433.yh);
        this.y(class06570.dE, class05433.yh);
        this.y(class06570.dW, class05433.yh);
        this.y(class06570.ds, class05433.yh);
        this.y(class06570.lL, class05433.yD);
        this.y(class06570.lN, class05433.yD);
        this.y(class06570.dj, class05433.yD);
        this.y(class06570.TC, class05433.yr);
        this.y(class06570.TS, class05433.yr);
        this.y(class06570.TE, class05433.yD);
        this.y(class06570.Tf, class05433.yr);
        this.y(class06570.TW, class05433.yD);
        this.y(class06570.TA, class05433.yr);
        this.y(class06570.TF, class05433.yr);
        this.y(class06570.dG, class05433.yD);
        this.y(class06570.GD, class05433.yD);
        this.y(class06570.GK, class05433.yD);
        this.y(class06570.GV, class05433.yD);
        this.y(class06570.Gg, class05433.yD);
        this.y(class06570.sb, class05433.yD);
        this.y(class06570.sj, class05433.yD);
        this.y(class06570.vm, class05433.yD);
        this.y(class06570.bK, class05433.yD);
        this.y(class06570.sI, class05433.yD);
        this.y(class06570.sJ, class05433.yD);
        this.y(class06570.jk, class05433.yD);
        this.y(class06570.ss, class05433.yD);
        this.y(class06570.f_do__3, class05433.yD);
        this.y(class06570.vj, class05433.yD);
        this.y(class06570.Gn, class05433.yD);
        this.y(class06570.lG, class05433.yD);
        this.y(class06570.bo, class05433.yD);
        this.y(class06570.jm, class05433.yD);
        this.y(class06570.GH, class05433.yD);
        this.y(class06570.Ge, class05433.yD);
        this.y(class06570.vM, class05433.yD);
        this.y(class06570.jb, class05433.yD);
        this.y(class06570.GI, class05433.yD);
        this.y(class06570.vG, class05433.yD);
        this.y(class06570.Tu, class05433.yD);
        this.y(class06570.Gc, class05433.yD);
        this.y(class06570.Gp, class05433.yD);
        this.y(class06570.GF, class05433.yD);
        this.y(class06570.Ga, class05433.yD);
        this.y(class06570.vk, class05433.yD);
        this.y(class06570.nZ, class05433.yD);
        this.y(class06570.PF, class05433.yD);
        this.y(class06570.vi, class05433.yD);
        this.y(class06570.jj, class05433.yD);
        this.y(class06570.sp, class05433.yD);
        this.y(class06570.vr, class05433.yD);
        this.y(class06570.lp, class05433.yD);
        this.y(class06570.dg, class05433.yD);
        this.y(class06570.jQ, class05433.yD);
        this.y(class06570.jP, class05433.yD);
        this.y(class06570.wr, class05433.yD);
        this.y(class06570.lg, class05433.yD);
        this.y(class06570.nT, class05433.yD);
        this.y(class06570.sv, class05433.yD);
        this.y(class06570.sn, class05433.yD);
        this.y(class06570.Tx, class05433.yr);
        this.y(class06570.Tk, class05433.yr);
        this.y(class06570.TY, class05433.yr);
        this.y(class06570.Tw, class05433.yr);
        this.y(class06570.Td, class05433.yr);
        this.y(class06570.Tl, class05433.yr);
        this.y(class06570.vg, class05433.yD);
        this.y(class06570.dk, class05433.yD);
        this.y(class06570.sE, class05433.yD);
        this.y(class06570.la, class05433.yD);
        this.y(class06570.vR, class05433.yD);
        this.y(class06570.jn, class05433.yD);
        this.y(class06570.jt, class05433.yD);
        this.y(class06570.jG, class05433.yD);
        this.y(class06570.jE, class05433.yD);
        this.y(class06570.bL, class05433.yD);
        this.y(class06570.vW, class05433.yD);
        this.y(class06570.Gz, class05433.yD);
        this.y(class06570.Gm, class05433.Lj);
        this.y(class06570.TT, class05433.yr);
        this.y(class06570.Tb, class05433.yr);
        this.y(class06570.Ts, class05433.yr);
        this.y(class06570.TP, class05433.yr);
        this.y(class06570.Tm, class05433.yr);
        this.y(class06570.GU, class05433.yD);
        this.y(class06570.GE, class05433.yD);
        this.y(class06570.vT, class05433.yD);
        this.y(class06570.ky, class05433.yD);
        this.y(class06570.kL, class05433.yD);
        this.y(class06570.ku, class05433.yD);
        this.y(class06570.ki, class05433.yD);
        this.y(class06570.kR, class05433.yD);
        this.y(class06570.kM, class05433.yD);
        this.y(class06570.kB, class05433.yD);
        this.y(class06570.kZ, class05433.yD);
        this.y(class06570.kz, class05433.yD);
        this.y(class06570.kU, class05433.yD);
        this.y(class06570.kE, class05433.yD);
        this.y(class06570.kW, class05433.yD);
        this.y(class06570.km, class05433.yD);
        this.y(class06570.kP, class05433.yD);
        this.y(class06570.ks, class05433.yD);
        this.y(class06570.kT, class05433.yD);
        this.y(class06570.kb, class05433.yD);
        this.y(class06570.kj, class05433.yD);
        this.y(class06570.kv, class05433.yD);
        this.y(class06570.lC, class06570.Tx, class05433.yr);
        this.y(class06570.be, class06570.bV, class05433.yD);
        this.N(class06570.sa, (class05946<class11647>)class08699.B, N, false);
        this.N(class06570.bi, (class05946<class11647>)class08699.y, N, true);
        this.N(class06570.bR, (class05946<class11647>)class08699.y, y, true);
        this.N(class06570.bM, (class05946<class11647>)class08699.y, L, true);
        this.N(class06570.bB, (class05946<class11647>)class08699.y, u, true);
        this.N(class06570.bZ, (class05946<class11647>)class08699.L, N, false);
        this.N(class06570.bz, (class05946<class11647>)class08699.L, y, false);
        this.N(class06570.bU, (class05946<class11647>)class08699.L, L, false);
        this.N(class06570.bE, (class05946<class11647>)class08699.L, u, false);
        this.N(class06570.bW, (class05946<class11647>)class08699.u, N, false);
        this.N(class06570.bm, (class05946<class11647>)class08699.u, y, false);
        this.N(class06570.bP, (class05946<class11647>)class08699.u, L, false);
        this.N(class06570.bs, (class05946<class11647>)class08699.u, u, false);
        this.N(class06570.bT, (class05946<class11647>)class08699.i, N, false);
        this.N(class06570.bb, (class05946<class11647>)class08699.i, y, false);
        this.N(class06570.bj, (class05946<class11647>)class08699.i, L, false);
        this.N(class06570.bv, (class05946<class11647>)class08699.i, u, false);
        this.N(class06570.bn, (class05946<class11647>)class08699.M, N, false);
        this.N(class06570.bt, (class05946<class11647>)class08699.M, y, false);
        this.N(class06570.bG, (class05946<class11647>)class08699.M, L, false);
        this.N(class06570.bl, (class05946<class11647>)class08699.M, u, false);
        this.N(class06570.bd, (class05946<class11647>)class08699.R, N, false);
        this.N(class06570.bw, (class05946<class11647>)class08699.R, y, false);
        this.N(class06570.bk, (class05946<class11647>)class08699.R, L, false);
        this.N(class06570.bY, (class05946<class11647>)class08699.R, u, false);
        this.N(class06570.bQ, (class05946<class11647>)class08699.Z, N, false);
        this.N(class06570.bO, (class05946<class11647>)class08699.Z, y, false);
        this.N(class06570.bg, (class05946<class11647>)class08699.Z, L, false);
        this.N(class06570.bI, (class05946<class11647>)class08699.Z, u, false);
        this.N(class06570.Gh, -6265536);
        this.y(class06570.kn, class05433.yD);
        this.y(class06570.kt, class05433.yD);
        this.y(class06570.kG, class05433.yD);
        this.y(class06570.kl, class05433.yD);
        this.y(class06570.kd, class05433.yD);
        this.y(class06570.kw, class05433.yD);
        this.y(class06570.kk, class05433.yD);
        this.y(class06570.kY, class05433.yD);
        this.y(class06570.kQ, class05433.yD);
        this.y(class06570.kO, class05433.yD);
        this.y(class06570.kg, class05433.yD);
        this.y(class06570.kI, class05433.yD);
        this.y(class06570.kJ, class05433.yD);
        this.y(class06570.ko, class05433.yD);
        this.y(class06570.kq, class05433.yD);
        this.y(class06570.kK, class05433.yD);
        this.y(class06570.kV, class05433.yD);
        this.y(class06570.ke, class05433.yD);
        this.y(class06570.kH, class05433.yD);
        this.y(class06570.kc, class05433.yD);
        this.y(class06570.kX, class05433.yD);
        this.y(class06570.ka, class05433.yD);
        this.y(class06570.kp, class05433.yD);
        this.y(class06570.Yd, class05433.yD);
        this.y(class06570.Yw, class05433.yD);
        this.y(class06570.YY, class05433.yD);
        this.N(class06570.Go, (class08843)new class08821());
        this.N(class06570.vh, "_markings", (class08843)new class08841());
        this.R(class06570.jq);
        this.R(class06570.jh);
        this.R(class06570.jK);
        this.R(class06570.jp);
        this.R(class06570.jF);
        this.R(class06570.jH);
        this.R(class06570.jC);
        this.R(class06570.jA);
        this.R(class06570.jc);
        this.R(class06570.jD);
        this.R(class06570.jf);
        this.R(class06570.je);
        this.R(class06570.ja);
        this.R(class06570.jx);
        this.R(class06570.jX);
        this.R(class06570.jS);
        this.R(class06570.jV);
        this.m(class06570.vy);
        this.P(class06570.db);
        this.j(class06570.sA);
        this.y(class06570.PA, class05433.yD);
        this.y(class06570.Pf, class05433.yD);
        this.y(class06570.PC, class05433.yD);
        this.y(class06570.PS, class05433.yD);
        this.y(class06570.Px, class05433.yD);
        this.y(class06570.PD, class05433.yD);
        this.y(class06570.Ph, class05433.yD);
        this.y(class06570.Pr, class05433.yD);
        this.y(class06570.sN, class05433.yD);
        this.y(class06570.sy, class05433.yD);
        this.y(class06570.sL, class05433.yD);
        this.y(class06570.su, class05433.yD);
        this.y(class06570.si, class05433.yD);
        this.y(class06570.sR, class05433.yD);
        this.y(class06570.sM, class05433.yD);
        this.y(class06570.sB, class05433.yD);
        this.M(class06570.sx);
        this.B(class06570.dw);
        this.Z(class06570.sT);
        this.z(class06570.kN);
        this.U(class06570.jr);
        this.E(class06570.dH);
        this.W(class06570.lo);
        this.s(class06570.lq);
        this.s(class06570.lK);
        this.s(class06570.lV);
        this.s(class06570.lH);
        this.s(class06570.le);
        this.s(class06570.lc);
        this.s(class06570.lX);
        this.b(class06570.lI);
        this.T(class06570.ns);
        this.T(class06570.lO);
        this.T(class06570.lJ);
        this.y(class06570.nd, class05433.yD);
        this.y(class06570.nw, class05433.yD);
        this.y(class06570.nk, class05433.yD);
        this.y(class06570.nY, class05433.yD);
        this.y(class06570.nQ, class05433.yD);
        this.y(class06570.nO, class05433.yD);
        this.y(class06570.ng, class05433.yD);
        this.y(class06570.nI, class05433.yD);
        this.y(class06570.nJ, class05433.yD);
        this.y(class06570.no, class05433.yD);
        this.y(class06570.nq, class05433.yD);
        this.y(class06570.nK, class05433.yD);
        this.y(class06570.nV, class05433.yD);
        this.y(class06570.ne, class05433.yD);
        this.y(class06570.nH, class05433.yD);
        this.y(class06570.nc, class05433.yD);
        this.y(class06570.nX, class05433.yD);
        this.y(class06570.na, class05433.yD);
        this.y(class06570.np, class05433.yD);
        this.y(class06570.nF, class05433.yD);
        this.y(class06570.nA, class05433.yD);
        this.y(class06570.nf, class05433.yD);
        this.y(class06570.nC, class05433.yD);
        this.y(class06570.nS, class05433.yD);
        this.y(class06570.nx, class05433.yD);
        this.y(class06570.nD, class05433.yD);
        this.y(class06570.nh, class05433.yD);
        this.y(class06570.nr, class05433.yD);
        this.y(class06570.tN, class05433.yD);
        this.y(class06570.ty, class05433.yD);
        this.y(class06570.tL, class05433.yD);
        this.y(class06570.tu, class05433.yD);
        this.y(class06570.ti, class05433.yD);
        this.y(class06570.tR, class05433.yD);
        this.y(class06570.tM, class05433.yD);
        this.y(class06570.tB, class05433.yD);
        this.y(class06570.tZ, class05433.yD);
        this.y(class06570.tz, class05433.yD);
        this.y(class06570.tU, class05433.yD);
        this.y(class06570.tE, class05433.yD);
        this.y(class06570.tW, class05433.yD);
        this.y(class06570.tm, class05433.yD);
        this.y(class06570.tP, class05433.yD);
        this.y(class06570.ts, class05433.yD);
        this.y(class06570.tT, class05433.yD);
        this.y(class06570.tb, class05433.yD);
        this.y(class06570.tj, class05433.yD);
        this.y(class06570.tv, class05433.yD);
        this.y(class06570.tn, class05433.yD);
        this.y(class06570.tt, class05433.yD);
        this.y(class06570.tG, class05433.yD);
        this.y(class06570.tl, class05433.yD);
        this.y(class06570.td, class05433.yD);
        this.y(class06570.tw, class05433.yD);
        this.y(class06570.tk, class05433.yD);
        this.y(class06570.tY, class05433.yD);
        this.y(class06570.tQ, class05433.yD);
        this.y(class06570.tO, class05433.yD);
        this.y(class06570.tg, class05433.yD);
        this.y(class06570.tI, class05433.yD);
        this.y(class06570.tJ, class05433.yD);
        this.y(class06570.to, class05433.yD);
        this.y(class06570.tq, class05433.yD);
        this.y(class06570.tK, class05433.yD);
        this.y(class06570.tV, class05433.yD);
        this.y(class06570.te, class05433.yD);
        this.y(class06570.tH, class05433.yD);
        this.y(class06570.tc, class05433.yD);
        this.y(class06570.tX, class05433.yD);
        this.y(class06570.ta, class05433.yD);
        this.y(class06570.tp, class05433.yD);
        this.y(class06570.tA, class05433.yD);
        this.y(class06570.tF, class05433.yD);
        this.y(class06570.tf, class05433.yD);
        this.y(class06570.tC, class05433.yD);
        this.y(class06570.tS, class05433.yD);
        this.y(class06570.tx, class05433.yD);
        this.y(class06570.tD, class05433.yD);
        this.y(class06570.th, class05433.yD);
        this.y(class06570.tr, class05433.yD);
        this.y(class06570.GN, class05433.yD);
        this.y(class06570.Gy, class05433.yD);
        this.y(class06570.GL, class05433.yD);
        this.y(class06570.Gu, class05433.yD);
        this.y(class06570.Gi, class05433.yD);
        this.y(class06570.GR, class05433.yD);
        this.y(class06570.GM, class05433.yD);
        this.N(class06570.N);
        this.N(class06570.wf);
        this.N(class06570.wp);
        this.N(class06570.wF);
        this.N(class06570.wA);
        this.N(class06570.iZ);
        this.N(class06570.iB);
        this.N(class06570.iM);
        this.N(class06570.wC);
        this.N(class06570.vO);
        this.N(class06570.vu);
        this.N(class06570.Tr);
        this.N(class06570.Gr);
    }

    public final void N(class06581 class065812, class08843 class088432) {
        this.N(class065812, "_overlay", class088432);
    }

    public final void N(class06581 class065812, String string, class08843 class088432) {
        class01894 class018942 = this.N(class065812, class05388.L(class065812), class05388.N(class065812, string));
        this.R.N(class065812, class08825.N((class01894)class018942, (class08843[])new class08843[]{B, class088432}));
    }

    public final void N(class06581 class065812, int n) {
        class01894 class018942 = class05388.L(class065812);
        class01894 class018943 = class05388.N(class065812, "_overlay");
        class01894 class018944 = class05387.N(class065812);
        class05433.Ly.N(class018944, class05388.L(class018942, class018943), this.M);
        this.R.N(class065812, class08825.N((class01894)class018944, (class08843[])new class08843[]{new class08840(n)}));
    }

    public final class01894 N(class06581 class065812, class01894 class018942, class01894 class018943) {
        return class05433.Ly.N(class065812, class05388.L(class018942, class018943), this.M);
    }

    public final void N(class06581 class065812) {
        this.R.N(class065812, class08825.N((class01894)class05387.N(class065812)));
    }

    public final class01894 N(class06581 class065812, class05403 class054032) {
        return class054032.N(class05387.N(class065812), class05388.y(class065812), this.M);
    }

    public final class01894 N(class06581 class065812, String string, class05403 class054032) {
        return class054032.N(class05387.N(class065812, string), class05388.U(class05388.N(class065812, string)), this.M);
    }

    public final class01894 N(class06581 class065812, class06581 class065813, class05403 class054032) {
        return class054032.N(class05387.N(class065812), class05388.y(class065813), this.M);
    }

    public final class01894 N(class06581 class065812, class05403 class054032, String string) {
        class01894 class018942 = class05388.N(class065812, string);
        return class054032.N(class065812, class05388.U(class018942), this.M);
    }

    public final void N(class06581 class065812, class08909 class089092, class08895 class088952, class08895 class088953) {
        this.R.N(class065812, class08825.N((class08909)class089092, (class08895)class088952, (class08895)class088953));
    }

    public final void N(class06581 class065812, class05946<class11647> class059462, class01894 class018942, boolean bl) {
        class08895 class088952;
        class01894 class018943 = class05387.N(class065812);
        class01894 class018944 = class05388.L(class065812);
        class01894 class018945 = class05388.N(class065812, "_overlay");
        ArrayList<class08940> arrayList = new ArrayList<class08940>(i.size());
        for (class05414 class054142 : i) {
            class08895 class088953;
            class01894 class018946 = class018943.M("_" + class054142.N().N().N() + "_trim");
            class01894 class018947 = class018942.M("_" + class054142.N().N(class059462).N());
            if (bl) {
                this.N(class018946, class018944, class018945, class018947);
                class088953 = class08825.N((class01894)class018946, (class08843[])new class08843[]{new class08840(-6265536)});
            } else {
                this.N(class018946, class018944, class018947);
                class088953 = class08825.N((class01894)class018946);
            }
            arrayList.add(class08825.N(class054142.y(), (class08895)class088953));
        }
        if (bl) {
            class05433.Ly.N(class018943, class05388.L(class018944, class018945), this.M);
            class088952 = class08825.N((class01894)class018943, (class08843[])new class08843[]{new class08840(-6265536)});
        } else {
            class05433.yD.N(class018943, class05388.U(class018944), this.M);
            class088952 = class08825.N((class01894)class018943);
        }
        this.R.N(class065812, class08825.N((class00372)new class00365(), (class08895)class088952, arrayList));
    }

    public final class01894 N(class01894 class018942, class01894 class018943, class01894 class018944) {
        return class05433.Ly.N(class018942, class05388.L(class018943, class018944), this.M);
    }

    public final void N(class01894 class018942, class01894 class018943, class01894 class018944, class01894 class018945) {
        class05433.LL.N(class018942, class05388.N(class018943, class018944, class018945), this.M);
    }

    public final void W(class06581 class065812) {
        class08895 class088952 = class08825.N((class01894)class05387.N(class065812), (class00335)new class00358());
        class08895 class088953 = class08825.N((class01894)class05387.N(class065812, "_blocking"), (class00335)new class00358());
        this.N(class065812, class08825.N(), class088953, class088952);
    }

    public final void R(class06581 class065812) {
        class08895 class088952 = class08825.N((class01894)this.N(class065812, class05433.yD));
        class01894 class018942 = this.N(class065812, class05433.LB, "_open_back");
        class01894 class018943 = this.N(class065812, class05433.LM, "_open_front");
        class08895 class088953 = class08825.N((class08895[])new class08895[]{class08825.N((class01894)class018942), new class08830(), class08825.N((class01894)class018943)});
        class08895 class088954 = class08825.N((class08909)new class08929(), (class08895)class088953, (class08895)class088952);
        this.R.N(class065812, class08825.N((class00372)new class00356(), (class08895)class088952, (class08940[])new class08940[]{class08825.N((Object)class03662.field_4317, (class08895)class088954)}));
    }
}

