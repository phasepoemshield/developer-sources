/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00985
 *  minecraft.class04795
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.rendering.BlockEntityRendererRegistryImpl
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00985;
import minecraft.class04795;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.BlockEntityRendererRegistryImpl;

@Deprecated
@Environment(value=EnvType.CLIENT)
public final class BlockEntityRendererRegistry {
    private BlockEntityRendererRegistry() {
    }

    public static <E extends class00394, S extends class00985> void register(class00404<E> class004042, class04795<? super E, ? super S> class047952) {
        BlockEntityRendererRegistryImpl.register(class004042, class047952);
    }
}

