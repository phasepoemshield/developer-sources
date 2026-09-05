/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class08800
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
import minecraft.class08800;

public class class04807
extends class06078<class08800> {
    private static final int N = 4;
    private static final int[][] y = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
    private static final int[][] L = new int[][]{{0, 0}, {0, 5}, {0, 14}, {0, 18}};
    private final class01686[] u = new class01686[4];

    public class04807(class01686 class016862) {
        super(class016862);
        for (int i = 0; i < 4; ++i) {
            this.u[i] = class016862.y(class04807.N(i));
        }
    }

    public void method_2819(class08800 class088002) {
        super.method_2819((Object)class088002);
        for (int i = 0; i < this.u.length; ++i) {
            this.u[i].R = class04995.P((double)(class088002.P * 0.9f + (float)i * 0.15f * (float)Math.PI)) * (float)Math.PI * 0.01f * (float)(1 + Math.abs(i - 2));
            this.u[i].y = class04995.m((double)(class088002.P * 0.9f + (float)i * 0.15f * (float)Math.PI)) * (float)Math.PI * 0.1f * (float)Math.abs(i - 2);
        }
    }

    private static String N(int n) {
        return "segment" + n;
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        float f = -3.5f;
        for (int i = 0; i < 4; ++i) {
            class048392.N(class04807.N(i), class04822.L().N(L[i][0], L[i][1]).N((float)y[i][0] * -0.5f, 0.0f, (float)y[i][2] * -0.5f, y[i][0], y[i][1], y[i][2]), class04838.N((float)0.0f, (float)(24 - y[i][1]), (float)f));
            if (i >= 3) continue;
            f += (float)(y[i][2] + y[i + 1][2]) * 0.5f;
        }
        return class04806.N(class047922, 64, 32);
    }
}

