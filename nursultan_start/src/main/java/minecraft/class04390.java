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
import minecraft.class06078;
import minecraft.class08800;

public class class04390
extends class06078<class08800> {
    public class04390(class01686 class016862) {
        super(class016862);
    }

    public static class04806 y() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N("cube", class04822.L().N(0, 16).N(-3.0f, 17.0f, -3.0f, 6.0f, 6.0f, 6.0f), class04838.N);
        class048392.N("right_eye", class04822.L().N(32, 0).N(-3.25f, 18.0f, -3.5f, 2.0f, 2.0f, 2.0f), class04838.N);
        class048392.N("left_eye", class04822.L().N(32, 4).N(1.25f, 18.0f, -3.5f, 2.0f, 2.0f, 2.0f), class04838.N);
        class048392.N("mouth", class04822.L().N(32, 8).N(0.0f, 21.0f, -3.5f, 1.0f, 1.0f, 1.0f), class04838.N);
        return class04806.N((class04792)class047922, (int)64, (int)32);
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class047922.N().N("cube", class04822.L().N(0, 0).N(-4.0f, 16.0f, -4.0f, 8.0f, 8.0f, 8.0f), class04838.N);
        return class04806.N((class04792)class047922, (int)64, (int)32);
    }
}

