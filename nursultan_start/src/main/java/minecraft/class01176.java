/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00703
 *  minecraft.class01421
 *  minecraft.class01686
 *  minecraft.class04792
 *  minecraft.class04806
 *  minecraft.class04822
 *  minecraft.class04834
 *  minecraft.class04838
 *  minecraft.class04839
 *  minecraft.class04995
 *  minecraft.class05402
 *  minecraft.class06078
 *  minecraft.class06230
 *  minecraft.class06240
 *  minecraft.class07070
 *  minecraft.class08475
 */
package minecraft;

import minecraft.class00703;
import minecraft.class01421;
import minecraft.class01686;
import minecraft.class04792;
import minecraft.class04806;
import minecraft.class04822;
import minecraft.class04834;
import minecraft.class04838;
import minecraft.class04839;
import minecraft.class04995;
import minecraft.class05402;
import minecraft.class06078;
import minecraft.class06230;
import minecraft.class06240;
import minecraft.class07070;
import minecraft.class08475;

public class class01176<S extends class08475>
extends class06078<S>
implements class06230,
class06240<S> {
    private final class01686 N;
    private final class01686 y;
    private final class01686 L;
    private final class01686 u;
    private final class01686 i;
    private final class01686 R;
    private final class01686 M;

    public class01176(class01686 class016862) {
        super(class016862);
        this.N = class016862.y("head");
        this.y = this.N.y("hat");
        this.y.U = false;
        this.L = class016862.y("arms");
        this.u = class016862.y("left_leg");
        this.i = class016862.y("right_leg");
        this.M = class016862.y("left_arm");
        this.R = class016862.y("right_arm");
    }

    public class01686 y() {
        return this.y;
    }

    public void N(class08475 class084752, class07070 class070702, class01421 class014212) {
        this.field_54014.N(class014212);
        this.N(class070702).N(class014212);
    }

    public static class04806 N() {
        class04792 class047922 = new class04792();
        class04839 class048392 = class047922.N();
        class04839 class048393 = class048392.N("head", class04822.L().N(0, 0).N(-4.0f, -10.0f, -4.0f, 8.0f, 10.0f, 8.0f), class04838.N((float)0.0f, (float)0.0f, (float)0.0f));
        class048393.N("hat", class04822.L().N(32, 0).N(-4.0f, -10.0f, -4.0f, 8.0f, 12.0f, 8.0f, new class04834(0.45f)), class04838.N);
        class048393.N("nose", class04822.L().N(24, 0).N(-1.0f, -1.0f, -6.0f, 2.0f, 4.0f, 2.0f), class04838.N((float)0.0f, (float)-2.0f, (float)0.0f));
        class048392.N("body", class04822.L().N(16, 20).N(-4.0f, 0.0f, -3.0f, 8.0f, 12.0f, 6.0f).N(0, 38).N(-4.0f, 0.0f, -3.0f, 8.0f, 20.0f, 6.0f, new class04834(0.5f)), class04838.N((float)0.0f, (float)0.0f, (float)0.0f));
        class048392.N("arms", class04822.L().N(44, 22).N(-8.0f, -2.0f, -2.0f, 4.0f, 8.0f, 4.0f).N(40, 38).N(-4.0f, 2.0f, -2.0f, 8.0f, 4.0f, 4.0f), class04838.N((float)0.0f, (float)3.0f, (float)-1.0f, (float)-0.75f, (float)0.0f, (float)0.0f)).N("left_shoulder", class04822.L().N(44, 22).N().N(4.0f, -2.0f, -2.0f, 4.0f, 8.0f, 4.0f), class04838.N);
        class048392.N("right_leg", class04822.L().N(0, 22).N(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f), class04838.N((float)-2.0f, (float)12.0f, (float)0.0f));
        class048392.N("left_leg", class04822.L().N(0, 22).N().N(-2.0f, 0.0f, -2.0f, 4.0f, 12.0f, 4.0f), class04838.N((float)2.0f, (float)12.0f, (float)0.0f));
        class048392.N("right_arm", class04822.L().N(40, 46).N(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f), class04838.N((float)-5.0f, (float)2.0f, (float)0.0f));
        class048392.N("left_arm", class04822.L().N(40, 46).N().N(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f), class04838.N((float)5.0f, (float)2.0f, (float)0.0f));
        return class04806.N((class04792)class047922, (int)64, (int)64);
    }

    private class01686 N(class07070 class070702) {
        if (class070702 == class07070.field_6182) {
            return this.M;
        }
        return this.R;
    }

    public void method_2819(S s) {
        boolean bl;
        super.method_2819(s);
        this.N.R = ((class08475)s).D * ((float)Math.PI / 180);
        this.N.i = ((class08475)s).h * ((float)Math.PI / 180);
        if (((class08475)s).y) {
            this.R.i = -0.62831855f;
            this.R.R = 0.0f;
            this.R.M = 0.0f;
            this.M.i = -0.62831855f;
            this.M.R = 0.0f;
            this.M.M = 0.0f;
            this.i.i = -1.4137167f;
            this.i.R = 0.31415927f;
            this.i.M = 0.07853982f;
            this.u.i = -1.4137167f;
            this.u.R = -0.31415927f;
            this.u.M = -0.07853982f;
        } else {
            float f = ((class08475)s).Ny;
            float f2 = ((class08475)s).NN;
            this.R.i = class04995.P((double)(f2 * 0.6662f + (float)Math.PI)) * 2.0f * f * 0.5f;
            this.R.R = 0.0f;
            this.R.M = 0.0f;
            this.M.i = class04995.P((double)(f2 * 0.6662f)) * 2.0f * f * 0.5f;
            this.M.R = 0.0f;
            this.M.M = 0.0f;
            this.i.i = class04995.P((double)(f2 * 0.6662f)) * 1.4f * f * 0.5f;
            this.i.R = 0.0f;
            this.i.M = 0.0f;
            this.u.i = class04995.P((double)(f2 * 0.6662f + (float)Math.PI)) * 1.4f * f * 0.5f;
            this.u.R = 0.0f;
            this.u.M = 0.0f;
        }
        class00703 class007032 = ((class08475)s).F;
        if (class007032 == class00703.field_7211) {
            if (s.u().i()) {
                class05402.N((class01686)this.M, (class01686)this.R, (boolean)true, s);
            } else {
                class05402.N((class01686)this.R, (class01686)this.M, (class07070)((class08475)s).p, (float)((class08475)s).C, (float)((class08475)s).P);
            }
        } else if (class007032 == class00703.field_7212) {
            this.R.u = 0.0f;
            this.R.y = -5.0f;
            this.M.u = 0.0f;
            this.M.y = 5.0f;
            this.R.i = class04995.P((double)(((class08475)s).P * 0.6662f)) * 0.25f;
            this.M.i = class04995.P((double)(((class08475)s).P * 0.6662f)) * 0.25f;
            this.R.M = 2.3561945f;
            this.M.M = -2.3561945f;
            this.R.R = 0.0f;
            this.M.R = 0.0f;
        } else if (class007032 == class00703.field_7208) {
            this.R.R = -0.1f + this.N.R;
            this.R.i = -1.5707964f + this.N.i;
            this.M.i = -0.9424779f + this.N.i;
            this.M.R = this.N.R - 0.4f;
            this.M.M = 1.5707964f;
        } else if (class007032 == class00703.field_7213) {
            class05402.N((class01686)this.R, (class01686)this.M, (class01686)this.N, (boolean)true);
        } else if (class007032 == class00703.field_7210) {
            class05402.N((class01686)this.R, (class01686)this.M, (float)((class08475)s).A, (float)((class08475)s).f, (boolean)true);
        } else if (class007032 == class00703.field_19012) {
            this.R.u = 0.0f;
            this.R.y = -5.0f;
            this.R.i = class04995.P((double)(((class08475)s).P * 0.6662f)) * 0.05f;
            this.R.M = 2.670354f;
            this.R.R = 0.0f;
            this.M.u = 0.0f;
            this.M.y = 5.0f;
            this.M.i = class04995.P((double)(((class08475)s).P * 0.6662f)) * 0.05f;
            this.M.M = -2.3561945f;
            this.M.R = 0.0f;
        }
        this.L.U = bl = class007032 == class00703.field_7207;
        this.M.U = !bl;
        this.R.U = !bl;
    }

    public class01686 R() {
        return this.N;
    }
}

