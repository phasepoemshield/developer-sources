/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class01217
 *  minecraft.class01226
 *  minecraft.class01289
 *  minecraft.class01328
 *  minecraft.class01485
 *  minecraft.class01507
 *  minecraft.class01520
 *  minecraft.class02135
 *  minecraft.class02140
 *  minecraft.class04051
 *  minecraft.class04782
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
 *  minecraft.class06069
 *  minecraft.class06293
 *  minecraft.class06584
 *  minecraft.class07078
 *  minecraft.class07305
 *  minecraft.class07438
 *  minecraft.class08156
 *  minecraft.class08157
 *  minecraft.class08163
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class01217;
import minecraft.class01226;
import minecraft.class01289;
import minecraft.class01328;
import minecraft.class01485;
import minecraft.class01507;
import minecraft.class01520;
import minecraft.class02135;
import minecraft.class02140;
import minecraft.class04051;
import minecraft.class04782;
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
import minecraft.class06069;
import minecraft.class06293;
import minecraft.class06584;
import minecraft.class07078;
import minecraft.class07305;
import minecraft.class07438;
import minecraft.class08156;
import minecraft.class08157;
import minecraft.class08163;

public class class08185 {
    private static final float u = 1.0f;
    private static final float i = 1.3f;
    private static final float R = 0.4f;
    private static final float M = 1.6f;
    private static final class02135 B = class02135.y((int)2400, (int)3600);
    private static final float Z = 0.6f;
    private static final float z = 2.0f;
    private static final int U = 400;
    private static final int E = 80;
    private static final double W = 12.0;
    private static final double m = 11.0;
    protected static final class01328 N = class01328.N().N((class074382, class047822) -> ((Boolean)class047822.method_64395().N(class07305.I) != false || !class074382.method_5864().equals(class07078.B)) && class047822.method_8621().N(class074382.method_5829()));
    protected static final ImmutableList<class05340<? extends class05355<? super class08157>>> y = ImmutableList.of((Object)class05340.L, (Object)class05340.P, (Object)class05340.u, (Object)class05340.R, (Object)class05340.v);
    protected static final ImmutableList<class05378<?>> L = ImmutableList.of((Object)class05378.P, (Object)class05378.B, (Object)class05378.m, (Object)class05378.I, (Object)class05378.n, (Object)class05378.e, (Object)class05378.p, (Object)class05378.A, (Object)class05378.a, (Object)class05378.j, (Object)class05378.NN, (Object)class05378.s, (Object[])new class05378[]{class05378.NR, class05378.d, class05378.NW, class05378.NM});

    private static void L(class01289<class08157> class012892) {
        class012892.N(class05359.y, ImmutableList.of((Object)Pair.of((Object)1, (Object)new class01485(class07078.NH, 0.4f, 2)), (Object)Pair.of((Object)2, (Object)new class05585(class074382 -> Float.valueOf(1.3f), class074382 -> class074382.method_6109() ? 2.5 : 3.5)), (Object)Pair.of((Object)3, (Object)class01507.N(class08185::N)), (Object)Pair.of((Object)4, (Object)new class05736((Map)ImmutableMap.of((Object)class05378.m, (Object)class05367.field_18457), (Set)ImmutableSet.of(), class05753.field_18348, class05769.field_18856, (List)ImmutableList.of((Object)Pair.of((Object)class01520.L((float)1.0f), (Object)2), (Object)Pair.of((Object)class05771.N((float)1.0f, (int)3), (Object)3))))));
    }

    private static void u(class01289<class08157> class012892) {
        class012892.N(class05359.U, ImmutableList.of((Object)Pair.of((Object)0, (Object)new class08163(80, N, 0.6f, 2.0f, 12.0, 11.0, class04909.jC))), (Set)ImmutableSet.of((Object)Pair.of((Object)class05378.s, (Object)class05367.field_18456), (Object)Pair.of((Object)class05378.a, (Object)class05367.field_18457), (Object)Pair.of((Object)class05378.j, (Object)class05367.field_18457), (Object)Pair.of((Object)class05378.NR, (Object)class05367.field_18457)));
    }

    public static Predicate<class06584> y() {
        return class065842 -> class065842.N(class01226.yz);
    }

    private static void y(class01289<class08157> class012892) {
        class012892.N(class05359.N, 0, ImmutableList.of((Object)new class02140(1.6f), (Object)new class05770(45, 90), (Object)new class05738(), (Object)new class05550(class05378.p), (Object)new class05550(class05378.NR), (Object)new class05550(class05378.NM)));
    }

    protected static class01289<?> N(class01289<class08157> class012892) {
        class08185.y(class012892);
        class08185.L(class012892);
        class08185.u(class012892);
        class012892.N((Set)ImmutableSet.of((Object)class05359.N));
        class012892.y(class05359.y);
        class012892.i();
        return class012892;
    }

    public static void N(class08156 class081562, class06069 class060692) {
        class081562.method_18868().N(class05378.NM, (Object)B.N(class060692));
    }

    private static boolean N(class07438 class074382) {
        return class074382.method_5799() && class074382.method_5864().N(class01217.A);
    }

    public static void N(class04782 class047822, class08156 class081562, class07438 class074382) {
        if (class05355.L((class04782)class047822, (class07438)class081562, (class07438)class074382)) {
            class081562.method_18868().y(class05378.I);
            class081562.method_18868().N(class05378.NW, (Object)class074382.method_5667(), 400L);
        }
    }

    protected static class05781<class08157> N() {
        return class01289.N(L, y);
    }

    public static void N(class08157 class081572) {
        class081572.method_18868().N((List)ImmutableList.of((Object)class05359.U, (Object)class05359.y));
    }

    protected static Optional<? extends class07438> N(class04782 class047822, class08156 class081562) {
        if (class06293.N((class07438)class081562) || !class081562.method_5799() || class081562.method_6109() || class081562.NQ()) {
            return Optional.empty();
        }
        Optional<class07438> optional = class06293.N((class07438)class081562, (class05378)class05378.NW).filter(class074382 -> class074382.method_5799() && class05355.L((class04782)class047822, (class07438)class081562, (class07438)class074382));
        if (optional.isPresent()) {
            return optional;
        }
        if (class081562.method_18868().N(class05378.NM)) {
            return Optional.empty();
        }
        class081562.method_18868().N(class05378.NM, (Object)B.N(class047822.field_9229));
        if (class047822.field_9229.z() < 0.5f) {
            return Optional.empty();
        }
        return class081562.method_18868().L(class05378.B).orElse(class04051.N()).N(class08185::N);
    }
}

