/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMaps
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  java.lang.MatchException
 *  minecraft.class00719
 *  minecraft.class01894
 *  minecraft.class03386
 *  minecraft.class06202
 *  minecraft.class08626
 *  minecraft.class08627
 *  minecraft.class08918
 *  minecraft.class08923
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.gl.GlResource
 *  net.irisshaders.iris.gl.texture.GlTexture
 *  net.irisshaders.iris.gl.texture.TextureAccess
 *  net.irisshaders.iris.gl.texture.TextureType
 *  net.irisshaders.iris.gl.texture.TextureWrapper
 *  net.irisshaders.iris.mixin.GlStateManagerAccessor
 *  net.irisshaders.iris.mixin.LightTextureAccessor
 *  net.irisshaders.iris.pbr.format.TextureFormat
 *  net.irisshaders.iris.pbr.format.TextureFormatLoader
 *  net.irisshaders.iris.pbr.texture.PBRAtlasTexture
 *  net.irisshaders.iris.pbr.texture.PBRTextureHolder
 *  net.irisshaders.iris.pbr.texture.PBRTextureManager
 *  net.irisshaders.iris.pbr.texture.PBRType
 *  net.irisshaders.iris.shaderpack.properties.PackDirectives
 *  net.irisshaders.iris.shaderpack.texture.CustomTextureData
 *  net.irisshaders.iris.shaderpack.texture.CustomTextureData$LightmapMarker
 *  net.irisshaders.iris.shaderpack.texture.CustomTextureData$PngData
 *  net.irisshaders.iris.shaderpack.texture.CustomTextureData$RawData1D
 *  net.irisshaders.iris.shaderpack.texture.CustomTextureData$RawData2D
 *  net.irisshaders.iris.shaderpack.texture.CustomTextureData$RawData3D
 *  net.irisshaders.iris.shaderpack.texture.CustomTextureData$RawDataRect
 *  net.irisshaders.iris.shaderpack.texture.CustomTextureData$ResourceData
 *  net.irisshaders.iris.shaderpack.texture.TextureStage
 *  net.irisshaders.iris.targets.backed.NativeImageBackedCustomTexture
 *  net.irisshaders.iris.targets.backed.NativeImageBackedNoiseTexture
 *  org.apache.commons.io.FilenameUtils
 */
package net.irisshaders.iris.pipeline;

import com.mojang.blaze3d.opengl.GlStateManager;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import minecraft.class00719;
import minecraft.class01894;
import minecraft.class03386;
import minecraft.class06202;
import minecraft.class08626;
import minecraft.class08627;
import minecraft.class08918;
import minecraft.class08923;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.GlResource;
import net.irisshaders.iris.gl.texture.GlTexture;
import net.irisshaders.iris.gl.texture.TextureAccess;
import net.irisshaders.iris.gl.texture.TextureType;
import net.irisshaders.iris.gl.texture.TextureWrapper;
import net.irisshaders.iris.mixin.GlStateManagerAccessor;
import net.irisshaders.iris.mixin.LightTextureAccessor;
import net.irisshaders.iris.pbr.format.TextureFormat;
import net.irisshaders.iris.pbr.format.TextureFormatLoader;
import net.irisshaders.iris.pbr.texture.PBRAtlasTexture;
import net.irisshaders.iris.pbr.texture.PBRTextureHolder;
import net.irisshaders.iris.pbr.texture.PBRTextureManager;
import net.irisshaders.iris.pbr.texture.PBRType;
import net.irisshaders.iris.shaderpack.properties.PackDirectives;
import net.irisshaders.iris.shaderpack.texture.CustomTextureData;
import net.irisshaders.iris.shaderpack.texture.TextureStage;
import net.irisshaders.iris.targets.backed.NativeImageBackedCustomTexture;
import net.irisshaders.iris.targets.backed.NativeImageBackedNoiseTexture;
import org.apache.commons.io.FilenameUtils;

public class CustomTextureManager {
    private final EnumMap<TextureStage, Object2ObjectMap<String, TextureAccess>> customTextureIdMap = new EnumMap(TextureStage.class);
    private final Object2ObjectMap<String, TextureAccess> irisCustomTextures = new Object2ObjectOpenHashMap();
    private final TextureAccess noise;
    private final List<class08918> ownedTextures = new ArrayList<class08918>();
    private final List<GlTexture> ownedRawTextures = new ArrayList<GlTexture>();

