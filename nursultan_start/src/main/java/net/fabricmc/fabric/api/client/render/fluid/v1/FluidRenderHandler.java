/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01391
 *  minecraft.class04688
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class08388
 *  minecraft.class08626
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.rendering.fluid.FluidRenderingImpl
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.client.render.fluid.v1;

import minecraft.class00500;
import minecraft.class01391;
import minecraft.class04688;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class08388;
import minecraft.class08626;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.fluid.FluidRenderingImpl;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public interface FluidRenderHandler {
    public class08388[] getFluidSprites(@Nullable class07295 var1, @Nullable class07209 var2, class04688 var3);

    default public int getFluidColor(@Nullable class07295 class072952, @Nullable class07209 class072092, class04688 class046882) {
        return -1;
    }

    default public void renderFluid(class07209 class072092, class07295 class072952, class01391 class013912, class00500 class005002, class04688 class046882) {
        FluidRenderingImpl.renderDefault((FluidRenderHandler)this, (class07295)class072952, (class07209)class072092, (class01391)class013912, (class00500)class005002, (class04688)class046882);
    }

    default public void reloadTextures(class08626 class086262) {
    }
}

