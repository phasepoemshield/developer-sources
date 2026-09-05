/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.lame4j;

import java.util.Arrays;

public class ShortArrayBuffer {
    protected short[] buf;
    protected int count;
    public static final int SOFT_MAX_ARRAY_LENGTH = 0x7FFFFFF7;

    public ShortArrayBuffer() {
        this(32);
    }

    public ShortArrayBuffer(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Negative initial size: " + n);
        }
        this.buf = new short[n];
    }

    public synchronized int size() {
        return this.count;
    }

    public synchronized void reset() {
        this.count = 0;
    }

    public synchronized void write(short[] sArray, int n, int n2) {
        assert (n + n2 <= sArray.length);
        this.ensureCapacity(this.count + n2);
        System.arraycopy(sArray, n, this.buf, this.count, n2);
        this.count += n2;
    }

    public synchronized void write(short s) {
        this.ensureCapacity(this.count + 1);
        this.buf[this.count] = s;
        ++this.count;
    }

    private void ensureCapacity(int n) {
        int n2 = this.buf.length;
        int n3 = n - n2;
        if (n3 > 0) {
            this.buf = Arrays.copyOf(this.buf, ShortArrayBuffer.newLength(n2, n3, n2));
        }
    }

    private static int newLength(int n, int n2, int n3) {
        int n4 = n + Math.max(n2, n3);
        if (0 < n4 && n4 <= 0x7FFFFFF7) {
            return n4;
        }
        return ShortArrayBuffer.hugeLength(n, n2);
    }

    private static int hugeLength(int n, int n2) {
        int n3 = n + n2;
        if (n3 < 0) {
            throw new OutOfMemoryError("Required array length " + n + " + " + n2 + " is too large");
        }
        if (n3 <= 0x7FFFFFF7) {
            return 0x7FFFFFF7;
        }
        return n3;
    }

    public synchronized short[] toShortArray() {
        return Arrays.copyOf(this.buf, this.count);
    }

    public void writeShorts(short[] sArray) {
        this.write(sArray, 0, sArray.length);
    }
}

