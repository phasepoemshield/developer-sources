/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class08476
 */
package minecraft;

import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class08476;

public class class04385
extends class06078<class08476> {
    private static final String N = "body0";
    private static final String y = "body1";
    private static final String L = "right_middle_front_leg";
    private static final String u = "left_middle_front_leg";
    private static final String i = "right_middle_hind_leg";
    private static final String R = "left_middle_hind_leg";
    private final class01686 M;
    private final class01686 B;
    private final class01686 Z;
    private final class01686 z;
    private final class01686 U;
    private final class01686 E;
    private final class01686 W;
    private final class01686 m;
    private final class01686 P;

    public class04385(class01686 class016862) {
        super(class016862);
        this.M = class016862.y("head");
        this.B = class016862.y("right_hind_leg");
        this.Z = class016862.y("left_hind_leg");
        this.z = class016862.y(i);
        this.U = class016862.y(R);
        this.E = class016862.y(L);
        this.W = class016862.y(u);
        this.m = class016862.y("right_front_leg");
        this.P = class016862.y("left_front_leg");
    }

    public void method_2819(class08476 class084762) {
        super.method_2819((Object)class084762);
        this.M.R = class084762.D * ((float)Math.PI / 180);
        this.M.i = class084762.h * ((float)Math.PI / 180);
        float f = class084762.NN * 0.6662f;
        float f2 = class084762.Ny;
        float f3 = -(class04995.P((double)(f * 2.0f + 0.0f)) * 0.4f) * f2;
        float f4 = -(class04995.P((double)(f * 2.0f + (float)Math.PI)) * 0.4f) * f2;
        float f5 = -(class04995.P((double)(f * 2.0f + 1.5707964f)) * 0.4f) * f2;
        float f6 = -(class04995.P((double)(f * 2.0f + 4.712389f)) * 0.4f) * f2;
        float f7 = Math.abs(class04995.m((double)(f + 0.0f)) * 0.4f) * f2;
        float f8 = Math.abs(class04995.m((double)(f + (float)Math.PI)) * 0.4f) * f2;
        float f9 = Math.abs(class04995.m((double)(f + 1.5707964f)) * 0.4f) * f2;
        float f10 = Math.abs(class04995.m((double)(f + 4.712389f)) * 0.4f) * f2;
        this.B.R += f3;
        this.Z.R -= f3;
        this.z.R += f4;
        this.U.R -= f4;
        this.E.R += f5;
        this.W.R -= f5;
        this.m.R += f6;
        this.P.R -= f6;
        this.B.M += f7;
        this.Z.M -= f7;
        this.z.M += f8;
        this.U.M -= f8;
        this.E.M += f9;
        this.W.M -= f9;
        this.m.M += f10;
        this.P.M -= f10;
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        int n = 15;
        class048392.N("head", class04822.L().N(32, 4).N(-4.0f, -4.0f, -8.0f, 8.0f, 8.0f, 8.0f), class04838.N((float)0.0f, (float)15.0f, (float)-3.0f));
        class048392.N(N, class04822.L().N(0, 0).N(-3.0f, -3.0f, -3.0f, 6.0f, 6.0f, 6.0f), class04838.N((float)0.0f, (float)15.0f, (float)0.0f));
        class048392.N(y, class04822.L().N(0, 12).N(-5.0f, -4.0f, -6.0f, 10.0f, 8.0f, 12.0f), class04838.N((float)0.0f, (float)15.0f, (float)9.0f));
        class04822 class048222 = class04822.L().N(18, 0).N(-15.0f, -1.0f, -1.0f, 16.0f, 2.0f, 2.0f);
        class04822 class048223 = class04822.L().N(18, 0).N().N(-1.0f, -1.0f, -1.0f, 16.0f, 2.0f, 2.0f);
        float f = 0.7853982f;
        float f2 = 0.3926991f;
        class048392.N("right_hind_leg", class048222, class04838.N((float)-4.0f, (float)15.0f, (float)2.0f, (float)0.0f, (float)0.7853982f, (float)-0.7853982f));
        class048392.N("left_hind_leg", class048223, class04838.N((float)4.0f, (float)15.0f, (float)2.0f, (float)0.0f, (float)-0.7853982f, (float)0.7853982f));
        class048392.N(i, class048222, class04838.N((float)-4.0f, (float)15.0f, (float)1.0f, (float)0.0f, (float)0.3926991f, (float)-0.58119464f));
        class048392.N(R, class048223, class04838.N((float)4.0f, (float)15.0f, (float)1.0f, (float)0.0f, (float)-0.3926991f, (float)0.58119464f));
        class048392.N(L, class048222, class04838.N((float)-4.0f, (float)15.0f, (float)0.0f, (float)0.0f, (float)-0.3926991f, (float)-0.58119464f));
        class048392.N(u, class048223, class04838.N((float)4.0f, (float)15.0f, (float)0.0f, (float)0.0f, (float)0.3926991f, (float)0.58119464f));
        class048392.N("right_front_leg", class048222, class04838.N((float)-4.0f, (float)15.0f, (float)-1.0f, (float)0.0f, (float)-0.7853982f, (float)-0.7853982f));
        class048392.N("left_front_leg", class048223, class04838.N((float)4.0f, (float)15.0f, (float)-1.0f, (float)0.0f, (float)0.7853982f, (float)0.7853982f));
        return class04806.N((class04792)class047922, (int)64, (int)32);
    }
}

