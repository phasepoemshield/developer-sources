/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  minecraft.class08280
 *  minecraft.class08829
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.sampler.GlSampler
 *  net.irisshaders.iris.gl.texture.TextureAccess
 *  net.irisshaders.iris.gl.texture.TextureType
 */
package net.irisshaders.iris.targets.backed;

import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.function.IntSupplier;
import minecraft.class08280;
import minecraft.class08829;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.sampler.GlSampler;
import net.irisshaders.iris.gl.texture.TextureAccess;
import net.irisshaders.iris.gl.texture.TextureType;
import net.irisshaders.iris.shaderpack.texture.CustomTextureData$PngData;

public class NativeImageBackedCustomTexture
extends class08829
implements TextureAccess {
    private final boolean shouldBlur;
    private final boolean shouldClamp;

    private static class08280 create(byte[] byArray) throws IOException {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.flip();
        return class08280.N((ByteBuffer)byteBuffer);
    }

    public NativeImageBackedCustomTexture(CustomTextureData$PngData customTextureData$PngData) throws IOException {
        super(() -> "PNG Texture", NativeImageBackedCustomTexture.create(customTextureData$PngData.getContent()));
        if (customTextureData$PngData.getFilteringData().shouldBlur()) {
            IrisRenderSystem.texParameteri((int)this.getId(), (int)3553, (int)10241, (int)9729);
            IrisRenderSystem.texParameteri((int)this.getId(), (int)3553, (int)10240, (int)9729);
        }
        if (customTextureData$PngData.getFilteringData().shouldClamp()) {
            IrisRenderSystem.texParameteri((int)this.getId(), (int)3553, (int)10242, (int)33071);
            IrisRenderSystem.texParameteri((int)this.getId(), (int)3553, (int)10243, (int)33071);
        }
        this.shouldBlur = customTextureData$PngData.getFilteringData().shouldBlur();
        this.shouldClamp = customTextureData$PngData.getFilteringData().shouldClamp();
    }

    private int getId() {
        return this.field_56974.iris$getGlId();
    }

    public TextureType getType() {
        return TextureType.TEXTURE_2D;
    }

    public IntSupplier getTextureId() {
        return this::getId;
    }

    public GlSampler getSampling() {
        if (this.shouldClamp) {
            if (this.shouldBlur) {
                return GlSampler.LINEAR;
            }
            return GlSampler.NEAREST;
        }
        if (this.shouldBlur) {
            return GlSampler.LINEAR_REPEAT;
        }
        return GlSampler.NEAREST_REPEAT;
    }

    public void method_4524() {
        class08280 class082802 = Objects.requireNonNull(this.method_4525());
        RenderSystem.getDevice().createCommandEncoder().writeToTexture(this.field_56974, class082802);
    }
}

