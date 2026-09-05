/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class06497
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class08388
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler
 *  net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.transfer.v1.client.fluid;

import java.util.List;
import minecraft.class00392;
import minecraft.class06497;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class08388;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public interface FluidVariantRenderHandler {
    default public int getColor(FluidVariant fluidVariant, @Nullable class07295 class072952, @Nullable class07209 class072092) {
        FluidRenderHandler fluidRenderHandler = FluidRenderHandlerRegistry.INSTANCE.get(fluidVariant.getFluid());
        if (fluidRenderHandler != null) {
            return fluidRenderHandler.getFluidColor(class072952, class072092, fluidVariant.getFluid().M()) | 0xFF000000;
        }
        return -1;
    }

    default public void appendTooltip(FluidVariant fluidVariant, List<class00392> list, class06497 class064972) {
    }

    default public @Nullable class08388[] getSprites(FluidVariant fluidVariant) {
        FluidRenderHandler fluidRenderHandler = FluidRenderHandlerRegistry.INSTANCE.get(fluidVariant.getFluid());
        if (fluidRenderHandler != null) {
            return fluidRenderHandler.getFluidSprites(null, null, fluidVariant.getFluid().M());
        }
        return null;
    }
}

