/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  minecraft.class01289
 *  minecraft.class01520
 *  minecraft.class01523
 *  minecraft.class01528
 *  minecraft.class01530
 *  minecraft.class01531
 *  minecraft.class03616
 *  minecraft.class03957
 *  minecraft.class03974
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05340
 *  minecraft.class05355
 *  minecraft.class05359
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05738
 *  minecraft.class05739
 *  minecraft.class05744
 *  minecraft.class05745
 *  minecraft.class05747
 *  minecraft.class05770
 *  minecraft.class05782
 *  minecraft.class06244
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07438
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Map;
import java.util.Set;
import minecraft.class01289;
import minecraft.class01520;
import minecraft.class01523;
import minecraft.class01528;
import minecraft.class01530;
import minecraft.class01531;
import minecraft.class03616;
import minecraft.class03957;
import minecraft.class03974;
import minecraft.class03990;
import minecraft.class03993;
import minecraft.class04003;
import minecraft.class04004;
import minecraft.class04005;
import minecraft.class04010;
import minecraft.class04012;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05340;
import minecraft.class05355;
import minecraft.class05359;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05738;
import minecraft.class05739;
import minecraft.class05744;
import minecraft.class05745;
import minecraft.class05747;
import minecraft.class05770;
import minecraft.class05782;
import minecraft.class06244;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07438;

public class class03984 {
    private static final float u = 0.5f;
    private static final float i = 0.7f;
    private static final float R = 1.2f;
    private static final int M = 18;
    private static final int B = class04995.u((float)100.0f);
    public static final int N = class04995.u((float)133.59999f);
    public static final int y = class04995.u((float)84.0f);
    private static final int Z = class04995.u((float)83.2f);
    public static final int L = 1200;
    private static final int z = 100;
    private static final List<class05340<? extends class05355<? super class04003>>> U = List.of(class05340.u, class05340.G);
    private static final List<class05378<?>> E = List.of(class05378.M, class05378.B, class05378.U, class05378.E, class05378.c, class05378.P, class05378.m, class05378.I, class05378.n, class05378.s, class05378.T, class05378.Q, class05378.NK, class05378.NV, class05378.Ne, class05378.NH, class05378.Nc, class05378.NX, class05378.Na, class05378.Np, class05378.NF, class05378.NA, class05378.Nf, class05378.NC, class05378.NS, class05378.Nx);
    private static final class04142<class04003> W = class04137.N_42(class041282 -> class041282.group((App)class041282.N(class05378.Na)).apply((Applicative)class041282, class041392 -> (class047822, class040032, l) -> {
        if (class041282.N(class041392).isPresent()) {
            class041392.N((Object)class06244.field_17274, 1200L);
        }
        return true;
    }));

    private static void L(class01289<class04003> class012892) {
        class012892.N(class05359.w, ImmutableList.of((Object)Pair.of((Object)0, (Object)new class03957()), (Object)Pair.of((Object)1, new class03993(B))), (Set)ImmutableSet.of((Object)Pair.of((Object)class05378.NK, (Object)class05367.field_18457), (Object)Pair.of((Object)class05378.Na, (Object)class05367.field_18457)));
    }

    private static void M(class01289<class04003> class012892) {
        class012892.N(class05359.l, 10, ImmutableList.of((Object)((Object)new class04012())), class05378.NK);
    }

    private static void i(class01289<class04003> class012892) {
        class012892.N(class05359.G, 5, ImmutableList.of(class04005.N(class04003::m), (Object)class01530.N((class05378)class05378.NV, (int)2, (float)0.7f)), class05378.NV);
    }

    private static void u(class01289<class04003> class012892) {
        class012892.N(class05359.y, 10, ImmutableList.of(class04005.N(class04003::m), (Object)class03974.N(), (Object)new class05747((Map)ImmutableMap.of((Object)class05378.NH, (Object)class05367.field_18457), (List)ImmutableList.of((Object)Pair.of((Object)class01520.N((float)0.5f), (Object)2), (Object)Pair.of((Object)new class05782(30, 60), (Object)1)))));
    }

    private static void y(class01289<class04003> class012892) {
        class012892.N(class05359.d, 5, ImmutableList.of(new class03990(N)), class05378.Nc);
    }

    public static void N(class04003 class040032, class07209 class072092) {
        if (!class040032.method_73183().method_8621().N(class072092) || class040032.m().isPresent() || class040032.method_18868().L(class05378.s).isPresent()) {
            return;
        }
        class03984.N((class07438)class040032);
        class040032.method_18868().N(class05378.NF, (Object)class06244.field_17274, 100L);
        class040032.method_18868().N(class05378.P, (Object)new class05744(class072092), 100L);
        class040032.method_18868().N(class05378.NV, (Object)class072092, 100L);
        class040032.method_18868().y(class05378.m);
    }

    private static boolean N(class04003 class040032, class07438 class074382) {
        return class040032.method_18868().L(class05378.s).filter(class074383 -> class074383 == class074382).isPresent();
    }

    private static void N(class01289<class04003> class012892) {
        class012892.N(class05359.N, 0, ImmutableList.of((Object)new class05739(0.8f), class04010.N(), (Object)new class05770(45, 90), (Object)new class05738()));
    }

    public static class01289<?> N(class04003 class040032, Dynamic<?> dynamic) {
        class01289 class012892 = class01289.N(E, U).N(dynamic);
        class03984.N((class01289<class04003>)class012892);
        class03984.y((class01289<class04003>)class012892);
        class03984.L((class01289<class04003>)class012892);
        class03984.u((class01289<class04003>)class012892);
        class03984.M((class01289<class04003>)class012892);
        class03984.N(class040032, (class01289<class04003>)class012892);
        class03984.i((class01289<class04003>)class012892);
        class03984.R((class01289<class04003>)class012892);
        class012892.N((Set)ImmutableSet.of((Object)class05359.N));
        class012892.y(class05359.y);
        class012892.i();
        return class012892;
    }

    private static void N(class04003 class040032, class01289<class04003> class012892) {
        class012892.N(class05359.U, 10, ImmutableList.of(W, (Object)class01523.N((class047822, class074382) -> !class040032.W().u() || !class040032.L((class07049)class074382), class03984::N, (boolean)false), (Object)class05745.N((T class074382) -> class03984.N(class040032, class074382), (float)((float)class040032.method_45325(class05298.P))), (Object)class01531.N((float)1.2f), (Object)new class03616(), (Object)class01528.N((int)18)), class05378.s);
    }

    public static void N(class07438 class074382) {
        if (class074382.method_18868().N(class05378.Na)) {
            class074382.method_18868().N(class05378.Na, (Object)class06244.field_17274, 1200L);
        }
    }

    private static void N(class04782 class047822, class04003 class040032, class07438 class074382) {
        if (!class040032.L((class07049)class074382)) {
            class040032.u((class07049)class074382);
        }
        class03984.N((class07438)class040032);
    }

    public static void N(class04003 class040032) {
        class040032.method_18868().N((List)ImmutableList.of((Object)class05359.d, (Object)class05359.w, (Object)class05359.l, (Object)class05359.U, (Object)class05359.G, (Object)class05359.t, (Object)class05359.y));
    }

    private static void R(class01289<class04003> class012892) {
        class012892.N(class05359.t, 5, ImmutableList.of(class04005.N(class04003::m), new class04004(Z)), class05378.NH);
    }
}

