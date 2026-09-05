/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00094
 *  minecraft.class01686
 *  minecraft.class02415
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class08787
 */
package minecraft;

import minecraft.class00094;
import minecraft.class01686;
import minecraft.class02415;
import minecraft.class03768;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class08787;

public class class03797
extends class06078<class08787> {
    private static final float L = 2.0f;
    private static final float u = 2.5f;
    public static final class02415 N = class02415.N((float)0.45f);
    protected final class01686 y;
    private final class00094 i;
    private final class00094 R;
    private final class00094 M;
    private final class00094 B;
    private final class00094 Z;
    private final class00094 z;

    protected static class04792 L() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class04839 class048393 = class048392.N("body", class04822.L().N(0, 25).N(-7.5f, -12.0f, -23.5f, 15.0f, 12.0f, 27.0f), class04838.N((float)0.0f, (float)4.0f, (float)9.5f));
        class048393.N("hump", class04822.L().N(74, 0).N(-4.5f, -5.0f, -5.5f, 9.0f, 5.0f, 11.0f), class04838.N((float)0.0f, (float)-12.0f, (float)-10.0f));
        class048393.N("tail", class04822.L().N(122, 0).N(-1.5f, 0.0f, 0.0f, 3.0f, 14.0f, 0.0f), class04838.N((float)0.0f, (float)-9.0f, (float)3.5f));
        class04839 class048394 = class048393.N("head", class04822.L().N(60, 24).N(-3.5f, -7.0f, -15.0f, 7.0f, 8.0f, 19.0f).N(21, 0).N(-3.5f, -21.0f, -15.0f, 7.0f, 14.0f, 7.0f).N(50, 0).N(-2.5f, -21.0f, -21.0f, 5.0f, 5.0f, 6.0f), class04838.N((float)0.0f, (float)-3.0f, (float)-19.5f));
        class048394.N("left_ear", class04822.L().N(45, 0).N(-0.5f, 0.5f, -1.0f, 3.0f, 1.0f, 2.0f), class04838.N((float)2.5f, (float)-21.0f, (float)-9.5f));
        class048394.N("right_ear", class04822.L().N(67, 0).N(-2.5f, 0.5f, -1.0f, 3.0f, 1.0f, 2.0f), class04838.N((float)-2.5f, (float)-21.0f, (float)-9.5f));
        class048392.N("left_hind_leg", class04822.L().N(58, 16).N(-2.5f, 2.0f, -2.5f, 5.0f, 21.0f, 5.0f), class04838.N((float)4.9f, (float)1.0f, (float)9.5f));
        class048392.N("right_hind_leg", class04822.L().N(94, 16).N(-2.5f, 2.0f, -2.5f, 5.0f, 21.0f, 5.0f), class04838.N((float)-4.9f, (float)1.0f, (float)9.5f));
        class048392.N("left_front_leg", class04822.L().N(0, 0).N(-2.5f, 2.0f, -2.5f, 5.0f, 21.0f, 5.0f), class04838.N((float)4.9f, (float)1.0f, (float)-10.5f));
        class048392.N("right_front_leg", class04822.L().N(0, 26).N(-2.5f, 2.0f, -2.5f, 5.0f, 21.0f, 5.0f), class04838.N((float)-4.9f, (float)1.0f, (float)-10.5f));
        return class047922;
    }

    public class03797(class01686 class016862) {
        super(class016862);
        class01686 class016863 = class016862.y("body");
        this.y = class016863.y("head");
        this.i = class03768.N.N(class016862);
        this.R = class03768.y.N(class016862);
        this.M = class03768.L.N(class016862);
        this.B = class03768.u.N(class016862);
        this.Z = class03768.R.N(class016862);
        this.z = class03768.i.N(class016862);
    }

    public static class04806 y() {
        return class04806.N((class04792)class03797.L(), (int)128, (int)128);
    }

    public void method_2819(class08787 class087872) {
        super.method_2819((Object)class087872);
        this.N(class087872, class087872.D, class087872.h);
        this.i.N(class087872.NN, class087872.Ny, 2.0f, 2.5f);
        this.R.N(class087872.u, class087872.P);
        this.M.N(class087872.i, class087872.P);
        this.B.N(class087872.R, class087872.P);
        this.Z.N(class087872.M, class087872.P);
        this.z.N(class087872.B, class087872.P);
    }

    private void N(class08787 class087872, float f, float f2) {
        f = class04995.N((float)f, (float)-30.0f, (float)30.0f);
        f2 = class04995.N((float)f2, (float)-25.0f, (float)45.0f);
        if (class087872.L > 0.0f) {
            float f3 = 45.0f * class087872.L / 55.0f;
            f2 = class04995.N((float)(f2 + f3), (float)-25.0f, (float)70.0f);
        }
        this.y.R = f * ((float)Math.PI / 180);
        this.y.i = f2 * ((float)Math.PI / 180);
    }
}

