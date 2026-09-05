/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  dev.isxander.yacl3.api.Binding
 *  dev.isxander.yacl3.api.Controller
 *  dev.isxander.yacl3.api.ListOption
 *  dev.isxander.yacl3.api.ListOptionEntry
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.OptionDescription
 *  dev.isxander.yacl3.api.OptionEventListener
 *  dev.isxander.yacl3.api.OptionEventListener$Event
 *  dev.isxander.yacl3.api.OptionFlag
 *  dev.isxander.yacl3.api.StateManager
 *  minecraft.class00392
 *  org.apache.commons.lang3.Validate
 */
package dev.isxander.yacl3.impl;

import com.google.common.collect.ImmutableList;
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
import dev.isxander.yacl3.impl.ListOptionImpl$EntryFactory;
import dev.isxander.yacl3.impl.ProvidesBindingForDeprecation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import minecraft.class00392;
import org.apache.commons.lang3.Validate;

public final class ListOptionImpl<T>
implements ListOption<T> {
    private final class00392 name;
    private final OptionDescription description;
    private final StateManager<List<T>> stateManager;
    private final Supplier<T> initialValue;
    private final List<ListOptionEntry<T>> entries;
    private final boolean collapsed;
    private boolean available;
    private final int minimumNumberOfEntries;
    private final int maximumNumberOfEntries;
    private final boolean insertEntriesAtEnd;
    private final ImmutableSet<OptionFlag> flags;
    private final ListOptionImpl$EntryFactory entryFactory;
    private final List<OptionEventListener<List<T>>> listeners;
    private final List<Runnable> refreshListeners;
    private int currentListenerDepth = 0;

    public void removeEntry(ListOptionEntry<?> listOptionEntry) {
        if (this.entries.remove(listOptionEntry)) {
            this.onRefresh();
        }
    }

    public void addEventListener(OptionEventListener<List<T>> optionEventListener) {
        this.listeners.add(optionEventListener);
    }

    @Deprecated
    public void addListener(BiConsumer<Option<List<T>>, List<T>> biConsumer) {
        this.addEventListener((option, event) -> biConsumer.accept(option, (List)option.pendingValue()));
    }

    public OptionDescription description() {
        return this.description;
    }

    public ImmutableList<ListOptionEntry<T>> options() {
        return ImmutableList.copyOf(this.entries);
    }

    public ListOptionImpl(class00392 class003922, OptionDescription optionDescription, StateManager<List<T>> stateManager, Supplier<T> supplier, Function<ListOptionEntry<T>, Controller<T>> function, ImmutableSet<OptionFlag> immutableSet, boolean bl, boolean bl2, int n, int n2, boolean bl3, Collection<OptionEventListener<List<T>>> collection) {
        this.name = class003922;
        this.description = optionDescription;
        this.stateManager = stateManager;
        this.initialValue = supplier;
        this.entryFactory = new ListOptionImpl$EntryFactory(this, function);
        this.entries = this.createEntries((Collection)this.binding().getValue());
        this.collapsed = bl;
        this.flags = immutableSet;
        this.available = bl2;
        this.minimumNumberOfEntries = n;
        this.maximumNumberOfEntries = n2;
        this.insertEntriesAtEnd = bl3;
        this.listeners = new ArrayList<OptionEventListener<List<T>>>();
        this.listeners.addAll(collection);
        this.refreshListeners = new ArrayList<Runnable>();
        this.stateManager.addListener((list, list2) -> this.triggerListener(OptionEventListener.Event.STATE_CHANGE, false));
        this.triggerListener(OptionEventListener.Event.INITIAL, false);
    }

    public class00392 name() {
        return this.name;
    }

    public ImmutableSet<OptionFlag> flags() {
        return this.flags;
    }

    public int indexOf(ListOptionEntry<?> listOptionEntry) {
        return this.entries.indexOf(listOptionEntry);
    }

    @Deprecated
    public Binding<List<T>> binding() {
        if (this.stateManager instanceof ProvidesBindingForDeprecation) {
            return ((ProvidesBindingForDeprecation)this.stateManager).getBinding();
        }
        throw new UnsupportedOperationException("Binding is not available for this option - using a new state manager which does not directly expose the binding as it may not have one.");
    }

    public boolean available() {
        return this.available;
    }

    public boolean changed() {
        return !((List)this.binding().getValue()).equals(this.pendingValue());
    }

    public class00392 tooltip() {
        return this.description().text();
    }

    public boolean isRoot() {
        return false;
    }

    private List<ListOptionEntry<T>> createEntries(Collection<T> collection) {
        return collection.stream().map(this.entryFactory::create).collect(Collectors.toList());
    }

    public boolean applyValue() {
        if (this.changed()) {
            this.binding().setValue(this.pendingValue());
            return true;
        }
        return false;
    }

    public void requestSet(List<T> list) {
        this.entries.clear();
        this.entries.addAll(this.createEntries(list));
        this.onRefresh();
    }

    public boolean isPendingValueDefault() {
        return ((List)this.binding().defaultValue()).equals(this.pendingValue());
    }

    public int minimumNumberOfEntries() {
        return this.minimumNumberOfEntries;
    }

    public int maximumNumberOfEntries() {
        return this.maximumNumberOfEntries;
    }

    private void onRefresh() {
        this.refreshListeners.forEach(Runnable::run);
        this.triggerListener(OptionEventListener.Event.OTHER, true);
    }

    public Controller<List<T>> controller() {
        throw new UnsupportedOperationException();
    }

    public boolean collapsed() {
        return this.collapsed;
    }

    public StateManager<List<T>> stateManager() {
        return this.stateManager;
    }

    public int numberOfEntries() {
        return this.entries.size();
    }

    public ListOptionEntry<T> insertNewEntry() {
        ListOptionEntry listOptionEntry = this.entryFactory.create(this.initialValue.get());
        if (this.insertEntriesAtEnd) {
            this.entries.add(listOptionEntry);
        } else {
            this.entries.add(0, listOptionEntry);
        }
        this.onRefresh();
        return listOptionEntry;
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

    public void addRefreshListener(Runnable runnable) {
        this.refreshListeners.add(runnable);
    }

    public ImmutableList<T> pendingValue() {
        return ImmutableList.copyOf((Collection)this.entries.stream().map(Option::pendingValue).toList());
    }

    public void insertEntry(int n, ListOptionEntry<?> listOptionEntry) {
        this.entries.add(n, listOptionEntry);
        this.onRefresh();
    }

    public void forgetPendingValue() {
        this.requestSet((List)this.binding().getValue());
    }

    public void requestSetDefault() {
        this.requestSet((List)this.binding().defaultValue());
    }

    void triggerListener(OptionEventListener.Event event, boolean bl) {
        if (bl || this.currentListenerDepth == 0) {
            Validate.isTrue((this.currentListenerDepth <= 10 ? 1 : 0) != 0, (String)"Listener depth exceeded 10! Possible cyclic listener pattern: a listener triggered an event that triggered the initial event etc etc.", (Object[])new Object[0]);
            ++this.currentListenerDepth;
            for (OptionEventListener<List<T>> optionEventListener : this.listeners) {
                optionEventListener.onEvent((Option)this, event);
            }
            --this.currentListenerDepth;
        }
    }
}

