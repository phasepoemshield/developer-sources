/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02415
 *  minecraft.class02441
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class08484
 */
package minecraft;

import java.util.Set;
import minecraft.class01686;
import minecraft.class02415;
import minecraft.class02441;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class08484;

public class class06013
extends class06078<class08484> {
    public static final class02415 N = new class02441(true, 8.0f, 6.0f, 1.9f, 2.0f, 24.0f, Set.of("head"));
    private static final float y = 0.87266463f;
    private static final float L = -0.34906584f;
    private final class01686 u;
    private final class01686 i;
    private final class01686 R;
    private final class01686 M;
    private final class01686 B;
    private final class01686 Z;
    private final class01686 z;
    private final class01686 U;
    private final class01686 E;

    private static class04792 L() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N("body", class04822.L().N(1, 1).N(-8.0f, -7.0f, -13.0f, 16.0f, 14.0f, 26.0f), class04838.N((float)0.0f, (float)7.0f, (float)0.0f)).N("mane", class04822.L().N(90, 33).N(0.0f, 0.0f, -9.0f, 0.0f, 10.0f, 19.0f, new class04834(0.001f)), class04838.N((float)0.0f, (float)-14.0f, (float)-7.0f));
        class04839 class048393 = class048392.N("head", class04822.L().N(61, 1).N(-7.0f, -3.0f, -19.0f, 14.0f, 6.0f, 19.0f), class04838.N((float)0.0f, (float)2.0f, (float)-12.0f, (float)0.87266463f, (float)0.0f, (float)0.0f));
        class048393.N("right_ear", class04822.L().N(1, 1).N(-6.0f, -1.0f, -2.0f, 6.0f, 1.0f, 4.0f), class04838.N((float)-6.0f, (float)-2.0f, (float)-3.0f, (float)0.0f, (float)0.0f, (float)-0.6981317f));
        class048393.N("left_ear", class04822.L().N(1, 6).N(0.0f, -1.0f, -2.0f, 6.0f, 1.0f, 4.0f), class04838.N((float)6.0f, (float)-2.0f, (float)-3.0f, (float)0.0f, (float)0.0f, (float)0.6981317f));
        class048393.N("right_horn", class04822.L().N(10, 13).N(-1.0f, -11.0f, -1.0f, 2.0f, 11.0f, 2.0f), class04838.N((float)-7.0f, (float)2.0f, (float)-12.0f));
        class048393.N("left_horn", class04822.L().N(1, 13).N(-1.0f, -11.0f, -1.0f, 2.0f, 11.0f, 2.0f), class04838.N((float)7.0f, (float)2.0f, (float)-12.0f));
        int n = 14;
        int n2 = 11;
        class048392.N("right_front_leg", class04822.L().N(66, 42).N(-3.0f, 0.0f, -3.0f, 6.0f, 14.0f, 6.0f), class04838.N((float)-4.0f, (float)10.0f, (float)-8.5f));
        class048392.N("left_front_leg", class04822.L().N(41, 42).N(-3.0f, 0.0f, -3.0f, 6.0f, 14.0f, 6.0f), class04838.N((float)4.0f, (float)10.0f, (float)-8.5f));
        class048392.N("right_hind_leg", class04822.L().N(21, 45).N(-2.5f, 0.0f, -2.5f, 5.0f, 11.0f, 5.0f), class04838.N((float)-5.0f, (float)13.0f, (float)10.0f));
        class048392.N("left_hind_leg", class04822.L().N(0, 45).N(-2.5f, 0.0f, -2.5f, 5.0f, 11.0f, 5.0f), class04838.N((float)5.0f, (float)13.0f, (float)10.0f));
        return class047922;
    }

    public class06013(class01686 class016862) {
        super(class016862);
        this.M = class016862.y("body");
        this.E = this.M.y("mane");
        this.u = class016862.y("head");
        this.i = this.u.y("right_ear");
        this.R = this.u.y("left_ear");
        this.B = class016862.y("right_front_leg");
        this.Z = class016862.y("left_front_leg");
        this.z = class016862.y("right_hind_leg");
        this.U = class016862.y("left_hind_leg");
    }

    public static class04806 y() {
        class04792 class047922 = class06013.L();
        class047922.N().y("body").N("mane", class04822.L().N(90, 33).N(0.0f, 0.0f, -9.0f, 0.0f, 10.0f, 19.0f, new class04834(0.001f)), class04838.N((float)0.0f, (float)-14.0f, (float)-3.0f));
        return class04806.N((class04792)class047922, (int)128, (int)64).N(N);
    }

    public static class04806 N() {
        return class04806.N((class04792)class06013.L(), (int)128, (int)64);
    }

    public void method_2819(class08484 class084842) {
        super.method_2819((Object)class084842);
        float f = class084842.Ny;
        float f2 = class084842.NN;
        this.i.M = -0.6981317f - f * class04995.m((double)f2);
        this.R.M = 0.6981317f + f * class04995.m((double)f2);
        this.u.R = class084842.D * ((float)Math.PI / 180);
        float f3 = 1.0f - (float)class04995.N((int)(10 - 2 * class084842.N)) / 10.0f;
        this.u.i = class04995.B((float)f3, (float)0.87266463f, (float)-0.34906584f);
        if (class084842.NB) {
            this.u.L += f3 * 2.5f;
        }
        float f4 = 1.2f;
        this.B.i = class04995.P((double)f2) * 1.2f * f;
        this.z.i = this.Z.i = class04995.P((double)(f2 + (float)Math.PI)) * 1.2f * f;
        this.U.i = this.B.i;
    }
}

