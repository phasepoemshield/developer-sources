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
 *  minecraft.class08798
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
import minecraft.class08798;

public class class03114
extends class06078<class08798> {
    public static final class02415 N = class02415.N((float)0.5f);
    private final class01686 y;
    private final class01686 L;
    private final class01686 u;

    public class03114(class01686 class016862) {
        super(class016862);
        this.y = class016862.y("body");
        this.L = this.y.y("tail");
        this.u = this.L.y("tail_fin");
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        float f = 18.0f;
        float f2 = -8.0f;
        class04839 class048393 = class048392.N("body", class04822.L().N(22, 0).N(-4.0f, -7.0f, 0.0f, 8.0f, 7.0f, 13.0f), class04838.N((float)0.0f, (float)22.0f, (float)-5.0f));
        class048393.N("back_fin", class04822.L().N(51, 0).N(-0.5f, 0.0f, 8.0f, 1.0f, 4.0f, 5.0f), class04838.y((float)1.0471976f, (float)0.0f, (float)0.0f));
        class048393.N("left_fin", class04822.L().N(48, 20).N().N(-0.5f, -4.0f, 0.0f, 1.0f, 4.0f, 7.0f), class04838.N((float)2.0f, (float)-2.0f, (float)4.0f, (float)1.0471976f, (float)0.0f, (float)2.0943952f));
        class048393.N("right_fin", class04822.L().N(48, 20).N(-0.5f, -4.0f, 0.0f, 1.0f, 4.0f, 7.0f), class04838.N((float)-2.0f, (float)-2.0f, (float)4.0f, (float)1.0471976f, (float)0.0f, (float)-2.0943952f));
        class048393.N("tail", class04822.L().N(0, 19).N(-2.0f, -2.5f, 0.0f, 4.0f, 5.0f, 11.0f), class04838.N((float)0.0f, (float)-2.5f, (float)11.0f, (float)-0.10471976f, (float)0.0f, (float)0.0f)).N("tail_fin", class04822.L().N(19, 20).N(-5.0f, -0.5f, 0.0f, 10.0f, 1.0f, 6.0f), class04838.N((float)0.0f, (float)0.0f, (float)9.0f));
        class048393.N("head", class04822.L().N(0, 0).N(-4.0f, -3.0f, -3.0f, 8.0f, 7.0f, 6.0f), class04838.N((float)0.0f, (float)-4.0f, (float)-3.0f)).N("nose", class04822.L().N(0, 13).N(-1.0f, 2.0f, -7.0f, 2.0f, 2.0f, 4.0f), class04838.N);
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    public void method_2819(class08798 class087982) {
        super.method_2819((Object)class087982);
        this.y.i = class087982.h * ((float)Math.PI / 180);
        this.y.R = class087982.D * ((float)Math.PI / 180);
        if (class087982.N) {
            this.y.i += -0.05f - 0.05f * class04995.P((double)(class087982.P * 0.3f));
            this.L.i = -0.1f * class04995.P((double)(class087982.P * 0.3f));
            this.u.i = -0.2f * class04995.P((double)(class087982.P * 0.3f));
        }
    }
}

