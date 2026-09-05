/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01391
 *  minecraft.class03760
 *  minecraft.class04688
 *  minecraft.class07209
 *  minecraft.class07295
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler
 *  net.fabricmc.fabric.api.client.render.fluid.v1.FluidRendering$DefaultRenderer
 */
package net.fabricmc.fabric.impl.client.rendering.fluid;

import minecraft.class00500;
import minecraft.class01391;
import minecraft.class03760;
import minecraft.class04688;
import minecraft.class07209;
import minecraft.class07295;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRendering;
import net.fabricmc.fabric.impl.client.rendering.fluid.FluidRenderHandlerInfo;

@Environment(value=EnvType.CLIENT)
public class FluidRenderingImpl {
    private static final ThreadLocal<FluidRendering.DefaultRenderer> CURRENT_DEFAULT_RENDERER = new ThreadLocal();
    private static final ThreadLocal<FluidRenderHandlerInfo> CURRENT_INFO = ThreadLocal.withInitial(FluidRenderHandlerInfo::new);
    private static class03760 vanillaRenderer;

    public static void setVanillaRenderer(class03760 class037602) {
        vanillaRenderer = class037602;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void render(FluidRenderHandler fluidRenderHandler, class07295 class072952, class07209 class072092, class01391 class013912, class00500 class005002, class04688 class046882, FluidRendering.DefaultRenderer defaultRenderer) {
        CURRENT_DEFAULT_RENDERER.set(defaultRenderer);
        try {
            fluidRenderHandler.renderFluid(class072092, class072952, class013912, class005002, class046882);
        }
        finally {
            CURRENT_DEFAULT_RENDERER.remove();
        }
    }

    public static FluidRenderHandlerInfo getCurrentInfo() {
        return CURRENT_INFO.get();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void renderVanillaDefault(FluidRenderHandler fluidRenderHandler, class07295 class072952, class07209 class072092, class01391 class013912, class00500 class005002, class04688 class046882) {
        FluidRenderHandlerInfo fluidRenderHandlerInfo = CURRENT_INFO.get();
        fluidRenderHandlerInfo.setup(fluidRenderHandler, class072952, class072092, class046882);
        try {
            vanillaRenderer.N(class072952, class072092, class013912, class005002, class046882);
        }
        finally {
            fluidRenderHandlerInfo.clear();
        }
    }

    public static void renderDefault(FluidRenderHandler fluidRenderHandler, class07295 class072952, class07209 class072092, class01391 class013912, class00500 class005002, class04688 class046882) {
        FluidRendering.DefaultRenderer defaultRenderer = CURRENT_DEFAULT_RENDERER.get();
        if (defaultRenderer != null) {
            defaultRenderer.render(fluidRenderHandler, class072952, class072092, class013912, class005002, class046882);
        } else {
            FluidRenderingImpl.renderVanillaDefault(fluidRenderHandler, class072952, class072092, class013912, class005002, class046882);
        }
    }
}

