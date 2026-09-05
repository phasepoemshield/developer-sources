/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class01289
 *  minecraft.class01507
 *  minecraft.class01520
 *  minecraft.class04909
 *  minecraft.class05340
 *  minecraft.class05355
 *  minecraft.class05359
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05550
 *  minecraft.class05585
 *  minecraft.class05736
 *  minecraft.class05738
 *  minecraft.class05753
 *  minecraft.class05769
 *  minecraft.class05770
 *  minecraft.class05771
 *  minecraft.class05781
 *  minecraft.class08185
 *  minecraft.class08187
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import minecraft.class01289;
import minecraft.class01507;
import minecraft.class01520;
import minecraft.class04909;
import minecraft.class05340;
import minecraft.class05355;
import minecraft.class05359;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05550;
import minecraft.class05585;
import minecraft.class05736;
import minecraft.class05738;
import minecraft.class05753;
import minecraft.class05769;
import minecraft.class05770;
import minecraft.class05771;
import minecraft.class05781;
import minecraft.class08163;
import minecraft.class08185;
import minecraft.class08187;

public class class08167 {
    private static final float L = 1.0f;
    private static final float u = 0.9f;
    private static final float i = 0.5f;
    private static final float R = 2.0f;
    private static final int M = 80;
    private static final double B = 12.0;
    private static final double Z = 11.0;
    protected static final ImmutableList<class05340<? extends class05355<? super class08187>>> N = ImmutableList.of((Object)class05340.L, (Object)class05340.P, (Object)class05340.u, (Object)class05340.R, (Object)class05340.v);
    protected static final ImmutableList<class05378<?>> y = ImmutableList.of((Object)class05378.P, (Object)class05378.B, (Object)class05378.m, (Object)class05378.I, (Object)class05378.n, (Object)class05378.e, (Object)class05378.p, (Object)class05378.A, (Object)class05378.a, (Object)class05378.j, (Object)class05378.NN, (Object)class05378.s, (Object[])new class05378[]{class05378.NR, class05378.d, class05378.NW, class05378.NM});

    private static void L(class01289<class08187> class012892) {
        class012892.N(class05359.y, ImmutableList.of((Object)Pair.of((Object)1, (Object)new class05585(class074382 -> Float.valueOf(0.9f), class074382 -> class074382.method_6109() ? 2.5 : 3.5)), (Object)Pair.of((Object)2, (Object)class01507.N(class08185::N)), (Object)Pair.of((Object)3, (Object)new class05736((Map)ImmutableMap.of((Object)class05378.m, (Object)class05367.field_18457), (Set)ImmutableSet.of(), class05753.field_18348, class05769.field_18856, (List)ImmutableList.of((Object)Pair.of((Object)class01520.L((float)1.0f), (Object)2), (Object)Pair.of((Object)class05771.N((float)1.0f, (int)3), (Object)3))))));
    }

    private static void u(class01289<class08187> class012892) {
        class012892.N(class05359.U, ImmutableList.of((Object)Pair.of((Object)0, (Object)((Object)new class08163(80, class08185.N, 0.5f, 2.0f, 12.0, 11.0, class04909.JD)))), (Set)ImmutableSet.of((Object)Pair.of((Object)class05378.s, (Object)class05367.field_18456), (Object)Pair.of((Object)class05378.a, (Object)class05367.field_18457), (Object)Pair.of((Object)class05378.j, (Object)class05367.field_18457), (Object)Pair.of((Object)class05378.NR, (Object)class05367.field_18457)));
    }

    private static void y(class01289<class08187> class012892) {
        class012892.N(class05359.N, 0, ImmutableList.of((Object)new class05770(45, 90), (Object)new class05738(), (Object)new class05550(class05378.p), (Object)new class05550(class05378.NR), (Object)new class05550(class05378.NM)));
    }

    public static void N(class08187 class081872) {
        class081872.method_18868().N((List)ImmutableList.of((Object)class05359.U, (Object)class05359.y));
    }

    public static class01289<?> N(class01289<class08187> class012892) {
        class08167.y(class012892);
        class08167.L(class012892);
        class08167.u(class012892);
        class012892.N((Set)ImmutableSet.of((Object)class05359.N));
        class012892.y(class05359.y);
        class012892.i();
        return class012892;
    }

    public static class05781<class08187> N() {
        return class01289.N(y, N);
    }
}

