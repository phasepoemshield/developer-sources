/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02415
 *  minecraft.class02441
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class08442
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
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class08442;

public class class04535
extends class04532<class08442> {
    public static final class02415 N = new class02441(false, 8.0f, 4.0f, 2.0f, 2.0f, 24.0f, Set.of("head"));

    public class04535(class01686 class016862) {
        super(class016862);
    }

    public static class04806 N() {
        class04792 class047922 = class04532.N(12, false, true, class04834.N);
        class04839 class048392 = class047922.N();
        class048392.N("head", class04822.L().N(0, 0).N(-3.0f, -4.0f, -6.0f, 6.0f, 6.0f, 8.0f), class04838.N((float)0.0f, (float)6.0f, (float)-8.0f));
        class048392.N("body", class04822.L().N(28, 8).N(-4.0f, -10.0f, -7.0f, 8.0f, 16.0f, 6.0f), class04838.N((float)0.0f, (float)5.0f, (float)2.0f, (float)1.5707964f, (float)0.0f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)64, (int)32);
    }

    @Override
    public void method_2819(class08442 class084422) {
        super.method_2819(class084422);
        this.y.L += class084422.N * 9.0f * class084422.Nu;
        this.y.i = class084422.y;
    }
}

