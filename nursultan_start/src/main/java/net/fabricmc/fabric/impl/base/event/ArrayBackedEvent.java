/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.fabricmc.fabric.api.event.Event
 */
package net.fabricmc.fabric.impl.base.event;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import minecraft.class01894;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.impl.base.event.EventPhaseData;
import net.fabricmc.fabric.impl.base.toposort.NodeSorting;

class ArrayBackedEvent<T>
extends Event<T> {
    private final Function<T[], T> invokerFactory;
    private final Object lock = new Object();
    private T[] handlers;
    private final Map<class01894, EventPhaseData<T>> phases = new LinkedHashMap<class01894, EventPhaseData<T>>();
    private final List<EventPhaseData<T>> sortedPhases = new ArrayList<EventPhaseData<T>>();

    private void rebuildInvoker(int n) {
        if (this.sortedPhases.size() == 1) {
            this.handlers = this.sortedPhases.get((int)0).listeners;
        } else {
            Object[] objectArray = (Object[])Array.newInstance(this.handlers.getClass().getComponentType(), n);
            int n2 = 0;
            for (EventPhaseData<T> eventPhaseData : this.sortedPhases) {
                int n3 = eventPhaseData.listeners.length;
                System.arraycopy(eventPhaseData.listeners, 0, objectArray, n2, n3);
                n2 += n3;
            }
            this.handlers = objectArray;
        }
        this.update();
    }

    private EventPhaseData<T> getOrCreatePhase(class01894 class018942, boolean bl) {
        EventPhaseData<T> eventPhaseData2 = this.phases.get(class018942);
        if (eventPhaseData2 == null) {
            eventPhaseData2 = new EventPhaseData(class018942, this.handlers.getClass().getComponentType());
            this.phases.put(class018942, eventPhaseData2);
            this.sortedPhases.add(eventPhaseData2);
            if (bl) {
                NodeSorting.sort(this.sortedPhases, "event phases", Comparator.comparing(eventPhaseData -> eventPhaseData.id));
            }
        }
        return eventPhaseData2;
    }

    ArrayBackedEvent(Class<? super T> clazz, Function<T[], T> function) {
        this.invokerFactory = function;
        this.handlers = (Object[])Array.newInstance(clazz, 0);
        this.update();
    }

    void update() {
        this.invoker = this.invokerFactory.apply((T[][])this.handlers);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void register(class01894 class018942, T t) {
        Objects.requireNonNull(class018942, "Tried to register a listener for a null phase!");
        Objects.requireNonNull(t, "Tried to register a null listener!");
        Object object = this.lock;
        synchronized (object) {
            this.getOrCreatePhase(class018942, true).addListener(t);
            this.rebuildInvoker(this.handlers.length + 1);
        }
    }

    public void register(T t) {
        this.register(DEFAULT_PHASE, t);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void addPhaseOrdering(class01894 class018942, class01894 class018943) {
        Objects.requireNonNull(class018942, "Tried to add an ordering for a null phase.");
        Objects.requireNonNull(class018943, "Tried to add an ordering for a null phase.");
        if (class018942.equals((Object)class018943)) {
            throw new IllegalArgumentException("Tried to add a phase that depends on itself.");
        }
        Object object = this.lock;
        synchronized (object) {
            EventPhaseData<T> eventPhaseData2 = this.getOrCreatePhase(class018942, false);
            EventPhaseData<T> eventPhaseData3 = this.getOrCreatePhase(class018943, false);
            EventPhaseData.link(eventPhaseData2, eventPhaseData3);
            NodeSorting.sort(this.sortedPhases, "event phases", Comparator.comparing(eventPhaseData -> eventPhaseData.id));
            this.rebuildInvoker(this.handlers.length);
        }
    }
}

