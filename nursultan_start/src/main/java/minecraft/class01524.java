/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00753
 *  minecraft.class01269
 *  minecraft.class01289
 *  minecraft.class02135
 *  minecraft.class04119
 *  minecraft.class04126
 *  minecraft.class04137
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05355
 *  minecraft.class05359
 *  minecraft.class05378
 *  minecraft.class05738
 *  minecraft.class05747
 *  minecraft.class05770
 *  minecraft.class05771
 *  minecraft.class05773
 *  minecraft.class05782
 *  minecraft.class06018
 *  minecraft.class06293
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class07633
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import minecraft.class00753;
import minecraft.class01269;
import minecraft.class01289;
import minecraft.class01485;
import minecraft.class01507;
import minecraft.class01517;
import minecraft.class01518;
import minecraft.class01520;
import minecraft.class01523;
import minecraft.class01528;
import minecraft.class01531;
import minecraft.class01534;
import minecraft.class02135;
import minecraft.class04119;
import minecraft.class04126;
import minecraft.class04137;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05355;
import minecraft.class05359;
import minecraft.class05378;
import minecraft.class05738;
import minecraft.class05747;
import minecraft.class05770;
import minecraft.class05771;
import minecraft.class05773;
import minecraft.class05782;
import minecraft.class06018;
import minecraft.class06293;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07438;
import minecraft.class07633;

public class class01524 {
    public static final int N = 8;
    public static final int y = 4;
    private static final class02135 L = class01517.N(5, 20);
    private static final int u = 200;
    private static final int i = 8;
    private static final int R = 15;
    private static final int M = 40;
    private static final int B = 15;
    private static final int Z = 200;
    private static final class02135 z = class02135.y((int)5, (int)16);
    private static final float U = 1.0f;
    private static final float E = 1.3f;
    private static final float W = 0.6f;
    private static final float m = 0.4f;
    private static final float P = 0.6f;

    private static void L(class06018 class060182, class07438 class074382) {
        class07438 class074383 = class074382;
        class01289 var3 = class060182.method_18868();
        class074383 = class06293.N((class07438)class060182, (Optional)var3.L(class05378.k), (class07438)class074383);
        class074383 = class06293.N((class07438)class060182, (Optional)var3.L(class05378.s), (class07438)class074383);
        class01524.u(class060182, class074383);
    }

    public static boolean L(class06018 class060182) {
        return class060182.method_18868().N(class05378.Nq);
    }

    private static void L(class01289<class06018> class012892) {
        class012892.N(class05359.y, 10, ImmutableList.of(class01534.N(class05378.No, 200), (Object)((Object)new class01485((class07078<? extends class07633>)class07078.NP, 0.6f, 2)), (Object)class05773.N((class05378)class05378.No, (float)1.0f, (int)8, (boolean)true), class01507.N(class01524::N), (Object)class04137.N_44(class06018::m, (class04119)class05773.y((class05378)class05378.NY, (float)0.4f, (int)8, (boolean)false)), (Object)class04126.N((float)8.0f, (class02135)class02135.y((int)30, (int)60)), (Object)class01269.N((class02135)z, (float)0.6f), class01524.N()));
    }

    private static void M(class06018 class060182, class07438 class074382) {
        if (class01524.L(class060182)) {
            return;
        }
        Optional var2 = class060182.method_18868().L(class05378.s);
        class07438 class074383 = class06293.N((class07438)class060182, (Optional)var2, (class07438)class074382);
        class01524.i(class060182, class074383);
    }

    private static boolean M(class06018 class060182) {
        return class060182.method_18868().N(class05378.No);
    }

    private static boolean B(class06018 class060182) {
        return class060182.method_18868().N(class05378.j);
    }

    private static void i(class06018 class060182, class07438 class074382) {
        class01289 var2 = class060182.method_18868();
        var2.y(class05378.I);
        var2.y(class05378.j);
        var2.N(class05378.s, (Object)class074382, 200L);
    }

    private static void i(class01289<class06018> class012892) {
        class012892.N(class05359.m, 10, ImmutableList.of((Object)class05773.y((class05378)class05378.k, (float)1.3f, (int)15, (boolean)false), class01524.N(), (Object)class04126.N((float)8.0f, (class02135)class02135.y((int)30, (int)60)), class01518.N(class01524::u, class05378.k)), class05378.k);
    }

    private static boolean i(class06018 class060182) {
        int n;
        if (class060182.method_6109()) {
            return false;
        }
        int n2 = class060182.method_18868().L(class05378.NO).orElse(0);
        return n2 > (n = class060182.method_18868().L(class05378.Ng).orElse(0) + 1);
    }

    private static boolean u(class06018 class060182) {
        return class060182.m() && !class01524.i(class060182);
    }

