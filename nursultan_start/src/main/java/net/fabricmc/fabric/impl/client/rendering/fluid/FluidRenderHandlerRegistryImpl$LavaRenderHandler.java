/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04688
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class08388
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.client.rendering.fluid;

import minecraft.class04688;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class08388;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
class FluidRenderHandlerRegistryImpl$LavaRenderHandler
implements FluidRenderHandler {
    public static final FluidRenderHandlerRegistryImpl$LavaRenderHandler INSTANCE = new FluidRenderHandlerRegistryImpl$LavaRenderHandler();
    private class08388[] sprites;

    private FluidRenderHandlerRegistryImpl$LavaRenderHandler() {
    }

    public void updateSprites(class08388[] class08388Array) {
        this.sprites = class08388Array;
    }

    public class08388[] getFluidSprites(@Nullable class07295 class072952, @Nullable class07209 class072092, class04688 class046882) {
        return this.sprites;
    }
}

