/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class01238
 *  minecraft.class01266
 *  minecraft.class01289
 *  minecraft.class01505
 *  minecraft.class01507
 *  minecraft.class01514
 *  minecraft.class01520
 *  minecraft.class01523
 *  minecraft.class01528
 *  minecraft.class01531
 *  minecraft.class04782
 *  minecraft.class05355
 *  minecraft.class05359
 *  minecraft.class05378
 *  minecraft.class05738
 *  minecraft.class05745
 *  minecraft.class05747
 *  minecraft.class05750
 *  minecraft.class05758
 *  minecraft.class05767
 *  minecraft.class05770
 *  minecraft.class05778
 *  minecraft.class05782
 *  minecraft.class05946
 *  minecraft.class06289
 *  minecraft.class06293
 *  minecraft.class06300
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07438
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import minecraft.class01238;
import minecraft.class01266;
import minecraft.class01289;
import minecraft.class01505;
import minecraft.class01507;
import minecraft.class01514;
import minecraft.class01520;
import minecraft.class01523;
import minecraft.class01528;
import minecraft.class01531;
import minecraft.class04782;
import minecraft.class05355;
import minecraft.class05359;
import minecraft.class05378;
import minecraft.class05738;
import minecraft.class05745;
import minecraft.class05747;
import minecraft.class05750;
import minecraft.class05758;
import minecraft.class05767;
import minecraft.class05770;
import minecraft.class05778;
import minecraft.class05782;
import minecraft.class05946;
import minecraft.class06289;
import minecraft.class06293;
import minecraft.class06300;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07438;

public class class01030 {
    private static final int N = 600;
    private static final int y = 20;
    private static final double L = 0.0125;
    private static final int u = 8;
    private static final int i = 8;
    private static final float R = 0.6f;
    private static final int M = 2;
    private static final int B = 100;
    private static final int Z = 5;

    private static void L(class01266 class012662, class01289<class01266> class012892) {
        class012892.N(class05359.y, 10, ImmutableList.of((Object)class01507.N(class01030::N), class01030.N(), class01030.y(), (Object)class05778.N((class07078)class07078.Ly, (int)4)));
    }

    public static void L(class01266 class012662) {
        if ((double)class012662.method_73183().field_9229.z() < 0.0125) {
            class01030.u(class012662);
        }
    }

    private static void u(class01266 class012662, class01289<class01266> class012892) {
        class012892.N(class05359.U, 10, ImmutableList.of((Object)class01523.N((class047822, class074382) -> !class01030.N(class047822, (class01238)class012662, class074382)), (Object)class01531.N((float)1.0f), (Object)class01528.N((int)20)), class05378.s);
    }

    private static void u(class01266 class012662) {
        class012662.method_18868().R().ifPresent(class053592 -> {
            if (class053592 == class05359.U) {
                class012662.W();
            }
        });
    }

    public static void y(class01266 class012662) {
        class01289 var1 = class012662.method_18868();
        class05359 class053592 = var1.R().orElse(null);
        var1.N((List)ImmutableList.of((Object)class05359.U, (Object)class05359.y));
        class05359 class053593 = var1.R().orElse(null);
        if (class053592 != class053593) {
            class01030.u(class012662);
        }
        class012662.R(var1.N(class05378.s));
    }

    private static class05747<class01266> y() {
        return new class05747((List)ImmutableList.of((Object)Pair.of((Object)class01520.N((float)0.6f), (Object)2), (Object)Pair.of((Object)class05750.N((class07078)class07078.Nr, (int)8, (class05378)class05378.b, (float)0.6f, (int)2), (Object)2), (Object)Pair.of((Object)class05750.N((class07078)class07078.yN, (int)8, (class05378)class05378.b, (float)0.6f, (int)2), (Object)2), (Object)Pair.of((Object)class06300.N((class05378)class05378.y, (float)0.6f, (int)2, (int)100), (Object)2), (Object)Pair.of((Object)class05767.N((class05378)class05378.y, (float)0.6f, (int)5), (Object)2), (Object)Pair.of((Object)new class05782(30, 60), (Object)1)));
    }

    private static void y(class01266 class012662, class01289<class01266> class012892) {
        class012892.N(class05359.N, 0, ImmutableList.of((Object)new class05770(45, 90), (Object)new class05738(), (Object)class05758.N(), (Object)class01505.N()));
    }

    protected static void N(class01266 class012662, class07438 class074382) {
        class012662.method_18868().y(class05378.I);
        class012662.method_18868().N(class05378.NW, (Object)class074382.method_5667(), 600L);
    }

    public static class01289<?> N(class01266 class012662, class01289<class01266> class012892) {
        class01030.y(class012662, class012892);
        class01030.L(class012662, class012892);
        class01030.u(class012662, class012892);
        class012892.N((Set)ImmutableSet.of((Object)class05359.N));
        class012892.y(class05359.y);
        class012892.i();
        return class012892;
    }

    public static void N(class01266 class012662) {
        class06289 class062892 = class06289.N((class05946)class012662.method_73183().method_27983(), (class07209)class012662.method_24515());
        class012662.method_18868().N(class05378.y, (Object)class062892);
    }

    private static class05747<class01266> N() {
        return new class05747((List)ImmutableList.of((Object)Pair.of((Object)class05745.N((class07078)class07078.Ly, (float)8.0f), (Object)1), (Object)Pair.of((Object)class05745.N((class07078)class07078.Nr, (float)8.0f), (Object)1), (Object)Pair.of((Object)class05745.N((class07078)class07078.yN, (float)8.0f), (Object)1), (Object)Pair.of((Object)class05745.N((float)8.0f), (Object)1), (Object)Pair.of((Object)new class05782(30, 60), (Object)1)));
    }

    private static boolean N(class04782 class047822, class01238 class012382, class07438 class074382) {
        return class01030.N(class047822, class012382).filter(class074383 -> class074383 == class074382).isPresent();
    }

    private static Optional<? extends class07438> N(class04782 class047822, class01238 class012382) {
        Optional var2 = class06293.N((class07438)class012382, (class05378)class05378.NW);
        if (var2.isPresent() && class05355.L((class04782)class047822, (class07438)class012382, (class07438)((class07438)var2.get()))) {
            return var2;
        }
        Optional var3 = class012382.method_18868().L(class05378.E);
        if (var3.isPresent()) {
            return var3;
        }
        return class012382.method_18868().L(class05378.c);
    }

    public static void N(class04782 class047822, class01266 class012662, class07438 class074382) {
        if (class074382 instanceof class01238) {
            return;
        }
        class01514.N((class04782)class047822, (class01238)class012662, (class07438)class074382);
    }
}

