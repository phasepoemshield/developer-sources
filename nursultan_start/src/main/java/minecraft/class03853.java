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
 *  minecraft.class08266
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
import minecraft.class08266;

public class class03853
extends class06078<class08266> {
    private final class01686 N;

    public class03853(class01686 class016862) {
        super(class016862);
        this.N = class016862.y("tail");
    }

    public void method_2819(class08266 class082662) {
        super.method_2819((Object)class082662);
        float f = class082662.NZ ? 1.0f : 1.5f;
        this.N.R = -f * 0.45f * class04995.m((double)(0.6f * class082662.P));
    }

    public static class04806 N(class04834 class048342) {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        int n = 22;
        class048392.N("body", class04822.L().N(0, 0).N(-1.0f, -1.5f, -3.0f, 2.0f, 3.0f, 6.0f, class048342), class04838.N((float)0.0f, (float)22.0f, (float)0.0f));
        class048392.N("tail", class04822.L().N(22, -6).N(0.0f, -1.5f, 0.0f, 0.0f, 3.0f, 6.0f, class048342), class04838.N((float)0.0f, (float)22.0f, (float)3.0f));
        class048392.N("right_fin", class04822.L().N(2, 16).N(-2.0f, -1.0f, 0.0f, 2.0f, 2.0f, 0.0f, class048342), class04838.N((float)-1.0f, (float)22.5f, (float)0.0f, (float)0.0f, (float)0.7853982f, (float)0.0f));
        class048392.N("left_fin", class04822.L().N(2, 12).N(0.0f, -1.0f, 0.0f, 2.0f, 2.0f, 0.0f, class048342), class04838.N((float)1.0f, (float)22.5f, (float)0.0f, (float)0.0f, (float)-0.7853982f, (float)0.0f));
        class048392.N("top_fin", class04822.L().N(10, -5).N(0.0f, -3.0f, 0.0f, 0.0f, 3.0f, 6.0f, class048342), class04838.N((float)0.0f, (float)20.5f, (float)-3.0f));
        return class04806.N((class04792)class047922, (int)32, (int)32);
    }
}

