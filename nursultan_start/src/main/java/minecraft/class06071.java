/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02415
 *  minecraft.class02441
 *  minecraft.class04532
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class08476
 *  minecraft.class08482
 */
package minecraft;

import java.util.Set;
import minecraft.class01686;
import minecraft.class02415;
import minecraft.class02441;
import minecraft.class04532;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class08476;
import minecraft.class08482;

public class class06071
extends class04532<class08482> {
    public static final class02415 N = new class02441(true, 23.0f, 4.8f, 2.7f, 3.0f, 49.0f, Set.of("head"));

    public class06071(class01686 class016862) {
        super(class016862);
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N("head", class04822.L().N(0, 6).N(-6.5f, -5.0f, -4.0f, 13.0f, 10.0f, 9.0f).N(45, 16).N("nose", -3.5f, 0.0f, -6.0f, 7.0f, 5.0f, 2.0f).N(52, 25).N("left_ear", 3.5f, -8.0f, -1.0f, 5.0f, 4.0f, 1.0f).N(52, 25).N("right_ear", -8.5f, -8.0f, -1.0f, 5.0f, 4.0f, 1.0f), class04838.N((float)0.0f, (float)11.5f, (float)-17.0f));
        class048392.N("body", class04822.L().N(0, 25).N(-9.5f, -13.0f, -6.5f, 19.0f, 26.0f, 13.0f), class04838.N((float)0.0f, (float)10.0f, (float)0.0f, (float)1.5707964f, (float)0.0f, (float)0.0f));
        int n = 9;
        int n2 = 6;
        class04822 class048222 = class04822.L().N(40, 0).N(-3.0f, 0.0f, -3.0f, 6.0f, 9.0f, 6.0f);
        class048392.N("right_hind_leg", class048222, class04838.N((float)-5.5f, (float)15.0f, (float)9.0f));
        class048392.N("left_hind_leg", class048222, class04838.N((float)5.5f, (float)15.0f, (float)9.0f));
        class048392.N("right_front_leg", class048222, class04838.N((float)-5.5f, (float)15.0f, (float)-9.0f));
        class048392.N("left_front_leg", class048222, class04838.N((float)5.5f, (float)15.0f, (float)-9.0f));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    public void method_2819(class08482 class084822) {
        super.method_2819((class08476)class084822);
        if (class084822.y) {
            this.y.R = 0.35f * class04995.m((double)(0.6f * class084822.P));
            this.y.M = 0.35f * class04995.m((double)(0.6f * class084822.P));
            this.R.i = -0.75f * class04995.m((double)(0.3f * class084822.P));
            this.M.i = 0.75f * class04995.m((double)(0.3f * class084822.P));
        } else {
            this.y.M = 0.0f;
        }
        if (class084822.L) {
            if (class084822.u < 15) {
                this.y.i = -0.7853982f * (float)class084822.u / 14.0f;
            } else if (class084822.u < 20) {
                float f = (class084822.u - 15) / 5;
                this.y.i = -0.7853982f + 0.7853982f * f;
            }
        }
        if (class084822.B > 0.0f) {
            this.L.i = class04995.z((float)class084822.B, (float)this.L.i, (float)1.7407963f);
            this.y.i = class04995.z((float)class084822.B, (float)this.y.i, (float)1.5707964f);
            this.R.M = -0.27079642f;
            this.M.M = 0.27079642f;
            this.u.M = 0.5707964f;
            this.i.M = -0.5707964f;
            if (class084822.i) {
                this.y.i = 1.5707964f + 0.2f * class04995.m((double)(class084822.P * 0.6f));
                this.R.i = -0.4f - 0.2f * class04995.m((double)(class084822.P * 0.6f));
                this.M.i = -0.4f - 0.2f * class04995.m((double)(class084822.P * 0.6f));
            }
            if (class084822.R) {
                this.y.i = 2.1707964f;
                this.R.i = -0.9f;
                this.M.i = -0.9f;
            }
        } else {
            this.u.M = 0.0f;
            this.i.M = 0.0f;
            this.R.M = 0.0f;
            this.M.M = 0.0f;
        }
        if (class084822.Z > 0.0f) {
            this.u.i = -0.6f * class04995.m((double)(class084822.P * 0.15f));
            this.i.i = 0.6f * class04995.m((double)(class084822.P * 0.15f));
            this.R.i = 0.3f * class04995.m((double)(class084822.P * 0.25f));
            this.M.i = -0.3f * class04995.m((double)(class084822.P * 0.25f));
            this.y.i = class04995.z((float)class084822.Z, (float)this.y.i, (float)1.5707964f);
        }
        if (class084822.g > 0.0f) {
            this.y.i = class04995.z((float)class084822.g, (float)this.y.i, (float)2.0561945f);
            this.u.i = -0.5f * class04995.m((double)(class084822.P * 0.5f));
            this.i.i = 0.5f * class04995.m((double)(class084822.P * 0.5f));
            this.R.i = 0.5f * class04995.m((double)(class084822.P * 0.5f));
            this.M.i = -0.5f * class04995.m((double)(class084822.P * 0.5f));
        }
    }
}

