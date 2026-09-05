/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11087
 *  Nursultan.class11499
 *  Nursultan.class11505
 *  minecraft.class04995
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06889
 */
package Nursultan;

import Nursultan.class11087;
import Nursultan.class11499;
import Nursultan.class11505;
import minecraft.class04995;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06889;

public class class09170 {
    private static double[] y;

    private static void L() {
        y = new double[5];
        class09170.y[0] = Double.longBitsToDouble(4585204852618449388L);
        class09170.y[1] = Double.longBitsToDouble(0x3FE3333333333333L);
        class09170.y[2] = Double.longBitsToDouble(4596373779694328218L);
        class09170.y[3] = Double.longBitsToDouble(0x4020000000000000L);
        class09170.y[4] = Double.longBitsToDouble(0x3FC3333333333333L);
    }

    private class09170() {
    }

    static {
        class09170.L();
    }

    public static float N(float f, float f2) {
        return class04995.R((float)(f2 - f));
    }

    public static class11499 N(class06889 class068892) {
        return class11505.N((class06889)class068892);
    }

    public static double N() {
        if ((class06202)class11087.N_0 == null || (class05630)((class06202)class11087.N_0).i_7 == null) {
            return y[0];
        }
        double d = (Double)((class05630)((class06202)class11087.N_0).i_7).u().method_41753() * y[1] + y[2];
        return d * d * d * y[3] * y[4];
    }
}