    private static void u(class06018 class060182, class07438 class074382) {
        class060182.method_18868().y(class05378.s);
        class060182.method_18868().y(class05378.m);
        class060182.method_18868().N(class05378.k, (Object)class074382, (long)L.N(class060182.method_73183().field_9229));
    }

    private static void u(class01289<class06018> class012892) {
        class012892.N(class05359.U, 10, ImmutableList.of(class01534.N(class05378.No, 200), (Object)((Object)new class01485((class07078<? extends class07633>)class07078.NP, 0.6f, 2)), class01531.N(1.0f), (Object)class04137.N_44(class06018::m, class01528.N(40)), (Object)class04137.N_44(class07077::method_6109, class01528.N(15)), class01523.N(), class01518.N(class01524::B, class05378.s)), class05378.s);
    }

    private static void y(class04782 class047822, class06018 class060182, class07438 class074382) {
        if (class060182.method_18868().L(class05359.m) && class074382.method_5864() == class07078.Nr) {
            return;
        }
        if (class074382.method_5864() == class07078.NP) {
            return;
        }
        if (class06293.N((class07438)class060182, (class07438)class074382, (double)4.0)) {
            return;
        }
        if (!class05355.y((class04782)class047822, (class07438)class060182, (class07438)class074382)) {
            return;
        }
        class01524.i(class060182, class074382);
        class01524.R(class060182, class074382);
    }

    private static void y(class01289<class06018> class012892) {
        class012892.N(class05359.N, 0, ImmutableList.of((Object)new class05770(45, 90), (Object)new class05738()));
    }

    private static void y(class06018 class060183, class07438 class074382) {
        class01524.R(class060183).forEach(class060182 -> class01524.L(class060182, class074382));
    }

    public static Optional<class04891> y(class06018 class060182) {
        return class060182.method_18868().R().map(class053592 -> class01524.N(class060182, class053592));
    }

    private static class04891 N(class06018 class060182, class05359 class053592) {
        if (class053592 == class05359.m || class060182.v()) {
            return class04909.Pj;
        }
        if (class053592 == class05359.U) {
            return class04909.Pm;
        }
        if (class01524.M(class060182)) {
            return class04909.Pj;
        }
        return class04909.PW;
    }

    public static class01289<?> N(class01289<class06018> class012892) {
        class01524.y(class012892);
        class01524.L(class012892);
        class01524.u(class012892);
        class01524.i(class012892);
        class012892.N((Set)ImmutableSet.of((Object)class05359.N));
        class012892.y(class05359.y);
        class012892.i();
        return class012892;
    }

    public static void N(class06018 class060182, class07438 class074382) {
        if (class060182.method_6109()) {
            return;
        }
        if (class074382.method_5864() == class07078.Nr && class01524.i(class060182)) {
            class01524.u(class060182, class074382);
            class01524.y(class060182, class074382);
            return;
        }
        class01524.R(class060182, class074382);
    }

    private static class05747<class06018> N() {
        return new class05747((List)ImmutableList.of((Object)Pair.of(class01520.N(0.4f), (Object)2), (Object)Pair.of((Object)class05771.N((float)0.4f, (int)3), (Object)2), (Object)Pair.of((Object)new class05782(30, 60), (Object)1)));
    }

    static boolean N(class06018 class060182, class07209 class072092) {
        Optional var2 = class060182.method_18868().L(class05378.No);
        return var2.isPresent() && ((class07209)var2.get()).method_19771((class00753)class072092, 8.0);
    }

    private static Optional<? extends class07438> N(class04782 class047822, class06018 class060182) {
        if (class01524.L(class060182) || class01524.B(class060182)) {
            return Optional.empty();
        }
        return class060182.method_18868().L(class05378.E);
    }

    public static void N(class06018 class060182) {
        class01289 var1 = class060182.method_18868();
        class05359 class053592 = var1.R().orElse(null);
        var1.N((List)ImmutableList.of((Object)class05359.U, (Object)class05359.m, (Object)class05359.y));
        class05359 class053593 = var1.R().orElse(null);
        if (class053592 != class053593) {
            class01524.y(class060182).ifPresent(arg_0 -> ((class06018)class060182).method_56078(arg_0));
        }
        class060182.R(var1.N(class05378.s));
    }

    public static void N(class04782 class047822, class06018 class060182, class07438 class074382) {
        class01289 var3 = class060182.method_18868();
        var3.y(class05378.Nq);
        var3.y(class05378.j);
        if (class060182.method_6109()) {
            class01524.L(class060182, class074382);
            return;
        }
        class01524.y(class047822, class060182, class074382);
    }

    private static void R(class06018 class060183, class07438 class074382) {
        class01524.R(class060183).forEach(class060182 -> class01524.M(class060182, class074382));
    }

    private static List<class06018> R(class06018 class060182) {
        return (List)class060182.method_18868().L(class05378.Nk).orElse(ImmutableList.of());
    }
}

