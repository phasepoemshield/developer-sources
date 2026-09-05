/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00500
 *  minecraft.class01210
 *  minecraft.class01334
 *  minecraft.class01348
 *  minecraft.class01522
 *  minecraft.class03556
 *  minecraft.class03927
 *  minecraft.class04118
 *  minecraft.class04137
 *  minecraft.class04142
 *  minecraft.class04145
 *  minecraft.class04625
 *  minecraft.class04782
 *  minecraft.class04877
 *  minecraft.class05367
 *  minecraft.class05369
 *  minecraft.class05378
 *  minecraft.class05939
 *  minecraft.class05940
 *  minecraft.class05968
 *  minecraft.class06278
 *  minecraft.class06284
 *  minecraft.class06285
 *  minecraft.class06286
 *  minecraft.class06288
 *  minecraft.class06289
 *  minecraft.class06295
 *  minecraft.class06296
 *  minecraft.class06298
 *  minecraft.class06300
 *  minecraft.class06301
 *  minecraft.class06303
 *  minecraft.class06309
 *  minecraft.class06315
 *  minecraft.class06316
 *  minecraft.class06317
 *  minecraft.class07049
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07209
 *  minecraft.class07428
 *  minecraft.class07438
 *  minecraft.class07789
 *  minecraft.class08041
 *  minecraft.class08092
 *  net.caffeinemc.mods.lithium.common.ai.useless_behaviors.LithiumEmptyBehavior
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
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class01210;
import minecraft.class01334;
import minecraft.class01348;
import minecraft.class01522;
import minecraft.class03556;
import minecraft.class03927;
import minecraft.class04118;
import minecraft.class04137;
import minecraft.class04142;
import minecraft.class04145;
import minecraft.class04625;
import minecraft.class04782;
import minecraft.class04877;
import minecraft.class05367;
import minecraft.class05369;
import minecraft.class05378;
import minecraft.class05672;
import minecraft.class05704;
import minecraft.class05712;
import minecraft.class05727;
import minecraft.class05735;
import minecraft.class05736;
import minecraft.class05738;
import minecraft.class05739;
import minecraft.class05742;
import minecraft.class05743;
import minecraft.class05745;
import minecraft.class05747;
import minecraft.class05750;
import minecraft.class05752;
import minecraft.class05753;
import minecraft.class05754;
import minecraft.class05755;
import minecraft.class05756;
import minecraft.class05757;
import minecraft.class05758;
import minecraft.class05759;
import minecraft.class05760;
import minecraft.class05761;
import minecraft.class05766;
import minecraft.class05767;
import minecraft.class05768;
import minecraft.class05769;
import minecraft.class05770;
import minecraft.class05771;
import minecraft.class05773;
import minecraft.class05776;
import minecraft.class05778;
import minecraft.class05780;
import minecraft.class05782;
import minecraft.class05939;
import minecraft.class05940;
import minecraft.class05968;
import minecraft.class06278;
import minecraft.class06284;
import minecraft.class06285;
import minecraft.class06286;
import minecraft.class06288;
import minecraft.class06289;
import minecraft.class06295;
import minecraft.class06296;
import minecraft.class06298;
import minecraft.class06300;
import minecraft.class06301;
import minecraft.class06303;
import minecraft.class06309;
import minecraft.class06315;
import minecraft.class06316;
import minecraft.class06317;
import minecraft.class07049;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07428;
import minecraft.class07438;
import minecraft.class07789;
import minecraft.class08041;
import minecraft.class08092;
import net.caffeinemc.mods.lithium.common.ai.useless_behaviors.LithiumEmptyBehavior;

public class class05772 {
    private static final float u = 0.4f;
    public static final int N = 5;
    public static final int y = 2;
    public static final float L = 0.5f;

    public static ImmutableList<Pair<Integer, ? extends class04142<? super class08041>>> L(class03556<class05672> class035563, float f) {
        return ImmutableList.of((Object)Pair.of((Object)2, class05742.N((class05378<class06289>)class05378.y, f, 1, 150, 1200)), (Object)Pair.of((Object)3, class05757.N((class03556<class05369> class035562) -> class035562.N(class03927.m), (class05378<class06289>)class05378.y)), (Object)Pair.of((Object)3, (Object)new class05752()), (Object)Pair.of((Object)5, new class05747((Map<class05378<?>, class05367>)ImmutableMap.of((Object)class05378.y, (Object)class05367.field_18457), ImmutableList.of((Object)Pair.of(class05704.N(f), (Object)1), (Object)Pair.of(class05727.N(f), (Object)4), (Object)Pair.of((Object)class04625.N((float)f, (int)4), (Object)2), (Object)Pair.of((Object)new class05782(20, 40), (Object)2)))), class05772.y(), (Object)Pair.of((Object)99, class05754.N()));
    }

