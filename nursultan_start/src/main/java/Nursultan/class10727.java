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

public class class10727
extends AbstractIterator<class07218> {
    private final class07211[] i;
    private final class07218 R;
    private final int M;
    private int B;
    private int Z;
    private int z;
    private int U;
    private int E;
    private int W;
    final /* synthetic */ class07211 N;
    final /* synthetic */ class07211 y;
    final /* synthetic */ class07209 L;
    final /* synthetic */ int u;

    public class10727(class07211 class072112, class07211 class072113, class07209 class072092, int n) {
        this.N = class072112;
        this.y = class072113;
        this.L = class072092;
        this.u = n;
        this.i = new class07211[]{this.N, this.y, this.N.b(), this.y.b()};
        this.R = this.L.method_25503().N(this.y);
        this.M = 4 * this.u;
        this.B = -1;
        this.U = this.R.method_10263();
        this.E = this.R.method_10264();
        this.W = this.R.method_10260();
    }

    protected class07218 computeNext() {
        this.R.N(this.U, this.E, this.W).N(this.i[(this.B + 4) % 4]);
        this.U = this.R.method_10263();
        this.E = this.R.method_10264();
        this.W = this.R.method_10260();
        if (this.z >= this.Z) {
            if (this.B >= this.M) {
                return (class07218)this.endOfData();
            }
            ++this.B;
            this.z = 0;
            this.Z = this.B / 2 + 1;
        }
        ++this.z;
        return this.R;
    }
}

