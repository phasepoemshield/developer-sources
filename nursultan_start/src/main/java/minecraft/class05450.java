/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01000
 *  minecraft.class01188
 *  minecraft.class01421
 *  minecraft.class01686
 *  minecraft.class02777
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class07070
 *  minecraft.class08467
 */
package minecraft;

import minecraft.class01000;
import minecraft.class01188;
import minecraft.class01421;
import minecraft.class01686;
import minecraft.class02777;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class07070;
import minecraft.class08467;

public class class05450
extends class01000 {
    private static final String m = "right_body_stick";
    private static final String P = "left_body_stick";
    private static final String s = "shoulder_stick";
    private static final String T = "base_plate";
    private final class01686 b;
    private final class01686 j;
    private final class01686 v;
    private final class01686 n;

    public class05450(class01686 class016862) {
        super(class016862);
        this.b = class016862.y(m);
        this.j = class016862.y(P);
        this.v = class016862.y(s);
        this.n = class016862.y(T);
        this.B.U = false;
    }

    public void N(class02777 class027772, class07070 class070702, class01421 class014212) {
        class01686 class016862 = this.N(class070702);
        boolean bl = class016862.U;
        class016862.U = true;
        super.N((class08467)class027772, class070702, class014212);
        class016862.U = bl;
    }

    public void method_2819(class02777 class027772) {
        super.method_2819(class027772);
        this.n.R = (float)Math.PI / 180 * -class027772.N;
        this.U.U = class027772.F;
        this.z.U = class027772.F;
        this.n.U = class027772.A;
        this.b.i = (float)Math.PI / 180 * class027772.C.N();
        this.b.R = (float)Math.PI / 180 * class027772.C.y();
        this.b.M = (float)Math.PI / 180 * class027772.C.L();
        this.j.i = (float)Math.PI / 180 * class027772.C.N();
        this.j.R = (float)Math.PI / 180 * class027772.C.y();
        this.j.M = (float)Math.PI / 180 * class027772.C.L();
        this.v.i = (float)Math.PI / 180 * class027772.C.N();
        this.v.R = (float)Math.PI / 180 * class027772.C.y();
        this.v.M = (float)Math.PI / 180 * class027772.C.L();
    }

    public static class04806 N() {
        class04792 class047922 = class01188.N((class04834)class04834.N, (float)0.0f);
        class04839 class048392 = class047922.N();
        class048392.N("head", class04822.L().N(0, 0).N(-1.0f, -7.0f, -1.0f, 2.0f, 7.0f, 2.0f), class04838.N((float)0.0f, (float)1.0f, (float)0.0f));
        class048392.N("body", class04822.L().N(0, 26).N(-6.0f, 0.0f, -1.5f, 12.0f, 3.0f, 3.0f), class04838.N);
        class048392.N("right_arm", class04822.L().N(24, 0).N(-2.0f, -2.0f, -1.0f, 2.0f, 12.0f, 2.0f), class04838.N((float)-5.0f, (float)2.0f, (float)0.0f));
        class048392.N("left_arm", class04822.L().N(32, 16).N().N(0.0f, -2.0f, -1.0f, 2.0f, 12.0f, 2.0f), class04838.N((float)5.0f, (float)2.0f, (float)0.0f));
        class048392.N("right_leg", class04822.L().N(8, 0).N(-1.0f, 0.0f, -1.0f, 2.0f, 11.0f, 2.0f), class04838.N((float)-1.9f, (float)12.0f, (float)0.0f));
        class048392.N("left_leg", class04822.L().N(40, 16).N().N(-1.0f, 0.0f, -1.0f, 2.0f, 11.0f, 2.0f), class04838.N((float)1.9f, (float)12.0f, (float)0.0f));
        class048392.N(m, class04822.L().N(16, 0).N(-3.0f, 3.0f, -1.0f, 2.0f, 7.0f, 2.0f), class04838.N);
        class048392.N(P, class04822.L().N(48, 16).N(1.0f, 3.0f, -1.0f, 2.0f, 7.0f, 2.0f), class04838.N);
        class048392.N(s, class04822.L().N(0, 48).N(-4.0f, 10.0f, -1.0f, 8.0f, 2.0f, 2.0f), class04838.N);
        class048392.N(T, class04822.L().N(0, 32).N(-6.0f, 11.0f, -6.0f, 12.0f, 1.0f, 12.0f), class04838.N((float)0.0f, (float)12.0f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }
}

