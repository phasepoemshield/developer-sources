/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public interface class08535 {
    public static int N(double d, double d2, int[] nArray, int n) {
        int n2 = (int)((1.0 - d) * 255.0);
        int n3 = (int)((1.0 - (d2 *= d)) * 255.0) << 8 | n2;
        if (n3 >= nArray.length) {
            return n;
        }
        return nArray[n3];
    }
}

