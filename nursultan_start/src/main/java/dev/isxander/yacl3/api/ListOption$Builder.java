/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package dev.isxander.yacl3.api;

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
import java.util.Collection;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class00392;

public interface ListOption$Builder<T> {
    public ListOption$Builder<T> listeners(Collection<BiConsumer<Option<List<T>>, List<T>>> var1);

    public ListOption$Builder<T> listener(BiConsumer<Option<List<T>>, List<T>> var1);

    public ListOption$Builder<T> addListener(OptionEventListener<List<T>> var1);

    public ListOption$Builder<T> description(OptionDescription var1);

    public ListOption$Builder<T> name(class00392 var1);

    public ListOption$Builder<T> flags(Collection<OptionFlag> var1);

    public ListOption$Builder<T> state(StateManager<List<T>> var1);

    public ListOption$Builder<T> flag(OptionFlag ... var1);

    public ListOption$Builder<T> binding(Binding<List<T>> var1);

    public ListOption$Builder<T> binding(List<T> var1, Supplier<List<T>> var2, Consumer<List<T>> var3);

    public ListOption$Builder<T> available(boolean var1);

    public ListOption<T> build();

    public ListOption$Builder<T> initial(Supplier<T> var1);

    public ListOption$Builder<T> initial(T var1);

    public ListOption$Builder<T> minimumNumberOfEntries(int var1);

    public ListOption$Builder<T> maximumNumberOfEntries(int var1);

    public ListOption$Builder<T> controller(Function<Option<T>, ControllerBuilder<T>> var1);

    public ListOption$Builder<T> addListeners(Collection<OptionEventListener<List<T>>> var1);

    public ListOption$Builder<T> collapsed(boolean var1);

    public ListOption$Builder<T> insertEntriesAtEnd(boolean var1);

    public ListOption$Builder<T> customController(Function<ListOptionEntry<T>, Controller<T>> var1);
}

