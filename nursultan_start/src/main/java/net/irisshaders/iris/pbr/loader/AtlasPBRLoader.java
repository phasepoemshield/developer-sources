/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01079
 *  minecraft.class01089
 *  minecraft.class01894
 *  minecraft.class02002
 *  minecraft.class03643
 *  minecraft.class04995
 *  minecraft.class08280
 *  minecraft.class08388
 *  minecraft.class08393
 *  minecraft.class08626
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.mixin.texture.AnimationMetadataSectionAccessor
 *  net.irisshaders.iris.mixin.texture.TextureAtlasAccessor
 *  net.irisshaders.iris.pbr.util.ImageManipulationUtil
 */
package net.irisshaders.iris.pbr.loader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;
import minecraft.class01079;
import minecraft.class01089;
import minecraft.class01894;
import minecraft.class02002;
import minecraft.class03643;
import minecraft.class04995;
import minecraft.class08280;
import minecraft.class08388;
import minecraft.class08393;
import minecraft.class08626;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.mixin.texture.AnimationMetadataSectionAccessor;
import net.irisshaders.iris.mixin.texture.TextureAtlasAccessor;
import net.irisshaders.iris.pbr.loader.AtlasPBRLoader$PBRSpriteContents;
import net.irisshaders.iris.pbr.loader.AtlasPBRLoader$PBRTextureAtlasSprite;
import net.irisshaders.iris.pbr.loader.PBRTextureLoader;
import net.irisshaders.iris.pbr.loader.PBRTextureLoader$PBRTextureConsumer;
import net.irisshaders.iris.pbr.mipmap.ChannelMipmapGenerator;
import net.irisshaders.iris.pbr.mipmap.LinearBlendFunction;
import net.irisshaders.iris.pbr.texture.PBRAtlasTexture;
import net.irisshaders.iris.pbr.texture.PBRSpriteHolder;
import net.irisshaders.iris.pbr.texture.PBRType;
import net.irisshaders.iris.pbr.texture.SpriteContentsExtension;
import net.irisshaders.iris.pbr.util.ImageManipulationUtil;

