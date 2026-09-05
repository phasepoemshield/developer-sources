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
 *  minecraft.class08461
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
import minecraft.class08461;

public class class06074
extends class06078<class08461> {
    private static final String N = "tail_base";
    private static final String y = "tail_tip";
    private final class01686 L;
    private final class01686 u;
    private final class01686 i;
    private final class01686 R;
    private final class01686 M;
    private final class01686 B;

    public class06074(class01686 class016862) {
        super(class016862);
        class01686 class016863 = class016862.y("body");
        this.M = class016863.y(N);
        this.B = this.M.y(y);
        this.L = class016863.y("left_wing_base");
        this.u = this.L.y("left_wing_tip");
        this.i = class016863.y("right_wing_base");
        this.R = this.i.y("right_wing_tip");
    }

    public void method_2819(class08461 class084612) {
        super.method_2819((Object)class084612);
        float f = class084612.N * 7.448451f * ((float)Math.PI / 180);
        float f2 = 16.0f;
        this.L.M = class04995.P((double)f) * 16.0f * ((float)Math.PI / 180);
        this.u.M = class04995.P((double)f) * 16.0f * ((float)Math.PI / 180);
        this.i.M = -this.L.M;
        this.R.M = -this.u.M;
        this.M.i = -(5.0f + class04995.P((double)(f * 2.0f)) * 5.0f) * ((float)Math.PI / 180);
        this.B.i = -(5.0f + class04995.P((double)(f * 2.0f)) * 5.0f) * ((float)Math.PI / 180);
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N().N("body", class04822.L().N(0, 8).N(-3.0f, -2.0f, -8.0f, 5.0f, 3.0f, 9.0f), class04838.y((float)-0.1f, (float)0.0f, (float)0.0f));
        class048392.N(N, class04822.L().N(3, 20).N(-2.0f, 0.0f, 0.0f, 3.0f, 2.0f, 6.0f), class04838.N((float)0.0f, (float)-2.0f, (float)1.0f)).N(y, class04822.L().N(4, 29).N(-1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 6.0f), class04838.N((float)0.0f, (float)0.5f, (float)6.0f));
        class048392.N("left_wing_base", class04822.L().N(23, 12).N(0.0f, 0.0f, 0.0f, 6.0f, 2.0f, 9.0f), class04838.N((float)2.0f, (float)-2.0f, (float)-8.0f, (float)0.0f, (float)0.0f, (float)0.1f)).N("left_wing_tip", class04822.L().N(16, 24).N(0.0f, 0.0f, 0.0f, 13.0f, 1.0f, 9.0f), class04838.N((float)6.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.1f));
        class048392.N("right_wing_base", class04822.L().N(23, 12).N().N(-6.0f, 0.0f, 0.0f, 6.0f, 2.0f, 9.0f), class04838.N((float)-3.0f, (float)-2.0f, (float)-8.0f, (float)0.0f, (float)0.0f, (float)-0.1f)).N("right_wing_tip", class04822.L().N(16, 24).N().N(-13.0f, 0.0f, 0.0f, 13.0f, 1.0f, 9.0f), class04838.N((float)-6.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)-0.1f));
        class048392.N("head", class04822.L().N(0, 0).N(-4.0f, -2.0f, -5.0f, 7.0f, 3.0f, 5.0f), class04838.N((float)0.0f, (float)1.0f, (float)-7.0f, (float)0.2f, (float)0.0f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }
}

