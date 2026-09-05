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

public class SimpleStateManager<T>
implements StateManager<T>,
ProvidesBindingForDeprecation<T> {
    private T pendingValue;
    private final Binding<T> binding;
    private StateManager.StateListener<T> stateListener;

    public void addListener(StateManager.StateListener<T> stateListener) {
        this.stateListener = this.stateListener.andThen(stateListener);
    }

    public SimpleStateManager(Binding<T> binding) {
        this.binding = binding;
        this.pendingValue = binding.getValue();
        this.stateListener = StateManager.StateListener.noop();
    }

    public T get() {
        return this.pendingValue;
    }

    public void apply() {
        this.binding.setValue(this.pendingValue);
    }

    public void set(T t) {
        boolean bl = !this.pendingValue.equals(t);
        this.pendingValue = t;
        if (bl) {
            this.stateListener.onStateChange(this.pendingValue, t);
        }
    }

    public boolean isDefault() {
        return this.binding.defaultValue().equals(this.pendingValue);
    }

    public void sync() {
        this.set(this.binding.getValue());
    }

    @Override
    public Binding<T> getBinding() {
        return this.binding;
    }

    public boolean isSynced() {
        return this.binding.getValue().equals(this.pendingValue);
    }

    public void resetToDefault(StateManager.ResetAction resetAction) {
        this.set(this.binding.defaultValue());
    }
}

