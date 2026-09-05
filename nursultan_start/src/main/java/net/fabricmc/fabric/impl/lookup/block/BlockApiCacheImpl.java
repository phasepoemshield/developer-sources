/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class04782
 *  minecraft.class07209
 *  minecraft.class07299
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerBlockEntityEvents
 *  net.fabricmc.fabric.api.lookup.v1.block.BlockApiCache
 *  net.fabricmc.fabric.api.lookup.v1.block.BlockApiLookup$BlockApiProvider
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.lookup.block;

import minecraft.class00394;
import minecraft.class00500;
import minecraft.class04782;
import minecraft.class07209;
import minecraft.class07299;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerBlockEntityEvents;
import net.fabricmc.fabric.api.lookup.v1.block.BlockApiCache;
import net.fabricmc.fabric.api.lookup.v1.block.BlockApiLookup;
import net.fabricmc.fabric.impl.lookup.block.BlockApiLookupImpl;
import net.fabricmc.fabric.impl.lookup.block.ServerWorldCache;
import org.jspecify.annotations.Nullable;

public final class BlockApiCacheImpl<A, C>
implements BlockApiCache<A, C> {
    private final BlockApiLookupImpl<A, C> lookup;
    private final class04782 world;
    private final class07209 pos;
    private boolean blockEntityCacheValid = false;
    private class00394 cachedBlockEntity = null;
    private class00500 lastState = null;
    private BlockApiLookup.BlockApiProvider<A, C> cachedProvider = null;

    public BlockApiCacheImpl(BlockApiLookupImpl<A, C> blockApiLookupImpl, class04782 class047822, class07209 class072092) {
        ((ServerWorldCache)class047822).fabric_registerCache(class072092, this);
        this.lookup = blockApiLookupImpl;
        this.world = class047822;
        this.pos = class072092.method_10062();
    }

    static {
        ServerBlockEntityEvents.BLOCK_ENTITY_LOAD.register((class003942, class047822) -> ((ServerWorldCache)class047822).fabric_invalidateCache(class003942.d()));
        ServerBlockEntityEvents.BLOCK_ENTITY_UNLOAD.register((class003942, class047822) -> ((ServerWorldCache)class047822).fabric_invalidateCache(class003942.d()));
    }

    public @Nullable A find(@Nullable class00500 class005002, C c) {
        this.getBlockEntity();
        if (class005002 == null) {
            class005002 = this.cachedBlockEntity != null ? this.cachedBlockEntity.w() : this.world.method_8320(this.pos);
        }
        if (this.lastState != class005002) {
            this.cachedProvider = this.lookup.getProvider(class005002.i());
            this.lastState = class005002;
        }
        Object object = null;
        if (this.cachedProvider != null) {
            object = this.cachedProvider.find((class07299)this.world, this.pos, class005002, this.cachedBlockEntity, c);
        }
        if (object != null) {
            return (A)object;
        }
        for (BlockApiLookup.BlockApiProvider<A, C> blockApiProvider : this.lookup.getFallbackProviders()) {
            object = blockApiProvider.find((class07299)this.world, this.pos, class005002, this.cachedBlockEntity, c);
            if (object == null) continue;
            return (A)object;
        }
        return null;
    }

    public BlockApiLookupImpl<A, C> getLookup() {
        return this.lookup;
    }

    public void invalidate() {
        this.blockEntityCacheValid = false;
        this.cachedBlockEntity = null;
        this.lastState = null;
        this.cachedProvider = null;
    }

    public class04782 getWorld() {
        return this.world;
    }

    public class07209 getPos() {
        return this.pos;
    }

    public @Nullable class00394 getBlockEntity() {
        if (!this.blockEntityCacheValid) {
            this.cachedBlockEntity = this.world.method_8321(this.pos);
            this.blockEntityCacheValid = true;
        }
        return this.cachedBlockEntity;
    }
}