    public static ImmutableList<Pair<Integer, ? extends class04142<? super class08041>>> M(class03556<class05672> class035562, float f) {
        return ImmutableList.of((Object)Pair.of((Object)0, (Object)class06298.N()), (Object)Pair.of((Object)0, (Object)class04145.N((List)ImmutableList.of((Object)Pair.of(class05742.N((class05378<class06289>)class05378.i, f * 1.5f, 2, 150, 200), (Object)6), (Object)Pair.of(class05755.N(f * 1.5f), (Object)2)))), class05772.y(), (Object)Pair.of((Object)99, (Object)class06303.N()));
    }

    public static ImmutableList<Pair<Integer, ? extends class04142<? super class08041>>> B(class03556<class05672> class035562, float f) {
        return ImmutableList.of((Object)Pair.of((Object)0, (Object)class04137.N((class04118)class04137.N(class05772::y), (class04118)class04145.N((List)ImmutableList.of((Object)Pair.of((Object)class06286.N((float)f), (Object)5), (Object)Pair.of(class05755.N(f * 1.1f), (Object)2))))), (Object)Pair.of((Object)0, (Object)new class06284(600, 600)), (Object)Pair.of((Object)2, (Object)class04137.N((class04118)class04137.N(class05772::N), (class04118)class06317.N((int)24, (float)(f * 1.4f), (int)1))), class05772.y(), (Object)Pair.of((Object)99, (Object)class06303.N()));
    }

    public static ImmutableList<Pair<Integer, ? extends class04142<? super class08041>>> Z(class03556<class05672> class035562, float f) {
        int n = 2;
        return ImmutableList.of((Object)Pair.of((Object)0, (Object)class06301.N((int)15, (int)3)), (Object)Pair.of((Object)1, (Object)class06317.N((int)32, (float)(f * 1.25f), (int)2)), class05772.y());
    }

    public static ImmutableList<Pair<Integer, ? extends class04142<? super class08041>>> i(class03556<class05672> class035562, float f) {
        return ImmutableList.of((Object)Pair.of((Object)2, new class05747(ImmutableList.of((Object)Pair.of(class05750.N(class07078.ye, 8, class05378.b, f, 2), (Object)2), (Object)Pair.of(class05750.N(class07078.ye, 8, class07077::q, class07077::q, class05378.j, f, 2), (Object)1), (Object)Pair.of(class05750.N(class07078.l, 8, class05378.b, f, 2), (Object)1), (Object)Pair.of(class05755.N(f), (Object)1), (Object)Pair.of(class05771.N(f, 2), (Object)1), (Object)Pair.of((Object)new class06315(f), (Object)1), (Object)Pair.of((Object)new class05782(30, 60), (Object)1)))), (Object)Pair.of((Object)3, (Object)new class06285(100)), (Object)Pair.of((Object)3, class05778.N(class07078.Ly, 4)), (Object)Pair.of((Object)3, (Object)new class05780(400, 1600)), (Object)Pair.of((Object)3, new class05736((Map<class05378<?>, class05367>)ImmutableMap.of(), (Set<class05378<?>>)ImmutableSet.of((Object)class05378.b), class05753.field_18348, class05769.field_18855, ImmutableList.of((Object)Pair.of((Object)new class05759(), (Object)1)))), (Object)Pair.of((Object)3, new class05736((Map<class05378<?>, class05367>)ImmutableMap.of(), (Set<class05378<?>>)ImmutableSet.of((Object)class05378.j), class05753.field_18348, class05769.field_18855, ImmutableList.of((Object)Pair.of((Object)new class05776(), (Object)1)))), class05772.N(), (Object)Pair.of((Object)99, class05754.N()));
    }

