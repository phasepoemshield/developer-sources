/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04688
 *  minecraft.class06229
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
import minecraft.class06229;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class08388;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
class FluidRenderHandlerRegistryImpl$WaterRenderHandler
implements FluidRenderHandler {
    public static final FluidRenderHandlerRegistryImpl$WaterRenderHandler INSTANCE = new FluidRenderHandlerRegistryImpl$WaterRenderHandler();
    private static final int DEFAULT_WATER_COLOR = 4159204;
    private final class08388[] sprites = new class08388[3];

    private FluidRenderHandlerRegistryImpl$WaterRenderHandler() {
    }

    public void updateSprites(class08388[] class08388Array, class08388 class083882) {
        this.sprites[0] = class08388Array[0];
        this.sprites[1] = class08388Array[1];
        this.sprites[2] = class083882;
    }

    public class08388[] getFluidSprites(@Nullable class07295 class072952, @Nullable class07209 class072092, class04688 class046882) {
        return this.sprites;
    }

    public int getFluidColor(@Nullable class07295 class072952, @Nullable class07209 class072092, class04688 class046882) {
        if (class072952 != null && class072092 != null) {
            return class06229.u((class07295)class072952, (class07209)class072092);
        }
        return 4159204;
    }
}

