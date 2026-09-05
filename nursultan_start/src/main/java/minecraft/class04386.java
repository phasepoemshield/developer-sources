/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class04792
 *  minecraft.class04806
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
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class08476;

public class class04386
extends class06078<class08476> {
    private static final String N = "upper_body";
    private final class01686 y;
    private final class01686 L;
    private final class01686 u;
    private final class01686 i;

    public class04386(class01686 class016862) {
        super(class016862);
        this.L = class016862.y("head");
        this.u = class016862.y("left_arm");
        this.i = class016862.y("right_arm");
        this.y = class016862.y(N);
    }

    public class01686 y() {
        return this.L;
    }

    public void method_2819(class08476 class084762) {
        super.method_2819((Object)class084762);
        this.L.R = class084762.D * ((float)Math.PI / 180);
        this.L.i = class084762.h * ((float)Math.PI / 180);
        this.y.R = class084762.D * ((float)Math.PI / 180) * 0.25f;
        float f = class04995.m((double)this.y.R);
        float f2 = class04995.P((double)this.y.R);
        this.u.R = this.y.R;
        this.i.R = this.y.R + (float)Math.PI;
        this.u.y = f2 * 5.0f;
        this.u.u = -f * 5.0f;
        this.i.y = -f2 * 5.0f;
        this.i.u = f * 5.0f;
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        float f = 4.0f;
        class04834 class048342 = new class04834(-0.5f);
        class048392.N("head", class04822.L().N(0, 0).N(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, class048342), class04838.N((float)0.0f, (float)4.0f, (float)0.0f));
        class04822 class048222 = class04822.L().N(32, 0).N(-1.0f, 0.0f, -1.0f, 12.0f, 2.0f, 2.0f, class048342);
        class048392.N("left_arm", class048222, class04838.N((float)5.0f, (float)6.0f, (float)1.0f, (float)0.0f, (float)0.0f, (float)1.0f));
        class048392.N("right_arm", class048222, class04838.N((float)-5.0f, (float)6.0f, (float)-1.0f, (float)0.0f, (float)((float)Math.PI), (float)-1.0f));
        class048392.N(N, class04822.L().N(0, 16).N(-5.0f, -10.0f, -5.0f, 10.0f, 10.0f, 10.0f, class048342), class04838.N((float)0.0f, (float)13.0f, (float)0.0f));
        class048392.N("lower_body", class04822.L().N(0, 36).N(-6.0f, -12.0f, -6.0f, 12.0f, 12.0f, 12.0f, class048342), class04838.N((float)0.0f, (float)24.0f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }
}

