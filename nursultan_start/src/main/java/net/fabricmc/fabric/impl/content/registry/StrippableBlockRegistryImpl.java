/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00891
 *  net.fabricmc.fabric.api.registry.StrippableBlockRegistry$StrippingTransformer
 *  net.fabricmc.fabric.mixin.content.registry.AxeItemAccessor
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.content.registry;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import minecraft.class00500;
import minecraft.class00891;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.fabricmc.fabric.impl.content.registry.util.ImmutableCollectionUtils;
import net.fabricmc.fabric.mixin.content.registry.AxeItemAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class StrippableBlockRegistryImpl {
    private static final Logger LOGGER = LoggerFactory.getLogger(StrippableBlockRegistryImpl.class);
    private static final IdentityHashMap<class00891, StrippableBlockRegistry.StrippingTransformer> TRANSFORMERS = new IdentityHashMap();

    public static void register(class00891 class008912, class00891 class008913, StrippableBlockRegistry.StrippingTransformer strippingTransformer) {
        Objects.requireNonNull(class008912, "input block cannot be null");
        Objects.requireNonNull(class008913, "stripped block cannot be null");
        class00891 class008914 = StrippableBlockRegistryImpl.getRegistry().put(class008912, class008913);
        TRANSFORMERS.put(class008912, strippingTransformer);
        if (class008914 != null) {
            LOGGER.debug("Replaced old stripping mapping from {} to {} with {}", new Object[]{class008912, class008914, class008913});
        }
    }

    public static // Could not load outer class - annotation placement on inner may be incorrect
     @Nullable StrippableBlockRegistry.StrippingTransformer getTransformer(class00891 class008912) {
        return TRANSFORMERS.get(class008912);
    }

    private static Map<class00891, class00891> getRegistry() {
        return ImmutableCollectionUtils.getAsMutableMap(AxeItemAccessor::getStrippedBlocks, AxeItemAccessor::setStrippedBlocks);
    }

    public static @Nullable class00500 getStrippedBlockState(class00500 class005002) {
        class00891 class008912 = StrippableBlockRegistryImpl.getRegistry().get(class005002.i());
        if (class008912 == null) {
            return null;
        }
        return TRANSFORMERS.getOrDefault(class005002.i(), StrippableBlockRegistry.StrippingTransformer.VANILLA).getStrippedBlockState(class008912, class005002);
    }
}

