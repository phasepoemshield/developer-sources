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

public class class02671
extends class06078<class08800> {
    private final class01686 N;
    private final class01686 y;

    public class02671(class01686 class016862) {
        super(class016862);
        this.N = class016862.y("left_fin");
        this.y = class016862.y("right_fin");
    }

    public void method_2819(class08800 class088002) {
        super.method_2819((Object)class088002);
        this.y.M = -0.2f + 0.4f * class04995.m((double)(class088002.P * 0.2f));
        this.N.M = 0.2f - 0.4f * class04995.m((double)(class088002.P * 0.2f));
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        int n = 23;
        class048392.N("body", class04822.L().N(0, 27).N(-1.5f, -2.0f, -1.5f, 3.0f, 2.0f, 3.0f), class04838.N((float)0.0f, (float)23.0f, (float)0.0f));
        class048392.N("right_eye", class04822.L().N(24, 6).N(-1.5f, 0.0f, -1.5f, 1.0f, 1.0f, 1.0f), class04838.N((float)0.0f, (float)20.0f, (float)0.0f));
        class048392.N("left_eye", class04822.L().N(28, 6).N(0.5f, 0.0f, -1.5f, 1.0f, 1.0f, 1.0f), class04838.N((float)0.0f, (float)20.0f, (float)0.0f));
        class048392.N("back_fin", class04822.L().N(-3, 0).N(-1.5f, 0.0f, 0.0f, 3.0f, 0.0f, 3.0f), class04838.N((float)0.0f, (float)22.0f, (float)1.5f));
        class048392.N("right_fin", class04822.L().N(25, 0).N(-1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f), class04838.N((float)-1.5f, (float)22.0f, (float)-1.5f));
        class048392.N("left_fin", class04822.L().N(25, 0).N(0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f), class04838.N((float)1.5f, (float)22.0f, (float)-1.5f));
        return class04806.N((class04792)class047922, (int)32, (int)32);
    }
}

