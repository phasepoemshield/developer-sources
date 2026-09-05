/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02415
 *  minecraft.class02441
 *  minecraft.class04532
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class08288
 *  minecraft.class08476
 */
package minecraft;

import java.util.Set;
import minecraft.class01686;
import minecraft.class02415;
import minecraft.class02441;
import minecraft.class04532;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class08288;
import minecraft.class08476;

public class class03857
extends class04532<class08288> {
    private static final String B = "egg_belly";
    public static final class02415 N = new class02441(true, 120.0f, 0.0f, 9.0f, 6.0f, 120.0f, Set.of("head"));
    private final class01686 Z;

    public class03857(class01686 class016862) {
        super(class016862);
        this.Z = class016862.y(B);
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N("head", class04822.L().N(3, 0).N(-3.0f, -1.0f, -3.0f, 6.0f, 5.0f, 6.0f), class04838.N((float)0.0f, (float)19.0f, (float)-10.0f));
        class048392.N("body", class04822.L().N(7, 37).N("shell", -9.5f, 3.0f, -10.0f, 19.0f, 20.0f, 6.0f).N(31, 1).N("belly", -5.5f, 3.0f, -13.0f, 11.0f, 18.0f, 3.0f), class04838.N((float)0.0f, (float)11.0f, (float)-10.0f, (float)1.5707964f, (float)0.0f, (float)0.0f));
        class048392.N(B, class04822.L().N(70, 33).N(-4.5f, 3.0f, -14.0f, 9.0f, 18.0f, 1.0f), class04838.N((float)0.0f, (float)11.0f, (float)-10.0f, (float)1.5707964f, (float)0.0f, (float)0.0f));
        boolean bl = true;
        class048392.N("right_hind_leg", class04822.L().N(1, 23).N(-2.0f, 0.0f, 0.0f, 4.0f, 1.0f, 10.0f), class04838.N((float)-3.5f, (float)22.0f, (float)11.0f));
        class048392.N("left_hind_leg", class04822.L().N(1, 12).N(-2.0f, 0.0f, 0.0f, 4.0f, 1.0f, 10.0f), class04838.N((float)3.5f, (float)22.0f, (float)11.0f));
        class048392.N("right_front_leg", class04822.L().N(27, 30).N(-13.0f, 0.0f, -2.0f, 13.0f, 1.0f, 5.0f), class04838.N((float)-5.0f, (float)21.0f, (float)-4.0f));
        class048392.N("left_front_leg", class04822.L().N(27, 24).N(0.0f, 0.0f, -2.0f, 13.0f, 1.0f, 5.0f), class04838.N((float)5.0f, (float)21.0f, (float)-4.0f));
        return class04806.N((class04792)class047922, (int)128, (int)64);
    }

    public void method_2819(class08288 class082882) {
        super.method_2819((class08476)class082882);
        float f = class082882.NN;
        float f2 = class082882.Ny;
        if (class082882.N) {
            float f3 = class082882.y ? 4.0f : 1.0f;
            float f4 = class082882.y ? 2.0f : 1.0f;
            float f5 = f * 5.0f;
            float f6 = class04995.P((double)(f3 * f5));
            float f7 = class04995.P((double)f5);
            this.R.R = -f6 * 8.0f * f2 * f4;
            this.M.R = f6 * 8.0f * f2 * f4;
            this.u.R = -f7 * 3.0f * f2;
            this.i.R = f7 * 3.0f * f2;
        } else {
            float f8;
            float f9 = 0.5f * f2;
            this.u.i = f8 = class04995.P((double)(f * 0.6662f * 0.6f)) * f9;
            this.i.i = -f8;
            this.R.M = -f8;
            this.M.M = f8;
        }
        this.Z.U = class082882.L;
        if (this.Z.U) {
            this.field_54014.L -= 1.0f;
        }
    }
}

