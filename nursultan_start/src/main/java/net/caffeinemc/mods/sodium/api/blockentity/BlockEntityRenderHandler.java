/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00404
 *  net.caffeinemc.mods.sodium.api.internal.DependencyInjection
 */
package net.caffeinemc.mods.sodium.api.blockentity;

import minecraft.class00394;
import minecraft.class00404;
import net.caffeinemc.mods.sodium.api.blockentity.BlockEntityRenderPredicate;
import net.caffeinemc.mods.sodium.api.internal.DependencyInjection;

public interface BlockEntityRenderHandler {
    public static final BlockEntityRenderHandler INSTANCE = (BlockEntityRenderHandler)DependencyInjection.load(BlockEntityRenderHandler.class, (String)"net.caffeinemc.mods.sodium.client.render.chunk.BlockEntityRenderHandlerImpl");

    public static BlockEntityRenderHandler instance() {
        return INSTANCE;
    }

    public <T extends class00394> boolean removeRenderPredicate(class00404<T> var1, BlockEntityRenderPredicate<T> var2);

    public <T extends class00394> void addRenderPredicate(class00404<T> var1, BlockEntityRenderPredicate<T> var2);
}

