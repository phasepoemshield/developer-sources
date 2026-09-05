/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05630
 *  minecraft.class06202
 */
package Nursultan;

import minecraft.class05630;
import minecraft.class06202;

public class class11302 {
    private static double[] y;
    private static String[] u;
    private static double[] i;
    public static Object N_0;

    private static double L(double d) {
        double d2 = d * y[3] + y[4];
        return d2 * d2 * d2 * y[5] * y[6];
    }

    private static void L() {
    }

    private class11302() {
        throw new UnsupportedOperationException(u[0]);
    }

    static {
        class11302.N();
        class11302.y();
        class11302.L();
        N_0 = class06202.Nq();
    }

    public static double y(double d) {
        double d2 = (Double)((class05630)((class06202)class11302.N_0).i_7).u().method_41753() * y[0] + y[1];
        double d3 = d2 * d2 * d2 * y[2];
        return d * d3;
    }

    private static void y() {
        u = new String[1];
        class11302.u[0] = "This is a utility class and cannot be instantiated";
    }

    public static float N(float f, float f2, double d) {
        double d2 = class11302.L(d);
        float f3 = f2;
        return f3 -= (float)((double)(f2 - f) % d2);
    }

    public static double N(double d) {
        double d2 = (Double)((class05630)((class06202)class11302.N_0).i_7).u().method_41753() * i[0] + i[1];
        return d / (i[2] * d2 * d2 * d2);
    }

    private static void N() {
        i = new double[3];
        class11302.i[0] = Double.longBitsToDouble(0x3FE3333333333333L);
        class11302.i[1] = Double.longBitsToDouble(4596373779694328218L);
        class11302.i[2] = Double.longBitsToDouble(0x4020000000000000L);
        y = new double[7];
        class11302.y[0] = Double.longBitsToDouble(4603579539312869376L);
        class11302.y[1] = Double.longBitsToDouble(4596373779801702400L);
        class11302.y[2] = Double.longBitsToDouble(0x4020000000000000L);
        class11302.y[3] = Double.longBitsToDouble(4603579539312869376L);
        class11302.y[4] = Double.longBitsToDouble(4596373779801702400L);
        class11302.y[5] = Double.longBitsToDouble(0x4020000000000000L);
        class11302.y[6] = Double.longBitsToDouble(0x3FC3333333333333L);
    }

    public static float N(float f, float f2) {
        return class11302.N(f, f2, (Double)((class05630)((class06202)class11302.N_0).i_7).u().method_41753());
    }
}

