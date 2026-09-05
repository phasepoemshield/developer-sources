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
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class08801
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
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class08801;

public class class05486
extends class06078<class08801> {
    public static final class02415 N = class02415.N((float)0.5f);
    private static final String y = "bone";
    private static final String L = "stinger";
    private static final String u = "left_antenna";
    private static final String i = "right_antenna";
    private static final String R = "front_legs";
    private static final String M = "middle_legs";
    private static final String B = "back_legs";
    private final class01686 Z;
    private final class01686 z;
    private final class01686 U;
    private final class01686 E;
    private final class01686 W;
    private final class01686 m;
    private final class01686 P;
    private final class01686 s;
    private final class01686 T;
    private float b;

    public class05486(class01686 class016862) {
        super(class016862);
        this.Z = class016862.y(y);
        class01686 class016863 = this.Z.y("body");
        this.P = class016863.y(L);
        this.s = class016863.y(u);
        this.T = class016863.y(i);
        this.z = this.Z.y("right_wing");
        this.U = this.Z.y("left_wing");
        this.E = this.Z.y(R);
        this.W = this.Z.y(M);
        this.m = this.Z.y(B);
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N().N(y, class04822.L(), class04838.N((float)0.0f, (float)19.0f, (float)0.0f));
        class04839 class048393 = class048392.N("body", class04822.L().N(0, 0).N(-3.5f, -4.0f, -5.0f, 7.0f, 7.0f, 10.0f), class04838.N);
        class048393.N(L, class04822.L().N(26, 7).N(0.0f, -1.0f, 5.0f, 0.0f, 1.0f, 2.0f), class04838.N);
        class048393.N(u, class04822.L().N(2, 0).N(1.5f, -2.0f, -3.0f, 1.0f, 2.0f, 3.0f), class04838.N((float)0.0f, (float)-2.0f, (float)-5.0f));
        class048393.N(i, class04822.L().N(2, 3).N(-2.5f, -2.0f, -3.0f, 1.0f, 2.0f, 3.0f), class04838.N((float)0.0f, (float)-2.0f, (float)-5.0f));
        class04834 class048342 = new class04834(0.001f);
        class048392.N("right_wing", class04822.L().N(0, 18).N(-9.0f, 0.0f, 0.0f, 9.0f, 0.0f, 6.0f, class048342), class04838.N((float)-1.5f, (float)-4.0f, (float)-3.0f, (float)0.0f, (float)-0.2618f, (float)0.0f));
        class048392.N("left_wing", class04822.L().N(0, 18).N().N(0.0f, 0.0f, 0.0f, 9.0f, 0.0f, 6.0f, class048342), class04838.N((float)1.5f, (float)-4.0f, (float)-3.0f, (float)0.0f, (float)0.2618f, (float)0.0f));
        class048392.N(R, class04822.L().N(R, -5.0f, 0.0f, 0.0f, 7, 2, 0, 26, 1), class04838.N((float)1.5f, (float)3.0f, (float)-2.0f));
        class048392.N(M, class04822.L().N(M, -5.0f, 0.0f, 0.0f, 7, 2, 0, 26, 3), class04838.N((float)1.5f, (float)3.0f, (float)0.0f));
        class048392.N(B, class04822.L().N(B, -5.0f, 0.0f, 0.0f, 7, 2, 0, 26, 5), class04838.N((float)1.5f, (float)3.0f, (float)2.0f));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    public void method_2819(class08801 class088012) {
        float f;
        super.method_2819((Object)class088012);
        this.b = class088012.N;
        this.P.U = class088012.y;
        if (!class088012.L) {
            f = class088012.P * 120.32113f * ((float)Math.PI / 180);
            this.z.R = 0.0f;
            this.z.M = class04995.P((double)f) * (float)Math.PI * 0.15f;
            this.U.i = this.z.i;
            this.U.R = this.z.R;
            this.U.M = -this.z.M;
            this.E.i = 0.7853982f;
            this.W.i = 0.7853982f;
            this.m.i = 0.7853982f;
        }
        if (!class088012.u && !class088012.L) {
            f = class04995.P((double)(class088012.P * 0.18f));
            this.Z.i = 0.1f + f * (float)Math.PI * 0.025f;
            this.s.i = f * (float)Math.PI * 0.03f;
            this.T.i = f * (float)Math.PI * 0.03f;
            this.E.i = -f * (float)Math.PI * 0.1f + 0.3926991f;
            this.m.i = -f * (float)Math.PI * 0.05f + 0.7853982f;
            this.Z.L -= class04995.P((double)(class088012.P * 0.18f)) * 0.9f;
        }
        if (this.b > 0.0f) {
            this.Z.i = class04995.z((float)this.b, (float)this.Z.i, (float)3.0915928f);
        }
    }
}

