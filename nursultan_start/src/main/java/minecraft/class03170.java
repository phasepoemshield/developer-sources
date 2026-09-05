/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class02142
 *  minecraft.class02151
 *  minecraft.class02405
 *  minecraft.class03301
 *  minecraft.class03556
 *  minecraft.class04025
 *  minecraft.class04033
 *  minecraft.class04050
 *  minecraft.class04116
 *  minecraft.class04227
 *  minecraft.class04297
 *  minecraft.class04308
 *  minecraft.class04321
 *  minecraft.class04336
 *  minecraft.class04540
 *  minecraft.class05946
 *  minecraft.class06055
 *  minecraft.class06386
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07830
 */
package minecraft;

import java.util.List;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class02142;
import minecraft.class02151;
import minecraft.class02405;
import minecraft.class03151;
import minecraft.class03159;
import minecraft.class03163;
import minecraft.class03165;
import minecraft.class03178;
import minecraft.class03180;
import minecraft.class03181;
import minecraft.class03187;
import minecraft.class03189;
import minecraft.class03238;
import minecraft.class03301;
import minecraft.class03556;
import minecraft.class04025;
import minecraft.class04033;
import minecraft.class04050;
import minecraft.class04116;
import minecraft.class04227;
import minecraft.class04297;
import minecraft.class04308;
import minecraft.class04321;
import minecraft.class04336;
import minecraft.class04540;
import minecraft.class05946;
import minecraft.class06055;
import minecraft.class06386;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07830;

public class class03170 {
    public static final class04297 N = class02405.N((class07830)class07830.field_13197);
    public static final class04297 y = class02405.N((class07830)class07830.field_13203);
    public static final class04297 L = class02405.N((class07830)class07830.field_13195);
    public static final class04297 u = class02405.N((class07830)class07830.field_13194);
    public static final class04297 i = class02405.N((class07830)class07830.field_13200);
    public static final class04297 R = class04308.N((class06055)class06055.N(), (class06055)class06055.y());
    public static final class04297 M = class04308.N((class06055)class06055.y((int)10), (class06055)class06055.L((int)10));
    public static final class04297 B = class04308.N((class06055)class06055.y((int)8), (class06055)class06055.L((int)8));
    public static final class04297 Z = class04308.N((class06055)class06055.y((int)4), (class06055)class06055.L((int)4));
    public static final class04297 z = class04308.N((class06055)class06055.N(), (class06055)class06055.N((int)256));

    public static class04033 N(class00891 class008912) {
        return class04033.N((class04025)class04025.N((class00500)class008912.W(), (class00753)class07209.field_10980));
    }

    public static class03556<class04336> N(class03556<class03238<?, ?>> class035562, class04297 ... class04297Array) {
        return class03556.N((Object)new class04336(class035562, List.of(class04297Array)));
    }

    public static <FC extends class06386, F extends class06391<FC>> class03556<class04336> N(F f, FC FC, class04297 ... class04297Array) {
        return class03170.N(class03556.N(new class03238<FC, F>(f, FC)), class04297Array);
    }

    public static <FC extends class06386, F extends class06391<FC>> class03556<class04336> N(F f, FC FC) {
        return class03170.N(f, FC, class04025.L);
    }

    public static <FC extends class06386, F extends class06391<FC>> class03556<class04336> N(F f, FC FC, class04025 class040252) {
        return class03170.N(f, FC, new class04297[]{class04033.N((class04025)class040252)});
    }

    public static class04050 N() {
        return class04033.N((class04025)class04025.L);
    }

    public static class05946<class04336> N(String string) {
        return class05946.N((class05946)class04227.ys, (class01894)class01894.y((String)string));
    }

    public static void N(class04116<class04336> class041162, class05946<class04336> class059462, class03556<class03238<?, ?>> class035562, List<class04297> list) {
        class041162.N(class059462, (Object)new class04336(class035562, List.copyOf(list)));
    }

    public static void N(class04116<class04336> class041162, class05946<class04336> class059462, class03556<class03238<?, ?>> class035562, class04297 ... class04297Array) {
        class03170.N(class041162, class059462, class035562, List.of(class04297Array));
    }

    public static class04297 N(int n, float f, int n2) {
        float f2 = 1.0f / f;
        if (Math.abs(f2 - (float)((int)f2)) > 1.0E-5f) {
            throw new IllegalStateException("Chance data cannot be represented as list weight");
        }
        class04540 class045402 = class04540.y().N((Object)class02151.N((int)n), (int)f2 - 1).N((Object)class02151.N((int)(n + n2)), 1).N();
        return class04321.N((class02142)new class03301(class045402));
    }

    public static void N(class04116<class04336> class041162) {
        class03151.N(class041162);
        class03165.N(class041162);
        class03181.N(class041162);
        class03159.N(class041162);
        class03187.N(class041162);
        class03163.N(class041162);
        class03178.N(class041162);
        class03189.N(class041162);
        class03180.N(class041162);
    }
}

