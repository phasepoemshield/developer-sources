/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11781
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07438
 *  minecraft.class07451
 */
package Nursultan;

import Nursultan.class11781;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07438;
import minecraft.class07451;

public class class11891 {
    private static double[] L;
    private static String[] i;
    public static Object N_0;

    private static void L() {
        L = new double[8];
        class11891.L[0] = Double.longBitsToDouble(0L);
        class11891.L[1] = Double.longBitsToDouble(0L);
        class11891.L[2] = Double.longBitsToDouble(0L);
        class11891.L[3] = Double.longBitsToDouble(0L);
        class11891.L[4] = Double.longBitsToDouble(0x3FF0000000000000L);
        class11891.L[5] = Double.longBitsToDouble(0L);
        class11891.L[6] = Double.longBitsToDouble(0x3FF0000000000000L);
        class11891.L[7] = Double.longBitsToDouble(4607002274986721280L);
    }

    private static boolean L(class11781 class117812) {
        return class117812.y() && !class117812.L() && class117812.M() - class117812.u() > L[0];
    }

    private class11891() {
        throw new UnsupportedOperationException(i[0]);
    }

    static {
        class11891.L();
        class11891.u();
        class11891.R();
        N_0 = class06202.Nq();
    }

    private static class06889 i(class11781 class117812) {
        return class117812.i().method_18796(new class06889(class117812.N().M, class117812.N().B, class117812.N().Z), class07451.field_6308);
    }

    private static void u(class11781 class117812) {
        class07438 class074382 = class117812.i();
        float f = ((class03448)((class06202)class11891.N_0).T_3).method_8320(class074382.method_23314()).i().Z();
        float f2 = class117812.R() ? f * 0.91f : 0.91f;
        class06889 class068892 = class117812.N();
        class117812.N(new class06889(class068892.M * (double)f2, (class068892.B - class074382.method_61426()) * L[7], class068892.Z * (double)f2));
    }

    private static void u() {
        i = new String[1];
        class11891.i[0] = "This is a utility class and cannot be instantiated";
    }

    private static void y(class11781 class117812) {
        class117812.N(new class06889(class117812.N().M, (double)class117812.i().method_6106(), class117812.N().Z));
    }

    public static class06889 y() {
        return ((class11781)((class04453)((class06202)class11891.N_0).T_4)).N();
    }

    public static void N(class11781 class117812) {
        if (class11891.L(class117812)) {
            class11891.y(class117812);
        }
        class06889 class068892 = class11891.i(class117812);
        class06889 class068893 = class11891.N(class117812, class068892);
        class11891.N(class117812, class068892, class068893);
        class11891.u(class117812);
    }

    private static void N(class11781 class117812, class06889 class068892, class06889 class068893) {
        boolean bl;
        boolean bl2 = !class04995.y((double)class068892.M, (double)class068893.M);
        boolean bl3 = !class04995.y((double)class068892.Z, (double)class068893.Z);
        boolean bl4 = bl2 || bl3;
        boolean bl5 = class068892.B != class068893.B;
        boolean bl6 = bl = bl5 && class068892.B < L[1];
        if (bl4) {
            class06889 class068894 = class117812.N();
            class117812.N(new class06889(bl2 ? L[2] : class068894.M, class068894.B, bl3 ? L[3] : class068894.Z));
        }
        if (bl5) {
            class117812.N(class117812.N().u(L[4], L[5], L[6]));
        }
        class117812.N(bl);
    }

    private static class06889 N(class11781 class117812, class06889 class068892) {
        return class117812.i().method_17835(class068892);
    }

    public static boolean N() {
        return ((class11781)((class04453)((class06202)class11891.N_0).T_4)).R();
    }

    private static void R() {
    }
}

