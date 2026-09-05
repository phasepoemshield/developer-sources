/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 */
package net.fabricmc.fabric.mixin.networking.accessor;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.fabricmc.fabric.mixin.networking.accessor.EntityTrackerAccessor;

public interface ChunkMapAccessor {
    public Int2ObjectMap<EntityTrackerAccessor> getEntityTrackers();
}

