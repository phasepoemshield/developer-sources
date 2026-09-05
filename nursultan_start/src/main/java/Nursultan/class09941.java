/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

final class class09941 {
    private class09941() {
    }

    static int N(int n) {
        if (n <= 1) {
            return 1;
        }
        if (n > 0x40000000) {
            throw new IllegalArgumentException("value is too large for power-of-two rounding: " + n);
        }
        return Integer.highestOneBit(n - 1) << 1;
    }
}

