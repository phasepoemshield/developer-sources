/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01421
 *  minecraft.class01686
 *  minecraft.class02058
 *  minecraft.class02805
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class06240
 *  minecraft.class06851
 *  minecraft.class07070
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01421;
import minecraft.class01686;
import minecraft.class02058;
import minecraft.class02805;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class06240;
import minecraft.class06851;
import minecraft.class07070;
import org.joml.Quaternionfc;

public class class03629
extends class06078<class02805>
implements class06240<class02805> {
    private final class01686 N;
    private final class01686 y;
    private final class01686 L;
    private final class01686 u;
    private final class01686 i;
    private final class01686 R;
    private static final float M = 0.7853982f;
    private static final float B = -1.134464f;
    private static final float Z = -1.0471976f;

    public class03629(class01686 class016862) {
        super(class016862.y("root"), class06851::z);
        this.N = this.field_54014.y("head");
        this.y = this.field_54014.y("body");
        this.L = this.y.y("right_arm");
        this.u = this.y.y("left_arm");
        this.i = this.y.y("right_wing");
        this.R = this.y.y("left_wing");
    }

    public void N(class02805 class028052, class07070 class070702, class01421 class014212) {
        float f = 1.0f;
        float f2 = 3.0f;
        this.field_54014.N(class014212);
        this.y.N(class014212);
        class014212.N(0.0f, 0.0625f, 0.1875f);
        class014212.N((Quaternionfc)class02058.y.rotation(this.L.i));
        class014212.y(0.7f, 0.7f, 0.7f);
        class014212.N(0.0625f, 0.0f, 0.0f);
    }

    public void method_2819(class02805 class028052) {
        float f;
        float f2;
        float f3;
        super.method_2819((Object)class028052);
        float f4 = class028052.Ny;
        float f5 = class028052.NN;
        float f6 = class04995.P((double)(class028052.P * 20.0f * ((float)Math.PI / 180) + f5)) * (float)Math.PI * 0.15f + f4;
        float f7 = class028052.P * 9.0f * ((float)Math.PI / 180);
        float f8 = Math.min(f4 / 0.3f, 1.0f);
        float f9 = 1.0f - f8;
        float f10 = class028052.u;
        if (class028052.N) {
            f3 = class028052.P * 8.0f * ((float)Math.PI / 180) + f4;
            f2 = class04995.P((double)f3) * 16.0f * ((float)Math.PI / 180);
            f = class028052.L;
            float f11 = class04995.P((double)f3) * 14.0f * ((float)Math.PI / 180);
            float f12 = class04995.P((double)f3) * 30.0f * ((float)Math.PI / 180);
            this.field_54014.R = class028052.y ? (float)Math.PI * 4 * f : this.field_54014.R;
            this.field_54014.M = f2 * (1.0f - f);
            this.N.R = f12 * (1.0f - f);
            this.N.M = f11 * (1.0f - f);
        } else {
            this.N.i = class028052.h * ((float)Math.PI / 180);
            this.N.R = class028052.D * ((float)Math.PI / 180);
        }
        this.i.i = 0.43633232f * (1.0f - f8);
        this.i.R = -0.7853982f + f6;
        this.R.i = 0.43633232f * (1.0f - f8);
        this.R.R = 0.7853982f - f6;
        this.y.i = f8 * 0.7853982f;
        f3 = f10 * class04995.B((float)f8, (float)-1.0471976f, (float)-1.134464f);
        this.field_54014.L += (float)Math.cos(f7) * 0.25f * f9;
        this.L.i = f3;
        this.u.i = f3;
        f2 = f9 * (1.0f - f10);
        f = 0.43633232f - class04995.P((double)(f7 + 4.712389f)) * (float)Math.PI * 0.075f * f2;
        this.u.M = -f;
        this.L.M = f;
        this.L.R = 0.27925268f * f10;
        this.u.R = -0.27925268f * f10;
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N().N("root", class04822.L(), class04838.N((float)0.0f, (float)23.5f, (float)0.0f));
        class048392.N("head", class04822.L().N(0, 0).N(-2.5f, -5.0f, -2.5f, 5.0f, 5.0f, 5.0f, new class04834(0.0f)), class04838.N((float)0.0f, (float)-3.99f, (float)0.0f));
        class04839 class048393 = class048392.N("body", class04822.L().N(0, 10).N(-1.5f, 0.0f, -1.0f, 3.0f, 4.0f, 2.0f, new class04834(0.0f)).N(0, 16).N(-1.5f, 0.0f, -1.0f, 3.0f, 5.0f, 2.0f, new class04834(-0.2f)), class04838.N((float)0.0f, (float)-4.0f, (float)0.0f));
        class048393.N("right_arm", class04822.L().N(23, 0).N(-0.75f, -0.5f, -1.0f, 1.0f, 4.0f, 2.0f, new class04834(-0.01f)), class04838.N((float)-1.75f, (float)0.5f, (float)0.0f));
        class048393.N("left_arm", class04822.L().N(23, 6).N(-0.25f, -0.5f, -1.0f, 1.0f, 4.0f, 2.0f, new class04834(-0.01f)), class04838.N((float)1.75f, (float)0.5f, (float)0.0f));
        class048393.N("right_wing", class04822.L().N(16, 14).N(0.0f, 1.0f, 0.0f, 0.0f, 5.0f, 8.0f, new class04834(0.0f)), class04838.N((float)-0.5f, (float)0.0f, (float)0.6f));
        class048393.N("left_wing", class04822.L().N(16, 14).N(0.0f, 1.0f, 0.0f, 0.0f, 5.0f, 8.0f, new class04834(0.0f)), class04838.N((float)0.5f, (float)0.0f, (float)0.6f));
        return class04806.N((class04792)class047922, (int)32, (int)32);
    }
}

