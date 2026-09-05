/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02415
 *  minecraft.class03088
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06078
 *  minecraft.class08462
 *  minecraft.class08800
 */
package minecraft;

import minecraft.class01686;
import minecraft.class02415;
import minecraft.class03088;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06078;
import minecraft.class08462;
import minecraft.class08800;

public class class06379
extends class06078<class08462> {
    private final class01686[] N = new class01686[9];

    public class06379(class01686 class016862) {
        super(class016862);
        for (int i = 0; i < this.N.length; ++i) {
            this.N[i] = class016862.y(class03088.N((int)i));
        }
    }

    public static void N(class08800 class088002, class01686[] class01686Array) {
        for (int i = 0; i < class01686Array.length; ++i) {
            class01686Array[i].i = 0.2f * class04995.m((double)(class088002.P * 0.3f + (float)i)) + 0.4f;
        }
    }

    public void method_2819(class08462 class084622) {
        super.method_2819((Object)class084622);
        class06379.N((class08800)class084622, this.N);
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N("body", class04822.L().N(0, 0).N(-8.0f, -8.0f, -8.0f, 16.0f, 16.0f, 16.0f), class04838.N((float)0.0f, (float)17.6f, (float)0.0f));
        class06069 class060692 = class06069.y((long)1660L);
        for (int i = 0; i < 9; ++i) {
            float f = (((float)(i % 3) - (float)(i / 3 % 2) * 0.5f + 0.25f) / 2.0f * 2.0f - 1.0f) * 5.0f;
            float f2 = ((float)(i / 3) / 2.0f * 2.0f - 1.0f) * 5.0f;
            int n = class060692.y(7) + 8;
            class048392.N(class03088.N((int)i), class04822.L().N(0, 0).N(-1.0f, 0.0f, -1.0f, 2.0f, (float)n, 2.0f), class04838.N((float)f, (float)24.6f, (float)f2));
        }
        return class04806.N((class04792)class047922, (int)64, (int)32).N(class02415.N((float)4.5f));
    }
}

