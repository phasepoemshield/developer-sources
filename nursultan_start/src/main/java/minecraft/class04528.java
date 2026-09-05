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
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class08481
 */
package minecraft;

import java.util.Set;
import minecraft.class01686;
import minecraft.class02415;
import minecraft.class02441;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class08481;

public class class04528
extends class06078<class08481> {
    private static final float N = 50.0f;
    private static final float y = -40.0f;
    private static final float L = 0.6f;
    private static final class02415 u = class02415.N((float)0.6f);
    private static final class02415 i = new class02441(true, 22.0f, 2.0f, 2.65f, 2.5f, 36.0f, Set.of("head", "left_ear", "right_ear", "nose"));
    private static final String R = "left_haunch";
    private static final String M = "right_haunch";
    private final class01686 B;
    private final class01686 Z;
    private final class01686 z;
    private final class01686 U;
    private final class01686 E;

    public class04528(class01686 class016862) {
        super(class016862);
        this.B = class016862.y(R);
        this.Z = class016862.y(M);
        this.z = class016862.y("left_front_leg");
        this.U = class016862.y("right_front_leg");
        this.E = class016862.y("head");
    }

    public static class04806 N(boolean bl) {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class04839 class048393 = class048392.N(R, class04822.L().N(30, 15).N(-1.0f, 0.0f, 0.0f, 2.0f, 4.0f, 5.0f), class04838.N((float)3.0f, (float)17.5f, (float)3.7f, (float)-0.36651915f, (float)0.0f, (float)0.0f));
        class04839 class048394 = class048392.N(M, class04822.L().N(16, 15).N(-1.0f, 0.0f, 0.0f, 2.0f, 4.0f, 5.0f), class04838.N((float)-3.0f, (float)17.5f, (float)3.7f, (float)-0.36651915f, (float)0.0f, (float)0.0f));
        class048393.N("left_hind_foot", class04822.L().N(26, 24).N(-1.0f, 5.5f, -3.7f, 2.0f, 1.0f, 7.0f), class04838.y((float)0.36651915f, (float)0.0f, (float)0.0f));
        class048394.N("right_hind_foot", class04822.L().N(8, 24).N(-1.0f, 5.5f, -3.7f, 2.0f, 1.0f, 7.0f), class04838.y((float)0.36651915f, (float)0.0f, (float)0.0f));
        class048392.N("body", class04822.L().N(0, 0).N(-3.0f, -2.0f, -10.0f, 6.0f, 5.0f, 10.0f), class04838.N((float)0.0f, (float)19.0f, (float)8.0f, (float)-0.34906584f, (float)0.0f, (float)0.0f));
        class048392.N("left_front_leg", class04822.L().N(8, 15).N(-1.0f, 0.0f, -1.0f, 2.0f, 7.0f, 2.0f), class04838.N((float)3.0f, (float)17.0f, (float)-1.0f, (float)-0.19198622f, (float)0.0f, (float)0.0f));
        class048392.N("right_front_leg", class04822.L().N(0, 15).N(-1.0f, 0.0f, -1.0f, 2.0f, 7.0f, 2.0f), class04838.N((float)-3.0f, (float)17.0f, (float)-1.0f, (float)-0.19198622f, (float)0.0f, (float)0.0f));
        class04839 class048395 = class048392.N("head", class04822.L().N(32, 0).N(-2.5f, -4.0f, -5.0f, 5.0f, 4.0f, 5.0f), class04838.N((float)0.0f, (float)16.0f, (float)-1.0f));
        class048395.N("right_ear", class04822.L().N(52, 0).N(-2.5f, -9.0f, -1.0f, 2.0f, 5.0f, 1.0f), class04838.N((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)-0.2617994f, (float)0.0f));
        class048395.N("left_ear", class04822.L().N(58, 0).N(0.5f, -9.0f, -1.0f, 2.0f, 5.0f, 1.0f), class04838.N((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f, (float)0.2617994f, (float)0.0f));
        class048392.N("tail", class04822.L().N(52, 6).N(-1.5f, -1.5f, 0.0f, 3.0f, 3.0f, 2.0f), class04838.N((float)0.0f, (float)20.0f, (float)7.0f, (float)-0.3490659f, (float)0.0f, (float)0.0f));
        class048395.N("nose", class04822.L().N(32, 9).N(-0.5f, -2.5f, -5.5f, 1.0f, 1.0f, 1.0f), class04838.N);
        return class04806.N((class04792)class047922, (int)64, (int)32).N(bl ? i : u);
    }

    public void method_2819(class08481 class084812) {
        super.method_2819((Object)class084812);
        this.E.i = class084812.h * ((float)Math.PI / 180);
        this.E.R = class084812.D * ((float)Math.PI / 180);
        float f = class04995.m((double)(class084812.N * (float)Math.PI));
        this.B.i += f * 50.0f * ((float)Math.PI / 180);
        this.Z.i += f * 50.0f * ((float)Math.PI / 180);
        this.z.i += f * -40.0f * ((float)Math.PI / 180);
        this.U.i += f * -40.0f * ((float)Math.PI / 180);
    }
}

