/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01180
 *  minecraft.class01188
 *  minecraft.class01686
 *  minecraft.class03089
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class08278
 */
package minecraft;

import minecraft.class01180;
import minecraft.class01188;
import minecraft.class01686;
import minecraft.class03089;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class08278;

public class class04817
extends class03089<class08278> {
    public class04817(class01686 class016862) {
        super(class016862);
    }

    public void method_2819(class08278 class082782) {
        float f;
        super.method_2819(class082782);
        if (class082782.NV == class01180.field_63542) {
            this.U.i = this.U.i * 0.5f - (float)Math.PI;
            this.U.R = 0.0f;
        }
        if (class082782.No == class01180.field_63542) {
            this.z.i = this.z.i * 0.5f - (float)Math.PI;
            this.z.R = 0.0f;
        }
        if ((f = class082782.L) > 0.0f) {
            this.z.i = class04995.z((float)f, (float)this.z.i, (float)-2.5132742f) + f * 0.35f * class04995.m((double)(0.1f * class082782.P));
            this.U.i = class04995.z((float)f, (float)this.U.i, (float)-2.5132742f) - f * 0.35f * class04995.m((double)(0.1f * class082782.P));
            this.z.M = class04995.z((float)f, (float)this.z.M, (float)-0.15f);
            this.U.M = class04995.z((float)f, (float)this.U.M, (float)0.15f);
            this.W.i -= f * 0.55f * class04995.m((double)(0.1f * class082782.P));
            this.E.i += f * 0.55f * class04995.m((double)(0.1f * class082782.P));
            this.M.i = 0.0f;
        }
    }

    public static class04806 N(class04834 class048342) {
        class04792 class047922 = class01188.N((class04834)class048342, (float)0.0f);
        class04839 class048392 = class047922.N();
        class048392.N("left_arm", class04822.L().N(32, 48).N(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, class048342), class04838.N((float)5.0f, (float)2.0f, (float)0.0f));
        class048392.N("left_leg", class04822.L().N(16, 48).N(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f, class048342), class04838.N((float)1.9f, (float)12.0f, (float)0.0f));
        return class04806.N(class047922, 64, 64);
    }
}

