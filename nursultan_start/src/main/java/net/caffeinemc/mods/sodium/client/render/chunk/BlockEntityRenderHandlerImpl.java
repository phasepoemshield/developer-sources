/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00404
 *  net.caffeinemc.mods.sodium.api.blockentity.BlockEntityRenderHandler
 *  net.caffeinemc.mods.sodium.api.blockentity.BlockEntityRenderPredicate
 */
package net.caffeinemc.mods.sodium.client.render.chunk;

import minecraft.class00394;
import minecraft.class00404;
import net.caffeinemc.mods.sodium.api.blockentity.BlockEntityRenderHandler;
import net.caffeinemc.mods.sodium.api.blockentity.BlockEntityRenderPredicate;
import net.caffeinemc.mods.sodium.client.render.chunk.ExtendedBlockEntityType;

public class BlockEntityRenderHandlerImpl
implements BlockEntityRenderHandler {
    public <T extends class00394> boolean removeRenderPredicate(class00404<T> class004042, BlockEntityRenderPredicate<T> blockEntityRenderPredicate) {
        return ExtendedBlockEntityType.removeRenderPredicate(class004042, blockEntityRenderPredicate);
    }

    public <T extends class00394> void addRenderPredicate(class00404<T> class004042, BlockEntityRenderPredicate<T> blockEntityRenderPredicate) {
        ExtendedBlockEntityType.addRenderPredicate(class004042, blockEntityRenderPredicate);
    }
}

