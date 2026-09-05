/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  java.lang.MatchException
 *  minecraft.class00009
 *  minecraft.class00235
 *  minecraft.class00288
 *  minecraft.class00318
 *  minecraft.class00325
 *  minecraft.class00335
 *  minecraft.class00339
 *  minecraft.class00344
 *  minecraft.class00346
 *  minecraft.class00355
 *  minecraft.class00357
 *  minecraft.class00360
 *  minecraft.class00364
 *  minecraft.class00369
 *  minecraft.class00522
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01096
 *  minecraft.class01193
 *  minecraft.class01343
 *  minecraft.class01748
 *  minecraft.class01894
 *  minecraft.class01975
 *  minecraft.class02271
 *  minecraft.class02302
 *  minecraft.class02774
 *  minecraft.class03264
 *  minecraft.class03561
 *  minecraft.class03587
 *  minecraft.class03674
 *  minecraft.class03769
 *  minecraft.class04091
 *  minecraft.class04392
 *  minecraft.class04481
 *  minecraft.class04523
 *  minecraft.class04540
 *  minecraft.class04593
 *  minecraft.class05288
 *  minecraft.class05424
 *  minecraft.class05427
 *  minecraft.class05428
 *  minecraft.class05430
 *  minecraft.class05432
 *  minecraft.class05433
 *  minecraft.class05543
 *  minecraft.class05547
 *  minecraft.class05565
 *  minecraft.class05577
 *  minecraft.class05648
 *  minecraft.class06008
 *  minecraft.class06082
 *  minecraft.class06337
 *  minecraft.class06563
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06657
 *  minecraft.class06662
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06677
 *  minecraft.class07030
 *  minecraft.class07032
 *  minecraft.class07185
 *  minecraft.class07211
 *  minecraft.class08052
 *  minecraft.class08054
 *  minecraft.class08058
 *  minecraft.class08059
 *  minecraft.class08061
 *  minecraft.class08064
 *  minecraft.class08075
 *  minecraft.class08080
 *  minecraft.class08083
 *  minecraft.class08092
 *  minecraft.class08106
 *  minecraft.class08437
 *  minecraft.class08503
 *  minecraft.class08509
 *  minecraft.class08511
 *  minecraft.class08525
 *  minecraft.class08620
 *  minecraft.class08630
 *  minecraft.class08767
 *  minecraft.class08819
 *  minecraft.class08825
 *  minecraft.class08832
 *  minecraft.class08833
 *  minecraft.class08843
 *  minecraft.class08895
 *  minecraft.class08972
 *  minecraft.class08973
 *  minecraft.class08981
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import minecraft.class00009;
import minecraft.class00235;
import minecraft.class00288;
import minecraft.class00318;
import minecraft.class00325;
import minecraft.class00335;
import minecraft.class00339;
import minecraft.class00344;
import minecraft.class00346;
import minecraft.class00355;
import minecraft.class00357;
import minecraft.class00360;
import minecraft.class00364;
import minecraft.class00369;
import minecraft.class00522;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01096;
import minecraft.class01193;
import minecraft.class01343;
import minecraft.class01748;
import minecraft.class01894;
import minecraft.class01975;
import minecraft.class02271;
import minecraft.class02302;
import minecraft.class02774;
import minecraft.class03264;
import minecraft.class03561;
import minecraft.class03587;
import minecraft.class03674;
import minecraft.class03769;
import minecraft.class04091;
import minecraft.class04392;
import minecraft.class04481;
import minecraft.class04523;
import minecraft.class04540;
import minecraft.class04593;
import minecraft.class05288;
import minecraft.class05387;
import minecraft.class05388;
import minecraft.class05391;
import minecraft.class05392;
import minecraft.class05394;
import minecraft.class05399;
import minecraft.class05403;
import minecraft.class05413;
import minecraft.class05415;
import minecraft.class05418;
import minecraft.class05420;
import minecraft.class05424;
import minecraft.class05427;
import minecraft.class05428;
import minecraft.class05430;
import minecraft.class05432;
import minecraft.class05433;
import minecraft.class05543;
import minecraft.class05547;
import minecraft.class05565;
import minecraft.class05577;
import minecraft.class05648;
import minecraft.class06008;
import minecraft.class06082;
import minecraft.class06337;
import minecraft.class06563;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06657;
import minecraft.class06662;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06677;
import minecraft.class07030;
import minecraft.class07032;
import minecraft.class07185;
import minecraft.class07211;
import minecraft.class08052;
import minecraft.class08054;
import minecraft.class08058;
import minecraft.class08059;
import minecraft.class08061;
import minecraft.class08064;
import minecraft.class08075;
import minecraft.class08080;
import minecraft.class08083;
import minecraft.class08092;
import minecraft.class08106;
import minecraft.class08437;
import minecraft.class08503;
import minecraft.class08509;
import minecraft.class08511;
import minecraft.class08525;
import minecraft.class08620;
import minecraft.class08630;
import minecraft.class08767;
import minecraft.class08819;
import minecraft.class08825;
import minecraft.class08832;
import minecraft.class08833;
import minecraft.class08843;
import minecraft.class08895;
import minecraft.class08972;
import minecraft.class08973;
import minecraft.class08981;
import org.jspecify.annotations.Nullable;

public class class05404 {
    public final Consumer<class05399> N;
    public final class08833 y;
    public final BiConsumer<class01894, class08819> L;
    static final List<class00891> u = List.of(class00869.Ru, class00869.Rz, class00869.Zp);
    public static final class08503 i = class036742 -> class036742;
    public static final class08503 R = class08503.i.N((Object)true);
    public static final class08503 M = class08503.N.N((Object)class08511.field_57030);
    public static final class08503 B = class08503.N.N((Object)class08511.field_57031);
    public static final class08503 Z = class08503.N.N((Object)class08511.field_57032);
    public static final class08503 z = class08503.y.N((Object)class08511.field_57030);
    public static final class08503 U = class08503.y.N((Object)class08511.field_57031);
    public static final class08503 E = class08503.y.N((Object)class08511.field_57032);
    private static final Function<class08437, class08437> s = class084372 -> class084372;
    private static final Function<class08437, class08437> T = class084372 -> class084372.N((class08092)class06665.C, (Comparable)Integer.valueOf(2), (Comparable[])new Integer[]{3, 4});
    private static final Function<class08437, class08437> b = class084372 -> class084372.N((class08092)class06665.C, (Comparable)Integer.valueOf(3), (Comparable[])new Integer[]{4});
    private static final Function<class08437, class08437> j = class084372 -> class084372.N((class08092)class06665.C, (Comparable)Integer.valueOf(4));
    private static final Function<class08437, class08437> v = class084372 -> class084372.N((class08092)class06665.S, (Comparable)Integer.valueOf(1));
    private static final Function<class08437, class08437> n = class084372 -> class084372.N((class08092)class06665.S, (Comparable)Integer.valueOf(2), (Comparable[])new Integer[]{3});
    private static final Function<class08437, class08437> t = class084372 -> class084372.N((class08092)class06665.S, (Comparable)Integer.valueOf(3));
    private static final Function<class08437, class08437> G = class084372 -> class084372.N((class08092)class06665.S, (Comparable)Integer.valueOf(4));
    static final Map<class00891, class05430> W = Map.of(class00869.y, class05404::N, class00869.nZ, class05404::L, class00869.Rj, class05404::y);
    private static final class05415<class08503> l = class05415.y(class06665.F).N(class07211.field_11033, M).N(class07211.field_11036, Z).N(class07211.field_11043, i).N(class07211.field_11035, U).N(class07211.field_11039, E).N(class07211.field_11034, z);
    private static final class05415<class08503> d = class05415.y(class06665.F).N(class07211.field_11033, B).N(class07211.field_11036, i).N(class07211.field_11043, M).N(class07211.field_11035, M.N(U)).N(class07211.field_11039, M.N(E)).N(class07211.field_11034, M.N(z));
    private static final class05415<class08503> w = class05415.y(class06665.f).N(class07211.field_11034, i).N(class07211.field_11035, z).N(class07211.field_11039, U).N(class07211.field_11043, E);
    private static final class05415<class08503> k = class05415.y(class06665.f).N(class07211.field_11035, i).N(class07211.field_11039, z).N(class07211.field_11043, U).N(class07211.field_11034, E);
    private static final class05415<class08503> Y = class05415.y(class06665.f).N(class07211.field_11034, z).N(class07211.field_11035, U).N(class07211.field_11039, E).N(class07211.field_11043, i);
    static final Map<class00891, class05428> m = ImmutableMap.builder().put((Object)class00869.yL, (Object)class05428.O.get(class00869.yL)).put((Object)class00869.UB, (Object)class05428.O.get(class00869.UB)).put((Object)class00869.Ue, (Object)class05428.N((class01894)class05388.N(class00869.yL, "_top"))).put((Object)class00869.Uc, (Object)class05428.N((class01894)class05388.N(class00869.UB, "_top"))).put((Object)class00869.yi, (Object)class05428.u.get(class00869.yL).N((T class053882) -> class053882.N(class05418.Z, class05388.V(class00869.yi)))).put((Object)class00869.Uz, (Object)class05428.u.get(class00869.UB).N((T class053882) -> class053882.N(class05418.Z, class05388.V(class00869.Uz)))).put((Object)class00869.BC, (Object)class05428.u.get(class00869.BC)).put((Object)class00869.UH, (Object)class05428.N((class01894)class05388.N(class00869.BC, "_bottom"))).put((Object)class00869.Tb, (Object)class05428.g.get(class00869.Tb)).put((Object)class00869.nZ, (Object)class05428.g.get(class00869.nZ)).put((Object)class00869.BS, (Object)class05428.u.get(class00869.BS).N((T class053882) -> class053882.N(class05418.Z, class05388.V(class00869.BS)))).put((Object)class00869.yu, (Object)class05428.u.get(class00869.yu).N((T class053882) -> {
        class053882.N(class05418.u, class05388.N(class00869.yL, "_top"));
        class053882.N(class05418.Z, class05388.V(class00869.yu));
    })).put((Object)class00869.UZ, (Object)class05428.u.get(class00869.UZ).N((T class053882) -> {
        class053882.N(class05418.u, class05388.N(class00869.UB, "_top"));
        class053882.N(class05418.Z, class05388.V(class00869.UZ));
    })).put((Object)class00869.bH, (Object)class05428.g.get(class00869.bH)).put((Object)class00869.bo, (Object)class05428.g.get(class00869.bo)).build();
    static final Map<class05565, BiConsumer<class05420, class00891>> P = ImmutableMap.builder().put((Object)class05565.field_28533, class05420::N).put((Object)class05565.field_28535, class05420::E).put((Object)class05565.field_28534, class05420::U).put((Object)class05565.field_29503, class05420::U).put((Object)class05565.field_40592, class05420::L).put((Object)class05565.field_28536, class05420::u).put((Object)class05565.field_40593, class05420::i).put((Object)class05565.field_28537, class05420::R).put((Object)class05565.field_28538, class05420::B).put((Object)class05565.field_28539, class05420::Z).put((Object)class05565.field_28540, class05420::z).put((Object)class05565.field_28541, class05420::M).put((Object)class05565.field_28543, class05420::W).put((Object)class05565.field_28544, class05420::y).build();
    private static final Map<class07211, class08503> Q = ImmutableMap.of((Object)class07211.field_11043, (Object)i, (Object)class07211.field_11034, (Object)z.N(R), (Object)class07211.field_11035, (Object)U.N(R), (Object)class07211.field_11039, (Object)E.N(R), (Object)class07211.field_11036, (Object)Z.N(R), (Object)class07211.field_11033, (Object)M.N(R));
    private static final Map<class05391, class01894> O = new HashMap<class05391, class01894>();

    public final void w(class00891 class008912) {
        class05388 class053882 = new class05388().N(class05418.R, class05388.N(class00869.uN, "_top")).N(class05418.Z, class05388.N(class00869.uN, "_side")).N(class05418.M, class05388.N(class008912, "_front"));
        class05388 class053883 = new class05388().N(class05418.Z, class05388.N(class00869.uN, "_top")).N(class05418.M, class05388.N(class008912, "_front_vertical"));
        class03264 class032642 = class05404.y(class05433.s.N(class008912, class053882, this.L));
        class03264 class032643 = class05404.y(class05433.b.N(class008912, class053883, this.L));
        this.N.accept((class05399)class05427.N((class00891)class008912).N(class05415.N(class06665.F).N(class07211.field_11033, class032643.N(B)).N(class07211.field_11036, class032643).N(class07211.field_11043, class032642).N(class07211.field_11034, class032642.N(z)).N(class07211.field_11035, class032642.N(U)).N(class07211.field_11039, class032642.N(E))));
    }

    private void w() {
        class03264 class032642 = class05404.y(class05387.N(class00869.na));
        class03264 class032643 = class05404.y(class05387.N(class00869.na, "_triggered"));
        class03264 class032644 = class05404.y(class05387.N(class00869.na, "_crafting"));
        class03264 class032645 = class05404.y(class05387.N(class00869.na, "_crafting_triggered"));
        this.N.accept((class05399)class05427.N((class00891)class00869.na).N(class05415.N(class06665.J, class01748.y).N(false, false, class032642).N(true, true, class032645).N(true, false, class032643).N(false, true, class032644)).N(class05415.y(class06665.x).N(class05404::N)));
    }

    private void NY() {
        class01894 class018942 = class05387.y("template_skull");
        this.N(class00869.BO, class00869.Bg, (class07030)class07032.field_11507, class018942);
        this.N(class00869.BY, class00869.BQ, (class07030)class07032.field_11510, class018942);
        this.N(class00869.Bw, class00869.Bk, (class07030)class07032.field_11508, class018942);
        this.N(class00869.Bt, class00869.BG, (class07030)class07032.field_11512, class018942);
        this.N(class00869.Bl, class00869.Bd, (class07030)class07032.field_11513, class018942);
        this.N(class00869.Bo, class00869.Bq, (class07030)class07032.field_41313, class018942);
        this.N(class00869.BI, class00869.BJ, (class07030)class07032.field_11511, class05387.N(class06570.GQ));
    }

    public static class05399 L(class00891 class008912, class03674 class036742, class05388 class053882, BiConsumer<class01894, class08819> biConsumer) {
        class03674 class036743 = class05404.N(class05433.E.N(class008912, class053882, biConsumer));
        return class05427.N((class00891)class008912, (class03264)class05404.N(class036742, class036743)).N(class05404.y());
    }

    public final void L(class00891 class008912, class00891 class008913) {
        this.N.accept((class05399)class05404.N(class008912, class05404.y(class05387.N(class008913))));
    }

    public static class05399 L(class00891 class008912, class03264 class032642, class03264 class032643, class03264 class032644) {
        return class05427.N((class00891)class008912).N(class05415.N(class06665.f, class06665.NZ, class06665.d).N(class07211.field_11043, class08052.field_12617, false, class032643).N(class07211.field_11035, class08052.field_12617, false, class032643.N(U)).N(class07211.field_11034, class08052.field_12617, false, class032643.N(z)).N(class07211.field_11039, class08052.field_12617, false, class032643.N(E)).N(class07211.field_11043, class08052.field_12619, false, class032642).N(class07211.field_11035, class08052.field_12619, false, class032642.N(U)).N(class07211.field_11034, class08052.field_12619, false, class032642.N(z)).N(class07211.field_11039, class08052.field_12619, false, class032642.N(E)).N(class07211.field_11043, class08052.field_12617, true, class032644).N(class07211.field_11035, class08052.field_12617, true, class032644.N(U)).N(class07211.field_11034, class08052.field_12617, true, class032644.N(z)).N(class07211.field_11039, class08052.field_12617, true, class032644.N(E)).N(class07211.field_11043, class08052.field_12619, true, class032644.N(B).N(U)).N(class07211.field_11035, class08052.field_12619, true, class032644.N(B)).N(class07211.field_11034, class08052.field_12619, true, class032644.N(B).N(E)).N(class07211.field_11039, class08052.field_12619, true, class032644.N(B).N(z)));
    }

