/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Binding
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.ListOption
 *  dev.isxander.yacl3.api.ListOptionEntry
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.OptionDescription
 *  dev.isxander.yacl3.api.OptionEventListener
 *  dev.isxander.yacl3.api.StateManager
 *  dev.isxander.yacl3.impl.HiddenNameListOptionEntry
 *  minecraft.class00392
 */
package dev.isxander.yacl3.impl;

import dev.isxander.yacl3.api.Binding;
import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.ListOption;
import dev.isxander.yacl3.api.ListOptionEntry;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.api.OptionEventListener;
import dev.isxander.yacl3.api.StateManager;
import dev.isxander.yacl3.impl.HiddenNameListOptionEntry;
import dev.isxander.yacl3.impl.ListOptionEntryImpl$EntryBinding;
import dev.isxander.yacl3.impl.ListOptionEntryImpl$EntryController;
import dev.isxander.yacl3.impl.ListOptionImpl;
import java.util.function.BiConsumer;
import java.util.function.Function;
import minecraft.class00392;

public final class ListOptionEntryImpl<T>
implements ListOptionEntry<T> {
    final ListOptionImpl<T> group;
    T value;
    private final Binding<T> binding;
    private final Controller<T> controller;

    public void addEventListener(OptionEventListener<T> optionEventListener) {
    }

    public void addListener(BiConsumer<Option<T>, T> biConsumer) {
    }

    public OptionDescription description() {
        return this.group.description();
    }

    ListOptionEntryImpl(ListOptionImpl<T> listOptionImpl, T t, Function<ListOptionEntry<T>, Controller<T>> function) {
        this.group = listOptionImpl;
        this.value = t;
        this.binding = new ListOptionEntryImpl$EntryBinding(this);
        this.controller = new ListOptionEntryImpl$EntryController<T>(function.apply((ListOptionEntry<HiddenNameListOptionEntry>)new HiddenNameListOptionEntry((ListOptionEntry)this)), this);
    }

    public class00392 name() {
        return this.group.name();
    }

    public Binding<T> binding() {
        return this.binding;
    }

    public boolean available() {
        return this.parentGroup().available();
    }

    public boolean changed() {
        return false;
    }

    public class00392 tooltip() {
        return this.group.tooltip();
    }

    public boolean applyValue() {
        return false;
    }

    public void requestSet(T t) {
        this.binding.setValue(t);
    }

    public boolean isPendingValueDefault() {
        return false;
    }

    public Controller<T> controller() {
        return this.controller;
    }

    public ListOption<T> parentGroup() {
        return this.group;
    }

    public StateManager<T> stateManager() {
        throw new UnsupportedOperationException("ListOptionEntryImpl does not support state managers");
    }

    public void setAvailable(boolean bl) {
    }

    public boolean canResetToDefault() {
        return false;
    }

    public T pendingValue() {
        return this.value;
    }

    public void forgetPendingValue() {
    }

    public void requestSetDefault() {
    }
}

