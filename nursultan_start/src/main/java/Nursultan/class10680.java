/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap
 *  minecraft.class06826
 *  minecraft.class06839
 */
package Nursultan;

import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import minecraft.class06826;
import minecraft.class06839;

public class class10680 {
    final Reference2ObjectMap<class06839<?>, Object> N = new Reference2ObjectOpenHashMap();

    public <T> class10680 N(class06839<T> class068392, T t) {
        this.N.put(class068392, t);
        return this;
    }

    public class06826 N() {
        return new class06826(this.N);
    }
}

