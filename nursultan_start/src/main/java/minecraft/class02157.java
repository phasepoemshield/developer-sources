/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01097
 *  minecraft.class01112
 *  minecraft.class01686
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class04839
 */
package minecraft;

import minecraft.class01097;
import minecraft.class01112;
import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;

public class class02157
extends class01097 {
    private final class01686 N;
    private final class01686 y;

    public class02157(class01686 class016862) {
        super(class016862);
        this.N = class016862.y("head");
        this.y = this.N.y("jaw");
    }

    public void method_2819(class01112 class011122) {
        super.method_2819((Object)class011122);
        this.y.i = (float)(Math.sin(class011122.N * (float)Math.PI * 0.2f) + 1.0) * 0.2f;
        this.N.R = class011122.y * ((float)Math.PI / 180);
        this.N.i = class011122.L * ((float)Math.PI / 180);
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        float f = -16.0f;
        class048392.N("head", class04822.L().N("upper_lip", -6.0f, -1.0f, -24.0f, 12, 5, 16, 176, 44).N("upper_head", -8.0f, -8.0f, -10.0f, 16, 16, 16, 112, 30).N(true).N("scale", -5.0f, -12.0f, -4.0f, 2, 4, 6, 0, 0).N("nostril", -5.0f, -3.0f, -22.0f, 2, 2, 4, 112, 0).N(false).N("scale", 3.0f, -12.0f, -4.0f, 2, 4, 6, 0, 0).N("nostril", 3.0f, -3.0f, -22.0f, 2, 2, 4, 112, 0), class04838.N((float)0.0f, (float)-7.986666f, (float)0.0f).y(0.75f)).N("jaw", class04822.L().N(176, 65).N("jaw", -6.0f, 0.0f, -16.0f, 12.0f, 4.0f, 16.0f), class04838.N((float)0.0f, (float)4.0f, (float)-8.0f));
        return class04806.N((class04792)class047922, (int)256, (int)256);
    }
}

