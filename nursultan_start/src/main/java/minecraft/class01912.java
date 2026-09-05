/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00094
 *  minecraft.class01686
 *  minecraft.class04375
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class06078
 *  minecraft.class08444
 */
package minecraft;

import minecraft.class00094;
import minecraft.class01686;
import minecraft.class04375;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class06078;
import minecraft.class08444;

public class class01912
extends class06078<class08444> {
    private static final float N = 1.5f;
    private static final float y = 1.0f;
    private static final float L = 2.5f;
    private final class01686 u;
    private final class01686 i;
    private final class01686 R;
    private final class01686 M;
    private final class01686 B;
    private final class01686 Z;
    private final class01686 z;
    private final class01686 U;
    private final class01686 E;
    private final class00094 W;
    private final class00094 m;
    private final class00094 P;
    private final class00094 s;
    private final class00094 T;
    private final class00094 b;

    public class01912(class01686 class016862) {
        super(class016862.y("root"));
        this.u = this.field_54014.y("body");
        this.i = this.u.y("head");
        this.R = this.i.y("eyes");
        this.M = this.u.y("tongue");
        this.B = this.u.y("left_arm");
        this.Z = this.u.y("right_arm");
        this.z = this.field_54014.y("left_leg");
        this.U = this.field_54014.y("right_leg");
        this.E = this.u.y("croaking_body");
        this.W = class04375.L.N(class016862);
        this.m = class04375.N.N(class016862);
        this.P = class04375.u.N(class016862);
        this.s = class04375.i.N(class016862);
        this.T = class04375.y.N(class016862);
        this.b = class04375.R.N(class016862);
    }

    public void method_2819(class08444 class084442) {
        super.method_2819((Object)class084442);
        this.W.N(class084442.y, class084442.P);
        this.m.N(class084442.L, class084442.P);
        this.P.N(class084442.u, class084442.P);
        if (class084442.N) {
            this.s.N(class084442.NN, class084442.Ny, 1.0f, 2.5f);
        } else {
            this.T.N(class084442.NN, class084442.Ny, 1.5f, 2.5f);
        }
        this.b.N(class084442.i, class084442.P);
        this.E.U = class084442.L.y();
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N().N("root", class04822.L(), class04838.N((float)0.0f, (float)24.0f, (float)0.0f));
        class04839 class048393 = class048392.N("body", class04822.L().N(3, 1).N(-3.5f, -2.0f, -8.0f, 7.0f, 3.0f, 9.0f).N(23, 22).N(-3.5f, -1.0f, -8.0f, 7.0f, 0.0f, 9.0f), class04838.N((float)0.0f, (float)-2.0f, (float)4.0f));
        class04839 class048394 = class048393.N("head", class04822.L().N(23, 13).N(-3.5f, -1.0f, -7.0f, 7.0f, 0.0f, 9.0f).N(0, 13).N(-3.5f, -2.0f, -7.0f, 7.0f, 3.0f, 9.0f), class04838.N((float)0.0f, (float)-2.0f, (float)-1.0f)).N("eyes", class04822.L(), class04838.N((float)-0.5f, (float)0.0f, (float)2.0f));
        class048394.N("right_eye", class04822.L().N(0, 0).N(-1.5f, -1.0f, -1.5f, 3.0f, 2.0f, 3.0f), class04838.N((float)-1.5f, (float)-3.0f, (float)-6.5f));
        class048394.N("left_eye", class04822.L().N(0, 5).N(-1.5f, -1.0f, -1.5f, 3.0f, 2.0f, 3.0f), class04838.N((float)2.5f, (float)-3.0f, (float)-6.5f));
        class048393.N("croaking_body", class04822.L().N(26, 5).N(-3.5f, -0.1f, -2.9f, 7.0f, 2.0f, 3.0f, new class04834(-0.1f)), class04838.N((float)0.0f, (float)-1.0f, (float)-5.0f));
        class04839 class048395 = class048393.N("tongue", class04822.L().N(17, 13).N(-2.0f, 0.0f, -7.1f, 4.0f, 0.0f, 7.0f), class04838.N((float)0.0f, (float)-1.01f, (float)1.0f));
        class048393.N("left_arm", class04822.L().N(0, 32).N(-1.0f, 0.0f, -1.0f, 2.0f, 3.0f, 3.0f), class04838.N((float)4.0f, (float)-1.0f, (float)-6.5f)).N("left_hand", class04822.L().N(18, 40).N(-4.0f, 0.01f, -4.0f, 8.0f, 0.0f, 8.0f), class04838.N((float)0.0f, (float)3.0f, (float)-1.0f));
        class048393.N("right_arm", class04822.L().N(0, 38).N(-1.0f, 0.0f, -1.0f, 2.0f, 3.0f, 3.0f), class04838.N((float)-4.0f, (float)-1.0f, (float)-6.5f)).N("right_hand", class04822.L().N(2, 40).N(-4.0f, 0.01f, -5.0f, 8.0f, 0.0f, 8.0f), class04838.N((float)0.0f, (float)3.0f, (float)0.0f));
        class048392.N("left_leg", class04822.L().N(14, 25).N(-1.0f, 0.0f, -2.0f, 3.0f, 3.0f, 4.0f), class04838.N((float)3.5f, (float)-3.0f, (float)4.0f)).N("left_foot", class04822.L().N(2, 32).N(-4.0f, 0.01f, -4.0f, 8.0f, 0.0f, 8.0f), class04838.N((float)2.0f, (float)3.0f, (float)0.0f));
        class048392.N("right_leg", class04822.L().N(0, 25).N(-2.0f, 0.0f, -2.0f, 3.0f, 3.0f, 4.0f), class04838.N((float)-3.5f, (float)-3.0f, (float)4.0f)).N("right_foot", class04822.L().N(18, 32).N(-4.0f, 0.01f, -4.0f, 8.0f, 0.0f, 8.0f), class04838.N((float)-2.0f, (float)3.0f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)48, (int)48);
    }
}

