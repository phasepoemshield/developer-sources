/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00808
 *  minecraft.class01894
 *  minecraft.class02947
 *  minecraft.class04116
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04483
 *  minecraft.class04513
 *  minecraft.class04540
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class06273
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07078
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import java.util.function.Consumer;
import minecraft.class00808;
import minecraft.class01894;
import minecraft.class02947;
import minecraft.class04116;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04483;
import minecraft.class04513;
import minecraft.class04540;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06273;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class08218;
import org.jspecify.annotations.Nullable;

public class class08221 {
    private static final class08218 N = class08218.N("trial_chamber/breeze");
    private static final class08218 y = class08218.N("trial_chamber/melee/husk");
    private static final class08218 L = class08218.N("trial_chamber/melee/spider");
    private static final class08218 u = class08218.N("trial_chamber/melee/zombie");
    private static final class08218 i = class08218.N("trial_chamber/ranged/poison_skeleton");
    private static final class08218 R = class08218.N("trial_chamber/ranged/skeleton");
    private static final class08218 M = class08218.N("trial_chamber/ranged/stray");
    private static final class08218 B = class08218.N("trial_chamber/slow_ranged/poison_skeleton");
    private static final class08218 Z = class08218.N("trial_chamber/slow_ranged/skeleton");
    private static final class08218 z = class08218.N("trial_chamber/slow_ranged/stray");
    private static final class08218 U = class08218.N("trial_chamber/small_melee/baby_zombie");
    private static final class08218 E = class08218.N("trial_chamber/small_melee/cave_spider");
    private static final class08218 W = class08218.N("trial_chamber/small_melee/silverfish");
    private static final class08218 m = class08218.N("trial_chamber/small_melee/slime");

    private static class04483 L() {
        return class04513.y().y(3.0f).u(0.5f).y(20);
    }

    private static class04483 y() {
        return class04513.y().y(4.0f).u(2.0f).y(160);
    }

    private static <T extends class07049> class00808 N(class07078<T> class070782, class05946<class05074> class059462) {
        return class08221.N(class070782, class070012 -> {}, class059462);
    }

    private static <T extends class07049> class00808 N(class07078<T> class070782) {
        return class08221.N(class070782, class070012 -> {}, null);
    }

