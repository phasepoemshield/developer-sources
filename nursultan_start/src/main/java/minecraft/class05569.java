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
 *  minecraft.class06078
 *  minecraft.class08473
 */
package minecraft;

import java.util.Arrays;
import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class06078;
import minecraft.class08473;

public class class05569
extends class06078<class08473> {
    private static final int N = 8;
    private final class01686[] y = new class01686[8];

    public class05569(class01686 class016862) {
        super(class016862);
        Arrays.setAll(this.y, n -> class016862.y(class05569.N(n)));
    }

    public void method_2819(class08473 class084732) {
        super.method_2819((Object)class084732);
        float f = Math.max(0.0f, class084732.N);
        for (int i = 0; i < this.y.length; ++i) {
            this.y[i].L = (float)(-(4 - i)) * f * 1.7f;
        }
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        for (int i = 0; i < 8; ++i) {
            int n = 0;
            int n2 = 0;
            if (i > 0 && i < 4) {
                n2 += 9 * i;
            } else if (i > 3) {
                n = 32;
                n2 += 9 * i - 36;
            }
            class048392.N(class05569.N(i), class04822.L().N(n, n2).N(-4.0f, (float)(16 + i), -4.0f, 8.0f, 1.0f, 8.0f), class04838.N);
        }
        class048392.N("inside_cube", class04822.L().N(24, 40).N(-2.0f, 18.0f, -2.0f, 4.0f, 4.0f, 4.0f), class04838.N);
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    private static String N(int n) {
        return "cube" + n;
    }
}

