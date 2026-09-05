/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02415
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class06889
 *  minecraft.class08455
 */
package minecraft;

import minecraft.class01686;
import minecraft.class02415;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class06889;
import minecraft.class08455;

public class class06346
extends class06078<class08455> {
    public static final class02415 N = class02415.N((float)2.35f);
    private static final float[] y = new float[]{1.75f, 0.25f, 0.0f, 0.0f, 0.5f, 0.5f, 0.5f, 0.5f, 1.25f, 0.75f, 0.0f, 0.0f};
    private static final float[] L = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 1.75f, 1.25f, 0.75f, 0.0f, 0.0f, 0.0f, 0.0f};
    private static final float[] u = new float[]{0.0f, 0.0f, 0.25f, 1.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.75f, 1.25f};
    private static final float[] i = new float[]{0.0f, 0.0f, 8.0f, -8.0f, -8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f, 8.0f, -8.0f};
    private static final float[] R = new float[]{-8.0f, -8.0f, -8.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 8.0f, 8.0f, 8.0f, 8.0f};
    private static final float[] M = new float[]{8.0f, -8.0f, 0.0f, 0.0f, -8.0f, -8.0f, 8.0f, 8.0f, 8.0f, -8.0f, 0.0f, 0.0f};
    private static final String B = "eye";
    private static final String Z = "tail0";
    private static final String z = "tail1";
    private static final String U = "tail2";
    private final class01686 E;
    private final class01686 W;
    private final class01686[] m = new class01686[12];
    private final class01686[] P;

    private static float L(int n, float f, float f2) {
        return 16.0f + R[n] * class06346.N(n, f, f2);
    }

    public class06346(class01686 class016862) {
        super(class016862);
        this.E = class016862.y("head");
        for (int i = 0; i < this.m.length; ++i) {
            this.m[i] = this.E.y(class06346.N(i));
        }
        this.W = this.E.y(B);
        this.P = new class01686[3];
        this.P[0] = this.E.y(Z);
        this.P[1] = this.P[0].y(z);
        this.P[2] = this.P[1].y(U);
    }

    private static float u(int n, float f, float f2) {
        return M[n] * class06346.N(n, f, f2);
    }

    private static float y(int n, float f, float f2) {
        return i[n] * class06346.N(n, f, f2);
    }

    public static class04806 y() {
        return class06346.N().N(N);
    }

    private static float N(int n, float f, float f2) {
        return 1.0f + class04995.P((double)(f * 1.5f + (float)n)) * 0.01f - f2;
    }

    private static String N(int n) {
        return "spike" + n;
    }

    private void N(float f, float f2) {
        for (int i = 0; i < 12; ++i) {
            this.m[i].y = class06346.y(i, f, f2);
            this.m[i].L = class06346.L(i, f, f2);
            this.m[i].u = class06346.u(i, f, f2);
        }
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N().N("head", class04822.L().N(0, 0).N(-6.0f, 10.0f, -8.0f, 12.0f, 12.0f, 16.0f).N(0, 28).N(-8.0f, 10.0f, -6.0f, 2.0f, 12.0f, 12.0f).N(0, 28).N(6.0f, 10.0f, -6.0f, 2.0f, 12.0f, 12.0f, true).N(16, 40).N(-6.0f, 8.0f, -6.0f, 12.0f, 2.0f, 12.0f).N(16, 40).N(-6.0f, 22.0f, -6.0f, 12.0f, 2.0f, 12.0f), class04838.N);
        class04822 class048222 = class04822.L().N(0, 0).N(-1.0f, -4.5f, -1.0f, 2.0f, 9.0f, 2.0f);
        for (int i = 0; i < 12; ++i) {
            float f = class06346.y(i, 0.0f, 0.0f);
            float f2 = class06346.L(i, 0.0f, 0.0f);
            float f3 = class06346.u(i, 0.0f, 0.0f);
            float f4 = (float)Math.PI * y[i];
            float f5 = (float)Math.PI * L[i];
            float f6 = (float)Math.PI * u[i];
            class048392.N(class06346.N(i), class048222, class04838.N((float)f, (float)f2, (float)f3, (float)f4, (float)f5, (float)f6));
        }
        class048392.N(B, class04822.L().N(8, 0).N(-1.0f, 15.0f, 0.0f, 2.0f, 2.0f, 1.0f), class04838.N((float)0.0f, (float)0.0f, (float)-8.25f));
        class04839 class048393 = class048392.N(Z, class04822.L().N(40, 0).N(-2.0f, 14.0f, 7.0f, 4.0f, 4.0f, 8.0f), class04838.N);
        class04839 class048394 = class048393.N(z, class04822.L().N(0, 54).N(0.0f, 14.0f, 0.0f, 3.0f, 3.0f, 7.0f), class04838.N((float)-1.5f, (float)0.5f, (float)14.0f));
        class048394.N(U, class04822.L().N(41, 32).N(0.0f, 14.0f, 0.0f, 2.0f, 2.0f, 6.0f).N(25, 19).N(1.0f, 10.5f, 3.0f, 1.0f, 9.0f, 9.0f), class04838.N((float)0.5f, (float)0.5f, (float)6.0f));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    public void method_2819(class08455 class084552) {
        super.method_2819((Object)class084552);
        this.E.R = class084552.D * ((float)Math.PI / 180);
        this.E.i = class084552.h * ((float)Math.PI / 180);
        float f = (1.0f - class084552.N) * 0.55f;
        this.N(class084552.P, f);
        if (class084552.i != null && class084552.u != null) {
            double d = class084552.i.B - class084552.L.B;
            this.W.L = d > 0.0 ? 0.0f : 1.0f;
            class06889 class068892 = class084552.u;
            class068892 = new class06889(class068892.M, 0.0, class068892.Z);
            class06889 class068893 = new class06889(class084552.L.M - class084552.i.M, 0.0, class084552.L.Z - class084552.i.Z).u().y(1.5707964f);
            double d2 = class068892.y(class068893);
            this.W.y = class04995.N((float)((float)Math.abs(d2))) * 2.0f * (float)Math.signum(d2);
        }
        this.W.U = true;
        float f2 = class084552.y;
        this.P[0].R = class04995.m((double)f2) * (float)Math.PI * 0.05f;
        this.P[1].R = class04995.m((double)f2) * (float)Math.PI * 0.1f;
        this.P[2].R = class04995.m((double)f2) * (float)Math.PI * 0.15f;
    }
}