    public void L() {
        class05577.N().filter(class05547::L).forEach(class055472 -> this.B(class055472.N()).N((class05547)class055472));
        this.B(class00869.jR).N(class05577.l).N(class00869.jR, class00869.jO).N(class00869.jz, class00869.jm).N(class05577.w);
        this.B(class00869.ji).N(class05577.Y).N(class00869.ji, class00869.jQ).N(class00869.jZ, class00869.jW).N(class05577.O);
        this.B(class00869.ju).N(class05577.I).N(class00869.ju, class00869.jY).N(class00869.jB, class00869.jE).N(class05577.o);
        this.B(class00869.jL).N(class05577.K).N(class00869.jL, class00869.jk).N(class00869.jM, class00869.jU).N(class05577.e);
        this.k(class00869.vU);
        this.k(class00869.vE);
        this.k(class00869.vW);
        this.k(class00869.vm);
        this.z(class00869.vU, class00869.vP);
        this.z(class00869.vE, class00869.vs);
        this.z(class00869.vW, class00869.vT);
        this.z(class00869.vm, class00869.vb);
        this.W(class00869.N);
        this.L(class00869.mr, class00869.N);
        this.L(class00869.mh, class00869.N);
        this.W(class00869.MO);
        this.W(class00869.ij);
        this.L(class00869.PN, class00869.K);
        this.W(class00869.Ms);
        this.W(class00869.mN);
        this.W(class00869.MM);
        this.W(class00869.MJ);
        this.y(class06570.GT);
        this.W(class00869.TM);
        this.W(class00869.K);
        this.W(class00869.V);
        this.W(class00869.Zc);
        this.y(class06570.MQ);
        class06570.MO.N().forEach(this::N);
        this.v(class00869.TH, class00869.bu);
        this.v(class00869.Tc, class00869.bi);
        this.v(class00869.TX, class00869.bR);
        this.v(class00869.Ta, class00869.bM);
        this.v(class00869.Tp, class00869.bB);
        this.v(class00869.TF, class00869.bZ);
        this.v(class00869.TA, class00869.bz);
        this.v(class00869.Tf, class00869.bU);
        this.v(class00869.TC, class00869.bE);
        this.v(class00869.TS, class00869.bW);
        this.v(class00869.Tx, class00869.bm);
        this.v(class00869.TD, class00869.bP);
        this.v(class00869.Th, class00869.bs);
        this.v(class00869.Tr, class00869.bT);
        this.v(class00869.bN, class00869.bb);
        this.v(class00869.by, class00869.bj);
        this.v(class00869.Te, class00869.bL);
        this.W(class00869.mD);
        this.W(class00869.BZ);
        this.W(class00869.ba);
        this.W(class00869.vC);
        this.t(class00869.vS);
        this.t(class00869.vx);
        this.G(class00869.no);
        this.G(class00869.nq);
        this.Ni();
        this.B(class00869.ny, class00869.vD);
        this.H(class00869.nC);
        this.c(class00869.nS);
        this.R(class00869.nf);
        this.j(class00869.vh);
        this.j(class00869.vr);
        this.b(class00869.nN);
        this.y(class00869.tN, class05432.field_55176);
        this.y(class06570.uN);
        this.N(class00869.ZX, class06570.Zn);
        this.y(class06570.Zn);
        this.No();
        this.N(class00869.EK, class06570.zC);
        this.y(class06570.zC);
        this.y(class00869.LN, class05388.N(class00869.yq, "_side"));
        this.R(class00869.C);
        this.R(class00869.S);
        this.R(class00869.zv);
        this.R(class00869.LC);
        this.R(class00869.LS);
        this.R(class00869.Lx);
        this.R(class00869.Mv);
        this.R(class00869.Mn);
        this.R(class00869.Md);
        this.R(class00869.p);
        this.R(class00869.x);
        this.R(class00869.F);
        this.R(class00869.Lb);
        this.R(class00869.A);
        this.R(class00869.f);
        this.R(class00869.Lj);
        this.L(class00869.Tz, class05428.u);
        this.R(class00869.TZ);
        this.R(class00869.Nh);
        this.R(class00869.Nr);
        this.R(class00869.yN);
        this.R(class00869.Rx);
        this.R(class00869.BA);
        this.R(class00869.iU);
        this.R(class00869.iE);
        this.R(class00869.BF);
        this.R(class00869.TQ);
        this.R(class00869.mf);
        this.R(class00869.in);
        this.R(class00869.U);
        this.R(class00869.TU);
        this.R(class00869.MP);
        this.R(class00869.io);
        this.R(class00869.X);
        this.R(class00869.TB);
        this.R(class00869.iT);
        this.L(class00869.iG, class05428.M);
        this.L(class00869.TT, class05428.u);
        this.L(class00869.Rq, class05428.u);
        this.W(class00869.NM);
        this.W(class00869.Mp);
        this.R(class00869.EJ);
        this.R(class00869.yR);
        this.R(class00869.zn);
        this.R(class00869.LV);
        this.R(class00869.TV);
        this.R(class00869.zN);
        this.R(class00869.sG);
        this.R(class00869.iw);
        this.R(class00869.ik);
        this.L(class00869.La, class05428.y);
        this.i(class00869.Lp);
        this.R(class00869.NS);
        this.L(class00869.yJ, class05428.k);
        this.y(class06570.uu);
        this.L(class00869.Ln, class05428.R);
        this.L(class00869.Tu, class05428.u);
        this.R(class00869.sm);
        this.R(class00869.Nx);
        this.R(class00869.bv);
        this.R(class00869.bn);
        this.R(class00869.bc);
        this.R(class00869.vF);
        this.R(class00869.ng);
        this.R(class00869.nI);
        this.R(class00869.nJ);
        this.y(class00869.bA);
        this.W(class00869.nA);
        this.Nk();
        this.R(class00869.jN);
        this.R(class00869.jy);
        this.R(class00869.bx);
        this.R(class00869.bD);
        this.R(class00869.bh);
        this.R(class00869.br);
        this.P(class00869.bx, class00869.jG);
        this.P(class00869.bD, class00869.jd);
        this.P(class00869.bh, class00869.jl);
        this.P(class00869.br, class00869.jw);
        this.Z(class00869.jH);
        this.Z(class00869.jc);
        this.Z(class00869.ja);
        this.Z(class00869.jX);
        this.N(class00869.jH, class00869.jp);
        this.N(class00869.jc, class00869.jF);
        this.N(class00869.ja, class00869.jf);
        this.N(class00869.jX, class00869.jA);
        this.U(class00869.jC);
        this.U(class00869.jS);
        this.U(class00869.jD);
        this.U(class00869.jx);
        this.y(class00869.jC, class00869.jh);
        this.y(class00869.jS, class00869.jr);
        this.y(class00869.jD, class00869.vy);
        this.y(class00869.jx, class00869.vN);
        this.R(class00869.vL);
        this.R(class00869.vu);
        this.R(class00869.vi);
        this.R(class00869.vR);
        this.P(class00869.vL, class00869.vM);
        this.P(class00869.vu, class00869.vB);
        this.P(class00869.vi, class00869.vZ);
        this.P(class00869.vR, class00869.vz);
        this.U(class00869.vq, class00869.vH);
        this.U(class00869.vK, class00869.vc);
        this.U(class00869.vV, class00869.vX);
        this.U(class00869.ve, class00869.va);
        this.m(class00869.Bc, class00869.Lb);
        this.m(class00869.BX, class00869.Lj);
        this.b(class00869.Ll, class00869.NW);
        this.b(class00869.Ld, class00869.Nj);
        this.b(class00869.Lw, class00869.NU);
        this.b(class00869.Lk, class00869.Nm);
        this.b(class00869.LY, class00869.sb);
        this.b(class00869.LQ, class00869.NP);
        this.b(class00869.LO, class00869.NE);
        this.b(class00869.Lg, class00869.Nb);
        this.b(class00869.LI, class00869.NT);
        this.b(class00869.LJ, class00869.Ns);
        this.b(class00869.Lo, class00869.Nz);
        this.b(class00869.Lq, class00869.sZ);
        this.O();
        this.P();
        this.Nn();
        this.j();
        this.v();
        this.N(new class00891[]{class00869.si, class00869.sR});
        this.n();
        this.l();
        this.d();
        this.Y();
        this.Q();
        this.I();
        this.k();
        this.O(class00869.Es);
        this.J();
        this.o();
        this.q();
        this.e();
        this.H();
        this.c();
        this.X();
        this.m();
        this.a();
        this.q(class00869.RQ);
        class00869.RO.y().forEach(this::s);
        this.p();
        this.F();
        this.f();
        this.C();
        this.S();
        this.x();
        this.D();
        this.Nu();
        this.NM();
        this.NR();
        this.NB();
        this.NZ();
        this.t();
        this.Nz();
        this.NU();
        this.NE();
        this.Nm();
        this.NW();
        this.R(class00869.Ty);
        this.NP();
        this.Ns();
        this.NT();
        this.Nj();
        this.Nb();
        this.u();
        this.V(class00869.RX);
        this.V(class00869.bf);
        this.y(class00869.Ra, class06570.Mq);
        this.Nt();
        this.Nw();
        this.NN();
        this.Ny();
        this.NL();
        this.A();
        this.V();
        this.K();
        this.h();
        this.r();
        this.K(class00869.uW);
        this.N(class00869.uW);
        this.K(class00869.PD);
        this.i();
        this.K(class00869.nu);
        this.T(class00869.Le, class00869.LH);
        this.T(class00869.iO, class00869.ig);
        this.T(class00869.iI, class00869.iJ);
        this.N(class00869.LD, class00869.m, class05388::L);
        this.N(class00869.PS, class00869.s, class05388::u);
        this.Q(class00869.sn);
        this.Q(class00869.sE);
        this.w(class00869.yy);
        this.w(class00869.Br);
        this.w();
        this.o(class00869.sy);
        this.o(class00869.sL);
        class00869.su.y().forEach(this::E);
        this.L(class00869.Rg, class05404.y(class05428.w.N(class00869.Rg, this.L)));
        class00869.RI.y().forEach(this::W);
        this.N(class00869.iY, class05428.u);
        this.N(class00869.iQ, class05428.u);
        this.R(class00869.nO);
        this.N(class00869.Eq, class05428.u);
        this.L(class00869.z);
        this.L(class00869.nM);
        this.L(class00869.e);
        this.u(class00869.H);
        this.u(class00869.a);
        this.L(class00869.c);
        this.y(class00869.q);
        this.L(class00869.nc, class05428.R);
        this.N(class00869.zy, class05428.u, class05428.i);
        this.N(class00869.Ev, class05428.Y, class05428.Q);
        this.N(class00869.Bx, class05428.Y, class05428.Q);
        this.N(class00869.nK, class05428.u, class05428.i);
        this.N(class00869.nV, class05428.u, class05428.i);
        this.N(class00869.ne, class05428.u, class05428.i);
        this.y(class00869.Pp, class05428.Z);
        this.G();
        this.N(class00869.Ti, class05388::O);
        this.N(class00869.TR, class05388::I);
        this.N(class00869.Ew, (class08092<Integer>)class06665.NG, 0, 1, 2, 3);
        this.N(class00869.Bz, (class08092<Integer>)class06665.Nw, 0, 0, 1, 1, 2, 2, 2, 3);
        this.N(class00869.MR, (class08092<Integer>)class06665.NG, 0, 1, 1, 2);
        this.N(class00869.BU, (class08092<Integer>)class06665.Nw, 0, 0, 1, 1, 2, 2, 2, 3);
        this.N(class00869.Lh, (class08092<Integer>)class06665.Nw, 0, 1, 2, 3, 4, 5, 6, 7);
        this.N(class00869.EG, class05432.field_22840, (class08092<Integer>)class06665.Nn, 0, 1);
        this.M();
        this.R();
        this.NO();
        this.NJ();
        this.NY();
        this.Ng();
        this.NI();
        this.N(class00869.Ee, (class06563)null);
        this.N(class00869.EH, class06563.field_7952);
        this.N(class00869.Ec, class06563.field_7946);
        this.N(class00869.EX, class06563.field_7958);
        this.N(class00869.Ea, class06563.field_7951);
        this.N(class00869.Ep, class06563.field_7947);
        this.N(class00869.EF, class06563.field_7961);
        this.N(class00869.EA, class06563.field_7954);
        this.N(class00869.Ef, class06563.field_7944);
        this.N(class00869.EC, class06563.field_7967);
        this.N(class00869.ES, class06563.field_7955);
        this.N(class00869.Ex, class06563.field_7945);
        this.N(class00869.ED, class06563.field_7966);
        this.N(class00869.Eh, class06563.field_7957);
        this.N(class00869.Er, class06563.field_7942);
        this.N(class00869.WN, class06563.field_7964);
        this.N(class00869.Wy, class06563.field_7963);
        this.NQ();
        this.T(class00869.mC);
        this.N(class00869.mC, (class00335)new class00339());
        this.M(class00869.nX, class00869.zj);
        this.N(class00869.nX, (class00335)new class00369());
        this.M(class00869.MW, class00869.LV);
        this.M(class00869.EY, class00869.LV);
        this.R(class00869.Nf);
        this.R(class00869.NC);
        this.R(class00869.Wj);
        this.R(class00869.Wv);
        this.R(class00869.Wn);
        this.R(class00869.Wt);
        this.R(class00869.WG);
        this.R(class00869.Wl);
        this.R(class00869.Wd);
        this.R(class00869.Ww);
        this.R(class00869.Wk);
        this.R(class00869.WY);
        this.R(class00869.WQ);
        this.R(class00869.WO);
        this.R(class00869.Wg);
        this.R(class00869.WI);
        this.R(class00869.WJ);
        this.R(class00869.Wo);
        this.N(class05428.N, class00869.Wq, class00869.WK, class00869.WV, class00869.We, class00869.WH, class00869.Wc, class00869.WX, class00869.Wa, class00869.Wp, class00869.WF, class00869.WA, class00869.Wf, class00869.WC, class00869.WS, class00869.Wx, class00869.WD);
        this.R(class00869.zj);
        this.R(class00869.ZN);
        this.R(class00869.Zy);
        this.R(class00869.ZL);
        this.R(class00869.Zu);
        this.R(class00869.Zi);
        this.R(class00869.ZR);
        this.R(class00869.ZM);
        this.R(class00869.ZB);
        this.R(class00869.ZZ);
        this.R(class00869.Zz);
        this.R(class00869.ZU);
        this.R(class00869.ZE);
        this.R(class00869.ZW);
        this.R(class00869.Zm);
        this.R(class00869.ZP);
        this.R(class00869.Zs);
        this.R(class00869.bX);
        this.Z(class00869.ND, class00869.RJ);
        this.Z(class00869.ic, class00869.ZT);
        this.Z(class00869.iX, class00869.Zb);
        this.Z(class00869.ia, class00869.Zj);
        this.Z(class00869.ip, class00869.Zv);
        this.Z(class00869.iF, class00869.Zn);
        this.Z(class00869.iA, class00869.Zt);
        this.Z(class00869.f_if__1, class00869.ZG);
        this.Z(class00869.iC, class00869.Zl);
        this.Z(class00869.iS, class00869.Zd);
        this.Z(class00869.ix, class00869.Zw);
        this.Z(class00869.iD, class00869.Zk);
        this.Z(class00869.ih, class00869.ZY);
        this.Z(class00869.ir, class00869.ZQ);
        this.Z(class00869.RN, class00869.ZO);
        this.Z(class00869.Ry, class00869.Zg);
        this.Z(class00869.RL, class00869.ZI);
        this.y(class05428.v, class00869.WL, class00869.Wu, class00869.Wi, class00869.WR, class00869.WM, class00869.WB, class00869.WZ, class00869.Wz, class00869.WU, class00869.WE, class00869.WW, class00869.Wm, class00869.WP, class00869.Ws, class00869.WT, class00869.Wb);
        this.B(class00869.yV, class00869.zL);
        this.B(class00869.ye, class00869.zu);
        this.B(class00869.yH, class00869.zi);
        this.B(class00869.yc, class00869.zR);
        this.B(class00869.yX, class00869.zM);
        this.B(class00869.ya, class00869.zB);
        this.B(class00869.yp, class00869.zZ);
        this.B(class00869.yF, class00869.zz);
        this.B(class00869.yA, class00869.zU);
        this.B(class00869.yf, class00869.zE);
        this.B(class00869.yC, class00869.zW);
        this.B(class00869.yS, class00869.zm);
        this.B(class00869.yx, class00869.zP);
        this.B(class00869.yD, class00869.zs);
        this.B(class00869.yh, class00869.zT);
        this.B(class00869.yr, class00869.zb);
        this.R(class00869.nB);
        this.R(class00869.Rb);
        this.y(class00869.yY, class00869.MF, class05432.field_22839);
        this.M(class00869.yY);
        this.N(class00869.Ly, class00869.MA, class05432.field_22840);
        this.N(class00869.Lu, class00869.Mf, class05432.field_22840);
        this.N(class00869.nx, class00869.nh, class05432.field_55176);
        this.N(class00869.nD, class00869.nr, class05432.field_22840);
        this.N(class00869.Li, class00869.MC, class05432.field_22840);
        this.N(class00869.LR, class00869.MS, class05432.field_22840);
        this.N(class00869.LM, class00869.Mx, class05432.field_22840);
        this.N(class00869.LB, class00869.MD, class05432.field_22840);
        this.N(class00869.LZ, class00869.Mh, class05432.field_22840);
        this.N(class00869.Lz, class00869.Mr, class05432.field_22840);
        this.N(class00869.LU, class00869.BN, class05432.field_22840);
        this.N(class00869.LE, class00869.By, class05432.field_22840);
        this.N(class00869.LW, class00869.BL, class05432.field_22840);
        this.N(class00869.LP, class00869.Bu, class05432.field_22840);
        this.N(class00869.Lm, class00869.Bi, class05432.field_22840);
        this.N(class00869.LT, class00869.BR, class05432.field_22840);
        this.N(class00869.Ls, class00869.BM, class05432.field_22840);
        this.N(class00869.yQ, class00869.BB, class05432.field_22840);
        this.N(class00869.LL, class00869.Mo, class05432.field_22840);
        this.g();
        this.l(class00869.Rw);
        this.l(class00869.Rk);
        this.l(class00869.RY);
        this.y(class00869.yk, class05432.field_22839);
        this.M(class00869.yk);
        this.N(class00869.yg, class05432.field_22840);
        this.N(class00869.yI, class05432.field_22840);
        this.y(class00869.yO, class05432.field_22839);
        this.M(class00869.yO);
        this.y(class00869.it, class05432.field_22839);
        this.y(class06570.ux);
        this.L(class00869.Wh, class00869.Wr, class05432.field_22840);
        this.y(class06570.uD);
        this.y(class00869.nR, class05432.field_22840);
        this.L(class00869.sl, class00869.sd, class05432.field_22840);
        this.L(class00869.sw, class00869.sk, class05432.field_22840);
        this.N(class00869.sl, "_plant");
        this.N(class00869.sw, "_plant");
        this.N(class00869.mS, class05432.field_22839, class05388.L(class05388.N(class00869.mx, "_stage0")));
        this.U();
        this.N(class00869.iv, class05432.field_22840);
        this.N(class00869.yw, class05432.field_22840);
        this.u(class00869.zG, class05432.field_22840);
        this.u(class00869.zl, class05432.field_22840);
        this.u(class00869.zd, class05432.field_22840);
        this.m(class00869.zw);
        this.m(class00869.zk);
        this.B();
        this.Z();
        this.z();
        this.N(class00869.mv, class00869.mP, class00869.mz, class00869.mi, class00869.mO, class00869.md, class00869.mc, class00869.mq);
        this.N(class00869.mn, class00869.ms, class00869.mU, class00869.mR, class00869.mg, class00869.mw, class00869.mX, class00869.mK);
        this.N(class00869.mt, class00869.mT, class00869.mE, class00869.mM, class00869.mI, class00869.mk, class00869.ma, class00869.mV);
        this.N(class00869.mG, class00869.mb, class00869.mW, class00869.mB, class00869.mJ, class00869.mY, class00869.mp, class00869.me);
        this.N(class00869.ml, class00869.mj, class00869.mm, class00869.mZ, class00869.mo, class00869.mQ, class00869.mF, class00869.mH);
        this.i(class00869.RH, class00869.RV);
        this.i(class00869.Re, class00869.RK);
        this.E(class00869.NR).L(class00869.NR).N(class00869.Nk);
        this.E(class00869.Nb).L(class00869.Nb).N(class00869.NK);
        this.N(class00869.Nb, class00869.uK, class00869.uf);
        this.N(class00869.NA, class05428.G, -7158200);
        this.E(class00869.Ny).L(class00869.Ny).N(class00869.Nl);
        this.E(class00869.NW).L(class00869.NW).N(class00869.NI);
        this.N(class00869.NW, class00869.uQ, class00869.uX);
        this.N(class00869.O, class00869.MH, class05432.field_22840);
        this.N(class00869.NX, class05428.G, -12012264);
        this.E(class00869.NL).u(class00869.NL).N(class00869.Nd);
        this.E(class00869.Nm).u(class00869.Nm).N(class00869.NJ);
        this.N(class00869.Nm, class00869.uO, class00869.ua);
        this.N(class00869.g, class00869.Mc, class05432.field_22840);
        this.L(class00869.Na, class05428.G);
        this.E(class00869.r).L(class00869.r).N(class00869.Nt);
        this.E(class00869.NU).L(class00869.NU).N(class00869.NO);
        this.N(class00869.NU, class00869.uY, class00869.uc);
        this.N(class00869.Y, class00869.MV, class05432.field_22840);
        this.N(class00869.NH, class05428.G, -8345771);
        this.E(class00869.D).L(class00869.D).N(class00869.Nv);
        this.E(class00869.NT).L(class00869.NT).N(class00869.NY);
        this.N(class00869.NT, class00869.uw, class00869.ue);
        this.N(class00869.w, class00869.Mq, class05432.field_22840);
        this.N(class00869.NV, class05428.G, -12012264);
        this.E(class00869.h).L(class00869.h).N(class00869.Nn);
        this.E(class00869.Nz).L(class00869.Nz).N(class00869.NQ);
        this.N(class00869.Nz, class00869.uk, class00869.uH);
        this.N(class00869.k, class00869.MK, class05432.field_22840);
        this.N(class00869.Ne, class05428.G, -10380959);
        this.E(class00869.Nu).L(class00869.Nu).N(class00869.Nw);
        this.E(class00869.NP).L(class00869.NP).N(class00869.No);
        this.N(class00869.NP, class00869.uI, class00869.uF);
        this.N(class00869.I, class00869.MX, class05432.field_22840);
        this.N(class00869.Np, class05428.G, -12012264);
        this.E(class00869.Ni).L(class00869.Ni).N(class00869.n);
        this.E(class00869.Ns).L(class00869.Ns).N(class00869.Nq);
        this.N(class00869.Ns, class00869.uJ, class00869.uA);
        this.N(class00869.J, class00869.Ma, class05432.field_22840);
        this.L(class00869.NF, class05428.G);
        this.E(class00869.NN).L(class00869.NN).N(class00869.NG);
        this.E(class00869.NE).L(class00869.NE).N(class00869.Ng);
        this.N(class00869.NE, class00869.ug, class00869.up);
        this.N(class00869.Q, class00869.Me, class05432.field_22840);
        this.N(class00869.Nc, class05428.G, -12012264);
        this.E(class00869.sT).y(class00869.sT).N(class00869.sj);
        this.E(class00869.sb).y(class00869.sb).N(class00869.sv);
        this.N(class00869.sb, class00869.uo, class00869.uC);
        this.N(class00869.st, class00869.TW, class05432.field_22840);
        this.j(class00869.sY, class00869.TP);
        this.E(class00869.sB).y(class00869.sB).N(class00869.sz);
        this.E(class00869.sZ).y(class00869.sZ).N(class00869.sU);
        this.N(class00869.sZ, class00869.uq, class00869.uS);
        this.N(class00869.sW, class00869.Tm, class05432.field_22840);
        this.j(class00869.sP, class00869.Ts);
        this.E(class00869.NZ).u(class00869.NZ);
        this.E(class00869.Nj).u(class00869.Nj);
        this.N(class00869.l, class00869.uV, class00869.ux);
        this.y(class00869.ss, class05432.field_22840);
        this.y(class06570.uf);
        this.Z(class00869.ur);
        this.U(class00869.Zp);
        this.b();
        this.P(class00869.um);
        this.s(class00869.yG);
        this.s(class00869.yl);
        this.s(class00869.Bh);
        this.T();
        this.v(class00869.MQ);
        this.v(class00869.EQ);
        this.v(class00869.EO);
        this.n(class00869.BK);
        this.n(class00869.BV);
        this.n(class00869.Be);
        this.E();
        this.W();
        this.u(class00869.uN, class05428.B);
        this.u(class00869.Pf, class05428.B);
        this.u(class00869.PA, class05428.Z);
        this.s();
        this.Nd();
        this.Nv();
        this.P(class00869.RT, class00869.Rd);
        this.P(class00869.W, class00869.Rn);
        this.P(class00869.Rs, class00869.Rl);
        this.P(class00869.RP, class00869.RG);
        this.NG();
        this.P(class00869.Rm, class00869.Rt);
        this.Nl();
    }

    public final void L(class00891 class008912, class00891 class008913, class05432 class054322) {
        this.y(class008912, class054322);
        this.y(class008913, class054322);
    }

    public final void L(class00891 class008912, class05432 class054322) {
        class03264 class032642 = class05404.y(this.N(class008912, "_top", class054322.N(), class05388::L));
        class03264 class032643 = class05404.y(this.N(class008912, "_bottom", class054322.N(), class05388::L));
        this.i(class008912, class032642, class032643);
    }

    public void L(class00891 class008912, class01343 class013432) {
        this.N.accept((class05399)class05404.N(class008912, class05404.y(class013432.N(class008912, this.L))));
    }

    public static class05399 L(class00891 class008912, class03264 class032642, class03264 class032643) {
        return class05427.N((class00891)class008912).N(class05415.N(class06665.V).N(class07185.field_11052, class032642).N(class07185.field_11051, class032643.N(M)).N(class07185.field_11048, class032643.N(M).N(z)));
    }

    public final void L(class00891 class008912, class03264 class032642) {
        this.N.accept(class05404.y(class008912, class032642));
    }

    public final void L(class00891 class008912) {
        class03674 class036742 = class05404.N(class05428.N.N(class008912, this.L));
        this.N.accept((class05399)class05427.N((class00891)class008912, (class03264)class05404.y(class036742)));
    }

    private void Nd() {
        class01894 class018942 = class05388.N(class00869.TE, "_bottom");
        class01894 class018943 = class05388.N(class00869.TE, "_top_off");
        class01894 class018944 = class05388.N(class00869.TE, "_top");
        class01894[] class01894Array = new class01894[5];
        for (int i = 0; i < 5; ++i) {
            class05388 class053882 = new class05388().N(class05418.i, class018942).N(class05418.R, i == 0 ? class018943 : class018944).N(class05418.Z, class05388.N(class00869.TE, "_side" + i));
            class01894Array[i] = class05433.m.N(class00869.TE, "_" + i, class053882, this.L);
        }
        this.N.accept((class05399)class05427.N((class00891)class00869.TE).N(class05415.N(class06665.yu).N((T1 n) -> class05404.y(class01894Array[n]))));
        this.N(class00869.TE, class01894Array[0]);
    }

    private void Nl() {
        class01894 class018942 = class05387.N(class00869.nZ);
        class03674 class036742 = class05404.N(class018942);
        class03674 class036743 = class05404.N(class05387.N(class00869.nZ, "_mirrored"));
        this.N.accept((class05399)class05427.N((class00891)class00869.nQ, (class03264)class05404.N(class036742, class036743)).N(class05404.y()));
        this.N(class00869.nQ, class018942);
    }

