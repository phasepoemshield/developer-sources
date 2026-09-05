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
 *  minecraft.class01528
 *  minecraft.class01531
 *  minecraft.class02135
 *  minecraft.class04126
 *  minecraft.class05340
 *  minecraft.class05355
 *  minecraft.class05359
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05738
 *  minecraft.class05747
 *  minecraft.class05770
 *  minecraft.class05771
 *  minecraft.class05781
 *  minecraft.class05782
 *  minecraft.class07438
 *  minecraft.class08036
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;
import minecraft.class00245;
import minecraft.class00256;
import minecraft.class01289;
import minecraft.class01507;
import minecraft.class01520;
import minecraft.class01523;
import minecraft.class01528;
import minecraft.class01531;
import minecraft.class02135;
import minecraft.class04126;
import minecraft.class05340;
import minecraft.class05355;
import minecraft.class05359;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05738;
import minecraft.class05747;
import minecraft.class05770;
import minecraft.class05771;
import minecraft.class05781;
import minecraft.class05782;
import minecraft.class07438;
import minecraft.class08036;

public class class00260 {
    protected static final ImmutableList<? extends class05340<? extends class05355<? super class00245>>> N = ImmutableList.of((Object)class05340.L, (Object)class05340.u);
    protected static final ImmutableList<? extends class05378<?>> y = ImmutableList.of((Object)class05378.M, (Object)class05378.B, (Object)class05378.U, (Object)class05378.E, (Object)class05378.W, (Object)class05378.P, (Object)class05378.m, (Object)class05378.I, (Object)class05378.n, (Object)class05378.s, (Object)class05378.T);

    public static class01289<class00245> y(class00245 class002452, class01289<class00245> class012892) {
        class00260.N(class012892);
        class00260.y(class012892);
        class00260.N(class002452, class012892);
        class012892.N((Set)ImmutableSet.of((Object)class05359.N));
        class012892.y(class05359.y);
        class012892.i();
        return class012892;
    }

    static void y(class01289<class00245> class012892) {
        class012892.N(class05359.y, 10, ImmutableList.of((Object)class01507.N((class047822, class002452) -> class002452.v(), (class047822, class002452) -> class002452.method_18868().L(class05378.E)), (Object)class04126.N((float)8.0f, (class02135)class02135.y((int)30, (int)60)), (Object)new class05747((List)ImmutableList.of((Object)Pair.of((Object)class01520.N((float)0.3f), (Object)2), (Object)Pair.of((Object)class05771.N((float)0.3f, (int)3), (Object)2), (Object)Pair.of((Object)new class05782(30, 60), (Object)1)))));
    }

    public static void N(class00245 class002452) {
        if (!class002452.B()) {
            class002452.method_18868().i();
        } else {
            class002452.method_18868().N((List)ImmutableList.of((Object)class05359.U, (Object)class05359.y));
        }
    }

    private static boolean N(class00245 class002452, class07438 class074382) {
        return class002452.method_18868().L(class05378.W).map(list -> {
            class08036 class080362;
            return class074382 instanceof class08036 && list.contains(class080362 = (class08036)class074382);
        }).orElse(false);
    }

    public static class05781<class00245> N() {
        return class01289.N(y, N);
    }

    static void N(class01289<class00245> class012892) {
        class012892.N(class05359.N, 0, ImmutableList.of((Object)((Object)new class00256(0.8f)), (Object)new class05770(45, 90), (Object)new class05738()));
    }

    static void N(class00245 class002452, class01289<class00245> class012892) {
        class012892.N(class05359.U, 10, ImmutableList.of((Object)class01531.N((float)1.0f), (Object)class01528.N(class00245::B, (int)40), (Object)class01523.N((class047822, class074382) -> !class00260.N(class002452, class074382))), (Set)ImmutableSet.of((Object)Pair.of((Object)class05378.s, (Object)class05367.field_18456)));
    }
}

