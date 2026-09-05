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
 *  minecraft.class08800
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
import minecraft.class08800;

public class class02858
extends class06078<class08800> {
    private final class01686 N;
    private final class01686 y;

    public class02858(class01686 class016862) {
        super(class016862);
        this.N = class016862.y("left_blue_fin");
        this.y = class016862.y("right_blue_fin");
    }

    public void method_2819(class08800 class088002) {
        super.method_2819((Object)class088002);
        this.y.M = -0.2f + 0.4f * class04995.m((double)(class088002.P * 0.2f));
        this.N.M = 0.2f - 0.4f * class04995.m((double)(class088002.P * 0.2f));
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        int n = 22;
        class048392.N("body", class04822.L().N(0, 0).N(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f), class04838.N((float)0.0f, (float)22.0f, (float)0.0f));
        class048392.N("right_blue_fin", class04822.L().N(24, 0).N(-2.0f, 0.0f, -1.0f, 2.0f, 1.0f, 2.0f), class04838.N((float)-4.0f, (float)15.0f, (float)-2.0f));
        class048392.N("left_blue_fin", class04822.L().N(24, 3).N(0.0f, 0.0f, -1.0f, 2.0f, 1.0f, 2.0f), class04838.N((float)4.0f, (float)15.0f, (float)-2.0f));
        class048392.N("top_front_fin", class04822.L().N(15, 17).N(-4.0f, -1.0f, 0.0f, 8.0f, 1.0f, 0.0f), class04838.N((float)0.0f, (float)14.0f, (float)-4.0f, (float)0.7853982f, (float)0.0f, (float)0.0f));
        class048392.N("top_middle_fin", class04822.L().N(14, 16).N(-4.0f, -1.0f, 0.0f, 8.0f, 1.0f, 1.0f), class04838.N((float)0.0f, (float)14.0f, (float)0.0f));
        class048392.N("top_back_fin", class04822.L().N(23, 18).N(-4.0f, -1.0f, 0.0f, 8.0f, 1.0f, 0.0f), class04838.N((float)0.0f, (float)14.0f, (float)4.0f, (float)-0.7853982f, (float)0.0f, (float)0.0f));
        class048392.N("right_front_fin", class04822.L().N(5, 17).N(-1.0f, -8.0f, 0.0f, 1.0f, 8.0f, 0.0f), class04838.N((float)-4.0f, (float)22.0f, (float)-4.0f, (float)0.0f, (float)-0.7853982f, (float)0.0f));
        class048392.N("left_front_fin", class04822.L().N(1, 17).N(0.0f, -8.0f, 0.0f, 1.0f, 8.0f, 0.0f), class04838.N((float)4.0f, (float)22.0f, (float)-4.0f, (float)0.0f, (float)0.7853982f, (float)0.0f));
        class048392.N("bottom_front_fin", class04822.L().N(15, 20).N(-4.0f, 0.0f, 0.0f, 8.0f, 1.0f, 0.0f), class04838.N((float)0.0f, (float)22.0f, (float)-4.0f, (float)-0.7853982f, (float)0.0f, (float)0.0f));
        class048392.N("bottom_middle_fin", class04822.L().N(15, 20).N(-4.0f, 0.0f, 0.0f, 8.0f, 1.0f, 0.0f), class04838.N((float)0.0f, (float)22.0f, (float)0.0f));
        class048392.N("bottom_back_fin", class04822.L().N(15, 20).N(-4.0f, 0.0f, 0.0f, 8.0f, 1.0f, 0.0f), class04838.N((float)0.0f, (float)22.0f, (float)4.0f, (float)0.7853982f, (float)0.0f, (float)0.0f));
        class048392.N("right_back_fin", class04822.L().N(9, 17).N(-1.0f, -8.0f, 0.0f, 1.0f, 8.0f, 0.0f), class04838.N((float)-4.0f, (float)22.0f, (float)4.0f, (float)0.0f, (float)0.7853982f, (float)0.0f));
        class048392.N("left_back_fin", class04822.L().N(9, 17).N(0.0f, -8.0f, 0.0f, 1.0f, 8.0f, 0.0f), class04838.N((float)4.0f, (float)22.0f, (float)4.0f, (float)0.0f, (float)-0.7853982f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)32, (int)32);
    }
}

