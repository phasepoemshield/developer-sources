/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  dev.isxander.yacl3.api.Binding
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.OptionDescription
 *  dev.isxander.yacl3.api.OptionEventListener
 *  dev.isxander.yacl3.api.OptionEventListener$Event
 *  dev.isxander.yacl3.api.OptionFlag
 *  dev.isxander.yacl3.api.StateManager
 *  dev.isxander.yacl3.api.StateManager$ResetAction
 *  minecraft.class00392
 *  org.apache.commons.lang3.Validate
 */
package dev.isxander.yacl3.impl;

import com.google.common.collect.ImmutableSet;
import dev.isxander.yacl3.api.Binding;
import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.api.OptionEventListener;
import dev.isxander.yacl3.api.OptionFlag;
import dev.isxander.yacl3.api.StateManager;
import dev.isxander.yacl3.impl.ProvidesBindingForDeprecation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import minecraft.class00392;
import org.apache.commons.lang3.Validate;

public class OptionImpl<T>
implements Option<T> {
    private final class00392 name;
    private OptionDescription description;
    private final Controller<T> controller;
    private boolean available;
    private final ImmutableSet<OptionFlag> flags;
    private final StateManager<T> stateManager;
    private final List<OptionEventListener<T>> listeners;
    private int currentListenerDepth;

    public void addEventListener(OptionEventListener<T> optionEventListener) {
        this.listeners.add(optionEventListener);
    }

    @Deprecated
    public void addListener(BiConsumer<Option<T>, T> biConsumer) {
        this.addEventListener((option, event) -> biConsumer.accept(option, option.pendingValue()));
    }

    public OptionDescription description() {
        return this.description;
    }

    public OptionImpl(class00392 class003922, Function<T, OptionDescription> function, Function<Option<T>, Controller<T>> function2, StateManager<T> stateManager, boolean bl, ImmutableSet<OptionFlag> immutableSet, Collection<OptionEventListener<T>> collection) {
        this.name = class003922;
        this.available = bl;
        this.flags = immutableSet;
        this.listeners = new ArrayList<OptionEventListener<T>>(collection);
        this.stateManager = stateManager;
        this.controller = function2.apply(this);
        this.stateManager.addListener((object, object2) -> this.triggerListener(OptionEventListener.Event.STATE_CHANGE, false));
        this.addEventListener((option, event) -> {
            this.description = (OptionDescription)function.apply(option.pendingValue());
        });
        this.triggerListener(OptionEventListener.Event.INITIAL, false);
    }

    public class00392 name() {
        return this.name;
    }

    public ImmutableSet<OptionFlag> flags() {
        return this.flags;
    }

    @Deprecated
    public Binding<T> binding() {
        if (this.stateManager instanceof ProvidesBindingForDeprecation) {
            return ((ProvidesBindingForDeprecation)this.stateManager).getBinding();
        }
        throw new UnsupportedOperationException("Binding is not available for this option - using a new state manager which does not directly expose the binding as it may not have one.");
    }

    public boolean available() {
        return this.available;
    }

    public boolean changed() {
        return !this.stateManager.isSynced();
    }

    public class00392 tooltip() {
        return this.description.text();
    }

    public boolean applyValue() {
        if (this.changed()) {
            this.stateManager.apply();
            return true;
        }
        return false;
    }

    public void requestSet(T t) {
        Validate.notNull(t, (String)"`value` cannot be null", (Object[])new Object[0]);
        this.stateManager.set(t);
    }

    public boolean isPendingValueDefault() {
        return this.stateManager.isDefault();
    }

    public Controller<T> controller() {
        return this.controller;
    }

    public StateManager<T> stateManager() {
        return this.stateManager;
    }

    public void setAvailable(boolean bl) {
        boolean bl2 = this.available != bl;
        this.available = bl;
        if (bl2) {
            if (!bl) {
                this.stateManager.sync();
            }
            this.triggerListener(OptionEventListener.Event.AVAILABILITY_CHANGE, !bl);
        }
    }

    public T pendingValue() {
        return (T)this.stateManager.get();
    }

    public void forgetPendingValue() {
        this.stateManager.sync();
    }

    public void requestSetDefault() {
        this.stateManager.resetToDefault(StateManager.ResetAction.BY_OPTION);
    }

    private void triggerListener(OptionEventListener.Event event, boolean bl) {
        if (bl || this.currentListenerDepth == 0) {
            Validate.isTrue((this.currentListenerDepth <= 10 ? 1 : 0) != 0, (String)"Listener depth exceeded 10! Possible cyclic listener pattern: a listener triggered an event that triggered the initial event etc etc.", (Object[])new Object[0]);
            ++this.currentListenerDepth;
            for (OptionEventListener<T> optionEventListener : this.listeners) {
                optionEventListener.onEvent((Option)this, event);
            }
            --this.currentListenerDepth;
        }
    }
}

