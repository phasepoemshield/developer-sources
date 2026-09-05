/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.textures.GpuTexture
 *  it.unimi.dsi.fastutil.ints.Int2IntArrayMap
 *  it.unimi.dsi.fastutil.ints.Int2IntMap
 *  minecraft.class08893
 */
package net.irisshaders.iris.gl.framebuffer;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.textures.GpuTexture;
import it.unimi.dsi.fastutil.ints.Int2IntArrayMap;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import minecraft.class08893;
import net.irisshaders.iris.gl.GlResource;
import net.irisshaders.iris.gl.IrisRenderSystem;

public class GlFramebuffer
extends GlResource {
    private final Int2IntMap attachments = new Int2IntArrayMap();
    private final int maxDrawBuffers = GlStateManager._getInteger((int)34852);
    private final int maxColorAttachments = GlStateManager._getInteger((int)36063);
    private boolean hasDepthAttachment = false;

    public void readBuffer(int n) {
        IrisRenderSystem.readBuffer(this.getGlId(), 36064 + n);
    }

    public GlFramebuffer() {
        super(IrisRenderSystem.createFramebuffer());
    }

    public int getId() {
        return this.getGlId();
    }

    public void bind() {
        GlStateManager._glBindFramebuffer((int)36160, (int)this.getGlId());
    }

    public int getStatus() {
        this.bind();
        return IrisRenderSystem.checkFramebufferStatus(36160);
    }

    public void bindAsReadBuffer() {
        GlStateManager._glBindFramebuffer((int)36008, (int)this.getGlId());
    }

    public void addColorAttachment(int n, int n2) {
        int n3 = this.getGlId();
        IrisRenderSystem.framebufferTexture2D(n3, 36160, 36064 + n, 3553, n2, 0);
        this.attachments.put(n, n2);
    }

    public void addDepthAttachment(GpuTexture gpuTexture) {
        int n = this.getGlId();
        IrisRenderSystem.framebufferTexture2D(n, 36160, 36096, 3553, ((class08893)gpuTexture).N(), 0);
        this.hasDepthAttachment = true;
    }

    public void drawBuffers(int[] nArray) {
        int[] nArray2 = new int[nArray.length];
        int n = 0;
        if (nArray.length > this.maxDrawBuffers) {
            throw new IllegalArgumentException("Cannot write to more than " + this.maxDrawBuffers + " draw buffers on this GPU");
        }
        for (int n2 : nArray) {
            if (n2 >= this.maxColorAttachments) {
                throw new IllegalArgumentException("Only " + this.maxColorAttachments + " color attachments are supported on this GPU, but an attempt was made to write to a color attachment with index " + n2);
            }
            nArray2[n++] = 36064 + n2;
        }
        IrisRenderSystem.drawBuffers(this.getGlId(), nArray2);
    }

    @Override
    public void destroyInternal() {
        GlStateManager._glDeleteFramebuffers((int)this.getGlId());
    }

    public void bindAsDrawBuffer() {
        GlStateManager._glBindFramebuffer((int)36009, (int)this.getGlId());
    }

    public int getColorAttachment(int n) {
        return this.attachments.get(n);
    }

    public boolean hasDepthAttachment() {
        return this.hasDepthAttachment;
    }

    public void noDrawBuffers() {
        IrisRenderSystem.drawBuffers(this.getGlId(), new int[]{0});
    }

    public void addDepthAttachmentBypass(int n) {
        int n2 = this.getGlId();
        IrisRenderSystem.framebufferTexture2D(n2, 36160, 36096, 3553, n, 0);
        this.hasDepthAttachment = true;
    }
}

