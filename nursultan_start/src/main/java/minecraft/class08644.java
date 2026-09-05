/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02415
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class06078
 *  minecraft.class08670
 *  minecraft.class08684
 */
package minecraft;

import minecraft.class01686;
import minecraft.class02415;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class06078;
import minecraft.class08670;
import minecraft.class08684;

public class class08644
extends class06078<class08670> {
    private static final float N = 14.0f;
    private final class01686 y;

    public class08644(class01686 class016862) {
        super(class016862);
        this.y = class016862.y("goggles");
    }

    public void method_2819(class08670 class086702) {
        super.method_2819((Object)class086702);
        if (class086702.y) {
            this.y.i = 0.0f;
            this.y.L = 14.0f;
        } else {
            this.y.i = -0.7854f;
            this.y.L = 9.0f;
        }
    }

    public static class04806 N(boolean bl) {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class048392.N("harness", class04822.L().N(0, 0).N(-8.0f, -16.0f, -8.0f, 16.0f, 16.0f, 16.0f), class04838.N((float)0.0f, (float)24.0f, (float)0.0f));
        class048392.N("goggles", class04822.L().N(0, 32).N(-8.0f, -2.5f, -2.5f, 16.0f, 5.0f, 5.0f, new class04834(0.15f)), class04838.N((float)0.0f, (float)14.0f, (float)-5.5f));
        return class04806.N((class04792)class047922, (int)64, (int)64).N(class02415.N((float)4.0f)).N(bl ? class08684.N : class02415.N);
    }
}

