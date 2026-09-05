/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class08268
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
import minecraft.class08268;

public class class03095
extends class06078<class08268> {
    private static final String N = "ribcage";
    private static final String y = "center_head";
    private static final String L = "right_head";
    private static final String u = "left_head";
    private static final float i = 0.065f;
    private static final float R = 0.265f;
    private final class01686 M;
    private final class01686 B;
    private final class01686 Z;
    private final class01686 z;
    private final class01686 U;

    public class03095(class01686 class016862) {
        super(class016862);
        this.z = class016862.y(N);
        this.U = class016862.y("tail");
        this.M = class016862.y(y);
        this.B = class016862.y(L);
        this.Z = class016862.y(u);
    }

    private static void N(class08268 class082682, class01686 class016862, int n) {
        class016862.R = (class082682.y[n] - class082682.x) * ((float)Math.PI / 180);
        class016862.i = class082682.N[n] * ((float)Math.PI / 180);
    }

    public void method_2819(class08268 class082682) {
        super.method_2819((Object)class082682);
        class03095.N(class082682, this.B, 0);
        class03095.N(class082682, this.Z, 1);
        float f = class04995.P((double)(class082682.P * 0.1f));
        this.z.i = (0.065f + 0.05f * f) * (float)Math.PI;
        this.U.N(-2.0f, 6.9f + class04995.P((double)this.z.i) * 10.0f, -0.5f + class04995.m((double)this.z.i) * 10.0f);
        this.U.i = (0.265f + 0.1f * f) * (float)Math.PI;
        this.M.R = class082682.D * ((float)Math.PI / 180);
        this.M.i = class082682.h * ((float)Math.PI / 180);
    }

    public static class04806 N(class04834 class048342) {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N("shoulders", class04822.L().N(0, 16).N(-10.0f, 3.9f, -0.5f, 20.0f, 3.0f, 3.0f, class048342), class04838.N);
        float f = 0.20420352f;
        class048392.N(N, class04822.L().N(0, 22).N(0.0f, 0.0f, 0.0f, 3.0f, 10.0f, 3.0f, class048342).N(24, 22).N(-4.0f, 1.5f, 0.5f, 11.0f, 2.0f, 2.0f, class048342).N(24, 22).N(-4.0f, 4.0f, 0.5f, 11.0f, 2.0f, 2.0f, class048342).N(24, 22).N(-4.0f, 6.5f, 0.5f, 11.0f, 2.0f, 2.0f, class048342), class04838.N((float)-2.0f, (float)6.9f, (float)-0.5f, (float)0.20420352f, (float)0.0f, (float)0.0f));
        class048392.N("tail", class04822.L().N(12, 22).N(0.0f, 0.0f, 0.0f, 3.0f, 6.0f, 3.0f, class048342), class04838.N((float)-2.0f, (float)(6.9f + class04995.P((double)0.2042035162448883) * 10.0f), (float)(-0.5f + class04995.m((double)0.2042035162448883) * 10.0f), (float)0.83252203f, (float)0.0f, (float)0.0f));
        class048392.N(y, class04822.L().N(0, 0).N(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f, class048342), class04838.N);
        class04822 class048222 = class04822.L().N(32, 0).N(-4.0f, -4.0f, -4.0f, 6.0f, 6.0f, 6.0f, class048342);
        class048392.N(L, class048222, class04838.N((float)-8.0f, (float)4.0f, (float)0.0f));
        class048392.N(u, class048222, class04838.N((float)10.0f, (float)4.0f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }
}

