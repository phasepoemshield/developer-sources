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
 *  minecraft.class08468
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
import minecraft.class08468;

public class class08232
extends class06078<class08468> {
    private static final int N = 2;
    private final class01686[] y = new class01686[2];

    public class08232(class01686 class016862) {
        super(class016862);
        for (int i = 0; i < 2; ++i) {
            this.y[i] = class016862.y(class08232.N(i));
        }
    }

    public void method_2819(class08468 class084682) {
        super.method_2819((Object)class084682);
        for (int i = 0; i < this.y.length; ++i) {
            float f = class084682.P * (float)(-(45 + (i + 1) * 5));
            this.y[i].R = class04995.R((float)f) * ((float)Math.PI / 180);
        }
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        for (int i = 0; i < 2; ++i) {
            float f = -3.2f + 9.6f * (float)(i + 1);
            float f2 = 0.75f * (float)(i + 1);
            class048392.N(class08232.N(i), class04822.L().N(0, 0).N(-8.0f, -16.0f + f, -8.0f, 16.0f, 32.0f, 16.0f), class04838.N.N(f2));
        }
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    private static String N(int n) {
        return "box" + n;
    }
}

