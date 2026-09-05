/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class08479
 */
package minecraft;

import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class08479;

public class class01174
extends class06078<class08479> {
    private final class01686 N;
    private final class01686 y;
    private final class01686 L;
    private final class01686 u;
    private final class01686 i;

    public class01174(class01686 class016862) {
        super(class016862);
        this.N = class016862.y("head");
        this.y = class016862.y("right_arm");
        this.L = class016862.y("left_arm");
        this.u = class016862.y("right_leg");
        this.i = class016862.y("left_leg");
    }

    public class01686 y() {
        return this.y;
    }

    public void method_2819(class08479 class084792) {
        super.method_2819((Object)class084792);
        float f = class084792.N;
        float f2 = class084792.Ny;
        float f3 = class084792.NN;
        if (f > 0.0f) {
            this.y.i = -2.0f + 1.5f * class04995.R((float)f, (float)10.0f);
            this.L.i = -2.0f + 1.5f * class04995.R((float)f, (float)10.0f);
        } else {
            int n = class084792.y;
            if (n > 0) {
                this.y.i = -0.8f + 0.025f * class04995.R((float)n, (float)70.0f);
                this.L.i = 0.0f;
            } else {
                this.y.i = (-0.2f + 1.5f * class04995.R((float)f3, (float)13.0f)) * f2;
                this.L.i = (-0.2f - 1.5f * class04995.R((float)f3, (float)13.0f)) * f2;
            }
        }
        this.N.R = class084792.D * ((float)Math.PI / 180);
        this.N.i = class084792.h * ((float)Math.PI / 180);
        this.u.i = -1.5f * class04995.R((float)f3, (float)13.0f) * f2;
        this.i.i = 1.5f * class04995.R((float)f3, (float)13.0f) * f2;
        this.u.R = 0.0f;
        this.i.R = 0.0f;
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N("head", class04822.L().N(0, 0).N(-4.0f, -12.0f, -5.5f, 8.0f, 10.0f, 8.0f).N(24, 0).N(-1.0f, -5.0f, -7.5f, 2.0f, 4.0f, 2.0f), class04838.N((float)0.0f, (float)-7.0f, (float)-2.0f));
        class048392.N("body", class04822.L().N(0, 40).N(-9.0f, -2.0f, -6.0f, 18.0f, 12.0f, 11.0f).N(0, 70).N(-4.5f, 10.0f, -3.0f, 9.0f, 5.0f, 6.0f, new class04834(0.5f)), class04838.N((float)0.0f, (float)-7.0f, (float)0.0f));
        class048392.N("right_arm", class04822.L().N(60, 21).N(-13.0f, -2.5f, -3.0f, 4.0f, 30.0f, 6.0f), class04838.N((float)0.0f, (float)-7.0f, (float)0.0f));
        class048392.N("left_arm", class04822.L().N(60, 58).N(9.0f, -2.5f, -3.0f, 4.0f, 30.0f, 6.0f), class04838.N((float)0.0f, (float)-7.0f, (float)0.0f));
        class048392.N("right_leg", class04822.L().N(37, 0).N(-3.5f, -3.0f, -3.0f, 6.0f, 16.0f, 5.0f), class04838.N((float)-4.0f, (float)11.0f, (float)0.0f));
        class048392.N("left_leg", class04822.L().N(60, 0).N().N(-3.5f, -3.0f, -3.0f, 6.0f, 16.0f, 5.0f), class04838.N((float)5.0f, (float)11.0f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)128, (int)128);
    }
}

