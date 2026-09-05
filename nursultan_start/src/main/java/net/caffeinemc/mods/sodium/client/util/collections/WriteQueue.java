/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.util.collections;

import org.jspecify.annotations.NonNull;

public interface WriteQueue<E> {
    public boolean isEmpty();

    public void enqueue(@NonNull E var1);

    public void ensureCapacity(int var1);
}

