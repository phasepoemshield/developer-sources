/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class04792
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class08476
 */
package minecraft;

import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class08476;

public class class04532<T extends class08476>
extends class06078<T> {
    protected final class01686 y;
    protected final class01686 L;
    protected final class01686 u;
    protected final class01686 i;
    protected final class01686 R;
    protected final class01686 M;

    public class04532(class01686 class016862) {
        super(class016862);
        this.y = class016862.y("head");
        this.L = class016862.y("body");
        this.u = class016862.y("right_hind_leg");
        this.i = class016862.y("left_hind_leg");
        this.R = class016862.y("right_front_leg");
        this.M = class016862.y("left_front_leg");
    }

    public void method_2819(T t) {
        super.method_2819(t);
        this.y.i = ((class08476)t).h * ((float)Math.PI / 180);
        this.y.R = ((class08476)t).D * ((float)Math.PI / 180);
        float f = ((class08476)t).NN;
        float f2 = ((class08476)t).Ny;
        this.u.i = class04995.P((double)(f * 0.6662f)) * 1.4f * f2;
        this.i.i = class04995.P((double)(f * 0.6662f + (float)Math.PI)) * 1.4f * f2;
        this.R.i = class04995.P((double)(f * 0.6662f + (float)Math.PI)) * 1.4f * f2;
        this.M.i = class04995.P((double)(f * 0.6662f)) * 1.4f * f2;
    }

    static void N(class04839 class048392, boolean bl, boolean bl2, int n, class04834 class048342) {
        class04822 class048222 = class04822.L().N(bl2).N(0, 16).N(-2.0f, 0.0f, -2.0f, 4.0f, (float)n, 4.0f, class048342);
        class04822 class048223 = class04822.L().N(bl).N(0, 16).N(-2.0f, 0.0f, -2.0f, 4.0f, (float)n, 4.0f, class048342);
        class048392.N("right_hind_leg", class048222, class04838.N((float)-3.0f, (float)(24 - n), (float)7.0f));
        class048392.N("left_hind_leg", class048223, class04838.N((float)3.0f, (float)(24 - n), (float)7.0f));
        class048392.N("right_front_leg", class048222, class04838.N((float)-3.0f, (float)(24 - n), (float)-5.0f));
        class048392.N("left_front_leg", class048223, class04838.N((float)3.0f, (float)(24 - n), (float)-5.0f));
    }

    public static class04792 N(int n, boolean bl, boolean bl2, class04834 class048342) {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N("head", class04822.L().N(0, 0).N(-4.0f, -4.0f, -8.0f, 8.0f, 8.0f, 8.0f, class048342), class04838.N((float)0.0f, (float)(18 - n), (float)-6.0f));
        class048392.N("body", class04822.L().N(28, 8).N(-5.0f, -10.0f, -7.0f, 10.0f, 16.0f, 8.0f, class048342), class04838.N((float)0.0f, (float)(17 - n), (float)2.0f, (float)1.5707964f, (float)0.0f, (float)0.0f));
        class04532.N(class048392, bl, bl2, n, class048342);
        return class047922;
    }
}

