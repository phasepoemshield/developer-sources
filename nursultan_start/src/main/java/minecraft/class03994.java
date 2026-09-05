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
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class06851
 *  minecraft.class08282
 */
package minecraft;

import java.util.Set;
import minecraft.class00094;
import minecraft.class01686;
import minecraft.class03991;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class06851;
import minecraft.class08282;

public class class03994
extends class06078<class08282> {
    private static final float E = 13.0f;
    private static final float W = 1.0f;
    protected final class01686 N;
    protected final class01686 y;
    protected final class01686 L;
    protected final class01686 u;
    protected final class01686 i;
    protected final class01686 R;
    protected final class01686 M;
    protected final class01686 B;
    protected final class01686 Z;
    protected final class01686 z;
    protected final class01686 U;
    private final class00094 m;
    private final class00094 P;
    private final class00094 s;
    private final class00094 T;
    private final class00094 b;
    private final class00094 j;

    public static class04806 L() {
        return class03994.N().N(class047922 -> {
            class047922.N().y(Set.of("body"));
            return class047922;
        });
    }

    public class03994(class01686 class016862) {
        super(class016862, class06851::M);
        this.N = class016862.y("bone");
        this.y = this.N.y("body");
        this.L = this.y.y("head");
        this.z = this.N.y("right_leg");
        this.R = this.N.y("left_leg");
        this.Z = this.y.y("right_arm");
        this.M = this.y.y("left_arm");
        this.u = this.L.y("right_tendril");
        this.i = this.L.y("left_tendril");
        this.U = this.y.y("right_ribcage");
        this.B = this.y.y("left_ribcage");
        this.m = class03991.i.N(class016862);
        this.P = class03991.R.N(class016862);
        this.s = class03991.y.N(class016862);
        this.T = class03991.N.N(class016862);
        this.b = class03991.L.N(class016862);
        this.j = class03991.u.N(class016862);
    }

    public static class04806 i() {
        return class03994.N().N(class047922 -> {
            class047922.N().y(Set.of("body", "head", "left_arm", "right_arm", "left_leg", "right_leg"));
            return class047922;
        });
    }

    public static class04806 u() {
        return class03994.N().N(class047922 -> {
            class047922.N().y(Set.of("head", "left_arm", "right_arm", "left_leg", "right_leg"));
            return class047922;
        });
    }

    public static class04806 y() {
        return class03994.N().N(class047922 -> {
            class047922.N().y(Set.of("left_tendril", "right_tendril"));
            return class047922;
        });
    }

    private void y(float f, float f2) {
        float f3 = Math.min(0.5f, 3.0f * f2);
        float f4 = f * 0.8662f;
        float f5 = class04995.P((double)f4);
        float f6 = class04995.m((double)f4);
        float f7 = Math.min(0.35f, f3);
        this.L.M += 0.3f * f6 * f3;
        this.L.i += 1.2f * class04995.P((double)(f4 + 1.5707964f)) * f7;
        this.y.M = 0.1f * f6 * f3;
        this.y.i = 1.0f * f5 * f7;
        this.R.i = 1.0f * f5 * f3;
        this.z.i = 1.0f * class04995.P((double)(f4 + (float)Math.PI)) * f3;
        this.M.i = -(0.8f * f5 * f3);
        this.M.M = 0.0f;
        this.Z.i = -(0.8f * f6 * f3);
        this.Z.M = 0.0f;
        this.R();
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N().N("bone", class04822.L(), class04838.N((float)0.0f, (float)24.0f, (float)0.0f));
        class04839 class048393 = class048392.N("body", class04822.L().N(0, 0).N(-9.0f, -13.0f, -4.0f, 18.0f, 21.0f, 11.0f), class04838.N((float)0.0f, (float)-21.0f, (float)0.0f));
        class048393.N("right_ribcage", class04822.L().N(90, 11).N(-2.0f, -11.0f, -0.1f, 9.0f, 21.0f, 0.0f), class04838.N((float)-7.0f, (float)-2.0f, (float)-4.0f));
        class048393.N("left_ribcage", class04822.L().N(90, 11).N().N(-7.0f, -11.0f, -0.1f, 9.0f, 21.0f, 0.0f).N(false), class04838.N((float)7.0f, (float)-2.0f, (float)-4.0f));
        class04839 class048394 = class048393.N("head", class04822.L().N(0, 32).N(-8.0f, -16.0f, -5.0f, 16.0f, 16.0f, 10.0f), class04838.N((float)0.0f, (float)-13.0f, (float)0.0f));
        class048394.N("right_tendril", class04822.L().N(52, 32).N(-16.0f, -13.0f, 0.0f, 16.0f, 16.0f, 0.0f), class04838.N((float)-8.0f, (float)-12.0f, (float)0.0f));
        class048394.N("left_tendril", class04822.L().N(58, 0).N(0.0f, -13.0f, 0.0f, 16.0f, 16.0f, 0.0f), class04838.N((float)8.0f, (float)-12.0f, (float)0.0f));
        class048393.N("right_arm", class04822.L().N(44, 50).N(-4.0f, 0.0f, -4.0f, 8.0f, 28.0f, 8.0f), class04838.N((float)-13.0f, (float)-13.0f, (float)1.0f));
        class048393.N("left_arm", class04822.L().N(0, 58).N(-4.0f, 0.0f, -4.0f, 8.0f, 28.0f, 8.0f), class04838.N((float)13.0f, (float)-13.0f, (float)1.0f));
        class048392.N("right_leg", class04822.L().N(76, 48).N(-3.1f, 0.0f, -3.0f, 6.0f, 13.0f, 6.0f), class04838.N((float)-5.9f, (float)-13.0f, (float)0.0f));
        class048392.N("left_leg", class04822.L().N(76, 76).N(-2.9f, 0.0f, -3.0f, 6.0f, 13.0f, 6.0f), class04838.N((float)5.9f, (float)-13.0f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)128, (int)128);
    }

    private void N(float f) {
        float f2 = f * 0.1f;
        float f3 = class04995.P((double)f2);
        float f4 = class04995.m((double)f2);
        this.L.M += 0.06f * f3;
        this.L.i += 0.06f * f4;
        this.y.M += 0.025f * f4;
        this.y.i += 0.025f * f3;
    }

    public void method_2819(class08282 class082822) {
        super.method_2819((Object)class082822);
        this.N(class082822.D, class082822.h);
        this.y(class082822.NN, class082822.Ny);
        this.N(class082822.P);
        this.N(class082822, class082822.P);
        this.m.N(class082822.M, class082822.P);
        this.P.N(class082822.B, class082822.P);
        this.s.N(class082822.R, class082822.P);
        this.T.N(class082822.i, class082822.P);
        this.b.N(class082822.L, class082822.P);
        this.j.N(class082822.u, class082822.P);
    }

    private void N(class08282 class082822, float f) {
        float f2;
        this.i.i = f2 = class082822.N * (float)(Math.cos((double)f * 2.25) * Math.PI * (double)0.1f);
        this.u.i = -f2;
    }

    private void N(float f, float f2) {
        this.L.i = f2 * ((float)Math.PI / 180);
        this.L.R = f * ((float)Math.PI / 180);
    }

    private void R() {
        this.M.R = 0.0f;
        this.M.u = 1.0f;
        this.M.y = 13.0f;
        this.M.L = -13.0f;
        this.Z.R = 0.0f;
        this.Z.u = 1.0f;
        this.Z.y = -13.0f;
        this.Z.L = -13.0f;
    }
}

