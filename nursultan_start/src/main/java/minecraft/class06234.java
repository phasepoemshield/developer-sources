/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04745
 *  minecraft.class04778
 *  minecraft.class06265
 *  minecraft.class08593
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.concurrent.Executor;
import minecraft.class04745;
import minecraft.class04778;
import minecraft.class06265;
import minecraft.class08593;
import org.jspecify.annotations.Nullable;

class class06234
extends class04778 {
    final /* synthetic */ class06265 B;

    protected class06234(class06265 class062652, class08593 class085932, Executor executor, Executor executor2) {
        this.B = class062652;
        super(class085932, executor, executor2);
    }

    protected @Nullable class04745 y(long l) {
        return this.B.N(l);
    }

    protected boolean N(long l) {
        return this.B.i.contains(l);
    }

    protected @Nullable class04745 N(long l, int n, @Nullable class04745 class047452, int n2) {
        return this.B.N(l, n, class047452, n2);
    }
}

