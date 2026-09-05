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
 *  minecraft.class06271
 *  minecraft.class06851
 */
package minecraft;

import minecraft.class01138;
import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06271;
import minecraft.class06851;

public class class01127
extends class06271<class01138> {
    private static final String N = "left_pages";
    private static final String y = "right_pages";
    private static final String L = "flip_page1";
    private static final String u = "flip_page2";
    private final class01686 i;
    private final class01686 R;
    private final class01686 M;
    private final class01686 B;
    private final class01686 Z;
    private final class01686 z;

    public class01127(class01686 class016862) {
        super(class016862, class06851::u);
        this.i = class016862.y("left_lid");
        this.R = class016862.y("right_lid");
        this.M = class016862.y(N);
        this.B = class016862.y(y);
        this.Z = class016862.y(L);
        this.z = class016862.y(u);
    }

    public void method_2819(class01138 class011382) {
        super.method_2819((Object)class011382);
        float f = (class04995.m((double)(class011382.N() * 0.02f)) * 0.1f + 1.25f) * class011382.u();
        this.i.R = (float)Math.PI + f;
        this.R.R = -f;
        this.M.R = f;
        this.B.R = -f;
        this.Z.R = f - f * 2.0f * class011382.y();
        this.z.R = f - f * 2.0f * class011382.L();
        this.M.y = class04995.m((double)f);
        this.B.y = class04995.m((double)f);
        this.Z.y = class04995.m((double)f);
        this.z.y = class04995.m((double)f);
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N("left_lid", class04822.L().N(0, 0).N(-6.0f, -5.0f, -0.005f, 6.0f, 10.0f, 0.005f), class04838.N((float)0.0f, (float)0.0f, (float)-1.0f));
        class048392.N("right_lid", class04822.L().N(16, 0).N(0.0f, -5.0f, -0.005f, 6.0f, 10.0f, 0.005f), class04838.N((float)0.0f, (float)0.0f, (float)1.0f));
        class048392.N("seam", class04822.L().N(12, 0).N(-1.0f, -5.0f, 0.0f, 2.0f, 10.0f, 0.005f), class04838.y((float)0.0f, (float)1.5707964f, (float)0.0f));
        class048392.N(N, class04822.L().N(0, 10).N(0.0f, -4.0f, -0.99f, 5.0f, 8.0f, 1.0f), class04838.N);
        class048392.N(y, class04822.L().N(12, 10).N(0.0f, -4.0f, -0.01f, 5.0f, 8.0f, 1.0f), class04838.N);
        class04822 class048222 = class04822.L().N(24, 10).N(0.0f, -4.0f, 0.0f, 5.0f, 8.0f, 0.005f);
        class048392.N(L, class048222, class04838.N);
        class048392.N(u, class048222, class04838.N);
        return class04806.N((class04792)class047922, (int)64, (int)32);
    }
}

