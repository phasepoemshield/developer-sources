/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00891
 *  net.fabricmc.fabric.mixin.content.registry.ShovelItemAccessor
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.api.registry;

import java.util.Objects;
import minecraft.class00500;
import minecraft.class00891;
import net.fabricmc.fabric.mixin.content.registry.ShovelItemAccessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class FlattenableBlockRegistry {
    private static final Logger LOGGER = LoggerFactory.getLogger(FlattenableBlockRegistry.class);

    private FlattenableBlockRegistry() {
    }

    public static void register(class00891 class008912, class00500 class005002) {
        Objects.requireNonNull(class008912, "input block cannot be null");
        Objects.requireNonNull(class005002, "flattened block state cannot be null");
        class00500 class005003 = ShovelItemAccessor.getPathStates().put(class008912, class005002);
        if (class005003 != null) {
            LOGGER.debug("Replaced old flattening mapping from {} to {} with {}", new Object[]{class008912, class005003, class005002});
        }
    }
}

