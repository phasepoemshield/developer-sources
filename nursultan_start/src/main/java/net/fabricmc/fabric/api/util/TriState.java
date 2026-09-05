/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class05033
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.util;

import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import minecraft.class05033;
import net.fabricmc.fabric.api.util.BooleanFunction;
import org.jspecify.annotations.Nullable;

public enum TriState implements class05033
{
    FALSE("false"),
    DEFAULT("default"),
    TRUE("true");

    public static final Codec<TriState> CODEC;
    private final String name;

    public <X extends Throwable> boolean orElseThrow(Supplier<X> supplier) throws X {
        if (this != DEFAULT) {
            return this.get();
        }
        throw (Throwable)supplier.get();
    }

    private TriState(String string2) {
        this.name = string2;
    }

    public boolean get() {
        return this == TRUE;
    }

    public <T> Optional<T> map(BooleanFunction<@Nullable ? extends T> booleanFunction) {
        Objects.requireNonNull(booleanFunction, "Mapper function cannot be null");
        if (this == DEFAULT) {
            return Optional.empty();
        }
        return Optional.ofNullable(booleanFunction.apply(this.get()));
    }

    public static TriState of(boolean bl) {
        return bl ? TRUE : FALSE;
    }

    public static TriState of(@Nullable Boolean bl) {
        return bl == null ? DEFAULT : TriState.of((boolean)bl);
    }

    public boolean orElse(boolean bl) {
        return this == DEFAULT ? bl : this.get();
    }

    public boolean orElseGet(BooleanSupplier booleanSupplier) {
        return this == DEFAULT ? booleanSupplier.getAsBoolean() : this.get();
    }

    public String method_15434() {
        return this.name;
    }

    public static TriState fromSystemProperty(String string) {
        String string2 = System.getProperty(string);
        if (string2 != null) {
            return Boolean.parseBoolean(string2) ? TRUE : FALSE;
        }
        return DEFAULT;
    }

    public @Nullable Boolean getBoxed() {
        return this == DEFAULT ? null : Boolean.valueOf(this.get());
    }

    static {
        CODEC = class05033.N(TriState::values);
    }
}

