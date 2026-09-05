/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class08476
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
import minecraft.class08476;

public class class04814
extends class06078<class08476> {
    private final class01686 N;

    public class04814(class01686 class016862) {
        super(class016862);
        this.N = class016862.y("tail_fin");
    }

    public void method_2819(class08476 class084762) {
        super.method_2819((Object)class084762);
        float f = class084762.NZ ? 1.0f : 1.5f;
        this.N.R = -f * 0.45f * class04995.m((double)(0.6f * class084762.P));
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        int n = 22;
        class048392.N("body", class04822.L().N(0, 0).N(-1.0f, -2.0f, 0.0f, 2.0f, 4.0f, 7.0f), class04838.N((float)0.0f, (float)22.0f, (float)0.0f));
        class048392.N("head", class04822.L().N(11, 0).N(-1.0f, -2.0f, -3.0f, 2.0f, 4.0f, 3.0f), class04838.N((float)0.0f, (float)22.0f, (float)0.0f));
        class048392.N("nose", class04822.L().N(0, 0).N(-1.0f, -2.0f, -1.0f, 2.0f, 3.0f, 1.0f), class04838.N((float)0.0f, (float)22.0f, (float)-3.0f));
        class048392.N("right_fin", class04822.L().N(22, 1).N(-2.0f, 0.0f, -1.0f, 2.0f, 0.0f, 2.0f), class04838.N((float)-1.0f, (float)23.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)-0.7853982f));
        class048392.N("left_fin", class04822.L().N(22, 4).N(0.0f, 0.0f, -1.0f, 2.0f, 0.0f, 2.0f), class04838.N((float)1.0f, (float)23.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.7853982f));
        class048392.N("tail_fin", class04822.L().N(22, 3).N(0.0f, -2.0f, 0.0f, 0.0f, 4.0f, 4.0f), class04838.N((float)0.0f, (float)22.0f, (float)7.0f));
        class048392.N("top_fin", class04822.L().N(20, -6).N(0.0f, -1.0f, -1.0f, 0.0f, 1.0f, 6.0f), class04838.N((float)0.0f, (float)20.0f, (float)0.0f));
        return class04806.N(class047922, 32, 32);
    }
}

