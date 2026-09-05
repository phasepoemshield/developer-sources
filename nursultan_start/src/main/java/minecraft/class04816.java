/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class08786
 */
package minecraft;

import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class08786;

public class class04816
extends class06078<class08786> {
    private final class01686 N;
    private final class01686 y;
    private final class01686 L;
    private final class01686 u;
    private final class01686 i;
    private static final int R = 6;

    public class04816(class01686 class016862) {
        super(class016862);
        this.N = class016862.y("head");
        this.L = class016862.y("right_hind_leg");
        this.y = class016862.y("left_hind_leg");
        this.i = class016862.y("right_front_leg");
        this.u = class016862.y("left_front_leg");
    }

    public void method_2819(class08786 class087862) {
        super.method_2819((Object)class087862);
        this.N.R = class087862.D * ((float)Math.PI / 180);
        this.N.i = class087862.h * ((float)Math.PI / 180);
        float f = class087862.Ny;
        float f2 = class087862.NN;
        this.y.i = class04995.P((double)(f2 * 0.6662f)) * 1.4f * f;
        this.L.i = class04995.P((double)(f2 * 0.6662f + (float)Math.PI)) * 1.4f * f;
        this.u.i = class04995.P((double)(f2 * 0.6662f + (float)Math.PI)) * 1.4f * f;
        this.i.i = class04995.P((double)(f2 * 0.6662f)) * 1.4f * f;
    }

    public static class04806 N(class04834 class048342) {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N("head", class04822.L().N(0, 0).N(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, class048342), class04838.N((float)0.0f, (float)6.0f, (float)0.0f));
        class048392.N("body", class04822.L().N(16, 16).N(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, class048342), class04838.N((float)0.0f, (float)6.0f, (float)0.0f));
        class04822 class048222 = class04822.L().N(0, 16).N(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, class048342);
        class048392.N("right_hind_leg", class048222, class04838.N((float)-2.0f, (float)18.0f, (float)4.0f));
        class048392.N("left_hind_leg", class048222, class04838.N((float)2.0f, (float)18.0f, (float)4.0f));
        class048392.N("right_front_leg", class048222, class04838.N((float)-2.0f, (float)18.0f, (float)-4.0f));
        class048392.N("left_front_leg", class048222, class04838.N((float)2.0f, (float)18.0f, (float)-4.0f));
        return class04806.N(class047922, 64, 32);
    }
}

