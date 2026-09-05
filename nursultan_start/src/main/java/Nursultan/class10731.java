/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07218
 */
package Nursultan;

import com.google.common.collect.AbstractIterator;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07218;

public class class10731
extends AbstractIterator<class07209> {
    final class07218 N = new class07218();
    int y = this.L;
    final /* synthetic */ int L;
    final /* synthetic */ int u;
    final /* synthetic */ class06069 i;
    final /* synthetic */ int R;
    final /* synthetic */ int M;
    final /* synthetic */ int B;
    final /* synthetic */ int Z;
    final /* synthetic */ int z;

    public class10731(int n, int n2, class06069 class060692, int n3, int n4, int n5, int n6, int n7) {
        this.L = n;
        this.u = n2;
        this.i = class060692;
        this.R = n3;
        this.M = n4;
        this.B = n5;
        this.Z = n6;
        this.z = n7;
    }

    protected class07209 computeNext() {
        if (this.y <= 0) {
            return (class07209)this.endOfData();
        }
        class07218 class072182 = this.N.N(this.u + this.i.y(this.R), this.M + this.i.y(this.B), this.Z + this.i.y(this.z));
        --this.y;
        return class072182;
    }
}

