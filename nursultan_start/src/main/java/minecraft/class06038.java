/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.Locale;

public class class06038 {
    public static void N(StringBuilder stringBuilder, double d, double d2, double d3, int[] nArray) {
        stringBuilder.append(String.format(Locale.ROOT, "xo=%.3f, yo=%.3f, zo=%.3f, p0=%d, p255=%d", Float.valueOf((float)d), Float.valueOf((float)d2), Float.valueOf((float)d3), nArray[0], nArray[255]));
    }

    public static void N(StringBuilder stringBuilder, double d, double d2, double d3, byte[] byArray) {
        stringBuilder.append(String.format(Locale.ROOT, "xo=%.3f, yo=%.3f, zo=%.3f, p0=%d, p255=%d", Float.valueOf((float)d), Float.valueOf((float)d2), Float.valueOf((float)d3), byArray[0], byArray[255]));
    }

    public static double N(double d, double d2) {
        return d + Math.sin(Math.PI * d) * d2 / Math.PI;
    }
}

