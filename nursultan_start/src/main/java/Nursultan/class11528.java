/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06938
 *  minecraft.class07438
 *  minecraft.class08036
 */
package Nursultan;

import java.util.Map;
import java.util.WeakHashMap;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06938;
import minecraft.class07438;
import minecraft.class08036;

public class class11528 {
    private static String[] M;
    private static double[] z;
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;

    private static boolean L(class08036 class080362) {
        class06584 class065842 = class080362.method_6047();
        return class065842.N((class07438)class080362) != 0 && !class065842.N(class06570.lo);
    }

    private class11528() {
        throw new UnsupportedOperationException(M[0]);
    }

    static {
        class11528.i();
        class11528.Z();
        class11528.R();
        N_2 = class06202.Nq();
        N_3 = new WeakHashMap();
    }

    private static void Z() {
        M = new String[1];
        class11528.M[0] = "This is a utility class and cannot be instantiated";
    }

    private static void i() {
        z = new double[2];
        class11528.z[0] = Double.longBitsToDouble(0L);
        class11528.z[1] = Double.longBitsToDouble(0L);
    }

    private static boolean y(class08036 class080362) {
        return (class080362.method_6047().N(class06570.lo) || class080362.method_6079().N(class06570.lo)) && !class11528.L(class080362);
    }

    public static boolean N(class08036 class080362, class06889 class068892, boolean bl) {
        if (!(bl ? class080362.method_6039() : class080362.method_6115() && class080362.method_6030().N(class06570.lo))) {
            return false;
        }
        if (class068892 == null) {
            return true;
        }
        class06889 class068893 = class080362.method_5828(1.0f);
        class06889 class068894 = class068892.N(class080362.method_73189()).u();
        return new class06889(class068894.M, z[0], class068894.Z).y(class068893) < z[1];
    }

    public static void N() {
        if ((class03448)((class06202)class11528.N_2).T_3 == null) {
            return;
        }
        for (class08036 class080362 : ((class03448)((class06202)class11528.N_2).T_3).method_18456()) {
            if (class080362 == (class04453)((class06202)class11528.N_2).T_4) continue;
            int n = ((Map)N_3).getOrDefault(class080362, 72000);
            if (class080362.method_6115() && class11528.y(class080362)) {
                class080362.fields_9212a028292fd3c078969e3ee4c71d9e8_0 = class080362.method_5998(class080362.method_6058());
                class080362.fields_9212a028292fd3c078969e3ee4c71d9e8_1 = n;
                --n;
            } else {
                n = 72000;
            }
            ((Map)N_3).put(class080362, n);
        }
    }

    public static boolean N(class08036 class080362) {
        return class080362.method_59958().B() instanceof class06938;
    }

    public static boolean N(class08036 class080362, boolean bl) {
        return class11528.N(class080362, null, bl);
    }

    private static void R() {
        N_0 = false;
        N_1 = 72000;
    }
}

