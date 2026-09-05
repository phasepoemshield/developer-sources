/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 */
package minecraft;

import java.util.Optional;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;
import minecraft.class04352;
import minecraft.class04374;
import minecraft.class04995;

interface class04372
extends class04352<Integer> {
    public int L();

    @Override
    default public Optional<Integer> L(Integer n) {
        return Optional.of(n - 1);
    }

    @Override
    default public double N(Integer n) {
        if (n.intValue() == this.aA_()) {
            return 0.0;
        }
        if (n.intValue() == this.L()) {
            return 1.0;
        }
        return class04995.y((double)((double)n.intValue() + 0.5), (double)this.aA_(), (double)((double)this.L() + 1.0), (double)0.0, (double)1.0);
    }

    @Override
    default public Integer N(double d) {
        if (d >= 1.0) {
            d = 0.99999f;
        }
        return class04995.N((double)class04995.y((double)d, (double)0.0, (double)1.0, (double)this.aA_(), (double)((double)this.L() + 1.0)));
    }

    @Override
    default public Optional<Integer> y(Integer n) {
        return Optional.of(n + 1);
    }

    default public <R> class04352<R> N(IntFunction<? extends R> intFunction, ToIntFunction<? super R> toIntFunction, boolean bl) {
        return new class04374(this, toIntFunction, intFunction, bl);
    }

    public int aA_();
}

