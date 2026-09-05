/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectRBTreeMap
 *  minecraft.class00742
 *  minecraft.class00751
 *  minecraft.class01894
 *  net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback
 *  net.fabricmc.fabric.api.event.registry.RegistryIdRemapCallback
 *  net.fabricmc.fabric.api.event.registry.RegistryIdRemapCallback$RemapState
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.registry.sync.trackers;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectRBTreeMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import minecraft.class00742;
import minecraft.class00751;
import minecraft.class01894;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.fabricmc.fabric.api.event.registry.RegistryIdRemapCallback;
import net.fabricmc.fabric.impl.registry.sync.RemovableIdList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class StateIdTracker<T, S>
implements RegistryEntryAddedCallback<T>,
RegistryIdRemapCallback<T> {
    private static final Logger LOGGER = LoggerFactory.getLogger(StateIdTracker.class);
    private static final Set<class01894> TRACKED = new HashSet<class01894>();
    private final class00751<T> registry;
    private final class00742<S> stateList;
    private final Function<T, Collection<S>> stateGetter;
    private int currentHighestId = 0;

    public void onEntryAdded(int n, class01894 class018942, T t) {
        if (n == this.currentHighestId + 1) {
            this.stateGetter.apply(t).forEach(arg_0 -> this.stateList.y(arg_0));
            this.currentHighestId = n;
        } else {
            LOGGER.debug("[fabric-registry-sync] Non-sequential RegistryEntryAddedCallback for " + t.getClass().getSimpleName() + " ID tracker (at " + String.valueOf(class018942) + "), forcing state map recalculation...");
            this.recalcStateMap();
        }
    }

    private StateIdTracker(class00751<T> class007512, class00742<S> class007422, Function<T, Collection<S>> function) {
        this.registry = class007512;
        this.stateList = class007422;
        this.stateGetter = function;
        this.recalcHighestId();
    }

    public static <T, S> void register(class00751<T> class007512, class00742<S> class007422, Function<T, Collection<S>> function) {
        if (!TRACKED.add(class007512.i().N())) {
            throw new IllegalStateException("Trying to register a tracker for registry " + String.valueOf(class007512.i().N()) + " more than once!");
        }
        StateIdTracker<T, S> stateIdTracker = new StateIdTracker<T, S>(class007512, class007422, function);
        RegistryEntryAddedCallback.event(class007512).register(stateIdTracker);
        RegistryIdRemapCallback.event(class007512).register(stateIdTracker);
    }

    private void recalcStateMap() {
        ((RemovableIdList)this.stateList).fabric_clear();
        Int2ObjectRBTreeMap int2ObjectRBTreeMap = new Int2ObjectRBTreeMap();
        this.currentHighestId = 0;
        this.registry.forEach(arg_0 -> this.lambda$recalcStateMap$0((Int2ObjectMap)int2ObjectRBTreeMap, arg_0));
        for (Object e : int2ObjectRBTreeMap.values()) {
            this.stateGetter.apply(e).forEach(arg_0 -> this.stateList.y(arg_0));
        }
    }

    private void recalcHighestId() {
        this.currentHighestId = 0;
        for (Object e : this.registry) {
            this.currentHighestId = Math.max(this.currentHighestId, this.registry.N(e));
        }
    }

    public void onRemap(RegistryIdRemapCallback.RemapState<T> remapState) {
        this.recalcStateMap();
    }

    private /* synthetic */ void lambda$recalcStateMap$0(Int2ObjectMap int2ObjectMap, Object object) {
        int n = this.registry.N(object);
        this.currentHighestId = Math.max(this.currentHighestId, n);
        int2ObjectMap.put(n, object);
    }
}

