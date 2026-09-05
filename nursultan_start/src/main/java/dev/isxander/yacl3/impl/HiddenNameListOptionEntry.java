/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  dev.isxander.yacl3.api.Binding
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.ListOption
 *  dev.isxander.yacl3.api.ListOptionEntry
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.OptionDescription
 *  dev.isxander.yacl3.api.OptionEventListener
 *  dev.isxander.yacl3.api.OptionFlag
 *  dev.isxander.yacl3.api.StateManager
 *  minecraft.class00392
 */
package dev.isxander.yacl3.impl;

import com.google.common.collect.ImmutableSet;
import dev.isxander.yacl3.api.Binding;
import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.ListOption;
import dev.isxander.yacl3.api.ListOptionEntry;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.api.OptionEventListener;
import dev.isxander.yacl3.api.OptionFlag;
import dev.isxander.yacl3.api.StateManager;
import java.util.function.BiConsumer;
import minecraft.class00392;

public class HiddenNameListOptionEntry<T>
implements ListOptionEntry<T> {
    private final ListOptionEntry<T> option;

    public void addEventListener(OptionEventListener<T> optionEventListener) {
        this.option.addEventListener(optionEventListener);
    }

    @Deprecated
    public void addListener(BiConsumer<Option<T>, T> biConsumer) {
        this.option.addListener(biConsumer);
    }

    public OptionDescription description() {
        return this.option.description();
    }

    public HiddenNameListOptionEntry(ListOptionEntry<T> listOptionEntry) {
        this.option = listOptionEntry;
    }

    public class00392 name() {
        return class00392.i();
    }

    public ImmutableSet<OptionFlag> flags() {
        return this.option.flags();
    }

    public Binding<T> binding() {
        return this.option.binding();
    }

    public boolean available() {
        return this.option.available();
    }

    public boolean changed() {
        return this.option.changed();
    }

    @Deprecated
    public class00392 tooltip() {
        return this.option.tooltip();
    }

    public boolean applyValue() {
        return this.option.applyValue();
    }

    public void requestSet(T t) {
        this.option.requestSet(t);
    }

    public boolean isPendingValueDefault() {
        return this.option.isPendingValueDefault();
    }

    public Controller<T> controller() {
        return this.option.controller();
    }

    public ListOption<T> parentGroup() {
        return this.option.parentGroup();
    }

    public StateManager<T> stateManager() {
        return this.option.stateManager();
    }

    public void setAvailable(boolean bl) {
        this.option.setAvailable(bl);
    }

    public boolean canResetToDefault() {
        return this.option.canResetToDefault();
    }

    public T pendingValue() {
        return (T)this.option.pendingValue();
    }

    public void forgetPendingValue() {
        this.option.forgetPendingValue();
    }

    public void requestSetDefault() {
        this.option.requestSetDefault();
    }
}

