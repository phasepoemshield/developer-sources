/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 *  minecraft.class07209
 *  minecraft.class07218
 */
package Nursultan;

import com.google.common.collect.AbstractIterator;
import minecraft.class07209;
import minecraft.class07218;

public class class10729
extends AbstractIterator<class07209> {
    private final class07218 B = new class07218();
    private int Z;
    private int z;
    private int U;
    private int E;
    private int W;
    private boolean m;
    final /* synthetic */ int N;
    final /* synthetic */ int y;
    final /* synthetic */ int L;
    final /* synthetic */ int u;
    final /* synthetic */ int i;
    final /* synthetic */ int R;
    final /* synthetic */ int M;

    public class10729(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        this.N = n;
        this.y = n2;
        this.L = n3;
        this.u = n4;
        this.i = n5;
        this.R = n6;
        this.M = n7;
    }

    protected class07209 computeNext() {
        if (this.m) {
            this.m = false;
            this.B.method_20788(this.N - (this.B.method_10260() - this.N));
            return this.B;
        }
        class07218 class072182 = null;
        while (class072182 == null) {
            if (this.W > this.U) {
                ++this.E;
                if (this.E > this.z) {
                    ++this.Z;
                    if (this.Z > this.y) {
                        return (class07209)this.endOfData();
                    }
                    this.z = Math.min(this.L, this.Z);
                    this.E = -this.z;
                }
                this.U = Math.min(this.u, this.Z - Math.abs(this.E));
                this.W = -this.U;
            }
            int n = this.E;
            int n2 = this.W;
            int n3 = this.Z - Math.abs(n) - Math.abs(n2);
            if (n3 <= this.i) {
                this.m = n3 != 0;
                class072182 = this.B.N(this.R + n, this.M + n2, this.N + n3);
            }
            ++this.W;
        }
        return class072182;
    }
}

