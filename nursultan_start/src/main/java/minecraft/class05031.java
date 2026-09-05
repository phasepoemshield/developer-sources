/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class04997;
import org.jspecify.annotations.Nullable;

public class class05031<E extends Enum<E>>
extends class04997<E> {
    private final Function<String, @Nullable E> N;

    public class05031(E[] EArray, Function<String, E> function) {
        super(EArray, function, object -> ((Enum)object).ordinal());
        this.N = function;
    }

    public E N(String string, Supplier<? extends E> supplier) {
        return (E)((Enum)Objects.requireNonNullElseGet(this.N(string), supplier));
    }

    public E N(String string, E e) {
        return (E)((Enum)Objects.requireNonNullElse(this.N(string), e));
    }

    public @Nullable E N(String string) {
        return (E)((Enum)this.N.apply(string));
    }
}