    public CustomTextureManager(PackDirectives packDirectives, EnumMap<TextureStage, Object2ObjectMap<String, CustomTextureData>> enumMap, Object2ObjectMap<String, CustomTextureData> object2ObjectMap2, CustomTextureData customTextureData2) {
        enumMap.forEach((textureStage, object2ObjectMap) -> {
            Object2ObjectOpenHashMap object2ObjectOpenHashMap = new Object2ObjectOpenHashMap();
            object2ObjectMap.forEach((arg_0, arg_1) -> this.lambda$new$0((Object2ObjectMap)object2ObjectOpenHashMap, textureStage, arg_0, arg_1));
            this.customTextureIdMap.put((TextureStage)textureStage, (Object2ObjectMap<String, TextureAccess>)object2ObjectOpenHashMap);
        });
        object2ObjectMap2.forEach((string, customTextureData) -> {
            try {
                this.irisCustomTextures.put(string, (Object)this.createCustomTexture((CustomTextureData)customTextureData));
            }
            catch (IOException iOException) {
                Iris.logger.error("Unable to parse the image data for the custom texture on sampler " + string, (Throwable)iOException);
            }
        });
        if (customTextureData2 == null) {
            int n = packDirectives.getNoiseTextureResolution();
            NativeImageBackedNoiseTexture nativeImageBackedNoiseTexture = new NativeImageBackedNoiseTexture(n);
            this.ownedTextures.add((class08918)nativeImageBackedNoiseTexture);
            this.noise = nativeImageBackedNoiseTexture;
        } else {
            try {
                this.noise = this.createCustomTexture(customTextureData2);
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
    }

    public void destroy() {
        this.ownedTextures.forEach(class08918::close);
        this.ownedRawTextures.forEach(GlResource::destroy);
    }

    private /* synthetic */ void lambda$new$0(Object2ObjectMap object2ObjectMap, TextureStage textureStage, String string, CustomTextureData customTextureData) {
        try {
            object2ObjectMap.put((Object)string, (Object)this.createCustomTexture(customTextureData));
        }
        catch (IOException | class00719 throwable) {
            Iris.logger.error("Unable to parse the image data for the custom texture on stage " + String.valueOf(textureStage) + ", sampler " + string, throwable);
        }
    }

    public TextureAccess getNoiseTexture() {
        return this.noise;
    }

    public Object2ObjectMap<String, TextureAccess> getIrisCustomTextures() {
        return this.irisCustomTextures;
    }

    private TextureAccess createCustomTexture(CustomTextureData customTextureData) throws IOException, class00719 {
        if (customTextureData instanceof CustomTextureData.PngData) {
            NativeImageBackedCustomTexture nativeImageBackedCustomTexture = new NativeImageBackedCustomTexture((CustomTextureData.PngData)customTextureData);
            this.ownedTextures.add((class08918)nativeImageBackedCustomTexture);
            return nativeImageBackedCustomTexture;
        }
        if (customTextureData instanceof CustomTextureData.LightmapMarker) {
            return new TextureWrapper(() -> ((LightTextureAccessor)((class03386)class06202.Nq().i_5).T()).getLightTexture().iris$getGlId(), TextureType.TEXTURE_2D);
        }
        if (customTextureData instanceof CustomTextureData.RawData1D) {
            CustomTextureData.RawData1D rawData1D = (CustomTextureData.RawData1D)customTextureData;
            GlTexture glTexture = new GlTexture(TextureType.TEXTURE_1D, rawData1D.getSizeX(), 0, 0, rawData1D.getInternalFormat().getGlFormat(), rawData1D.getPixelFormat().getGlFormat(), rawData1D.getPixelType().getGlFormat(), rawData1D.getContent(), rawData1D.getFilteringData());
            this.ownedRawTextures.add(glTexture);
            return glTexture;
        }
        if (customTextureData instanceof CustomTextureData.RawDataRect) {
            CustomTextureData.RawDataRect rawDataRect = (CustomTextureData.RawDataRect)customTextureData;
            GlTexture glTexture = new GlTexture(TextureType.TEXTURE_RECTANGLE, rawDataRect.getSizeX(), rawDataRect.getSizeY(), 0, rawDataRect.getInternalFormat().getGlFormat(), rawDataRect.getPixelFormat().getGlFormat(), rawDataRect.getPixelType().getGlFormat(), rawDataRect.getContent(), rawDataRect.getFilteringData());
            this.ownedRawTextures.add(glTexture);
            return glTexture;
        }
        if (customTextureData instanceof CustomTextureData.RawData2D) {
            CustomTextureData.RawData2D rawData2D = (CustomTextureData.RawData2D)customTextureData;
            GlTexture glTexture = new GlTexture(TextureType.TEXTURE_2D, rawData2D.getSizeX(), rawData2D.getSizeY(), 0, rawData2D.getInternalFormat().getGlFormat(), rawData2D.getPixelFormat().getGlFormat(), rawData2D.getPixelType().getGlFormat(), rawData2D.getContent(), rawData2D.getFilteringData());
            this.ownedRawTextures.add(glTexture);
            return glTexture;
        }
        if (customTextureData instanceof CustomTextureData.RawData3D) {
            CustomTextureData.RawData3D rawData3D = (CustomTextureData.RawData3D)customTextureData;
            GlTexture glTexture = new GlTexture(TextureType.TEXTURE_3D, rawData3D.getSizeX(), rawData3D.getSizeY(), rawData3D.getSizeZ(), rawData3D.getInternalFormat().getGlFormat(), rawData3D.getPixelFormat().getGlFormat(), rawData3D.getPixelType().getGlFormat(), rawData3D.getContent(), rawData3D.getFilteringData());
            this.ownedRawTextures.add(glTexture);
            return glTexture;
        }
        if (customTextureData instanceof CustomTextureData.ResourceData) {
            CustomTextureData.ResourceData resourceData = (CustomTextureData.ResourceData)customTextureData;
            String string = resourceData.getNamespace();
            Object object = resourceData.getLocation();
            int n = FilenameUtils.indexOfExtension((String)object);
            Object object2 = n != -1 ? ((String)object).substring(0, n) : object;
            PBRType pBRType = PBRType.fromFileLocation((String)object2);
            class08627 class086272 = class06202.Nq().NO();
            if (pBRType == null) {
                class01894 class018942 = class01894.N((String)string, (String)object);
                return new TextureWrapper(() -> {
                    class08918 class089182 = class086272.y(class018942);
                    if (class089182 instanceof class08626 || class089182 instanceof PBRAtlasTexture) {
                        int n = GlStateManagerAccessor.getActiveTexture();
                        int n2 = GlStateManagerAccessor.getTEXTURES()[n].field_5167;
                        GlStateManager._activeTexture((int)(33984 + n));
                        GlStateManager._bindTexture((int)n2);
                    }
                    return class089182 != null ? class089182.method_68004().iris$getGlId() : class086272.y(class08923.L()).method_68004().iris$getGlId();
                }, TextureType.TEXTURE_2D);
            }
            object = ((String)object).substring(0, n - pBRType.getSuffix().length()) + ((String)object).substring(n);
            class01894 class018943 = class01894.N((String)string, (String)object);
            return new TextureWrapper(() -> {
                class08918 class089182 = class086272.y(class018943);
                if (class089182 != null) {
                    int n;
                    if (class089182 instanceof class08626 || class089182 instanceof PBRAtlasTexture) {
                        n = GlStateManagerAccessor.getActiveTexture();
                        int n2 = GlStateManagerAccessor.getTEXTURES()[n].field_5167;
                        GlStateManager._activeTexture((int)(33984 + n));
                        GlStateManager._bindTexture((int)n2);
                    }
                    n = class089182.method_68004().iris$getGlId();
                    PBRTextureHolder pBRTextureHolder = PBRTextureManager.INSTANCE.getOrLoadHolder(n);
                    class08918 class089183 = switch (pBRType) {
                        default -> throw new MatchException(null, null);
                        case PBRType.NORMAL -> pBRTextureHolder.normalTexture();
                        case PBRType.SPECULAR -> pBRTextureHolder.specularTexture();
                    };
                    TextureFormat textureFormat = TextureFormatLoader.getFormat();
                    if (textureFormat != null) {
                        int n3 = GlStateManagerAccessor.getTEXTURES()[GlStateManagerAccessor.getActiveTexture()].field_5167;
                        GlStateManager._bindTexture((int)class089183.method_68004().iris$getGlId());
                        textureFormat.setupTextureParameters(pBRType, class089183);
                        GlStateManager._bindTexture((int)n3);
                    }
                    return class089183.method_68004().iris$getGlId();
                }
                return class086272.y(class08923.L()).method_68004().iris$getGlId();
            }, TextureType.TEXTURE_2D);
        }
        throw new IllegalArgumentException("Don't know texture type!");
    }

    public Object2ObjectMap<String, TextureAccess> getCustomTextureIdMap(TextureStage textureStage) {
        return this.customTextureIdMap.getOrDefault(textureStage, (Object2ObjectMap<String, TextureAccess>)Object2ObjectMaps.emptyMap());
    }

    public EnumMap<TextureStage, Object2ObjectMap<String, TextureAccess>> getCustomTextureIdMap() {
        return this.customTextureIdMap;
    }
}

