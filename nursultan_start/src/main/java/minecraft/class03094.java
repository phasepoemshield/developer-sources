/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01421
 *  minecraft.class01686
 *  minecraft.class02415
 *  minecraft.class04792
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class06230
 *  minecraft.class06275
 *  minecraft.class08257
 */
package minecraft;

import minecraft.class01421;
import minecraft.class01686;
import minecraft.class02415;
import minecraft.class04792;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class06230;
import minecraft.class06275;
import minecraft.class08257;

public class class03094
extends class06078<class08257>
implements class06230,
class06275<class08257> {
    public static final class02415 N = class02415.N((float)0.5f);
    private final class01686 y;
    private final class01686 L;
    private final class01686 u;
    private final class01686 i;

    public class03094(class01686 class016862) {
        super(class016862);
        this.y = class016862.y("head");
        this.L = class016862.y("right_leg");
        this.u = class016862.y("left_leg");
        this.i = class016862.y("arms");
    }

    public static class04792 y() {
        class04792 class047922 = class03094.N();
        class047922.N().N("head").N();
        return class047922;
    }

    public void N(class08257 class082572, class01421 class014212) {
        this.field_54014.N(class014212);
        this.i.N(class014212);
    }

    public void method_2819(class08257 class082572) {
        super.method_2819((Object)class082572);
        this.y.R = class082572.D * ((float)Math.PI / 180);
        this.y.i = class082572.h * ((float)Math.PI / 180);
        if (class082572.N) {
            this.y.M = 0.3f * class04995.m((double)(0.45f * class082572.P));
            this.y.i = 0.4f;
        } else {
            this.y.M = 0.0f;
        }
        this.L.i = class04995.P((double)(class082572.NN * 0.6662f)) * 1.4f * class082572.Ny * 0.5f;
        this.u.i = class04995.P((double)(class082572.NN * 0.6662f + (float)Math.PI)) * 1.4f * class082572.Ny * 0.5f;
        this.L.R = 0.0f;
        this.u.R = 0.0f;
    }

    public static class04792 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        float f = 0.5f;
        class04839 class048393 = class048392.N("head", class04822.L().N(0, 0).N(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f), class04838.N);
        class048393.N("hat", class04822.L().N(32, 0).N(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f, new class04834(0.51f)), class04838.N).N("hat_rim", class04822.L().N(30, 47).N(-8.0f, -8.0f, -6.0f, 16.0f, 16.0f, 1.0f), class04838.y((float)-1.5707964f, (float)0.0f, (float)0.0f));
        class048393.N("nose", class04822.L().N(24, 0).N(-1.0f, -1.0f, -6.0f, 2.0f, 4.0f, 2.0f), class04838.N((float)0.0f, (float)-2.0f, (float)0.0f));
        class048392.N("body", class04822.L().N(16, 20).N(-4.0f, 0.0f, -3.0f, 8.0f, 12.0f, 6.0f), class04838.N).N("jacket", class04822.L().N(0, 38).N(-4.0f, 0.0f, -3.0f, 8.0f, 20.0f, 6.0f, new class04834(0.5f)), class04838.N);
        class048392.N("arms", class04822.L().N(44, 22).N(-8.0f, -2.0f, -2.0f, 4.0f, 8.0f, 4.0f).N(44, 22).N(4.0f, -2.0f, -2.0f, 4.0f, 8.0f, 4.0f, true).N(40, 38).N(-4.0f, 2.0f, -2.0f, 8.0f, 4.0f, 4.0f), class04838.N((float)0.0f, (float)3.0f, (float)-1.0f, (float)-0.75f, (float)0.0f, (float)0.0f));
        class048392.N("right_leg", class04822.L().N(0, 22).N(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f), class04838.N((float)-2.0f, (float)12.0f, (float)0.0f));
        class048392.N("left_leg", class04822.L().N(0, 22).N().N(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f), class04838.N((float)2.0f, (float)12.0f, (float)0.0f));
        return class047922;
    }

    public class01686 R() {
        return this.y;
    }
}

