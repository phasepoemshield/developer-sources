/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01188
 *  minecraft.class01686
 *  minecraft.class02153
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class08443
 *  minecraft.class08793
 */
package minecraft;

import minecraft.class01188;
import minecraft.class01686;
import minecraft.class02153;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class08443;
import minecraft.class08793;

public class class02681
extends class02153<class08793> {
    private final class01686 m;

    public static class04806 L() {
        class04792 class047922 = class01188.N((class04834)class04834.N, (float)0.0f);
        class04839 class048392 = class047922.N();
        class02153.N((class04839)class048392);
        class04839 class048393 = class048392.y("head").N("mushrooms", class04822.L(), class04838.N);
        class048393.N("red_mushroom_1", class04822.L().N(50, 16).N(-3.0f, -3.0f, 0.0f, 6.0f, 4.0f, 0.0f), class04838.N((float)3.0f, (float)-8.0f, (float)3.0f, (float)0.0f, (float)0.7853982f, (float)0.0f));
        class048393.N("red_mushroom_2", class04822.L().N(50, 16).N(-3.0f, -3.0f, 0.0f, 6.0f, 4.0f, 0.0f), class04838.N((float)3.0f, (float)-8.0f, (float)3.0f, (float)0.0f, (float)2.3561945f, (float)0.0f));
        class048393.N("brown_mushroom_1", class04822.L().N(50, 22).N(-3.0f, -3.0f, 0.0f, 6.0f, 4.0f, 0.0f), class04838.N((float)-3.0f, (float)-8.0f, (float)-3.0f, (float)0.0f, (float)0.7853982f, (float)0.0f));
        class048393.N("brown_mushroom_2", class04822.L().N(50, 22).N(-3.0f, -3.0f, 0.0f, 6.0f, 4.0f, 0.0f), class04838.N((float)-3.0f, (float)-8.0f, (float)-3.0f, (float)0.0f, (float)2.3561945f, (float)0.0f));
        class048393.N("brown_mushroom_3", class04822.L().N(50, 28).N(-3.0f, -4.0f, 0.0f, 6.0f, 4.0f, 0.0f), class04838.N((float)-2.0f, (float)-1.0f, (float)4.0f, (float)-1.5707964f, (float)0.0f, (float)0.7853982f));
        class048393.N("brown_mushroom_4", class04822.L().N(50, 28).N(-3.0f, -4.0f, 0.0f, 6.0f, 4.0f, 0.0f), class04838.N((float)-2.0f, (float)-1.0f, (float)4.0f, (float)-1.5707964f, (float)0.0f, (float)2.3561945f));
        return class04806.N((class04792)class047922, (int)64, (int)32);
    }

    public class02681(class01686 class016862) {
        super(class016862);
        this.m = class016862.y("head").y("mushrooms");
    }

    public void method_2819(class08793 class087932) {
        super.method_2819((class08443)class087932);
        this.m.U = !class087932.N;
    }
}

