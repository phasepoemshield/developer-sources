/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class04651
 *  minecraft.class08743
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.rendering;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import minecraft.class00891;
import minecraft.class04651;
import minecraft.class08743;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class BlockRenderLayerMapImpl {
    private static final Map<class00891, class08743> BLOCK_RENDER_LAYER_MAP = new HashMap<class00891, class08743>();
    private static final Map<class04651, class08743> FLUID_RENDER_LAYER_MAP = new HashMap<class04651, class08743>();
    private static BiConsumer<class00891, class08743> blockHandler = BLOCK_RENDER_LAYER_MAP::put;
    private static BiConsumer<class04651, class08743> fluidHandler = FLUID_RENDER_LAYER_MAP::put;

    private BlockRenderLayerMapImpl() {
    }

    public static void setup(BiConsumer<class00891, class08743> biConsumer, BiConsumer<class04651, class08743> biConsumer2) {
        BLOCK_RENDER_LAYER_MAP.forEach(biConsumer);
        FLUID_RENDER_LAYER_MAP.forEach(biConsumer2);
        blockHandler = biConsumer;
        fluidHandler = biConsumer2;
    }

    public static void putFluid(class04651 class046512, class08743 class087432) {
        Objects.requireNonNull(class046512, "fluid must not be null");
        Objects.requireNonNull(class087432, "render layer must not be null");
        fluidHandler.accept(class046512, class087432);
    }

    public static void putBlock(class00891 class008912, class08743 class087432) {
        Objects.requireNonNull(class008912, "block must not be null");
        Objects.requireNonNull(class087432, "render layer must not be null");
        blockHandler.accept(class008912, class087432);
    }
}

