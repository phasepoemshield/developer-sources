/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.io.IOException;
import java.io.InputStream;

public class class03172
extends InputStream {
    private static final int N = 8192;
    private final InputStream y;
    private final byte[] L;
    private int u;
    private int i;

    public class03172(InputStream inputStream) {
        this(inputStream, 8192);
    }

    public class03172(InputStream inputStream, int n) {
        this.y = inputStream;
        this.L = new byte[n];
    }

    @Override
    public int read(byte[] byArray, int n, int n2) throws IOException {
        int n3 = this.N();
        if (n3 <= 0) {
            if (n2 >= this.L.length) {
                return this.y.read(byArray, n, n2);
            }
            this.y();
            n3 = this.N();
            if (n3 <= 0) {
                return -1;
            }
        }
        if (n2 > n3) {
            n2 = n3;
        }
        System.arraycopy(this.L, this.i, byArray, n, n2);
        this.i += n2;
        return n2;
    }

    @Override
    public int read() throws IOException {
        if (this.i >= this.u) {
            this.y();
            if (this.i >= this.u) {
                return -1;
            }
        }
        return Byte.toUnsignedInt(this.L[this.i++]);
    }

    @Override
    public void close() throws IOException {
        this.y.close();
    }

    @Override
    public long skip(long l) throws IOException {
        if (l <= 0L) {
            return 0L;
        }
        long l2 = this.N();
        if (l2 <= 0L) {
            return this.y.skip(l);
        }
        if (l > l2) {
            l = l2;
        }
        this.i = (int)((long)this.i + l);
        return l;
    }

    @Override
    public int available() throws IOException {
        return this.N() + this.y.available();
    }

    private void y() throws IOException {
        this.u = 0;
        this.i = 0;
        int n = this.y.read(this.L, 0, this.L.length);
        if (n > 0) {
            this.u = n;
        }
    }

    private int N() {
        return this.u - this.i;
    }
}

