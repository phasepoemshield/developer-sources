/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00869
 *  minecraft.class01289
 *  minecraft.class01520
 *  minecraft.class01522
 *  minecraft.class02135
 *  minecraft.class02140
 *  minecraft.class04126
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05359
 *  minecraft.class05378
 *  minecraft.class05550
 *  minecraft.class05738
 *  minecraft.class05739
 *  minecraft.class05744
 *  minecraft.class05747
 *  minecraft.class05751
 *  minecraft.class05770
 *  minecraft.class05771
 *  minecraft.class05779
 *  minecraft.class05782
 *  minecraft.class05946
 *  minecraft.class06289
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import minecraft.class00869;
import minecraft.class01289;
import minecraft.class01520;
import minecraft.class01522;
import minecraft.class02135;
import minecraft.class02140;
import minecraft.class03630;
import minecraft.class03635;
import minecraft.class03655;
import minecraft.class04126;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class05359;
import minecraft.class05378;
import minecraft.class05550;
import minecraft.class05738;
import minecraft.class05739;
import minecraft.class05744;
import minecraft.class05747;
import minecraft.class05751;
import minecraft.class05770;
import minecraft.class05771;
import minecraft.class05779;
import minecraft.class05782;
import minecraft.class05946;
import minecraft.class06289;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;

public class class03645 {
    private static final float N = 1.0f;
    private static final float y = 2.25f;
    private static final float L = 1.75f;
    private static final float u = 2.5f;
    private static final int i = 4;
    private static final int R = 16;
    private static final int M = 6;
    private static final int B = 30;
    private static final int Z = 60;
    private static final int z = 600;
    private static final int U = 32;
    private static final int E = 20;

    private static void L(class01289<class03630> class012892) {
        class012892.N(class05359.y, ImmutableList.of((Object)Pair.of((Object)0, (Object)class01522.N(class036302 -> true, (float)1.75f, (boolean)true, (int)32)), (Object)Pair.of((Object)1, new class03635(class03645::y, 2.25f, 20)), (Object)Pair.of((Object)2, class03655.N(class03645::y, Predicate.not(class03645::L), 4, 16, 2.25f)), (Object)Pair.of((Object)3, (Object)class04126.N((float)6.0f, (class02135)class02135.y((int)30, (int)60))), (Object)Pair.of((Object)4, (Object)new class05747((List)ImmutableList.of((Object)Pair.of((Object)class01520.y((float)1.0f), (Object)2), (Object)Pair.of((Object)class05771.N((float)1.0f, (int)3), (Object)2), (Object)Pair.of((Object)new class05782(30, 60), (Object)1))))), (Set)ImmutableSet.of());
    }

    private static boolean L(class07438 class074382) {
        return class074382.method_18868().N(class05378.H);
    }

    private static Optional<class05779> u(class07438 class074382) {
        return class03645.N(class074382).map(class047702 -> new class05751((class07049)class047702, true));
    }

    private static Optional<class05779> y(class07438 class074382) {
        class01289 var1 = class074382.method_18868();
        Optional var2 = var1.L(class05378.Nh);
        if (var2.isPresent()) {
            class06289 class062892 = (class06289)var2.get();
            if (class03645.N(class074382, var1, class062892)) {
                return Optional.of(new class05744(class062892.y().method_10084()));
            }
            var1.y(class05378.Nh);
        }
        return class03645.u(class074382);
    }

    private static void y(class01289<class03630> class012892) {
        class012892.N(class05359.N, 0, ImmutableList.of((Object)new class05739(0.8f), (Object)new class02140(2.5f), (Object)new class05770(45, 90), (Object)new class05738(), (Object)new class05550(class05378.Nr), (Object)new class05550(class05378.yN)));
    }

    public static Optional<class04770> N(class07438 class074382) {
        class07299 class072992 = class074382.method_73183();
        if (!class072992.method_8608() && class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            Optional var3 = class074382.method_18868().L(class05378.ND);
            if (var3.isPresent()) {
                class07049 class070492 = class047822.method_66347((UUID)var3.get());
                if (class070492 instanceof class04770) {
                    class04770 class047702 = (class04770)class070492;
                    if ((class047702.field_13974.u() || class047702.field_13974.i()) && class047702.method_24516((class07049)class074382, 64.0)) {
                        return Optional.of(class047702);
                    }
                }
                return Optional.empty();
            }
        }
        return Optional.empty();
    }

    public static class01289<?> N(class01289<class03630> class012892) {
        class03645.y(class012892);
        class03645.L(class012892);
        class012892.N((Set)ImmutableSet.of((Object)class05359.N));
        class012892.y(class05359.y);
        class012892.i();
        return class012892;
    }

    public static void N(class07438 class074382, class07209 class072092) {
        class01289 var2 = class074382.method_18868();
        class06289 class062892 = class06289.N((class05946)class074382.method_73183().method_27983(), (class07209)class072092);
        Optional var4 = var2.L(class05378.Nh);
        if (var4.isEmpty()) {
            var2.N(class05378.Nh, (Object)class062892);
            var2.N(class05378.Nr, (Object)600);
        } else if (((class06289)var4.get()).equals((Object)class062892)) {
            var2.N(class05378.Nr, (Object)600);
        }
    }

    private static boolean N(class07438 class074382, class01289<?> class012892, class06289 class062892) {
        Optional var3 = class012892.L(class05378.Nr);
        class07299 class072992 = class074382.method_73183();
        return class062892.N(class072992.method_27983(), class074382.method_24515(), 1024) && class072992.method_8320(class062892.y()).N(class00869.yR) && var3.isPresent();
    }

    public static void N(class03630 class036302) {
        class036302.method_18868().N((List)ImmutableList.of((Object)class05359.y));
    }
}

