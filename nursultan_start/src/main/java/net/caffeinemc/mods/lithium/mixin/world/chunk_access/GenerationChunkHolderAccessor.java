/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00549
 *  minecraft.class02818
 *  minecraft.class08050
 */
package net.caffeinemc.mods.lithium.mixin.world.chunk_access;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReferenceArray;
import minecraft.class00549;
import minecraft.class02818;
import minecraft.class08050;

public interface GenerationChunkHolderAccessor {
    public AtomicReferenceArray<CompletableFuture<class02818<class08050>>> lithium$getChunkFuturesByStatus();

    public boolean invokeCannotBeLoaded(class00549 var1);
}

