/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.platform.TextureUtil
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.FilterMode
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.textures.TextureFormat
 *  minecraft.class01894
 *  minecraft.class01991
 *  minecraft.class02007
 *  minecraft.class02011
 *  minecraft.class02034
 *  minecraft.class04995
 *  minecraft.class07529
 *  minecraft.class08188
 *  minecraft.class08388
 *  minecraft.class08394
 *  minecraft.class08626
 *  minecraft.class08918
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.mixin.texture.SpriteContentsAnimatedTextureAccessor
 *  net.irisshaders.iris.mixin.texture.SpriteContentsFrameInfoAccessor
 *  net.irisshaders.iris.mixin.texture.SpriteContentsTickerAccessor
 *  net.irisshaders.iris.pbr.util.TextureManipulationUtil
 *  net.irisshaders.iris.platform.IrisPlatformHelpers
 *  org.lwjgl.system.MemoryUtil
 */
package net.irisshaders.iris.pbr.texture;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.OptionalInt;
import minecraft.class01894;
import minecraft.class01991;
import minecraft.class02007;
import minecraft.class02011;
import minecraft.class02034;
import minecraft.class04995;
import minecraft.class07529;
import minecraft.class08188;
import minecraft.class08388;
import minecraft.class08394;
import minecraft.class08626;
import minecraft.class08918;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.mixin.texture.SpriteContentsAnimatedTextureAccessor;
import net.irisshaders.iris.mixin.texture.SpriteContentsFrameInfoAccessor;
import net.irisshaders.iris.mixin.texture.SpriteContentsTickerAccessor;
import net.irisshaders.iris.pbr.loader.AtlasPBRLoader$PBRTextureAtlasSprite;
import net.irisshaders.iris.pbr.texture.PBRAtlasHolder;
import net.irisshaders.iris.pbr.texture.PBRDumpable;
import net.irisshaders.iris.pbr.texture.PBRType;
import net.irisshaders.iris.pbr.texture.TextureAtlasExtension;
import net.irisshaders.iris.pbr.util.TextureManipulationUtil;
import net.irisshaders.iris.platform.IrisPlatformHelpers;
import org.lwjgl.system.MemoryUtil;

