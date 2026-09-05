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
 *  minecraft.class01507
 *  minecraft.class01518
 *  minecraft.class01520
 *  minecraft.class01523
 *  minecraft.class01528
 *  minecraft.class01531
 *  minecraft.class02135
 *  minecraft.class04126
 *  minecraft.class04137
 *  minecraft.class04782
 *  minecraft.class05359
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05538
 *  minecraft.class05736
 *  minecraft.class05738
 *  minecraft.class05747
 *  minecraft.class05753
 *  minecraft.class05769
 *  minecraft.class05770
 *  minecraft.class05771
 *  minecraft.class05779
 *  minecraft.class06293
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
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
import minecraft.class01269;
import minecraft.class01289;
import minecraft.class01485;
import minecraft.class01507;
import minecraft.class01518;
import minecraft.class01520;
import minecraft.class01523;
import minecraft.class01528;
import minecraft.class01531;
import minecraft.class02135;
import minecraft.class04126;
import minecraft.class04137;
import minecraft.class04782;
import minecraft.class05359;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05538;
import minecraft.class05548;
import minecraft.class05550;
import minecraft.class05556;
import minecraft.class05579;
import minecraft.class05585;
import minecraft.class05736;
import minecraft.class05738;
import minecraft.class05747;
import minecraft.class05753;
import minecraft.class05769;
import minecraft.class05770;
import minecraft.class05771;
import minecraft.class05779;
import minecraft.class06293;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;

public class class05552 {
    private static final class02135 N = class02135.y((int)5, (int)16);
    private static final float y = 0.2f;
    private static final float L = 0.15f;
    private static final float u = 0.5f;
    private static final float i = 0.6f;
    private static final float R = 0.6f;

    private static void L(class01289<class05538> class012892) {
        class012892.N(class05359.U, 0, ImmutableList.of((Object)class01523.N_28(class05538::N), (Object)class01531.N(class05552::y), (Object)class01528.N((int)20), (Object)class01518.N(class06293::N, (class05378)class05378.s)), class05378.s);
    }

    private static float L(class07438 class074382) {
        return class074382.method_5799() ? 0.6f : 0.15f;
    }

    private static void i(class01289<class05538> class012892) {
        class012892.N(class05359.y, ImmutableList.of((Object)Pair.of((Object)0, (Object)class04126.N((class07078)class07078.Ly, (float)6.0f, (class02135)class02135.y((int)30, (int)60))), (Object)Pair.of((Object)1, (Object)new class01485(class07078.z, 0.2f, 2)), (Object)Pair.of((Object)2, (Object)new class05747((List)ImmutableList.of((Object)Pair.of((Object)((Object)new class05585(class05552::u)), (Object)1), (Object)Pair.of((Object)class01269.N((class02135)N, class05552::L, (class05378)class05378.e, (boolean)false), (Object)1)))), (Object)Pair.of((Object)3, (Object)class01507.N(class05552::N)), (Object)Pair.of((Object)3, class05548.N(6, 0.15f)), (Object)Pair.of((Object)4, (Object)new class05736((Map)ImmutableMap.of((Object)class05378.m, (Object)class05367.field_18457), (Set)ImmutableSet.of(), class05753.field_18348, class05769.field_18856, (List)ImmutableList.of((Object)Pair.of((Object)class01520.L((float)0.5f), (Object)2), (Object)Pair.of((Object)class01520.N((float)0.15f, (boolean)false), (Object)2), (Object)Pair.of((Object)class05771.N(class05552::N, class05552::u, (int)3), (Object)3), (Object)Pair.of((Object)class04137.N_43(class07049::method_5799), (Object)5), (Object)Pair.of((Object)class04137.N_43(class07049::method_24828), (Object)5))))));
    }

    private static float u(class07438 class074382) {
        return class074382.method_5799() ? 0.5f : 0.15f;
    }

    private static void u(class01289<class05538> class012892) {
        class012892.N(class05359.N, 0, ImmutableList.of((Object)new class05770(45, 90), (Object)new class05738(), class05556.N(), (Object)((Object)new class05550((class05378<Integer>)class05378.p))));
    }

    private static float y(class07438 class074382) {
        return class074382.method_5799() ? 0.6f : 0.15f;
    }

    private static void y(class01289<class05538> class012892) {
        class012892.N(class05359.s, ImmutableList.of((Object)Pair.of((Object)0, (Object)((Object)new class05579())), (Object)Pair.of((Object)1, (Object)class01518.N(class06293::N, (class05378)class05378.X))), (Set)ImmutableSet.of((Object)Pair.of((Object)class05378.X, (Object)class05367.field_18456)), (Set)ImmutableSet.of((Object)class05378.X));
    }

    private static boolean N(class07438 class074382) {
        class07299 class072992 = class074382.method_73183();
        Optional var2 = class074382.method_18868().L(class05378.P);
        if (var2.isPresent()) {
            class07209 class072092 = ((class05779)var2.get()).y();
            return class072992.z(class072092) == class074382.method_5799();
        }
        return false;
    }

    private static Optional<? extends class07438> N(class04782 class047822, class05538 class055382) {
        if (class06293.N((class07438)class055382)) {
            return Optional.empty();
        }
        return class055382.method_18868().L(class05378.Q);
    }

    public static void N(class05538 class055382) {
        class01289 var1 = class055382.method_18868();
        class05359 class053592 = var1.R().orElse(null);
        if (class053592 != class05359.s) {
            var1.N((List)ImmutableList.of((Object)class05359.s, (Object)class05359.U, (Object)class05359.y));
            if (class053592 == class05359.U && var1.R().orElse(null) != class05359.U) {
                var1.N(class05378.S, (Object)true, 2400L);
            }
        }
    }

    public static class01289<?> N(class01289<class05538> class012892) {
        class05552.u(class012892);
        class05552.i(class012892);
        class05552.L(class012892);
        class05552.y(class012892);
        class012892.N((Set)ImmutableSet.of((Object)class05359.N));
        class012892.y(class05359.y);
        class012892.i();
        return class012892;
    }
}

