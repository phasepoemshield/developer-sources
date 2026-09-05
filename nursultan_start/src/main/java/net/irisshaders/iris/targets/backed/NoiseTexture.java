/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  net.irisshaders.iris.gl.GLDebug
 *  net.irisshaders.iris.gl.GlResource
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.texture.TextureUploadHelper
 */
package net.irisshaders.iris.targets.backed;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import java.util.Random;
import net.irisshaders.iris.gl.GLDebug;
import net.irisshaders.iris.gl.GlResource;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.texture.TextureUploadHelper;

public class NoiseTexture
extends GlResource {
    int width;
    int height;

    public NoiseTexture(int n, int n2) {
        super(IrisRenderSystem.createTexture((int)3553));
        int n3 = this.getGlId();
        IrisRenderSystem.texParameteri((int)n3, (int)3553, (int)10241, (int)9729);
        IrisRenderSystem.texParameteri((int)n3, (int)3553, (int)10240, (int)9729);
        IrisRenderSystem.texParameteri((int)n3, (int)3553, (int)10242, (int)10497);
        IrisRenderSystem.texParameteri((int)n3, (int)3553, (int)10243, (int)10497);
        IrisRenderSystem.texParameteri((int)n3, (int)3553, (int)33085, (int)0);
        IrisRenderSystem.texParameteri((int)n3, (int)3553, (int)33082, (int)0);
        IrisRenderSystem.texParameteri((int)n3, (int)3553, (int)33083, (int)0);
        IrisRenderSystem.texParameterf((int)n3, (int)3553, (int)34049, (float)0.0f);
        this.resize(n3, n, n2);
        GLDebug.nameObject((int)5890, (int)n3, (String)"noise texture");
        GlStateManager._bindTexture((int)0);
    }

    void resize(int n, int n2, int n3) {
        this.width = n2;
        this.height = n3;
        ByteBuffer byteBuffer = this.generateNoise();
        TextureUploadHelper.resetTextureUploadState();
        GlStateManager._pixelStore((int)3317, (int)1);
        IrisRenderSystem.texImage2D((int)n, (int)3553, (int)0, (int)32849, (int)n2, (int)n3, (int)0, (int)6407, (int)5121, (ByteBuffer)byteBuffer);
        GlStateManager._bindTexture((int)0);
    }

    public int getTextureId() {
        return this.getGlId();
    }

    public void destroyInternal() {
        GlStateManager._deleteTexture((int)this.getGlId());
    }

    private ByteBuffer generateNoise() {
        byte[] byArray = new byte[3 * this.width * this.height];
        Random random = new Random(0L);
        random.nextBytes(byArray);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(byArray.length);
        byteBuffer.put(byArray);
        byteBuffer.flip();
        return byteBuffer;
    }
}