public class PBRAtlasTexture
extends class08918
implements PBRDumpable {
    protected final class08626 atlasTexture;
    protected final PBRType type;
    protected final class01894 location;
    private List<AtlasPBRLoader$PBRTextureAtlasSprite> sprites = List.of();
    protected final Map<class01894, AtlasPBRLoader$PBRTextureAtlasSprite> texturesByNameToAdd = new HashMap<class01894, AtlasPBRLoader$PBRTextureAtlasSprite>();
    protected Map<class01894, AtlasPBRLoader$PBRTextureAtlasSprite> texturesByName = new HashMap<class01894, AtlasPBRLoader$PBRTextureAtlasSprite>();
    private List<class02011> animatedTexturesStates = List.of();
    protected int width;
    protected int height;
    private GpuBuffer spriteUbos;
    private int mipLevelCount;
    private GpuTextureView[] mipViews = new GpuTextureView[0];
    private int maxMipLevel;
    private class08388 missingSprite;

    public PBRAtlasTexture(class08626 class086262, PBRType pBRType) {
        this.atlasTexture = class086262;
        this.type = pBRType;
        this.location = class01894.N((String)class086262.i().y(), (String)(class086262.i().N().replace(".png", "") + pBRType.getSuffix() + ".png"));
    }

    public void close() {
        PBRAtlasHolder pBRAtlasHolder = ((TextureAtlasExtension)this.atlasTexture).getPBRHolder();
        if (pBRAtlasHolder != null) {
            switch (this.type) {
                case NORMAL: {
                    pBRAtlasHolder.setNormalAtlas(null);
                    break;
                }
                case SPECULAR: {
                    pBRAtlasHolder.setSpecularAtlas(null);
                }
            }
        }
        super.close();
        for (GpuTextureView gpuTextureView : this.mipViews) {
            gpuTextureView.close();
        }
        for (class02011 class020112 : this.animatedTexturesStates) {
            class020112.close();
        }
        if (this.spriteUbos != null) {
            this.spriteUbos.close();
            this.spriteUbos = null;
        }
    }

    public PBRType getType() {
        return this.type;
    }

    public void method_49712(class01894 class018942, Path path) {
        String string = class018942.L();
        TextureUtil.writeAsPNG((Path)path, (String)string, (GpuTexture)this.method_68004(), (int)this.maxMipLevel, n -> n);
        PBRAtlasTexture.dumpSpriteNames(path, string, this.texturesByName);
    }

    private void createTexture(int n, int n2, int n3) {
        Iris.logger.info("Created: {}x{}x{} {}-atlas", new Object[]{n, n2, n3, this.location});
        GpuDevice gpuDevice = RenderSystem.getDevice();
        this.close();
        this.field_56974 = gpuDevice.createTexture(() -> ((class01894)this.location).toString(), 15, TextureFormat.RGBA8, n, n2, 1, n3 + 1);
        this.field_60597 = gpuDevice.createTextureView(this.field_56974);
        this.width = n;
        this.height = n2;
        this.maxMipLevel = n3;
        this.mipLevelCount = n3 + 1;
        this.mipViews = new GpuTextureView[this.mipLevelCount];
        TextureManipulationUtil.fillWithColor((int)this.field_56974.iris$getGlId(), (int)this.maxMipLevel, (int)this.type.getDefaultValue());
        for (int i = 0; i <= this.maxMipLevel; ++i) {
            this.mipViews[i] = gpuDevice.createTextureView(this.field_56974, i, 1);
        }
    }

    public void clearTextureData() {
        this.sprites.forEach(class08388::close);
        this.sprites = List.of();
        this.animatedTexturesStates = List.of();
        this.texturesByName = Map.of();
        this.missingSprite = null;
    }

    public static void syncAnimation(class02034 class020342, class02011 class020112) {
        int n;
        SpriteContentsTickerAccessor spriteContentsTickerAccessor = (SpriteContentsTickerAccessor)class020342;
        List list = ((SpriteContentsAnimatedTextureAccessor)spriteContentsTickerAccessor.getAnimationInfo()).getFrames();
        int n2 = 0;
        for (int i = 0; i < spriteContentsTickerAccessor.getFrame(); ++i) {
            n2 += ((SpriteContentsFrameInfoAccessor)list.get(i)).getTime();
        }
        SpriteContentsTickerAccessor spriteContentsTickerAccessor2 = (SpriteContentsTickerAccessor)class020112;
        List list2 = ((SpriteContentsAnimatedTextureAccessor)spriteContentsTickerAccessor2.getAnimationInfo()).getFrames();
        int n3 = 0;
        int n4 = list2.size();
        for (class02007 class020072 : list2) {
            n3 += ((SpriteContentsFrameInfoAccessor)class020072).getTime();
        }
        n2 %= n3;
        int n5 = 0;
        while (n2 >= (n = ((SpriteContentsFrameInfoAccessor)list2.get(n5)).getTime())) {
            ++n5;
            n2 -= n;
        }
        spriteContentsTickerAccessor2.setFrame(n5);
        spriteContentsTickerAccessor2.setSubFrame(n2 + spriteContentsTickerAccessor.getSubFrame());
    }

    protected static void dumpSpriteNames(Path path, String string, Map<class01894, AtlasPBRLoader$PBRTextureAtlasSprite> map) {
        Path path2 = path.resolve(string + ".txt");
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path2, new OpenOption[0]);){
            for (Map.Entry entry : map.entrySet().stream().sorted(Map.Entry.comparingByKey()).toList()) {
                AtlasPBRLoader$PBRTextureAtlasSprite atlasPBRLoader$PBRTextureAtlasSprite = (AtlasPBRLoader$PBRTextureAtlasSprite)((Object)entry.getValue());
                bufferedWriter.write(String.format(Locale.ROOT, "%s\tx=%d\ty=%d\tw=%d\th=%d%n", entry.getKey(), atlasPBRLoader$PBRTextureAtlasSprite.method_35806(), atlasPBRLoader$PBRTextureAtlasSprite.method_35807(), atlasPBRLoader$PBRTextureAtlasSprite.method_45851().method_45807(), atlasPBRLoader$PBRTextureAtlasSprite.method_45851().method_45815()));
            }
        }
        catch (IOException iOException) {
            Iris.logger.warn("Failed to write file {}", new Object[]{path2, iOException});
        }
    }

    public boolean tryUpload(int n, int n2, int n3) {
        try {
            this.upload(n, n2, n3);
            return true;
        }
        catch (Throwable throwable) {
            if (IrisPlatformHelpers.getInstance().isDevelopmentEnvironment()) {
                throwable.printStackTrace();
            }
            return false;
        }
    }

    public void addSprite(AtlasPBRLoader$PBRTextureAtlasSprite atlasPBRLoader$PBRTextureAtlasSprite) {
        this.texturesByNameToAdd.put(atlasPBRLoader$PBRTextureAtlasSprite.method_45851().method_45816(), atlasPBRLoader$PBRTextureAtlasSprite);
    }

    public AtlasPBRLoader$PBRTextureAtlasSprite getSprite(class01894 class018942) {
        return this.texturesByName.get(class018942);
    }

    public void upload(int n, int n2, int n3) {
        this.createTexture(n, n2, n3);
        this.clearTextureData();
        this.field_63613 = RenderSystem.getSamplerCache().N(FilterMode.NEAREST);
        this.texturesByName = Map.copyOf(this.texturesByNameToAdd);
        this.missingSprite = null;
        ArrayList<AtlasPBRLoader$PBRTextureAtlasSprite> arrayList = new ArrayList<AtlasPBRLoader$PBRTextureAtlasSprite>();
        ArrayList<class02011> arrayList2 = new ArrayList<class02011>();
        int n4 = (int)this.texturesByName.values().stream().filter(class08388::method_76321).count();
        int n5 = class04995.i((int)class01991.field_64235, (int)RenderSystem.getDevice().getUniformOffsetAlignment());
        int n6 = n5 * this.mipLevelCount;
        ByteBuffer byteBuffer = MemoryUtil.memAlloc((int)(n4 * n6));
        int n7 = 0;
        for (class08388 object2 : this.texturesByName.values()) {
            if (!object2.method_76321()) continue;
            object2.method_76320(byteBuffer, n7 * n6, this.maxMipLevel, this.width, this.height, n5);
            ++n7;
        }
        Iterator<AtlasPBRLoader$PBRTextureAtlasSprite> iterator = n7 > 0 ? RenderSystem.getDevice().createBuffer(() -> String.valueOf(this.location) + " sprite UBOs", 128, byteBuffer) : null;
        n7 = 0;
        for (AtlasPBRLoader$PBRTextureAtlasSprite atlasPBRLoader$PBRTextureAtlasSprite : this.texturesByName.values()) {
            arrayList.add(atlasPBRLoader$PBRTextureAtlasSprite);
            if (!atlasPBRLoader$PBRTextureAtlasSprite.method_76321() || iterator == null) continue;
            class02011 class020112 = atlasPBRLoader$PBRTextureAtlasSprite.method_76319(iterator.slice(n7 * n6, n6), n5);
            ++n7;
            if (class020112 == null) continue;
            arrayList2.add(class020112);
        }
        this.spriteUbos = iterator;
        this.sprites = arrayList;
        this.animatedTexturesStates = List.copyOf(arrayList2);
        this.uploadInitialContents();
        if (class07529.o) {
            Path path = TextureUtil.getDebugTexturePath();
            try {
                Files.createDirectories(path, new FileAttribute[0]);
                this.method_49712(this.location, path);
            }
            catch (IOException iOException) {
                Iris.logger.warn("Failed to dump atlas contents to {}", new Object[]{path});
            }
        }
        PBRAtlasHolder pBRAtlasHolder = ((TextureAtlasExtension)this.atlasTexture).getOrCreatePBRHolder();
        switch (this.type) {
            case NORMAL: {
                pBRAtlasHolder.setNormalAtlas(this);
                break;
            }
            case SPECULAR: {
                pBRAtlasHolder.setSpecularAtlas(this);
            }
        }
    }

    public void cycleAnimationFrames() {
        if (this.field_56974 != null) {
            for (class02011 class020112 : this.animatedTexturesStates) {
                class020112.N();
            }
            if (this.animatedTexturesStates.stream().anyMatch(class02011::y)) {
                for (int i = 0; i <= this.maxMipLevel; ++i) {
                    class02011 class020112;
                    class020112 = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Animate " + String.valueOf(this.location), this.mipViews[i], OptionalInt.empty());
                    try {
                        for (class02011 class020113 : this.animatedTexturesStates) {
                            if (!class020113.y()) continue;
                            class020113.N((RenderPass)class020112, class020113.N(i));
                        }
                        continue;
                    }
                    finally {
                        if (class020112 != null) {
                            class020112.close();
                        }
                    }
                }
            }
        }
    }

    @Override
    public class01894 getDefaultDumpLocation() {
        return this.location;
    }

    private void uploadInitialContents() {
        GpuTexture gpuTexture;
        GpuDevice gpuDevice = RenderSystem.getDevice();
        int n = class04995.i((int)class01991.field_64235, (int)RenderSystem.getDevice().getUniformOffsetAlignment());
        int n2 = n * this.mipLevelCount;
        class08188 class081882 = RenderSystem.getSamplerCache().N(FilterMode.NEAREST);
        List list = this.sprites.stream().filter(atlasPBRLoader$PBRTextureAtlasSprite -> !atlasPBRLoader$PBRTextureAtlasSprite.method_76321()).toList();
        ArrayList<GpuTextureView[]> arrayList = new ArrayList<GpuTextureView[]>();
        ByteBuffer byteBuffer = MemoryUtil.memAlloc((int)(list.size() * n2));
        for (int i = 0; i < list.size(); ++i) {
            class08388 class083882 = (class08388)list.get(i);
            class083882.method_76320(byteBuffer, i * n2, this.maxMipLevel, this.width, this.height, n);
            gpuTexture = gpuDevice.createTexture(() -> class083882.method_45851().method_45816().toString(), 5, TextureFormat.RGBA8, class083882.method_45851().method_45807(), class083882.method_45851().method_45815(), 1, this.mipLevelCount);
            GpuTextureView[] gpuTextureViewArray = new GpuTextureView[this.mipLevelCount];
            for (int j = 0; j <= this.maxMipLevel; ++j) {
                class083882.method_4584(gpuTexture, j);
                gpuTextureViewArray[j] = gpuDevice.createTextureView(gpuTexture);
            }
            arrayList.add(gpuTextureViewArray);
        }
        try (Object object = gpuDevice.createBuffer(() -> "SpriteAnimationInfo", 128, byteBuffer);){
            for (int i = 0; i < this.mipLevelCount; ++i) {
                gpuTexture = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Animate " + String.valueOf(this.location), this.mipViews[i], OptionalInt.empty());
                try {
                    gpuTexture.setPipeline(class08394.yR);
                    for (int j = 0; j < list.size(); ++j) {
                        gpuTexture.bindTexture("Sprite", ((GpuTextureView[])arrayList.get(j))[i], class081882);
                        gpuTexture.setUniform("SpriteAnimationInfo", object.slice((long)(j * n2 + i * n), (long)class01991.field_64235));
                        gpuTexture.draw(0, 6);
                    }
                    continue;
                }
                finally {
                    if (gpuTexture != null) {
                        gpuTexture.close();
                    }
                }
            }
        }
        object = arrayList.iterator();
        while (object.hasNext()) {
            GpuTexture gpuTexture2;
            for (GpuTexture gpuTexture3 : gpuTexture2 = (GpuTexture)object.next()) {
                gpuTexture3.close();
                gpuTexture3.texture().close();
            }
        }
        MemoryUtil.memFree((Buffer)byteBuffer);
    }

    public class01894 getAtlasId() {
        return this.location;
    }
}

