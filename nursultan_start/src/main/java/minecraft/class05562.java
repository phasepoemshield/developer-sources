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
 *  minecraft.class08788
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
import minecraft.class08788;

public class class05562
extends class06078<class08788> {
    public static final float N = 1.8849558f;
    public static final class02415 y = class02415.N((float)0.5f);
    private final class01686 L;
    private final class01686 u;
    private final class01686 i;
    private final class01686 R;
    private final class01686 M;
    private final class01686 B;
    private final class01686 Z;
    private final class01686 z;
    private final class01686 U;
    private final class01686 E;

    private void L(float f, float f2) {
        if (f2 <= 1.0E-5f) {
            return;
        }
        float f3 = f * 0.075f;
        float f4 = class04995.P((double)f3);
        float f5 = class04995.m((double)f3) * 0.15f;
        float f6 = (-0.15f + 0.075f * f4) * f2;
        this.B.i += f6;
        this.B.L -= f5 * f2;
        this.Z.i -= f6;
        this.z.i += 0.2f * f4 * f2;
        float f7 = (-0.3f * f4 - 0.19f) * f2;
        this.U.R += f7;
        this.E.R -= f7;
        this.u.i += (2.3561945f - f4 * 0.11f) * f2;
        this.u.R += 0.47123894f * f2;
        this.u.M += 1.7278761f * f2;
        this.R.i += (0.7853982f - f4 * 0.2f) * f2;
        this.R.R += 2.042035f * f2;
        this.L.R += 0.5f * f4 * f2;
    }

    public class05562(class01686 class016862) {
        super(class016862);
        this.B = class016862.y("body");
        this.Z = this.B.y("head");
        this.i = this.B.y("right_hind_leg");
        this.u = this.B.y("left_hind_leg");
        this.M = this.B.y("right_front_leg");
        this.R = this.B.y("left_front_leg");
        this.L = this.B.y("tail");
        this.z = this.Z.y("top_gills");
        this.U = this.Z.y("left_gills");
        this.E = this.Z.y("right_gills");
    }

    private void y(float f) {
        if (f <= 1.0E-5f) {
            return;
        }
        this.i.i += this.u.i * f;
        class01686 class016862 = this.i;
        class016862.R = class016862.R + -this.u.R * f;
        class016862 = this.i;
        class016862.M = class016862.M + -this.u.M * f;
        this.M.i += this.R.i * f;
        class016862 = this.M;
        class016862.R = class016862.R + -this.R.R * f;
        class016862 = this.M;
        class016862.M = class016862.M + -this.R.M * f;
    }

    private void y(float f, float f2) {
        if (f2 <= 1.0E-5f) {
            return;
        }
        float f3 = f * 0.11f;
        float f4 = class04995.P((double)f3);
        float f5 = (f4 * f4 - 2.0f * f4) / 5.0f;
        float f6 = 0.7f * f4;
        float f7 = 0.09f * f4 * f2;
        this.Z.R += f7;
        this.L.R += f7;
        float f8 = (0.6f - 0.08f * (f4 * f4 + 2.0f * class04995.m((double)f3))) * f2;
        this.z.i += f8;
        this.U.R -= f8;
        this.E.R += f8;
        float f9 = 0.9424779f * f2;
        float f10 = 1.0995574f * f2;
        this.u.i += f9;
        this.u.R += (1.5f - f5) * f2;
        this.u.M += -0.1f * f2;
        this.R.i += f10;
        this.R.R += (1.5707964f - f6) * f2;
        this.i.i += f9;
        this.i.R += (-1.0f - f5) * f2;
        this.M.i += f10;
        this.M.R += (-1.5707964f - f6) * f2;
    }

    public void method_2819(class08788 class087882) {
        super.method_2819((Object)class087882);
        float f = class087882.y;
        float f2 = class087882.u;
        float f3 = class087882.i;
        float f4 = class087882.L;
        float f5 = 1.0f - f4;
        float f6 = 1.0f - Math.min(f3, f4);
        this.B.R += class087882.D * ((float)Math.PI / 180);
        this.N(class087882.P, class087882.h, Math.min(f4, f2));
        this.L(class087882.P, Math.min(f5, f2));
        this.y(class087882.P, Math.min(f4, f3));
        this.N(class087882.P, Math.min(f5, f3));
        this.N(f);
        this.y(f6);
    }

    private void N(float f) {
        if (f <= 1.0E-5f) {
            return;
        }
        this.u.i += 1.4137167f * f;
        this.u.R += 1.0995574f * f;
        this.u.M += 0.7853982f * f;
        this.R.i += 0.7853982f * f;
        this.R.R += 2.042035f * f;
        this.B.i += -0.15f * f;
        this.B.M += 0.35f * f;
    }

    private void N(float f, float f2) {
        if (f2 <= 1.0E-5f) {
            return;
        }
        float f3 = f * 0.09f;
        float f4 = class04995.m((double)f3);
        float f5 = class04995.P((double)f3);
        float f6 = f4 * f4 - 2.0f * f4;
        float f7 = f5 * f5 - 3.0f * f4;
        this.Z.i += -0.09f * f6 * f2;
        this.Z.M += -0.2f * f2;
        this.L.R += (-0.1f + 0.1f * f6) * f2;
        float f8 = (0.6f + 0.05f * f7) * f2;
        this.z.i += f8;
        this.U.R -= f8;
        this.E.R += f8;
        this.u.i += 1.1f * f2;
        this.u.R += 1.0f * f2;
        this.R.i += 0.8f * f2;
        this.R.R += 2.3f * f2;
        this.R.M -= 0.5f * f2;
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N().N("body", class04822.L().N(0, 11).N(-4.0f, -2.0f, -9.0f, 8.0f, 4.0f, 10.0f).N(2, 17).N(0.0f, -3.0f, -8.0f, 0.0f, 5.0f, 9.0f), class04838.N((float)0.0f, (float)20.0f, (float)5.0f));
        class04834 class048342 = new class04834(0.001f);
        class04839 class048393 = class048392.N("head", class04822.L().N(0, 1).N(-4.0f, -3.0f, -5.0f, 8.0f, 5.0f, 5.0f, class048342), class04838.N((float)0.0f, (float)0.0f, (float)-9.0f));
        class04822 class048222 = class04822.L().N(3, 37).N(-4.0f, -3.0f, 0.0f, 8.0f, 3.0f, 0.0f, class048342);
        class04822 class048223 = class04822.L().N(0, 40).N(-3.0f, -5.0f, 0.0f, 3.0f, 7.0f, 0.0f, class048342);
        class04822 class048224 = class04822.L().N(11, 40).N(0.0f, -5.0f, 0.0f, 3.0f, 7.0f, 0.0f, class048342);
        class048393.N("top_gills", class048222, class04838.N((float)0.0f, (float)-3.0f, (float)-1.0f));
        class048393.N("left_gills", class048223, class04838.N((float)-4.0f, (float)0.0f, (float)-1.0f));
        class048393.N("right_gills", class048224, class04838.N((float)4.0f, (float)0.0f, (float)-1.0f));
        class04822 class048225 = class04822.L().N(2, 13).N(-1.0f, 0.0f, 0.0f, 3.0f, 5.0f, 0.0f, class048342);
        class04822 class048226 = class04822.L().N(2, 13).N(-2.0f, 0.0f, 0.0f, 3.0f, 5.0f, 0.0f, class048342);
        class048392.N("right_hind_leg", class048226, class04838.N((float)-3.5f, (float)1.0f, (float)-1.0f));
        class048392.N("left_hind_leg", class048225, class04838.N((float)3.5f, (float)1.0f, (float)-1.0f));
        class048392.N("right_front_leg", class048226, class04838.N((float)-3.5f, (float)1.0f, (float)-8.0f));
        class048392.N("left_front_leg", class048225, class04838.N((float)3.5f, (float)1.0f, (float)-8.0f));
        class048392.N("tail", class04822.L().N(2, 19).N(0.0f, -3.0f, 0.0f, 0.0f, 5.0f, 12.0f), class04838.N((float)0.0f, (float)0.0f, (float)1.0f));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    private void N(float f, float f2, float f3) {
        if (f3 <= 1.0E-5f) {
            return;
        }
        float f4 = f * 0.33f;
        float f5 = class04995.m((double)f4);
        float f6 = class04995.P((double)f4);
        float f7 = 0.13f * f5;
        this.B.i += (f2 * ((float)Math.PI / 180) + f7) * f3;
        this.Z.i -= f7 * 1.8f * f3;
        this.B.L -= 0.45f * f6 * f3;
        this.z.i += (-0.5f * f5 - 0.8f) * f3;
        float f8 = (0.3f * f5 + 0.9f) * f3;
        this.U.R += f8;
        this.E.R -= f8;
        this.L.R += 0.3f * class04995.P((double)(f4 * 0.9f)) * f3;
        this.u.i += 1.8849558f * f3;
        this.u.R += -0.4f * f5 * f3;
        this.u.M += 1.5707964f * f3;
        this.R.i += 1.8849558f * f3;
        this.R.R += (-0.2f * f6 - 0.1f) * f3;
        this.R.M += 1.5707964f * f3;
    }
}

