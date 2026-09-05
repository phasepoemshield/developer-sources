/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01421
 *  minecraft.class01686
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
 *  minecraft.class08261
 */
package minecraft;

import minecraft.class01421;
import minecraft.class01686;
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
import minecraft.class08261;

public class class03856
extends class06078<class08261>
implements class06240<class08261> {
    private final class01686 N;
    private final class01686 y;
    private final class01686 L;
    private final class01686 u;
    private final class01686 i;
    private final class01686 R;

    public class03856(class01686 class016862) {
        super(class016862.y("root"), class06851::z);
        this.N = this.field_54014.y("body");
        this.y = this.N.y("right_arm");
        this.L = this.N.y("left_arm");
        this.u = this.N.y("right_wing");
        this.i = this.N.y("left_wing");
        this.R = this.field_54014.y("head");
    }

    public void N(class08261 class082612, class07070 class070702, class01421 class014212) {
        boolean bl = class070702 == class07070.field_6183;
        class01686 class016862 = bl ? this.y : this.L;
        this.field_54014.N(class014212);
        this.N.N(class014212);
        class016862.N(class014212);
        class014212.y(0.55f, 0.55f, 0.55f);
        this.N(class014212, bl);
    }

    private void N(class01421 class014212, boolean bl) {
        if (bl) {
            class014212.N(0.046875, -0.15625, 0.078125);
        } else {
            class014212.N(-0.046875, -0.15625, 0.078125);
        }
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N().N("root", class04822.L(), class04838.N((float)0.0f, (float)-2.5f, (float)0.0f));
        class048392.N("head", class04822.L().N(0, 0).N(-2.5f, -5.0f, -2.5f, 5.0f, 5.0f, 5.0f, new class04834(0.0f)), class04838.N((float)0.0f, (float)20.0f, (float)0.0f));
        class04839 class048393 = class048392.N("body", class04822.L().N(0, 10).N(-1.5f, 0.0f, -1.0f, 3.0f, 4.0f, 2.0f, new class04834(0.0f)).N(0, 16).N(-1.5f, 1.0f, -1.0f, 3.0f, 5.0f, 2.0f, new class04834(-0.2f)), class04838.N((float)0.0f, (float)20.0f, (float)0.0f));
        class048393.N("right_arm", class04822.L().N(23, 0).N(-1.25f, -0.5f, -1.0f, 2.0f, 4.0f, 2.0f, new class04834(-0.1f)), class04838.N((float)-1.75f, (float)0.25f, (float)0.0f));
        class048393.N("left_arm", class04822.L().N(23, 6).N(-0.75f, -0.5f, -1.0f, 2.0f, 4.0f, 2.0f, new class04834(-0.1f)), class04838.N((float)1.75f, (float)0.25f, (float)0.0f));
        class048393.N("left_wing", class04822.L().N(16, 14).N().N(0.0f, 0.0f, 0.0f, 0.0f, 5.0f, 8.0f, new class04834(0.0f)).N(false), class04838.N((float)0.5f, (float)1.0f, (float)1.0f));
        class048393.N("right_wing", class04822.L().N(16, 14).N(0.0f, 0.0f, 0.0f, 0.0f, 5.0f, 8.0f, new class04834(0.0f)), class04838.N((float)-0.5f, (float)1.0f, (float)1.0f));
        return class04806.N((class04792)class047922, (int)32, (int)32);
    }

    public void method_2819(class08261 class082612) {
        super.method_2819((Object)class082612);
        this.R.R = class082612.D * ((float)Math.PI / 180);
        this.R.i = class082612.h * ((float)Math.PI / 180);
        float f = class04995.P((double)(class082612.P * 5.5f * ((float)Math.PI / 180))) * 0.1f;
        this.y.M = 0.62831855f + f;
        this.L.M = -(0.62831855f + f);
        if (class082612.N) {
            this.N.i = 0.0f;
            this.N(!class082612.Nq.i(), !class082612.Ne.i(), f);
        } else {
            this.N.i = 0.15707964f;
        }
        this.i.R = 1.0995574f + class04995.P((double)(class082612.P * 45.836624f * ((float)Math.PI / 180))) * ((float)Math.PI / 180) * 16.2f;
        this.u.R = -this.i.R;
        this.i.i = 0.47123888f;
        this.i.M = -0.47123888f;
        this.u.i = 0.47123888f;
        this.u.M = 0.47123888f;
    }

    private void N(boolean bl, boolean bl2, float f) {
        if (!bl && !bl2) {
            this.y.i = -1.2217305f;
            this.y.R = 0.2617994f;
            this.y.M = -0.47123888f - f;
            this.L.i = -1.2217305f;
            this.L.R = -0.2617994f;
            this.L.M = 0.47123888f + f;
            return;
        }
        if (bl) {
            this.y.i = 3.6651914f;
            this.y.R = 0.2617994f;
            this.y.M = -0.47123888f - f;
        }
        if (bl2) {
            this.L.i = 3.6651914f;
            this.L.R = -0.2617994f;
            this.L.M = 0.47123888f + f;
        }
    }
}

