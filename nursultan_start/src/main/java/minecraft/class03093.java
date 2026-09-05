/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01421
 *  minecraft.class01686
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class06230
 *  minecraft.class06275
 *  minecraft.class08260
 */
package minecraft;

import minecraft.class01421;
import minecraft.class01686;
import minecraft.class03094;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class06230;
import minecraft.class06275;
import minecraft.class08260;

public class class03093
extends class06078<class08260>
implements class06230,
class06275<class08260> {
    protected final class01686 N;
    private final class01686 y;
    private final class01686 L;
    private final class01686 u;
    private final class01686 i;

    public class03093(class01686 class016862) {
        super(class016862);
        this.y = class016862.y("head");
        this.N = this.y.y("nose");
        this.L = class016862.y("right_leg");
        this.u = class016862.y("left_leg");
        this.i = class016862.y("arms");
    }

    public class01686 y() {
        return this.N;
    }

    public void N(class08260 class082602, class01421 class014212) {
        this.field_54014.N(class014212);
        this.i.N(class014212);
    }

    public void method_2819(class08260 class082602) {
        super.method_2819((Object)class082602);
        this.y.R = class082602.D * ((float)Math.PI / 180);
        this.y.i = class082602.h * ((float)Math.PI / 180);
        this.L.i = class04995.P((double)(class082602.NN * 0.6662f)) * 1.4f * class082602.Ny * 0.5f;
        this.u.i = class04995.P((double)(class082602.NN * 0.6662f + (float)Math.PI)) * 1.4f * class082602.Ny * 0.5f;
        float f = 0.01f * (float)(class082602.N % 10);
        this.N.i = class04995.m((double)(class082602.P * f)) * 4.5f * ((float)Math.PI / 180);
        this.N.M = class04995.P((double)(class082602.P * f)) * 2.5f * ((float)Math.PI / 180);
        if (class082602.y) {
            this.N.N(0.0f, 1.0f, -1.5f);
            this.N.i = -0.9f;
        }
    }

    public static class04806 N() {
        class04792 class047922 = class03094.N();
        class04839 class048392 = class047922.N().N("head", class04822.L().N(0, 0).N(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f), class04838.N);
        class048392.N("hat", class04822.L().N(0, 64).N(0.0f, 0.0f, 0.0f, 10.0f, 2.0f, 10.0f), class04838.N((float)-5.0f, (float)-10.03125f, (float)-5.0f)).N("hat2", class04822.L().N(0, 76).N(0.0f, 0.0f, 0.0f, 7.0f, 4.0f, 7.0f), class04838.N((float)1.75f, (float)-4.0f, (float)2.0f, (float)-0.05235988f, (float)0.0f, (float)0.02617994f)).N("hat3", class04822.L().N(0, 87).N(0.0f, 0.0f, 0.0f, 4.0f, 4.0f, 4.0f), class04838.N((float)1.75f, (float)-4.0f, (float)2.0f, (float)-0.10471976f, (float)0.0f, (float)0.05235988f)).N("hat4", class04822.L().N(0, 95).N(0.0f, 0.0f, 0.0f, 1.0f, 2.0f, 1.0f, new class04834(0.25f)), class04838.N((float)1.75f, (float)-2.0f, (float)2.0f, (float)-0.20943952f, (float)0.0f, (float)0.10471976f));
        class048392.y("nose").N("mole", class04822.L().N(0, 0).N(0.0f, 3.0f, -6.75f, 1.0f, 1.0f, 1.0f, new class04834(-0.25f)), class04838.N((float)0.0f, (float)-2.0f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)64, (int)128);
    }

    public class01686 R() {
        return this.y;
    }
}

