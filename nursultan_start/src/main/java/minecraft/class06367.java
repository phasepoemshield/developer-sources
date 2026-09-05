/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.List;
import java.util.function.BooleanSupplier;
import minecraft.class06363;

class class06367<T>
implements class06363<T> {
    final /* synthetic */ BooleanSupplier N;
    final /* synthetic */ List y;
    final /* synthetic */ List L;

    class06367(BooleanSupplier booleanSupplier, List list, List list2) {
        this.N = booleanSupplier;
        this.y = list;
        this.L = list2;
    }

    @Override
    public List<T> y() {
        return this.L;
    }

    @Override
    public List<T> N() {
        return this.N.getAsBoolean() ? this.y : this.L;
    }
}

