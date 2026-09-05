/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00094
 *  minecraft.class01686
 *  minecraft.class01940
 *  minecraft.class02415
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class06078
 *  minecraft.class08483
 */
package minecraft;

import minecraft.class00094;
import minecraft.class01686;
import minecraft.class01940;
import minecraft.class02415;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class06078;
import minecraft.class08483;

public class class01970
extends class06078<class08483> {
    public static final class02415 N = class02415.N((float)0.5f);
    private static final float y = 9.0f;
    private static final float L = 100.0f;
    private final class01686 u;
    private final class00094 i;
    private final class00094 R;
    private final class00094 M;
    private final class00094 B;
    private final class00094 Z;
    private final class00094 z;
    private final class00094 U;
    private final class00094 E;

    public class01970(class01686 class016862) {
        super(class016862);
        this.u = class016862.y("bone").y("body").y("head");
        this.i = class01940.i.N(class016862);
        this.R = class01940.u.N(class016862);
        this.M = class01940.R.N(class016862);
        this.B = class01940.L.N(class016862);
        this.Z = class01940.M.N(class016862);
        this.z = class01940.Z.N(class016862);
        this.U = class01940.y.N(class016862);
        this.E = class01940.N.N(class016862);
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N().N("bone", class04822.L(), class04838.N((float)0.0f, (float)5.0f, (float)0.0f));
        class04839 class048393 = class048392.N("body", class04822.L().N(62, 68).N(-12.5f, -14.0f, -20.0f, 25.0f, 29.0f, 40.0f, new class04834(0.0f)).N(62, 0).N(-12.5f, -14.0f, -20.0f, 25.0f, 24.0f, 40.0f, new class04834(0.5f)).N(87, 68).N(-12.5f, 12.0f, -20.0f, 25.0f, 0.0f, 40.0f, new class04834(0.0f)), class04838.N((float)0.0f, (float)0.0f, (float)0.0f));
        class048392.N("right_front_leg", class04822.L().N(32, 87).N(-3.5f, -1.0f, -4.0f, 7.0f, 10.0f, 8.0f, new class04834(0.0f)), class04838.N((float)-7.5f, (float)10.0f, (float)-15.0f));
        class048392.N("right_mid_leg", class04822.L().N(32, 105).N(-3.5f, -1.0f, -4.0f, 7.0f, 10.0f, 8.0f, new class04834(0.0f)), class04838.N((float)-7.5f, (float)10.0f, (float)0.0f));
        class048392.N("right_hind_leg", class04822.L().N(32, 123).N(-3.5f, -1.0f, -4.0f, 7.0f, 10.0f, 8.0f, new class04834(0.0f)), class04838.N((float)-7.5f, (float)10.0f, (float)15.0f));
        class048392.N("left_front_leg", class04822.L().N(0, 87).N(-3.5f, -1.0f, -4.0f, 7.0f, 10.0f, 8.0f, new class04834(0.0f)), class04838.N((float)7.5f, (float)10.0f, (float)-15.0f));
        class048392.N("left_mid_leg", class04822.L().N(0, 105).N(-3.5f, -1.0f, -4.0f, 7.0f, 10.0f, 8.0f, new class04834(0.0f)), class04838.N((float)7.5f, (float)10.0f, (float)0.0f));
        class048392.N("left_hind_leg", class04822.L().N(0, 123).N(-3.5f, -1.0f, -4.0f, 7.0f, 10.0f, 8.0f, new class04834(0.0f)), class04838.N((float)7.5f, (float)10.0f, (float)15.0f));
        class04839 class048394 = class048393.N("head", class04822.L().N(8, 15).N(-6.5f, -7.5f, -11.5f, 13.0f, 18.0f, 11.0f, new class04834(0.0f)).N(8, 4).N(-6.5f, 7.5f, -11.5f, 13.0f, 0.0f, 11.0f, new class04834(0.0f)), class04838.N((float)0.0f, (float)6.5f, (float)-19.48f));
        class048394.N("left_ear", class04822.L().N(2, 0).N(0.0f, 0.0f, -3.0f, 1.0f, 19.0f, 7.0f, new class04834(0.0f)), class04838.N((float)6.51f, (float)-7.5f, (float)-4.51f));
        class048394.N("right_ear", class04822.L().N(48, 0).N(-1.0f, 0.0f, -3.0f, 1.0f, 19.0f, 7.0f, new class04834(0.0f)), class04838.N((float)-6.51f, (float)-7.5f, (float)-4.51f));
        class048394.N("nose", class04822.L().N(10, 45).N(-6.5f, -2.0f, -9.0f, 13.0f, 2.0f, 9.0f, new class04834(0.0f)), class04838.N((float)0.0f, (float)-4.5f, (float)-11.5f));
        class048394.N("lower_beak", class04822.L().N(10, 57).N(-6.5f, -7.0f, -8.0f, 13.0f, 12.0f, 9.0f, new class04834(0.0f)), class04838.N((float)0.0f, (float)2.5f, (float)-12.5f));
        return class04806.N((class04792)class047922, (int)192, (int)192);
    }

    public void method_2819(class08483 class084832) {
        super.method_2819((Object)class084832);
        this.u.i = class084832.h * ((float)Math.PI / 180);
        this.u.R = class084832.D * ((float)Math.PI / 180);
        if (class084832.N) {
            this.i.N(class084832.NN, class084832.Ny, 9.0f, 100.0f);
        } else {
            this.R.N(class084832.NN, class084832.Ny, 9.0f, 100.0f);
        }
        this.M.N(class084832.y, class084832.P);
        this.B.N(class084832.L, class084832.P);
        this.Z.N(class084832.u, class084832.P);
        this.z.N(class084832.i, class084832.P);
        this.U.N(class084832.R, class084832.P);
        if (class084832.NB) {
            this.E.N();
        }
    }
}