    private void No() {
        class08895 class088952 = class08825.N((class01894)this.N(class06570.Zt));
        HashMap<Integer, class08895> hashMap = new HashMap<Integer, class08895>(16);
        class05392<class03264, Integer> class053922 = class05415.N(class06665.Nf);
        for (int i = 0; i <= 15; ++i) {
            String string = String.format(Locale.ROOT, "_%02d", i);
            class01894 class018942 = class05388.N(class06570.Zt, string);
            class053922.N(i, class05404.y(class05433.NN.N(class00869.Za, string, class05388.B(class018942), this.L)));
            class08895 class088953 = class08825.N((class01894)class05433.yD.N(class05387.N(class06570.Zt, string), class05388.U(class018942), this.L));
            hashMap.put(i, class088953);
        }
        this.y.N(class06570.Zt, class08825.N((class08092)class04392.L, (class08895)class088952, hashMap));
        this.N.accept((class05399)class05427.N((class00891)class00869.Za).N(class053922));
    }

    private void M() {
        class00891 class008912 = class00869.El;
        this.y(class008912.B());
        this.N.accept((class05399)class05427.N((class00891)class008912).N(class05415.N(class03587.i, class06665.NB).N((T1 n, T2 class080592) -> switch (class080592) {
            default -> throw new MatchException(null, null);
            case class08059.field_12609 -> class05404.y(class05387.N(class008912, "_top_stage_" + n));
            case class08059.field_12607 -> class05404.y(class05387.N(class008912, "_bottom_stage_" + n));
        })));
    }

    public void M(class00891 class008912, class00891 class008913) {
        this.N.accept((class05399)class05404.N(class008912, this.R(class008912, class008913)));
    }

    public final void M(class00891 class008912) {
        class01894 class018942 = this.N(class008912.B(), class008912);
        this.N(class008912, class018942, (class08843)new class08832());
    }

    public final void P(class00891 class008912, class00891 class008913) {
        class03264 class032642 = class05404.y(class05387.N(class008912));
        this.N.accept((class05399)class05427.N((class00891)class008913, (class03264)class032642));
        this.y.N(class008912.B(), class008913.B());
    }

    private void P() {
        class05388 class053882 = class05388.N(class05388.V(class00869.Lt), class05388.V(class00869.m));
        class03264 class032642 = class05404.y(class05433.z.N(class00869.Lt, class053882, this.L));
        this.N.accept((class05399)class05404.N(class00869.Lt, class032642));
    }

    public final void P(class00891 class008912) {
        class05388 class053882 = class05388.B(class008912);
        class05388 class053883 = class05388.i(class05388.N(class008912, "_corner"));
        class03264 class032642 = class05404.y(class05433.Nn.N(class008912, class053882, this.L));
        class03264 class032643 = class05404.y(class05433.Nt.N(class008912, class053883, this.L));
        class03264 class032644 = class05404.y(class05433.NG.N(class008912, class053882, this.L));
        class03264 class032645 = class05404.y(class05433.Nl.N(class008912, class053882, this.L));
        this.N(class008912);
        this.N.accept((class05399)class05427.N((class00891)class008912).N(class05415.N(class06665.NU).N(class08080.field_12665, class032642).N(class08080.field_12674, class032642.N(z)).N(class08080.field_12667, class032644.N(z)).N(class08080.field_12666, class032645.N(z)).N(class08080.field_12670, class032644).N(class08080.field_12668, class032645).N(class08080.field_12664, class032643).N(class08080.field_12671, class032643.N(z)).N(class08080.field_12672, class032643.N(U)).N(class08080.field_12663, class032643.N(E))));
    }

