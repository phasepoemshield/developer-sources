/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap
 *  minecraft.class00741
 *  minecraft.class00891
 *  minecraft.class03760
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class06202
 *  minecraft.class07131
 *  minecraft.class08388
 *  minecraft.class08589
 *  minecraft.class08626
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler
 *  net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.client.rendering.fluid;

import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import minecraft.class00741;
import minecraft.class00891;
import minecraft.class03760;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class06202;
import minecraft.class07131;
import minecraft.class08388;
import minecraft.class08589;
import minecraft.class08626;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.impl.client.rendering.fluid.FluidRenderHandlerRegistryImpl$LavaRenderHandler;
import net.fabricmc.fabric.impl.client.rendering.fluid.FluidRenderHandlerRegistryImpl$WaterRenderHandler;
import net.fabricmc.fabric.impl.client.rendering.fluid.FluidRenderingImpl;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public class FluidRenderHandlerRegistryImpl
implements FluidRenderHandlerRegistry {
    private final Map<class04651, FluidRenderHandler> handlers = new IdentityHashMap<class04651, FluidRenderHandler>();
    private final Map<class04651, FluidRenderHandler> modHandlers = new IdentityHashMap<class04651, FluidRenderHandler>();
    private final Object2BooleanMap<class00891> transparencyForOverlay = new Object2BooleanOpenHashMap();

    public FluidRenderHandlerRegistryImpl() {
        this.handlers.put((class04651)class04684.L, FluidRenderHandlerRegistryImpl$WaterRenderHandler.INSTANCE);
        this.handlers.put((class04651)class04684.y, FluidRenderHandlerRegistryImpl$WaterRenderHandler.INSTANCE);
        this.handlers.put((class04651)class04684.i, FluidRenderHandlerRegistryImpl$LavaRenderHandler.INSTANCE);
        this.handlers.put((class04651)class04684.u, FluidRenderHandlerRegistryImpl$LavaRenderHandler.INSTANCE);
    }

    public @Nullable FluidRenderHandler get(class04651 class046512) {
        return this.handlers.get(class046512);
    }

    public void register(class04651 class046512, FluidRenderHandler fluidRenderHandler) {
        this.handlers.put(class046512, fluidRenderHandler);
        this.modHandlers.put(class046512, fluidRenderHandler);
    }

    public @Nullable FluidRenderHandler getOverride(class04651 class046512) {
        return this.modHandlers.get(class046512);
    }

    public void setBlockTransparency(class00891 class008912, boolean bl) {
        this.transparencyForOverlay.put((Object)class008912, bl);
    }

    public boolean isBlockTransparent(class00891 class008912) {
        return this.transparencyForOverlay.getOrDefault((Object)class008912, class008912 instanceof class00741 || class008912 instanceof class07131);
    }

    public void onFluidRendererReload(class03760 class037602, class08388[] class08388Array, class08388[] class08388Array2, class08388 class083882) {
        FluidRenderingImpl.setVanillaRenderer(class037602);
        FluidRenderHandlerRegistryImpl$WaterRenderHandler.INSTANCE.updateSprites(class08388Array, class083882);
        FluidRenderHandlerRegistryImpl$LavaRenderHandler.INSTANCE.updateSprites(class08388Array2);
        class08626 class086262 = class06202.Nq().yW().N(class08589.u);
        for (FluidRenderHandler fluidRenderHandler : this.handlers.values()) {
            fluidRenderHandler.reloadTextures(class086262);
        }
    }
}

