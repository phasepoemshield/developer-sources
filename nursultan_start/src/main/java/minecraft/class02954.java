/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class01269
 *  minecraft.class01289
 *  minecraft.class01485
 *  minecraft.class01520
 *  minecraft.class02135
 *  minecraft.class02142
 *  minecraft.class04119
 *  minecraft.class04126
 *  minecraft.class04137
 *  minecraft.class05340
 *  minecraft.class05355
 *  minecraft.class05359
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05550
 *  minecraft.class05585
 *  minecraft.class05738
 *  minecraft.class05739
 *  minecraft.class05747
 *  minecraft.class05770
 *  minecraft.class05771
 *  minecraft.class05781
 *  minecraft.class05782
 *  minecraft.class06069
 *  minecraft.class07078
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class01269;
import minecraft.class01289;
import minecraft.class01485;
import minecraft.class01520;
import minecraft.class02135;
import minecraft.class02142;
import minecraft.class02956;
import minecraft.class02976;
import minecraft.class02978;
import minecraft.class02979;
import minecraft.class04119;
import minecraft.class04126;
import minecraft.class04137;
import minecraft.class05340;
import minecraft.class05355;
import minecraft.class05359;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05550;
import minecraft.class05585;
import minecraft.class05738;
import minecraft.class05739;
import minecraft.class05747;
import minecraft.class05770;
import minecraft.class05771;
import minecraft.class05781;
import minecraft.class05782;
import minecraft.class06069;
import minecraft.class07078;

public class class02954 {
    private static final float N = 4.0f;
    private static final float y = 2.0f;
    private static final float L = 2.5f;
    private static final float u = 2.5f;
    private static final float i = 1.0f;
    private static final class02135 R = class02135.y((int)5, (int)16);
    private static final ImmutableList<class05340<? extends class05355<? super class02976>>> M = ImmutableList.of((Object)class05340.L, (Object)class05340.R, (Object)class05340.b, (Object)class05340.P);
    private static final ImmutableList<class05378<?>> B = ImmutableList.of((Object)class05378.NN, (Object)class05378.d, (Object)class05378.w, (Object)class05378.m, (Object)class05378.P, (Object)class05378.I, (Object)class05378.n, (Object)class05378.B, (Object)class05378.a, (Object)class05378.p, (Object)class05378.F, (Object)class05378.A, (Object[])new class05378[]{class05378.j, class05378.e});

    private static void L(class01289<class02976> class012892) {
        class012892.N(class05359.y, ImmutableList.of((Object)Pair.of((Object)0, (Object)class04126.N((class07078)class07078.Ly, (float)6.0f, (class02135)class02135.y((int)30, (int)60))), (Object)Pair.of((Object)1, (Object)new class01485(class07078.t)), (Object)Pair.of((Object)2, (Object)new class05747((List)ImmutableList.of((Object)Pair.of((Object)new class05585(class074382 -> Float.valueOf(2.5f), class074382 -> class074382.method_6109() ? 2.5 : 3.5), (Object)1), (Object)Pair.of((Object)class04137.N_44(Predicate.not(class02976::Nh), (class04119)class01269.N((class02135)R, (float)2.5f)), (Object)1)))), (Object)Pair.of((Object)3, (Object)((Object)new class02978((class02142)class02135.y((int)150, (int)250), 30.0f, 0.0f, 0.0f))), (Object)Pair.of((Object)4, (Object)new class05747((Map)ImmutableMap.of((Object)class05378.m, (Object)class05367.field_18457), (List)ImmutableList.of((Object)Pair.of((Object)class04137.N_44(Predicate.not(class02976::Nh), (class04119)class01520.N((float)2.0f)), (Object)1), (Object)Pair.of((Object)class04137.N_44(Predicate.not(class02976::Nh), (class04119)class05771.N((float)2.0f, (int)3)), (Object)1), (Object)Pair.of((Object)((Object)new class02956(20)), (Object)1), (Object)Pair.of((Object)new class05782(30, 60), (Object)1))))));
    }

    private static void y(class01289<class02976> class012892) {
        class012892.N(class05359.N, 0, ImmutableList.of((Object)new class05739(0.8f), (Object)((Object)new class02979(4.0f)), (Object)new class05770(45, 90), (Object)new class05738(), (Object)new class05550(class05378.p), (Object)new class05550(class05378.F)));
    }

    public static class05781<class02976> N() {
        return class01289.N(B, M);
    }

    public static void N(class02976 class029762) {
        class029762.method_18868().N((List)ImmutableList.of((Object)class05359.y));
    }

    public static void N(class02976 class029762, class06069 class060692) {
    }

    public static class01289<?> N(class01289<class02976> class012892) {
        class02954.y(class012892);
        class02954.L(class012892);
        class012892.N((Set)ImmutableSet.of((Object)class05359.N));
        class012892.y(class05359.y);
        class012892.i();
        return class012892;
    }
}

