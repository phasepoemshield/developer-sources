/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00094
 *  minecraft.class01686
 *  minecraft.class03123
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class06078
 *  minecraft.class06851
 *  minecraft.class08789
 */
package minecraft;

import minecraft.class00094;
import minecraft.class01686;
import minecraft.class03123;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class06078;
import minecraft.class06851;
import minecraft.class08789;

public class class05443
extends class06078<class08789> {
    private final class01686 N;
    private final class01686 y;
    private final class01686 L;
    private final class01686 u;
    private final class01686 i;
    private final class01686 R;
    private final class01686 M;
    private final class00094 B;
    private final class00094 Z;

    public class05443(class01686 class016862) {
        super(class016862, class06851::R);
        this.y = class016862.y("body");
        this.N = class016862.y("head");
        this.L = this.y.y("right_wing");
        this.i = this.L.y("right_wing_tip");
        this.u = this.y.y("left_wing");
        this.R = this.u.y("left_wing_tip");
        this.M = this.y.y("feet");
        this.B = class03123.y.N(class016862);
        this.Z = class03123.N.N(class016862);
    }

    private void N(float f) {
        this.N.R = f * ((float)Math.PI / 180);
    }

    public void method_2819(class08789 class087892) {
        super.method_2819((Object)class087892);
        if (class087892.N) {
            this.N(class087892.D);
        }
        this.B.N(class087892.y, class087892.P);
        this.Z.N(class087892.L, class087892.P);
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class04839 class048393 = class048392.N("body", class04822.L().N(0, 0).N(-1.5f, 0.0f, -1.0f, 3.0f, 5.0f, 2.0f), class04838.N((float)0.0f, (float)17.0f, (float)0.0f));
        class04839 class048394 = class048392.N("head", class04822.L().N(0, 7).N(-2.0f, -3.0f, -1.0f, 4.0f, 3.0f, 2.0f), class04838.N((float)0.0f, (float)17.0f, (float)0.0f));
        class048394.N("right_ear", class04822.L().N(1, 15).N(-2.5f, -4.0f, 0.0f, 3.0f, 5.0f, 0.0f), class04838.N((float)-1.5f, (float)-2.0f, (float)0.0f));
        class048394.N("left_ear", class04822.L().N(8, 15).N(-0.1f, -3.0f, 0.0f, 3.0f, 5.0f, 0.0f), class04838.N((float)1.1f, (float)-3.0f, (float)0.0f));
        class048393.N("right_wing", class04822.L().N(12, 0).N(-2.0f, -2.0f, 0.0f, 2.0f, 7.0f, 0.0f), class04838.N((float)-1.5f, (float)0.0f, (float)0.0f)).N("right_wing_tip", class04822.L().N(16, 0).N(-6.0f, -2.0f, 0.0f, 6.0f, 8.0f, 0.0f), class04838.N((float)-2.0f, (float)0.0f, (float)0.0f));
        class048393.N("left_wing", class04822.L().N(12, 7).N(0.0f, -2.0f, 0.0f, 2.0f, 7.0f, 0.0f), class04838.N((float)1.5f, (float)0.0f, (float)0.0f)).N("left_wing_tip", class04822.L().N(16, 8).N(0.0f, -2.0f, 0.0f, 6.0f, 8.0f, 0.0f), class04838.N((float)2.0f, (float)0.0f, (float)0.0f));
        class048393.N("feet", class04822.L().N(16, 16).N(-1.5f, 0.0f, 0.0f, 3.0f, 2.0f, 0.0f), class04838.N((float)0.0f, (float)5.0f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)32, (int)32);
    }
}

