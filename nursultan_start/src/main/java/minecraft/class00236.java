/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02415
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class05452
 *  minecraft.class08490
 */
package minecraft;

import minecraft.class01686;
import minecraft.class02415;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class05452;
import minecraft.class08490;

public class class00236
extends class05452<class08490> {
    private static final String i = "saddle";
    private static final String R = "left_saddle_mouth";
    private static final String M = "left_saddle_line";
    private static final String B = "right_saddle_mouth";
    private static final String Z = "right_saddle_line";
    private static final String z = "head_saddle";
    private static final String U = "mouth_saddle_wrap";
    private final class01686[] E;

    public class00236(class01686 class016862) {
        super(class016862);
        class01686 class016863 = this.u.y(M);
        class01686 class016864 = this.u.y(Z);
        this.E = new class01686[]{class016863, class016864};
    }

    public static class04806 y(boolean bl) {
        class04792 class047922 = bl ? class00236.L((class04834)class04834.N) : class00236.N((class04834)class04834.N);
        class04839 class048392 = class047922.N();
        class04839 class048393 = class048392.y("body");
        class04839 class048394 = class048392.y("head_parts");
        class048393.N(i, class04822.L().N(26, 0).N(-5.0f, -8.0f, -9.0f, 10.0f, 9.0f, 9.0f, new class04834(0.5f)), class04838.N);
        class048394.N(R, class04822.L().N(29, 5).N(2.0f, -9.0f, -6.0f, 1.0f, 2.0f, 2.0f), class04838.N);
        class048394.N(B, class04822.L().N(29, 5).N(-3.0f, -9.0f, -6.0f, 1.0f, 2.0f, 2.0f), class04838.N);
        class048394.N(M, class04822.L().N(32, 2).N(3.1f, -6.0f, -8.0f, 0.0f, 3.0f, 16.0f), class04838.y((float)-0.5235988f, (float)0.0f, (float)0.0f));
        class048394.N(Z, class04822.L().N(32, 2).N(-3.1f, -6.0f, -8.0f, 0.0f, 3.0f, 16.0f), class04838.y((float)-0.5235988f, (float)0.0f, (float)0.0f));
        class048394.N(z, class04822.L().N(1, 1).N(-3.0f, -11.0f, -1.9f, 6.0f, 5.0f, 6.0f, new class04834(0.22f)), class04838.N);
        class048394.N(U, class04822.L().N(19, 0).N(-2.0f, -11.0f, -4.0f, 4.0f, 5.0f, 2.0f, new class04834(0.2f)), class04838.N);
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    public static class04806 N(boolean bl) {
        return class00236.y(bl).N(bl ? y : class02415.N);
    }

    public void method_2819(class08490 class084902) {
        super.method_2819(class084902);
        class01686[] class01686Array = this.E;
        int n = class01686Array.length;
        for (int i = 0; i < n; ++i) {
            class01686Array[i].U = class084902.u;
        }
    }
}

