/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public class class06153 {
    public static final int N = 0;
    public static final int y = 1;
    public static final int L = 2;
    public static final int u = 3;
    private final int i;
    private final int R;
    private final int M;
    private final int B;
    private final int Z;
    private final int z;
    private final int U;
    private int E;
    private int W;
    private int m;
    private int P;

    public int L() {
        return this.R + this.m;
    }

    public class06153(int n, int n2, int n3, int n4, int n5, int n6) {
        this.i = n;
        this.R = n2;
        this.M = n3;
        this.B = n4 - n + 1;
        this.Z = n5 - n2 + 1;
        this.z = n6 - n3 + 1;
        this.U = this.B * this.Z * this.z;
    }

    public int i() {
        int n = 0;
        if (this.W == 0 || this.W == this.B - 1) {
            ++n;
        }
        if (this.m == 0 || this.m == this.Z - 1) {
            ++n;
        }
        if (this.P == 0 || this.P == this.z - 1) {
            ++n;
        }
        return n;
    }

    public int u() {
        return this.M + this.P;
    }

    public int y() {
        return this.i + this.W;
    }

    public boolean N() {
        if (this.E == this.U) {
            return false;
        }
        this.W = this.E % this.B;
        int n = this.E / this.B;
        this.m = n % this.Z;
        this.P = n / this.Z;
        ++this.E;
        return true;
    }
}

