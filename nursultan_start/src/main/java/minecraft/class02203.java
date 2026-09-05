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
 *  minecraft.class08463
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
import minecraft.class08463;
import minecraft.class08476;

public class class02203
extends class04532<class08463> {
    private static final float N = 2.25f;
    private static final class02415 B = new class02441(true, 16.0f, 4.0f, 2.25f, 2.0f, 24.0f, Set.of("head"));

    public class02203(class01686 class016862) {
        super(class016862);
    }

    public static class04806 N(boolean bl) {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N("head", class04822.L().N(0, 0).N(-3.5f, -3.0f, -3.0f, 7.0f, 7.0f, 7.0f).N(0, 44).N("mouth", -2.5f, 1.0f, -6.0f, 5.0f, 3.0f, 3.0f).N(26, 0).N("right_ear", -4.5f, -4.0f, -1.0f, 2.0f, 2.0f, 1.0f).N(26, 0).N().N("left_ear", 2.5f, -4.0f, -1.0f, 2.0f, 2.0f, 1.0f), class04838.N((float)0.0f, (float)10.0f, (float)-16.0f));
        class048392.N("body", class04822.L().N(0, 19).N(-5.0f, -13.0f, -7.0f, 14.0f, 14.0f, 11.0f).N(39, 0).N(-4.0f, -25.0f, -7.0f, 12.0f, 12.0f, 10.0f), class04838.N((float)-2.0f, (float)9.0f, (float)12.0f, (float)1.5707964f, (float)0.0f, (float)0.0f));
        int n = 10;
        class04822 class048222 = class04822.L().N(50, 22).N(-2.0f, 0.0f, -2.0f, 4.0f, 10.0f, 8.0f);
        class048392.N("right_hind_leg", class048222, class04838.N((float)-4.5f, (float)14.0f, (float)6.0f));
        class048392.N("left_hind_leg", class048222, class04838.N((float)4.5f, (float)14.0f, (float)6.0f));
        class04822 class048223 = class04822.L().N(50, 40).N(-2.0f, 0.0f, -2.0f, 4.0f, 10.0f, 6.0f);
        class048392.N("right_front_leg", class048223, class04838.N((float)-3.5f, (float)14.0f, (float)-8.0f));
        class048392.N("left_front_leg", class048223, class04838.N((float)3.5f, (float)14.0f, (float)-8.0f));
        return class04806.N((class04792)class047922, (int)128, (int)64).N(bl ? B : class02415.N).N(class02415.N((float)1.2f));
    }

    public void method_2819(class08463 class084632) {
        super.method_2819((class08476)class084632);
        float f = class084632.N * class084632.N;
        float f2 = class084632.Nu;
        float f3 = class084632.NB ? 0.44444445f : 1.0f;
        this.L.i -= f * (float)Math.PI * 0.35f;
        this.L.L += f * f2 * 2.0f;
        this.R.L -= f * f2 * 20.0f;
        this.R.u += f * f2 * 4.0f;
        this.R.i -= f * (float)Math.PI * 0.45f;
        this.M.L = this.R.L;
        this.M.u = this.R.u;
        this.M.i -= f * (float)Math.PI * 0.45f;
        this.y.L -= f * f3 * 24.0f;
        this.y.u += f * f3 * 13.0f;
        this.y.i += f * (float)Math.PI * 0.15f;
    }
}

