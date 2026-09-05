/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09376
 *  Nursultan.class09377
 *  minecraft.class04995
 *  minecraft.class06889
 */
package minecraft;

import Nursultan.class09376;
import Nursultan.class09377;
import minecraft.class04995;
import minecraft.class06889;

public class class00618 {
    private static final int N = 2;
    private static final int y = 6;
    private static final double[] L = new double[]{0.0, 1.0, 4.0, 6.0, 4.0, 1.0, 0.0};

    public static <V> void N(class06889 class068892, class09377<V> class093772, class09376<V> class093762) {
        class068892 = class068892.N(0.5, 0.5, 0.5);
        int n = class04995.N((double)class068892.N());
        int n2 = class04995.N((double)class068892.y());
        int n3 = class04995.N((double)class068892.L());
        double d = class068892.N() - (double)n;
        double d2 = class068892.y() - (double)n2;
        double d3 = class068892.L() - (double)n3;
        for (int i = 0; i < 6; ++i) {
            double d4 = class04995.u((double)d3, (double)L[i + 1], (double)L[i]);
            int n4 = n3 - 2 + i;
            for (int j = 0; j < 6; ++j) {
                double d5 = class04995.u((double)d, (double)L[j + 1], (double)L[j]);
                int n5 = n - 2 + j;
                for (int k = 0; k < 6; ++k) {
                    double d6 = class04995.u((double)d2, (double)L[k + 1], (double)L[k]);
                    int n6 = n2 - 2 + k;
                    double d7 = d5 * d6 * d4;
                    Object object = class093772.get(n5, n6, n4);
                    class093762.accumulate(d7, object);
                }
            }
        }
    }
}

