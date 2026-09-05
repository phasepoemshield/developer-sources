/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class08440
 */
package minecraft;

import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class08440;

public class class01156
extends class06078<class08440> {
    private final class01686 N;
    private final class01686 y;
    private final class01686 L;
    private final class01686 u;
    private final class01686 i;
    private final class01686 R;
    private final class01686 M;

    public class01156(class01686 class016862) {
        super(class016862);
        this.M = class016862.y("neck");
        this.N = this.M.y("head");
        this.y = this.N.y("mouth");
        this.L = class016862.y("right_hind_leg");
        this.u = class016862.y("left_hind_leg");
        this.i = class016862.y("right_front_leg");
        this.R = class016862.y("left_front_leg");
    }

    public void method_2819(class08440 class084402) {
        float f;
        float f2;
        super.method_2819((Object)class084402);
        float f3 = class084402.N;
        float f4 = class084402.y;
        int n = 10;
        if (f4 > 0.0f) {
            f2 = class04995.R((float)f4, (float)10.0f);
            f = (1.0f + f2) * 0.5f;
            float f5 = f * f * f * 12.0f;
            float f6 = f5 * class04995.m((double)this.M.i);
            this.M.u = -6.5f + f5;
            this.M.L = -7.0f - f6;
            this.y.i = f4 > 5.0f ? class04995.m((double)((-4.0f + f4) / 4.0f)) * (float)Math.PI * 0.4f : 0.15707964f * class04995.m((double)((float)Math.PI * f4 / 10.0f));
        } else {
            f2 = -1.0f;
            f = -1.0f * class04995.m((double)this.M.i);
            this.M.y = 0.0f;
            this.M.L = -7.0f - f;
            this.M.u = 5.5f;
            boolean bl = f3 > 0.0f;
            this.M.i = bl ? 0.21991149f : 0.0f;
            this.y.i = (float)Math.PI * (bl ? 0.05f : 0.01f);
            if (bl) {
                double d = (double)f3 / 40.0;
                this.M.y = (float)Math.sin(d * 10.0) * 3.0f;
            } else if ((double)class084402.L > 0.0) {
                float f7 = class04995.m((double)(class084402.L * (float)Math.PI * 0.25f));
                this.y.i = 1.5707964f * f7;
            }
        }
        this.N.i = class084402.h * ((float)Math.PI / 180);
        this.N.R = class084402.D * ((float)Math.PI / 180);
        f2 = class084402.NN;
        f = 0.4f * class084402.Ny;
        this.L.i = class04995.P((double)(f2 * 0.6662f)) * f;
        this.u.i = class04995.P((double)(f2 * 0.6662f + (float)Math.PI)) * f;
        this.i.i = class04995.P((double)(f2 * 0.6662f + (float)Math.PI)) * f;
        this.R.i = class04995.P((double)(f2 * 0.6662f)) * f;
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        int n = 16;
        class04839 class048393 = class048392.N("neck", class04822.L().N(68, 73).N(-5.0f, -1.0f, -18.0f, 10.0f, 10.0f, 18.0f), class04838.N((float)0.0f, (float)-7.0f, (float)5.5f)).N("head", class04822.L().N(0, 0).N(-8.0f, -20.0f, -14.0f, 16.0f, 20.0f, 16.0f).N(0, 0).N(-2.0f, -6.0f, -18.0f, 4.0f, 8.0f, 4.0f), class04838.N((float)0.0f, (float)16.0f, (float)-17.0f));
        class048393.N("right_horn", class04822.L().N(74, 55).N(0.0f, -14.0f, -2.0f, 2.0f, 14.0f, 4.0f), class04838.N((float)-10.0f, (float)-14.0f, (float)-8.0f, (float)1.0995574f, (float)0.0f, (float)0.0f));
        class048393.N("left_horn", class04822.L().N(74, 55).N().N(0.0f, -14.0f, -2.0f, 2.0f, 14.0f, 4.0f), class04838.N((float)8.0f, (float)-14.0f, (float)-8.0f, (float)1.0995574f, (float)0.0f, (float)0.0f));
        class048393.N("mouth", class04822.L().N(0, 36).N(-8.0f, 0.0f, -16.0f, 16.0f, 3.0f, 16.0f), class04838.N((float)0.0f, (float)-2.0f, (float)2.0f));
        class048392.N("body", class04822.L().N(0, 55).N(-7.0f, -10.0f, -7.0f, 14.0f, 16.0f, 20.0f).N(0, 91).N(-6.0f, 6.0f, -7.0f, 12.0f, 13.0f, 18.0f), class04838.N((float)0.0f, (float)1.0f, (float)2.0f, (float)1.5707964f, (float)0.0f, (float)0.0f));
        class048392.N("right_hind_leg", class04822.L().N(96, 0).N(-4.0f, 0.0f, -4.0f, 8.0f, 37.0f, 8.0f), class04838.N((float)-8.0f, (float)-13.0f, (float)18.0f));
        class048392.N("left_hind_leg", class04822.L().N(96, 0).N().N(-4.0f, 0.0f, -4.0f, 8.0f, 37.0f, 8.0f), class04838.N((float)8.0f, (float)-13.0f, (float)18.0f));
        class048392.N("right_front_leg", class04822.L().N(64, 0).N(-4.0f, 0.0f, -4.0f, 8.0f, 37.0f, 8.0f), class04838.N((float)-8.0f, (float)-13.0f, (float)-5.0f));
        class048392.N("left_front_leg", class04822.L().N(64, 0).N().N(-4.0f, 0.0f, -4.0f, 8.0f, 37.0f, 8.0f), class04838.N((float)8.0f, (float)-13.0f, (float)-5.0f));
        return class04806.N((class04792)class047922, (int)128, (int)128);
    }
}

