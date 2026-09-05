/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09170
 *  Nursultan.class11499
 *  java.lang.Record
 *  minecraft.class00734
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class09170;
import Nursultan.class11055;
import Nursultan.class11057;
import Nursultan.class11062;
import Nursultan.class11064;
import Nursultan.class11065;
import Nursultan.class11076;
import Nursultan.class11078;
import Nursultan.class11081;
import Nursultan.class11083;
import Nursultan.class11086;
import Nursultan.class11087;
import Nursultan.class11097;
import Nursultan.class11104;
import Nursultan.class11499;
import minecraft.class00734;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07438;

public class class11095 {
    public static Object N_0;
    public static Object N_1;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public Object y_6;

    private void M() {
    }

    public class11095() {
        this.M();
        this.y_0 = new class11062();
        this.y_1 = new class11055();
        this.y_2 = new class11081();
        this.y_3 = new class11083();
        this.y_4 = new class11078();
        this.y_5 = new class11057();
        this.y_6 = new class11076();
    }

    static {
        class11095.R();
    }

    private boolean y(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, boolean bl, boolean bl2, boolean bl3) {
        if (!bl) {
            return false;
        }
        float f = Math.abs(class114993.R() - class114992.R());
        if (bl3 && f > 1.2f) {
            return false;
        }
        class11499 class114994 = new class11499(class114993.y(), class114992.R());
        if (class110872.N(class074382, class114994)) {
            return true;
        }
        if (bl2) {
            return false;
        }
        if (f > 1.15f) {
            return false;
        }
        float f2 = class09170.N((float)class114992.y(), (float)class114993.y());
        class11499 class114995 = new class11499(class114992.y() + f2 * 0.62f, class114992.R());
        return class110872.N(class074382, class114995);
    }

    public void N() {
        ((class11076)this.y_6).N();
        ((class11062)this.y_0).N();
        ((class11055)this.y_1).N();
        ((class11081)this.y_2).N();
        ((class11083)this.y_3).N();
        ((class11078)this.y_4).N();
        ((class11057)this.y_5).N();
    }

    private double N(class11499 class114992, class11499 class114993) {
        float f = Math.abs(class09170.N((float)class114992.y(), (float)class114993.y()));
        float f2 = Math.abs(class114993.R() - class114992.R());
        return (double)f * 0.88 + (double)f2 * 1.42;
    }

    private class11499 N(class06889 class068892) {
        class11499 class114992 = class09170.N((class06889)class068892);
        return new class11499(class114992.y(), class04995.N((float)class114992.R(), (float)-90.0f, (float)90.0f));
    }

    private class06889 N(class00734 class007342, float f, float f2, float f3) {
        return new class06889(class04995.u((double)f, (double)class007342.N, (double)class007342.u), class04995.u((double)f2, (double)class007342.y, (double)class007342.i), class04995.u((double)f3, (double)class007342.L, (double)class007342.R));
    }

