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
 *  minecraft.class08800
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
import minecraft.class08800;

public class class02138
extends class06078<class08800> {
    private static final int N = 7;
    private final class01686[] y = new class01686[7];
    private final class01686[] L = new class01686[3];
    private static final int[][] u = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
    private static final int[][] i = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};

    public class02138(class01686 class016862) {
        super(class016862);
        Arrays.setAll(this.y, n -> class016862.y(class02138.y(n)));
        Arrays.setAll(this.L, n -> class016862.y(class02138.N(n)));
    }

    private static String y(int n) {
        return "segment" + n;
    }

    public void method_2819(class08800 class088002) {
        super.method_2819((Object)class088002);
        for (int i = 0; i < this.y.length; ++i) {
            this.y[i].R = class04995.P((double)(class088002.P * 0.9f + (float)i * 0.15f * (float)Math.PI)) * (float)Math.PI * 0.05f * (float)(1 + Math.abs(i - 2));
            this.y[i].y = class04995.m((double)(class088002.P * 0.9f + (float)i * 0.15f * (float)Math.PI)) * (float)Math.PI * 0.2f * (float)Math.abs(i - 2);
        }
        this.L[0].R = this.y[2].R;
        this.L[1].R = this.y[4].R;
        this.L[1].y = this.y[4].y;
        this.L[2].R = this.y[1].R;
        this.L[2].y = this.y[1].y;
    }

    private static String N(int n) {
        return "layer" + n;
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        float[] fArray = new float[7];
        float f = -3.5f;
        for (int i = 0; i < 7; ++i) {
            class048392.N(class02138.y(i), class04822.L().N(class02138.i[i][0], class02138.i[i][1]).N((float)u[i][0] * -0.5f, 0.0f, (float)u[i][2] * -0.5f, (float)u[i][0], (float)u[i][1], (float)u[i][2]), class04838.N((float)0.0f, (float)(24 - u[i][1]), (float)f));
            fArray[i] = f;
            if (i >= 6) continue;
            f += (float)(u[i][2] + u[i + 1][2]) * 0.5f;
        }
        class048392.N(class02138.N(0), class04822.L().N(20, 0).N(-5.0f, 0.0f, (float)u[2][2] * -0.5f, 10.0f, 8.0f, (float)u[2][2]), class04838.N((float)0.0f, (float)16.0f, (float)fArray[2]));
        class048392.N(class02138.N(1), class04822.L().N(20, 11).N(-3.0f, 0.0f, (float)u[4][2] * -0.5f, 6.0f, 4.0f, (float)u[4][2]), class04838.N((float)0.0f, (float)20.0f, (float)fArray[4]));
        class048392.N(class02138.N(2), class04822.L().N(20, 18).N(-3.0f, 0.0f, (float)u[4][2] * -0.5f, 6.0f, 5.0f, (float)u[1][2]), class04838.N((float)0.0f, (float)19.0f, (float)fArray[1]));
        return class04806.N((class04792)class047922, (int)64, (int)32);
    }
}

