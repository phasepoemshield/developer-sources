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
 *  minecraft.class08486
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
import minecraft.class08486;

public class class06373
extends class06078<class08486> {
    private static final String N = "base";
    private static final String y = "upper_jaw";
    private static final String L = "lower_jaw";
    private final class01686 u;
    private final class01686 i;
    private final class01686 R;

    public class06373(class01686 class016862) {
        super(class016862);
        this.u = class016862.y(N);
        this.i = this.u.y(y);
        this.R = this.u.y(L);
    }

    public void method_2819(class08486 class084862) {
        super.method_2819((Object)class084862);
        float f = class084862.y;
        float f2 = Math.min(f * 2.0f, 1.0f);
        f2 = 1.0f - f2 * f2 * f2;
        this.i.M = (float)Math.PI - f2 * 0.35f * (float)Math.PI;
        this.R.M = (float)Math.PI + f2 * 0.35f * (float)Math.PI;
        this.u.L -= (f + class04995.m((double)(f * 2.7f))) * 7.2f;
        float f3 = 1.0f;
        if (f > 0.9f) {
            f3 *= (1.0f - f) / 0.1f;
        }
        this.field_54014.L = 24.0f - 20.0f * f3;
        this.field_54014.B = f3;
        this.field_54014.Z = f3;
        this.field_54014.z = f3;
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N().N(N, class04822.L().N(0, 0).N(0.0f, 0.0f, 0.0f, 10.0f, 12.0f, 10.0f), class04838.N((float)-5.0f, (float)24.0f, (float)-5.0f));
        class04822 class048222 = class04822.L().N(40, 0).N(0.0f, 0.0f, 0.0f, 4.0f, 14.0f, 8.0f);
        class048392.N(y, class048222, class04838.N((float)6.5f, (float)0.0f, (float)1.0f, (float)0.0f, (float)0.0f, (float)2.042035f));
        class048392.N(L, class048222, class04838.N((float)3.5f, (float)0.0f, (float)9.0f, (float)0.0f, (float)((float)Math.PI), (float)4.2411504f));
        return class04806.N((class04792)class047922, (int)64, (int)32);
    }
}

