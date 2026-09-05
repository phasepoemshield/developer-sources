/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02415
 *  minecraft.class02441
 *  minecraft.class04532
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class08476
 */
package minecraft;

import java.util.Set;
import minecraft.class01686;
import minecraft.class02415;
import minecraft.class02441;
import minecraft.class04532;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class08476;

public class class01098
extends class04532<class08476> {
    public static final class02415 N = new class02441(false, 8.0f, 6.0f, Set.of("head"));
    private static final int B = 12;

    static class04792 L() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N("head", class04822.L().N(0, 0).N(-4.0f, -4.0f, -6.0f, 8.0f, 8.0f, 6.0f).N(1, 33).N(-3.0f, 1.0f, -7.0f, 6.0f, 3.0f, 1.0f).N(22, 0).N("right_horn", -5.0f, -5.0f, -5.0f, 1.0f, 3.0f, 1.0f).N(22, 0).N("left_horn", 4.0f, -5.0f, -5.0f, 1.0f, 3.0f, 1.0f), class04838.N((float)0.0f, (float)4.0f, (float)-8.0f));
        class048392.N("body", class04822.L().N(18, 4).N(-6.0f, -10.0f, -7.0f, 12.0f, 18.0f, 10.0f).N(52, 0).N(-2.0f, 2.0f, -8.0f, 4.0f, 6.0f, 1.0f), class04838.N((float)0.0f, (float)5.0f, (float)2.0f, (float)1.5707964f, (float)0.0f, (float)0.0f));
        class04822 class048222 = class04822.L().N().N(0, 16).N(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f);
        class04822 class048223 = class04822.L().N(0, 16).N(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f);
        class048392.N("right_hind_leg", class048223, class04838.N((float)-4.0f, (float)12.0f, (float)7.0f));
        class048392.N("left_hind_leg", class048222, class04838.N((float)4.0f, (float)12.0f, (float)7.0f));
        class048392.N("right_front_leg", class048223, class04838.N((float)-4.0f, (float)12.0f, (float)-5.0f));
        class048392.N("left_front_leg", class048222, class04838.N((float)4.0f, (float)12.0f, (float)-5.0f));
        return class047922;
    }

    public class01098(class01686 class016862) {
        super(class016862);
    }

    public class01686 u() {
        return this.y;
    }

    public static class04806 y() {
        return class04806.N((class04792)class01098.L(), (int)64, (int)64);
    }
}