    public static ImmutableList<Pair<Integer, ? extends class04142<? super class08041>>> u(class03556<class05672> class035563, float f) {
        return ImmutableList.of((Object)Pair.of((Object)2, (Object)class04145.N((List)ImmutableList.of((Object)Pair.of(class05767.N((class05378<class06289>)class05378.i, 0.4f, 40), (Object)2), (Object)Pair.of(class05761.N(), (Object)2)))), (Object)Pair.of((Object)10, (Object)new class05780(400, 1600)), (Object)Pair.of((Object)10, class05778.N(class07078.Ly, 4)), (Object)Pair.of((Object)2, class05742.N((class05378<class06289>)class05378.i, f, 6, 100, 200)), (Object)Pair.of((Object)3, (Object)new class06285(100)), (Object)Pair.of((Object)3, class05757.N((class03556<class05369> class035562) -> class035562.N(class03927.P), (class05378<class06289>)class05378.i)), (Object)Pair.of((Object)3, new class05736((Map<class05378<?>, class05367>)ImmutableMap.of(), (Set<class05378<?>>)ImmutableSet.of((Object)class05378.b), class05753.field_18348, class05769.field_18855, ImmutableList.of((Object)Pair.of((Object)new class05759(), (Object)1)))), class05772.N(), (Object)Pair.of((Object)99, class05754.N()));
    }

    private static boolean y(class04782 class047822, class07438 class074382) {
        class04877 class048772 = class047822.method_19502(class074382.method_24515());
        return class048772 != null && class048772.i();
    }

    private static Pair<Integer, class04142<class07438>> y() {
        return Pair.of((Object)5, new class05747(ImmutableList.of((Object)Pair.of(class05745.N(class07078.ye, 8.0f), (Object)2), (Object)Pair.of(class05745.N(class07078.Ly, 8.0f), (Object)2), (Object)Pair.of((Object)new class05782(30, 60), (Object)8))));
    }

    public static ImmutableList<Pair<Integer, ? extends class04142<? super class08041>>> y(class03556<class05672> class035562, float f) {
        Object object = class035562.N(class05672.M) ? new class01348() : new class05735();
        return ImmutableList.of(class05772.y(), (Object)Pair.of((Object)5, new class05747(ImmutableList.of((Object)Pair.of((Object)object, (Object)7), (Object)Pair.of(class05767.N((class05378<class06289>)class05378.L, 0.4f, 4), (Object)2), (Object)Pair.of((Object)class06300.N((class05378)class05378.L, (float)0.4f, (int)1, (int)10), (Object)5), (Object)Pair.of((Object)class06295.N((class05378)class05378.R, (float)f, (int)1, (int)6, (class05378)class05378.L), (Object)5), (Object)Pair.of((Object)new class06288(), (Object)(class035562.N(class05672.M) ? 2 : 5)), (Object)Pair.of((Object)new class01334(), (Object)(class035562.N(class05672.M) ? 4 : 7))))), (Object)Pair.of((Object)10, (Object)new class05780(400, 1600)), (Object)Pair.of((Object)10, class05778.N(class07078.Ly, 4)), (Object)Pair.of((Object)2, class05742.N((class05378<class06289>)class05378.L, f, 9, 100, 1200)), (Object)Pair.of((Object)3, (Object)new class06285(100)), (Object)Pair.of((Object)99, class05754.N()));
    }

    public static ImmutableList<Pair<Integer, ? extends class04142<? super class08041>>> N(class03556<class05672> class035563, float f) {
        return ImmutableList.of((Object)Pair.of((Object)0, new class05739(0.8f)), (Object)Pair.of((Object)0, class05758.N()), (Object)Pair.of((Object)0, (Object)new class05770(45, 90)), (Object)Pair.of((Object)0, (Object)new class05768()), (Object)Pair.of((Object)0, (Object)class06309.N()), (Object)Pair.of((Object)0, (Object)class06296.N()), (Object)Pair.of((Object)0, (Object)class06316.N()), (Object)Pair.of((Object)0, class05757.N(((class05672)((Object)class035563.N())).y(), (class05378<class06289>)class05378.L)), (Object)Pair.of((Object)0, class05757.N(((class05672)((Object)class035563.N())).L(), (class05378<class06289>)class05378.u)), (Object)Pair.of((Object)1, (Object)new class05738()), (Object)Pair.of((Object)2, (Object)class05940.N()), (Object)Pair.of((Object)3, (Object)new class05766(f)), (Object[])new Pair[]{Pair.of((Object)5, (Object)class01522.N((float)f, (boolean)false, (int)4)), Pair.of((Object)6, (Object)class05772.N(((class05672)((Object)class035563.N())).L(), class05378.L, class05378.u, true, Optional.empty(), (class047822, class072092) -> true)), Pair.of((Object)7, (Object)new class05939(f)), Pair.of((Object)8, (Object)class05968.N((float)f)), Pair.of((Object)10, class05743.N(class035562 -> class035562.N(class03927.m), (class05378<class06289>)class05378.y, false, Optional.of((byte)14), class05772::N)), Pair.of((Object)10, class05743.N(class035562 -> class035562.N(class03927.P), (class05378<class06289>)class05378.i, true, Optional.of((byte)14))), Pair.of((Object)10, class05760.N()), Pair.of((Object)10, class05712.N())});
    }

