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
public class FluidRenderHandlerInfo {
    public final class08388[] sprites = new class08388[2];
    public @Nullable FluidRenderHandler handler;
    public boolean hasOverlay;
    public class08388 overlaySprite;

    public void clear() {
        this.sprites[0] = null;
        this.sprites[1] = null;
        this.handler = null;
        this.hasOverlay = false;
        this.overlaySprite = null;
    }

    public void setup(FluidRenderHandler fluidRenderHandler, class07295 class072952, class07209 class072092, class04688 class046882) {
        this.handler = fluidRenderHandler;
        class08388[] class08388Array = fluidRenderHandler.getFluidSprites(class072952, class072092, class046882);
        this.sprites[0] = class08388Array[0];
        this.sprites[1] = class08388Array[1];
        if (class08388Array.length > 2) {
            this.hasOverlay = true;
            this.overlaySprite = class08388Array[2];
        }
    }
}

