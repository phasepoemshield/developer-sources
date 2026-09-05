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
 *  minecraft.class08460
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
import minecraft.class08460;

public class class01316
extends class06078<class08460> {
    public static final class02415 N = new class02441(true, 8.0f, 3.35f, Set.of("head"));
    public final class01686 y;
    private final class01686 L;
    private final class01686 u;
    private final class01686 i;
    private final class01686 R;
    private final class01686 M;
    private final class01686 B;
    private static final int Z = 6;
    private static final float z = 16.5f;
    private static final float U = 17.5f;
    private float E;

    public class01316(class01686 class016862) {
        super(class016862);
        this.y = class016862.y("head");
        this.L = class016862.y("body");
        this.u = class016862.y("right_hind_leg");
        this.i = class016862.y("left_hind_leg");
        this.R = class016862.y("right_front_leg");
        this.M = class016862.y("left_front_leg");
        this.B = this.L.y("tail");
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class04839 class048393 = class048392.N("head", class04822.L().N(1, 5).N(-3.0f, -2.0f, -5.0f, 8.0f, 6.0f, 6.0f), class04838.N((float)-1.0f, (float)16.5f, (float)-3.0f));
        class048393.N("right_ear", class04822.L().N(8, 1).N(-3.0f, -4.0f, -4.0f, 2.0f, 2.0f, 1.0f), class04838.N);
        class048393.N("left_ear", class04822.L().N(15, 1).N(3.0f, -4.0f, -4.0f, 2.0f, 2.0f, 1.0f), class04838.N);
        class048393.N("nose", class04822.L().N(6, 18).N(-1.0f, 2.01f, -8.0f, 4.0f, 2.0f, 3.0f), class04838.N);
        class04839 class048394 = class048392.N("body", class04822.L().N(24, 15).N(-3.0f, 3.999f, -3.5f, 6.0f, 11.0f, 6.0f), class04838.N((float)0.0f, (float)16.0f, (float)-6.0f, (float)1.5707964f, (float)0.0f, (float)0.0f));
        class04834 class048342 = new class04834(0.001f);
        class04822 class048222 = class04822.L().N(4, 24).N(2.0f, 0.5f, -1.0f, 2.0f, 6.0f, 2.0f, class048342);
        class04822 class048223 = class04822.L().N(13, 24).N(2.0f, 0.5f, -1.0f, 2.0f, 6.0f, 2.0f, class048342);
        class048392.N("right_hind_leg", class048223, class04838.N((float)-5.0f, (float)17.5f, (float)7.0f));
        class048392.N("left_hind_leg", class048222, class04838.N((float)-1.0f, (float)17.5f, (float)7.0f));
        class048392.N("right_front_leg", class048223, class04838.N((float)-5.0f, (float)17.5f, (float)0.0f));
        class048392.N("left_front_leg", class048222, class04838.N((float)-1.0f, (float)17.5f, (float)0.0f));
        class048394.N("tail", class04822.L().N(30, 0).N(2.0f, 0.0f, -1.0f, 4.0f, 9.0f, 5.0f), class04838.N((float)-4.0f, (float)15.0f, (float)-1.0f, (float)-0.05235988f, (float)0.0f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)48, (int)32);
    }

    public void method_2819(class08460 class084602) {
        float f;
        super.method_2819((Object)class084602);
        float f2 = class084602.Ny;
        float f3 = class084602.NN;
        this.u.i = class04995.P((double)(f3 * 0.6662f)) * 1.4f * f2;
        this.i.i = class04995.P((double)(f3 * 0.6662f + (float)Math.PI)) * 1.4f * f2;
        this.R.i = class04995.P((double)(f3 * 0.6662f + (float)Math.PI)) * 1.4f * f2;
        this.M.i = class04995.P((double)(f3 * 0.6662f)) * 1.4f * f2;
        this.y.M = class084602.N;
        this.u.U = true;
        this.i.U = true;
        this.R.U = true;
        this.M.U = true;
        float f4 = class084602.Nu;
        if (class084602.L) {
            this.L.i += 0.10471976f;
            f = class084602.y;
            this.L.L += f * f4;
            this.y.L += f * f4;
        } else if (class084602.u) {
            this.L.M = -1.5707964f;
            this.L.L += 5.0f * f4;
            this.B.i = -2.6179938f;
            if (class084602.NB) {
                this.B.i = -2.1816616f;
                this.L.u += 2.0f;
            }
            this.y.y += 2.0f * f4;
            this.y.L += 2.99f * f4;
            this.y.R = -2.0943952f;
            this.y.M = 0.0f;
            this.u.U = false;
            this.i.U = false;
            this.R.U = false;
            this.M.U = false;
        } else if (class084602.i) {
            this.L.i = 0.5235988f;
            this.L.L -= 7.0f * f4;
            this.L.u += 3.0f * f4;
            this.B.i = 0.7853982f;
            this.B.u -= 1.0f * f4;
            this.y.i = 0.0f;
            this.y.R = 0.0f;
            if (class084602.NB) {
                this.y.L -= 1.75f;
                this.y.u -= 0.375f;
            } else {
                this.y.L -= 6.5f;
                this.y.u += 2.75f;
            }
            this.u.i = -1.3089969f;
            this.u.L += 4.0f * f4;
            this.u.u -= 0.25f * f4;
            this.i.i = -1.3089969f;
            this.i.L += 4.0f * f4;
            this.i.u -= 0.25f * f4;
            this.R.i = -0.2617994f;
            this.M.i = -0.2617994f;
        }
        if (!(class084602.u || class084602.R || class084602.L)) {
            this.y.i = class084602.h * ((float)Math.PI / 180);
            this.y.R = class084602.D * ((float)Math.PI / 180);
        }
        if (class084602.u) {
            this.y.i = 0.0f;
            this.y.R = -2.0943952f;
            this.y.M = class04995.P((double)(class084602.P * 0.027f)) / 22.0f;
        }
        if (class084602.L) {
            this.L.R = f = class04995.P((double)class084602.P) * 0.01f;
            this.u.M = f;
            this.i.M = f;
            this.R.M = f / 2.0f;
            this.M.M = f / 2.0f;
        }
        if (class084602.R) {
            f = 0.1f;
            this.E += 0.67f;
            this.u.i = class04995.P((double)(this.E * 0.4662f)) * 0.1f;
            this.i.i = class04995.P((double)(this.E * 0.4662f + (float)Math.PI)) * 0.1f;
            this.R.i = class04995.P((double)(this.E * 0.4662f + (float)Math.PI)) * 0.1f;
            this.M.i = class04995.P((double)(this.E * 0.4662f)) * 0.1f;
        }
    }
}

