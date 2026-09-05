/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 */
package minecraft;

import java.util.function.Supplier;
import minecraft.class04140;
import minecraft.class04782;

class class04135<E, A>
implements class04140<E, A> {
    final /* synthetic */ Object N;
    final /* synthetic */ Supplier y;

    class04135(Object object, Supplier supplier) {
        this.N = object;
        this.y = supplier;
    }

    public String toString() {
        return this.N();
    }

    @Override
    public A N(class04782 class047822, E e, long l) {
        return (A)this.N;
    }

    @Override
    public String N() {
        return (String)this.y.get();
    }
}

