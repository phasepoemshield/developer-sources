/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 */
package net.caffeinemc.mods.lithium.common.util.collections;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import net.caffeinemc.mods.lithium.common.util.collections.ListeningLong2ObjectOpenHashMap$Callback;

public class ListeningLong2ObjectOpenHashMap<V>
extends Long2ObjectOpenHashMap<V> {
    private final ListeningLong2ObjectOpenHashMap$Callback<V> addCallback;
    private final ListeningLong2ObjectOpenHashMap$Callback<V> removeCallback;

    public ListeningLong2ObjectOpenHashMap(ListeningLong2ObjectOpenHashMap$Callback<V> listeningLong2ObjectOpenHashMap$Callback, ListeningLong2ObjectOpenHashMap$Callback<V> listeningLong2ObjectOpenHashMap$Callback2) {
        this.addCallback = listeningLong2ObjectOpenHashMap$Callback;
        this.removeCallback = listeningLong2ObjectOpenHashMap$Callback2;
    }

    public V remove(long l) {
        Object object = super.remove(l);
        if (object != null) {
            this.removeCallback.apply(l, object);
        }
        return (V)object;
    }

    public V put(long l, V v) {
        Object object = super.put(l, v);
        if (object != v) {
            if (object != null) {
                this.removeCallback.apply(l, v);
            }
            this.addCallback.apply(l, v);
        }
        return (V)object;
    }
}

