/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05630
 *  minecraft.class06478
 */
package minecraft;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import minecraft.class04344;
import minecraft.class04355;
import minecraft.class04357;
import minecraft.class04370;
import minecraft.class05630;
import minecraft.class06478;

interface class04352<T>
extends class04344<T> {
    default public Optional<T> L(T t) {
        return Optional.empty();
    }

    default public boolean u() {
        return true;
    }

    default public Optional<T> y(T t) {
        return Optional.empty();
    }

    @Override
    default public Function<class04370<T>, class06478> N(class04355<T> class043552, class05630 class056302, int n, int n2, int n3, Consumer<T> consumer) {
        return class043702 -> new class04357(class056302, n, n2, n3, 20, class043702, this, class043552, consumer, this.u());
    }

    public T N(double var1);

    public double N(T var1);
}

