/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01188
 *  minecraft.class01421
 *  minecraft.class01686
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class05402
 *  minecraft.class07070
 *  minecraft.class08443
 */
package minecraft;

import minecraft.class01188;
import minecraft.class01421;
import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class05402;
import minecraft.class07070;
import minecraft.class08443;

public class class02153<S extends class08443>
extends class01188<S> {
    public class02153(class01686 class016862) {
        super(class016862);
    }

    public static class04806 y() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N("body", class04822.L().N(16, 16).N(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f).N(28, 0).N(-4.0f, 10.0f, -2.0f, 8.0f, 1.0f, 4.0f).N(16, 48).N(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, new class04834(0.025f)), class04838.N((float)0.0f, (float)0.0f, (float)0.0f));
        class048392.N("head", class04822.L().N(0, 0).N(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f).N(0, 32).N(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new class04834(0.2f)), class04838.N((float)0.0f, (float)0.0f, (float)0.0f)).N("hat", class04822.L(), class04838.N);
        class048392.N("right_arm", class04822.L().N(40, 16).N(-1.0f, -2.0f, -1.0f, 2.0f, 12.0f, 2.0f).N(42, 33).N(-1.55f, -2.025f, -1.5f, 3.0f, 12.0f, 3.0f), class04838.N((float)-5.5f, (float)2.0f, (float)0.0f));
        class048392.N("left_arm", class04822.L().N(56, 16).N(-1.0f, -2.0f, -1.0f, 2.0f, 12.0f, 2.0f).N(40, 48).N(-1.45f, -2.025f, -1.5f, 3.0f, 12.0f, 3.0f), class04838.N((float)5.5f, (float)2.0f, (float)0.0f));
        class048392.N("right_leg", class04822.L().N(0, 16).N(-1.0f, 0.0f, -1.0f, 2.0f, 12.0f, 2.0f).N(0, 49).N(-1.5f, -0.0f, -1.5f, 3.0f, 12.0f, 3.0f), class04838.N((float)-2.0f, (float)12.0f, (float)0.0f));
        class048392.N("left_leg", class04822.L().N(0, 16).N(-1.0f, 0.0f, -1.0f, 2.0f, 12.0f, 2.0f).N(4, 49).N(-1.5f, 0.0f, -1.5f, 3.0f, 12.0f, 3.0f), class04838.N((float)2.0f, (float)12.0f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    public void N(class08443 class084432, class07070 class070702, class01421 class014212) {
        this.method_63512().N(class014212);
        float f = class070702 == class07070.field_6183 ? 1.0f : -1.0f;
        class01686 class016862 = this.N(class070702);
        class016862.y += f;
        class016862.N(class014212);
        class016862.y -= f;
    }

    public static class04806 N() {
        class04792 class047922 = class01188.N((class04834)class04834.N, (float)0.0f);
        class02153.N(class047922.N());
        return class04806.N((class04792)class047922, (int)64, (int)32);
    }

    protected static void N(class04839 class048392) {
        class048392.N("right_arm", class04822.L().N(40, 16).N(-1.0f, -2.0f, -1.0f, 2.0f, 12.0f, 2.0f), class04838.N((float)-5.0f, (float)2.0f, (float)0.0f));
        class048392.N("left_arm", class04822.L().N(40, 16).N().N(-1.0f, -2.0f, -1.0f, 2.0f, 12.0f, 2.0f), class04838.N((float)5.0f, (float)2.0f, (float)0.0f));
        class048392.N("right_leg", class04822.L().N(0, 16).N(-1.0f, 0.0f, -1.0f, 2.0f, 12.0f, 2.0f), class04838.N((float)-2.0f, (float)12.0f, (float)0.0f));
        class048392.N("left_leg", class04822.L().N(0, 16).N().N(-1.0f, 0.0f, -1.0f, 2.0f, 12.0f, 2.0f), class04838.N((float)2.0f, (float)12.0f, (float)0.0f));
    }

    public void method_2819(S s) {
        super.method_2819(s);
        if (((class08443)s).y && !((class08443)s).p) {
            float f = ((class08443)s).NX;
            float f2 = class04995.m((double)(f * (float)Math.PI));
            float f3 = class04995.m((double)((1.0f - (1.0f - f) * (1.0f - f)) * (float)Math.PI));
            this.z.M = 0.0f;
            this.U.M = 0.0f;
            this.z.R = -(0.1f - f2 * 0.6f);
            this.U.R = 0.1f - f2 * 0.6f;
            this.z.i = -1.5707964f;
            this.U.i = -1.5707964f;
            this.z.i -= f2 * 1.2f - f3 * 0.4f;
            this.U.i -= f2 * 1.2f - f3 * 0.4f;
            class05402.N((class01686)this.z, (class01686)this.U, (float)((class08443)s).P);
        }
    }
}