    public static void N(class04116<class04513> class041162) {
        class08221.N(class041162, N, class04513.y().y(1.0f).u(0.5f).y(20).N(2.0f).L(1.0f).N(class04540.N((Object)class08221.N(class07078.v))).N(), class04513.y().u(0.5f).y(20).N(4.0f).L(1.0f).N(class04540.N((Object)class08221.N(class07078.v))).y(class04540.y().N((Object)class06273.NA, 3).N((Object)class06273.Nf, 7).N()).N());
        class08221.N(class041162, y, class08221.L().N(class04540.N((Object)class08221.N(class07078.Nb))).N(), class08221.L().N(class04540.N((Object)class08221.N(class07078.Nb, (class05946<class05074>)class06273.NU))).y(class04540.y().N((Object)class06273.NA, 3).N((Object)class06273.Nf, 7).N()).N());
        class08221.N(class041162, L, class08221.L().N(class04540.N((Object)class08221.N(class07078.yG))).N(), class08221.N().N(class04540.N((Object)class08221.N(class07078.yG))).y(class04540.y().N((Object)class06273.NA, 3).N((Object)class06273.Nf, 7).N()).N());
        class08221.N(class041162, u, class08221.L().N(class04540.N((Object)class08221.N(class07078.yx))).N(), class08221.L().y(class04540.y().N((Object)class06273.NA, 3).N((Object)class06273.Nf, 7).N()).N(class04540.N((Object)class08221.N(class07078.yx, (class05946<class05074>)class06273.NU))).N());
        class08221.N(class041162, i, class08221.L().N(class04540.N((Object)class08221.N(class07078.j))).N(), class08221.L().y(class04540.y().N((Object)class06273.NA, 3).N((Object)class06273.Nf, 7).N()).N(class04540.N((Object)class08221.N(class07078.j, (class05946<class05074>)class06273.Nz))).N());
        class08221.N(class041162, R, class08221.L().N(class04540.N((Object)class08221.N(class07078.ym))).N(), class08221.L().y(class04540.y().N((Object)class06273.NA, 3).N((Object)class06273.Nf, 7).N()).N(class04540.N((Object)class08221.N(class07078.ym, (class05946<class05074>)class06273.Nz))).N());
        class08221.N(class041162, M, class08221.L().N(class04540.N((Object)class08221.N(class07078.yk))).N(), class08221.L().y(class04540.y().N((Object)class06273.NA, 3).N((Object)class06273.Nf, 7).N()).N(class04540.N((Object)class08221.N(class07078.yk, (class05946<class05074>)class06273.Nz))).N());
        class08221.N(class041162, B, class08221.y().N(class04540.N((Object)class08221.N(class07078.j))).N(), class08221.y().y(class04540.y().N((Object)class06273.NA, 3).N((Object)class06273.Nf, 7).N()).N(class04540.N((Object)class08221.N(class07078.j, (class05946<class05074>)class06273.Nz))).N());
        class08221.N(class041162, Z, class08221.y().N(class04540.N((Object)class08221.N(class07078.ym))).N(), class08221.y().y(class04540.y().N((Object)class06273.NA, 3).N((Object)class06273.Nf, 7).N()).N(class04540.N((Object)class08221.N(class07078.ym, (class05946<class05074>)class06273.Nz))).N());
        class08221.N(class041162, z, class08221.y().N(class04540.N((Object)class08221.N(class07078.yk))).N(), class08221.y().y(class04540.y().N((Object)class06273.NA, 3).N((Object)class06273.Nf, 7).N()).N(class04540.N((Object)class08221.N(class07078.yk, (class05946<class05074>)class06273.Nz))).N());
        class08221.N(class041162, U, class04513.y().u(0.5f).y(20).N(class04540.N((Object)class08221.N(class07078.yx, class070012 -> class070012.N("IsBaby", true), null))).N(), class04513.y().u(0.5f).y(20).y(class04540.y().N((Object)class06273.NA, 3).N((Object)class06273.Nf, 7).N()).N(class04540.N((Object)class08221.N(class07078.yx, class070012 -> class070012.N("IsBaby", true), (class05946<class05074>)class06273.NU))).N());
        class08221.N(class041162, E, class08221.L().N(class04540.N((Object)class08221.N(class07078.d))).N(), class08221.N().y(class04540.y().N((Object)class06273.NA, 3).N((Object)class06273.Nf, 7).N()).N(class04540.N((Object)class08221.N(class07078.d))).N());
        class08221.N(class041162, W, class08221.L().N(class04540.N((Object)class08221.N(class07078.yW))).N(), class08221.N().y(class04540.y().N((Object)class06273.NA, 3).N((Object)class06273.Nf, 7).N()).N(class04540.N((Object)class08221.N(class07078.yW))).N());
        class08221.N(class041162, m, class08221.L().N(class04540.y().N((Object)class08221.N(class07078.ys, (class07001 class070012) -> class070012.N("Size", (byte)1)), 3).N((Object)class08221.N(class07078.ys, (class07001 class070012) -> class070012.N("Size", (byte)2)), 1).N()).N(), class08221.N().y(class04540.y().N((Object)class06273.NA, 3).N((Object)class06273.Nf, 7).N()).N(class04540.y().N((Object)class08221.N(class07078.ys, (class07001 class070012) -> class070012.N("Size", (byte)1)), 3).N((Object)class08221.N(class07078.ys, (class07001 class070012) -> class070012.N("Size", (byte)2)), 1).N()).N());
    }

    private static class04483 N() {
        return class04513.y().y(4.0f).u(0.5f).y(20).N(12.0f);
    }

    private static <T extends class07049> class00808 N(class07078<T> class070782, Consumer<class07001> consumer, @Nullable class05946<class05074> class059463) {
        class07001 class070012 = new class07001();
        class070012.N_67("id", class04206.M.y(class070782).toString());
        consumer.accept(class070012);
        Optional<class02947> optional = Optional.ofNullable(class059463).map(class059462 -> new class02947(class059462, 0.0f));
        return new class00808(class070012, Optional.empty(), optional);
    }

    static class05946<class04513> N(String string) {
        return class05946.N((class05946)class04227.yl, (class01894)class01894.y((String)string));
    }

    private static void N(class04116<class04513> class041162, class08218 class082182, class04513 class045132, class04513 class045133) {
        class041162.N(class082182.N(), (Object)class045132);
        class041162.N(class082182.y(), (Object)class045133);
    }

    private static <T extends class07049> class00808 N(class07078<T> class070782, Consumer<class07001> consumer) {
        return class08221.N(class070782, consumer, null);
    }
}

