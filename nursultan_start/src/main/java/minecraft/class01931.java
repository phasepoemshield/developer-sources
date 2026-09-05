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
 *  minecraft.class06851
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
import minecraft.class06851;
import minecraft.class08476;

public class class01931
extends class06078<class08476> {
    private final class01686 N;

    public class01931(class01686 class016862) {
        super(class016862, class06851::M);
        this.N = class016862.y("tail");
    }

    public void method_2819(class08476 class084762) {
        super.method_2819((Object)class084762);
        float f = class084762.NZ ? 1.0f : 1.5f;
        this.N.R = -f * 0.25f * class04995.m((double)(0.3f * class084762.P));
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        float f = 0.0f;
        float f2 = 22.0f;
        float f3 = -3.0f;
        class048392.N("body", class04822.L().N(0, 0).N(-1.5f, -1.0f, 0.0f, 3.0f, 2.0f, 3.0f), class04838.N((float)0.0f, (float)22.0f, (float)-3.0f));
        class048392.N("tail", class04822.L().N(0, 0).N(0.0f, -1.0f, 0.0f, 0.0f, 2.0f, 7.0f), class04838.N((float)0.0f, (float)22.0f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)16, (int)16);
    }
}

