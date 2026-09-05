/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class04651
 *  minecraft.class08743
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.rendering.BlockRenderLayerMapImpl
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import minecraft.class00891;
import minecraft.class04651;
import minecraft.class08743;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.BlockRenderLayerMapImpl;

@Environment(value=EnvType.CLIENT)
public final class BlockRenderLayerMap {
    private BlockRenderLayerMap() {
    }

    public static void putFluid(class04651 class046512, class08743 class087432) {
        BlockRenderLayerMapImpl.putFluid((class04651)class046512, (class08743)class087432);
    }

    public static void putFluids(class08743 class087432, class04651 ... class04651Array) {
        for (class04651 class046512 : class04651Array) {
            BlockRenderLayerMap.putFluid(class046512, class087432);
        }
    }

    public static void putBlocks(class08743 class087432, class00891 ... class00891Array) {
        for (class00891 class008912 : class00891Array) {
            BlockRenderLayerMap.putBlock(class008912, class087432);
        }
    }

    public static void putBlock(class00891 class008912, class08743 class087432) {
        BlockRenderLayerMapImpl.putBlock((class00891)class008912, (class08743)class087432);
    }
}

