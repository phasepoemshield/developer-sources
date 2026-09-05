/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00271
 *  minecraft.class01686
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class04839
 */
package minecraft;

import minecraft.class00271;
import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;

public class class03761
extends class00271 {
    public class03761(class01686 class016862) {
        super(class016862);
    }

    public static class04806 y() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class03761.N(class048392);
        class048392.N("chest_bottom", class04822.L().N(0, 76).N(0.0f, 0.0f, 0.0f, 12.0f, 8.0f, 12.0f), class04838.N((float)-2.0f, (float)-10.1f, (float)-6.0f, (float)0.0f, (float)-1.5707964f, (float)0.0f));
        class048392.N("chest_lid", class04822.L().N(0, 59).N(0.0f, 0.0f, 0.0f, 12.0f, 4.0f, 12.0f), class04838.N((float)-2.0f, (float)-14.1f, (float)-6.0f, (float)0.0f, (float)-1.5707964f, (float)0.0f));
        class048392.N("chest_lock", class04822.L().N(0, 59).N(0.0f, 0.0f, 0.0f, 2.0f, 4.0f, 1.0f), class04838.N((float)-1.0f, (float)-11.1f, (float)-1.0f, (float)0.0f, (float)-1.5707964f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)128, (int)128);
    }

    private static void N(class04839 class048392) {
        class048392.N("bottom", class04822.L().N(0, 0).N(-14.0f, -11.0f, -4.0f, 28.0f, 20.0f, 4.0f).N(0, 0).N(-14.0f, -9.0f, -8.0f, 28.0f, 16.0f, 4.0f), class04838.N((float)0.0f, (float)-2.1f, (float)1.0f, (float)1.5708f, (float)0.0f, (float)0.0f));
        int n = 20;
        int n2 = 7;
        int n3 = 6;
        float f = -5.0f;
        class048392.N("left_paddle", class04822.L().N(0, 24).N(-1.0f, 0.0f, -5.0f, 2.0f, 2.0f, 18.0f).N(-1.001f, -3.0f, 8.0f, 1.0f, 6.0f, 7.0f), class04838.N((float)3.0f, (float)-4.0f, (float)9.0f, (float)0.0f, (float)0.0f, (float)0.19634955f));
        class048392.N("right_paddle", class04822.L().N(40, 24).N(-1.0f, 0.0f, -5.0f, 2.0f, 2.0f, 18.0f).N(0.001f, -3.0f, 8.0f, 1.0f, 6.0f, 7.0f), class04838.N((float)3.0f, (float)-4.0f, (float)-9.0f, (float)0.0f, (float)((float)Math.PI), (float)0.19634955f));
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class03761.N(class047922.N());
        return class04806.N((class04792)class047922, (int)128, (int)64);
    }
}

