/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class03797
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class08787
 */
package minecraft;

import minecraft.class01686;
import minecraft.class03797;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class08787;

public class class00210
extends class03797 {
    private static final String L = "saddle";
    private static final String u = "bridle";
    private static final String i = "reins";
    private final class01686 R;

    public class00210(class01686 class016862) {
        super(class016862);
        this.R = this.y.y(i);
    }

    public void method_2819(class08787 class087872) {
        super.method_2819(class087872);
        this.R.U = class087872.y;
    }

    public static class04806 N() {
        class04792 class047922 = class00210.L();
        class04839 class048392 = class047922.N().y("body");
        class04839 class048393 = class048392.y("head");
        class04834 class048342 = new class04834(0.05f);
        class048392.N(L, class04822.L().N(74, 64).N(-4.5f, -17.0f, -15.5f, 9.0f, 5.0f, 11.0f, class048342).N(92, 114).N(-3.5f, -20.0f, -15.5f, 7.0f, 3.0f, 11.0f, class048342).N(0, 89).N(-7.5f, -12.0f, -23.5f, 15.0f, 12.0f, 27.0f, class048342), class04838.N((float)0.0f, (float)0.0f, (float)0.0f));
        class048393.N(i, class04822.L().N(98, 42).N(3.51f, -18.0f, -17.0f, 0.0f, 7.0f, 15.0f).N(84, 57).N(-3.5f, -18.0f, -2.0f, 7.0f, 7.0f, 0.0f).N(98, 42).N(-3.51f, -18.0f, -17.0f, 0.0f, 7.0f, 15.0f), class04838.N((float)0.0f, (float)0.0f, (float)0.0f));
        class048393.N(u, class04822.L().N(60, 87).N(-3.5f, -7.0f, -15.0f, 7.0f, 8.0f, 19.0f, class048342).N(21, 64).N(-3.5f, -21.0f, -15.0f, 7.0f, 14.0f, 7.0f, class048342).N(50, 64).N(-2.5f, -21.0f, -21.0f, 5.0f, 5.0f, 6.0f, class048342).N(74, 70).N(2.5f, -19.0f, -18.0f, 1.0f, 2.0f, 2.0f).N(74, 70).N().N(-3.5f, -19.0f, -18.0f, 1.0f, 2.0f, 2.0f), class04838.N((float)0.0f, (float)0.0f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)128, (int)128);
    }
}

