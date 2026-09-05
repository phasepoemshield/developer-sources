/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class01269
 *  minecraft.class01289
 *  minecraft.class01485
 *  minecraft.class01520
 *  minecraft.class02135
 *  minecraft.class02142
 *  minecraft.class02978
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
 *  minecraft.class05739
 *  minecraft.class05747
 *  minecraft.class05770
 *  minecraft.class05771
 *  minecraft.class05781
 *  minecraft.class05782
 *  minecraft.class07078
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import minecraft.class01269;
import minecraft.class01289;
import minecraft.class01485;
import minecraft.class01520;
import minecraft.class02135;
import minecraft.class02142;
import minecraft.class02978;
import minecraft.class03801;
import minecraft.class03803;
import minecraft.class03811;
import minecraft.class03830;
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
import minecraft.class05739;
import minecraft.class05747;
import minecraft.class05770;
import minecraft.class05771;
import minecraft.class05781;
import minecraft.class05782;
import minecraft.class07078;

public class class03806 {
    private static final float N = 2.0f;
    private static final float y = 1.0f;
    private static final float L = 1.25f;
    private static final float u = 1.25f;
    private static final float i = 1.0f;
    private static final double R = 2.0;
    private static final double M = 1.0;
    private static final class02135 B = class02135.y((int)5, (int)16);
    private static final ImmutableList<class05340<? extends class05355<? super class03811>>> Z = ImmutableList.of((Object)class05340.L, (Object)class05340.R, (Object)class05340.b, (Object)class05340.P, (Object)class05340.U);
    private static final ImmutableList<class05378<?>> z = ImmutableList.of((Object)class05378.NN, (Object)class05378.d, (Object)class05378.w, (Object)class05378.m, (Object)class05378.P, (Object)class05378.I, (Object)class05378.n, (Object)class05378.B, (Object)class05378.a, (Object)class05378.p, (Object)class05378.F, (Object)class05378.A, (Object[])new class05378[]{class05378.j, class05378.e, class05378.o});
    private static final class04119<class03811> U = class04137.N_42(class041282 -> class041282.group((App)class041282.L(class05378.o)).apply((Applicative)class041282, class041392 -> (class047822, class038112, l) -> {
        if (class038112.W()) {
            class038112.G();
            return true;
        }
        return false;
    }));

    private static void L(class01289<class03811> class012892) {
        class012892.N(class05359.y, ImmutableList.of((Object)Pair.of((Object)0, (Object)class04126.N((class07078)class07078.Ly, (float)6.0f, (class02135)class02135.y((int)30, (int)60))), (Object)Pair.of((Object)1, (Object)new class01485(class07078.M, 1.0f, 1)), (Object)Pair.of((Object)2, (Object)new class05747((List)ImmutableList.of((Object)Pair.of((Object)new class05585(class074382 -> Float.valueOf(1.25f), class074382 -> class074382.method_6109() ? 1.0 : 2.0), (Object)1), (Object)Pair.of((Object)class01269.N((class02135)B, (float)1.25f), (Object)1)))), (Object)Pair.of((Object)3, (Object)new class02978((class02142)class02135.y((int)150, (int)250), 30.0f, 0.0f, 0.0f)), (Object)Pair.of((Object)4, (Object)new class05747((Map)ImmutableMap.of((Object)class05378.m, (Object)class05367.field_18457), (List)ImmutableList.of((Object)Pair.of((Object)class01520.N((float)1.0f), (Object)1), (Object)Pair.of((Object)class05771.N((float)1.0f, (int)3), (Object)1), (Object)Pair.of((Object)new class05782(30, 60), (Object)1))))));
    }

    private static void u(class01289<class03811> class012892) {
        class012892.N(class05359.M, ImmutableList.of((Object)Pair.of((Object)0, (Object)((Object)new class03830()))), Set.of(Pair.of((Object)class05378.o, (Object)class05367.field_18456), Pair.of((Object)class05378.NN, (Object)class05367.field_18457)));
    }

    private static void y(class01289<class03811> class012892) {
        class012892.N(class05359.N, 0, ImmutableList.of((Object)new class05739(0.8f), (Object)((Object)new class03803(2.0f)), (Object)new class05770(45, 90), (Object)((Object)new class03801()), (Object)new class05550(class05378.p), (Object)new class05550(class05378.F), U));
    }

    public static void N(class03811 class038112) {
        class038112.method_18868().N((List)ImmutableList.of((Object)class05359.M, (Object)class05359.y));
    }

    public static class05781<class03811> N() {
        return class01289.N(z, Z);
    }

    public static class01289<?> N(class01289<class03811> class012892) {
        class03806.y(class012892);
        class03806.L(class012892);
        class03806.u(class012892);
        class012892.N(Set.of(class05359.N));
        class012892.y(class05359.y);
        class012892.i();
        return class012892;
    }
}

