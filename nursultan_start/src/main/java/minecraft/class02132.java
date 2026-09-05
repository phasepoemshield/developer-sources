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
 *  minecraft.class06851
 *  minecraft.class08489
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
import minecraft.class06851;
import minecraft.class08489;

public class class02132
extends class06078<class08489> {
    public static final String N = "lid";
    private static final String y = "base";
    private final class01686 L;
    private final class01686 u;

    private static class04792 L() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N(N, class04822.L().N(0, 0).N(-8.0f, -16.0f, -8.0f, 16.0f, 12.0f, 16.0f), class04838.N((float)0.0f, (float)24.0f, (float)0.0f));
        class048392.N(y, class04822.L().N(0, 28).N(-8.0f, -8.0f, -8.0f, 16.0f, 8.0f, 16.0f), class04838.N((float)0.0f, (float)24.0f, (float)0.0f));
        return class047922;
    }

    public class02132(class01686 class016862) {
        super(class016862, class06851::B);
        this.L = class016862.y(N);
        this.u = class016862.y("head");
    }

    public static class04806 y() {
        return class04806.N((class04792)class02132.L(), (int)64, (int)64);
    }

    public static class04806 N() {
        class04792 class047922 = class02132.L();
        class047922.N().N("head", class04822.L().N(0, 52).N(-3.0f, 0.0f, -3.0f, 6.0f, 6.0f, 6.0f), class04838.N((float)0.0f, (float)12.0f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    public void method_2819(class08489 class084892) {
        super.method_2819((Object)class084892);
        float f = (0.5f + class084892.L) * (float)Math.PI;
        float f2 = -1.0f + class04995.m((double)f);
        float f3 = 0.0f;
        if (f > (float)Math.PI) {
            f3 = class04995.m((double)(class084892.P * 0.1f)) * 0.7f;
        }
        this.L.N(0.0f, 16.0f + class04995.m((double)f) * 8.0f + f3, 0.0f);
        this.L.R = class084892.L > 0.3f ? f2 * f2 * f2 * f2 * (float)Math.PI * 0.125f : 0.0f;
        this.u.i = class084892.h * ((float)Math.PI / 180);
        this.u.R = (class084892.u - 180.0f - class084892.i) * ((float)Math.PI / 180);
    }
}

