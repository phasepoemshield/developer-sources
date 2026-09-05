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
 *  minecraft.class08476
 */
package minecraft;

import java.util.Arrays;
import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class08476;

public class class01141
extends class06078<class08476> {
    private final class01686[] N;
    private final class01686 y;

    public class01141(class01686 class016862) {
        super(class016862);
        this.y = class016862.y("head");
        this.N = new class01686[12];
        Arrays.setAll(this.N, n -> class016862.y(class01141.N(n)));
    }

    public void method_2819(class08476 class084762) {
        int n;
        super.method_2819((Object)class084762);
        float f = class084762.P * (float)Math.PI * -0.1f;
        for (n = 0; n < 4; ++n) {
            this.N[n].L = -2.0f + class04995.P((double)(((float)(n * 2) + class084762.P) * 0.25f));
            this.N[n].y = class04995.P((double)f) * 9.0f;
            this.N[n].u = class04995.m((double)f) * 9.0f;
            f += 1.5707964f;
        }
        f = 0.7853982f + class084762.P * (float)Math.PI * 0.03f;
        for (n = 4; n < 8; ++n) {
            this.N[n].L = 2.0f + class04995.P((double)(((float)(n * 2) + class084762.P) * 0.25f));
            this.N[n].y = class04995.P((double)f) * 7.0f;
            this.N[n].u = class04995.m((double)f) * 7.0f;
            f += 1.5707964f;
        }
        f = 0.47123894f + class084762.P * (float)Math.PI * -0.05f;
        for (n = 8; n < 12; ++n) {
            this.N[n].L = 11.0f + class04995.P((double)(((float)n * 1.5f + class084762.P) * 0.5f));
            this.N[n].y = class04995.P((double)f) * 5.0f;
            this.N[n].u = class04995.m((double)f) * 5.0f;
            f += 1.5707964f;
        }
        this.y.R = class084762.D * ((float)Math.PI / 180);
        this.y.i = class084762.h * ((float)Math.PI / 180);
    }

    public static class04806 N() {
        float f;
        float f2;
        float f3;
        int n;
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N("head", class04822.L().N(0, 0).N(-4.0f, -4.0f, -4.0f, 8.0f, 8.0f, 8.0f), class04838.N);
        float f4 = 0.0f;
        class04822 class048222 = class04822.L().N(0, 16).N(0.0f, 0.0f, 0.0f, 2.0f, 8.0f, 2.0f);
        for (n = 0; n < 4; ++n) {
            f3 = class04995.P((double)f4) * 9.0f;
            f2 = -2.0f + class04995.P((double)((float)(n * 2) * 0.25f));
            f = class04995.m((double)f4) * 9.0f;
            class048392.N(class01141.N(n), class048222, class04838.N((float)f3, (float)f2, (float)f));
            f4 += 1.5707964f;
        }
        f4 = 0.7853982f;
        for (n = 4; n < 8; ++n) {
            f3 = class04995.P((double)f4) * 7.0f;
            f2 = 2.0f + class04995.P((double)((float)(n * 2) * 0.25f));
            f = class04995.m((double)f4) * 7.0f;
            class048392.N(class01141.N(n), class048222, class04838.N((float)f3, (float)f2, (float)f));
            f4 += 1.5707964f;
        }
        f4 = 0.47123894f;
        for (n = 8; n < 12; ++n) {
            f3 = class04995.P((double)f4) * 5.0f;
            f2 = 11.0f + class04995.P((double)((float)n * 1.5f * 0.5f));
            f = class04995.m((double)f4) * 5.0f;
            class048392.N(class01141.N(n), class048222, class04838.N((float)f3, (float)f2, (float)f));
            f4 += 1.5707964f;
        }
        return class04806.N((class04792)class047922, (int)64, (int)32);
    }

    private static String N(int n) {
        return "part" + n;
    }
}

