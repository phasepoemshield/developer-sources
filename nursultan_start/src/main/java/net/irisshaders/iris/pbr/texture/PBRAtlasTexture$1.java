/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.pbr.texture;

import net.irisshaders.iris.pbr.texture.PBRType;

class PBRAtlasTexture$1 {
    static final /* synthetic */ int[] $SwitchMap$net$irisshaders$iris$pbr$texture$PBRType;

    static {
        $SwitchMap$net$irisshaders$iris$pbr$texture$PBRType = new int[PBRType.values().length];
        try {
            PBRAtlasTexture$1.$SwitchMap$net$irisshaders$iris$pbr$texture$PBRType[PBRType.NORMAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            PBRAtlasTexture$1.$SwitchMap$net$irisshaders$iris$pbr$texture$PBRType[PBRType.SPECULAR.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

