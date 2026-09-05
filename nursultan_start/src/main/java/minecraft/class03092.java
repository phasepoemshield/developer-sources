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
 *  minecraft.class08476
 *  minecraft.class08478
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
import minecraft.class08476;
import minecraft.class08478;

public class class03092
extends class04532<class08478> {
    public static final class02415 N = new class02441(true, 19.0f, 1.0f, 2.5f, 2.0f, 24.0f, Set.of("head"));

    public class03092(class01686 class016862) {
        super(class016862);
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class04839 class048393 = class048392.N("head", class04822.L().N(2, 61).N("right ear", -6.0f, -11.0f, -10.0f, 3.0f, 2.0f, 1.0f).N(2, 61).N().N("left ear", 2.0f, -11.0f, -10.0f, 3.0f, 2.0f, 1.0f).N(23, 52).N("goatee", -0.5f, -3.0f, -14.0f, 0.0f, 7.0f, 5.0f), class04838.N((float)1.0f, (float)14.0f, (float)0.0f));
        class048393.N("left_horn", class04822.L().N(12, 55).N(-0.01f, -16.0f, -10.0f, 2.0f, 7.0f, 2.0f), class04838.N((float)0.0f, (float)0.0f, (float)0.0f));
        class048393.N("right_horn", class04822.L().N(12, 55).N(-2.99f, -16.0f, -10.0f, 2.0f, 7.0f, 2.0f), class04838.N((float)0.0f, (float)0.0f, (float)0.0f));
        class048393.N("nose", class04822.L().N(34, 46).N(-3.0f, -4.0f, -8.0f, 5.0f, 7.0f, 10.0f), class04838.N((float)0.0f, (float)-8.0f, (float)-8.0f, (float)0.9599f, (float)0.0f, (float)0.0f));
        class048392.N("body", class04822.L().N(1, 1).N(-4.0f, -17.0f, -7.0f, 9.0f, 11.0f, 16.0f).N(0, 28).N(-5.0f, -18.0f, -8.0f, 11.0f, 14.0f, 11.0f), class04838.N((float)0.0f, (float)24.0f, (float)0.0f));
        class048392.N("left_hind_leg", class04822.L().N(36, 29).N(0.0f, 4.0f, 0.0f, 3.0f, 6.0f, 3.0f), class04838.N((float)1.0f, (float)14.0f, (float)4.0f));
        class048392.N("right_hind_leg", class04822.L().N(49, 29).N(0.0f, 4.0f, 0.0f, 3.0f, 6.0f, 3.0f), class04838.N((float)-3.0f, (float)14.0f, (float)4.0f));
        class048392.N("left_front_leg", class04822.L().N(49, 2).N(0.0f, 0.0f, 0.0f, 3.0f, 10.0f, 3.0f), class04838.N((float)1.0f, (float)14.0f, (float)-6.0f));
        class048392.N("right_front_leg", class04822.L().N(35, 2).N(0.0f, 0.0f, 0.0f, 3.0f, 10.0f, 3.0f), class04838.N((float)-3.0f, (float)14.0f, (float)-6.0f));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    public void method_2819(class08478 class084782) {
        super.method_2819((class08476)class084782);
        this.y.y((String)"left_horn").U = class084782.N;
        this.y.y((String)"right_horn").U = class084782.y;
        if (class084782.L != 0.0f) {
            this.y.i = class084782.L;
        }
    }
}

