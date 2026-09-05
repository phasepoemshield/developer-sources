/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  net.irisshaders.iris.gl.GLDebug
 *  net.irisshaders.iris.gl.GlResource
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.texture.TextureUploadHelper
 *  org.lwjgl.BufferUtils
 */
package net.irisshaders.iris.targets.backed;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import net.irisshaders.iris.gl.GLDebug;
import net.irisshaders.iris.gl.GlResource;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.texture.TextureUploadHelper;
import org.lwjgl.BufferUtils;

public class SingleColorTexture
extends GlResource {
    public SingleColorTexture(int n, int n2, int n3, int n4) {
        super(IrisRenderSystem.createTexture((int)3553));
        ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)4);
        byteBuffer.put((byte)n);
        byteBuffer.put((byte)n2);
        byteBuffer.put((byte)n3);
        byteBuffer.put((byte)n4);
        byteBuffer.position(0);
        int n5 = this.getGlId();
        GLDebug.nameObject((int)5890, (int)n5, (String)("single color (" + n + ", " + n2 + "," + n3 + "," + n4 + ")"));
        IrisRenderSystem.texParameteri((int)n5, (int)3553, (int)10241, (int)9729);
        IrisRenderSystem.texParameteri((int)n5, (int)3553, (int)10240, (int)9729);
        IrisRenderSystem.texParameteri((int)n5, (int)3553, (int)10242, (int)10497);
        IrisRenderSystem.texParameteri((int)n5, (int)3553, (int)10243, (int)10497);
        TextureUploadHelper.resetTextureUploadState();
        IrisRenderSystem.texImage2D((int)n5, (int)3553, (int)0, (int)32856, (int)1, (int)1, (int)0, (int)6408, (int)5121, (ByteBuffer)byteBuffer);
    }

    public int getTextureId() {
        return this.getGlId();
    }

    public void destroyInternal() {
        GlStateManager._deleteTexture((int)this.getGlId());
    }
}

