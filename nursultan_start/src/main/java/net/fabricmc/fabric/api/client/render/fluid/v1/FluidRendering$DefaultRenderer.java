/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01391
 *  minecraft.class04688
 *  minecraft.class07209
 *  minecraft.class07295
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.rendering.fluid.FluidRenderingImpl
 */
package net.fabricmc.fabric.api.client.render.fluid.v1;

import minecraft.class00500;
import minecraft.class01391;
import minecraft.class04688;
import minecraft.class07209;
import minecraft.class07295;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.fabricmc.fabric.impl.client.rendering.fluid.FluidRenderingImpl;

@Environment(value=EnvType.CLIENT)
public interface FluidRendering$DefaultRenderer {
    default public void render(FluidRenderHandler fluidRenderHandler, class07295 class072952, class07209 class072092, class01391 class013912, class00500 class005002, class04688 class046882) {
        FluidRenderingImpl.renderVanillaDefault((FluidRenderHandler)fluidRenderHandler, (class07295)class072952, (class07209)class072092, (class01391)class013912, (class00500)class005002, (class04688)class046882);
    }
}

