/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Binding
 *  dev.isxander.yacl3.api.StateManager
 *  dev.isxander.yacl3.api.StateManager$ResetAction
 *  dev.isxander.yacl3.api.StateManager$StateListener
 */
package dev.isxander.yacl3.impl;

import dev.isxander.yacl3.api.Binding;
import dev.isxander.yacl3.api.StateManager;
import dev.isxander.yacl3.impl.ProvidesBindingForDeprecation;

public class InstantStateManager<T>
implements StateManager<T>,
ProvidesBindingForDeprecation<T> {
    private final Binding<T> binding;
    private final T previousValue;
    private T pendingValue;
    private StateManager.StateListener<T> stateListener;
    private boolean requiresSave = false;

    public void addListener(StateManager.StateListener<T> stateListener) {
        this.stateListener = this.stateListener.andThen(stateListener);
    }

    public InstantStateManager(Binding<T> binding) {
        this.binding = binding;
        this.previousValue = binding.getValue();
        this.pendingValue = binding.getValue();
        this.stateListener = StateManager.StateListener.noop();
    }

    public T get() {
        return this.pendingValue;
    }

    public void apply() {
        this.requiresSave = false;
    }

    public void set(T t) {
        boolean bl = !this.pendingValue.equals(t);
        boolean bl2 = this.previousValue.equals(t);
        this.binding.setValue(t);
        this.pendingValue = t;
        if (bl2) {
            this.requiresSave = false;
        }
        if (bl && !bl2) {
            this.requiresSave = true;
        }
        if (bl) {
            this.stateListener.onStateChange(this.pendingValue, t);
        }
    }

    public boolean isDefault() {
        return this.binding.defaultValue().equals(this.pendingValue);
    }

    public void sync() {
        this.set(this.previousValue);
    }

    @Override
    public Binding<T> getBinding() {
        return this.binding;
    }

    public boolean isSynced() {
        return !this.requiresSave;
    }

    public void resetToDefault(StateManager.ResetAction resetAction) {
        this.set(this.binding.defaultValue());
    }
}

