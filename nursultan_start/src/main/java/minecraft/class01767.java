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
 *  minecraft.class06078
 *  minecraft.class06851
 *  minecraft.class08800
 */
package minecraft;

import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class06078;
import minecraft.class06851;
import minecraft.class08800;

public class class01767
extends class06078<class08800> {
    private static final int N = 16;
    private final class01686 y;
    private final class01686 L;
    private final class01686 u;

    public class01767(class01686 class016862) {
        super(class016862, class06851::z);
        this.y = class016862.y("bone");
        this.u = this.y.y("wind");
        this.L = this.y.y("wind_charge");
    }

    public void method_2819(class08800 class088002) {
        super.method_2819((Object)class088002);
        this.L.R = -class088002.P * 16.0f * ((float)Math.PI / 180);
        this.u.R = class088002.P * 16.0f * ((float)Math.PI / 180);
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N().N("bone", class04822.L(), class04838.N((float)0.0f, (float)0.0f, (float)0.0f));
        class048392.N("wind", class04822.L().N(15, 20).N(-4.0f, -1.0f, -4.0f, 8.0f, 2.0f, 8.0f, new class04834(0.0f)).N(0, 9).N(-3.0f, -2.0f, -3.0f, 6.0f, 4.0f, 6.0f, new class04834(0.0f)), class04838.N((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)-0.7854f, (float)0.0f));
        class048392.N("wind_charge", class04822.L().N(0, 0).N(-2.0f, -2.0f, -2.0f, 4.0f, 4.0f, 4.0f, new class04834(0.0f)), class04838.N((float)0.0f, (float)0.0f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)64, (int)32);
    }
}