    private void NP() {
        this.y(class06570.Th);
        this.N.accept((class05399)class05427.N((class00891)class00869.Ml).N((class05415<class03264>)class05415.N(class06665.N, class06665.X, class06665.c, class06665.a, class06665.p).N((Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Object)class05404.y(class05387.N(class00869.Ml, "_ns"))).N((Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Object)class05404.y(class05387.N(class00869.Ml, "_n")).N(z)).N((Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Object)class05404.y(class05387.N(class00869.Ml, "_n"))).N((Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Object)class05404.y(class05387.N(class00869.Ml, "_n")).N(U)).N((Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Object)class05404.y(class05387.N(class00869.Ml, "_n")).N(E)).N((Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Object)class05404.y(class05387.N(class00869.Ml, "_ne"))).N((Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Object)class05404.y(class05387.N(class00869.Ml, "_ne")).N(z)).N((Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Object)class05404.y(class05387.N(class00869.Ml, "_ne")).N(U)).N((Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Object)class05404.y(class05387.N(class00869.Ml, "_ne")).N(E)).N((Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Object)class05404.y(class05387.N(class00869.Ml, "_ns"))).N((Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Object)class05404.y(class05387.N(class00869.Ml, "_ns")).N(z)).N((Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Object)class05404.y(class05387.N(class00869.Ml, "_nse"))).N((Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Object)class05404.y(class05387.N(class00869.Ml, "_nse")).N(z)).N((Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Object)class05404.y(class05387.N(class00869.Ml, "_nse")).N(U)).N((Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Object)class05404.y(class05387.N(class00869.Ml, "_nse")).N(E)).N((Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Object)class05404.y(class05387.N(class00869.Ml, "_nsew"))).N((Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Object)class05404.y(class05387.N(class00869.Ml, "_attached_ns"))).N((Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Object)class05404.y(class05387.N(class00869.Ml, "_attached_n"))).N((Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Object)class05404.y(class05387.N(class00869.Ml, "_attached_n")).N(U)).N((Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Object)class05404.y(class05387.N(class00869.Ml, "_attached_n")).N(z)).N((Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Object)class05404.y(class05387.N(class00869.Ml, "_attached_n")).N(E)).N((Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Object)class05404.y(class05387.N(class00869.Ml, "_attached_ne"))).N((Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Object)class05404.y(class05387.N(class00869.Ml, "_attached_ne")).N(z)).N((Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Object)class05404.y(class05387.N(class00869.Ml, "_attached_ne")).N(U)).N((Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Object)class05404.y(class05387.N(class00869.Ml, "_attached_ne")).N(E)).N((Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Object)class05404.y(class05387.N(class00869.Ml, "_attached_ns"))).N((Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Object)class05404.y(class05387.N(class00869.Ml, "_attached_ns")).N(z)).N((Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Object)class05404.y(class05387.N(class00869.Ml, "_attached_nse"))).N((Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Object)class05404.y(class05387.N(class00869.Ml, "_attached_nse")).N(z)).N((Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Object)class05404.y(class05387.N(class00869.Ml, "_attached_nse")).N(U)).N((Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(false), (Comparable)Boolean.valueOf(true), (Object)class05404.y(class05387.N(class00869.Ml, "_attached_nse")).N(E)).N((Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Comparable)Boolean.valueOf(true), (Object)class05404.y(class05387.N(class00869.Ml, "_attached_nsew")))));
    }

    private void X() {
        class03674 class036742 = class05404.N(class05387.N(class00869.Ek));
        this.N.accept((class05399)class05427.N((class00891)class00869.Ek, (class03264)class05404.y(class036742)));
    }

    public final void K(class00891 class008912) {
        this.N.accept((class05399)class05427.N((class00891)class008912, (class03264)class05404.y(class05387.N(class008912))).N(Y));
    }

    private void K() {
        class05388 class053882 = class05388.N(class05388.N(class00869.NB, "_side"), class05388.N(class00869.NB, "_top"));
        class03264 class032642 = class05404.y(class05433.z.N(class00869.NB, class053882, this.L));
        this.N.accept(class05404.y(class00869.NB, class032642));
    }

    public final void T(class00891 class008912, class00891 class008913) {
        class05388 class053882 = class05388.Y(class008912);
        this.N.accept((class05399)class05404.N(class008912, class05404.y(class05433.yk.N(class008912, class053882, this.L))));
        this.N.accept((class05399)class05427.N((class00891)class008913, (class03264)class05404.y(class05433.yQ.N(class008913, class053882, this.L))).N(w));
        this.N(class008912);
    }

    public final void T(class00891 class008912) {
        this.M(class008912, class008912);
    }

    private void T() {
        this.y(class06570.WI);
        this.N.accept((class05399)class05427.N((class00891)class00869.Ba).N(class05415.N(class06665.yZ, class06665.k).N(class06677.field_12576, false, class05404.y(class05387.N(class00869.Ba))).N(class06677.field_12576, true, class05404.y(class05387.N(class00869.Ba, "_on"))).N(class06677.field_12578, false, class05404.y(class05387.N(class00869.Ba, "_subtract"))).N(class06677.field_12578, true, class05404.y(class05387.N(class00869.Ba, "_on_subtract")))).N(k));
    }

    private void Q() {
        this.N.accept(class05394.N(class00869.TL).N(class05404.y(class05388.V(class00869.TL))).N(class05404.N().N((class08092)class06665.Na, (Comparable)Integer.valueOf(1)), class05404.y(class05388.N(class00869.TL, "_contents1"))).N(class05404.N().N((class08092)class06665.Na, (Comparable)Integer.valueOf(2)), class05404.y(class05388.N(class00869.TL, "_contents2"))).N(class05404.N().N((class08092)class06665.Na, (Comparable)Integer.valueOf(3)), class05404.y(class05388.N(class00869.TL, "_contents3"))).N(class05404.N().N((class08092)class06665.Na, (Comparable)Integer.valueOf(4)), class05404.y(class05388.N(class00869.TL, "_contents4"))).N(class05404.N().N((class08092)class06665.Na, (Comparable)Integer.valueOf(5)), class05404.y(class05388.N(class00869.TL, "_contents5"))).N(class05404.N().N((class08092)class06665.Na, (Comparable)Integer.valueOf(6)), class05404.y(class05388.N(class00869.TL, "_contents6"))).N(class05404.N().N((class08092)class06665.Na, (Comparable)Integer.valueOf(7)), class05404.y(class05388.N(class00869.TL, "_contents7"))).N(class05404.N().N((class08092)class06665.Na, (Comparable)Integer.valueOf(8)), class05404.y(class05388.N(class00869.TL, "_contents_ready"))));
    }

    public final void Q(class00891 class008912) {
        class05388 class053882 = new class05388().N(class05418.i, class05388.V(class00869.id)).N(class05418.R, class05388.V(class008912)).N(class05418.Z, class05388.N(class008912, "_side"));
        this.N.accept((class05399)class05404.N(class008912, class05404.y(class05433.m.N(class008912, class053882, this.L))));
    }

    public class05404(Consumer<class05399> consumer, class08833 class088332, BiConsumer<class01894, class08819> biConsumer) {
        this.N = consumer;
        this.y = class088332;
        this.L = biConsumer;
    }

    public final class05420 B(class00891 class008912) {
        class05428 class054282 = m.getOrDefault(class008912, class05428.N.get(class008912));
        return new class05420(this, class054282.y()).N(class008912, class054282.N());
    }

    public final void B(class00891 class008912, class00891 class008913) {
        this.R(class008912);
        class03264 class032642 = class05404.y(class05428.z.get(class008912).N(class008913, this.L));
        this.N.accept((class05399)class05404.N(class008913, class032642));
    }

    private void B() {
        this.N(class00869.zt, "_front");
        class03264 class032642 = class05404.y(class05387.N(class00869.zt, "_top"));
        class03264 class032643 = class05404.y(this.N(class00869.zt, "_bottom", class05432.field_22840.N(), class05388::L));
        this.i(class00869.zt, class032642, class032643);
    }

    private void C() {
        class03674 class036742 = class05404.N(class05428.N.N(class00869.id, this.L));
        this.N.accept((class05399)class05427.N((class00891)class00869.id, (class03264)class05404.N(class036742, class036742.N(M), class036742.N(B), class036742.N(Z), class036742.N(z), class036742.N(z.N(M)), class036742.N(z.N(B)), class036742.N(z.N(Z)), class036742.N(U), class036742.N(U.N(M)), class036742.N(U.N(B)), class036742.N(U.N(Z)), class036742.N(E), class036742.N(E.N(M)), class036742.N(E.N(B)), class036742.N(E.N(Z)))));
    }

    private void D() {
        class05388 class053882 = new class05388().N(class05418.J, class05388.N(class00869.yq, "_top")).N(class05418.Z, class05388.N(class00869.yq, "_side"));
        class05388 class053883 = class053882.L(class05418.I, class05388.N(class00869.yq, "_top_sticky"));
        class05388 class053884 = class053882.L(class05418.I, class05388.N(class00869.yq, "_top"));
        this.N.accept((class05399)class05427.N((class00891)class00869.yK).N(class05415.N(class06665.Y, class06665.yE).N(false, class08083.field_12637, class05404.y(class05433.yo.N(class00869.yq, "_head", class053884, this.L))).N(false, class08083.field_12634, class05404.y(class05433.yo.N(class00869.yq, "_head_sticky", class053883, this.L))).N(true, class08083.field_12637, class05404.y(class05433.yq.N(class00869.yq, "_head_short", class053884, this.L))).N(true, class08083.field_12634, class05404.y(class05433.yq.N(class00869.yq, "_head_short_sticky", class053883, this.L)))).N(l));
    }

    private void F() {
        class01894 class018942 = this.N(class06570.Mf, class00869.RS);
        this.N(class00869.RS, class018942, class08825.N((int)-9321636));
        class03674 class036742 = class05404.N(class05387.N(class00869.RS));
        this.N.accept((class05399)class05427.N((class00891)class00869.RS, (class03264)class05404.y(class036742)));
    }

    public final class03264 I(class00891 class008912) {
        return class05404.N(class05404.N(class05433.yW.N(class05387.N(class008912, "_side0"), class05388.d(class008912), this.L)), class05404.N(class05433.yW.N(class05387.N(class008912, "_side1"), class05388.w(class008912), this.L)), class05404.N(class05433.ym.N(class05387.N(class008912, "_side_alt0"), class05388.d(class008912), this.L)), class05404.N(class05433.ym.N(class05387.N(class008912, "_side_alt1"), class05388.w(class008912), this.L)));
    }

    private void I() {
        class01894 class018942 = class05388.N(class00869.Bp, "_side");
        class05388 class053882 = new class05388().N(class05418.R, class05388.N(class00869.Bp, "_top")).N(class05418.Z, class018942);
        class05388 class053883 = new class05388().N(class05418.R, class05388.N(class00869.Bp, "_inverted_top")).N(class05418.Z, class018942);
        this.N.accept((class05399)class05427.N((class00891)class00869.Bp).N(class05415.N(class06665.j).N(false, class05404.y(class05433.NH.N(class00869.Bp, class053882, this.L))).N(true, class05404.y(class05433.NH.N(class05387.N(class00869.Bp, "_inverted"), class053883, this.L)))));
    }

    public final class03264 J(class00891 class008912) {
        return class05404.N(class05404.N(class05433.yP.N(class05387.N(class008912, "_up0"), class05388.d(class008912), this.L)), class05404.N(class05433.yP.N(class05387.N(class008912, "_up1"), class05388.w(class008912), this.L)), class05404.N(class05433.ys.N(class05387.N(class008912, "_up_alt0"), class05388.d(class008912), this.L)), class05404.N(class05433.ys.N(class05387.N(class008912, "_up_alt1"), class05388.w(class008912), this.L)));
    }

    private void J() {
        class05388 class053882 = new class05388().N(class05418.Q, class05388.V(class00869.z)).N(class05418.R, class05388.V(class00869.Lr));
        class05388 class053883 = new class05388().N(class05418.Q, class05388.V(class00869.z)).N(class05418.R, class05388.N(class00869.Lr, "_moist"));
        class03264 class032642 = class05404.y(class05433.yU.N(class00869.Lr, class053882, this.L));
        class03264 class032643 = class05404.y(class05433.yU.N(class05388.N(class00869.Lr, "_moist"), class053883, this.L));
        this.N.accept((class05399)class05427.N((class00891)class00869.Lr).N(class05404.N(class06665.NC, Integer.valueOf(7), class032643, class032642)));
    }

    private void S() {
        class03264 class032642 = class05404.y(class05387.N(class00869.EV));
        class03264 class032643 = class05404.y(class05387.N(class00869.EV, "_on"));
        this.N.accept((class05399)class05427.N((class00891)class00869.EV).N(class05404.N(class06665.k, class032643, class032642)).N(l));
    }

    private void Z() {
        class03264 class032642 = class05404.y(this.N(class00869.yo, "_top", class05433.yK, class05388::N));
        class03264 class032643 = class05404.y(this.N(class00869.yo, "_bottom", class05433.yK, class05388::N));
        this.i(class00869.yo, class032642, class032643);
    }

    public final void Z(class00891 class008912, class00891 class008913) {
        this.R(class008912);
        class05388 class053882 = class05388.y(class008912, class008913);
        class03264 class032642 = class05404.y(class05433.Na.N(class008913, class053882, this.L));
        class03264 class032643 = class05404.y(class05433.Np.N(class008913, class053882, this.L));
        class03264 class032644 = class05404.y(class05433.NF.N(class008913, class053882, this.L));
        class03264 class032645 = class05404.y(class05433.Nc.N(class008913, class053882, this.L));
        class03264 class032646 = class05404.y(class05433.NX.N(class008913, class053882, this.L));
        class06581 class065812 = class008913.B();
        this.N(class065812, this.N(class065812, class008912));
        this.N.accept(class05394.N(class008913).N(class032642).N(class05404.N().N((class08092)class06665.c, (Comparable)Boolean.valueOf(true)), class032643).N(class05404.N().N((class08092)class06665.X, (Comparable)Boolean.valueOf(true)), class032643.N(z)).N(class05404.N().N((class08092)class06665.a, (Comparable)Boolean.valueOf(true)), class032644).N(class05404.N().N((class08092)class06665.p, (Comparable)Boolean.valueOf(true)), class032644.N(z)).N(class05404.N().N((class08092)class06665.c, (Comparable)Boolean.valueOf(false)), class032645).N(class05404.N().N((class08092)class06665.X, (Comparable)Boolean.valueOf(false)), class032646).N(class05404.N().N((class08092)class06665.a, (Comparable)Boolean.valueOf(false)), class032646.N(z)).N(class05404.N().N((class08092)class06665.p, (Comparable)Boolean.valueOf(false)), class032645.N(E)));
    }

    public void Z(class00891 class008912) {
        class05388 class053882 = class05388.G(class008912);
        class03264 class032642 = class05404.y(class05433.t.N(class008912, class053882, this.L));
        class03264 class032643 = class05404.y(class05433.G.N(class008912, class053882, this.L));
        class03264 class032644 = class05404.y(class05433.l.N(class008912, class053882, this.L));
        class03264 class032645 = class05404.y(class05433.d.N(class008912, class053882, this.L));
        class03264 class032646 = class05404.y(class05433.w.N(class008912, class053882, this.L));
        class03264 class032647 = class05404.y(class05433.k.N(class008912, class053882, this.L));
        class03264 class032648 = class05404.y(class05433.Y.N(class008912, class053882, this.L));
        class03264 class032649 = class05404.y(class05433.Q.N(class008912, class053882, this.L));
        this.y(class008912.B());
        this.N.accept(class05404.N(class008912, class032642, class032643, class032644, class032645, class032646, class032647, class032648, class032649));
    }

    private void V() {
        this.y(class06570.NR);
        class00891 class008912 = class00869.o;
        class03264 class032642 = class05404.y(class05387.N(class008912));
        this.N.accept((class05399)class05427.N((class00891)class00869.o).N(class05415.N(class04091.M, class04091.i).N((T1 bl, T2 n) -> bl != false ? class05404.y(class05387.N(class008912, "_hanging_" + n)) : class032642)));
    }

    public final void V(class00891 class008912) {
        this.N(class008912);
        this.e(class008912);
    }

    public final void e(class00891 class008912) {
        Map<class08092, class08503> map = class05404.N(class008912.W(), class05543::y);
        class08437 class084372 = class05404.N();
        map.forEach((class080922, class085032) -> class084372.N(class080922, (Comparable)Boolean.valueOf(false)));
        class03264 class032642 = class05404.y(class05387.N(class008912));
        class05394 class053942 = class05394.N(class008912);
        map.forEach((class080922, class085032) -> {
            class053942.N(class05404.N().N(class080922, (Comparable)Boolean.valueOf(true)), class032642.N(class085032));
            class053942.N(class084372, class032642.N(class085032));
        });
        this.N.accept(class053942);
    }

    private void e() {
        this.N.accept((class05399)class05427.N((class00891)class00869.Eg).N(class05415.N(class06665.NG).N(0, class05404.y(this.N(class00869.Eg, "_0", class05433.L, class05388::y))).N(1, class05404.y(this.N(class00869.Eg, "_1", class05433.L, class05388::y))).N(2, class05404.y(this.N(class00869.Eg, "_2", class05433.L, class05388::y))).N(3, class05404.y(this.N(class00869.Eg, "_3", class05433.L, class05388::y)))));
    }

    public static class05399 i(class00891 class008912, class03264 class032642, class03264 class032643, class03264 class032644) {
        return class05427.N((class00891)class008912).N(class05415.N(class06665.yW).N(class08054.field_12681, class032642).N(class08054.field_12679, class032643).N(class08054.field_12682, class032644));
    }

    private void i() {
        class03264 class032642 = class05404.y(class05387.N(class00869.nL));
        class03264 class032643 = class05404.y(class05387.N(class00869.nL, "_partial_tilt"));
        class03264 class032644 = class05404.y(class05387.N(class00869.nL, "_full_tilt"));
        this.N.accept((class05399)class05427.N((class00891)class00869.nL).N(class05415.N(class06665.yT).N(class06082.field_28718, class032642).N(class06082.field_28719, class032642).N(class06082.field_28720, class032643).N(class06082.field_28721, class032644)).N(Y));
    }

    public final void i(class00891 class008912, class00891 class008913) {
        this.y(class008912.B());
        class05388 class053882 = class05388.U(class008912);
        class05388 class053883 = class05388.N(class008912, class008913);
        class03264 class032642 = class05404.y(class05433.yZ.N(class008913, class053883, this.L));
        this.N.accept((class05399)class05427.N((class00891)class008913, (class03264)class032642).N(class05415.y(class06665.f).N(class07211.field_11039, i).N(class07211.field_11035, E).N(class07211.field_11043, z).N(class07211.field_11034, U)));
        this.N.accept((class05399)class05427.N((class00891)class008912).N(class05415.N(class06665.Nw).N((T1 n) -> class05404.y(class05433.yB[n].N(class008912, class053882, this.L)))));
    }

    public final void i(class00891 class008912, class03264 class032642, class03264 class032643) {
        this.N.accept((class05399)class05427.N((class00891)class008912).N(class05415.N(class06665.NB).N(class08059.field_12607, class032643).N(class08059.field_12609, class032642)));
    }

    public final void i(class00891 class008912) {
        class03264 class032642 = class05404.y(class05428.Y.N(class008912, this.L));
        class03264 class032643 = class05404.y(class05428.Q.N(class008912, this.L));
        class03264 class032644 = class05404.y(this.N(class05428.Y, class008912, "_awake"));
        class03264 class032645 = class05404.y(this.N(class05428.Q, class008912, "_awake"));
        class03264 class032646 = class05404.y(this.N(class05428.Y, class008912, "_dormant"));
        class03264 class032647 = class05404.y(this.N(class05428.Q, class008912, "_dormant"));
        this.N.accept((class05399)class05427.N((class00891)class008912).N(class05415.N(class06665.V, class00325.L).N(class07185.field_11052, class08630.field_55831, class032642).N(class07185.field_11051, class08630.field_55831, class032643.N(M)).N(class07185.field_11048, class08630.field_55831, class032643.N(M).N(z)).N(class07185.field_11052, class08630.field_55832, class032646).N(class07185.field_11051, class08630.field_55832, class032647.N(M)).N(class07185.field_11048, class08630.field_55832, class032647.N(M).N(z)).N(class07185.field_11052, class08630.field_55833, class032644).N(class07185.field_11051, class08630.field_55833, class032645.N(M)).N(class07185.field_11048, class08630.field_55833, class032645.N(M).N(z))));
    }

    public final void b(class00891 class008912) {
        class03264 class032642 = class05404.y(class05428.s.N(class008912, this.L));
        class03264 class032643 = class05404.y(class05428.T.N(class008912, this.L));
        class03264 class032644 = class05404.y(class05428.b.N(class008912, this.L));
        class03264 class032645 = class05404.y(class05428.j.N(class008912, this.L));
        this.y(class008912.B());
        this.N(class008912, class032642, v, class032643, n, class032644, t, class032645, G);
    }

    private void b() {
        class05388 class053882 = class05388.N(class00869.UV);
        class05388 class053883 = class05388.N(class05388.N(class00869.Ul, "_side"), class053882.N(class05418.R));
        class03264 class032642 = class05404.y(class05433.Ny.N(class00869.Ul, class053883, this.L));
        class03264 class032643 = class05404.y(class05433.NL.N(class00869.Ul, class053883, this.L));
        class03264 class032644 = class05404.y(class05433.z.y(class00869.Ul, "_double", class053883, this.L));
        this.N.accept(class05404.i(class00869.Ul, class032642, class032643, class032644));
        this.N.accept((class05399)class05404.N(class00869.UV, class05404.y(class05433.L.N(class00869.UV, class053882, this.L))));
    }

    public final void b(class00891 class008912, class00891 class008913) {
        class05388 class053882 = new class05388().N(class05418.N, class05388.V(class008912)).N(class05418.L, class05388.V(class008913));
        class05394 class053942 = class05394.N(class008912);
        this.N(class008912, class053882, class053942, class05433.Nr, null, null);
        this.N(class008912, class053882, class053942, class05433.yy, false, null);
        this.N(class008912, class053882, class053942, class05433.yL, true, class08972.field_61446);
        this.N(class008912, class053882, class053942, class05433.yu, true, class08972.field_61449);
        this.N(class008912, class053882, class053942, class05433.yi, true, class08972.field_61448);
        this.N(class008912, class053882, class053942, class05433.yR, true, class08972.field_61447);
        this.N.accept(class053942);
        this.N(class008912, class05433.yN.N(class008912, class053882, this.L));
    }

    private void x() {
        class05388 class053882 = new class05388().N(class05418.i, class05388.N(class00869.yq, "_bottom")).N(class05418.Z, class05388.N(class00869.yq, "_side"));
        class01894 class018942 = class05388.N(class00869.yq, "_top_sticky");
        class01894 class018943 = class05388.N(class00869.yq, "_top");
        class05388 class053883 = class053882.L(class05418.I, class018942);
        class05388 class053884 = class053882.L(class05418.I, class018943);
        class03264 class032642 = class05404.y(class05387.N(class00869.yq, "_base"));
        this.N(class00869.yq, class032642, class053884);
        this.N(class00869.yd, class032642, class053883);
        class01894 class018944 = class05433.m.N(class00869.yq, "_inventory", class053882.L(class05418.R, class018943), this.L);
        class01894 class018945 = class05433.m.N(class00869.yd, "_inventory", class053882.L(class05418.R, class018942), this.L);
        this.N(class00869.yq, class018944);
        this.N(class00869.yd, class018945);
    }

    public final void s(class00891 class008912, class00891 class008913) {
        class05388 class053882 = class05388.q(class008912);
        class01894 class018942 = class05433.yl.N(class008912, class053882, this.L);
        class01894 class018943 = class05433.yG.N(class008912, class053882, this.L);
        class01894 class018944 = class05433.yn.N(class008912, class053882, this.L);
        class01894 class018945 = class05433.yt.N(class008912, class053882, this.L);
        class01894 class018946 = class05433.yd.N(class008912, class053882, this.L);
        class01894 class018947 = class05433.yw.N(class008912, class053882, this.L);
        this.N(class008912, class018942, class018943, class018944, class018945, class018946, class018947);
        this.N(class008913, class018942, class018943, class018944, class018945, class018946, class018947);
        this.N(class008912);
        this.y.N(class008912.B(), class008913.B());
    }

    private void s() {
        this.y(class06570.WY);
        this.N.accept(class05394.N(class00869.Lf).N(class05404.N(class05404.N().N((class08092)class06665.Ni, (Comparable)class08075.field_12687).N((class08092)class06665.Nu, (Comparable)class08075.field_12687).N((class08092)class06665.NR, (Comparable)class08075.field_12687).N((class08092)class06665.NM, (Comparable)class08075.field_12687), class05404.N().N((class08092)class06665.Ni, (Comparable)class08075.field_12689, (Comparable[])new class08075[]{class08075.field_12686}).N((class08092)class06665.Nu, (Comparable)class08075.field_12689, (Comparable[])new class08075[]{class08075.field_12686}), class05404.N().N((class08092)class06665.Nu, (Comparable)class08075.field_12689, (Comparable[])new class08075[]{class08075.field_12686}).N((class08092)class06665.NR, (Comparable)class08075.field_12689, (Comparable[])new class08075[]{class08075.field_12686}), class05404.N().N((class08092)class06665.NR, (Comparable)class08075.field_12689, (Comparable[])new class08075[]{class08075.field_12686}).N((class08092)class06665.NM, (Comparable)class08075.field_12689, (Comparable[])new class08075[]{class08075.field_12686}), class05404.N().N((class08092)class06665.NM, (Comparable)class08075.field_12689, (Comparable[])new class08075[]{class08075.field_12686}).N((class08092)class06665.Ni, (Comparable)class08075.field_12689, (Comparable[])new class08075[]{class08075.field_12686})), class05404.y(class05387.N("redstone_dust_dot"))).N(class05404.N().N((class08092)class06665.Ni, (Comparable)class08075.field_12689, (Comparable[])new class08075[]{class08075.field_12686}), class05404.y(class05387.N("redstone_dust_side0"))).N(class05404.N().N((class08092)class06665.NR, (Comparable)class08075.field_12689, (Comparable[])new class08075[]{class08075.field_12686}), class05404.y(class05387.N("redstone_dust_side_alt0"))).N(class05404.N().N((class08092)class06665.Nu, (Comparable)class08075.field_12689, (Comparable[])new class08075[]{class08075.field_12686}), class05404.y(class05387.N("redstone_dust_side_alt1")).N(E)).N(class05404.N().N((class08092)class06665.NM, (Comparable)class08075.field_12689, (Comparable[])new class08075[]{class08075.field_12686}), class05404.y(class05387.N("redstone_dust_side1")).N(E)).N(class05404.N().N((class08092)class06665.Ni, (Comparable)class08075.field_12686), class05404.y(class05387.N("redstone_dust_up"))).N(class05404.N().N((class08092)class06665.Nu, (Comparable)class08075.field_12686), class05404.y(class05387.N("redstone_dust_up")).N(z)).N(class05404.N().N((class08092)class06665.NR, (Comparable)class08075.field_12686), class05404.y(class05387.N("redstone_dust_up")).N(U)).N(class05404.N().N((class08092)class06665.NM, (Comparable)class08075.field_12686), class05404.y(class05387.N("redstone_dust_up")).N(E)));
    }

    public final void s(class00891 class008912) {
        class03264 class032642 = class05404.y(this.N(class008912, "", class05433.Nn, class05388::i));
        class03264 class032643 = class05404.y(this.N(class008912, "", class05433.NG, class05388::i));
        class03264 class032644 = class05404.y(this.N(class008912, "", class05433.Nl, class05388::i));
        class03264 class032645 = class05404.y(this.N(class008912, "_on", class05433.Nn, class05388::i));
        class03264 class032646 = class05404.y(this.N(class008912, "_on", class05433.NG, class05388::i));
        class03264 class032647 = class05404.y(this.N(class008912, "_on", class05433.Nl, class05388::i));
        this.N(class008912);
        this.N.accept((class05399)class05427.N((class00891)class008912).N(class05415.N(class06665.k, class06665.NE).N((T1 bl, T2 class080802) -> switch (class080802) {
            case class08080.field_12665 -> {
                if (bl.booleanValue()) {
                    yield class032645;
                }
                yield class032642;
            }
            case class08080.field_12674 -> (bl != false ? class032645 : class032642).N(z);
            case class08080.field_12667 -> (bl != false ? class032646 : class032643).N(z);
            case class08080.field_12666 -> (bl != false ? class032647 : class032644).N(z);
            case class08080.field_12670 -> {
                if (bl.booleanValue()) {
                    yield class032646;
                }
                yield class032643;
            }
            case class08080.field_12668 -> {
                if (bl.booleanValue()) {
                    yield class032647;
                }
                yield class032644;
            }
            default -> throw new UnsupportedOperationException("Fix you generator!");
        })));
    }

    public final void c(class00891 class008912) {
        this.N(class008912);
        this.N.accept((class05399)class05427.N((class00891)class008912).N(class05415.N(class00288.y).N((T1 bl) -> {
            String string = bl != false ? "_tip" : "";
            class05388 class053882 = class05388.L(class05388.N(class008912, string));
            return class05404.y(class05432.field_22840.N().N(class008912, string, class053882, this.L));
        })));
    }

    private void c() {
        this.y(class06570.vE);
        this.N.accept((class05399)class05427.N((class00891)class00869.Mb).N(class05415.N(class06665.Nt).N(0, class05404.y(class05387.N(class00869.Mb, "_stage0"))).N(1, class05404.y(class05387.N(class00869.Mb, "_stage1"))).N(2, class05404.y(class05387.N(class00869.Mb, "_stage2")))).N(k));
    }

    private void n() {
        class05388 class053882 = new class05388().N(class05418.L, class05388.N(class00869.PC, "_side3")).N(class05418.P, class05388.V(class00869.v)).N(class05418.m, class05388.N(class00869.PC, "_top")).N(class05418.z, class05388.N(class00869.PC, "_side3")).N(class05418.E, class05388.N(class00869.PC, "_side3")).N(class05418.U, class05388.N(class00869.PC, "_side1")).N(class05418.W, class05388.N(class00869.PC, "_side2"));
        this.N.accept((class05399)class05404.N(class00869.PC, class05404.y(class05433.N.N(class00869.PC, class053882, this.L))));
    }

    public final void n(class00891 class008912) {
        class03264 class032642 = class05404.y(class05428.t.N(class008912, this.L));
        this.N.accept((class05399)class05404.N(class008912, class032642).N(k));
    }

    private void h() {
        class00891 class008912 = class00869.np;
        class05388 class053882 = class05388.N(class008912, "_side_inactive", "_top_inactive");
        class05388 class053883 = class05388.N(class008912, "_side_active", "_top_active");
        class05388 class053884 = class05388.N(class008912, "_side_active", "_top_ejecting_reward");
        class05388 class053885 = class05388.N(class008912, "_side_inactive_ominous", "_top_inactive_ominous");
        class05388 class053886 = class05388.N(class008912, "_side_active_ominous", "_top_active_ominous");
        class05388 class053887 = class05388.N(class008912, "_side_active_ominous", "_top_ejecting_reward_ominous");
        class01894 class018942 = class05433.P.N(class008912, class053882, this.L);
        class03264 class032642 = class05404.y(class018942);
        class03264 class032643 = class05404.y(class05433.P.N(class008912, "_active", class053883, this.L));
        class03264 class032644 = class05404.y(class05433.P.N(class008912, "_ejecting_reward", class053884, this.L));
        class03264 class032645 = class05404.y(class05433.P.N(class008912, "_inactive_ominous", class053885, this.L));
        class03264 class032646 = class05404.y(class05433.P.N(class008912, "_active_ominous", class053886, this.L));
        class03264 class032647 = class05404.y(class05433.P.N(class008912, "_ejecting_reward_ominous", class053887, this.L));
        this.N(class008912, class018942);
        this.N.accept((class05399)class05427.N((class00891)class008912).N(class05415.N(class06665.yO, class06665.yJ).N((T1 class044812, T2 bl) -> switch (class044812) {
            default -> throw new MatchException(null, null);
            case class04481.field_47383, class04481.field_47388 -> {
                if (bl.booleanValue()) {
                    yield class032645;
                }
                yield class032642;
            }
            case class04481.field_47384, class04481.field_47385, class04481.field_47386 -> {
                if (bl.booleanValue()) {
                    yield class032646;
                }
                yield class032643;
            }
            case class04481.field_47387 -> bl != false ? class032647 : class032644;
        })));
    }

    private void f() {
        this.N.accept((class05399)class05427.N((class00891)class00869.iq).N(class05415.N(class06665.K).N(class07185.field_11048, class05404.y(class05387.N(class00869.iq, "_ns"))).N(class07185.field_11051, class05404.y(class05387.N(class00869.iq, "_ew")))));
    }

    private void l() {
        this.y(class06570.nt);
        this.W(class00869.MZ);
        this.N.accept((class05399)class05404.N(class00869.MU, class05404.y(class05433.yA.N(class00869.MU, class05388.z(class05388.N(class00869.V, "_still")), this.L))));
        this.N.accept((class05399)class05427.N((class00891)class00869.Mz).N(class05415.N(class01096.M).N(1, class05404.y(class05433.yp.N(class00869.Mz, "_level1", class05388.z(class05388.N(class00869.K, "_still")), this.L))).N(2, class05404.y(class05433.yF.N(class00869.Mz, "_level2", class05388.z(class05388.N(class00869.K, "_still")), this.L))).N(3, class05404.y(class05433.yA.N(class00869.Mz, "_full", class05388.z(class05388.N(class00869.K, "_still")), this.L)))));
        this.N.accept((class05399)class05427.N((class00891)class00869.ME).N(class05415.N(class01096.M).N(1, class05404.y(class05433.yp.N(class00869.ME, "_level1", class05388.z(class05388.V(class00869.ba)), this.L))).N(2, class05404.y(class05433.yF.N(class00869.ME, "_level2", class05388.z(class05388.V(class00869.ba)), this.L))).N(3, class05404.y(class05433.yA.N(class00869.ME, "_full", class05388.z(class05388.V(class00869.ba)), this.L)))));
    }

    public final void l(class00891 class008912) {
        class03264 class032642 = class05404.y(class05433.ya.N(class008912, class05388.y(class008912), this.L));
        class03264 class032643 = class05404.y(class05387.N("mushroom_block_inside"));
        this.N.accept(class05394.N(class008912).N(class05404.N().N((class08092)class06665.c, (Comparable)Boolean.valueOf(true)), class032642).N(class05404.N().N((class08092)class06665.X, (Comparable)Boolean.valueOf(true)), class032642.N(z).N(R)).N(class05404.N().N((class08092)class06665.a, (Comparable)Boolean.valueOf(true)), class032642.N(U).N(R)).N(class05404.N().N((class08092)class06665.p, (Comparable)Boolean.valueOf(true)), class032642.N(E).N(R)).N(class05404.N().N((class08092)class06665.e, (Comparable)Boolean.valueOf(true)), class032642.N(Z).N(R)).N(class05404.N().N((class08092)class06665.H, (Comparable)Boolean.valueOf(true)), class032642.N(M).N(R)).N(class05404.N().N((class08092)class06665.c, (Comparable)Boolean.valueOf(false)), class032643).N(class05404.N().N((class08092)class06665.X, (Comparable)Boolean.valueOf(false)), class032643.N(z)).N(class05404.N().N((class08092)class06665.a, (Comparable)Boolean.valueOf(false)), class032643.N(U)).N(class05404.N().N((class08092)class06665.p, (Comparable)Boolean.valueOf(false)), class032643.N(E)).N(class05404.N().N((class08092)class06665.e, (Comparable)Boolean.valueOf(false)), class032643.N(Z)).N(class05404.N().N((class08092)class06665.H, (Comparable)Boolean.valueOf(false)), class032643.N(M)));
        this.N(class008912, class05428.N.N(class008912, "_inventory", this.L));
    }

    public void d(class00891 class008912) {
        class05388 class053882 = new class05388().N(class05418.L, class05388.N(class008912, "_particle")).N(class05418.P, class05388.N(class008912, "_down")).N(class05418.m, class05388.N(class008912, "_up")).N(class05418.z, class05388.N(class008912, "_north")).N(class05418.U, class05388.N(class008912, "_south")).N(class05418.E, class05388.N(class008912, "_east")).N(class05418.W, class05388.N(class008912, "_west"));
        this.N.accept((class05399)class05404.N(class008912, class05404.y(class05433.N.N(class008912, class053882, this.L))));
    }

    private void d() {
        class05388 class053882 = class05388.y(class00869.Eb);
        class03264 class032642 = class05404.y(class05433.Ne.N(class00869.Eb, class053882, this.L));
        class03264 class032643 = class05404.y(this.N(class00869.Eb, "_dead", class05433.Ne, (class01894 class018942) -> class053882.L(class05418.y, (class01894)class018942)));
        this.N.accept((class05399)class05427.N((class00891)class00869.Eb).N(class05404.N(class06665.Nd, Integer.valueOf(5), class032643, class032642)));
    }

    private void a() {
        class03264 class032642 = class05404.y(class05387.N(class00869.Bf));
        class03264 class032643 = class05404.y(class05387.N(class00869.Bf, "_side"));
        this.y(class06570.We);
        this.N.accept((class05399)class05427.N((class00891)class00869.Bf).N(class05415.N(class06665.A).N(class07211.field_11033, class032642).N(class07211.field_11043, class032643).N(class07211.field_11034, class032643.N(z)).N(class07211.field_11035, class032643.N(U)).N(class07211.field_11039, class032643.N(E))));
    }

    public final void m(class00891 class008912, class00891 class008913) {
        class05388 class053882 = class05388.y(class008913);
        class03264 class032642 = class05404.y(class05433.h.N(class008912, class053882, this.L));
        class03264 class032643 = class05404.y(class05433.r.N(class008912, class053882, this.L));
        this.N.accept((class05399)class05427.N((class00891)class008912).N(class05404.N(class06665.ND, Integer.valueOf(1), class032643, class032642)));
    }

    private void m() {
        this.N.accept((class05399)class05427.N((class00891)class00869.Px, (class03264)class05404.y(class05387.N(class00869.Px))).N(class05415.y(class06665.D, class06665.f).N(class06657.field_12475, class07211.field_11043, i).N(class06657.field_12475, class07211.field_11034, z).N(class06657.field_12475, class07211.field_11035, U).N(class06657.field_12475, class07211.field_11039, E).N(class06657.field_12471, class07211.field_11043, M).N(class06657.field_12471, class07211.field_11034, M.N(z)).N(class06657.field_12471, class07211.field_11035, M.N(U)).N(class06657.field_12471, class07211.field_11039, M.N(E)).N(class06657.field_12473, class07211.field_11035, B).N(class06657.field_12473, class07211.field_11039, B.N(z)).N(class06657.field_12473, class07211.field_11043, B.N(U)).N(class06657.field_12473, class07211.field_11034, B.N(E))));
    }

    public final void m(class00891 class008912) {
        class01894 class018942 = this.N(class008912.B(), class008912, "_top");
        this.N(class008912, class018942, (class08843)new class08832());
        this.L(class008912, class05432.field_22839);
    }

    private void o() {
        class08437 class084372 = class05404.N().N((class08092)class06665.c, (Comparable)Boolean.valueOf(false)).N((class08092)class06665.X, (Comparable)Boolean.valueOf(false)).N((class08092)class06665.a, (Comparable)Boolean.valueOf(false)).N((class08092)class06665.p, (Comparable)Boolean.valueOf(false)).N((class08092)class06665.e, (Comparable)Boolean.valueOf(false));
        class03264 class032642 = this.g(class00869.Lc);
        class03264 class032643 = this.I(class00869.Lc);
        class03264 class032644 = this.J(class00869.Lc);
        this.N.accept(class05394.N(class00869.Lc).N(class084372, class032642).N(class05404.N(class05404.N().N((class08092)class06665.c, (Comparable)Boolean.valueOf(true)), class084372), class032643).N(class05404.N(class05404.N().N((class08092)class06665.X, (Comparable)Boolean.valueOf(true)), class084372), class032643.N(z)).N(class05404.N(class05404.N().N((class08092)class06665.a, (Comparable)Boolean.valueOf(true)), class084372), class032643.N(U)).N(class05404.N(class05404.N().N((class08092)class06665.p, (Comparable)Boolean.valueOf(true)), class084372), class032643.N(E)).N(class05404.N().N((class08092)class06665.e, (Comparable)Boolean.valueOf(true)), class032644));
    }

    public final void o(class00891 class008912) {
        class03264 class032642 = class05404.y(class05428.l.N(class008912, this.L));
        class03264 class032643 = class05404.y(class05428.d.N(class008912, this.L));
        this.y(class008912.B());
        this.N.accept((class05399)class05427.N((class00891)class008912).N(class05404.N(class06665.W, class032643, class032642)));
    }

    private void p() {
        class03264 class032642 = class05404.y(class05387.N(class00869.uD));
        class03264 class032643 = class05404.y(class05387.N(class00869.uD, "_on"));
        this.N(class00869.uD);
        this.N.accept((class05399)class05427.N((class00891)class00869.uD).N(class05404.N(class06665.k, class032642, class032643)).N(class05415.y(class06665.D, class06665.f).N(class06657.field_12473, class07211.field_11043, B.N(U)).N(class06657.field_12473, class07211.field_11034, B.N(E)).N(class06657.field_12473, class07211.field_11035, B).N(class06657.field_12473, class07211.field_11039, B.N(z)).N(class06657.field_12475, class07211.field_11043, i).N(class06657.field_12475, class07211.field_11034, z).N(class06657.field_12475, class07211.field_11035, U).N(class06657.field_12475, class07211.field_11039, E).N(class06657.field_12471, class07211.field_11043, M).N(class06657.field_12471, class07211.field_11034, M.N(z)).N(class06657.field_12471, class07211.field_11035, M.N(U)).N(class06657.field_12471, class07211.field_11039, M.N(E))));
    }

    private void k() {
        class03264 class032642 = class05404.y(class05387.N(class00869.Mm));
        class03264 class032643 = class05404.y(class05387.N(class00869.Mm, "_filled"));
        this.N.accept((class05399)class05427.N((class00891)class00869.Mm).N(class05415.N(class06665.U).N(false, class032642).N(true, class032643)).N(k));
    }

    public final void k(class00891 class008912) {
        class03264 class032642 = class05404.y(class05433.L.N(class008912, class05388.N(class008912), this.L));
        class03264 class032643 = class05404.y(this.N(class008912, "_powered", class05433.L, class05388::y));
        class03264 class032644 = class05404.y(this.N(class008912, "_lit", class05433.L, class05388::y));
        class03264 class032645 = class05404.y(this.N(class008912, "_lit_powered", class05433.L, class05388::y));
        this.N.accept(class05404.N(class008912, class032642, class032644, class032643, class032645));
    }

    private void t() {
        class05388 class053882 = new class05388().N(class05418.L, class05388.N(class00869.Ph, "_front")).N(class05418.P, class05388.N(class00869.Ph, "_bottom")).N(class05418.m, class05388.N(class00869.Ph, "_top")).N(class05418.z, class05388.N(class00869.Ph, "_front")).N(class05418.U, class05388.N(class00869.Ph, "_front")).N(class05418.E, class05388.N(class00869.Ph, "_side")).N(class05418.W, class05388.N(class00869.Ph, "_side"));
        this.N.accept((class05399)class05404.N(class00869.Ph, class05404.y(class05433.N.N(class00869.Ph, class053882, this.L))));
    }

    public final void t(class00891 class008912) {
        class03264 class032642 = class05404.y(class05433.yf.N(class008912, class05388.P(class008912), this.L));
        this.N.accept((class05399)class05404.N(class008912, class032642));
    }

    private void g() {
        class05413<class03264, class07211, class06337> class054132 = class05415.N(class06665.yb, class06665.yj);
        for (class06337 class063372 : class06337.values()) {
            class054132.N(class07211.field_11036, class063372, this.N(class07211.field_11036, class063372));
        }
        for (class06337 class063372 : class06337.values()) {
            class054132.N(class07211.field_11033, class063372, this.N(class07211.field_11033, class063372));
        }
        this.N.accept((class05399)class05427.N((class00891)class00869.vp).N(class054132));
    }

    public final class03264 g(class00891 class008912) {
        return class05404.N(new class03674[]{class05404.N(class05433.yE.N(class05387.N(class008912, "_floor0"), class05388.d(class008912), this.L)), class05404.N(class05433.yE.N(class05387.N(class008912, "_floor1"), class05388.w(class008912), this.L))});
    }

    public final void v(class00891 class008912, class00891 class008913) {
        this.y(class008912.B());
        class05388 class053882 = class05388.y(class05388.V(class008912));
        class05388 class053883 = class05388.y(class05388.N(class008912, "_lit"));
        class03264 class032642 = class05404.y(class05433.LE.N(class008912, "_one_candle", class053882, this.L));
        class03264 class032643 = class05404.y(class05433.LW.N(class008912, "_two_candles", class053882, this.L));
        class03264 class032644 = class05404.y(class05433.Lm.N(class008912, "_three_candles", class053882, this.L));
        class03264 class032645 = class05404.y(class05433.LP.N(class008912, "_four_candles", class053882, this.L));
        class03264 class032646 = class05404.y(class05433.LE.N(class008912, "_one_candle_lit", class053883, this.L));
        class03264 class032647 = class05404.y(class05433.LW.N(class008912, "_two_candles_lit", class053883, this.L));
        class03264 class032648 = class05404.y(class05433.Lm.N(class008912, "_three_candles_lit", class053883, this.L));
        class03264 class032649 = class05404.y(class05433.LP.N(class008912, "_four_candles_lit", class053883, this.L));
        this.N.accept((class05399)class05427.N((class00891)class008912).N(class05415.N(class06665.NO, class06665.n).N(1, false, class032642).N(2, false, class032643).N(3, false, class032644).N(4, false, class032645).N(1, true, class032646).N(2, true, class032647).N(3, true, class032648).N(4, true, class032649)));
        class03264 class0326410 = class05404.y(class05433.Ls.N(class008913, class05388.N(class008912, false), this.L));
        class03264 class0326411 = class05404.y(class05433.Ls.N(class008913, "_lit", class05388.N(class008912, true), this.L));
        this.N.accept((class05399)class05427.N((class00891)class008913).N(class05404.N(class06665.n, class0326411, class0326410)));
    }

    private void v() {
        this.y(class06570.vI);
        this.N.accept((class05399)class05427.N((class00891)class00869.ie).N(class05415.N(class06665.NQ).N(0, class05404.y(class05387.N(class00869.ie))).N(1, class05404.y(class05387.N(class00869.ie, "_slice1"))).N(2, class05404.y(class05387.N(class00869.ie, "_slice2"))).N(3, class05404.y(class05387.N(class00869.ie, "_slice3"))).N(4, class05404.y(class05387.N(class00869.ie, "_slice4"))).N(5, class05404.y(class05387.N(class00869.ie, "_slice5"))).N(6, class05404.y(class05387.N(class00869.ie, "_slice6")))));
    }

    public final void v(class00891 class008912) {
        class05388 class053882 = class05388.Q(class008912);
        class03264 class032642 = class05404.y(class05433.NA.N(class008912, class053882, this.L));
        class03264 class032643 = class05404.y(this.N(class008912, "_conditional", class05433.NA, (class01894 class018942) -> class053882.L(class05418.Z, (class01894)class018942)));
        this.N.accept((class05399)class05427.N((class00891)class008912).N(class05404.N(class06665.R, class032643, class032642)).N(l));
    }

    public final void j(class00891 class008912, class00891 class008913) {
        this.N(class008912, class05432.field_22840);
        class05388 class053882 = class05388.u(class05388.N(class008912, "_pot"));
        class03264 class032642 = class05404.y(class05432.field_22840.y().N(class008913, class053882, this.L));
        this.N.accept((class05399)class05404.N(class008913, class032642));
    }

    private void j() {
        this.y(class06570.nn);
        this.N.accept(class05394.N(class00869.MB).N(class05404.y(class05388.V(class00869.MB))).N(class05404.N().N((class08092)class06665.m, (Comparable)Boolean.valueOf(true)), class05404.y(class05388.N(class00869.MB, "_bottle0"))).N(class05404.N().N((class08092)class06665.P, (Comparable)Boolean.valueOf(true)), class05404.y(class05388.N(class00869.MB, "_bottle1"))).N(class05404.N().N((class08092)class06665.s, (Comparable)Boolean.valueOf(true)), class05404.y(class05388.N(class00869.MB, "_bottle2"))).N(class05404.N().N((class08092)class06665.m, (Comparable)Boolean.valueOf(false)), class05404.y(class05388.N(class00869.MB, "_empty0"))).N(class05404.N().N((class08092)class06665.P, (Comparable)Boolean.valueOf(false)), class05404.y(class05388.N(class00869.MB, "_empty1"))).N(class05404.N().N((class08092)class06665.s, (Comparable)Boolean.valueOf(false)), class05404.y(class05388.N(class00869.MB, "_empty2"))));
    }

    public final void j(class00891 class008912) {
        class03264 class032642 = class05404.y(class05428.E.N(class008912, this.L));
        class03264 class032643 = class05404.y(class05428.W.N(class008912, this.L));
        class03264 class032644 = class05404.y(class05428.m.N(class008912, this.L));
        class03264 class032645 = class05404.y(class05428.P.N(class008912, this.L));
        this.y(class008912.B());
        this.N(class008912, class032642, s, class032643, T, class032644, b, class032645, j);
    }

    private void q() {
        class03264 class032642 = this.g(class00869.LX);
        class03264 class032643 = this.I(class00869.LX);
        this.N.accept(class05394.N(class00869.LX).N(class032642).N(class032643).N(class032643.N(z)).N(class032643.N(U)).N(class032643.N(E)));
    }

    public final void q(class00891 class008912) {
        class05388 class053882 = class05388.q(class008912);
        this.N(class008912, class05433.yl.N(class008912, class053882, this.L), class05433.yG.N(class008912, class053882, this.L), class05433.yn.N(class008912, class053882, this.L), class05433.yt.N(class008912, class053882, this.L), class05433.yd.N(class008912, class053882, this.L), class05433.yw.N(class008912, class053882, this.L));
        this.N(class008912);
    }

    public void U(class00891 class008912) {
        class05388 class053882 = class05388.y(class008912);
        class03264 class032642 = class05404.y(class05433.NB.N(class008912, class053882, this.L));
        class01894 class018942 = class05433.NZ.N(class008912, class053882, this.L);
        class03264 class032643 = class05404.y(class05433.Nz.N(class008912, class053882, this.L));
        this.N.accept(class05404.u(class008912, class032642, class05404.y(class018942), class032643));
        this.N(class008912, class018942);
    }

    private void U() {
        this.N.accept(class05394.N(class00869.mx).N(class05404.N().N((class08092)class06665.Nn, (Comparable)Integer.valueOf(0)), class05404.N(0)).N(class05404.N().N((class08092)class06665.Nn, (Comparable)Integer.valueOf(1)), class05404.N(1)).N(class05404.N().N((class08092)class06665.ys, (Comparable)class06662.field_12466), class05404.y(class05387.N(class00869.mx, "_small_leaves"))).N(class05404.N().N((class08092)class06665.ys, (Comparable)class06662.field_12468), class05404.y(class05387.N(class00869.mx, "_large_leaves"))));
    }

    public final void U(class00891 class008912, class00891 class008913) {
        class03264 class032642 = class05404.y(class05387.N(class00869.vq, "_on"));
        class03264 class032643 = class05404.y(class05433.Lv.N(class008912, class05388.y(class008912), this.L));
        this.N.accept((class05399)class05427.N((class00891)class008912).N(class05404.N(class06665.k, class032642, class032643)).N(d));
        this.N.accept((class05399)class05427.N((class00891)class008913).N(class05404.N(class06665.k, class032642, class032643)).N(d));
        this.y.N(class008912.B(), class008913.B());
    }

    public void z(class00891 class008912) {
        class05388 class053882 = class05388.y(class008912);
        class03264 class032642 = class05404.y(class05433.NU.N(class008912, class053882, this.L));
        class01894 class018942 = class05433.NE.N(class008912, class053882, this.L);
        class03264 class032643 = class05404.y(class05433.NW.N(class008912, class053882, this.L));
        this.N.accept(class05404.L(class008912, class032642, class05404.y(class018942), class032643));
        this.N(class008912, class018942);
    }

    public final void z(class00891 class008912, class00891 class008913) {
        class03264 class032642 = class05404.y(class05387.N(class008912));
        class03264 class032643 = class05404.y(class05387.N(class008912, "_powered"));
        class03264 class032644 = class05404.y(class05387.N(class008912, "_lit"));
        class03264 class032645 = class05404.y(class05387.N(class008912, "_lit_powered"));
        this.y.N(class008912.B(), class008913.B());
        this.N.accept(class05404.N(class008913, class032642, class032644, class032643, class032645));
    }

    private void z() {
        class03264 class032642 = class05404.y(class05387.N(class00869.ni, "_top"));
        class03264 class032643 = class05404.y(class05387.N(class00869.ni, "_bottom"));
        this.N.accept((class05399)class05427.N((class00891)class00869.ni).N(class05415.N(class06665.NB).N(class08059.field_12607, class032643).N(class08059.field_12609, class032642)).N(Y));
    }

    public static class05399 u(class00891 class008912, class03264 class032642, class03264 class032643, class03264 class032644) {
        return class05427.N((class00891)class008912).N(class05415.N(class06665.f, class06665.NZ, class06665.d).N(class07211.field_11043, class08052.field_12617, false, class032643).N(class07211.field_11035, class08052.field_12617, false, class032643).N(class07211.field_11034, class08052.field_12617, false, class032643).N(class07211.field_11039, class08052.field_12617, false, class032643).N(class07211.field_11043, class08052.field_12619, false, class032642).N(class07211.field_11035, class08052.field_12619, false, class032642).N(class07211.field_11034, class08052.field_12619, false, class032642).N(class07211.field_11039, class08052.field_12619, false, class032642).N(class07211.field_11043, class08052.field_12617, true, class032644).N(class07211.field_11035, class08052.field_12617, true, class032644.N(U)).N(class07211.field_11034, class08052.field_12617, true, class032644.N(z)).N(class07211.field_11039, class08052.field_12617, true, class032644.N(E)).N(class07211.field_11043, class08052.field_12619, true, class032644).N(class07211.field_11035, class08052.field_12619, true, class032644.N(U)).N(class07211.field_11034, class08052.field_12619, true, class032644.N(z)).N(class07211.field_11039, class08052.field_12619, true, class032644.N(E)));
    }

    public static class05399 u(class00891 class008912, class03264 class032642, class03264 class032643) {
        return class05427.N((class00891)class008912).N(class05404.N(class06665.k, class032643, class032642));
    }

    public final void u(class00891 class008912, class00891 class008913) {
        class05428 class054282 = class05428.n.get(class008912);
        class03264 class032642 = class05404.y(class054282.N(class008912, this.L));
        this.N.accept((class05399)class05404.N(class008912, class032642));
        class03264 class032643 = class05404.y(class05433.NK.N(class008913, class054282.y(), this.L));
        this.N.accept((class05399)class05427.N((class00891)class008913, (class03264)class032643).N(Y));
        this.N(class008912);
    }

    public final void u(class00891 class008912, class05432 class054322) {
        this.N(class008912, "_top");
        this.L(class008912, class054322);
    }

    private void u() {
        this.e(class00869.Rc);
        class01894 class018942 = this.N(class06570.MJ, class00869.Rc);
        this.N(class00869.Rc, class018942, class08825.N((int)-12012264));
    }

    public final void u(class00891 class008912, class01343 class013432) {
        class03264 class032642 = class05404.y(class013432.N(class008912, this.L));
        class01894 class018942 = class05388.N(class008912, "_front_on");
        class03264 class032643 = class05404.y(class013432.get(class008912).N((T class053882) -> class053882.N(class05418.M, class018942)).N(class008912, "_on", this.L));
        this.N.accept((class05399)class05427.N((class00891)class008912).N(class05404.N(class06665.n, class032643, class032642)).N(Y));
    }

    public final void u(class00891 class008912) {
        this.N.accept((class05399)class05427.N((class00891)class008912).N(class05415.N(class06665.yk).N((T1 n) -> {
            String string = "_" + n;
            class01894 class018942 = class05388.N(class008912, string);
            return class05404.y(class05433.L.N(class008912, string, new class05388().N(class05418.N, class018942), this.L));
        })));
        this.N(class008912, class05387.N(class008912, "_0"));
    }

    private void r() {
        class00891 class008912 = class00869.nF;
        class05388 class053882 = class05388.N(class008912, "_front_off", "_side_off", "_top", "_bottom");
        class05388 class053883 = class05388.N(class008912, "_front_on", "_side_on", "_top", "_bottom");
        class05388 class053884 = class05388.N(class008912, "_front_ejecting", "_side_on", "_top", "_bottom");
        class05388 class053885 = class05388.N(class008912, "_front_ejecting", "_side_on", "_top_ejecting", "_bottom");
        class01894 class018942 = class05433.Lb.N(class008912, class053882, this.L);
        class03264 class032642 = class05404.y(class018942);
        class03264 class032643 = class05404.y(class05433.Lb.N(class008912, "_active", class053883, this.L));
        class03264 class032644 = class05404.y(class05433.Lb.N(class008912, "_unlocking", class053884, this.L));
        class03264 class032645 = class05404.y(class05433.Lb.N(class008912, "_ejecting_reward", class053885, this.L));
        class05388 class053886 = class05388.N(class008912, "_front_off_ominous", "_side_off_ominous", "_top_ominous", "_bottom_ominous");
        class05388 class053887 = class05388.N(class008912, "_front_on_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
        class05388 class053888 = class05388.N(class008912, "_front_ejecting_ominous", "_side_on_ominous", "_top_ominous", "_bottom_ominous");
        class05388 class053889 = class05388.N(class008912, "_front_ejecting_ominous", "_side_on_ominous", "_top_ejecting_ominous", "_bottom_ominous");
        class03264 class032646 = class05404.y(class05433.Lb.N(class008912, "_ominous", class053886, this.L));
        class03264 class032647 = class05404.y(class05433.Lb.N(class008912, "_active_ominous", class053887, this.L));
        class03264 class032648 = class05404.y(class05433.Lb.N(class008912, "_unlocking_ominous", class053888, this.L));
        class03264 class032649 = class05404.y(class05433.Lb.N(class008912, "_ejecting_reward_ominous", class053889, this.L));
        this.N(class008912, class018942);
        this.N.accept((class05399)class05427.N((class00891)class008912).N(class05415.N(class02271.y, class02271.u).N((T1 class023022, T2 bl) -> switch (class023022) {
            default -> throw new MatchException(null, null);
            case class02302.field_48899 -> {
                if (bl.booleanValue()) {
                    yield class032646;
                }
                yield class032642;
            }
            case class02302.field_48900 -> {
                if (bl.booleanValue()) {
                    yield class032647;
                }
                yield class032643;
            }
            case class02302.field_48901 -> {
                if (bl.booleanValue()) {
                    yield class032648;
                }
                yield class032644;
            }
            case class02302.field_48902 -> bl != false ? class032649 : class032645;
        })).N(Y));
    }

    public class01894 y(class06581 class065812, class00891 class008912, String string) {
        class01894 class018942 = class05388.V(class008912);
        class01894 class018943 = class05388.N(class008912, string);
        return class05433.Ly.N(class05387.N(class065812), class05388.L(class018942, class018943), this.L);
    }

    public static class05399 y(class00891 class008912, class03674 class036742, class05388 class053882, BiConsumer<class01894, class08819> biConsumer) {
        class03264 class032642 = class05404.y(class05433.R.N(class008912, class053882, biConsumer));
        return class05404.N(class008912, class032642);
    }

    public static class01975 y(class08437 ... class08437Array) {
        return new class08525(class08509.field_22850, Stream.of(class08437Array).map(class08437::N).toList());
    }

    public final void y(class00891 class008912, class00891 class008913, class06563 class065632) {
        class03264 class032642 = class05404.y(class05387.N("bed"));
        this.N.accept((class05399)class05404.N(class008912, class032642));
        class06581 class065812 = class008912.B();
        class01894 class018942 = class05433.Li.N(class05387.N(class065812), class05388.l(class008913), this.L);
        this.y.N(class065812, class08825.N((class01894)class018942, (class00335)new class00346(class065632)));
    }

    public final void y(class00891 class008912, String string) {
        class06581 class065812 = class008912.B();
        if (class065812 != class06570.N) {
            class01894 class018942 = this.y(class065812, class008912, string);
            this.N(class065812, class018942);
        }
    }

    public static class03264 y(class03674 class036742) {
        return class05404.N(class036742, class036742.N(z), class036742.N(U), class036742.N(E));
    }

    public static class05399 y(class00891 class008912, class03264 class032642, class03264 class032643, class03264 class032644) {
        return class05427.N((class00891)class008912).N(class05415.N(class06665.f, class06665.NZ, class06665.ym).N(class07211.field_11034, class08052.field_12617, class08061.field_12710, class032643).N(class07211.field_11039, class08052.field_12617, class08061.field_12710, class032643.N(U).N(R)).N(class07211.field_11035, class08052.field_12617, class08061.field_12710, class032643.N(z).N(R)).N(class07211.field_11043, class08052.field_12617, class08061.field_12710, class032643.N(E).N(R)).N(class07211.field_11034, class08052.field_12617, class08061.field_12709, class032644).N(class07211.field_11039, class08052.field_12617, class08061.field_12709, class032644.N(U).N(R)).N(class07211.field_11035, class08052.field_12617, class08061.field_12709, class032644.N(z).N(R)).N(class07211.field_11043, class08052.field_12617, class08061.field_12709, class032644.N(E).N(R)).N(class07211.field_11034, class08052.field_12617, class08061.field_12708, class032644.N(E).N(R)).N(class07211.field_11039, class08052.field_12617, class08061.field_12708, class032644.N(z).N(R)).N(class07211.field_11035, class08052.field_12617, class08061.field_12708, class032644).N(class07211.field_11043, class08052.field_12617, class08061.field_12708, class032644.N(U).N(R)).N(class07211.field_11034, class08052.field_12617, class08061.field_12713, class032642).N(class07211.field_11039, class08052.field_12617, class08061.field_12713, class032642.N(U).N(R)).N(class07211.field_11035, class08052.field_12617, class08061.field_12713, class032642.N(z).N(R)).N(class07211.field_11043, class08052.field_12617, class08061.field_12713, class032642.N(E).N(R)).N(class07211.field_11034, class08052.field_12617, class08061.field_12712, class032642.N(E).N(R)).N(class07211.field_11039, class08052.field_12617, class08061.field_12712, class032642.N(z).N(R)).N(class07211.field_11035, class08052.field_12617, class08061.field_12712, class032642).N(class07211.field_11043, class08052.field_12617, class08061.field_12712, class032642.N(U).N(R)).N(class07211.field_11034, class08052.field_12619, class08061.field_12710, class032643.N(B).N(R)).N(class07211.field_11039, class08052.field_12619, class08061.field_12710, class032643.N(B).N(U).N(R)).N(class07211.field_11035, class08052.field_12619, class08061.field_12710, class032643.N(B).N(z).N(R)).N(class07211.field_11043, class08052.field_12619, class08061.field_12710, class032643.N(B).N(E).N(R)).N(class07211.field_11034, class08052.field_12619, class08061.field_12709, class032644.N(B).N(z).N(R)).N(class07211.field_11039, class08052.field_12619, class08061.field_12709, class032644.N(B).N(E).N(R)).N(class07211.field_11035, class08052.field_12619, class08061.field_12709, class032644.N(B).N(U).N(R)).N(class07211.field_11043, class08052.field_12619, class08061.field_12709, class032644.N(B).N(R)).N(class07211.field_11034, class08052.field_12619, class08061.field_12708, class032644.N(B).N(R)).N(class07211.field_11039, class08052.field_12619, class08061.field_12708, class032644.N(B).N(U).N(R)).N(class07211.field_11035, class08052.field_12619, class08061.field_12708, class032644.N(B).N(z).N(R)).N(class07211.field_11043, class08052.field_12619, class08061.field_12708, class032644.N(B).N(E).N(R)).N(class07211.field_11034, class08052.field_12619, class08061.field_12713, class032642.N(B).N(z).N(R)).N(class07211.field_11039, class08052.field_12619, class08061.field_12713, class032642.N(B).N(E).N(R)).N(class07211.field_11035, class08052.field_12619, class08061.field_12713, class032642.N(B).N(U).N(R)).N(class07211.field_11043, class08052.field_12619, class08061.field_12713, class032642.N(B).N(R)).N(class07211.field_11034, class08052.field_12619, class08061.field_12712, class032642.N(B).N(R)).N(class07211.field_11039, class08052.field_12619, class08061.field_12712, class032642.N(B).N(U).N(R)).N(class07211.field_11035, class08052.field_12619, class08061.field_12712, class032642.N(B).N(z).N(R)).N(class07211.field_11043, class08052.field_12619, class08061.field_12712, class032642.N(B).N(E).N(R)));
    }

    public static class05415<class08503> y() {
        return class05415.y(class06665.V).N(class07185.field_11052, i).N(class07185.field_11051, M).N(class07185.field_11048, M.N(z));
    }

    public final void y(class00891 class008912, class06581 class065812) {
        this.y(class065812);
        this.e(class008912);
    }

    public void y(class06581 class065812) {
        this.N(class065812, this.N(class065812));
    }

    public static class05399 y(class00891 class008912, class03264 class032642, class03264 class032643) {
        return class05394.N(class008912).N(class032642).N(class05404.N().N((class08092)class06665.c, (Comparable)Boolean.valueOf(true)), class032643.N(R)).N(class05404.N().N((class08092)class06665.X, (Comparable)Boolean.valueOf(true)), class032643.N(z).N(R)).N(class05404.N().N((class08092)class06665.a, (Comparable)Boolean.valueOf(true)), class032643.N(U).N(R)).N(class05404.N().N((class08092)class06665.p, (Comparable)Boolean.valueOf(true)), class032643.N(E).N(R));
    }

    public final void y(class00891 class008912) {
        class03674 class036742 = class05404.N(class05428.N.N(class008912, this.L));
        class03674 class036743 = class05404.N(class05428.L.N(class008912, this.L));
        this.N.accept((class05399)class05427.N((class00891)class008912, (class03264)class05404.N(class036742, class036743)));
    }

    public final void y(class00891 class008912, class01343 class013432) {
        class03264 class032642 = class05404.y(class013432.N(class008912, this.L));
        this.N.accept((class05399)class05427.N((class00891)class008912, (class03264)class032642).N(Y));
    }

    public static class05399 y(class00891 class008912, class03264 class032642) {
        return class05427.N((class00891)class008912, (class03264)class032642).N(class05404.y());
    }

    public final void y(class00891 class008912, class05432 class054322, class05388 class053882) {
        class03264 class032642 = class05404.y(class054322.N().N(class008912, class053882, this.L));
        this.N.accept((class05399)class05404.N(class008912, class032642));
    }

    public final void y(class00891 class008912, class01894 class018942) {
        class03264 class032642 = class05404.y(class05433.NN.N(class008912, class05388.B(class018942), this.L));
        this.N.accept((class05399)class05404.N(class008912, class032642));
    }

    public static class03264 y(class01894 class018942) {
        return class05404.N(class05404.N(class018942));
    }

    public final void y(class00891 class008912, class00891 class008913) {
        class03264 class032642 = class05404.y(class05433.NB.N(class008912));
        class03264 class032643 = class05404.y(class05433.NZ.N(class008912));
        class03264 class032644 = class05404.y(class05433.Nz.N(class008912));
        this.y.N(class008912.B(), class008913.B());
        this.N.accept(class05404.u(class008913, class032642, class032643, class032644));
    }

    public final void y(class00891 class008912, class05432 class054322) {
        class05388 class053882 = class054322.N(class008912);
        this.y(class008912, class054322, class053882);
    }

    public final void y(class00891 class008912, class00891 class008913, class05432 class054322) {
        this.y(class008912, class054322);
        class05388 class053882 = class054322.y(class008912);
        class03264 class032642 = class05404.y(class054322.y().N(class008913, class053882, this.L));
        this.N.accept((class05399)class05404.N(class008913, class032642));
    }

    public final void y(class01343 class013432, class00891 ... class00891Array) {
        for (class00891 class008912 : class00891Array) {
            class03264 class032642 = class05404.y(class013432.N(class008912, this.L));
            this.N.accept((class05399)class05427.N((class00891)class008912, (class03264)class032642).N(k));
        }
    }

    public final void E(class00891 class008912, class00891 class008913) {
        class01894 class018942 = class05428.l.N(class008912, this.L);
        class01894 class018943 = class05428.d.N(class008912, this.L);
        this.y(class008912.B());
        this.y.N(class008912.B(), class008913.B());
        this.N.accept((class05399)class05427.N((class00891)class008912).N(class05404.N(class06665.W, class05404.y(class018943), class05404.y(class018942))));
        this.N.accept((class05399)class05427.N((class00891)class008913).N(class05404.N(class06665.W, class05404.y(class018943), class05404.y(class018942))));
    }

    public final class05424 E(class00891 class008912) {
        return new class05424(this, class05388.T(class008912));
    }

    private void E() {
        class01894 class018942 = class05388.N(class00869.PF, "_top_open");
        class03264 class032642 = class05404.y(class05428.R.N(class00869.PF, this.L));
        class03264 class032643 = class05404.y(class05428.R.get(class00869.PF).N((T class053882) -> class053882.N(class05418.R, class018942)).N(class00869.PF, "_open", this.L));
        this.N.accept((class05399)class05427.N((class00891)class00869.PF).N(class05415.N(class06665.d).N(false, class032642).N(true, class032643)).N(d));
    }

    private void A() {
        this.N(class00869.nH);
        this.N.accept((class05399)class05404.N(class00869.nH, class05404.y(class05387.N(class00869.nH))));
    }

    public static class08437 N() {
        return new class08437();
    }

    public final void N(class00891 class008912, @Nullable class06563 class065632) {
        this.T(class008912);
        class06581 class065812 = class008912.B();
        class01894 class018942 = class05433.Lu.N(class065812, class05388.l(class008912), this.L);
        class08895 class088952 = class065632 != null ? class08825.N((class01894)class018942, (class00335)new class00357(class065632)) : class08825.N((class01894)class018942, (class00335)new class00357());
        this.y.N(class065812, class088952);
    }

    public static class08503 N(class05288 class052882) {
        return switch (class052882) {
            default -> throw new MatchException(null, null);
            case class05288.field_23382 -> M;
            case class05288.field_23383 -> M.N(U);
            case class05288.field_23384 -> M.N(E);
            case class05288.field_23381 -> M.N(z);
            case class05288.field_23386 -> Z.N(U);
            case class05288.field_23387 -> Z;
            case class05288.field_23388 -> Z.N(z);
            case class05288.field_23385 -> Z.N(E);
            case class05288.field_23391 -> i;
            case class05288.field_23392 -> U;
            case class05288.field_23389 -> E;
            case class05288.field_23390 -> z;
        };
    }

    public final void N(class00891 class008912, class00891 class008913, class07030 class070302, class01894 class018942) {
        class03264 class032642 = class05404.y(class05387.N("skull"));
        this.N.accept((class05399)class05404.N(class008912, class032642));
        this.N.accept((class05399)class05404.N(class008913, class032642));
        if (class070302 == class07032.field_11510) {
            this.y.N(class008912.B(), class08825.N((class01894)class018942, (class00335)new class08767()));
        } else {
            this.y.N(class008912.B(), class08825.N((class01894)class018942, (class00335)new class00355(class070302)));
        }
    }

    public static class03264 N(class03674 class036742) {
        return new class03264(class04540.N((Object)class036742));
    }

    public final void N(class00891 class008912, class01894 class018942, class08843 class088432) {
        this.y.N(class008912.B(), class08825.N((class01894)class018942, (class08843[])new class08843[]{class088432}));
    }

    public final class01894 N(class06581 class065812, class00891 class008912, String string) {
        return class05433.yD.N(class05387.N(class065812), class05388.U(class05388.N(class008912, string)), this.L);
    }

    public class01894 N(class06581 class065812, class00891 class008912) {
        return class05433.yD.N(class05387.N(class065812), class05388.K(class008912), this.L);
    }

    public static class03674 N(class01894 class018942) {
        return new class03674(class018942);
    }

    public final class01894 N(class06581 class065812) {
        return class05433.yD.N(class05387.N(class065812), class05388.y(class065812), this.L);
    }

    public final void N(class00891 class008912, class00335 class003352) {
        class06581 class065812 = class008912.B();
        class01894 class018942 = class05387.N(class065812);
        this.y.N(class065812, class08825.N((class01894)class018942, (class00335)class003352));
    }

    public void N(class00891 class008912, class01894 class018942) {
        this.y.N(class008912.B(), class08825.N((class01894)class018942));
    }

    public final void N(class06581 class065812, class01894 class018942) {
        this.y.N(class065812, class08825.N((class01894)class018942));
    }

    public final void N(class06581 class065812, class06581 class065813) {
        class01894 class018942 = this.N(class065812);
        this.N(class065812, class018942);
        this.N(class065813, class018942);
    }

    public final void N(class00891 class008912, class00891 class008913, class02774 class027742) {
        class03264 class032642 = class05404.y(class05433.NN.N(class008912, class05388.B(class05388.V(class008913)), this.L));
        class01894 class018942 = class05387.y("template_copper_golem_statue");
        this.N.accept((class05399)class05404.N(class008912, class032642));
        this.y.N(class008912.B(), class08825.N((class08092)class08981.L, (class08895)class08825.N((class01894)class018942, (class00335)new class08106(class027742, class08973.field_61414)), Map.of(class08973.field_61415, class08825.N((class01894)class018942, (class00335)new class08106(class027742, class08973.field_61415)), class08973.field_61417, class08825.N((class01894)class018942, (class00335)new class08106(class027742, class08973.field_61417)), class08973.field_61416, class08825.N((class01894)class018942, (class00335)new class08106(class027742, class08973.field_61416)))));
    }

    public final void N(class00891 class008912, class00891 class008913, class06563 class065632) {
        class03264 class032642 = class05404.y(class05387.N("banner"));
        class01894 class018942 = class05387.y("template_banner");
        this.N.accept((class05399)class05404.N(class008912, class032642));
        this.N.accept((class05399)class05404.N(class008913, class032642));
        class06581 class065812 = class008912.B();
        this.y.N(class065812, class08825.N((class01894)class018942, (class00335)new class00364(class065632)));
    }

    public static class03264 N(class03674 ... class03674Array) {
        return new class03264(class04540.N((List)Arrays.stream(class03674Array).map(class036742 -> new class04523(class036742, 1)).toList()));
    }

    public final void N(class00891 class008912, class00891 class008913, class01894 class018942, boolean bl) {
        this.M(class008912, class008913);
        class06581 class065812 = class008912.B();
        class01894 class018943 = class05433.LR.N(class065812, class05388.l(class008913), this.L);
        class08895 class088952 = class08825.N((class01894)class018943, (class00335)new class00360(class018942));
        if (bl) {
            class08895 class088953 = class08825.N((class01894)class018943, (class00335)new class00360(class00344.N));
            this.y.N(class065812, class08825.y((class08895)class088953, (class08895)class088952));
        } else {
            this.y.N(class065812, class088952);
        }
    }

    private /* synthetic */ class03264 N(int[] nArray, Int2ObjectMap int2ObjectMap, class00891 class008912, Integer n2) {
        int n3 = nArray[n2];
        return class05404.y((class01894)int2ObjectMap.computeIfAbsent(n3, n -> this.N(class008912, "_stage" + n, class05433.yz, class05388::M)));
    }

    public static class08437 N(class06667 class066672, boolean bl) {
        return class05404.N().N((class08092)class066672, (Comparable)Boolean.valueOf(bl));
    }

    public static class01975 N(class08437 ... class08437Array) {
        return new class08525(class08509.field_22851, Stream.of(class08437Array).map(class08437::N).toList());
    }

    @SafeVarargs
    public static <T extends Enum<T>> class08437 N(class08064<T> class080642, T t, T ... TArray) {
        return class05404.N().N(class080642, t, TArray);
    }

    public static class05399 N(class00891 class008912, class03674 class036742, class05388 class053882, BiConsumer<class01894, class08819> biConsumer) {
        class03674 class036743 = class05404.N(class05433.i.N(class008912, class053882, biConsumer));
        return class05427.N((class00891)class008912, (class03264)class05404.N(class036742, class036743));
    }

    public final void N(class00891 class008912, class01343 class013432, class01343 class013433) {
        class03264 class032642 = class05404.y(class013432.N(class008912, this.L));
        class03264 class032643 = class05404.y(class013433.N(class008912, this.L));
        this.N.accept(class05404.L(class008912, class032642, class032643));
    }

    public void N(class00891 class008912, class01343 class013432) {
        class03264 class032642 = class05404.y(class013432.N(class008912, this.L));
        this.N.accept(class05404.y(class008912, class032642));
    }

    public static class05399 N(class00891 class008912, class05388 class053882, BiConsumer<class01894, class08819> biConsumer) {
        class03264 class032642 = class05404.y(class05433.M.N(class008912, class053882, biConsumer));
        class03264 class032643 = class05404.y(class05433.B.N(class008912, class053882, biConsumer));
        class03264 class032644 = class05404.y(class05433.Z.N(class008912, class053882, biConsumer));
        return class05427.N((class00891)class008912).N(class05415.N(class06665.V).N(class07185.field_11048, class032642).N(class07185.field_11052, class032643).N(class07185.field_11051, class032644));
    }

    public static class05427 N(class00891 class008912, class03264 class032642) {
        return class05427.N((class00891)class008912, (class03264)class032642);
    }

    public static class05399 N(class00891 class008912, class03264 class032642, class03264 class032643, class03264 class032644, class03264 class032645, boolean bl) {
        return class05427.N((class00891)class008912).N(class05415.N(class06665.v, class06665.d).N(false, false, class032643).N(true, false, class032645).N(false, true, class032642).N(true, true, class032644)).N(bl ? R : i).N(k);
    }

    public final class03264 N(class07211 class072112, class06337 class063372) {
        String string = "_" + class072112.method_15434() + "_" + class063372.method_15434();
        class05388 class053882 = class05388.L(class05388.N(class00869.vp, string));
        return class05404.y(class05433.Nm.N(class00869.vp, string, class053882, this.L));
    }

    public void N(class00891 class008912, class01343 class013432, int n) {
        class01894 class018942 = class013432.N(class008912, this.L);
        this.N.accept((class05399)class05404.N(class008912, class05404.y(class018942)));
        this.N(class008912, class018942, class08825.N((int)n));
    }

    public final class01894 N(class00891 class008912, String string, class05403 class054032, Function<class01894, class05388> function) {
        return class054032.N(class008912, string, function.apply(class05388.N(class008912, string)), this.L);
    }

    public final class01894 N(class01343 class013432, class00891 class008912, String string) {
        return class013432.N((T class053882) -> class053882.N(class05418.Z, class05388.N(class008912, string)).N(class05418.u, class05388.N(class008912, "_top" + string))).N(class008912, string, this.L);
    }

    public static class05399 N(class00891 class008912, class03264 class032642, class03264 class032643) {
        return class05427.N((class00891)class008912).N(class05415.N(class06665.k).N(false, class032642).N(true, class032643)).N(class05415.y(class06665.D, class06665.f).N(class06657.field_12475, class07211.field_11034, z).N(class06657.field_12475, class07211.field_11039, E).N(class06657.field_12475, class07211.field_11035, U).N(class06657.field_12475, class07211.field_11043, i).N(class06657.field_12471, class07211.field_11034, z.N(M).N(R)).N(class06657.field_12471, class07211.field_11039, E.N(M).N(R)).N(class06657.field_12471, class07211.field_11035, U.N(M).N(R)).N(class06657.field_12471, class07211.field_11043, M.N(R)).N(class06657.field_12473, class07211.field_11034, E.N(B)).N(class06657.field_12473, class07211.field_11039, z.N(B)).N(class06657.field_12473, class07211.field_11035, B).N(class06657.field_12473, class07211.field_11043, U.N(B)));
    }

    public final void N(class00891 class008912, class03264 class032642, class05388 class053882) {
        class03264 class032643 = class05404.y(class05433.yJ.N(class008912, class053882, this.L));
        this.N.accept((class05399)class05427.N((class00891)class008912).N(class05404.N(class06665.z, class032642, class032643)).N(l));
    }

    public static class05415<class03264> N(class06667 class066672, class03264 class032642, class03264 class032643) {
        return class05415.N(class066672).N(true, class032642).N(false, class032643);
    }

    public static class03264 N(class03674 class036742, class03674 class036743) {
        return class05404.N(class036742, class036743, class036742.N(U), class036743.N(U));
    }

    public static class05399 N(class00891 class008912, class03264 class032642, class03264 class032643, class03264 class032644) {
        return class05394.N(class008912).N(class05404.N().N((class08092)class06665.e, (Comparable)Boolean.valueOf(true)), class032642).N(class05404.N().N((class08092)class06665.NN, (Comparable)class06008.field_22179), class032643.N(R)).N(class05404.N().N((class08092)class06665.r, (Comparable)class06008.field_22179), class032643.N(z).N(R)).N(class05404.N().N((class08092)class06665.Ny, (Comparable)class06008.field_22179), class032643.N(U).N(R)).N(class05404.N().N((class08092)class06665.NL, (Comparable)class06008.field_22179), class032643.N(E).N(R)).N(class05404.N().N((class08092)class06665.NN, (Comparable)class06008.field_22180), class032644.N(R)).N(class05404.N().N((class08092)class06665.r, (Comparable)class06008.field_22180), class032644.N(z).N(R)).N(class05404.N().N((class08092)class06665.Ny, (Comparable)class06008.field_22180), class032644.N(U).N(R)).N(class05404.N().N((class08092)class06665.NL, (Comparable)class06008.field_22180), class032644.N(E).N(R));
    }

    public final void N(class00891 class008912, class01894 class018942, class01894 class018943, class01894 class018944, class01894 class018945, class01894 class018946, class01894 class018947) {
        class03264 class032642 = class05404.y(class018942);
        class03264 class032643 = class05404.y(class018943);
        class03264 class032644 = class05404.y(class018944);
        class03264 class032645 = class05404.y(class018945);
        class03264 class032646 = class05404.y(class018946);
        class03264 class032647 = class05404.y(class018947);
        this.N.accept(class05394.N(class008912).N(class032642).N(class05404.N().N((class08092)class06665.c, (Comparable)Boolean.valueOf(false)).N((class08092)class06665.X, (Comparable)Boolean.valueOf(false)).N((class08092)class06665.a, (Comparable)Boolean.valueOf(false)).N((class08092)class06665.p, (Comparable)Boolean.valueOf(false)), class032643).N(class05404.N().N((class08092)class06665.c, (Comparable)Boolean.valueOf(true)).N((class08092)class06665.X, (Comparable)Boolean.valueOf(false)).N((class08092)class06665.a, (Comparable)Boolean.valueOf(false)).N((class08092)class06665.p, (Comparable)Boolean.valueOf(false)), class032644).N(class05404.N().N((class08092)class06665.c, (Comparable)Boolean.valueOf(false)).N((class08092)class06665.X, (Comparable)Boolean.valueOf(true)).N((class08092)class06665.a, (Comparable)Boolean.valueOf(false)).N((class08092)class06665.p, (Comparable)Boolean.valueOf(false)), class032644.N(z)).N(class05404.N().N((class08092)class06665.c, (Comparable)Boolean.valueOf(false)).N((class08092)class06665.X, (Comparable)Boolean.valueOf(false)).N((class08092)class06665.a, (Comparable)Boolean.valueOf(true)).N((class08092)class06665.p, (Comparable)Boolean.valueOf(false)), class032645).N(class05404.N().N((class08092)class06665.c, (Comparable)Boolean.valueOf(false)).N((class08092)class06665.X, (Comparable)Boolean.valueOf(false)).N((class08092)class06665.a, (Comparable)Boolean.valueOf(false)).N((class08092)class06665.p, (Comparable)Boolean.valueOf(true)), class032645.N(z)).N(class05404.N().N((class08092)class06665.c, (Comparable)Boolean.valueOf(true)), class032646).N(class05404.N().N((class08092)class06665.X, (Comparable)Boolean.valueOf(true)), class032646.N(z)).N(class05404.N().N((class08092)class06665.a, (Comparable)Boolean.valueOf(true)), class032647).N(class05404.N().N((class08092)class06665.p, (Comparable)Boolean.valueOf(true)), class032647.N(z)));
    }

    public final void N(class00891 class008912, class06581 class065812) {
        class03264 class032642 = class05404.y(class05433.NN.N(class008912, class05388.N(class065812), this.L));
        this.N.accept((class05399)class05404.N(class008912, class032642));
    }

    public static class05399 N(class00891 class008912, class03264 class032642, class03264 class032643, class03264 class032644, class03264 class032645, class03264 class032646, class03264 class032647, class03264 class032648, class03264 class032649) {
        return class05427.N((class00891)class008912).N(class05415.N(class06665.f, class06665.NB, class06665.yz, class06665.d).N(class07211.field_11034, class08059.field_12607, class08058.field_12588, false, class032642).N(class07211.field_11035, class08059.field_12607, class08058.field_12588, false, class032642.N(z)).N(class07211.field_11039, class08059.field_12607, class08058.field_12588, false, class032642.N(U)).N(class07211.field_11043, class08059.field_12607, class08058.field_12588, false, class032642.N(E)).N(class07211.field_11034, class08059.field_12607, class08058.field_12586, false, class032644).N(class07211.field_11035, class08059.field_12607, class08058.field_12586, false, class032644.N(z)).N(class07211.field_11039, class08059.field_12607, class08058.field_12586, false, class032644.N(U)).N(class07211.field_11043, class08059.field_12607, class08058.field_12586, false, class032644.N(E)).N(class07211.field_11034, class08059.field_12607, class08058.field_12588, true, class032643.N(z)).N(class07211.field_11035, class08059.field_12607, class08058.field_12588, true, class032643.N(U)).N(class07211.field_11039, class08059.field_12607, class08058.field_12588, true, class032643.N(E)).N(class07211.field_11043, class08059.field_12607, class08058.field_12588, true, class032643).N(class07211.field_11034, class08059.field_12607, class08058.field_12586, true, class032645.N(E)).N(class07211.field_11035, class08059.field_12607, class08058.field_12586, true, class032645).N(class07211.field_11039, class08059.field_12607, class08058.field_12586, true, class032645.N(z)).N(class07211.field_11043, class08059.field_12607, class08058.field_12586, true, class032645.N(U)).N(class07211.field_11034, class08059.field_12609, class08058.field_12588, false, class032646).N(class07211.field_11035, class08059.field_12609, class08058.field_12588, false, class032646.N(z)).N(class07211.field_11039, class08059.field_12609, class08058.field_12588, false, class032646.N(U)).N(class07211.field_11043, class08059.field_12609, class08058.field_12588, false, class032646.N(E)).N(class07211.field_11034, class08059.field_12609, class08058.field_12586, false, class032648).N(class07211.field_11035, class08059.field_12609, class08058.field_12586, false, class032648.N(z)).N(class07211.field_11039, class08059.field_12609, class08058.field_12586, false, class032648.N(U)).N(class07211.field_11043, class08059.field_12609, class08058.field_12586, false, class032648.N(E)).N(class07211.field_11034, class08059.field_12609, class08058.field_12588, true, class032647.N(z)).N(class07211.field_11035, class08059.field_12609, class08058.field_12588, true, class032647.N(U)).N(class07211.field_11039, class08059.field_12609, class08058.field_12588, true, class032647.N(E)).N(class07211.field_11043, class08059.field_12609, class08058.field_12588, true, class032647).N(class07211.field_11034, class08059.field_12609, class08058.field_12586, true, class032649.N(E)).N(class07211.field_11035, class08059.field_12609, class08058.field_12586, true, class032649).N(class07211.field_11039, class08059.field_12609, class08058.field_12586, true, class032649.N(z)).N(class07211.field_11043, class08059.field_12609, class08058.field_12586, true, class032649.N(U)));
    }

    public static class03264 N(int n2) {
        String string = "_age" + n2;
        return new class03264(class04540.N(IntStream.range(1, 5).mapToObj(n -> new class04523((Object)class05404.N(class05387.N(class00869.mx, n + string)), 1)).collect(Collectors.toList())));
    }

    public static <T extends Comparable<T>> class05415<class03264> N(class08092<T> class080922, T t, class03264 class032642, class03264 class032643) {
        return class05415.N(class080922).N((T1 comparable2) -> comparable2.compareTo(t) >= 0 ? class032642 : class032643);
    }

    public final void N(class00891 class008912, Function<class00891, class05388> function) {
        class05388 class053882 = function.apply(class008912).y(class05418.Z, class05418.L);
        class05388 class053883 = class053882.L(class05418.M, class05388.N(class008912, "_front_honey"));
        class01894 class018942 = class05433.T.N(class008912, "_empty", class053882, this.L);
        class01894 class018943 = class05433.T.N(class008912, "_honey", class053883, this.L);
        this.y.N(class008912.B(), class08825.N((class08092)class04593.L, (class08895)class08825.N((class01894)class018942), Map.of(5, class08825.N((class01894)class018943))));
        this.N.accept((class05399)class05427.N((class00891)class008912).N(class05404.N(class04593.L, Integer.valueOf(5), class05404.y(class018943), class05404.y(class018942))).N(Y));
    }

    public final void N(class00891 class008912, class08092<Integer> class080922, int ... nArray) {
        this.y(class008912.B());
        if (class080922.N().size() != nArray.length) {
            throw new IllegalArgumentException();
        }
        Int2ObjectOpenHashMap int2ObjectOpenHashMap = new Int2ObjectOpenHashMap();
        this.N.accept((class05399)class05427.N((class00891)class008912).N(class05415.N(class080922).N(arg_0 -> this.N(nArray, (Int2ObjectMap)int2ObjectOpenHashMap, class008912, arg_0))));
    }

    public final void N(class00891 class008912, class05432 class054322, class08092<Integer> class080922, int ... nArray) {
        if (class080922.N().size() != nArray.length) {
            throw new IllegalArgumentException("missing values for property: " + String.valueOf(class080922));
        }
        this.y(class008912.B());
        this.N.accept((class05399)class05427.N((class00891)class008912).N(class05415.N(class080922).N((T1 n) -> {
            String string = "_stage" + nArray[n];
            class05388 class053882 = class05388.L(class05388.N(class008912, string));
            return class05404.y(class054322.N().N(class008912, string, class053882, this.L));
        })));
    }

    public final void N(class00891 class008912, class00891 class008913, class00891 class008914, class00891 class008915, class00891 class008916, class00891 class008917, class00891 class008918, class00891 class008919) {
        this.N(class008912, class05432.field_22840);
        this.N(class008913, class05432.field_22840);
        this.R(class008914);
        this.R(class008915);
        this.u(class008916, class008918);
        this.u(class008917, class008919);
    }

    public final void N(class00891 class008912, class03264 class032642, Function<class08437, class08437> function, class03264 class032643, Function<class08437, class08437> function2, class03264 class032644, Function<class08437, class08437> function3, class03264 class032645, Function<class08437, class08437> function4) {
        this.N.accept(class05394.N(class008912).N(function.apply(class05404.N().N((class08092)class06665.f, (Comparable)class07211.field_11043)), class032642).N(function.apply(class05404.N().N((class08092)class06665.f, (Comparable)class07211.field_11034)), class032642.N(z)).N(function.apply(class05404.N().N((class08092)class06665.f, (Comparable)class07211.field_11035)), class032642.N(U)).N(function.apply(class05404.N().N((class08092)class06665.f, (Comparable)class07211.field_11039)), class032642.N(E)).N(function2.apply(class05404.N().N((class08092)class06665.f, (Comparable)class07211.field_11043)), class032643).N(function2.apply(class05404.N().N((class08092)class06665.f, (Comparable)class07211.field_11034)), class032643.N(z)).N(function2.apply(class05404.N().N((class08092)class06665.f, (Comparable)class07211.field_11035)), class032643.N(U)).N(function2.apply(class05404.N().N((class08092)class06665.f, (Comparable)class07211.field_11039)), class032643.N(E)).N(function3.apply(class05404.N().N((class08092)class06665.f, (Comparable)class07211.field_11043)), class032644).N(function3.apply(class05404.N().N((class08092)class06665.f, (Comparable)class07211.field_11034)), class032644.N(z)).N(function3.apply(class05404.N().N((class08092)class06665.f, (Comparable)class07211.field_11035)), class032644.N(U)).N(function3.apply(class05404.N().N((class08092)class06665.f, (Comparable)class07211.field_11039)), class032644.N(E)).N(function4.apply(class05404.N().N((class08092)class06665.f, (Comparable)class07211.field_11043)), class032645).N(function4.apply(class05404.N().N((class08092)class06665.f, (Comparable)class07211.field_11034)), class032645.N(z)).N(function4.apply(class05404.N().N((class08092)class06665.f, (Comparable)class07211.field_11035)), class032645.N(U)).N(function4.apply(class05404.N().N((class08092)class06665.f, (Comparable)class07211.field_11039)), class032645.N(E)));
    }

    public final void N(class01343 class013432, class00891 ... class00891Array) {
        for (class00891 class008912 : class00891Array) {
            class03674 class036742 = class05404.N(class013432.N(class008912, this.L));
            this.N.accept((class05399)class05427.N((class00891)class008912, (class03264)class05404.y(class036742)));
        }
    }

    public final void N(class00891 class008912, class00891 class008913, class05432 class054322) {
        this.N(class008912.B(), class054322.N(this, class008912));
        this.y(class008912, class008913, class054322);
    }

    public final void N(class00891 class008912, class05388 class053882) {
        class03264 class032642 = class05404.y(class05433.s.N(class008912, class053882.L(class05418.M, class05388.V(class008912)), this.L));
        this.N.accept((class05399)class05427.N((class00891)class008912, (class03264)class032642).N(Y));
    }

    public final void N(class00891 class008912, class00891 class008913) {
        class03264 class032642 = class05404.y(class05433.t.N(class008912));
        class03264 class032643 = class05404.y(class05433.G.N(class008912));
        class03264 class032644 = class05404.y(class05433.l.N(class008912));
        class03264 class032645 = class05404.y(class05433.d.N(class008912));
        class03264 class032646 = class05404.y(class05433.w.N(class008912));
        class03264 class032647 = class05404.y(class05433.k.N(class008912));
        class03264 class032648 = class05404.y(class05433.Y.N(class008912));
        class03264 class032649 = class05404.y(class05433.Q.N(class008912));
        this.y.N(class008912.B(), class008913.B());
        this.N.accept(class05404.N(class008913, class032642, class032643, class032644, class032645, class032646, class032647, class032648, class032649));
    }

    public void N(class00891 class008912, class00891 class008913, class00891 class008914) {
        class03264 class032642 = this.R(class008913, class008912);
        this.N.accept((class05399)class05404.N(class008913, class032642));
        this.N.accept((class05399)class05404.N(class008914, class032642));
        this.y(class008913.B());
    }

    public static class05399 N(class00891 class008912, class03264 class032642, class03264 class032643, class03264 class032644, class03264 class032645) {
        return class05427.N((class00891)class008912).N(class05415.N(class06665.n, class06665.k).N((T1 bl, T2 bl2) -> {
            if (bl.booleanValue()) {
                return bl2 != false ? class032645 : class032643;
            }
            return bl2 != false ? class032644 : class032642;
        }));
    }

    public final void N(class00891 ... class00891Array) {
        class03264 class032642 = class05404.y(class05387.N("campfire_off"));
        for (class00891 class008912 : class00891Array) {
            class03264 class032643 = class05404.y(class05433.yT.N(class008912, class05388.o(class008912), this.L));
            this.y(class008912.B());
            this.N.accept((class05399)class05427.N((class00891)class008912).N(class05404.N(class06665.n, class032643, class032642)).N(k));
        }
    }

    public final void N(class00891 class008912, class05432 class054322, class05388 class053882) {
        this.N(class008912);
        this.y(class008912, class054322, class053882);
    }

    public final void N(class00891 class008912, class05432 class054322) {
        this.N(class008912.B(), class054322.N(this, class008912));
        this.y(class008912, class054322);
    }

    public final void N(class00891 class008912, class00891 class008913, BiFunction<class00891, class00891, class05388> biFunction) {
        class05388 class053882 = biFunction.apply(class008912, class008913);
        this.N.accept((class05399)class05404.N(class008912, class05404.y(class05433.N.N(class008912, class053882, this.L))));
    }

    public final void N(class00891 class008912, class05388 class053882, class05394 class053942, class05403 class054032, @Nullable Boolean bl, @Nullable class08972 class089722) {
        class03264 class032642 = class05404.y(class054032.N(class008912, class053882, this.L));
        class05404.N((class07211 class072112, class08503 class085032) -> class053942.N(class05404.N(class072112, bl, class089722), class032642.N(class085032)));
    }

    public static void N(BiConsumer<class07211, class08503> biConsumer) {
        List.of(Pair.of((Object)class07211.field_11043, (Object)i), Pair.of((Object)class07211.field_11034, (Object)z), Pair.of((Object)class07211.field_11035, (Object)U), Pair.of((Object)class07211.field_11039, (Object)E)).forEach(pair -> {
            class07211 class072112 = (class07211)pair.getFirst();
            class08503 class085032 = (class08503)pair.getSecond();
            biConsumer.accept(class072112, class085032);
        });
    }

    public static class01975 N(class07211 class072112, @Nullable Boolean bl, @Nullable class08972 class089722) {
        class08437 class084372 = class05404.N((class08064)class06665.f, (Enum)class072112, (Enum[])new class07211[0]);
        if (bl == null) {
            return class084372.N();
        }
        class08437 class084373 = class05404.N(class06665.k, (boolean)bl);
        return class089722 != null ? class05404.y(class084372, class084373, class05404.N((class08064)class06665.Nz, (Enum)class089722, (Enum[])new class08972[0])) : class05404.y(class084372, class084373);
    }

    public final void N(class05394 class053942, class01975 class019752, class08503 class085032) {
        List.of(Pair.of((Object)class03769.L, (Object)class05433.Nf), Pair.of((Object)class03769.u, (Object)class05433.NC), Pair.of((Object)class03769.i, (Object)class05433.NS), Pair.of((Object)class03769.R, (Object)class05433.Nx), Pair.of((Object)class03769.M, (Object)class05433.ND), Pair.of((Object)class03769.B, (Object)class05433.Nh)).forEach(pair -> {
            class06667 class066672 = (class06667)pair.getFirst();
            class05403 class054032 = (class05403)pair.getSecond();
            this.N(class053942, class019752, class085032, class066672, class054032, true);
            this.N(class053942, class019752, class085032, class066672, class054032, false);
        });
    }

    public static <T extends class08092<?>> Map<T, class08503> N(class00522<?, ?> class005222, Function<class07211, T> function) {
        ImmutableMap.Builder builder = ImmutableMap.builderWithExpectedSize((int)Q.size());
        Q.forEach((class072112, class085032) -> {
            class08092 class080922 = (class08092)function.apply((class07211)class072112);
            if (class005222.y(class080922)) {
                builder.put((Object)class080922, class085032);
            }
        });
        return builder.build();
    }

    public final void N(class00891 class008912) {
        class06581 class065812 = class008912.B();
        if (class065812 != class06570.N) {
            this.N(class065812, this.N(class065812, class008912));
        }
    }

    public final class03674 N(int n, int n2) {
        return switch (n2) {
            case 0 -> this.N(n, "", class05388.y(class05388.V(class00869.my)));
            case 1 -> this.N(n, "slightly_cracked_", class05388.y(class05388.N(class00869.my, "_slightly_cracked")));
            case 2 -> this.N(n, "very_cracked_", class05388.y(class05388.N(class00869.my, "_very_cracked")));
            default -> throw new UnsupportedOperationException();
        };
    }

    public final void N(class00891 class008912, String string) {
        class06581 class065812 = class008912.B();
        if (class065812 != class06570.N) {
            this.N(class065812, this.N(class065812, class008912, string));
        }
    }

    public final void N(class05394 class053942, class01975 class019752, class08503 class085032, class06667 class066672, class05403 class054032, boolean bl) {
        String string = bl ? "_occupied" : "_empty";
        class05388 class053882 = new class05388().N(class05418.y, class05388.N(class00869.LG, string));
        class05391 class053913 = new class05391(class054032, string);
        class03264 class032642 = class05404.y(O.computeIfAbsent(class053913, class053912 -> class054032.N(class00869.LG, string, class053882, this.L)));
        class053942.N((class01975)new class08525(class08509.field_22850, List.of(class019752, class05404.N().N((class08092)class066672, (Comparable)Boolean.valueOf(bl)).N())), class032642.N(class085032));
    }

    public final class03674 N(int n, String string, class05388 class053882) {
        return switch (n) {
            case 1 -> class05404.N(class05433.yV.N(class05387.N(string + "turtle_egg"), class053882, this.L));
            case 2 -> class05404.N(class05433.yH.N(class05387.N("two_" + string + "turtle_eggs"), class053882, this.L));
            case 3 -> class05404.N(class05433.yc.N(class05387.N("three_" + string + "turtle_eggs"), class053882, this.L));
            case 4 -> class05404.N(class05433.yX.N(class05387.N("four_" + string + "turtle_eggs"), class053882, this.L));
            default -> throw new UnsupportedOperationException();
        };
    }

    public static class05399 N(class00891 class008912, class03264 class032642, class03264 class032643, class03264 class032644, class03264 class032645, class03264 class032646) {
        return class05394.N(class008912).N(class032642).N(class05404.N().N((class08092)class06665.c, (Comparable)Boolean.valueOf(true)), class032643).N(class05404.N().N((class08092)class06665.X, (Comparable)Boolean.valueOf(true)), class032644).N(class05404.N().N((class08092)class06665.a, (Comparable)Boolean.valueOf(true)), class032645).N(class05404.N().N((class08092)class06665.p, (Comparable)Boolean.valueOf(true)), class032646);
    }

    private void W() {
        class03264 class032642 = class05404.y(class05387.N(class00869.sN, "_floor"));
        class03264 class032643 = class05404.y(class05387.N(class00869.sN, "_ceiling"));
        class03264 class032644 = class05404.y(class05387.N(class00869.sN, "_wall"));
        class03264 class032645 = class05404.y(class05387.N(class00869.sN, "_between_walls"));
        this.y(class06570.dx);
        this.N.accept((class05399)class05427.N((class00891)class00869.sN).N(class05415.N(class06665.f, class06665.h).N(class07211.field_11043, class05648.field_17098, class032642).N(class07211.field_11035, class05648.field_17098, class032642.N(U)).N(class07211.field_11034, class05648.field_17098, class032642.N(z)).N(class07211.field_11039, class05648.field_17098, class032642.N(E)).N(class07211.field_11043, class05648.field_17099, class032643).N(class07211.field_11035, class05648.field_17099, class032643.N(U)).N(class07211.field_11034, class05648.field_17099, class032643.N(z)).N(class07211.field_11039, class05648.field_17099, class032643.N(E)).N(class07211.field_11043, class05648.field_17100, class032644.N(E)).N(class07211.field_11035, class05648.field_17100, class032644.N(z)).N(class07211.field_11034, class05648.field_17100, class032644).N(class07211.field_11039, class05648.field_17100, class032644.N(U)).N(class07211.field_11035, class05648.field_17101, class032645.N(z)).N(class07211.field_11043, class05648.field_17101, class032645.N(E)).N(class07211.field_11034, class05648.field_17101, class032645).N(class07211.field_11039, class05648.field_17101, class032645.N(U))));
    }

    public final void W(class00891 class008912) {
        this.L(class008912, class008912);
    }

    public final void W(class00891 class008912, class00891 class008913) {
        class03264 class032642 = class05404.y(class05428.w.N(class008912, this.L));
        this.L(class008912, class032642);
        this.L(class008913, class032642);
    }

    public final void R(class00891 class008912, class03264 class032642, class03264 class032643) {
        this.N.accept((class05399)class05427.N((class00891)class008912).N(class05415.N(class06665.g).N(true, class032643).N(false, class032642)));
    }

    public void R(class00891 class008912) {
        this.L(class008912, class05428.N);
    }

    private void R() {
        class00891 class008912 = class00869.Ed;
        this.y(class008912.B());
        class03264 class032642 = class05404.y(class05387.N(class008912, "_top"));
        class03264 class032643 = class05404.y(class05387.N(class008912, "_bottom"));
        this.i(class008912, class032642, class032643);
    }

    public final class03264 R(class00891 class008912, class00891 class008913) {
        return class05404.y(class05433.NN.N(class008912, class05388.l(class008913), this.L));
    }

    private void NT() {
        this.y(class06570.EZ);
        this.N.accept((class05399)class05427.N((class00891)class00869.my).N(class05415.N(class06665.No, class06665.Nq).N((T1 n, T2 n2) -> class05404.y(this.N((int)n, (int)n2)))));
    }

    private void Ni() {
        class03264 class032642 = class05404.y(this.N(class00869.vA, "", class05433.NP, class05388::L));
        class03264 class032643 = class05404.y(this.N(class00869.vA, "_lit", class05433.NP, class05388::L));
        this.N.accept((class05399)class05427.N((class00891)class00869.vA).N(class05404.N(class06665.y, class032643, class032642)));
        class03264 class032644 = class05404.y(this.N(class00869.vf, "", class05433.NP, class05388::L));
        class03264 class032645 = class05404.y(this.N(class00869.vf, "_lit", class05433.NP, class05388::L));
        this.N.accept((class05399)class05427.N((class00891)class00869.vf).N(class05404.N(class06665.y, class032645, class032644)));
    }

    public final void O(class00891 class008912) {
        this.N.accept((class05399)class05427.N((class00891)class008912, (class03264)class05404.y(class05387.N(class008912))).N(d));
    }

    private void O() {
        this.Y(class00869.bd);
        this.Y(class00869.bl);
        this.Y(class00869.bG);
        this.Y(class00869.bt);
    }

    private void Nu() {
        class01894 class018942 = class05387.N(class00869.Pa, "_stable");
        class03264 class032642 = class05404.y(class018942);
        class03264 class032643 = class05404.y(class05387.N(class00869.Pa, "_unstable"));
        this.N(class00869.Pa, class018942);
        this.N.accept((class05399)class05427.N((class00891)class00869.Pa).N(class05404.N(class06665.u, class032643, class032642)));
    }

    private void H() {
        class01894 class018942 = class05388.V(class00869.z);
        class05388 class053883 = new class05388().N(class05418.i, class018942).y(class05418.i, class05418.L).N(class05418.R, class05388.N(class00869.Z, "_top")).N(class05418.Z, class05388.N(class00869.Z, "_snow"));
        class03264 class032642 = class05404.y(class05433.m.N(class00869.Z, "_snow", class053883, this.L));
        class01894 class018943 = class05387.N(class00869.Z);
        this.R(class00869.Z, class05404.y(class05404.N(class018943)), class032642);
        this.N(class00869.Z, class018943, (class08843)new class08832());
        class03264 class032643 = class05404.y(class05404.N(class05428.R.get(class00869.RC).N((T class053882) -> class053882.N(class05418.i, class018942)).N(class00869.RC, this.L)));
        this.R(class00869.RC, class032643, class032642);
        class03264 class032644 = class05404.y(class05404.N(class05428.R.get(class00869.E).N((T class053882) -> class053882.N(class05418.i, class018942)).N(class00869.E, this.L)));
        this.R(class00869.E, class032644, class032642);
    }

    public final void H(class00891 class008912) {
        Map<class08092, class08503> map = class05404.N(class008912.W(), class00318::N);
        class08437 class084372 = class05404.N().N((class08092)class00318.y, (Comparable)Boolean.valueOf(false));
        map.forEach((class080922, class085032) -> class084372.N(class080922, (Comparable)class06008.field_22178));
        class03264 class032642 = class05404.y(class05428.z.N(class008912, this.L));
        class03264 class032643 = class05404.y(class05428.U.get(class008912).N((T class053882) -> class053882.N(class05418.Z, class05388.N(class008912, "_side_tall"))).N(class008912, "_side_tall", this.L));
        class03264 class032644 = class05404.y(class05428.U.get(class008912).N((T class053882) -> class053882.N(class05418.Z, class05388.N(class008912, "_side_small"))).N(class008912, "_side_small", this.L));
        class05394 class053942 = class05394.N(class008912);
        class053942.N(class05404.N().N((class08092)class00318.y, (Comparable)Boolean.valueOf(true)), class032642);
        class053942.N(class084372, class032642);
        map.forEach((class080922, class085032) -> {
            class053942.N(class05404.N().N(class080922, (Comparable)class06008.field_22180), class032643.N(class085032));
            class053942.N(class05404.N().N(class080922, (Comparable)class06008.field_22179), class032644.N(class085032));
            class053942.N(class084372, class032643.N(class085032));
        });
        this.N.accept(class053942);
    }

    private void Nz() {
        class05388 class053882 = class05388.N(class00869.is);
        class03264 class032642 = class05404.y(class05433.L.N(class00869.ib, class053882, this.L));
        this.N.accept((class05399)class05427.N((class00891)class00869.is).N(class05415.N(class06665.NK).N((T1 n) -> n < 8 ? class05404.y(class05387.N(class00869.is, "_height" + n * 2)) : class032642)));
        this.N(class00869.is, class05387.N(class00869.is, "_height2"));
        this.N.accept((class05399)class05404.N(class00869.ib, class032642));
    }

    private void G() {
        class05388 class053882 = class05388.m(class00869.Ro);
        this.N.accept((class05399)class05404.N(class00869.Ro, class05404.y(class05387.N(class00869.Ro))));
        this.N(class00869.iK, class053882);
        this.N(class00869.iV, class053882);
    }

    public final void G(class00891 class008912) {
        class03264 class032642 = class008912 == class00869.nq ? class05404.y(class05433.yS.N(class008912, class05388.s(class008912), this.L)) : class05404.y(class05433.yC.N(class008912, class05388.s(class008912), this.L));
        this.N.accept((class05399)class05404.N(class008912, class032642));
    }

    private void Nm() {
        this.y(class06570.wN);
        this.N.accept((class05399)class05427.N((class00891)class00869.sM).N(class05415.N(class06665.NG).N((T1 n) -> class05404.y(this.N(class00869.sM, "_stage" + n, class05433.NP, class05388::L)))));
    }

    private void NZ() {
        this.y(class06570.ui);
        this.N.accept((class05399)class05427.N((class00891)class00869.mA).N(class05415.N(class06665.Nx, class06665.q).N(1, false, class05404.y(class05404.N(class05387.N("dead_sea_pickle")))).N(2, false, class05404.y(class05404.N(class05387.N("two_dead_sea_pickles")))).N(3, false, class05404.y(class05404.N(class05387.N("three_dead_sea_pickles")))).N(4, false, class05404.y(class05404.N(class05387.N("four_dead_sea_pickles")))).N(1, true, class05404.y(class05404.N(class05387.N("sea_pickle")))).N(2, true, class05404.y(class05404.N(class05387.N("two_sea_pickles")))).N(3, true, class05404.y(class05404.N(class05387.N("three_sea_pickles")))).N(4, true, class05404.y(class05404.N(class05387.N("four_sea_pickles"))))));
    }

    private void NR() {
        class03264 class032642 = class05404.y(class05428.N.N(class00869.MT, this.L));
        class03264 class032643 = class05404.y(this.N(class00869.MT, "_on", class05433.L, class05388::y));
        this.N.accept((class05399)class05427.N((class00891)class00869.MT).N(class05404.N(class06665.n, class032643, class032642)));
    }

    public final void Y(class00891 class008912) {
        class03264 class032642 = class05404.y(class05433.NP.N(class008912, class05388.L(class008912), this.L));
        this.N.accept((class05399)class05427.N((class00891)class008912, (class03264)class032642).N(d));
    }

    private void Y() {
        class03264 class032642 = class05404.y(class05387.N(class00869.ET, "_side"));
        class03674 class036742 = class05404.N(class05387.N(class00869.ET, "_noside"));
        class03674 class036743 = class05404.N(class05387.N(class00869.ET, "_noside1"));
        class03674 class036744 = class05404.N(class05387.N(class00869.ET, "_noside2"));
        class03674 class036745 = class05404.N(class05387.N(class00869.ET, "_noside3"));
        class03674 class036746 = class036742.N(R);
        class03674 class036747 = class036743.N(R);
        class03674 class036748 = class036744.N(R);
        class03674 class036749 = class036745.N(R);
        this.N.accept(class05394.N(class00869.ET).N(class05404.N().N((class08092)class06665.c, (Comparable)Boolean.valueOf(true)), class032642).N(class05404.N().N((class08092)class06665.X, (Comparable)Boolean.valueOf(true)), class032642.N(z).N(R)).N(class05404.N().N((class08092)class06665.a, (Comparable)Boolean.valueOf(true)), class032642.N(U).N(R)).N(class05404.N().N((class08092)class06665.p, (Comparable)Boolean.valueOf(true)), class032642.N(E).N(R)).N(class05404.N().N((class08092)class06665.e, (Comparable)Boolean.valueOf(true)), class032642.N(Z).N(R)).N(class05404.N().N((class08092)class06665.H, (Comparable)Boolean.valueOf(true)), class032642.N(M).N(R)).N(class05404.N().N((class08092)class06665.c, (Comparable)Boolean.valueOf(false)), new class03264(class04540.N((class04523[])new class04523[]{new class04523((Object)class036742, 2), new class04523((Object)class036743, 1), new class04523((Object)class036744, 1), new class04523((Object)class036745, 1)}))).N(class05404.N().N((class08092)class06665.X, (Comparable)Boolean.valueOf(false)), new class03264(class04540.N((class04523[])new class04523[]{new class04523((Object)class036747.N(z), 1), new class04523((Object)class036748.N(z), 1), new class04523((Object)class036749.N(z), 1), new class04523((Object)class036746.N(z), 2)}))).N(class05404.N().N((class08092)class06665.a, (Comparable)Boolean.valueOf(false)), new class03264(class04540.N((class04523[])new class04523[]{new class04523((Object)class036748.N(U), 1), new class04523((Object)class036749.N(U), 1), new class04523((Object)class036746.N(U), 2), new class04523((Object)class036747.N(U), 1)}))).N(class05404.N().N((class08092)class06665.p, (Comparable)Boolean.valueOf(false)), new class03264(class04540.N((class04523[])new class04523[]{new class04523((Object)class036749.N(E), 1), new class04523((Object)class036746.N(E), 2), new class04523((Object)class036747.N(E), 1), new class04523((Object)class036748.N(E), 1)}))).N(class05404.N().N((class08092)class06665.e, (Comparable)Boolean.valueOf(false)), new class03264(class04540.N((class04523[])new class04523[]{new class04523((Object)class036746.N(Z), 2), new class04523((Object)class036749.N(Z), 1), new class04523((Object)class036747.N(Z), 1), new class04523((Object)class036748.N(Z), 1)}))).N(class05404.N().N((class08092)class06665.H, (Comparable)Boolean.valueOf(false)), new class03264(class04540.N((class04523[])new class04523[]{new class04523((Object)class036749.N(M), 1), new class04523((Object)class036748.N(M), 1), new class04523((Object)class036747.N(M), 1), new class04523((Object)class036746.N(M), 2)}))));
    }

    private void NB() {
        this.y(class06570.Wg);
        this.N.accept((class05399)class05427.N((class00891)class00869.iH).N(class05415.N(class06665.Ng, class06665.t, class06665.k).N((n, bl, bl2) -> {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append('_').append(n).append("tick");
            if (bl2.booleanValue()) {
                stringBuilder.append("_on");
            }
            if (bl.booleanValue()) {
                stringBuilder.append("_locked");
            }
            return class05404.y(class05388.N(class00869.iH, stringBuilder.toString()));
        })).N(k));
    }

    private void NO() {
        this.N(class00869.zY, class00869.zF, class06563.field_7952);
        this.N(class00869.zQ, class00869.zA, class06563.field_7946);
        this.N(class00869.zO, class00869.zf, class06563.field_7958);
        this.N(class00869.zg, class00869.zC, class06563.field_7951);
        this.N(class00869.zI, class00869.zS, class06563.field_7947);
        this.N(class00869.zJ, class00869.zx, class06563.field_7961);
        this.N(class00869.zo, class00869.zD, class06563.field_7954);
        this.N(class00869.zq, class00869.zh, class06563.field_7944);
        this.N(class00869.zK, class00869.zr, class06563.field_7967);
        this.N(class00869.zV, class00869.UN, class06563.field_7955);
        this.N(class00869.ze, class00869.Uy, class06563.field_7945);
        this.N(class00869.zH, class00869.UL, class06563.field_7966);
        this.N(class00869.zc, class00869.Uu, class06563.field_7957);
        this.N(class00869.zX, class00869.Ui, class06563.field_7942);
        this.N(class00869.za, class00869.UR, class06563.field_7964);
        this.N(class00869.zp, class00869.UM, class06563.field_7963);
    }

    private void NL() {
        class01894 class018942 = class05433.LT.N(class00869.bS, class05388.N(false), this.L);
        class03264 class032642 = class05404.y(class018942);
        class03264 class032643 = class05404.y(class05433.LT.N(class00869.bS, "_can_summon", class05388.N(true), this.L));
        this.N(class00869.bS, class018942);
        this.N.accept((class05399)class05427.N((class00891)class00869.bS).N(class05404.N(class06665.i, class032643, class032642)));
    }

    private void NN() {
        class01894 class018942 = class05387.N(class00869.bp, "_inactive");
        class03264 class032642 = class05404.y(class018942);
        class03264 class032643 = class05404.y(class05387.N(class00869.bp, "_active"));
        this.N(class00869.bp, class018942);
        this.N.accept((class05399)class05427.N((class00891)class00869.bp).N(class05415.N(class06665.yv).N((T1 class011932) -> class011932 == class01193.field_28122 || class011932 == class01193.field_44631 ? class032643 : class032642)));
    }

    private void NM() {
        class05388 class053882 = class05388.Y(class00869.iW);
        class05388 class053883 = class05388.Z(class05388.N(class00869.iW, "_off"));
        class03264 class032642 = class05404.y(class05433.yg.N(class00869.iW, class053882, this.L));
        class03264 class032643 = class05404.y(class05433.yY.N(class00869.iW, "_off", class053883, this.L));
        this.N.accept((class05399)class05427.N((class00891)class00869.iW).N(class05404.N(class06665.n, class032642, class032643)));
        class03264 class032644 = class05404.y(class05433.yI.N(class00869.im, class053882, this.L));
        class03264 class032645 = class05404.y(class05433.yO.N(class00869.im, "_off", class053883, this.L));
        this.N.accept((class05399)class05427.N((class00891)class00869.im).N(class05404.N(class06665.n, class032644, class032645)).N(w));
        this.N(class00869.iW);
    }

    private void Nb() {
        class01894 class018942 = class05387.N(class00869.mu, "_hydration_0");
        this.N(class00869.mu, class018942);
        Function<Integer, class01894> function = n -> {
            String string = switch (n) {
                case 1 -> "_hydration_1";
                case 2 -> "_hydration_2";
                case 3 -> "_hydration_3";
                default -> "_hydration_0";
            };
            class05388 class053882 = class05388.y(string);
            return class05433.ye.N(class00869.mu, string, class053882, this.L);
        };
        this.N.accept((class05399)class05427.N((class00891)class00869.mu).N(class05415.N(class00009.L).N((T1 n) -> class05404.y((class01894)function.apply((Integer)n)))).N(Y));
    }

    private void NQ() {
        this.N(class00869.vk, class00869.bx, class02774.field_28704);
        this.N(class00869.vY, class00869.bD, class02774.field_28705);
        this.N(class00869.vQ, class00869.bh, class02774.field_28706);
        this.N(class00869.vO, class00869.br, class02774.field_28707);
        this.P(class00869.vk, class00869.vg);
        this.P(class00869.vY, class00869.vI);
        this.P(class00869.vQ, class00869.vJ);
        this.P(class00869.vO, class00869.vo);
    }

    private void NG() {
        class01894 class018942 = class05387.N(class00869.y);
        class03674 class036742 = class05404.N(class018942);
        class03674 class036743 = class05404.N(class05387.N(class00869.y, "_mirrored"));
        this.N.accept((class05399)class05427.N((class00891)class00869.Rv, (class03264)class05404.N(class036742, class036743)));
        this.N(class00869.Rv, class018942);
    }

    private void Nt() {
        class03264 class032642 = class05404.y(class05433.L.N(class00869.EI, class05388.y(class05387.N("magma")), this.L));
        this.N.accept((class05399)class05404.N(class00869.EI, class032642));
    }

    private void NE() {
        class01894 class018942 = class05428.N.N(class00869.sh, this.L);
        this.N(class00869.sh, class018942);
        this.N.accept((class05399)class05427.N((class00891)class00869.sh).N(class05415.N(class06665.yP).N((T1 class080702) -> class05404.y(this.N(class00869.sh, "_" + class080702.method_15434(), class05433.L, class05388::y)))));
    }

    private void Nv() {
        class01894 class018942 = class05388.N(class00869.bC, "_bottom");
        class05388 class053882 = new class05388().N(class05418.i, class018942).N(class05418.R, class05388.N(class00869.bC, "_top")).N(class05418.Z, class05388.N(class00869.bC, "_side"));
        class05388 class053883 = new class05388().N(class05418.i, class018942).N(class05418.R, class05388.N(class00869.bC, "_top_bloom")).N(class05418.Z, class05388.N(class00869.bC, "_side_bloom"));
        class01894 class018943 = class05433.m.N(class00869.bC, class053882, this.L);
        class03264 class032642 = class05404.y(class018943);
        class03264 class032643 = class05404.y(class05433.m.N(class00869.bC, "_bloom", class053883, this.L));
        this.N.accept((class05399)class05427.N((class00891)class00869.bC).N(class05415.N(class06665.L).N((T1 bl) -> bl != false ? class032643 : class032642)));
        this.N(class00869.bC, class018943);
    }

    private void Nk() {
        class00891 class008912 = class00869.m;
        class03264 class032642 = class05404.y(class05387.N(class008912));
        class05388 class053882 = class05388.N(class008912);
        class00891 class008913 = class00869.Uk;
        class03264 class032643 = class05404.y(class05433.Ny.N(class008913, class053882, this.L));
        class03264 class032644 = class05404.y(class05433.NL.N(class008913, class053882, this.L));
        this.N.accept(class05404.i(class008913, class032643, class032644, class032642));
    }

    private void Ns() {
        this.N(class00869.MG);
        this.N.accept((class05399)class05427.N((class00891)class00869.MG).N(class05415.N(class06665.N, class06665.k).N((T1 bl, T2 bl2) -> class05404.y(class05387.N(class00869.MG, (bl != false ? "_attached" : "") + (bl2 != false ? "_on" : ""))))).N(Y));
    }

    private void NU() {
        this.N.accept((class05399)class05427.N((class00891)class00869.Pr, (class03264)class05404.y(class05387.N(class00869.Pr))).N(Y));
    }

    private void NW() {
        HashMap<class00235, class01894> hashMap = new HashMap<class00235, class01894>();
        for (class00235 class002353 : class00235.values()) {
            hashMap.put(class002353, this.N(class00869.TN, "_" + class002353.method_15434(), class05433.L, class05388::y));
        }
        this.N.accept((class05399)class05427.N((class00891)class00869.TN).N(class05415.N(class06665.yo).N((T1 class002352) -> class05404.y((class01894)hashMap.get(class002352)))));
        this.y.N(class06570.sc, class08825.N((class08092)class08620.y, (class08895)class08825.N((class01894)((class01894)hashMap.get(class00235.field_56024))), Map.of(class00235.field_56026, class08825.N((class01894)((class01894)hashMap.get(class00235.field_56026))), class00235.field_56025, class08825.N((class01894)((class01894)hashMap.get(class00235.field_56025))), class00235.field_56027, class08825.N((class01894)((class01894)hashMap.get(class00235.field_56027))))));
    }

    private void Nn() {
        class00891 class008912 = class00869.LG;
        class03264 class032642 = class05404.y(class05387.N(class008912));
        class05394 class053942 = class05394.N(class008912);
        class05404.N((class07211 class072112, class08503 class085032) -> {
            class01975 class019752 = class05404.N().N((class08092)class06665.f, (Comparable)class072112).N();
            class053942.N(class019752, class032642.N(class085032).N(R));
            this.N(class053942, class019752, (class08503)class085032);
        });
        this.N.accept(class053942);
        this.N(class008912, class05387.N(class008912, "_inventory"));
        O.clear();
    }

    private void Nw() {
        class01894 class018942 = class05388.N(class00869.sr, "_top");
        class01894 class018943 = class05388.N(class00869.sr, "_bottom");
        class01894 class018944 = class05388.N(class00869.sr, "_side");
        class01894 class018945 = class05388.N(class00869.sr, "_lock");
        class05388 class053882 = new class05388().N(class05418.P, class018944).N(class05418.W, class018944).N(class05418.E, class018944).N(class05418.L, class018942).N(class05418.z, class018942).N(class05418.U, class018943).N(class05418.m, class018945);
        this.N.accept((class05399)class05427.N((class00891)class00869.sr, (class03264)class05404.y(class05433.y.N(class00869.sr, class053882, this.L))).N(class05415.y(class06665.x).N(class05404::N)));
    }

    private void Ny() {
        class01894 class018942 = class05387.N(class00869.bF, "_inactive");
        class03264 class032642 = class05404.y(class018942);
        class03264 class032643 = class05404.y(class05387.N(class00869.bF, "_active"));
        this.N(class00869.bF, class018942);
        this.N.accept((class05399)class05427.N((class00891)class00869.bF).N(class05415.N(class06665.yv).N((T1 class011932) -> class011932 == class01193.field_28122 || class011932 == class01193.field_44631 ? class032643 : class032642)).N(Y));
    }

    private void Nj() {
        this.y(class06570.Ez);
        this.N.accept((class05399)class05427.N((class00891)class00869.mL).N(class05415.N(class03561.L).N((T1 n) -> {
            String string = switch (n) {
                case 1 -> "_slightly_cracked";
                case 2 -> "_very_cracked";
                default -> "_not_cracked";
            };
            class05388 class053882 = class05388.N(string);
            return class05404.y(class05433.yx.N(class00869.mL, string, class053882, this.L));
        })));
    }

    private void Ng() {
        this.N(class00869.LA, class00869.m, class00344.y, true);
        this.N(class00869.BH, class00869.m, class00344.L, true);
        this.N(class00869.Mt, class00869.LV, class00344.u, false);
    }

    private void NJ() {
        this.y(class00869.yM, class00869.yV, class06563.field_7952);
        this.y(class00869.yB, class00869.ye, class06563.field_7946);
        this.y(class00869.yZ, class00869.yH, class06563.field_7958);
        this.y(class00869.yz, class00869.yc, class06563.field_7951);
        this.y(class00869.yU, class00869.yX, class06563.field_7947);
        this.y(class00869.yE, class00869.ya, class06563.field_7961);
        this.y(class00869.yW, class00869.yp, class06563.field_7954);
        this.y(class00869.ym, class00869.yF, class06563.field_7944);
        this.y(class00869.yP, class00869.yA, class06563.field_7967);
        this.y(class00869.ys, class00869.yf, class06563.field_7955);
        this.y(class00869.yT, class00869.yC, class06563.field_7945);
        this.y(class00869.yb, class00869.yS, class06563.field_7966);
        this.y(class00869.yj, class00869.yx, class06563.field_7957);
        this.y(class00869.yv, class00869.yD, class06563.field_7942);
        this.y(class00869.yn, class00869.yh, class06563.field_7964);
        this.y(class00869.yt, class00869.yr, class06563.field_7963);
    }

    private void NI() {
        this.N(class00869.vj, class00869.bx, class00344.i, false);
        this.N(class00869.vv, class00869.bD, class00344.R, false);
        this.N(class00869.vn, class00869.bh, class00344.M, false);
        this.N(class00869.vt, class00869.br, class00344.B, false);
        this.P(class00869.vj, class00869.vG);
        this.P(class00869.vv, class00869.vl);
        this.P(class00869.vn, class00869.vd);
        this.P(class00869.vt, class00869.vw);
    }
}

