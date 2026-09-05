/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00032
 *  minecraft.class01269
 *  minecraft.class01289
 *  minecraft.class01520
 *  minecraft.class02135
 *  minecraft.class02140
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
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;
import minecraft.class00032;
import minecraft.class01269;
import minecraft.class01289;
import minecraft.class01520;
import minecraft.class02135;
import minecraft.class02140;
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

public class class00008 {
    private static final float N = 1.0f;
    private static final float y = 1.25f;
    private static final float L = 1.1f;
    private static final double u = 3.0;
    private static final class02135 i = class02135.y((int)3, (int)16);
    private static final ImmutableList<class05340<? extends class05355<? super class00032>>> R = ImmutableList.of((Object)class05340.L, (Object)class05340.R, (Object)class05340.b, (Object)class05340.s, (Object)class05340.u);
    private static final ImmutableList<class05378<?>> M = ImmutableList.of((Object)class05378.m, (Object)class05378.P, (Object)class05378.I, (Object)class05378.n, (Object)class05378.B, (Object)class05378.a, (Object)class05378.p, (Object)class05378.A, (Object)class05378.j, (Object)class05378.NN, (Object)class05378.d, (Object)class05378.e, (Object[])new class05378[]{class05378.z, class05378.U, class05378.E, class05378.W});

    private static void L(class01289<class00032> class012892) {
        class012892.N(class05359.y, ImmutableList.of((Object)Pair.of((Object)1, (Object)new class05585(class074382 -> Float.valueOf(1.25f), class074382 -> 3.0, true)), (Object)Pair.of((Object)2, (Object)class01269.N((class02135)i, class074382 -> Float.valueOf(1.1f), (class05378)class05378.U, (boolean)true)), (Object)Pair.of((Object)3, (Object)class01269.N((class02135)i, class074382 -> Float.valueOf(1.1f), (class05378)class05378.e, (boolean)true)), (Object)Pair.of((Object)4, (Object)new class05747((List)ImmutableList.of((Object)Pair.of((Object)class01520.y((float)1.0f), (Object)1), (Object)Pair.of((Object)class05771.N((float)1.0f, (int)3), (Object)1))))));
    }

    private static void u(class01289<class00032> class012892) {
        class012892.N(class05359.M, ImmutableList.of(), Set.of(Pair.of((Object)class05378.NN, (Object)class05367.field_18456)));
    }

    private static void y(class01289<class00032> class012892) {
        class012892.N(class05359.N, 0, ImmutableList.of((Object)new class05739(0.8f), (Object)new class02140(2.0f, 0), (Object)new class05770(45, 90), (Object)new class05738(), (Object)new class05550(class05378.p)));
    }

    public static void N(class00032 class000322) {
        class000322.method_18868().N((List)ImmutableList.of((Object)class05359.M, (Object)class05359.y));
    }

    public static class05781<class00032> N() {
        return class01289.N(M, R);
    }

    public static class01289<?> N(class01289<class00032> class012892) {
        class00008.y(class012892);
        class00008.L(class012892);
        class00008.u(class012892);
        class012892.N(Set.of(class05359.N));
        class012892.y(class05359.y);
        class012892.i();
        return class012892;
    }
}

