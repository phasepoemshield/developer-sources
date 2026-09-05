/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class07209
 *  minecraft.class07299
 *  net.fabricmc.fabric.api.lookup.v1.block.BlockApiLookup
 *  net.fabricmc.fabric.api.lookup.v1.block.BlockApiLookup$BlockApiProvider
 *  net.fabricmc.fabric.api.lookup.v1.block.BlockApiLookup$BlockEntityApiProvider
 *  net.fabricmc.fabric.api.lookup.v1.custom.ApiLookupMap
 *  net.fabricmc.fabric.api.lookup.v1.custom.ApiProviderMap
 *  net.fabricmc.fabric.mixin.lookup.BlockEntityTypeAccessor
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.lookup.block;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class07209;
import minecraft.class07299;
import net.fabricmc.fabric.api.lookup.v1.block.BlockApiLookup;
import net.fabricmc.fabric.api.lookup.v1.custom.ApiLookupMap;
import net.fabricmc.fabric.api.lookup.v1.custom.ApiProviderMap;
import net.fabricmc.fabric.mixin.lookup.BlockEntityTypeAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class BlockApiLookupImpl<A, C>
implements BlockApiLookup<A, C> {
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"fabric-api-lookup-api-v1/block");
    private static final ApiLookupMap<BlockApiLookup<?, ?>> LOOKUPS = ApiLookupMap.create(BlockApiLookupImpl::new);
    private final class01894 identifier;
    private final Class<A> apiClass;
    private final Class<C> contextClass;
    private final ApiProviderMap<class00891, BlockApiLookup.BlockApiProvider<A, C>> providerMap = ApiProviderMap.create();
    private final List<BlockApiLookup.BlockApiProvider<A, C>> fallbackProviders = new CopyOnWriteArrayList<BlockApiLookup.BlockApiProvider<A, C>>();

    public // Could not load outer class - annotation placement on inner may be incorrect
    @Nullable BlockApiLookup.BlockApiProvider<A, C> getProvider(class00891 class008912) {
        return (BlockApiLookup.BlockApiProvider)this.providerMap.get((Object)class008912);
    }

    private BlockApiLookupImpl(class01894 class018942, Class<?> clazz, Class<?> clazz2) {
        this.identifier = class018942;
        this.apiClass = clazz;
        this.contextClass = clazz2;
    }

    public static <A, C> BlockApiLookup<A, C> get(class01894 class018942, Class<A> clazz, Class<C> clazz2) {
        return (BlockApiLookup)LOOKUPS.getLookup(class018942, clazz, clazz2);
    }

    public @Nullable A find(class07299 class072992, class07209 class072092, @Nullable class00500 class005002, @Nullable class00394 class003942, C c) {
        Objects.requireNonNull(class072992, "World may not be null.");
        Objects.requireNonNull(class072092, "BlockPos may not be null.");
        if (class003942 == null) {
            if (class005002 == null) {
                class005002 = class072992.method_8320(class072092);
            }
            if (class005002.k()) {
                class003942 = class072992.method_8321(class072092);
            }
        } else if (class005002 == null) {
            class005002 = class003942.w();
        }
        BlockApiLookup.BlockApiProvider<A, C> blockApiProvider = this.getProvider(class005002.i());
        Object object = null;
        if (blockApiProvider != null) {
            object = blockApiProvider.find(class072992, class072092, class005002, class003942, c);
        }
        if (object != null) {
            return (A)object;
        }
        for (BlockApiLookup.BlockApiProvider<A, C> blockApiProvider2 : this.fallbackProviders) {
            object = blockApiProvider2.find(class072992, class072092, class005002, class003942, c);
            if (object == null) continue;
            return (A)object;
        }
        return null;
    }

    public class01894 getId() {
        return this.identifier;
    }

    public Class<A> apiClass() {
        return this.apiClass;
    }

    public void registerSelf(class00404<?> ... class00404Array) {
        for (class00404<?> class004042 : class00404Array) {
            class00891 class008912 = (class00891)((BlockEntityTypeAccessor)class004042).getBlocks().iterator().next();
            Objects.requireNonNull(class008912, "Could not get a support block for block entity type.");
            class00394 class003943 = class004042.method_11032(class07209.field_10980, class008912.W());
            Objects.requireNonNull(class003943, "Instantiated block entity may not be null.");
            if (this.apiClass.isAssignableFrom(class003943.getClass())) continue;
            String string = String.format("Failed to register self-implementing block entities. API class %s is not assignable from block entity class %s.", this.apiClass.getCanonicalName(), class003943.getClass().getCanonicalName());
            throw new IllegalArgumentException(string);
        }
        this.registerForBlockEntities((class003942, object) -> class003942, class00404Array);
    }

    public void registerFallback(BlockApiLookup.BlockApiProvider<A, C> blockApiProvider) {
        Objects.requireNonNull(blockApiProvider, "BlockApiProvider may not be null.");
        this.fallbackProviders.add(blockApiProvider);
    }

    public Class<C> contextClass() {
        return this.contextClass;
    }

    public void registerForBlockEntities(BlockApiLookup.BlockEntityApiProvider<A, C> blockEntityApiProvider, class00404<?> ... class00404Array) {
        Objects.requireNonNull(blockEntityApiProvider, "BlockEntityApiProvider may not be null.");
        if (class00404Array.length == 0) {
            throw new IllegalArgumentException("Must register at least one BlockEntityType instance with a BlockEntityApiProvider.");
        }
        for (class00404<?> class004042 : class00404Array) {
            Objects.requireNonNull(class004042, "Encountered null block entity type while registering a block entity API provider mapping.");
            BlockApiLookup.BlockApiProvider blockApiProvider = (class072992, class072092, class005002, class003942, object) -> {
                if (class003942 == null || class003942.O() != class004042) {
                    return null;
                }
                return blockEntityApiProvider.find(class003942, object);
            };
            class00891[] class00891Array = ((BlockEntityTypeAccessor)class004042).getBlocks().toArray(new class00891[0]);
            this.registerForBlocks(blockApiProvider, class00891Array);
        }
    }

    public List<BlockApiLookup.BlockApiProvider<A, C>> getFallbackProviders() {
        return this.fallbackProviders;
    }

    public void registerForBlocks(BlockApiLookup.BlockApiProvider<A, C> blockApiProvider, class00891 ... class00891Array) {
        Objects.requireNonNull(blockApiProvider, "BlockApiProvider may not be null.");
        if (class00891Array.length == 0) {
            throw new IllegalArgumentException("Must register at least one Block instance with a BlockApiProvider.");
        }
        for (class00891 class008912 : class00891Array) {
            Objects.requireNonNull(class008912, "Encountered null block while registering a block API provider mapping.");
            if (this.providerMap.putIfAbsent((Object)class008912, blockApiProvider) == null) continue;
            LOGGER.warn("Encountered duplicate API provider registration for block: " + String.valueOf(class04206.i.y((Object)class008912)));
        }
    }
}

