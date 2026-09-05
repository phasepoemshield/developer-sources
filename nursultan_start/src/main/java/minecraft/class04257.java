/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00094
 *  minecraft.class01686
 *  minecraft.class02415
 *  minecraft.class02787
 *  minecraft.class03832
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 */
package minecraft;

import minecraft.class00094;
import minecraft.class01686;
import minecraft.class02415;
import minecraft.class02787;
import minecraft.class03832;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;

public class class04257
extends class06078<class02787> {
    public static final class02415 N = class02415.N((float)0.6f);
    private static final float y = 25.0f;
    private static final float L = 22.5f;
    private static final float u = 16.5f;
    private static final float i = 2.5f;
    private static final String R = "head_cube";
    private static final String M = "right_ear_cube";
    private static final String B = "left_ear_cube";
    private final class01686 Z;
    private final class01686 z;
    private final class01686 U;
    private final class01686 E;
    private final class01686 W;
    private final class01686 m;
    private final class00094 P;
    private final class00094 s;
    private final class00094 T;
    private final class00094 b;

    public class04257(class01686 class016862) {
        super(class016862);
        this.Z = class016862.y("body");
        this.z = class016862.y("right_hind_leg");
        this.U = class016862.y("left_hind_leg");
        this.W = this.Z.y("head");
        this.m = this.Z.y("tail");
        this.E = class016862.y("cube");
        this.P = class03832.y.N(class016862);
        this.s = class03832.u.N(class016862);
        this.T = class03832.N.N(class016862);
        this.b = class03832.L.N(class016862);
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class04839 class048393 = class048392.N("body", class04822.L().N(0, 20).N(-4.0f, -7.0f, -10.0f, 8.0f, 8.0f, 12.0f, new class04834(0.3f)).N(0, 40).N(-4.0f, -7.0f, -10.0f, 8.0f, 8.0f, 12.0f, new class04834(0.0f)), class04838.N((float)0.0f, (float)21.0f, (float)4.0f));
        class048393.N("tail", class04822.L().N(44, 53).N(-0.5f, -0.0865f, 0.0933f, 1.0f, 6.0f, 1.0f, new class04834(0.0f)), class04838.N((float)0.0f, (float)-3.0f, (float)1.0f, (float)0.5061f, (float)0.0f, (float)0.0f));
        class04839 class048394 = class048393.N("head", class04822.L(), class04838.N((float)0.0f, (float)-2.0f, (float)-11.0f));
        class048394.N(R, class04822.L().N(43, 15).N(-1.5f, -1.0f, -1.0f, 3.0f, 5.0f, 2.0f, new class04834(0.0f)), class04838.N((float)0.0f, (float)0.0f, (float)0.0f, (float)-0.3927f, (float)0.0f, (float)0.0f));
        class048394.N("right_ear", class04822.L(), class04838.N((float)-1.0f, (float)-1.0f, (float)0.0f)).N(M, class04822.L().N(43, 10).N(-2.0f, -3.0f, 0.0f, 2.0f, 5.0f, 0.0f, new class04834(0.0f)), class04838.N((float)-0.5f, (float)0.0f, (float)-0.6f, (float)0.1886f, (float)-0.3864f, (float)-0.0718f));
        class048394.N("left_ear", class04822.L(), class04838.N((float)1.0f, (float)-2.0f, (float)0.0f)).N(B, class04822.L().N(47, 10).N(0.0f, -3.0f, 0.0f, 2.0f, 5.0f, 0.0f, new class04834(0.0f)), class04838.N((float)0.5f, (float)1.0f, (float)-0.6f, (float)0.1886f, (float)0.3864f, (float)0.0718f));
        class048392.N("right_hind_leg", class04822.L().N(51, 31).N(-1.0f, 0.0f, -1.0f, 2.0f, 3.0f, 2.0f, new class04834(0.0f)), class04838.N((float)-2.0f, (float)21.0f, (float)4.0f));
        class048392.N("left_hind_leg", class04822.L().N(42, 31).N(-1.0f, 0.0f, -1.0f, 2.0f, 3.0f, 2.0f, new class04834(0.0f)), class04838.N((float)2.0f, (float)21.0f, (float)4.0f));
        class048392.N("right_front_leg", class04822.L().N(51, 43).N(-1.0f, 0.0f, -1.0f, 2.0f, 3.0f, 2.0f, new class04834(0.0f)), class04838.N((float)-2.0f, (float)21.0f, (float)-4.0f));
        class048392.N("left_front_leg", class04822.L().N(42, 43).N(-1.0f, 0.0f, -1.0f, 2.0f, 3.0f, 2.0f, new class04834(0.0f)), class04838.N((float)2.0f, (float)21.0f, (float)-4.0f));
        class048392.N("cube", class04822.L().N(0, 0).N(-5.0f, -10.0f, -6.0f, 10.0f, 10.0f, 10.0f, new class04834(0.0f)), class04838.N((float)0.0f, (float)24.0f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    public void method_2819(class02787 class027872) {
        super.method_2819((Object)class027872);
        if (class027872.N) {
            this.Z.E = true;
            this.U.U = false;
            this.z.U = false;
            this.m.U = false;
            this.E.U = true;
        } else {
            this.Z.E = false;
            this.U.U = true;
            this.z.U = true;
            this.m.U = true;
            this.E.U = false;
            this.W.i = class04995.N((float)class027872.h, (float)-22.5f, (float)25.0f) * ((float)Math.PI / 180);
            this.W.R = class04995.N((float)class027872.D, (float)-32.5f, (float)32.5f) * ((float)Math.PI / 180);
        }
        this.P.N(class027872.NN, class027872.Ny, 16.5f, 2.5f);
        this.s.N(class027872.y, class027872.P);
        this.T.N(class027872.L, class027872.P);
        this.b.N(class027872.u, class027872.P);
    }
}

