/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00379
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01210
 *  minecraft.class01289
 *  minecraft.class01520
 *  minecraft.class02135
 *  minecraft.class02140
 *  minecraft.class04126
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05340
 *  minecraft.class05355
 *  minecraft.class05359
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05550
 *  minecraft.class05738
 *  minecraft.class05747
 *  minecraft.class05758
 *  minecraft.class05770
 *  minecraft.class05781
 *  minecraft.class05782
 *  minecraft.class06695
 *  minecraft.class07078
 *  minecraft.class07475
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class00379;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01210;
import minecraft.class01289;
import minecraft.class01520;
import minecraft.class02135;
import minecraft.class02140;
import minecraft.class04126;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05340;
import minecraft.class05355;
import minecraft.class05359;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05550;
import minecraft.class05738;
import minecraft.class05747;
import minecraft.class05758;
import minecraft.class05770;
import minecraft.class05781;
import minecraft.class05782;
import minecraft.class06695;
import minecraft.class07078;
import minecraft.class07475;
import minecraft.class08945;
import minecraft.class08948;
import minecraft.class08969;
import minecraft.class08978;
import minecraft.class08979;
import minecraft.class08982;
import minecraft.class08993;
import org.jspecify.annotations.Nullable;

public class class08988 {
    private static final float N = 1.5f;
    private static final float y = 1.0f;
    private static final int L = 32;
    private static final int u = 8;
    private static final int i = 1;
    private static final int R = 9;
    private static final Predicate<class00500> M = class005002 -> class005002.N(class01210.NZ);
    private static final Predicate<class00500> B = class005002 -> class005002.N(class00869.LA) || class005002.N(class00869.BH);
    private static final ImmutableList<class05340<? extends class05355<? super class08982>>> Z = ImmutableList.of((Object)class05340.L, (Object)class05340.R);
    private static final ImmutableList<class05378<?>> z = ImmutableList.of((Object)class05378.NN, (Object)class05378.d, (Object)class05378.w, (Object)class05378.M, (Object)class05378.B, (Object)class05378.m, (Object)class05378.P, (Object)class05378.I, (Object)class05378.n, (Object)class05378.F, (Object)class05378.Ni, (Object)class05378.NL, (Object[])new class05378[]{class05378.Nu, class05378.G});

    private static Consumer<class07475> L() {
        return class074752 -> {
            if (class074752 instanceof class08982) {
                class08982 class089822 = (class08982)class074752;
                class089822.W();
                class089822.N(class08979.field_61292);
            }
        };
    }

    private static void L(class01289<class08982> class012892) {
        class012892.N(class05359.y, ImmutableList.of((Object)Pair.of((Object)0, (Object)((Object)new class08945(1.0f, M, B, 32, 8, class08988.y(), class08988.L(), class08988.u()))), (Object)Pair.of((Object)1, (Object)class04126.N((class07078)class07078.Ly, (float)6.0f, (class02135)class02135.y((int)40, (int)80))), (Object)Pair.of((Object)2, (Object)new class05747((Map)ImmutableMap.of((Object)class05378.m, (Object)class05367.field_18457, (Object)class05378.Ni, (Object)class05367.field_18456), (List)ImmutableList.of((Object)Pair.of((Object)class01520.N((float)1.0f, (int)2, (int)2), (Object)1), (Object)Pair.of((Object)new class05782(30, 60), (Object)1))))));
    }

    private static Predicate<class08948> u() {
        return class089482 -> {
            class00394 class003942 = class089482.L();
            if (class003942 instanceof class00379) {
                return !((class00379)class003942).j_().isEmpty();
            }
            return false;
        };
    }

    private static void y(class01289<class08982> class012892) {
        class012892.N(class05359.N, 0, ImmutableList.of((Object)new class02140(1.5f), (Object)new class05770(45, 90), (Object)new class05738(), (Object)class05758.N(), (Object)new class05550(class05378.F), (Object)new class05550(class05378.Ni)));
    }

    private static Map<class08969, class08993> y() {
        return Map.of(class08969.field_61245, class08988.N(class08979.field_61293, class04909.Mq), class08969.field_61246, class08988.N(class08979.field_61294, class04909.MK), class08969.field_61247, class08988.N(class08979.field_61295, class04909.MV), class08969.field_61248, class08988.N(class08979.field_61296, class04909.Me));
    }

    public static void N(class08982 class089822) {
        class089822.method_18868().N((List)ImmutableList.of((Object)class05359.y));
    }

    public static class01289<?> N(class01289<class08982> class012892) {
        class08988.y(class012892);
        class08988.L(class012892);
        class012892.N(Set.of(class05359.N));
        class012892.y(class05359.y);
        class012892.i();
        return class012892;
    }

    private static class08993 N(class08979 class089792, @Nullable class04891 class048912) {
        return (class074752, class089482, n) -> {
            if (class074752 instanceof class08982) {
                class08982 class089822 = (class08982)class074752;
                class06695 class066952 = class089482.y();
                if (n == 1) {
                    class066952.method_5435((class08978)class089822);
                    class089822.N(class089482.N());
                    class089822.N(class089792);
                }
                if (n == 9 && class048912 != null) {
                    class089822.method_43077(class048912);
                }
                if (n == 60) {
                    if (class066952.j_().contains(class074752)) {
                        class066952.method_5432((class08978)class089822);
                    }
                    class089822.W();
                }
            }
        };
    }

    public static class05781<class08982> N() {
        return class01289.N(z, Z);
    }
}

