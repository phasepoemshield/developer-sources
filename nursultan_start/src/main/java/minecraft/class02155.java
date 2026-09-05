/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01686
 *  minecraft.class02753
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class08805
 */
package minecraft;

import minecraft.class01686;
import minecraft.class02753;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class08805;

public class class02155
extends class06078<class08805> {
    private static final int N = 5;
    private static final int y = 12;
    private final class01686 L;
    private final class01686[] u = new class01686[5];
    private final class01686[] i = new class01686[12];
    private final class01686 R;
    private final class01686 M;
    private final class01686 B;
    private final class01686 Z;
    private final class01686 z;
    private final class01686 U;
    private final class01686 E;
    private final class01686 W;
    private final class01686 m;
    private final class01686 P;
    private final class01686 s;
    private final class01686 T;
    private final class01686 b;
    private final class01686 j;
    private final class01686 v;
    private final class01686 n;
    private final class01686 t;
    private final class01686 G;

    public class02155(class01686 class016862) {
        super(class016862);
        int n;
        this.L = class016862.y("head");
        this.R = this.L.y("jaw");
        for (n = 0; n < this.u.length; ++n) {
            this.u[n] = class016862.y(class02155.N(n));
        }
        for (n = 0; n < this.i.length; ++n) {
            this.i[n] = class016862.y(class02155.y(n));
        }
        this.M = class016862.y("body");
        this.B = this.M.y("left_wing");
        this.Z = this.B.y("left_wing_tip");
        this.z = this.M.y("left_front_leg");
        this.U = this.z.y("left_front_leg_tip");
        this.E = this.U.y("left_front_foot");
        this.W = this.M.y("left_hind_leg");
        this.m = this.W.y("left_hind_leg_tip");
        this.P = this.m.y("left_hind_foot");
        this.s = this.M.y("right_wing");
        this.T = this.s.y("right_wing_tip");
        this.b = this.M.y("right_front_leg");
        this.j = this.b.y("right_front_leg_tip");
        this.v = this.j.y("right_front_foot");
        this.n = this.M.y("right_hind_leg");
        this.t = this.n.y("right_hind_leg_tip");
        this.G = this.t.y("right_hind_foot");
    }

    private static String y(int n) {
        return "tail" + n;
    }

    public void method_2819(class08805 class088052) {
        super.method_2819((Object)class088052);
        float f = class088052.N * ((float)Math.PI * 2);
        this.R.i = (class04995.m((double)f) + 1.0f) * 0.2f;
        float f2 = class04995.m((double)(f - 1.0f)) + 1.0f;
        f2 = (f2 * f2 + f2 * 2.0f) * 0.05f;
        this.field_54014.L = (f2 - 2.0f) * 16.0f;
        this.field_54014.u = -48.0f;
        this.field_54014.i = f2 * 2.0f * ((float)Math.PI / 180);
        float f3 = this.u[0].y;
        float f4 = this.u[0].L;
        float f5 = this.u[0].u;
        float f6 = 1.5f;
        class02753 class027532 = class088052.N(6);
        float f7 = class04995.R((float)(class088052.N(5).y() - class088052.N(10).y()));
        float f8 = class04995.R((float)(class088052.N(5).y() + f7 / 2.0f));
        for (int i = 0; i < 5; ++i) {
            class01686 class016862 = this.u[i];
            class02753 class027533 = class088052.N(5 - i);
            float f9 = class04995.P((double)((float)i * 0.45f + f)) * 0.15f;
            class016862.R = class04995.R((float)(class027533.y() - class027532.y())) * ((float)Math.PI / 180) * 1.5f;
            class016862.i = f9 + class088052.N(i, class027532, class027533) * ((float)Math.PI / 180) * 1.5f * 5.0f;
            class016862.M = -class04995.R((float)(class027533.y() - f8)) * ((float)Math.PI / 180) * 1.5f;
            class016862.L = f4;
            class016862.u = f5;
            class016862.y = f3;
            f3 -= class04995.m((double)class016862.R) * class04995.P((double)class016862.i) * 10.0f;
            f4 += class04995.m((double)class016862.i) * 10.0f;
            f5 -= class04995.P((double)class016862.R) * class04995.P((double)class016862.i) * 10.0f;
        }
        this.L.L = f4;
        this.L.u = f5;
        this.L.y = f3;
        class02753 class027534 = class088052.N(0);
        this.L.R = class04995.R((float)(class027534.y() - class027532.y())) * ((float)Math.PI / 180);
        this.L.i = class04995.R((float)class088052.N(6, class027532, class027534)) * ((float)Math.PI / 180) * 1.5f * 5.0f;
        this.L.M = -class04995.R((float)(class027534.y() - f8)) * ((float)Math.PI / 180);
        this.M.M = -f7 * 1.5f * ((float)Math.PI / 180);
        this.B.i = 0.125f - class04995.P((double)f) * 0.2f;
        this.B.R = -0.25f;
        this.B.M = -(class04995.m((double)f) + 0.125f) * 0.8f;
        this.Z.M = (class04995.m((double)(f + 2.0f)) + 0.5f) * 0.75f;
        this.s.i = this.B.i;
        this.s.R = -this.B.R;
        this.s.M = -this.B.M;
        this.T.M = -this.Z.M;
        this.N(f2, this.z, this.U, this.E, this.W, this.m, this.P);
        this.N(f2, this.b, this.j, this.v, this.n, this.t, this.G);
        float f10 = 0.0f;
        f4 = this.i[0].L;
        f5 = this.i[0].u;
        f3 = this.i[0].y;
        class027532 = class088052.N(11);
        for (int i = 0; i < 12; ++i) {
            class02753 class027535 = class088052.N(12 + i);
            class01686 class016863 = this.i[i];
            class016863.R = (class04995.R((float)(class027535.y() - class027532.y())) * 1.5f + 180.0f) * ((float)Math.PI / 180);
            class016863.i = (f10 += class04995.m((double)((float)i * 0.45f + f)) * 0.05f) + (float)(class027535.N() - class027532.N()) * ((float)Math.PI / 180) * 1.5f * 5.0f;
            class016863.M = class04995.R((float)(class027535.y() - f8)) * ((float)Math.PI / 180) * 1.5f;
            class016863.L = f4;
            class016863.u = f5;
            class016863.y = f3;
            f4 += class04995.m((double)class016863.i) * 10.0f;
            f5 -= class04995.P((double)class016863.R) * class04995.P((double)class016863.i) * 10.0f;
            f3 -= class04995.m((double)class016863.R) * class04995.P((double)class016863.i) * 10.0f;
        }
    }

    private void N(float f, class01686 class016862, class01686 class016863, class01686 class016864, class01686 class016865, class01686 class016866, class01686 class016867) {
        class016865.i = 1.0f + f * 0.1f;
        class016866.i = 0.5f + f * 0.1f;
        class016867.i = 0.75f + f * 0.1f;
        class016862.i = 1.3f + f * 0.1f;
        class016863.i = -0.5f - f * 0.1f;
        class016864.i = 0.75f + f * 0.1f;
    }

    public static class04806 N() {
        int n;
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        float f = -16.0f;
        class048392.N("head", class04822.L().N("upperlip", -6.0f, -1.0f, -24.0f, 12, 5, 16, 176, 44).N("upperhead", -8.0f, -8.0f, -10.0f, 16, 16, 16, 112, 30).N().N("scale", -5.0f, -12.0f, -4.0f, 2, 4, 6, 0, 0).N("nostril", -5.0f, -3.0f, -22.0f, 2, 2, 4, 112, 0).N().N("scale", 3.0f, -12.0f, -4.0f, 2, 4, 6, 0, 0).N("nostril", 3.0f, -3.0f, -22.0f, 2, 2, 4, 112, 0), class04838.N((float)0.0f, (float)20.0f, (float)-62.0f)).N("jaw", class04822.L().N("jaw", -6.0f, 0.0f, -16.0f, 12, 4, 16, 176, 65), class04838.N((float)0.0f, (float)4.0f, (float)-8.0f));
        class04822 class048222 = class04822.L().N("box", -5.0f, -5.0f, -5.0f, 10, 10, 10, 192, 104).N("scale", -1.0f, -9.0f, -3.0f, 2, 4, 6, 48, 0);
        for (n = 0; n < 5; ++n) {
            class048392.N(class02155.N(n), class048222, class04838.N((float)0.0f, (float)20.0f, (float)(-12.0f - (float)n * 10.0f)));
        }
        for (n = 0; n < 12; ++n) {
            class048392.N(class02155.y(n), class048222, class04838.N((float)0.0f, (float)10.0f, (float)(60.0f + (float)n * 10.0f)));
        }
        class04839 class048393 = class048392.N("body", class04822.L().N("body", -12.0f, 1.0f, -16.0f, 24, 24, 64, 0, 0).N("scale", -1.0f, -5.0f, -10.0f, 2, 6, 12, 220, 53).N("scale", -1.0f, -5.0f, 10.0f, 2, 6, 12, 220, 53).N("scale", -1.0f, -5.0f, 30.0f, 2, 6, 12, 220, 53), class04838.N((float)0.0f, (float)3.0f, (float)8.0f));
        class048393.N("left_wing", class04822.L().N().N("bone", 0.0f, -4.0f, -4.0f, 56, 8, 8, 112, 88).N("skin", 0.0f, 0.0f, 2.0f, 56, 0, 56, -56, 88), class04838.N((float)12.0f, (float)2.0f, (float)-6.0f)).N("left_wing_tip", class04822.L().N().N("bone", 0.0f, -2.0f, -2.0f, 56, 4, 4, 112, 136).N("skin", 0.0f, 0.0f, 2.0f, 56, 0, 56, -56, 144), class04838.N((float)56.0f, (float)0.0f, (float)0.0f));
        class048393.N("left_front_leg", class04822.L().N("main", -4.0f, -4.0f, -4.0f, 8, 24, 8, 112, 104), class04838.N((float)12.0f, (float)17.0f, (float)-6.0f, (float)1.3f, (float)0.0f, (float)0.0f)).N("left_front_leg_tip", class04822.L().N("main", -3.0f, -1.0f, -3.0f, 6, 24, 6, 226, 138), class04838.N((float)0.0f, (float)20.0f, (float)-1.0f, (float)-0.5f, (float)0.0f, (float)0.0f)).N("left_front_foot", class04822.L().N("main", -4.0f, 0.0f, -12.0f, 8, 4, 16, 144, 104), class04838.N((float)0.0f, (float)23.0f, (float)0.0f, (float)0.75f, (float)0.0f, (float)0.0f));
        class048393.N("left_hind_leg", class04822.L().N("main", -8.0f, -4.0f, -8.0f, 16, 32, 16, 0, 0), class04838.N((float)16.0f, (float)13.0f, (float)34.0f, (float)1.0f, (float)0.0f, (float)0.0f)).N("left_hind_leg_tip", class04822.L().N("main", -6.0f, -2.0f, 0.0f, 12, 32, 12, 196, 0), class04838.N((float)0.0f, (float)32.0f, (float)-4.0f, (float)0.5f, (float)0.0f, (float)0.0f)).N("left_hind_foot", class04822.L().N("main", -9.0f, 0.0f, -20.0f, 18, 6, 24, 112, 0), class04838.N((float)0.0f, (float)31.0f, (float)4.0f, (float)0.75f, (float)0.0f, (float)0.0f));
        class048393.N("right_wing", class04822.L().N("bone", -56.0f, -4.0f, -4.0f, 56, 8, 8, 112, 88).N("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56, -56, 88), class04838.N((float)-12.0f, (float)2.0f, (float)-6.0f)).N("right_wing_tip", class04822.L().N("bone", -56.0f, -2.0f, -2.0f, 56, 4, 4, 112, 136).N("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56, -56, 144), class04838.N((float)-56.0f, (float)0.0f, (float)0.0f));
        class048393.N("right_front_leg", class04822.L().N("main", -4.0f, -4.0f, -4.0f, 8, 24, 8, 112, 104), class04838.N((float)-12.0f, (float)17.0f, (float)-6.0f, (float)1.3f, (float)0.0f, (float)0.0f)).N("right_front_leg_tip", class04822.L().N("main", -3.0f, -1.0f, -3.0f, 6, 24, 6, 226, 138), class04838.N((float)0.0f, (float)20.0f, (float)-1.0f, (float)-0.5f, (float)0.0f, (float)0.0f)).N("right_front_foot", class04822.L().N("main", -4.0f, 0.0f, -12.0f, 8, 4, 16, 144, 104), class04838.N((float)0.0f, (float)23.0f, (float)0.0f, (float)0.75f, (float)0.0f, (float)0.0f));
        class048393.N("right_hind_leg", class04822.L().N("main", -8.0f, -4.0f, -8.0f, 16, 32, 16, 0, 0), class04838.N((float)-16.0f, (float)13.0f, (float)34.0f, (float)1.0f, (float)0.0f, (float)0.0f)).N("right_hind_leg_tip", class04822.L().N("main", -6.0f, -2.0f, 0.0f, 12, 32, 12, 196, 0), class04838.N((float)0.0f, (float)32.0f, (float)-4.0f, (float)0.5f, (float)0.0f, (float)0.0f)).N("right_hind_foot", class04822.L().N("main", -9.0f, 0.0f, -20.0f, 18, 6, 24, 112, 0), class04838.N((float)0.0f, (float)31.0f, (float)4.0f, (float)0.75f, (float)0.0f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)256, (int)256);
    }

    private static String N(int n) {
        return "neck" + n;
    }
}

