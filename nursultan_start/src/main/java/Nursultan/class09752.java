/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap
 */
package Nursultan;

import Nursultan.class09719;
import Nursultan.class09750;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.util.Arrays;

final class class09752 {
    static final int N = -2;
    static final int y = -1;
    private final Int2IntOpenHashMap L = new Int2IntOpenHashMap(256, 0.7f);
    private int[] u;
    private float[] i;
    private float[] R;
    private float[] M;
    private float[] B;
    private float[] Z;
    private int[] z;
    private int[] U;
    private int[] E;
    private int[] W;
    private int[] m;
    private int P;

    int L(int n) {
        return this.L.get(n);
    }

    float M(int n) {
        return this.M[n];
    }

    private void P(int n) {
        if (n <= this.u.length) {
            return;
        }
        int n2 = Math.max(n, this.u.length * 2);
        this.u = Arrays.copyOf(this.u, n2);
        this.i = Arrays.copyOf(this.i, n2);
        this.R = Arrays.copyOf(this.R, n2);
        this.M = Arrays.copyOf(this.M, n2);
        this.B = Arrays.copyOf(this.B, n2);
        this.Z = Arrays.copyOf(this.Z, n2);
        this.z = Arrays.copyOf(this.z, n2);
        this.U = Arrays.copyOf(this.U, n2);
        this.E = Arrays.copyOf(this.E, n2);
        this.W = Arrays.copyOf(this.W, n2);
        this.m = Arrays.copyOf(this.m, n2);
    }

    class09752() {
        this.L.defaultReturnValue(-2);
        int n = 256;
        this.u = new int[n];
        this.i = new float[n];
        this.R = new float[n];
        this.M = new float[n];
        this.B = new float[n];
        this.Z = new float[n];
        this.z = new int[n];
        this.U = new int[n];
        this.E = new int[n];
        this.W = new int[n];
        this.m = new int[n];
    }

    float B(int n) {
        return this.B[n];
    }

    float Z(int n) {
        return this.Z[n];
    }

    float i(int n) {
        return this.i[n];
    }

    int m(int n) {
        return this.m[n];
    }

    int U(int n) {
        return this.U[n];
    }

    int z(int n) {
        return this.z[n];
    }

    int u(int n) {
        return this.u[n];
    }

    void y(int n) {
        this.L.put(n, -1);
    }

    int E(int n) {
        return this.E[n];
    }

    void N(int n, float f, int n2, int n3, float f2, float f3, class09719 class097192) {
        class097192.N = this.i[n] * f;
        class097192.y = this.R[n] * f;
        class097192.L = this.M[n] * f;
        class097192.u = this.B[n] * f;
        if (this.E[n] > 0) {
            float f4 = 1.0f / (float)n2;
            float f5 = 1.0f / (float)n3;
            class097192.i = (float)this.z[n] * f4;
            class097192.R = (float)this.U[n] * f5;
            class097192.M = (float)(this.z[n] + this.E[n]) * f4;
            class097192.B = (float)(this.U[n] + this.W[n]) * f5;
        } else {
            class097192.B = 0.0f;
            class097192.M = 0.0f;
            class097192.R = 0.0f;
            class097192.i = 0.0f;
        }
        class097192.Z = this.Z[n] * f;
        class097192.z = f2 * f / f3;
        class097192.U = this.m[n];
    }

    void N(int n, int n2, int n3, int n4, int n5, int n6) {
        this.z[n] = n2;
        this.U[n] = n3;
        this.E[n] = n4;
        this.W[n] = n5;
        this.m[n] = n6;
    }

    int N(int n, float f, float f2, float f3, float f4, float f5, int n2, int n3, int n4, int n5, int n6) {
        int n7 = this.P++;
        this.P(this.P);
        this.u[n7] = n;
        this.i[n7] = f;
        this.R[n7] = f2;
        this.M[n7] = f3;
        this.B[n7] = f4;
        this.Z[n7] = f5;
        this.z[n7] = n2;
        this.U[n7] = n3;
        this.E[n7] = n4;
        this.W[n7] = n5;
        this.m[n7] = n6;
        this.L.put(n, n7);
        return n7;
    }

    int N() {
        return this.P;
    }

    int N(int n) {
        return this.L.get(n);
    }

    int N(class09750 class097502) {
        int n = this.P++;
        this.P(this.P);
        this.u[n] = class097502.N();
        this.i[n] = class097502.y();
        this.R[n] = class097502.L();
        this.M[n] = class097502.u();
        this.B[n] = class097502.i();
        this.Z[n] = class097502.R();
        this.z[n] = class097502.M();
        this.U[n] = class097502.B();
        this.E[n] = class097502.Z();
        this.W[n] = class097502.z();
        this.m[n] = class097502.U();
        this.L.put(class097502.N(), n);
        return n;
    }

    int W(int n) {
        return this.W[n];
    }

    float R(int n) {
        return this.R[n];
    }
}

