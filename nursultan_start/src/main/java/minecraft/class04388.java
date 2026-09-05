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
 *  minecraft.class06078
 *  minecraft.class08255
 */
package minecraft;

import java.util.Arrays;
import minecraft.class01686;
import minecraft.class02415;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class06078;
import minecraft.class08255;

public class class04388
extends class06078<class08255> {
    public static final class02415 N = class02415.N((float)0.5f);
    private final class01686[] y = new class01686[8];

    public class04388(class01686 class016862) {
        super(class016862);
        Arrays.setAll(this.y, n -> class016862.y(class04388.N(n)));
    }

    public void method_2819(class08255 class082552) {
        super.method_2819((Object)class082552);
        class01686[] class01686Array = this.y;
        int n = class01686Array.length;
        for (int i = 0; i < n; ++i) {
            class01686Array[i].i = class082552.N;
        }
    }

    private static String N(int n) {
        return "tentacle" + n;
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class04834 class048342 = new class04834(0.02f);
        int n = -16;
        class048392.N("body", class04822.L().N(0, 0).N(-6.0f, -8.0f, -6.0f, 12.0f, 16.0f, 12.0f, class048342), class04838.N((float)0.0f, (float)8.0f, (float)0.0f));
        int n2 = 8;
        class04822 class048222 = class04822.L().N(48, 0).N(-1.0f, 0.0f, -1.0f, 2.0f, 18.0f, 2.0f);
        for (int i = 0; i < 8; ++i) {
            double d = (double)i * Math.PI * 2.0 / 8.0;
            float f = (float)Math.cos(d) * 5.0f;
            float f2 = 15.0f;
            float f3 = (float)Math.sin(d) * 5.0f;
            d = (double)i * Math.PI * -2.0 / 8.0 + 1.5707963267948966;
            float f4 = (float)d;
            class048392.N(class04388.N(i), class048222, class04838.N((float)f, (float)15.0f, (float)f3, (float)0.0f, (float)f4, (float)0.0f));
        }
        return class04806.N((class04792)class047922, (int)64, (int)32);
    }
}

