/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 *  minecraft.class06153
 */
package Nursultan;

import java.util.Spliterators;
import java.util.function.Consumer;
import minecraft.class01296;
import minecraft.class06153;

public class class09460
extends Spliterators.AbstractSpliterator<class01296> {
    final class06153 N;
    final /* synthetic */ int y;
    final /* synthetic */ int L;
    final /* synthetic */ int u;
    final /* synthetic */ int i;
    final /* synthetic */ int R;
    final /* synthetic */ int M;

    @Override
    public boolean tryAdvance(Consumer<? super class01296> consumer) {
        if (this.N.N()) {
            consumer.accept((class01296)new class01296(this.N.y(), this.N.L(), this.N.u()));
            return true;
        }
        return false;
    }

    public class09460(long l, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        this.y = n2;
        this.L = n3;
        this.u = n4;
        this.i = n5;
        this.R = n6;
        this.M = n7;
        super(l, n);
        this.N = new class06153(this.y, this.L, this.u, this.i, this.R, this.M);
    }
}

