/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class09783;
import Nursultan.class09785;
import java.util.Objects;
import java.util.function.UnaryOperator;

final class class09840<T>
implements class09785<T> {
    T N;
    class09783 y;
    final boolean L;
    private final Runnable u;

    @Override
    public T L() {
        return this.N;
    }

    class09840(T t, class09783 class097832, boolean bl, Runnable runnable) {
        this.N = t;
        this.y = class097832;
        this.L = bl;
        this.u = Objects.requireNonNull(runnable, "requestRender");
    }

    @Override
    public void y() {
        this.u.run();
    }

    @Override
    public void N(UnaryOperator<T> unaryOperator) {
        Objects.requireNonNull(unaryOperator, "update");
        this.N(unaryOperator.apply(this.N));
    }

    @Override
    public void N(T t) {
        this.N = t;
        this.y();
    }
}

