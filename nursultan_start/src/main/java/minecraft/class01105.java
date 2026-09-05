/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02415
 *  minecraft.class02441
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class08794
 */
package minecraft;

import java.util.Set;
import minecraft.class01686;
import minecraft.class02415;
import minecraft.class02441;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class08794;

public class class01105
extends class06078<class08794> {
    public static final String N = "red_thing";
    public static final float y = 16.0f;
    public static final class02415 L = new class02441(false, 5.0f, 2.0f, 2.0f, 1.99f, 24.0f, Set.of("head", "beak", "red_thing"));
    private final class01686 u;
    private final class01686 i;
    private final class01686 R;
    private final class01686 M;
    private final class01686 B;

    protected static class04792 L() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class04839 class048393 = class048392.N("head", class04822.L().N(0, 0).N(-2.0f, -6.0f, -2.0f, 4.0f, 6.0f, 3.0f), class04838.N((float)0.0f, (float)15.0f, (float)-4.0f));
        class048393.N("beak", class04822.L().N(14, 0).N(-2.0f, -4.0f, -4.0f, 4.0f, 2.0f, 2.0f), class04838.N);
        class048393.N(N, class04822.L().N(14, 4).N(-1.0f, -2.0f, -3.0f, 2.0f, 2.0f, 2.0f), class04838.N);
        class048392.N("body", class04822.L().N(0, 9).N(-3.0f, -4.0f, -3.0f, 6.0f, 8.0f, 6.0f), class04838.N((float)0.0f, (float)16.0f, (float)0.0f, (float)1.5707964f, (float)0.0f, (float)0.0f));
        class04822 class048222 = class04822.L().N(26, 0).N(-1.0f, 0.0f, -3.0f, 3.0f, 5.0f, 3.0f);
        class048392.N("right_leg", class048222, class04838.N((float)-2.0f, (float)19.0f, (float)1.0f));
        class048392.N("left_leg", class048222, class04838.N((float)1.0f, (float)19.0f, (float)1.0f));
        class048392.N("right_wing", class04822.L().N(24, 13).N(0.0f, 0.0f, -3.0f, 1.0f, 4.0f, 6.0f), class04838.N((float)-4.0f, (float)13.0f, (float)0.0f));
        class048392.N("left_wing", class04822.L().N(24, 13).N(-1.0f, 0.0f, -3.0f, 1.0f, 4.0f, 6.0f), class04838.N((float)4.0f, (float)13.0f, (float)0.0f));
        return class047922;
    }

    public class01105(class01686 class016862) {
        super(class016862);
        this.u = class016862.y("head");
        this.i = class016862.y("right_leg");
        this.R = class016862.y("left_leg");
        this.M = class016862.y("right_wing");
        this.B = class016862.y("left_wing");
    }

    public static class04806 y() {
        return class04806.N((class04792)class01105.L(), (int)64, (int)32);
    }

    public void method_2819(class08794 class087942) {
        super.method_2819((Object)class087942);
        float f = (class04995.m((double)class087942.N) + 1.0f) * class087942.y;
        this.u.i = class087942.h * ((float)Math.PI / 180);
        this.u.R = class087942.D * ((float)Math.PI / 180);
        float f2 = class087942.Ny;
        float f3 = class087942.NN;
        this.i.i = class04995.P((double)(f3 * 0.6662f)) * 1.4f * f2;
        this.R.i = class04995.P((double)(f3 * 0.6662f + (float)Math.PI)) * 1.4f * f2;
        this.M.M = f;
        this.B.M = -f;
    }
}

