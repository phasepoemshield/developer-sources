/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class04782
 *  minecraft.class07209
 *  net.fabricmc.fabric.impl.lookup.block.BlockApiCacheImpl
 *  net.fabricmc.fabric.impl.lookup.block.BlockApiLookupImpl
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.lookup.v1.block;

import java.util.Objects;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class04782;
import minecraft.class07209;
import net.fabricmc.fabric.api.lookup.v1.block.BlockApiLookup;
import net.fabricmc.fabric.impl.lookup.block.BlockApiCacheImpl;
import net.fabricmc.fabric.impl.lookup.block.BlockApiLookupImpl;
import org.jspecify.annotations.Nullable;

public interface BlockApiCache<A, C> {
    public static <A, C> BlockApiCache<A, C> create(BlockApiLookup<A, C> blockApiLookup, class04782 class047822, class07209 class072092) {
        Objects.requireNonNull(class072092, "BlockPos may not be null.");
        Objects.requireNonNull(class047822, "ServerWorld may not be null.");
        if (!(blockApiLookup instanceof BlockApiLookupImpl)) {
            throw new IllegalArgumentException("Cannot cache foreign implementation of BlockApiLookup. Use `BlockApiLookup#get(Identifier, Class<A>, Class<C>);` to get instances.");
        }
        return new BlockApiCacheImpl((BlockApiLookupImpl)blockApiLookup, class047822, class072092);
    }

    default public @Nullable A find(C c) {
        return this.find(null, c);
    }

    public @Nullable A find(@Nullable class00500 var1, C var2);

    public BlockApiLookup<A, C> getLookup();

    public class04782 getWorld();

    public class07209 getPos();

    public @Nullable class00394 getBlockEntity();
}

