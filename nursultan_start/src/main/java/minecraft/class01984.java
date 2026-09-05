/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  minecraft.class01289
 *  minecraft.class01520
 *  minecraft.class01943
 *  minecraft.class05340
 *  minecraft.class05355
 *  minecraft.class05359
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05550
 *  minecraft.class05738
 *  minecraft.class05739
 *  minecraft.class05745
 *  minecraft.class05747
 *  minecraft.class05770
 *  minecraft.class05771
 *  minecraft.class05782
 *  minecraft.class07078
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import minecraft.class01289;
import minecraft.class01520;
import minecraft.class01943;
import minecraft.class01953;
import minecraft.class01961;
import minecraft.class01964;
import minecraft.class01966;
import minecraft.class01972;
import minecraft.class01973;
import minecraft.class01974;
import minecraft.class01976;
import minecraft.class01982;
import minecraft.class01985;
import minecraft.class05340;
import minecraft.class05355;
import minecraft.class05359;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05550;
import minecraft.class05738;
import minecraft.class05739;
import minecraft.class05745;
import minecraft.class05747;
import minecraft.class05770;
import minecraft.class05771;
import minecraft.class05782;
import minecraft.class07078;
import org.slf4j.Logger;

public class class01984 {
    private static final Logger L = LogUtils.getLogger();
    private static final int u = 6;
    static final List<class05340<? extends class05355<? super class01964>>> N = ImmutableList.of((Object)class05340.L, (Object)class05340.R, (Object)class05340.u, (Object)class05340.b);
    static final List<class05378<?>> y = ImmutableList.of((Object)class05378.P, (Object)class05378.m, (Object)class05378.I, (Object)class05378.n, (Object)class05378.NN, (Object)class05378.yL, (Object)class05378.yu, (Object)class05378.yi, (Object)class05378.NF, (Object)class05378.yy, (Object)class05378.B, (Object)class05378.j, (Object[])new class05378[]{class05378.a, class05378.p, class05378.A});
    private static final int i = 9600;
    private static final float R = 1.0f;
    private static final float M = 2.0f;
    private static final float B = 1.25f;
    private static final float Z = 1.25f;

    private static void L(class01289<class01964> class012892) {
        class012892.N(class05359.t, ImmutableList.of((Object)Pair.of((Object)0, (Object)((Object)new class01961()))), Set.of(Pair.of((Object)class05378.NN, (Object)class05367.field_18457), Pair.of((Object)class05378.yL, (Object)class05367.field_18456), Pair.of((Object)class05378.m, (Object)class05367.field_18456)));
    }

    private static void i(class01289<class01964> class012892) {
        class012892.N(class05359.y, ImmutableList.of((Object)Pair.of((Object)0, (Object)((Object)new class01982(class07078.yb))), (Object)Pair.of((Object)1, (Object)new class01943(class074382 -> Float.valueOf(1.25f), class074382 -> class074382.method_6109() ? 2.5 : 3.5)), (Object)Pair.of((Object)2, (Object)new class05770(45, 90)), (Object)Pair.of((Object)3, (Object)((Object)new class01966(40, 100))), (Object)Pair.of((Object)4, (Object)new class05747((List)ImmutableList.of((Object)Pair.of((Object)class05771.N((float)1.0f, (int)3), (Object)2), (Object)Pair.of((Object)((Object)new class01973(40, 80)), (Object)1), (Object)Pair.of((Object)((Object)new class01953(40, 80)), (Object)1), (Object)Pair.of((Object)class05745.N((class07078)class07078.Ly, (float)6.0f), (Object)1), (Object)Pair.of((Object)class01520.N((float)1.0f), (Object)1), (Object)Pair.of((Object)new class05782(5, 20), (Object)2))))), Set.of(Pair.of((Object)class05378.yu, (Object)class05367.field_18457)));
    }

    private static void u(class01289<class01964> class012892) {
        class012892.N(class05359.w, ImmutableList.of((Object)Pair.of((Object)0, (Object)((Object)new class01974(160, 180))), (Object)Pair.of((Object)0, (Object)((Object)new class01985(40)))), Set.of(Pair.of((Object)class05378.NN, (Object)class05367.field_18457), Pair.of((Object)class05378.m, (Object)class05367.field_18457), Pair.of((Object)class05378.yu, (Object)class05367.field_18456)));
    }

    static void y(class01964 class019642) {
        class019642.method_18868().N((List)ImmutableList.of((Object)class05359.w, (Object)class05359.t, (Object)class05359.y));
    }

    private static void y(class01289<class01964> class012892) {
        class012892.N(class05359.N, 0, ImmutableList.of((Object)new class05739(0.8f), (Object)((Object)new class01976(2.0f)), (Object)new class05738(500, 700), (Object)new class05550(class05378.p)));
    }

    public static class01289<?> N(class01289<class01964> class012892) {
        class01984.y(class012892);
        class01984.i(class012892);
        class01984.L(class012892);
        class01984.u(class012892);
        class012892.N(Set.of(class05359.N));
        class012892.y(class05359.y);
        class012892.i();
        return class012892;
    }

    static class01964 N(class01964 class019642) {
        class019642.method_18868().y(class05378.yu);
        class019642.method_18868().y(class05378.yL);
        return class019642.N(class01972.field_42665);
    }
}

