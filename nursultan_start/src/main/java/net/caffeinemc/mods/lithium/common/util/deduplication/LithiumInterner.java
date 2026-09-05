/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 */
package net.caffeinemc.mods.lithium.common.util.deduplication;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;

public class LithiumInterner<T> {
    private final ObjectOpenHashSet<T> canonicalStorage = new ObjectOpenHashSet();

    public <S extends T> S getCanonical(S s) {
        return (S)this.canonicalStorage.addOrGet(s);
    }

    public void deleteCanonical(T t) {
        this.canonicalStorage.remove(t);
    }
}

