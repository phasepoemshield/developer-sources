/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class01269
 *  minecraft.class01289
 *  minecraft.class01328
 *  minecraft.class01485
 *  minecraft.class01520
 *  minecraft.class01694
 *  minecraft.class01702
 *  minecraft.class04126
 *  minecraft.class04909
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
 *  minecraft.class05782
 *  minecraft.class06069
 *  minecraft.class07078
 *  minecraft.class07305
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Set;
import minecraft.class01269;
import minecraft.class01289;
import minecraft.class01328;
import minecraft.class01485;
import minecraft.class01520;
import minecraft.class01694;
import minecraft.class01702;
import minecraft.class02135;
import minecraft.class02140;
import minecraft.class02141;
import minecraft.class02148;
import minecraft.class02152;
import minecraft.class04126;
import minecraft.class04909;
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
import minecraft.class05782;
import minecraft.class06069;
import minecraft.class07078;
import minecraft.class07305;

public class class02133 {
    public static final int N = 20;
    public static final int y = 7;
    private static final class02135 Z = class02135.y(5, 16);
    private static final float z = 1.0f;
    private static final float U = 1.25f;
    private static final float E = 1.25f;
    private static final float W = 2.0f;
    private static final float m = 1.25f;
    private static final class02135 P = class02135.y(600, 1200);
    public static final int L = 5;
    public static final int u = 5;
    public static final float i = 3.5714288f;
    private static final class02135 s = class02135.y(600, 6000);
    private static final class02135 T = class02135.y(100, 300);
    private static final class01328 b = class01328.N().N((class074382, class047822) -> !class074382.method_5864().equals(class07078.NW) && ((Boolean)class047822.method_64395().N(class07305.I) != false || !class074382.method_5864().equals(class07078.B)) && class047822.method_8621().N(class074382.method_5829()));
    private static final float j = 3.0f;
    public static final int R = 4;
    public static final float M = 2.5f;
    public static final float B = 1.0f;

    private static void L(class01289<class02148> class012892) {
        class012892.N(class05359.y, ImmutableList.of((Object)Pair.of((Object)0, (Object)class04126.N((class07078)class07078.Ly, (float)6.0f, (class02135)class02135.y(30, 60))), (Object)Pair.of((Object)0, (Object)new class01485(class07078.NW)), (Object)Pair.of((Object)1, (Object)new class05585(class074382 -> Float.valueOf(1.25f))), (Object)Pair.of((Object)2, (Object)class01269.N((class02135)Z, (float)1.25f)), (Object)Pair.of((Object)3, (Object)new class05747((List)ImmutableList.of((Object)Pair.of((Object)class01520.N((float)1.0f), (Object)2), (Object)Pair.of((Object)class05771.N((float)1.0f, (int)3), (Object)2), (Object)Pair.of((Object)new class05782(30, 60), (Object)1))))), (Set)ImmutableSet.of((Object)Pair.of((Object)class05378.D, (Object)class05367.field_18457), (Object)Pair.of((Object)class05378.C, (Object)class05367.field_18457)));
    }

    private static void i(class01289<class02148> class012892) {
        class012892.N(class05359.b, ImmutableList.of((Object)Pair.of((Object)0, (Object)new class01702(class021482 -> class021482.d() ? T : s, b, 3.0f, class021482 -> class021482.method_6109() ? 1.0 : 2.5, class021482 -> class021482.d() ? class04909.WA : class04909.WK, class021482 -> class04909.WV)), (Object)Pair.of((Object)1, (Object)new class01694(class021482 -> class021482.d() ? T.y() : s.y(), 4, 7, 1.25f, b, 20, class021482 -> class021482.d() ? class04909.WF : class04909.Wq))), (Set)ImmutableSet.of((Object)Pair.of((Object)class05378.a, (Object)class05367.field_18457), (Object)Pair.of((Object)class05378.j, (Object)class05367.field_18457), (Object)Pair.of((Object)class05378.x, (Object)class05367.field_18457)));
    }

    private static void u(class01289<class02148> class012892) {
        class012892.N(class05359.T, ImmutableList.of((Object)Pair.of((Object)0, (Object)((Object)new class02141(P, class04909.Wf))), (Object)Pair.of((Object)1, new class02152<class02148>(P, 5, 5, 3.5714288f, class021482 -> class021482.d() ? class04909.Wa : class04909.WJ))), (Set)ImmutableSet.of((Object)Pair.of((Object)class05378.a, (Object)class05367.field_18457), (Object)Pair.of((Object)class05378.j, (Object)class05367.field_18457), (Object)Pair.of((Object)class05378.m, (Object)class05367.field_18457), (Object)Pair.of((Object)class05378.f, (Object)class05367.field_18457)));
    }

    private static void y(class01289<class02148> class012892) {
        class012892.N(class05359.N, 0, ImmutableList.of((Object)new class05739(0.8f), new class02140(2.0f), (Object)new class05770(45, 90), (Object)new class05738(), (Object)new class05550(class05378.p), (Object)new class05550(class05378.f), (Object)new class05550(class05378.x)));
    }

    public static class01289<?> N(class01289<class02148> class012892) {
        class02133.y(class012892);
        class02133.L(class012892);
        class02133.u(class012892);
        class02133.i(class012892);
        class012892.N((Set)ImmutableSet.of((Object)class05359.N));
        class012892.y(class05359.y);
        class012892.i();
        return class012892;
    }

    public static void N(class02148 class021482) {
        class021482.method_18868().N((List)ImmutableList.of((Object)class05359.b, (Object)class05359.T, (Object)class05359.y));
    }

    public static void N(class02148 class021482, class06069 class060692) {
        class021482.method_18868().N(class05378.f, (Object)P.N(class060692));
        class021482.method_18868().N(class05378.x, (Object)s.N(class060692));
    }
}

