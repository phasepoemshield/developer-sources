/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  minecraft.class01894
 */
package net.fabricmc.fabric.impl.registry.sync;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import minecraft.class01894;
import net.fabricmc.fabric.impl.registry.sync.RemapException;
import net.fabricmc.fabric.impl.registry.sync.RemappableRegistry$RemapMode;

public interface RemappableRegistry {
    public void unmap() throws RemapException;

    public void remap(Object2IntMap<class01894> var1, RemappableRegistry$RemapMode var2) throws RemapException;
}

