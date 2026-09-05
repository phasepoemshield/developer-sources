/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.MemoryUtil
 */
package Nursultan;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.lwjgl.system.MemoryUtil;

final class class09726 {
    private final int N;
    private final int y;
    private final int L;
    private final ByteBuffer u;
    private int[] i;
    private int[] R;
    private int[] M;
    private int B;

    int L() {
        return this.L;
    }

    class09726(int n, int n2, int n3) {
        this.N = n;
        this.y = n2;
        this.L = n3;
        this.u = MemoryUtil.memCalloc((int)(n * n2 * n3));
        this.i = new int[16];
        this.R = new int[16];
        this.M = new int[16];
        this.i[0] = 0;
        this.R[0] = 0;
        this.M[0] = n;
        this.B = 1;
    }

    void i() {
        MemoryUtil.memFree((Buffer)this.u);
    }

    ByteBuffer u() {
        return this.u;
    }

    private void y(int n) {
        if (n <= this.i.length) {
            return;
        }
        int n2 = Math.max(n, this.i.length * 2);
        this.i = Arrays.copyOf(this.i, n2);
        this.R = Arrays.copyOf(this.R, n2);
        this.M = Arrays.copyOf(this.M, n2);
    }

    int y() {
        return this.y;
    }

    private void N(int n) {
        int n2 = this.B - n - 1;
        if (n2 > 0) {
            System.arraycopy(this.i, n + 1, this.i, n, n2);
            System.arraycopy(this.R, n + 1, this.R, n, n2);
            System.arraycopy(this.M, n + 1, this.M, n, n2);
        }
        --this.B;
    }

    private void N(int n, int n2, int n3, int n4) {
        this.y(this.B + 1);
        int n5 = this.B - n;
        if (n5 > 0) {
            System.arraycopy(this.i, n, this.i, n + 1, n5);
            System.arraycopy(this.R, n, this.R, n + 1, n5);
            System.arraycopy(this.M, n, this.M, n + 1, n5);
        }
        this.i[n] = n2;
        this.R[n] = n3;
        this.M[n] = n4;
        ++this.B;
    }

    void N(byte[] byArray, int n, int n2, int n3, int n4) {
        int n5 = n * this.L;
        for (int i = 0; i < n2; ++i) {
            int n6 = i * n5;
            int n7 = ((n4 + i) * this.N + n3) * this.L;
            this.u.put(n7, byArray, n6, n5);
        }
    }

    void N(class09726 class097262, int n, int n2, int n3, int n4, int n5, int n6) {
        long l = MemoryUtil.memAddress((ByteBuffer)class097262.u);
        long l2 = MemoryUtil.memAddress((ByteBuffer)this.u);
        int n7 = n3 * this.L;
        for (int i = 0; i < n4; ++i) {
            long l3 = l + (long)((n2 + i) * class097262.N + n) * (long)this.L;
            long l4 = l2 + (long)((n6 + i) * this.N + n5) * (long)this.L;
            MemoryUtil.memCopy((long)l3, (long)l4, (long)n7);
        }
    }

    void N(int n, int n2, int n3, int n4, byte[] byArray) {
        int n5 = n3 * this.L;
        for (int i = 0; i < n4; ++i) {
            int n6 = ((n2 + i) * this.N + n) * this.L;
            int n7 = i * n5;
            this.u.get(n6, byArray, n7, n5);
        }
    }

    boolean N(int n, int n2, int n3, int[] nArray) {
        int n4 = n + n3;
        int n5 = n2 + n3;
        if (n4 > this.N || n5 > this.y) {
            return false;
        }
        int n6 = Integer.MAX_VALUE;
        int n7 = -1;
        int n8 = -1;
        for (int i = 0; i < this.B; ++i) {
            int n9 = this.N(i, n4);
            if (n9 < 0 || n9 + n5 > this.y || n9 >= n6 && (n9 != n6 || this.i[i] >= n7)) continue;
            n6 = n9;
            n7 = this.i[i];
            n8 = i;
        }
        if (n8 < 0) {
            return false;
        }
        this.N(n8, n7, n6, n4, n5);
        nArray[0] = n7;
        nArray[1] = n6;
        return true;
    }

    int N() {
        return this.N;
    }

    private void N(int n, int n2, int n3, int n4, int n5) {
        this.N(n, n2, n3 + n5, n4);
        int n6 = n2 + n4;
        int n7 = n + 1;
        while (n7 < this.B && this.i[n7] < n6) {
            if (this.i[n7] + this.M[n7] <= n6) {
                this.N(n7);
                continue;
            }
            int n8 = n6 - this.i[n7];
            int n9 = n7;
            this.i[n9] = this.i[n9] + n8;
            int n10 = n7;
            this.M[n10] = this.M[n10] - n8;
            break;
        }
        this.R();
    }

    private int N(int n, int n2) {
        if (this.i[n] + n2 > this.N) {
            return -1;
        }
        int n3 = n2;
        int n4 = 0;
        int n5 = n;
        while (n3 > 0) {
            if (n5 >= this.B) {
                return -1;
            }
            if (this.R[n5] > n4) {
                n4 = this.R[n5];
            }
            n3 -= this.M[n5];
            ++n5;
        }
        return n4;
    }

    private void R() {
        int n = 1;
        while (n < this.B) {
            if (this.R[n] == this.R[n - 1]) {
                int n2 = n - 1;
                this.M[n2] = this.M[n2] + this.M[n];
                this.N(n);
                continue;
            }
            ++n;
        }
    }
}

