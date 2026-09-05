/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  dev.isxander.yacl3.api.Binding
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.Option$Builder
 *  dev.isxander.yacl3.api.OptionDescription
 *  dev.isxander.yacl3.api.OptionEventListener
 *  dev.isxander.yacl3.api.OptionFlag
 *  dev.isxander.yacl3.api.StateManager
 *  dev.isxander.yacl3.api.controller.ControllerBuilder
 *  minecraft.class00392
 *  minecraft.class06541
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
import dev.isxander.yacl3.api.controller.ControllerBuilder;
import dev.isxander.yacl3.impl.OptionImpl;
import dev.isxander.yacl3.impl.utils.YACLConstants;
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
import minecraft.class06541;
import org.apache.commons.lang3.Validate;

public class OptionImpl$BuilderImpl<T>
implements Option.Builder<T> {
    private class00392 name = class00392.y((String)"Name not specified!").N(class06541.field_1061);
    private Function<T, OptionDescription> descriptionFunction = object -> OptionDescription.EMPTY;
    private Function<Option<T>, Controller<T>> controlGetter;
    private boolean available = true;
    private final Set<OptionFlag> flags = new HashSet<OptionFlag>();
    private final List<OptionEventListener<T>> listeners = new ArrayList<OptionEventListener<T>>();
    private Binding<T> binding;
    private boolean instantDeprecated = false;
    private StateManager<T> stateManager;

    public Option.Builder<T> listeners(Collection<BiConsumer<Option<T>, T>> collection) {
        Validate.notNull(collection, (String)"`listeners` must not be null", (Object[])new Object[0]);
        this.addListeners(collection.stream().map(biConsumer -> (option, event) -> biConsumer.accept(option, option.pendingValue())).toList());
        return this;
    }

    public Option.Builder<T> listener(BiConsumer<Option<T>, T> biConsumer) {
        Validate.notNull(biConsumer, (String)"`listener` must not be null", (Object[])new Object[0]);
        return this.addListener((option, event) -> biConsumer.accept(option, option.pendingValue()));
    }

    public Option.Builder<T> addListener(OptionEventListener<T> optionEventListener) {
        Validate.notNull(optionEventListener, (String)"`listener` must not be null", (Object[])new Object[0]);
        this.listeners.add(optionEventListener);
        return this;
    }

    public Option.Builder<T> description(Function<T, OptionDescription> function) {
        this.descriptionFunction = function;
        return this;
    }

    public Option.Builder<T> description(OptionDescription optionDescription) {
        return this.description((T object) -> optionDescription);
    }

    public Option.Builder<T> name(class00392 class003922) {
        Validate.notNull((Object)class003922, (String)"`name` cannot be null", (Object[])new Object[0]);
        this.name = class003922;
        return this;
    }

    public Option.Builder<T> flags(Collection<? extends OptionFlag> collection) {
        Validate.notNull(collection, (String)"`flags` must not be null", (Object[])new Object[0]);
        this.flags.addAll(collection);
        return this;
    }

    public Option.Builder<T> flag(OptionFlag ... optionFlagArray) {
        Validate.notNull((Object)optionFlagArray, (String)"`flag` must not be null", (Object[])new Object[0]);
        this.flags.addAll(Arrays.asList(optionFlagArray));
        return this;
    }

    public Option.Builder<T> binding(T t, Supplier<T> supplier, Consumer<T> consumer) {
        Validate.notNull(t, (String)"`def` must not be null", (Object[])new Object[0]);
        Validate.notNull(supplier, (String)"`getter` must not be null", (Object[])new Object[0]);
        Validate.notNull(consumer, (String)"`setter` must not be null", (Object[])new Object[0]);
        return this.binding(Binding.generic(t, supplier, consumer));
    }

    public Option.Builder<T> binding(Binding<T> binding) {
        Validate.notNull(binding, (String)"`binding` cannot be null", (Object[])new Object[0]);
        Validate.isTrue((this.stateManager == null ? 1 : 0) != 0, (String)"Cannot set binding when state manager is set", (Object[])new Object[0]);
        this.binding = binding;
        return this;
    }

    public Option.Builder<T> available(boolean bl) {
        this.available = bl;
        return this;
    }

    public Option<T> build() {
        Validate.notNull(this.controlGetter, (String)"`control` must not be null when building `Option`", (Object[])new Object[0]);
        if (this.instantDeprecated) {
            if (this.binding == null) {
                throw new IllegalStateException("Cannot build option with instant when binding is not set");
            }
            Validate.isTrue((boolean)this.flags.isEmpty(), (String)"instant application does not support option flags", (Object[])new Object[0]);
            this.stateManager = StateManager.createInstant(this.binding);
        } else if (this.binding != null) {
            this.stateManager = StateManager.createSimple(this.binding);
        }
        Validate.notNull(this.stateManager, (String)"State manager must be set, either by using .binding() to create a simple manager or .state() to create an advanced one", (Object[])new Object[0]);
        Validate.isTrue((!this.stateManager.isAlwaysSynced() || this.flags.isEmpty() ? 1 : 0) != 0, (String)"Always synced state managers do not support option flags.", (Object[])new Object[0]);
        return new OptionImpl<T>(this.name, this.descriptionFunction, this.controlGetter, this.stateManager, this.available, (ImmutableSet<OptionFlag>)ImmutableSet.copyOf(this.flags), this.listeners);
    }

    @Deprecated
    public Option.Builder<T> instant(boolean bl) {
        Validate.isTrue((this.stateManager == null ? 1 : 0) != 0, (String)"Cannot set instant when state manager is set", (Object[])new Object[0]);
        YACLConstants.LOGGER.error("Option.Builder#instant is deprecated behaviour. Please use a custom state manager instead: `.state(StateManager.createInstant(Binding))`");
        this.instantDeprecated = bl;
        return this;
    }

    public Option.Builder<T> controller(Function<Option<T>, ControllerBuilder<T>> function) {
        Validate.notNull(function, (String)"`controllerBuilder` cannot be null", (Object[])new Object[0]);
        return this.customController(option -> ((ControllerBuilder)function.apply((Option)option)).build());
    }

    public Option.Builder<T> addListeners(Collection<OptionEventListener<T>> collection) {
        Validate.notNull(collection, (String)"`optionEventListeners` must not be null", (Object[])new Object[0]);
        this.listeners.addAll(collection);
        return this;
    }

    public Option.Builder<T> stateManager(StateManager<T> stateManager) {
        Validate.notNull(stateManager, (String)"`stateManager` cannot be null", (Object[])new Object[0]);
        Validate.isTrue((this.binding == null ? 1 : 0) != 0, (String)"Cannot set state manager when binding is set", (Object[])new Object[0]);
        Validate.isTrue((!this.instantDeprecated ? 1 : 0) != 0, (String)"Cannot set state manager when instant is set", (Object[])new Object[0]);
        this.stateManager = stateManager;
        return this;
    }

    public Option.Builder<T> customController(Function<Option<T>, Controller<T>> function) {
        Validate.notNull(function, (String)"`control` cannot be null", (Object[])new Object[0]);
        this.controlGetter = function;
        return this;
    }
}

