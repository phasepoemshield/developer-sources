/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 */
package net.fabricmc.fabric.impl.base.event;

import java.lang.reflect.Array;
import java.util.Arrays;
import minecraft.class01894;
import net.fabricmc.fabric.impl.base.toposort.SortableNode;

class EventPhaseData<T>
extends SortableNode<EventPhaseData<T>> {
    final class01894 id;
    T[] listeners;

    void addListener(T t) {
        int n = this.listeners.length;
        this.listeners = Arrays.copyOf(this.listeners, n + 1);
        this.listeners[n] = t;
    }

    EventPhaseData(class01894 class018942, Class<?> clazz) {
        this.id = class018942;
        this.listeners = (Object[])Array.newInstance(clazz, 0);
    }

    @Override
    public String getDescription() {
        return this.id.toString();
    }
}

