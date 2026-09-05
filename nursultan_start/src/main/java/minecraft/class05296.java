/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02415
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class08253
 */
package minecraft;

import minecraft.class01686;
import minecraft.class02415;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class08253;

public class class05296
extends class06078<class08253> {
    public static final class02415 N = class02415.N((float)0.5f);
    private static final String y = "right_bottom_bristle";
    private static final String L = "right_middle_bristle";
    private static final String u = "right_top_bristle";
    private static final String i = "left_top_bristle";
    private static final String R = "left_middle_bristle";
    private static final String M = "left_bottom_bristle";
    private final class01686 B;
    private final class01686 Z;
    private final class01686 z;
    private final class01686 U;
    private final class01686 E;
    private final class01686 W;
    private final class01686 m;
    private final class01686 P;
    private final class01686 s;

    public class05296(class01686 class016862) {
        super(class016862);
        this.B = class016862.y("right_leg");
        this.Z = class016862.y("left_leg");
        this.z = class016862.y("body");
        this.U = this.z.y(y);
        this.E = this.z.y(L);
        this.W = this.z.y(u);
        this.m = this.z.y(i);
        this.P = this.z.y(R);
        this.s = this.z.y(M);
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N("right_leg", class04822.L().N(0, 32).N(-2.0f, 0.0f, -2.0f, 4.0f, 16.0f, 4.0f), class04838.N((float)-4.0f, (float)8.0f, (float)0.0f));
        class048392.N("left_leg", class04822.L().N(0, 55).N(-2.0f, 0.0f, -2.0f, 4.0f, 16.0f, 4.0f), class04838.N((float)4.0f, (float)8.0f, (float)0.0f));
        class04839 class048393 = class048392.N("body", class04822.L().N(0, 0).N(-8.0f, -6.0f, -8.0f, 16.0f, 14.0f, 16.0f), class04838.N((float)0.0f, (float)1.0f, (float)0.0f));
        class048393.N(y, class04822.L().N(16, 65).N(-12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 16.0f, true), class04838.N((float)-8.0f, (float)4.0f, (float)-8.0f, (float)0.0f, (float)0.0f, (float)-1.2217305f));
        class048393.N(L, class04822.L().N(16, 49).N(-12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 16.0f, true), class04838.N((float)-8.0f, (float)-1.0f, (float)-8.0f, (float)0.0f, (float)0.0f, (float)-1.134464f));
        class048393.N(u, class04822.L().N(16, 33).N(-12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 16.0f, true), class04838.N((float)-8.0f, (float)-5.0f, (float)-8.0f, (float)0.0f, (float)0.0f, (float)-0.87266463f));
        class048393.N(i, class04822.L().N(16, 33).N(0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 16.0f), class04838.N((float)8.0f, (float)-6.0f, (float)-8.0f, (float)0.0f, (float)0.0f, (float)0.87266463f));
        class048393.N(R, class04822.L().N(16, 49).N(0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 16.0f), class04838.N((float)8.0f, (float)-2.0f, (float)-8.0f, (float)0.0f, (float)0.0f, (float)1.134464f));
        class048393.N(M, class04822.L().N(16, 65).N(0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 16.0f), class04838.N((float)8.0f, (float)3.0f, (float)-8.0f, (float)0.0f, (float)0.0f, (float)1.2217305f));
        return class04806.N((class04792)class047922, (int)64, (int)128);
    }

    public void method_2819(class08253 class082532) {
        super.method_2819((Object)class082532);
        float f = class082532.NN;
        float f2 = Math.min(class082532.Ny, 0.25f);
        if (!class082532.L) {
            this.z.i = class082532.h * ((float)Math.PI / 180);
            this.z.R = class082532.D * ((float)Math.PI / 180);
        } else {
            this.z.i = 0.0f;
            this.z.R = 0.0f;
        }
        float f3 = 1.5f;
        this.z.M = 0.1f * class04995.m((double)(f * 1.5f)) * 4.0f * f2;
        this.z.L = 2.0f;
        this.z.L -= 2.0f * class04995.P((double)(f * 1.5f)) * 2.0f * f2;
        this.Z.i = class04995.m((double)(f * 1.5f * 0.5f)) * 2.0f * f2;
        this.B.i = class04995.m((double)(f * 1.5f * 0.5f + (float)Math.PI)) * 2.0f * f2;
        this.Z.M = 0.17453292f * class04995.P((double)(f * 1.5f * 0.5f)) * f2;
        this.B.M = 0.17453292f * class04995.P((double)(f * 1.5f * 0.5f + (float)Math.PI)) * f2;
        this.Z.L = 8.0f + 2.0f * class04995.m((double)(f * 1.5f * 0.5f + (float)Math.PI)) * 2.0f * f2;
        this.B.L = 8.0f + 2.0f * class04995.m((double)(f * 1.5f * 0.5f)) * 2.0f * f2;
        this.U.M = -1.2217305f;
        this.E.M = -1.134464f;
        this.W.M = -0.87266463f;
        this.m.M = 0.87266463f;
        this.P.M = 1.134464f;
        this.s.M = 1.2217305f;
        float f4 = class04995.P((double)(f * 1.5f + (float)Math.PI)) * f2;
        this.U.M += f4 * 1.3f;
        this.E.M += f4 * 1.2f;
        this.W.M += f4 * 0.6f;
        this.m.M += f4 * 0.6f;
        this.P.M += f4 * 1.2f;
        this.s.M += f4 * 1.3f;
        float f5 = 1.0f;
        float f6 = 1.0f;
        this.U.M += 0.05f * class04995.m((double)(class082532.P * 1.0f * -0.4f));
        this.E.M += 0.1f * class04995.m((double)(class082532.P * 1.0f * 0.2f));
        this.W.M += 0.1f * class04995.m((double)(class082532.P * 1.0f * 0.4f));
        this.m.M += 0.1f * class04995.m((double)(class082532.P * 1.0f * 0.4f));
        this.P.M += 0.1f * class04995.m((double)(class082532.P * 1.0f * 0.2f));
        this.s.M += 0.05f * class04995.m((double)(class082532.P * 1.0f * -0.4f));
    }
}

