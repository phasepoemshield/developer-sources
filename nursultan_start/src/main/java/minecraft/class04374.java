/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import minecraft.class04352;
import minecraft.class04372;

class class04374<R>
implements class04352<R> {
    final /* synthetic */ ToIntFunction N;
    final /* synthetic */ IntFunction y;
    final /* synthetic */ boolean L;
    final /* synthetic */ class04372 u;

    @Override
    public Optional<R> L(R r) {
        if (!this.L) {
            return Optional.empty();
        }
        int n = this.N.applyAsInt(r);
        return Optional.of(this.y.apply(this.u.u(n - 1).orElse(n)));
    }

    class04374(class04372 class043722, ToIntFunction toIntFunction, IntFunction intFunction, boolean bl) {
        this.u = class043722;
        this.N = toIntFunction;
        this.y = intFunction;
        this.L = bl;
    }

    @Override
    public Optional<R> u(R r) {
        return this.u.u(this.N.applyAsInt(r)).map(this.y::apply);
    }

    @Override
    public Codec<R> y() {
        return this.u.y().xmap(this.y::apply, this.N::applyAsInt);
    }

    @Override
    public Optional<R> y(R r) {
        if (!this.L) {
            return Optional.empty();
        }
        int n = this.N.applyAsInt(r);
        return Optional.of(this.y.apply(this.u.u(n + 1).orElse(n)));
    }

    @Override
    public R N(double d) {
        return this.y.apply(this.u.N(d));
    }

    @Override
    public double N(R r) {
        return this.u.N((Integer)this.N.applyAsInt(r));
    }
}

