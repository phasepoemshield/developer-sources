/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  dev.isxander.yacl3.api.Binding
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.ListOption
 *  dev.isxander.yacl3.api.ListOption$Builder
 *  dev.isxander.yacl3.api.ListOptionEntry
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.OptionDescription
 *  dev.isxander.yacl3.api.OptionEventListener
 *  dev.isxander.yacl3.api.OptionFlag
 *  dev.isxander.yacl3.api.StateManager
 *  dev.isxander.yacl3.api.controller.ControllerBuilder
 *  minecraft.class00392
 *  org.apache.commons.lang3.Validate
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
import dev.isxander.yacl3.api.controller.ControllerBuilder;
import dev.isxander.yacl3.impl.ListOptionImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class00392;
import org.apache.commons.lang3.Validate;

public final class ListOptionImpl$BuilderImpl<T>
implements ListOption.Builder<T> {
    private class00392 name = class00392.i();
    private OptionDescription description = OptionDescription.EMPTY;
    private Function<ListOptionEntry<T>, Controller<T>> controllerFunction;
    private final Set<OptionFlag> flags = new HashSet<OptionFlag>();
    private Supplier<T> initialValue;
    private boolean collapsed = false;
    private boolean available = true;
    private int minimumNumberOfEntries = 0;
    private int maximumNumberOfEntries = Integer.MAX_VALUE;
    private boolean insertEntriesAtEnd = false;
    private final List<OptionEventListener<List<T>>> listeners = new ArrayList<OptionEventListener<List<T>>>();
    private Binding<List<T>> binding;
    private StateManager<List<T>> stateManager;

    public ListOption.Builder<T> listeners(Collection<BiConsumer<Option<List<T>>, List<T>>> collection) {
        Validate.notNull(collection, (String)"`listeners` must not be null", (Object[])new Object[0]);
        this.addListeners(collection.stream().map(biConsumer -> (option, event) -> biConsumer.accept(option, (List)option.pendingValue())).toList());
        return this;
    }

    public ListOption.Builder<T> listener(BiConsumer<Option<List<T>>, List<T>> biConsumer) {
        Validate.notNull(biConsumer, (String)"`listener` must not be null", (Object[])new Object[0]);
        return this.addListener((option, event) -> biConsumer.accept(option, (List)option.pendingValue()));
    }

    public ListOption.Builder<T> addListener(OptionEventListener<List<T>> optionEventListener) {
        Validate.notNull(optionEventListener, (String)"`listener` must not be null", (Object[])new Object[0]);
        this.listeners.add(optionEventListener);
        return this;
    }

    public ListOption.Builder<T> description(OptionDescription optionDescription) {
        Validate.notNull((Object)optionDescription, (String)"`description` must not be null", (Object[])new Object[0]);
        this.description = optionDescription;
        return this;
    }

    public ListOption.Builder<T> name(class00392 class003922) {
        Validate.notNull((Object)class003922, (String)"`name` must not be null", (Object[])new Object[0]);
        this.name = class003922;
        return this;
    }

    public ListOption.Builder<T> flags(Collection<OptionFlag> collection) {
        Validate.notNull(collection, (String)"`flags` must not be null", (Object[])new Object[0]);
        this.flags.addAll(collection);
        return this;
    }

    public ListOption.Builder<T> state(StateManager<List<T>> stateManager) {
        Validate.notNull(stateManager, (String)"`stateManager` cannot be null", (Object[])new Object[0]);
        Validate.isTrue((this.binding == null ? 1 : 0) != 0, (String)"Cannot set state manager if binding is already set", (Object[])new Object[0]);
        this.stateManager = stateManager;
        return this;
    }

    public ListOption.Builder<T> flag(OptionFlag ... optionFlagArray) {
        Validate.notNull((Object)optionFlagArray, (String)"`flag` must not be null", (Object[])new Object[0]);
        this.flags.addAll(Arrays.asList(optionFlagArray));
        return this;
    }

    public ListOption.Builder<T> binding(List<T> list, Supplier<List<T>> supplier, Consumer<List<T>> consumer) {
        Validate.notNull(list, (String)"`def` must not be null", (Object[])new Object[0]);
        Validate.notNull(supplier, (String)"`getter` must not be null", (Object[])new Object[0]);
        Validate.notNull(consumer, (String)"`setter` must not be null", (Object[])new Object[0]);
        this.binding = Binding.generic(list, supplier, consumer);
        return this;
    }

    public ListOption.Builder<T> binding(Binding<List<T>> binding) {
        Validate.notNull(binding, (String)"`binding` cannot be null", (Object[])new Object[0]);
        Validate.isTrue((this.stateManager == null ? 1 : 0) != 0, (String)"Cannot set binding if state manager is already set", (Object[])new Object[0]);
        this.binding = binding;
        return this;
    }

    public ListOption.Builder<T> available(boolean bl) {
        this.available = bl;
        return this;
    }

    public ListOption<T> build() {
        Validate.notNull(this.controllerFunction, (String)"`controller` must not be null", (Object[])new Object[0]);
        Validate.notNull(this.initialValue, (String)"`initialValue` must not be null", (Object[])new Object[0]);
        Validate.isTrue((this.stateManager != null || this.binding != null ? 1 : 0) != 0, (String)"Either a state manager or binding must be set", (Object[])new Object[0]);
        if (this.stateManager == null) {
            this.stateManager = StateManager.createSimple(this.binding);
        }
        return new ListOptionImpl<T>(this.name, this.description, this.stateManager, this.initialValue, this.controllerFunction, (ImmutableSet<OptionFlag>)ImmutableSet.copyOf(this.flags), this.collapsed, this.available, this.minimumNumberOfEntries, this.maximumNumberOfEntries, this.insertEntriesAtEnd, this.listeners);
    }

    public ListOption.Builder<T> initial(T t) {
        Validate.notNull(t, (String)"`initialValue` cannot be empty", (Object[])new Object[0]);
        this.initialValue = () -> t;
        return this;
    }

    public ListOption.Builder<T> initial(Supplier<T> supplier) {
        Validate.notNull(supplier, (String)"`initialValue` cannot be empty", (Object[])new Object[0]);
        this.initialValue = supplier;
        return this;
    }

    public ListOption.Builder<T> minimumNumberOfEntries(int n) {
        this.minimumNumberOfEntries = n;
        return this;
    }

    public ListOption.Builder<T> maximumNumberOfEntries(int n) {
        this.maximumNumberOfEntries = n;
        return this;
    }

    public ListOption.Builder<T> controller(Function<Option<T>, ControllerBuilder<T>> function) {
        Validate.notNull(function, (String)"`controller` cannot be null", (Object[])new Object[0]);
        this.controllerFunction = listOptionEntry -> ((ControllerBuilder)function.apply((Option)listOptionEntry)).build();
        return this;
    }

    public ListOption.Builder<T> addListeners(Collection<OptionEventListener<List<T>>> collection) {
        Validate.notNull(collection, (String)"`optionEventListeners` must not be null", (Object[])new Object[0]);
        this.listeners.addAll(collection);
        return this;
    }

    public ListOption.Builder<T> collapsed(boolean bl) {
        this.collapsed = bl;
        return this;
    }

    public ListOption.Builder<T> insertEntriesAtEnd(boolean bl) {
        this.insertEntriesAtEnd = bl;
        return this;
    }

    public ListOption.Builder<T> customController(Function<ListOptionEntry<T>, Controller<T>> function) {
        Validate.notNull(function, (String)"`control` cannot be null", (Object[])new Object[0]);
        this.controllerFunction = function;
        return this;
    }
}

