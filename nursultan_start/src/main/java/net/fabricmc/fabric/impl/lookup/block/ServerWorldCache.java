/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07209
 */
package net.fabricmc.fabric.impl.lookup.block;

import minecraft.class07209;
import net.fabricmc.fabric.impl.lookup.block.BlockApiCacheImpl;

public interface ServerWorldCache {
    public void fabric_registerCache(class07209 var1, BlockApiCacheImpl<?, ?> var2);

    public void fabric_invalidateCache(class07209 var1);
}

