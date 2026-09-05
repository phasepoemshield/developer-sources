/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09424
 */
package minecraft;

import Nursultan.class09424;
import java.util.Arrays;

class class00969 {
    private int N = 1024;
    private float[] y = new float[12288];
    private int[] L = new int[2048];
    private int u;

    private void L() {
        this.N *= 2;
        this.y = Arrays.copyOf(this.y, this.N * 12);
        this.L = Arrays.copyOf(this.L, this.N * 2);
    }

    class00969() {
    }

    public int y() {
        return this.u;
    }

    public void N(class09424 class094242) {
        for (int i = 0; i < this.u; ++i) {
            int n = i * 12;
            int n2 = i * 2;
            class094242.consume(this.y[n++], this.y[n++], this.y[n++], this.y[n++], this.y[n++], this.y[n++], this.y[n++], this.y[n++], this.y[n++], this.y[n++], this.y[n++], this.y[n], this.L[n2++], this.L[n2]);
        }
    }

    public void N(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, int n, int n2) {
        if (this.u >= this.N) {
            this.L();
        }
        int n3 = this.u * 12;
        this.y[n3++] = f;
        this.y[n3++] = f2;
        this.y[n3++] = f3;
        this.y[n3++] = f4;
        this.y[n3++] = f5;
        this.y[n3++] = f6;
        this.y[n3++] = f7;
        this.y[n3++] = f8;
        this.y[n3++] = f9;
        this.y[n3++] = f10;
        this.y[n3++] = f11;
        this.y[n3] = f12;
        n3 = this.u * 2;
        this.L[n3++] = n;
        this.L[n3] = n2;
        ++this.u;
    }

    public void N() {
        this.u = 0;
    }
}