    public class11097 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, boolean bl, boolean bl2, boolean bl3) {
        boolean bl4;
        Record record;
        boolean bl5 = class110872.N(class074382, class114992);
        boolean bl6 = class110872.N(class074382, class114993);
        class00734 class007342 = class11064.u((class07049)class074382);
        class06889 class068892 = ((class04453)((class06202)class11087.N_0).T_4).method_33571();
        class06889 class068893 = this.N(class007342, class074382, bl5, bl, bl3);
        class11104 class111042 = ((class11057)this.y_5).N(class110872, class074382, class007342, class068893, class114992, bl5, bl, bl2, bl3);
        class06889 class068894 = class111042.u();
        class11499 class114994 = this.N(class068894);
        class11065 class110652 = class111042.N() ? new class11065(class068894, true, class111042.y()) : ((class11062)this.y_0).N(class110872, class074382, class007342, class068894, class114992, class114994, bl5, bl, bl2);
        class11499 class114995 = this.N(class110652.L());
        class11499 class114996 = class110652.y() ? (class111042.N() ? class111042.L() : class114995) : this.N(class110872, class074382, class114992, class114995, class007342, class110652.L(), bl5);
        boolean bl7 = bl5 && !class110652.y() && !class110652.N();
        boolean bl8 = bl7;
        if (bl7) {
            class114996 = ((class11078)this.y_4).N(class110872, class074382, class114992, class114996, bl5, bl2, bl, false);
        }
        float f = Math.abs(class09170.N((float)class114992.y(), (float)class114995.y()));
        float f2 = Math.abs(class114995.R() - class114992.R());
        boolean bl9 = false;
        if (!bl7 && !class110652.y() && bl5 && f <= 2.4f && f2 <= 1.15f && !bl2) {
            record = ((class11081)this.y_2).N(class110872, class074382, class114992, class114996, bl5, bl, bl2, bl3);
            class114996 = record.y();
            bl9 = record.N();
        }
        class11086 class110862 = bl7 ? class11086.u() : ((class11055)this.y_1).N(class110872, class074382, class114992, class114996, bl5, bl, bl2, class110652.y());
        record = class110862;
        if (class110862.N()) {
            class114996 = new class11499(class114996.y() + class110862.y(), class04995.N((float)(class114996.R() + class110862.i()), (float)-90.0f, (float)90.0f));
        }
        boolean bl10 = !(bl4 = class110862.L()) && this.y(class110872, class074382, class114992, class114996, bl5, class110652.y(), class110652.N());
        boolean bl11 = bl10;
        if (bl10) {
            class114996 = new class11499(class114996.y(), class114992.R());
        }
        class114996 = ((class11083)this.y_3).N(class110872, class074382, class114992, class114996, bl2, bl && bl3, class110652.y() || bl4);
        class114996 = ((class11078)this.y_4).N(class110872, class074382, class114992, class114996, bl5, bl2, bl, class110652.y() || bl4);
        float f3 = Math.abs(class09170.N((float)class114992.y(), (float)class114996.y()));
        float f4 = Math.abs(class114996.R() - class114992.R());
        double d = class068892.R(class007342.R());
        boolean bl12 = class110652.y() || class110652.N() || class111042.y() || bl4 || !bl5 || f3 > class04995.N((float)(7.0f + (float)d * 1.6f), (float)8.0f, (float)15.5f) || bl3 && bl && (f3 > 2.8f || f4 > 1.35f);
        return new class11097(class114996, bl5, bl6, bl12, bl10, class110652.y() || bl4 || class111042.N(), bl9, class110652.N() || class111042.y(), f3, f4, d);
    }

    private class06889 N(class00734 class007342, class07438 class074382, boolean bl, boolean bl2, boolean bl3) {
        return ((class11076)this.y_6).N(class007342, class074382, bl, bl2, bl3);
    }

    private class11499 N(class11087 class110872, class07438 class074382, class11499 class114992, class11499 class114993, class00734 class007342, class06889 class068892, boolean bl) {
        if (bl && class110872.N(class074382, class114992)) {
            float f = Math.abs(class09170.N((float)class114992.y(), (float)class114993.y()));
            float f2 = Math.abs(class114993.R() - class114992.R());
            if (f <= 4.5f && f2 <= 2.0f) {
                return class114993;
            }
            class11499 class114994 = new class11499(class114992.y() + class09170.N((float)class114992.y(), (float)class114993.y()) * 0.38f, class04995.N((float)(class114992.R() + (class114993.R() - class114992.R()) * 0.28f), (float)-90.0f, (float)90.0f));
            if (class110872.N(class074382, class114994)) {
                return class114994;
            }
            class11499 class114995 = new class11499(class114993.y(), class114992.R());
            if (class110872.N(class074382, class114995)) {
                return class114995;
            }
            return class110872.N(class074382, class114993) ? class114993 : class114992;
        }
        class11499 class114996 = class110872.N(class074382, class114993) ? class114993 : null;
        double d = class114996 == null ? Double.MAX_VALUE : this.N(class114992, class114996);
        class06889 class068893 = class11064.N((class07049)class074382, ((class04453)((class06202)class11087.N_0).T_4).method_33571());
        class06889[] class06889Array = new class06889[]{class068892, class007342.R(), class068893, this.N(class007342, 0.5f, 0.54f, 0.5f), this.N(class007342, 0.5f, 0.74f, 0.5f), this.N(class007342, 0.32f, 0.67f, 0.5f), this.N(class007342, 0.68f, 0.67f, 0.5f), ((class11076)this.y_6).y(class007342), ((class11076)this.y_6).N(class007342)};
        for (class06889 class068894 : class06889Array) {
            double d2;
            class11499 class114997 = this.N(class068894);
            if (!class110872.N(class074382, class114997) || !((d2 = this.N(class114992, class114997)) < d)) continue;
            class114996 = class114997;
            d = d2;
        }
        return class114996 == null ? class114993 : class114996;
    }

    private static void R() {
        N_0 = Float.valueOf(-90.0f);
        N_1 = Float.valueOf(90.0f);
    }
}

