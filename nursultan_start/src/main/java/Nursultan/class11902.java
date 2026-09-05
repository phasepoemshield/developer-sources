/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09222
 *  Nursultan.class11385
 *  minecraft.class01311
 *  minecraft.class01337
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04462
 *  minecraft.class04655
 *  minecraft.class04927
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class06202
 *  minecraft.class06478
 *  minecraft.class08687
 *  minecraft.class08844
 */
package Nursultan;

import Nursultan.class09222;
import Nursultan.class11385;
import Nursultan.class11908;
import Nursultan.class11919;
import minecraft.class01311;
import minecraft.class01337;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04462;
import minecraft.class04655;
import minecraft.class04927;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06478;
import minecraft.class08687;
import minecraft.class08844;

public class class11902 {
    private static String[] u;
    private static double[] E;
    public static Object N_0;

    private static void M() {
    }

    private class11902() {
        throw new UnsupportedOperationException(u[0]);
    }

    static {
        class11902.i();
        class11902.R();
        class11902.M();
        N_0 = class06202.Nq();
    }

    private static void i() {
        E = new double[1];
        class11902.E[0] = Double.longBitsToDouble(0x7FEFFFFFFFFFFFFFL);
    }

    public static void y(class11385 class113852) {
        class113852.B(false);
        class113852.u(false);
        class113852.L(false);
        class113852.R(false);
    }

    public static boolean y() {
        class05096 class050962 = (class05096)((class06202)class11902.N_0).v_3;
        if (class050962 instanceof class01311 || class050962 instanceof class01337 || class09222.y()) {
            return true;
        }
        return class050962 != null && class050962.method_25396().stream().filter(class046542 -> class046542 instanceof class04927).map(class046542 -> (class04927)class046542).anyMatch(class06478::method_25370);
    }

    private static boolean N(float f, float f2) {
        return f != 0.0f || f2 != 0.0f;
    }

    public static float[] N(float f) {
        class04453 class044532 = (class04453)((class06202)class11902.N_0).T_4;
        float f2 = class044532.fields_7212a028292fd3c078969e3ee4c71d9e8_2.floatValue();
        float f3 = class044532.fields_7212a028292fd3c078969e3ee4c71d9e8_0.floatValue();
        float f4 = class044532.method_36454();
        if (f2 == 0.0f && f3 == 0.0f) {
            return new float[]{0.0f, 0.0f};
        }
        if (f2 != 0.0f) {
            if (f3 > 0.0f) {
                f4 += f2 > 0.0f ? -45.0f : 45.0f;
            } else if (f3 < 0.0f) {
                f4 += f2 > 0.0f ? 45.0f : -45.0f;
            }
            f3 = 0.0f;
            f2 = f2 > 0.0f ? 1.0f : -1.0f;
        }
        double d = Math.toRadians(f4 + 90.0f);
        double d2 = Math.sin(d);
        double d3 = Math.cos(d);
        float f5 = (float)((double)(f2 * f) * d3 + (double)(f3 * f) * d2);
        float f6 = (float)((double)(f2 * f) * d2 - (double)(f3 * f) * d3);
        return new float[]{f5, f6};
    }

    public static boolean N(int n) {
        if (n == -1) {
            return false;
        }
        return class04655.N((class08844)((class06202)N_0).Nt(), (int)n);
    }

    public static float N(float f, float f2, float f3) {
        if (class11902.N(f2, f3)) {
            return f + class04995.R((float)class11908.y(class04995.u((double)(-f3), (double)f2)));
        }
        return f;
    }

    public static boolean N(class08687 class086872, boolean bl) {
        return class086872.N() || class086872.y() || class086872.L() || class086872.u() || class086872.i() || bl && class086872.M() || class086872.R();
    }

    public static float N() {
        return (float)class04995.R((double)(((class04453)((class06202)class11902.N_0).T_4).method_23317() - ((class04453)((class06202)class11902.N_0).T_4).field_6014), (double)(((class04453)((class06202)class11902.N_0).T_4).method_23321() - ((class04453)((class06202)class11902.N_0).T_4).field_5969)) * 20.0f * (Math.min(((class03448)((class06202)class11902.N_0).T_3).method_54719().R(), 20.0f) / 20.0f);
    }

    public static boolean N(class08687 class086872) {
        return class11902.N(class086872, true);
    }

    public static void N(class11385 class113852) {
        class11902.y(class113852);
        class113852.M(false);
        class113852.i(false);
        class113852.y(false);
    }

    public static void N(class11385 class113852, float f) {
        float f2;
        if (class11919.N()) {
            return;
        }
        float f3 = class04462.N((boolean)class113852.i(), (boolean)class113852.M());
        if (!class11902.N(f3, f2 = class04462.N((boolean)class113852.u(), (boolean)class113852.Z()))) {
            return;
        }
        float f4 = class04995.R((float)((class04453)((class06202)class11902.N_0).T_4).method_36454());
        double d = class11902.N(f, f3, f2);
        float f5 = 0.0f;
        float f6 = 0.0f;
        double d2 = E[0];
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                double d3;
                double d4;
                if (j == 0 && i == 0 || !((d4 = Math.abs(class04995.i((double)(d - (d3 = (double)class11902.N(f4, i, j)))))) < d2)) continue;
                d2 = d4;
                f5 = i;
                f6 = j;
            }
        }
        class113852.B(f5 == 1.0f);
        class113852.u(f5 == -1.0f);
        class113852.L(f6 == 1.0f);
        class113852.R(f6 == -1.0f);
    }

    private static void R() {
        u = new String[1];
        class11902.u[0] = "This is a utility class and cannot be instantiated";
    }
}

