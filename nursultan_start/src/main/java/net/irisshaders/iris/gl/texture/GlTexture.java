/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  net.irisshaders.iris.gl.texture.TextureAccess
 *  net.irisshaders.iris.gl.texture.TextureType
 *  net.irisshaders.iris.gl.texture.TextureUploadHelper
 *  net.irisshaders.iris.shaderpack.texture.TextureFilteringData
 *  org.lwjgl.system.MemoryUtil
 */
package net.irisshaders.iris.gl.texture;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.function.IntSupplier;
import net.irisshaders.iris.gl.GlResource;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.sampler.GlSampler;
import net.irisshaders.iris.gl.texture.TextureAccess;
import net.irisshaders.iris.gl.texture.TextureType;
import net.irisshaders.iris.gl.texture.TextureUploadHelper;
import net.irisshaders.iris.shaderpack.texture.TextureFilteringData;
import org.lwjgl.system.MemoryUtil;

public class GlTexture
extends GlResource
implements TextureAccess {
    private final TextureType target;
    private final boolean shouldBlur;
    private final boolean shouldClamp;

    public TextureType getTarget() {
        return this.target;
    }

    public GlTexture(TextureType textureType, int n, int n2, int n3, int n4, int n5, int n6, byte[] byArray, TextureFilteringData textureFilteringData) {
        super(GlStateManager._genTexture());
        IrisRenderSystem.bindTextureForSetup(textureType.getGlType(), this.getGlId());
        TextureUploadHelper.resetTextureUploadState();
        ByteBuffer byteBuffer = MemoryUtil.memAlloc((int)byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.flip();
        textureType.apply(this.getGlId(), n, n2, n3, n4, n5, n6, byteBuffer);
        MemoryUtil.memFree((Buffer)byteBuffer);
        int n7 = this.getGlId();
        IrisRenderSystem.texParameteri(n7, textureType.getGlType(), 10241, textureFilteringData.shouldBlur() ? 9729 : 9728);
        IrisRenderSystem.texParameteri(n7, textureType.getGlType(), 10240, textureFilteringData.shouldBlur() ? 9729 : 9728);
        IrisRenderSystem.texParameteri(n7, textureType.getGlType(), 10242, textureFilteringData.shouldClamp() ? 33071 : 10497);
        this.shouldBlur = textureFilteringData.shouldBlur();
        this.shouldClamp = textureFilteringData.shouldClamp();
        if (n2 > 0) {
            IrisRenderSystem.texParameteri(n7, textureType.getGlType(), 10243, textureFilteringData.shouldClamp() ? 33071 : 10497);
        }
        if (n3 > 0) {
            IrisRenderSystem.texParameteri(n7, textureType.getGlType(), 32882, textureFilteringData.shouldClamp() ? 33071 : 10497);
        }
        IrisRenderSystem.texParameteri(n7, textureType.getGlType(), 33085, 0);
        IrisRenderSystem.texParameteri(n7, textureType.getGlType(), 33082, 0);
        IrisRenderSystem.texParameteri(n7, textureType.getGlType(), 33083, 0);
        IrisRenderSystem.texParameterf(n7, textureType.getGlType(), 34049, 0.0f);
        IrisRenderSystem.bindTextureForSetup(textureType.getGlType(), 0);
        this.target = textureType;
    }

    public TextureType getType() {
        return this.target;
    }

    public void bind(int n) {
        IrisRenderSystem.bindTextureToUnit(this.target.getGlType(), n, this.getGlId());
    }

    public IntSupplier getTextureId() {
        return () -> this.getGlId();
    }

    @Override
    public void destroyInternal() {
        GlStateManager._deleteTexture((int)this.getGlId());
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
}

