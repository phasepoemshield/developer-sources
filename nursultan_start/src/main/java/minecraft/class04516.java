/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class01289
 *  minecraft.class01507
 *  minecraft.class01520
 *  minecraft.class01523
 *  minecraft.class03818
 *  minecraft.class05340
 *  minecraft.class05355
 *  minecraft.class05359
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05739
 *  minecraft.class05747
 *  minecraft.class05770
 *  minecraft.class05782
 *  minecraft.class07438
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;
import minecraft.class01289;
import minecraft.class01507;
import minecraft.class01520;
import minecraft.class01523;
import minecraft.class03818;
import minecraft.class04484;
import minecraft.class04503;
import minecraft.class04508;
import minecraft.class04509;
import minecraft.class04518;
import minecraft.class05340;
import minecraft.class05355;
import minecraft.class05359;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05739;
import minecraft.class05747;
import minecraft.class05770;
import minecraft.class05782;
import minecraft.class07438;

public class class04516 {
    public static final float N = 0.6f;
    public static final float y = 4.0f;
    public static final float L = 8.0f;
    public static final float u = 24.0f;
    static final List<class05340<? extends class05355<? super class04508>>> i = ImmutableList.of((Object)class05340.L, (Object)class05340.R, (Object)class05340.u, (Object)class05340.l);
    static final List<class05378<?>> R = ImmutableList.of((Object)class05378.P, (Object)class05378.B, (Object)class05378.Q, (Object)class05378.I, (Object)class05378.s, (Object)class05378.m, (Object)class05378.yR, (Object)class05378.yU, (Object)class05378.yM, (Object)class05378.yB, (Object)class05378.yZ, (Object)class05378.yz, (Object[])new class05378[]{class05378.yE, class05378.yW, class05378.d, class05378.w, class05378.n});
    private static final int M = 100;

    private static void y(class01289<class04508> class012892) {
        class012892.N(class05359.y, ImmutableList.of((Object)Pair.of((Object)0, (Object)class01507.N((class047822, class045082) -> class045082.method_18868().L(class05378.Q))), (Object)Pair.of((Object)1, (Object)class01507.N((class047822, class045082) -> class045082.m())), (Object)Pair.of((Object)2, (Object)((Object)new class04484(20, 40))), (Object)Pair.of((Object)3, (Object)new class05747((List)ImmutableList.of((Object)Pair.of((Object)new class05782(20, 100), (Object)1), (Object)Pair.of((Object)class01520.N((float)0.6f), (Object)2))))));
    }

    private static void y(class04508 class045082, class01289<class04508> class012892) {
        class012892.N(class05359.U, ImmutableList.of((Object)Pair.of((Object)0, (Object)class01523.N(class05355.N((class07438)class045082, (int)100).negate()::test)), (Object)Pair.of((Object)1, (Object)((Object)new class04503())), (Object)Pair.of((Object)2, (Object)((Object)new class04509())), (Object)Pair.of((Object)3, (Object)new class03818()), (Object)Pair.of((Object)4, (Object)((Object)new class04518()))), (Set)ImmutableSet.of((Object)Pair.of((Object)class05378.s, (Object)class05367.field_18456), (Object)Pair.of((Object)class05378.m, (Object)class05367.field_18457)));
    }

    private static void N(class01289<class04508> class012892) {
        class012892.N(class05359.N, 0, ImmutableList.of((Object)new class05739(0.8f), (Object)new class05770(45, 90)));
    }

    static void N(class04508 class045082) {
        class045082.method_18868().N((List)ImmutableList.of((Object)class05359.U, (Object)class05359.y));
    }

    public static class01289<?> N(class04508 class045082, class01289<class04508> class012892) {
        class04516.N(class012892);
        class04516.y(class012892);
        class04516.y(class045082, class012892);
        class012892.N(Set.of(class05359.N));
        class012892.y(class05359.U);
        class012892.i();
        return class012892;
    }
}

