/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01188
 *  minecraft.class01421
 *  minecraft.class01686
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class05402
 *  minecraft.class06275
 *  minecraft.class07070
 *  minecraft.class08118
 *  minecraft.class08283
 *  minecraft.class08467
 */
package minecraft;

import minecraft.class01188;
import minecraft.class01421;
import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class05402;
import minecraft.class06275;
import minecraft.class07070;
import minecraft.class08118;
import minecraft.class08283;
import minecraft.class08467;

public class class03090<S extends class08283>
extends class01188<S>
implements class06275<S> {
    public class03090(class01686 class016862) {
        super(class016862);
    }

    public static class04806 y() {
        return class03090.N().N(class047922 -> {
            class047922.N().N("head").N();
            return class047922;
        });
    }

    public void N(class08283 class082832, class01421 class014212) {
        this.N((class08467)class082832, class07070.field_6183, class014212);
    }

    public static class08118<class04806> N(class04834 class048342, class04834 class048343) {
        return class03090.N(class03090::N, (class04834)class048342, (class04834)class048343).N((T class047922) -> class04806.N((class04792)class047922, (int)64, (int)32));
    }

    private static class04792 N(class04834 class048342) {
        class04792 class047922 = class01188.N((class04834)class048342, (float)0.0f);
        class04839 class048392 = class047922.N();
        class04839 class048393 = class048392.N("head", class04822.L().N(0, 0).N(-4.0f, -10.0f, -4.0f, 8.0f, 8.0f, 8.0f, class048342), class04838.N);
        class048392.N("body", class04822.L().N(16, 16).N(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, class048342.N(0.1f)), class04838.N);
        class048392.N("right_leg", class04822.L().N(0, 16).N(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, class048342.N(0.1f)), class04838.N((float)-2.0f, (float)12.0f, (float)0.0f));
        class048392.N("left_leg", class04822.L().N(0, 16).N().N(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, class048342.N(0.1f)), class04838.N((float)2.0f, (float)12.0f, (float)0.0f));
        class048393.y("hat").N("hat_rim", class04822.L(), class04838.N);
        return class047922;
    }

    public void method_2819(S s) {
        super.method_2819(s);
        class05402.N((class01686)this.U, (class01686)this.z, (boolean)((class08283)s).N, s);
    }

    public static class04806 N() {
        class04792 class047922 = class01188.N((class04834)class04834.N, (float)0.0f);
        class04839 class048392 = class047922.N();
        class048392.N("head", new class04822().N(0, 0).N(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f).N(24, 0).N(-1.0f, -3.0f, -6.0f, 2.0f, 4.0f, 2.0f), class04838.N).N("hat", class04822.L().N(32, 0).N(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f, new class04834(0.5f)), class04838.N).N("hat_rim", class04822.L().N(30, 47).N(-8.0f, -8.0f, -6.0f, 16.0f, 16.0f, 1.0f), class04838.y((float)-1.5707964f, (float)0.0f, (float)0.0f));
        class048392.N("body", class04822.L().N(16, 20).N(-4.0f, 0.0f, -3.0f, 8.0f, 12.0f, 6.0f).N(0, 38).N(-4.0f, 0.0f, -3.0f, 8.0f, 20.0f, 6.0f, new class04834(0.05f)), class04838.N);
        class048392.N("right_arm", class04822.L().N(44, 22).N(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f), class04838.N((float)-5.0f, (float)2.0f, (float)0.0f));
        class048392.N("left_arm", class04822.L().N(44, 22).N().N(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f), class04838.N((float)5.0f, (float)2.0f, (float)0.0f));
        class048392.N("right_leg", class04822.L().N(0, 22).N(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f), class04838.N((float)-2.0f, (float)12.0f, (float)0.0f));
        class048392.N("left_leg", class04822.L().N(0, 22).N().N(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f), class04838.N((float)2.0f, (float)12.0f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }
}

