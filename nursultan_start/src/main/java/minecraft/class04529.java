/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02415
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class08471
 */
package minecraft;

import minecraft.class01686;
import minecraft.class02415;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class08471;

public class class04529
extends class06078<class08471> {
    public static final class02415 N = class02415.N((float)0.5f);
    public static final class02415 y = class02415.N((float)1.5f);
    private static final String L = "body_front";
    private static final String u = "body_back";
    private static final float i = -7.2f;
    private final class01686 R;

    public class04529(class01686 class016862) {
        super(class016862);
        this.R = class016862.y(u);
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        int n = 20;
        class04839 class048393 = class048392.N(L, class04822.L().N(0, 0).N(-1.5f, -2.5f, 0.0f, 3.0f, 5.0f, 8.0f), class04838.N((float)0.0f, (float)20.0f, (float)-7.2f));
        class04839 class048394 = class048392.N(u, class04822.L().N(0, 13).N(-1.5f, -2.5f, 0.0f, 3.0f, 5.0f, 8.0f), class04838.N((float)0.0f, (float)20.0f, (float)0.8000002f));
        class048392.N("head", class04822.L().N(22, 0).N(-1.0f, -2.0f, -3.0f, 2.0f, 4.0f, 3.0f), class04838.N((float)0.0f, (float)20.0f, (float)-7.2f));
        class048394.N("back_fin", class04822.L().N(20, 10).N(0.0f, -2.5f, 0.0f, 0.0f, 5.0f, 6.0f), class04838.N((float)0.0f, (float)0.0f, (float)8.0f));
        class048393.N("top_front_fin", class04822.L().N(2, 1).N(0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 3.0f), class04838.N((float)0.0f, (float)-4.5f, (float)5.0f));
        class048394.N("top_back_fin", class04822.L().N(0, 2).N(0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 4.0f), class04838.N((float)0.0f, (float)-4.5f, (float)-1.0f));
        class048392.N("right_fin", class04822.L().N(-4, 0).N(-2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f), class04838.N((float)-1.5f, (float)21.5f, (float)-7.2f, (float)0.0f, (float)0.0f, (float)-0.7853982f));
        class048392.N("left_fin", class04822.L().N(0, 0).N(0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f), class04838.N((float)1.5f, (float)21.5f, (float)-7.2f, (float)0.0f, (float)0.0f, (float)0.7853982f));
        return class04806.N((class04792)class047922, (int)32, (int)32);
    }

    public void method_2819(class08471 class084712) {
        super.method_2819((Object)class084712);
        float f = 1.0f;
        float f2 = 1.0f;
        if (!class084712.NZ) {
            f = 1.3f;
            f2 = 1.7f;
        }
        this.R.R = -f * 0.25f * class04995.m((double)(f2 * 0.6f * class084712.P));
    }
}

