/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.impl.ImmutableStateManager
 *  dev.isxander.yacl3.impl.InstantStateManager
 *  dev.isxander.yacl3.impl.SimpleStateManager
 */
package dev.isxander.yacl3.api;

import dev.isxander.yacl3.api.Binding;
import dev.isxander.yacl3.api.StateManager$ResetAction;
import dev.isxander.yacl3.api.StateManager$StateListener;
import dev.isxander.yacl3.impl.ImmutableStateManager;
import dev.isxander.yacl3.impl.InstantStateManager;
import dev.isxander.yacl3.impl.SimpleStateManager;
import java.util.function.Consumer;
import java.util.function.Supplier;

public interface StateManager<T> {
    public void addListener(StateManager$StateListener<T> var1);

    public T get();

    public void apply();

    public void set(T var1);

    public boolean isDefault();

    public void sync();

    public static <T> StateManager<T> createSimple(T t2, Supplier<T> supplier, Consumer<T> consumer) {
        return new SimpleStateManager(Binding.generic(t2, supplier, consumer));
    }

    public static <T> StateManager<T> createSimple(Binding<T> binding) {
        return new SimpleStateManager(binding);
    }

    public boolean isSynced();

    public void resetToDefault(StateManager$ResetAction var1);

    public static <T> StateManager<T> createImmutable(T t2) {
        return new ImmutableStateManager(t2);
    }

    public static <T> StateManager<T> createInstant(T t2, Supplier<T> supplier, Consumer<T> consumer) {
        return new InstantStateManager(Binding.generic(t2, supplier, consumer));
    }

    public static <T> StateManager<T> createInstant(Binding<T> binding) {
        return new InstantStateManager(binding);
    }

    default public boolean isAlwaysSynced() {
        return false;
    }
}

