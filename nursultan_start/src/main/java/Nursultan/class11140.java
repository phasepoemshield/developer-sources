/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.util.stream.LongStream;

public class class11140 {
    private static double[] y;
    private static String[] i;

    private class11140() {
        throw new UnsupportedOperationException(i[0]);
    }

    static {
        class11140.N();
        class11140.i();
    }

    private static void i() {
        i = new String[1];
        class11140.i[0] = "This is a utility class and cannot be instantiated";
    }

    private static void N() {
        y = new double[2];
        class11140.y[0] = Double.longBitsToDouble(0x4000000000000000L);
        class11140.y[1] = Double.longBitsToDouble(4652007308841189376L);
    }

    public static long N(LongStream longStream, double d) {
        long[] lArray = longStream.distinct().sorted().toArray();
        if (lArray.length == 0) {
            return 0L;
        }
        int n = lArray.length / 2;
        double d2 = lArray.length % 2 == 1 ? (double)lArray[n] : (double)(lArray[n - 1] + lArray[n]) / y[0];
        return Math.round((d2 - d2 * d) / y[1]) * 1000L;
    }
}

