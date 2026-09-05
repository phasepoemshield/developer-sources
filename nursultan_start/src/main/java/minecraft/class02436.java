/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00236
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
 *  minecraft.class08784
 */
package minecraft;

import minecraft.class00236;
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
import minecraft.class08784;

public class class02436
extends class05452<class08784> {
    public static final float i = 0.87f;
    public static final float R = 0.92f;
    private static final class02415 M = class047922 -> {
        class02436.N(class047922.N());
        return class047922;
    };
    private final class01686 B;
    private final class01686 Z;

    public class02436(class01686 class016862) {
        super(class016862);
        this.B = this.L.y("left_chest");
        this.Z = this.L.y("right_chest");
    }

    public static class04806 y(float f) {
        return class04806.N((class04792)class05452.L((class04834)class04834.N), (int)64, (int)64).N(M).N(y).N(class02415.N((float)f));
    }

    public void method_2819(class08784 class087842) {
        super.method_2819((class08490)class087842);
        this.B.U = class087842.N;
        this.Z.U = class087842.N;
    }

    public static class04806 N(float f, boolean bl) {
        return class00236.y((boolean)bl).N(M).N(bl ? class05452.y : class02415.N).N(class02415.N((float)f));
    }

    private static void N(class04839 class048392) {
        class04839 class048393 = class048392.y("body");
        class04822 class048222 = class04822.L().N(26, 21).N(-4.0f, 0.0f, -2.0f, 8.0f, 8.0f, 3.0f);
        class048393.N("left_chest", class048222, class04838.N((float)6.0f, (float)-8.0f, (float)0.0f, (float)0.0f, (float)-1.5707964f, (float)0.0f));
        class048393.N("right_chest", class048222, class04838.N((float)-6.0f, (float)-8.0f, (float)0.0f, (float)0.0f, (float)1.5707964f, (float)0.0f));
        class04839 class048394 = class048392.y("head_parts").y("head");
        class04822 class048223 = class04822.L().N(0, 12).N(-1.0f, -7.0f, 0.0f, 2.0f, 7.0f, 1.0f);
        class048394.N("left_ear", class048223, class04838.N((float)1.25f, (float)-10.0f, (float)4.0f, (float)0.2617994f, (float)0.0f, (float)0.2617994f));
        class048394.N("right_ear", class048223, class04838.N((float)-1.25f, (float)-10.0f, (float)4.0f, (float)0.2617994f, (float)0.0f, (float)-0.2617994f));
    }

    public static class04806 N(float f) {
        return class04806.N((class04792)class05452.N((class04834)class04834.N), (int)64, (int)64).N(M).N(class02415.N((float)f));
    }
}

