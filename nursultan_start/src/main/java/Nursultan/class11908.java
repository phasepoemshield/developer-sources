/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 */
package Nursultan;

import java.util.concurrent.ThreadLocalRandom;
import minecraft.class04995;

public class class11908 {
    private static double[] N;
    private static String[] u;
    private static double[] i;

    public static double L(double d, double d2) {
        double d3 = Math.max(N[1], d2 - d);
        return class04995.N((double)class11908.N(d + d3 * N[2], d3 * N[3], d3 * N[4]), (double)d, (double)d2);
    }

    private class11908() {
        throw new UnsupportedOperationException(u[0]);
    }

    static {
        class11908.N();
        class11908.u();
    }

    private static void u() {
        u = new String[1];
        class11908.u[0] = "This is a utility class and cannot be instantiated";
    }

    public static float y(float f) {
        return (float)ThreadLocalRandom.current().nextGaussian() * f;
    }

    public static float y(float f, float f2) {
        return f + (f2 - f) * ThreadLocalRandom.current().nextFloat();
    }

    public static double y(double d, double d2) {
        return d * Math.exp(d2 * ThreadLocalRandom.current().nextGaussian());
    }

    public static float y(double d) {
        return (float)d * 57.295776f;
    }

    public static int N(int n, int n2) {
        return ThreadLocalRandom.current().nextInt(n2 - n + 1) + n;
    }

    public static double N(double d, double d2) {
        return (double)Math.round((double)Math.round(d / d2) * d2 * i[0]) / i[1];
    }

    public static float N(float f, float f2) {
        return (float)Math.round((float)Math.round(f / f2) * f2 * 100.0f) / 100.0f;
    }

    public static double N(double d, double d2, double d3) {
        double d4 = d + d2 * ThreadLocalRandom.current().nextGaussian();
        double d5 = -d3 * Math.log(N[0] - ThreadLocalRandom.current().nextDouble());
        return d4 + d5;
    }

    private static void N() {
        i = new double[2];
        class11908.i[0] = Double.longBitsToDouble(4636737291354636288L);
        class11908.i[1] = Double.longBitsToDouble(4636737291354636288L);
        N = new double[7];
        class11908.N[0] = Double.longBitsToDouble(0x3FF0000000000000L);
        class11908.N[1] = Double.longBitsToDouble(0L);
        class11908.N[2] = Double.longBitsToDouble(4597094355634707497L);
        class11908.N[3] = Double.longBitsToDouble(4593311331947716280L);
        class11908.N[4] = Double.longBitsToDouble(4599796515411129795L);
        class11908.N[5] = Double.longBitsToDouble(4652007308841189376L);
        class11908.N[6] = Double.longBitsToDouble(4652007308841189376L);
    }

    public static float N(float f) {
        return f * ((float)Math.PI / 180);
    }

    public static double N(double d) {
        return (double)Math.round(d * N[5]) / N[6];
    }
}

