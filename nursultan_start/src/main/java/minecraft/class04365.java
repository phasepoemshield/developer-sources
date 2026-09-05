/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.function.DoubleFunction;
import java.util.function.ToDoubleFunction;
import minecraft.class04350;
import minecraft.class04352;

class class04365<R>
implements class04352<R> {
    final /* synthetic */ ToDoubleFunction N;
    final /* synthetic */ DoubleFunction y;
    final /* synthetic */ class04350 L;

    class04365(class04350 class043502, ToDoubleFunction toDoubleFunction, DoubleFunction doubleFunction) {
        this.L = class043502;
        this.N = toDoubleFunction;
        this.y = doubleFunction;
    }

    @Override
    public Optional<R> u(R r) {
        return this.L.u(this.N.applyAsDouble(r)).map(this.y::apply);
    }

    @Override
    public Codec<R> y() {
        return this.L.y().xmap(this.y::apply, this.N::applyAsDouble);
    }

    @Override
    public R N(double d) {
        return this.y.apply(this.L.N(d));
    }

    @Override
    public double N(R r) {
        return this.L.N((Double)this.N.applyAsDouble(r));
    }
}

