/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02415
 *  minecraft.class02441
 *  minecraft.class04792
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class08285
 */
package minecraft;

import java.util.Set;
import minecraft.class01686;
import minecraft.class02415;
import minecraft.class02441;
import minecraft.class04792;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class08285;

public class class03091
extends class06078<class08285> {
    public static final class02415 N = new class02441(Set.of("head"));
    private static final String y = "real_head";
    private static final String L = "upper_body";
    private static final String u = "real_tail";
    private final class01686 i;
    private final class01686 R;
    private final class01686 M;
    private final class01686 B;
    private final class01686 Z;
    private final class01686 z;
    private final class01686 U;
    private final class01686 E;
    private final class01686 W;
    private final class01686 m;
    private static final int P = 8;

    public class03091(class01686 class016862) {
        super(class016862);
        this.i = class016862.y("head");
        this.R = this.i.y(y);
        this.M = class016862.y("body");
        this.m = class016862.y(L);
        this.B = class016862.y("right_hind_leg");
        this.Z = class016862.y("left_hind_leg");
        this.z = class016862.y("right_front_leg");
        this.U = class016862.y("left_front_leg");
        this.E = class016862.y("tail");
        this.W = this.E.y(u);
    }

    public static class04792 N(class04834 class048342) {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        float f = 13.5f;
        class048392.N("head", class04822.L(), class04838.N((float)-1.0f, (float)13.5f, (float)-7.0f)).N(y, class04822.L().N(0, 0).N(-2.0f, -3.0f, -2.0f, 6.0f, 6.0f, 4.0f, class048342).N(16, 14).N(-2.0f, -5.0f, 0.0f, 2.0f, 2.0f, 1.0f, class048342).N(16, 14).N(2.0f, -5.0f, 0.0f, 2.0f, 2.0f, 1.0f, class048342).N(0, 10).N(-0.5f, -0.001f, -5.0f, 3.0f, 3.0f, 4.0f, class048342), class04838.N);
        class048392.N("body", class04822.L().N(18, 14).N(-3.0f, -2.0f, -3.0f, 6.0f, 9.0f, 6.0f, class048342), class04838.N((float)0.0f, (float)14.0f, (float)2.0f, (float)1.5707964f, (float)0.0f, (float)0.0f));
        class048392.N(L, class04822.L().N(21, 0).N(-3.0f, -3.0f, -3.0f, 8.0f, 6.0f, 7.0f, class048342), class04838.N((float)-1.0f, (float)14.0f, (float)-3.0f, (float)1.5707964f, (float)0.0f, (float)0.0f));
        class04822 class048222 = class04822.L().N(0, 18).N(0.0f, 0.0f, -1.0f, 2.0f, 8.0f, 2.0f, class048342);
        class04822 class048223 = class04822.L().N().N(0, 18).N(0.0f, 0.0f, -1.0f, 2.0f, 8.0f, 2.0f, class048342);
        class048392.N("right_hind_leg", class048223, class04838.N((float)-2.5f, (float)16.0f, (float)7.0f));
        class048392.N("left_hind_leg", class048222, class04838.N((float)0.5f, (float)16.0f, (float)7.0f));
        class048392.N("right_front_leg", class048223, class04838.N((float)-2.5f, (float)16.0f, (float)-4.0f));
        class048392.N("left_front_leg", class048222, class04838.N((float)0.5f, (float)16.0f, (float)-4.0f));
        class048392.N("tail", class04822.L(), class04838.N((float)-1.0f, (float)12.0f, (float)8.0f, (float)0.62831855f, (float)0.0f, (float)0.0f)).N(u, class04822.L().N(9, 18).N(0.0f, 0.0f, -1.0f, 2.0f, 8.0f, 2.0f, class048342), class04838.N);
        return class047922;
    }

    public void method_2819(class08285 class082852) {
        super.method_2819((Object)class082852);
        float f = class082852.NN;
        float f2 = class082852.Ny;
        this.E.R = class082852.N ? 0.0f : class04995.P((double)(f * 0.6662f)) * 1.4f * f2;
        if (class082852.y) {
            float f3 = class082852.Nu;
            this.m.L += 2.0f * f3;
            this.m.i = 1.2566371f;
            this.m.R = 0.0f;
            this.M.L += 4.0f * f3;
            this.M.u -= 2.0f * f3;
            this.M.i = 0.7853982f;
            this.E.L += 9.0f * f3;
            this.E.u -= 2.0f * f3;
            this.B.L += 6.7f * f3;
            this.B.u -= 5.0f * f3;
            this.B.i = 4.712389f;
            this.Z.L += 6.7f * f3;
            this.Z.u -= 5.0f * f3;
            this.Z.i = 4.712389f;
            this.z.i = 5.811947f;
            this.z.y += 0.01f * f3;
            this.z.L += 1.0f * f3;
            this.U.i = 5.811947f;
            this.U.y -= 0.01f * f3;
            this.U.L += 1.0f * f3;
        } else {
            this.B.i = class04995.P((double)(f * 0.6662f)) * 1.4f * f2;
            this.Z.i = class04995.P((double)(f * 0.6662f + (float)Math.PI)) * 1.4f * f2;
            this.z.i = class04995.P((double)(f * 0.6662f + (float)Math.PI)) * 1.4f * f2;
            this.U.i = class04995.P((double)(f * 0.6662f)) * 1.4f * f2;
        }
        this.R.M = class082852.u + class082852.N(0.0f);
        this.m.M = class082852.N(-0.08f);
        this.M.M = class082852.N(-0.16f);
        this.W.M = class082852.N(-0.2f);
        this.i.i = class082852.h * ((float)Math.PI / 180);
        this.i.R = class082852.D * ((float)Math.PI / 180);
        this.E.i = class082852.L;
    }
}

