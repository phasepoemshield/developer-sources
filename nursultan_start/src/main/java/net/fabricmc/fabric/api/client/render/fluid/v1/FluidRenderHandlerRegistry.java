/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class04651
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.rendering.fluid.FluidRenderHandlerRegistryImpl
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.client.render.fluid.v1;

import minecraft.class00891;
import minecraft.class04651;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.fabricmc.fabric.impl.client.rendering.fluid.FluidRenderHandlerRegistryImpl;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public interface FluidRenderHandlerRegistry {
    public static final FluidRenderHandlerRegistry INSTANCE = new FluidRenderHandlerRegistryImpl();

    public @Nullable FluidRenderHandler get(class04651 var1);

    default public void register(class04651 class046512, class04651 class046513, FluidRenderHandler fluidRenderHandler) {
        this.register(class046512, fluidRenderHandler);
        this.register(class046513, fluidRenderHandler);
    }

    public void register(class04651 var1, FluidRenderHandler var2);

    public @Nullable FluidRenderHandler getOverride(class04651 var1);

    public void setBlockTransparency(class00891 var1, boolean var2);

    public boolean isBlockTransparent(class00891 var1);
}

