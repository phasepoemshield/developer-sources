/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package dev.isxander.yacl3.api;

import dev.isxander.yacl3.api.Binding;
import dev.isxander.yacl3.api.Controller;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionDescription;
import dev.isxander.yacl3.api.OptionEventListener;
import dev.isxander.yacl3.api.OptionFlag;
import dev.isxander.yacl3.api.StateManager;
import dev.isxander.yacl3.api.controller.ControllerBuilder;
import java.util.Collection;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class00392;

public interface Option$Builder<T> {
    @Deprecated
    public Option$Builder<T> listeners(Collection<BiConsumer<Option<T>, T>> var1);

    @Deprecated
    public Option$Builder<T> listener(BiConsumer<Option<T>, T> var1);

    public Option$Builder<T> addListener(OptionEventListener<T> var1);

    public Option$Builder<T> description(Function<T, OptionDescription> var1);

    public Option$Builder<T> description(OptionDescription var1);

    public Option$Builder<T> name(class00392 var1);

    public Option$Builder<T> flags(Collection<? extends OptionFlag> var1);

    public Option$Builder<T> flag(OptionFlag ... var1);

    public Option$Builder<T> binding(T var1, Supplier<T> var2, Consumer<T> var3);

    public Option$Builder<T> binding(Binding<T> var1);

    public Option$Builder<T> available(boolean var1);

    public Option<T> build();

    @Deprecated
    public Option$Builder<T> instant(boolean var1);

    public Option$Builder<T> controller(Function<Option<T>, ControllerBuilder<T>> var1);

    public Option$Builder<T> addListeners(Collection<OptionEventListener<T>> var1);

    public Option$Builder<T> stateManager(StateManager<T> var1);

    public Option$Builder<T> customController(Function<Option<T>, Controller<T>> var1);
}

