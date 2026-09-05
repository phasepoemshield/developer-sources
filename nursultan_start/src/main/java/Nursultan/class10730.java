/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 */
package Nursultan;

import com.google.common.collect.AbstractIterator;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;

public class class10730
extends AbstractIterator<class07209> {
    private final class07218 z = new class07218();
    private int U;
    private int E;
    private int W;
    private boolean m;
    private final int P = this.N.P();
    private final int s = this.N.s();
    private final int T = this.N.T();
    private final int b = this.y.P();
    private final int j = this.y.s();
    private final int v = this.y.T();
    private final int n = this.L.P();
    private final int t = this.L.s();
    private final int G = this.L.T();
    final /* synthetic */ class07211 N;
    final /* synthetic */ class07211 y;
    final /* synthetic */ class07211 L;
    final /* synthetic */ int u;
    final /* synthetic */ int i;
    final /* synthetic */ int R;
    final /* synthetic */ int M;
    final /* synthetic */ int B;
    final /* synthetic */ int Z;

    public class10730(class07211 class072112, class07211 class072113, class07211 class072114, int n, int n2, int n3, int n4, int n5, int n6) {
        this.N = class072112;
        this.y = class072113;
        this.L = class072114;
        this.u = n;
        this.i = n2;
        this.R = n3;
        this.M = n4;
        this.B = n5;
        this.Z = n6;
    }

    protected class07209 computeNext() {
        if (this.m) {
            return (class07209)this.endOfData();
        }
        this.z.N(this.u + this.P * this.U + this.b * this.E + this.n * this.W, this.i + this.s * this.U + this.j * this.E + this.t * this.W, this.R + this.T * this.U + this.v * this.E + this.G * this.W);
        if (this.W < this.M) {
            ++this.W;
        } else if (this.E < this.B) {
            ++this.E;
            this.W = 0;
        } else if (this.U < this.Z) {
            ++this.U;
            this.W = 0;
            this.E = 0;
        } else {
            this.m = true;
        }
        return this.z;
    }
}

