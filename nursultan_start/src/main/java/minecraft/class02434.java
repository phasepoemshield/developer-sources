/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02789
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class06851
 */
package minecraft;

import minecraft.class01686;
import minecraft.class02789;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class06851;

public class class02434
extends class06078<class02789> {
    public class02434(class01686 class016862) {
        super(class016862, class06851::R);
    }

    public void method_2819(class02789 class027892) {
        super.method_2819((Object)class027892);
        if (class027892.u > 0.0f) {
            float f = -class04995.m((double)(class027892.u * 3.0f)) * class027892.u;
            this.field_54014.M += f * ((float)Math.PI / 180);
        }
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N("back", class04822.L().N(0, 0).N(0.0f, -2.5f, -2.5f, 0.0f, 5.0f, 5.0f), class04838.N((float)-11.0f, (float)0.0f, (float)0.0f, (float)0.7853982f, (float)0.0f, (float)0.0f).N(0.8f));
        class04822 class048222 = class04822.L().N(0, 0).N(-12.0f, -2.0f, 0.0f, 16.0f, 4.0f, 0.0f, class04834.N, 1.0f, 0.8f);
        class048392.N("cross_1", class048222, class04838.y((float)0.7853982f, (float)0.0f, (float)0.0f));
        class048392.N("cross_2", class048222, class04838.y((float)2.3561945f, (float)0.0f, (float)0.0f));
        return class04806.N((class04792)class047922.N_50(class048382 -> class048382.y(0.9f)), (int)32, (int)32);
    }
}

