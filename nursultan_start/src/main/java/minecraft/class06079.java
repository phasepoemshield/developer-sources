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
 *  minecraft.class07654
 *  minecraft.class08450
 */
package minecraft;

import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06067;
import minecraft.class06078;
import minecraft.class07654;
import minecraft.class08450;

public class class06079
extends class06078<class08450> {
    private static final String N = "feather";
    private final class01686 y;
    private final class01686 L;
    private final class01686 u;
    private final class01686 i;
    private final class01686 R;
    private final class01686 M;
    private final class01686 B;

    public class06079(class01686 class016862) {
        super(class016862);
        this.y = class016862.y("body");
        this.L = class016862.y("tail");
        this.u = class016862.y("left_wing");
        this.i = class016862.y("right_wing");
        this.R = class016862.y("head");
        this.M = class016862.y("left_leg");
        this.B = class016862.y("right_leg");
    }

    public static class06067 N(class07654 class076542) {
        if (class076542.W()) {
            return class06067.field_3463;
        }
        if (class076542.Ng()) {
            return class06067.field_3466;
        }
        if (class076542.y()) {
            return class06067.field_3462;
        }
        return class06067.field_3465;
    }

    private void N(class06067 class060672) {
        switch (class060672.ordinal()) {
            case 0: {
                this.M.i += 0.6981317f;
                this.B.i += 0.6981317f;
                break;
            }
            case 2: {
                float f = 1.9f;
                this.R.L += 1.9f;
                this.L.i += 0.5235988f;
                this.L.L += 1.9f;
                this.y.L += 1.9f;
                this.u.M = -0.0873f;
                this.u.L += 1.9f;
                this.i.M = 0.0873f;
                this.i.L += 1.9f;
                this.M.L += 1.9f;
                this.B.L += 1.9f;
                this.M.i += 1.5707964f;
                this.B.i += 1.5707964f;
                break;
            }
            case 3: {
                this.M.M = -0.34906584f;
                this.B.M = 0.34906584f;
                break;
            }
        }
    }

    public void method_2819(class08450 class084502) {
        super.method_2819((Object)class084502);
        this.N(class084502.L);
        this.R.i = class084502.h * ((float)Math.PI / 180);
        this.R.R = class084502.D * ((float)Math.PI / 180);
        switch (class084502.L.ordinal()) {
            case 2: {
                break;
            }
            case 3: {
                float f = class04995.P((double)class084502.P);
                float f2 = class04995.m((double)class084502.P);
                this.R.y += f;
                this.R.L += f2;
                this.R.i = 0.0f;
                this.R.R = 0.0f;
                this.R.M = class04995.m((double)class084502.P) * 0.4f;
                this.y.y += f;
                this.y.L += f2;
                this.u.M = -0.0873f - class084502.y;
                this.u.y += f;
                this.u.L += f2;
                this.i.M = 0.0873f + class084502.y;
                this.i.y += f;
                this.i.L += f2;
                this.L.y += f;
                this.L.L += f2;
                break;
            }
            case 1: {
                this.M.i += class04995.P((double)(class084502.NN * 0.6662f)) * 1.4f * class084502.Ny;
                this.B.i += class04995.P((double)(class084502.NN * 0.6662f + (float)Math.PI)) * 1.4f * class084502.Ny;
            }
            default: {
                float f = class084502.y * 0.3f;
                this.R.L += f;
                this.L.i += class04995.P((double)(class084502.NN * 0.6662f)) * 0.3f * class084502.Ny;
                this.L.L += f;
                this.y.L += f;
                this.u.M = -0.0873f - class084502.y;
                this.u.L += f;
                this.i.M = 0.0873f + class084502.y;
                this.i.L += f;
                this.M.L += f;
                this.B.L += f;
            }
        }
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N("body", class04822.L().N(2, 8).N(-1.5f, 0.0f, -1.5f, 3.0f, 6.0f, 3.0f), class04838.N((float)0.0f, (float)16.5f, (float)-3.0f, (float)0.4937f, (float)0.0f, (float)0.0f));
        class048392.N("tail", class04822.L().N(22, 1).N(-1.5f, -1.0f, -1.0f, 3.0f, 4.0f, 1.0f), class04838.N((float)0.0f, (float)21.07f, (float)1.16f, (float)1.015f, (float)0.0f, (float)0.0f));
        class048392.N("left_wing", class04822.L().N(19, 8).N(-0.5f, 0.0f, -1.5f, 1.0f, 5.0f, 3.0f), class04838.N((float)1.5f, (float)16.94f, (float)-2.76f, (float)-0.6981f, (float)((float)(-Math.PI)), (float)0.0f));
        class048392.N("right_wing", class04822.L().N(19, 8).N(-0.5f, 0.0f, -1.5f, 1.0f, 5.0f, 3.0f), class04838.N((float)-1.5f, (float)16.94f, (float)-2.76f, (float)-0.6981f, (float)((float)(-Math.PI)), (float)0.0f));
        class04839 class048393 = class048392.N("head", class04822.L().N(2, 2).N(-1.0f, -1.5f, -1.0f, 2.0f, 3.0f, 2.0f), class04838.N((float)0.0f, (float)15.69f, (float)-2.76f));
        class048393.N("head2", class04822.L().N(10, 0).N(-1.0f, -0.5f, -2.0f, 2.0f, 1.0f, 4.0f), class04838.N((float)0.0f, (float)-2.0f, (float)-1.0f));
        class048393.N("beak1", class04822.L().N(11, 7).N(-0.5f, -1.0f, -0.5f, 1.0f, 2.0f, 1.0f), class04838.N((float)0.0f, (float)-0.5f, (float)-1.5f));
        class048393.N("beak2", class04822.L().N(16, 7).N(-0.5f, 0.0f, -0.5f, 1.0f, 2.0f, 1.0f), class04838.N((float)0.0f, (float)-1.75f, (float)-2.45f));
        class048393.N(N, class04822.L().N(2, 18).N(0.0f, -4.0f, -2.0f, 0.0f, 5.0f, 4.0f), class04838.N((float)0.0f, (float)-2.15f, (float)0.15f, (float)-0.2214f, (float)0.0f, (float)0.0f));
        class04822 class048222 = class04822.L().N(14, 18).N(-0.5f, 0.0f, -0.5f, 1.0f, 2.0f, 1.0f);
        class048392.N("left_leg", class048222, class04838.N((float)1.0f, (float)22.0f, (float)-1.05f, (float)-0.0299f, (float)0.0f, (float)0.0f));
        class048392.N("right_leg", class048222, class04838.N((float)-1.0f, (float)22.0f, (float)-1.05f, (float)-0.0299f, (float)0.0f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)32, (int)32);
    }
}

