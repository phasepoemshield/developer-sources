/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

class class05829 {
    private static final int N = 2048;
    private static final int y = 4;
    private final byte[] L;

    public class05829() {
        this.L = new byte[2048];
    }

    public class05829(byte[] byArray) {
        this.L = byArray;
        if (byArray.length != 2048) {
            throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + byArray.length);
        }
    }

    private int y(int n) {
        return n >> 1;
    }

    private boolean N(int n) {
        return (n & 1) == 0;
    }

    public int N(int n, int n2, int n3) {
        int n4 = this.y(n2 << 8 | n3 << 4 | n);
        if (this.N(n2 << 8 | n3 << 4 | n)) {
            return this.L[n4] & 0xF;
        }
        return this.L[n4] >> 4 & 0xF;
    }
}

