/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  minecraft.class02362
 */
package Nursultan;

import com.google.common.base.Suppliers;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import minecraft.class02362;

public class class09701<B, T>
implements class02362<B, T> {
    private final Supplier<class02362<B, T>> y = Suppliers.memoize(() -> (class02362)this.N.apply(this));
    final /* synthetic */ UnaryOperator N;

    public class09701(UnaryOperator unaryOperator) {
        this.N = unaryOperator;
    }

    public T decode(B b) {
        return (T)this.y.get().decode(b);
    }

    public void encode(B b, T t) {
        this.y.get().encode(b, t);
    }
}

