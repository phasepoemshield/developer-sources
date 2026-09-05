/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class01991
 *  minecraft.class02002
 *  minecraft.class03643
 *  minecraft.class08280
 *  minecraft.class08393
 *  minecraft.class08500
 */
package net.irisshaders.iris.pbr.loader;

import java.util.List;
import minecraft.class01894;
import minecraft.class01991;
import minecraft.class02002;
import minecraft.class03643;
import minecraft.class08280;
import minecraft.class08393;
import minecraft.class08500;
import net.irisshaders.iris.pbr.format.TextureFormat;
import net.irisshaders.iris.pbr.format.TextureFormatLoader;
import net.irisshaders.iris.pbr.loader.AtlasPBRLoader;
import net.irisshaders.iris.pbr.mipmap.CustomMipmapGenerator;
import net.irisshaders.iris.pbr.mipmap.CustomMipmapGenerator$Provider;
import net.irisshaders.iris.pbr.texture.PBRType;

public class AtlasPBRLoader$PBRSpriteContents
extends class01991
implements CustomMipmapGenerator$Provider {
    protected final PBRType pbrType;

    public AtlasPBRLoader$PBRSpriteContents(class01894 class018942, class02002 class020022, class08280 class082802, class03643 class036432, PBRType pBRType) {
        super(class018942, class020022, class082802, class036432.N(class08393.y), List.of(), class036432.N(class08500.i));
        this.pbrType = pBRType;
    }

    @Override
    public CustomMipmapGenerator getMipmapGenerator() {
        CustomMipmapGenerator customMipmapGenerator;
        TextureFormat textureFormat = TextureFormatLoader.getFormat();
        if (textureFormat != null && (customMipmapGenerator = textureFormat.getMipmapGenerator(this.pbrType)) != null) {
            return customMipmapGenerator;
        }
        return AtlasPBRLoader.LINEAR_MIPMAP_GENERATOR;
    }
}