    private static class04142 N(Predicate predicate, class05378 class053782, class05378 class053783, boolean bl, Optional optional, BiPredicate biPredicate) {
        if (predicate == class05369.N) {
            return LithiumEmptyBehavior.EMPTY_BEHAVIOR_SENTINEL;
        }
        return class05743.N(predicate, (class05378<class06289>)class053782, (class05378<class06289>)class053783, bl, optional, biPredicate);
    }

    public static ImmutableList<Pair<Integer, ? extends class04142<? super class08041>>> N(float f) {
        return ImmutableList.of((Object)Pair.of((Object)0, (Object)new class05738(80, 120)), class05772.N(), (Object)Pair.of((Object)5, (Object)class06278.N()), (Object)Pair.of((Object)5, new class05747((Map<class05378<?>, class05367>)ImmutableMap.of((Object)class05378.Z, (Object)class05367.field_18457), ImmutableList.of((Object)Pair.of(class05750.N(class07078.ye, 8, class05378.b, f, 2), (Object)2), (Object)Pair.of(class05750.N(class07078.l, 8, class05378.b, f, 2), (Object)1), (Object)Pair.of(class05755.N(f), (Object)1), (Object)Pair.of(class05771.N(f, 2), (Object)1), (Object)Pair.of((Object)new class06315(f), (Object)2), (Object)Pair.of((Object)new class05782(20, 40), (Object)2)))), (Object)Pair.of((Object)99, class05754.N()));
    }

    private static boolean N(class04782 class047822, class07209 class072092) {
        class00500 class005002 = class047822.method_8320(class072092);
        return class005002.N(class01210.F) && (Boolean)class005002.L((class08092)class07789.L) == false;
    }

    private static Pair<Integer, class04142<class07438>> N() {
        return Pair.of((Object)5, new class05747(ImmutableList.of((Object)Pair.of(class05745.N(class07078.l, 8.0f), (Object)8), (Object)Pair.of(class05745.N(class07078.ye, 8.0f), (Object)2), (Object)Pair.of(class05745.N(class07078.Ly, 8.0f), (Object)2), (Object)Pair.of(class05745.N(class07428.field_6294, 8.0f), (Object)1), (Object)Pair.of(class05745.N(class07428.field_6300, 8.0f), (Object)1), (Object)Pair.of(class05745.N(class07428.field_34447, 8.0f), (Object)1), (Object)Pair.of(class05745.N(class07428.field_30092, 8.0f), (Object)1), (Object)Pair.of(class05745.N(class07428.field_24460, 8.0f), (Object)1), (Object)Pair.of(class05745.N(class07428.field_6302, 8.0f), (Object)1), (Object)Pair.of((Object)new class05782(30, 60), (Object)2))));
    }

    private static boolean N(class04782 class047822, class07438 class074382) {
        class04877 class048772 = class047822.method_19502(class074382.method_24515());
        return class048772 != null && class048772.T() && !class048772.i() && !class048772.R();
    }

    public static ImmutableList<Pair<Integer, ? extends class04142<? super class08041>>> R(class03556<class05672> class035562, float f) {
        float f2 = f * 1.5f;
        return ImmutableList.of((Object)Pair.of((Object)0, class05756.N()), (Object)Pair.of((Object)1, class05773.y((class05378<? extends class07049>)class05378.Y, f2, 6, false)), (Object)Pair.of((Object)1, class05773.y((class05378<? extends class07049>)class05378.w, f2, 6, false)), (Object)Pair.of((Object)3, class05755.N(f2, 2, 2)), class05772.y());
    }
}

