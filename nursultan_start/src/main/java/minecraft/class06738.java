/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00094
 *  minecraft.class01686
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class06753
 */
package minecraft;

import minecraft.class00094;
import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class06729;
import minecraft.class06753;

public class class06738
extends class06078<class06729> {
    private static final float L = 2.0f;
    private static final float u = 3.0f;
    private static final float i = 0.2f;
    private static final float R = 5.0f;
    protected final class01686 N;
    protected final class01686 y;
    private final class00094 M;

    public static class04792 L() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N().N("root", class04822.L(), class04838.N((float)0.0f, (float)29.0f, (float)-6.0f));
        class048392.N("shell", class04822.L().N(0, 0).N(-7.0f, -10.0f, -7.0f, 14.0f, 10.0f, 16.0f, new class04834(0.0f)).N(0, 26).N(-7.0f, 0.0f, -7.0f, 14.0f, 8.0f, 20.0f, new class04834(0.0f)).N(48, 26).N(-7.0f, 0.0f, 6.0f, 14.0f, 8.0f, 0.0f, new class04834(0.0f)), class04838.N((float)0.0f, (float)-13.0f, (float)5.0f));
        class04839 class048393 = class048392.N("body", class04822.L().N(0, 54).N(-5.0f, -4.51f, -3.0f, 10.0f, 8.0f, 14.0f, new class04834(0.0f)).N(0, 76).N(-5.0f, -4.51f, 7.0f, 10.0f, 8.0f, 0.0f, new class04834(0.0f)), class04838.N((float)0.0f, (float)-8.5f, (float)12.3f));
        class048393.N("upper_mouth", class04822.L().N(54, 54).N(-5.0f, -2.0f, 0.0f, 10.0f, 4.0f, 4.0f, new class04834(-0.001f)), class04838.N((float)0.0f, (float)-2.51f, (float)7.0f));
        class048393.N("inner_mouth", class04822.L().N(54, 70).N(-3.0f, -2.0f, -0.5f, 6.0f, 4.0f, 4.0f, new class04834(0.0f)), class04838.N((float)0.0f, (float)-0.51f, (float)7.5f));
        class048393.N("lower_mouth", class04822.L().N(54, 62).N(-5.0f, -1.98f, 0.0f, 10.0f, 4.0f, 4.0f, new class04834(-0.001f)), class04838.N((float)0.0f, (float)1.49f, (float)7.0f));
        return class047922;
    }

    public class06738(class01686 class016862) {
        super(class016862);
        this.y = class016862.y("root");
        this.N = this.y.y("body");
        this.M = class06753.N.N(class016862);
    }

    public static class04806 u() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N().N("root", class04822.L(), class04838.N((float)-0.5f, (float)28.0f, (float)-0.5f));
        class048392.N("shell", class04822.L().N(0, 0).N(-6.0f, -4.0f, -1.0f, 7.0f, 4.0f, 7.0f, new class04834(0.0f)).N(0, 11).N(-6.0f, 0.0f, -1.0f, 7.0f, 4.0f, 9.0f, new class04834(0.0f)).N(23, 11).N(-6.0f, 0.0f, 5.0f, 7.0f, 4.0f, 0.0f, new class04834(0.0f)), class04838.N((float)3.0f, (float)-8.0f, (float)-2.0f));
        class04839 class048393 = class048392.N("body", class04822.L().N(0, 24).N(-2.5f, -3.01f, -1.0f, 5.0f, 4.0f, 7.0f, new class04834(0.0f)).N(0, 35).N(-2.5f, -3.01f, 4.1f, 5.0f, 4.0f, 0.0f, new class04834(0.0f)), class04838.N((float)0.5f, (float)-5.0f, (float)3.0f));
        class048393.N("upper_mouth", class04822.L().N(24, 24).N(-2.5f, -1.0f, 0.0f, 5.0f, 2.0f, 2.0f, new class04834(-0.001f)), class04838.N((float)0.0f, (float)-2.01f, (float)3.9f));
        class048393.N("inner_mouth", class04822.L().N(24, 32).N(-1.5f, -1.0f, -1.0f, 3.0f, 2.0f, 2.0f, new class04834(0.0f)), class04838.N((float)0.0f, (float)-1.01f, (float)4.9f));
        class048393.N("lower_mouth", class04822.L().N(24, 28).N(-2.5f, -1.0f, 0.0f, 5.0f, 2.0f, 2.0f, new class04834(-0.001f)), class04838.N((float)0.0f, (float)-0.01f, (float)3.9f));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    public static class04806 y() {
        return class04806.N((class04792)class06738.L(), (int)128, (int)128);
    }

    private void N(float f, float f2) {
        f = class04995.N((float)f, (float)-10.0f, (float)10.0f);
        f2 = class04995.N((float)f2, (float)-10.0f, (float)10.0f);
        this.N.R = f * ((float)Math.PI / 180);
        this.N.i = f2 * ((float)Math.PI / 180);
    }

    public void method_2819(class06729 class067292) {
        super.method_2819((Object)class067292);
        this.N(class067292.D, class067292.h);
        this.M.N(class067292.NN + class067292.P / 5.0f, class067292.Ny + 0.2f, 2.0f, 3.0f);
    }
}

