/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01188
 *  minecraft.class01686
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class08785
 */
package minecraft;

import minecraft.class01188;
import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class08785;

public class class06374<T extends class08785>
extends class01188<T> {
    public class06374(class01686 class016862) {
        super(class016862);
    }

    public void method_2819(T t) {
        super.method_2819(t);
        this.M.U = true;
        this.z.i *= 0.5f;
        this.U.i *= 0.5f;
        this.E.i *= 0.5f;
        this.W.i *= 0.5f;
        float f = 0.4f;
        this.z.i = class04995.N((float)this.z.i, (float)-0.4f, (float)0.4f);
        this.U.i = class04995.N((float)this.U.i, (float)-0.4f, (float)0.4f);
        this.E.i = class04995.N((float)this.E.i, (float)-0.4f, (float)0.4f);
        this.W.i = class04995.N((float)this.W.i, (float)-0.4f, (float)0.4f);
        if (((class08785)t).y != null) {
            this.z.i = -0.5f;
            this.U.i = -0.5f;
            this.z.M = 0.05f;
            this.U.M = -0.05f;
        }
        if (((class08785)t).N) {
            float f2 = 5.0f;
            this.M.L -= 5.0f;
            this.B.L += 5.0f;
        }
    }

    public static class04806 N() {
        float f = -14.0f;
        class04792 class047922 = class01188.N((class04834)class04834.N, (float)-14.0f);
        class04839 class048392 = class047922.N();
        class048392.N("head", class04822.L().N(0, 0).N(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f), class04838.N((float)0.0f, (float)-13.0f, (float)0.0f)).N("hat", class04822.L().N(0, 16).N(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new class04834(-0.5f)), class04838.N);
        class048392.N("body", class04822.L().N(32, 16).N(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f), class04838.N((float)0.0f, (float)-14.0f, (float)0.0f));
        class048392.N("right_arm", class04822.L().N(56, 0).N(-1.0f, -2.0f, -1.0f, 2.0f, 30.0f, 2.0f), class04838.N((float)-5.0f, (float)-12.0f, (float)0.0f));
        class048392.N("left_arm", class04822.L().N(56, 0).N().N(-1.0f, -2.0f, -1.0f, 2.0f, 30.0f, 2.0f), class04838.N((float)5.0f, (float)-12.0f, (float)0.0f));
        class048392.N("right_leg", class04822.L().N(56, 0).N(-1.0f, 0.0f, -1.0f, 2.0f, 30.0f, 2.0f), class04838.N((float)-2.0f, (float)-5.0f, (float)0.0f));
        class048392.N("left_leg", class04822.L().N(56, 0).N().N(-1.0f, 0.0f, -1.0f, 2.0f, 30.0f, 2.0f), class04838.N((float)2.0f, (float)-5.0f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)64, (int)32);
    }
}

