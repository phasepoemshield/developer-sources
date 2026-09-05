/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.shaderpack.materialmap;

import net.irisshaders.iris.shaderpack.materialmap.BlockRenderType;

class BlockMaterialMapping$1 {
    static final /* synthetic */ int[] $SwitchMap$net$irisshaders$iris$shaderpack$materialmap$BlockRenderType;

    static {
        $SwitchMap$net$irisshaders$iris$shaderpack$materialmap$BlockRenderType = new int[BlockRenderType.values().length];
        try {
            BlockMaterialMapping$1.$SwitchMap$net$irisshaders$iris$shaderpack$materialmap$BlockRenderType[BlockRenderType.SOLID.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            BlockMaterialMapping$1.$SwitchMap$net$irisshaders$iris$shaderpack$materialmap$BlockRenderType[BlockRenderType.CUTOUT.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            BlockMaterialMapping$1.$SwitchMap$net$irisshaders$iris$shaderpack$materialmap$BlockRenderType[BlockRenderType.CUTOUT_MIPPED.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            BlockMaterialMapping$1.$SwitchMap$net$irisshaders$iris$shaderpack$materialmap$BlockRenderType[BlockRenderType.TRANSLUCENT.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

