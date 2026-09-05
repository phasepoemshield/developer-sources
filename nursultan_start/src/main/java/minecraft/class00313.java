/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00094
 *  minecraft.class01686
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class06078
 */
package minecraft;

import java.util.Set;
import minecraft.class00094;
import minecraft.class00292;
import minecraft.class00298;
import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class06078;

public class class00313
extends class06078<class00292> {
    private final class01686 N;
    private final class00094 y;
    private final class00094 L;
    private final class00094 u;
    private final class00094 i;

    private static class04792 L() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N().N("root", class04822.L(), class04838.N((float)0.0f, (float)24.0f, (float)0.0f));
        class04839 class048393 = class048392.N("upper_body", class04822.L(), class04838.N((float)-1.0f, (float)-19.0f, (float)0.0f));
        class048393.N("head", class04822.L().N(0, 0).N(-3.0f, -10.0f, -3.0f, 6.0f, 10.0f, 6.0f).N(28, 31).N(-3.0f, -13.0f, -3.0f, 6.0f, 3.0f, 6.0f).N(12, 40).N(3.0f, -13.0f, 0.0f, 9.0f, 14.0f, 0.0f).N(34, 12).N(-12.0f, -14.0f, 0.0f, 9.0f, 14.0f, 0.0f), class04838.N((float)-3.0f, (float)-11.0f, (float)0.0f));
        class048393.N("body", class04822.L().N(0, 16).N(0.0f, -3.0f, -3.0f, 6.0f, 13.0f, 5.0f).N(24, 0).N(-6.0f, -4.0f, -3.0f, 6.0f, 7.0f, 5.0f), class04838.N((float)0.0f, (float)-7.0f, (float)1.0f));
        class048393.N("right_arm", class04822.L().N(22, 13).N(-2.0f, -1.5f, -1.5f, 3.0f, 21.0f, 3.0f).N(46, 0).N(-2.0f, 19.5f, -1.5f, 3.0f, 4.0f, 3.0f), class04838.N((float)-7.0f, (float)-9.5f, (float)1.5f));
        class048393.N("left_arm", class04822.L().N(30, 40).N(0.0f, -1.0f, -1.5f, 3.0f, 16.0f, 3.0f).N(52, 12).N(0.0f, -5.0f, -1.5f, 3.0f, 4.0f, 3.0f).N(52, 19).N(0.0f, 15.0f, -1.5f, 3.0f, 4.0f, 3.0f), class04838.N((float)6.0f, (float)-9.0f, (float)0.5f));
        class048392.N("left_leg", class04822.L().N(42, 40).N(-1.5f, 0.0f, -1.5f, 3.0f, 16.0f, 3.0f).N(45, 55).N(-1.5f, 15.7f, -4.5f, 5.0f, 0.0f, 9.0f), class04838.N((float)1.5f, (float)-16.0f, (float)0.5f));
        class048392.N("right_leg", class04822.L().N(0, 34).N(-3.0f, -1.5f, -1.5f, 3.0f, 19.0f, 3.0f).N(45, 46).N(-5.0f, 17.2f, -4.5f, 5.0f, 0.0f, 9.0f).N(12, 34).N(-3.0f, -4.5f, -1.5f, 3.0f, 3.0f, 3.0f), class04838.N((float)-1.0f, (float)-17.5f, (float)0.5f));
        return class047922;
    }

    public class00313(class01686 class016862) {
        super(class016862);
        class01686 class016863 = class016862.y("root");
        class01686 class016864 = class016863.y("upper_body");
        this.N = class016864.y("head");
        this.y = class00298.N.N(class016863);
        this.L = class00298.y.N(class016863);
        this.u = class00298.L.N(class016863);
        this.i = class00298.u.N(class016863);
    }

    public static class04806 y() {
        class04792 class047922 = class00313.L();
        class047922.N().y(Set.of("head"));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    public static class04806 N() {
        return class04806.N((class04792)class00313.L(), (int)64, (int)64);
    }

    public void method_2819(class00292 class002922) {
        super.method_2819((Object)class002922);
        this.N.i = class002922.h * ((float)Math.PI / 180);
        this.N.R = class002922.D * ((float)Math.PI / 180);
        if (class002922.i) {
            this.y.N(class002922.NN, class002922.Ny, 1.0f, 1.0f);
        }
        this.L.N(class002922.y, class002922.P);
        this.u.N(class002922.N, class002922.P);
        this.i.N(class002922.L, class002922.P);
    }
}

