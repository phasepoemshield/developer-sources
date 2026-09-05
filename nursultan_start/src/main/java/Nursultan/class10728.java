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

public class class10728
extends AbstractIterator<class07209> {
    private final class07218 M = new class07218();
    private int B;
    final /* synthetic */ int N;
    final /* synthetic */ int y;
    final /* synthetic */ int L;
    final /* synthetic */ int u;
    final /* synthetic */ int i;
    final /* synthetic */ int R;

    public class10728(int n, int n2, int n3, int n4, int n5, int n6) {
        this.N = n;
        this.y = n2;
        this.L = n3;
        this.u = n4;
        this.i = n5;
        this.R = n6;
    }

    protected class07209 computeNext() {
        if (this.B == this.N) {
            return (class07209)this.endOfData();
        }
        int n = this.B % this.y;
        int n2 = this.B / this.y;
        int n3 = n2 % this.L;
        int n4 = n2 / this.L;
        ++this.B;
        return this.M.N(this.u + n, this.i + n3, this.R + n4);
    }
}

