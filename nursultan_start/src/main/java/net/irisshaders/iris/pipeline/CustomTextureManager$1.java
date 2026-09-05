/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.pbr.texture.PBRType
 */
package net.irisshaders.iris.pipeline;

import net.irisshaders.iris.pbr.texture.PBRType;

class CustomTextureManager$1 {
    static final /* synthetic */ int[] $SwitchMap$net$irisshaders$iris$pbr$texture$PBRType;

    static {
        $SwitchMap$net$irisshaders$iris$pbr$texture$PBRType = new int[PBRType.values().length];
        try {
            CustomTextureManager$1.$SwitchMap$net$irisshaders$iris$pbr$texture$PBRType[PBRType.NORMAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CustomTextureManager$1.$SwitchMap$net$irisshaders$iris$pbr$texture$PBRType[PBRType.SPECULAR.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

