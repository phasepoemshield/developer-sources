/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class08442
 */
package minecraft;

import minecraft.class01686;
import minecraft.class04532;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class08442;

public class class04539
extends class04532<class08442> {
    public class04539(class01686 class016862) {
        super(class016862);
    }

    @Override
    public void method_2819(class08442 class084422) {
        super.method_2819(class084422);
        this.y.L += class084422.N * 9.0f * class084422.Nu;
        this.y.i = class084422.y;
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N("head", class04822.L().N(0, 0).N(-3.0f, -4.0f, -4.0f, 6.0f, 6.0f, 6.0f, new class04834(0.6f)), class04838.N((float)0.0f, (float)6.0f, (float)-8.0f));
        class048392.N("body", class04822.L().N(28, 8).N(-4.0f, -10.0f, -7.0f, 8.0f, 16.0f, 6.0f, new class04834(1.75f)), class04838.N((float)0.0f, (float)5.0f, (float)2.0f, (float)1.5707964f, (float)0.0f, (float)0.0f));
        class04822 class048222 = class04822.L().N(0, 16).N(-2.0f, 0.0f, -2.0f, 4.0f, 6.0f, 4.0f, new class04834(0.5f));
        class048392.N("right_hind_leg", class048222, class04838.N((float)-3.0f, (float)12.0f, (float)7.0f));
        class048392.N("left_hind_leg", class048222, class04838.N((float)3.0f, (float)12.0f, (float)7.0f));
        class048392.N("right_front_leg", class048222, class04838.N((float)-3.0f, (float)12.0f, (float)-5.0f));
        class048392.N("left_front_leg", class048222, class04838.N((float)3.0f, (float)12.0f, (float)-5.0f));
        return class04806.N((class04792)class047922, (int)64, (int)32);
    }
}

