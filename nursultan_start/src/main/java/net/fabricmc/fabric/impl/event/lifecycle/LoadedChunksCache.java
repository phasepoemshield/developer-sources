/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00570
 */
package net.fabricmc.fabric.impl.event.lifecycle;

import java.util.Set;
import minecraft.class00570;

public interface LoadedChunksCache {
    public Set<class00570> fabric_getLoadedChunks();

    public void fabric_markUnloaded(class00570 var1);

    public void fabric_markLoaded(class00570 var1);
}

