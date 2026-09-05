/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08743
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.renderer.v1.render;

import minecraft.class08743;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
class RenderLayerHelper$1 {
    static final /* synthetic */ int[] $SwitchMap$net$minecraft$client$renderer$chunk$ChunkSectionLayer;

    static {
        $SwitchMap$net$minecraft$client$renderer$chunk$ChunkSectionLayer = new int[class08743.values().length];
        try {
            RenderLayerHelper$1.$SwitchMap$net$minecraft$client$renderer$chunk$ChunkSectionLayer[class08743.field_60923.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            RenderLayerHelper$1.$SwitchMap$net$minecraft$client$renderer$chunk$ChunkSectionLayer[class08743.field_60925.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            RenderLayerHelper$1.$SwitchMap$net$minecraft$client$renderer$chunk$ChunkSectionLayer[class08743.field_60926.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            RenderLayerHelper$1.$SwitchMap$net$minecraft$client$renderer$chunk$ChunkSectionLayer[class08743.field_60927.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

