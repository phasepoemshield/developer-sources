/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.StateManager
 *  dev.isxander.yacl3.api.StateManager$ResetAction
 *  dev.isxander.yacl3.api.StateManager$StateListener
 */
package dev.isxander.yacl3.impl;

import dev.isxander.yacl3.api.StateManager;

public class ImmutableStateManager<T>
implements StateManager<T> {
    private final T value;

    public void addListener(StateManager.StateListener<T> stateListener) {
    }

    public ImmutableStateManager(T t) {
        this.value = t;
    }

    public T get() {
        return this.value;
    }

    public void apply() {
    }

    public void set(T t) {
        throw new UnsupportedOperationException("Cannot set value of immutable state manager");
    }

    public boolean isDefault() {
        return true;
    }

    public void sync() {
    }

    public boolean isSynced() {
        return true;
    }

    public void resetToDefault(StateManager.ResetAction resetAction) {
    }

    public boolean isAlwaysSynced() {
        return true;
    }
}

