/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.TickRateSync
 *  Nursultan.class11799
 *  Nursultan.class11919
 *  minecraft.class00734
 *  minecraft.class01312
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07047
 *  minecraft.class07049
 */
package Nursultan;

import Nursultan.TickRateSync;
import Nursultan.class11799;
import Nursultan.class11919;
import minecraft.class00734;
import minecraft.class01312;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07049;

public class class11315 {
    private static String[] i;
    private static double[] M;
    private static double[] Z;
    public static Object N_0;

    public static boolean L() {
        return class11315.N(0.5f);
    }

    private static void M() {
        Z = new double[6];
        class11315.Z[0] = Double.longBitsToDouble(0L);
        class11315.Z[1] = Double.longBitsToDouble(0L);
        class11315.Z[2] = Double.longBitsToDouble(4591149604126578442L);
        class11315.Z[3] = Double.longBitsToDouble(0L);
        class11315.Z[4] = Double.longBitsToDouble(0L);
        class11315.Z[5] = Double.longBitsToDouble(4591870180066957722L);
        M = new double[7];
        class11315.M[0] = Double.longBitsToDouble(0L);
        class11315.M[1] = Double.longBitsToDouble(0L);
        class11315.M[2] = Double.longBitsToDouble(0x3FE3333333333333L);
        class11315.M[3] = Double.longBitsToDouble(0L);
        class11315.M[4] = Double.longBitsToDouble(0L);
        class11315.M[5] = Double.longBitsToDouble(0L);
        class11315.M[6] = Double.longBitsToDouble(0L);
    }

    private class11315() {
        throw new UnsupportedOperationException(i[0]);
    }

    static {
        class11315.M();
        class11315.R();
        class11315.i();
        N_0 = class06202.Nq();
    }

    private static void i() {
    }

    public static boolean y() {
        if (((class04453)((class06202)class11315.N_0).T_4).method_6059(class07047.d) || ((class04453)((class06202)class11315.N_0).T_4).method_6059(class07047.P) || ((class04453)((class06202)class11315.N_0).T_4).field_17046 != class06889.L || ((class04453)((class06202)class11315.N_0).T_4).method_5765() || class11919.N() || ((class04453)((class06202)class11315.N_0).T_4).method_6101()) {
            return false;
        }
        class00734 class007342 = ((class04453)((class06202)class11315.N_0).T_4).method_5829().L(Z[1], Z[2], Z[3]).u(Z[4], Z[5], M[0]);
        if (((class04453)((class06202)class11315.N_0).T_4).method_24828() && ((class03448)((class06202)class11315.N_0).T_3).method_8600((class07049)((class04453)((class06202)class11315.N_0).T_4), class007342).iterator().hasNext()) {
            return false;
        }
        if (((class04453)((class06202)class11315.N_0).T_4).method_24828() && ((class04453)((class06202)class11315.N_0).T_4).method_18376() == class01312.field_18079) {
            return false;
        }
        if (((class04453)((class06202)class11315.N_0).T_4).method_31549().y) {
            return false;
        }
        class00734 class007343 = ((class04453)((class06202)class11315.N_0).T_4).method_5829();
        double d = ((class04453)((class06202)class11315.N_0).T_4).method_5681() ? M[1] : M[2];
        class007343 = class007343.N(M[3], d, M[4]).u(M[5], d, M[6]);
        return !((class03448)((class06202)class11315.N_0).T_3).u(class007343);
    }

    public static boolean N(boolean bl) {
        if (!bl) {
            return false;
        }
        return ((class04453)((class06202)class11315.N_0).T_4).field_6017 == Z[0];
    }

    public static boolean N(float f) {
        float f2;
        float f3 = TickRateSync.m();
        float f4 = 1.0f / (float)((class04453)((class06202)class11315.N_0).T_4).method_45325(class05298.R) * 20.0f;
        float f5 = (float)((class04453)((class06202)class11315.N_0).T_4).fields_3212a028292fd3c078969e3ee4c71d9e8_1.intValue() + f;
        return class04995.N((float)(f5 / (f2 = f4 * (20.0f / f3))), (float)0.0f, (float)1.0f) <= 0.9f;
    }

    public static boolean N(int n) {
        return class11315.N() < n;
    }

    public static int N() {
        return ((class11799)((class03443)((class06202)class11315.N_0).T_2)).N();
    }

    private static void R() {
        i = new String[1];
        class11315.i[0] = "This is a utility class and cannot be instantiated";
    }
}