public class AtlasPBRLoader
implements PBRTextureLoader<class08626> {
    public static final ChannelMipmapGenerator LINEAR_MIPMAP_GENERATOR = new ChannelMipmapGenerator(LinearBlendFunction.INSTANCE, LinearBlendFunction.INSTANCE, LinearBlendFunction.INSTANCE, LinearBlendFunction.INSTANCE);

    @Override
    public void load(class08626 class086262, class01089 class010892, PBRTextureLoader$PBRTextureConsumer pBRTextureLoader$PBRTextureConsumer) {
        TextureAtlasAccessor textureAtlasAccessor = (TextureAtlasAccessor)class086262;
        int n = textureAtlasAccessor.callGetWidth();
        int n2 = textureAtlasAccessor.callGetHeight();
        int n3 = textureAtlasAccessor.getMaxLevel();
        PBRAtlasTexture pBRAtlasTexture = null;
        PBRAtlasTexture pBRAtlasTexture2 = null;
        for (class08388 class083882 : ((TextureAtlasAccessor)class086262).getTexturesByName().values()) {
            PBRSpriteHolder pBRSpriteHolder;
            AtlasPBRLoader$PBRTextureAtlasSprite atlasPBRLoader$PBRTextureAtlasSprite = this.createPBRSprite(class083882, class010892, class086262, n, n2, n3, PBRType.NORMAL);
            AtlasPBRLoader$PBRTextureAtlasSprite atlasPBRLoader$PBRTextureAtlasSprite2 = this.createPBRSprite(class083882, class010892, class086262, n, n2, n3, PBRType.SPECULAR);
            if (atlasPBRLoader$PBRTextureAtlasSprite != null) {
                if (pBRAtlasTexture == null) {
                    pBRAtlasTexture = new PBRAtlasTexture(class086262, PBRType.NORMAL);
                }
                pBRAtlasTexture.addSprite(atlasPBRLoader$PBRTextureAtlasSprite);
                pBRSpriteHolder = ((SpriteContentsExtension)class083882.method_45851()).getOrCreatePBRHolder();
                pBRSpriteHolder.setNormalSprite(atlasPBRLoader$PBRTextureAtlasSprite);
            }
            if (atlasPBRLoader$PBRTextureAtlasSprite2 == null) continue;
            if (pBRAtlasTexture2 == null) {
                pBRAtlasTexture2 = new PBRAtlasTexture(class086262, PBRType.SPECULAR);
            }
            pBRAtlasTexture2.addSprite(atlasPBRLoader$PBRTextureAtlasSprite2);
            pBRSpriteHolder = ((SpriteContentsExtension)class083882.method_45851()).getOrCreatePBRHolder();
            pBRSpriteHolder.setSpecularSprite(atlasPBRLoader$PBRTextureAtlasSprite2);
        }
        if (pBRAtlasTexture != null && pBRAtlasTexture.tryUpload(n, n2, n3)) {
            pBRTextureLoader$PBRTextureConsumer.acceptNormalTexture(pBRAtlasTexture);
        }
        if (pBRAtlasTexture2 != null && pBRAtlasTexture2.tryUpload(n, n2, n3)) {
            pBRTextureLoader$PBRTextureConsumer.acceptSpecularTexture(pBRAtlasTexture2);
        }
    }

    protected AtlasPBRLoader$PBRTextureAtlasSprite createPBRSprite(class08388 class083882, class01089 class010892, class08626 class086262, int n, int n2, int n3, PBRType pBRType) {
        class08280 class082802;
        class03643 class036432;
        class01894 class018942 = class083882.method_45851().method_45816();
        class01894 class018943 = this.getPBRImageLocation(class018942, pBRType);
        Optional optional = class010892.method_14486(class018943);
        if (optional.isEmpty()) {
            return null;
        }
        class01079 class010792 = (class01079)optional.get();
        try {
            class036432 = class010792.method_14481();
        }
        catch (Exception exception) {
            Iris.logger.error("Unable to parse metadata from {}", new Object[]{class018943, exception});
            return null;
        }
        try (InputStream inputStream = class010792.method_14482();){
            class082802 = class08280.N((InputStream)inputStream);
        }
        catch (IOException iOException) {
            Iris.logger.error("Using missing texture, unable to load {}", new Object[]{class018943, iOException});
            return null;
        }
        int n4 = class082802.N();
        int n5 = class082802.y();
        class08393 class083932 = class036432.N(class08393.y).orElse(null);
        class02002 class020022 = class083932 != null ? class083932.N(n4, n5) : new class02002(n4, n5);
        int n6 = class020022.N();
        int n7 = class020022.y();
        if (!class04995.u((int)n4, (int)n6) || !class04995.u((int)n5, (int)n7)) {
            Iris.logger.error("Image {} size {},{} is not multiple of frame size {},{}", new Object[]{class018943, n4, n5, n6, n7});
            class082802.close();
            return null;
        }
        int n8 = class083882.method_45851().method_45807();
        int n9 = class083882.method_45851().method_45815();
        if (n6 != n8 || n7 != n9) {
            try {
                int n10 = n4 / n6 * n8;
                int n11 = n5 / n7 * n9;
                class08280 class082803 = n10 % n4 == 0 && n11 % n5 == 0 ? ImageManipulationUtil.scaleNearestNeighbor((class08280)class082802, (int)n10, (int)n11) : ImageManipulationUtil.scaleBilinear((class08280)class082802, (int)n10, (int)n11);
                class082802.close();
                class082802 = class082803;
                n6 = n8;
                n7 = n9;
                if (class083932 != null) {
                    AnimationMetadataSectionAccessor animationMetadataSectionAccessor = (AnimationMetadataSectionAccessor)class083932;
                    int n12 = animationMetadataSectionAccessor.getFrameWidth().orElse(-1);
                    int n13 = animationMetadataSectionAccessor.getFrameHeight().orElse(-1);
                    if (n12 != -1) {
                        animationMetadataSectionAccessor.setFrameWidth(Optional.of(n6));
                    }
                    if (n13 != -1) {
                        animationMetadataSectionAccessor.setFrameHeight(Optional.of(n7));
                    }
                }
            }
            catch (Exception exception) {
                Iris.logger.error("Something bad happened trying to load PBR texture " + class018942.N() + pBRType.getSuffix() + "!", (Throwable)exception);
                throw exception;
            }
        }
        class01894 class018944 = class01894.N((String)class018942.y(), (String)(class018942.N() + pBRType.getSuffix()));
        AtlasPBRLoader$PBRSpriteContents atlasPBRLoader$PBRSpriteContents = new AtlasPBRLoader$PBRSpriteContents(class018944, new class02002(n6, n7), class082802, class036432, pBRType);
        atlasPBRLoader$PBRSpriteContents.method_45808(n3);
        return new AtlasPBRLoader$PBRTextureAtlasSprite(class018944, atlasPBRLoader$PBRSpriteContents, n, n2, class083882.method_35806(), class083882.method_35807(), class083882);
    }

    protected class01894 getPBRImageLocation(class01894 class018942, PBRType pBRType) {
        String string = pBRType.appendSuffix(class018942.N());
        if (string.startsWith("optifine/cit/")) {
            return class01894.N((String)class018942.y(), (String)(string + ".png"));
        }
        return class01894.N((String)class018942.y(), (String)("textures/" + string + ".png"));
    }
}

