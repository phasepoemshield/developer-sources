/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  it.unimi.dsi.fastutil.ints.IntIterator
 *  it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap
 *  net.minecraft.client.texture.GlTexture
 */
package oxxxde;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.textures.GpuTextureView;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import net.minecraft.client.texture.GlTexture;

public final class \u0631\u0622 {
    private static final Long2IntOpenHashMap FRAMEBUFFERS = new Long2IntOpenHashMap();

    public static void clearCache() {
        IntIterator intIterator = FRAMEBUFFERS.values().iterator();
        while (intIterator.hasNext()) {
            int framebuffer = (Integer)intIterator.next();
            GlStateManager._glDeleteFramebuffers((int)framebuffer);
        }
        FRAMEBUFFERS.clear();
    }

    /*
     * WARNING - void declaration
     */
    public static int getFrameBufferId(GpuTextureView colorTexture, GpuTextureView depthTexture) {
        void var7_6;
        \u0631\u0622.validateFrameBufferTexture("Color", colorTexture);
        if (depthTexture != null) {
            \u0631\u0622.validateFrameBufferTexture("Depth", depthTexture);
        }
        int colorId = ((GlTexture)colorTexture.texture()).getGlId();
        int depthId = depthTexture == null ? 0 : ((GlTexture)depthTexture.texture()).getGlId();
        long key = (long)colorId << 32 ^ (long)depthId & 0xFFFFFFFFL;
        int cached = FRAMEBUFFERS.get(key);
        if (cached != -1) {
            return cached;
        }
        int framebuffer = GlStateManager.glGenFramebuffers();
        GlStateManager._glBindFramebuffer((int)36160, (int)framebuffer);
        GlStateManager._glFramebufferTexture2D((int)36160, (int)36064, (int)3553, (int)colorId, (int)0);
        if (depthId != 0) {
            GlStateManager._glFramebufferTexture2D((int)36160, (int)36096, (int)3553, (int)depthId, (int)0);
        }
        FRAMEBUFFERS.put(key, (int)var7_6);
        return (int)var7_6;
    }

    static {
        FRAMEBUFFERS.defaultReturnValue(-1);
    }

    public static void validateFrameBufferTexture(String name, GpuTextureView gpuTextureView) {
        if (gpuTextureView.isClosed()) {
            throw new IllegalStateException(name.concat("texture is closed"));
        }
        if ((gpuTextureView.texture().usage() & 8) == 0) {
            throw new IllegalStateException(name.concat("texture must have USAGE_RENDER_ATTACHMENT"));
        }
        if (gpuTextureView.texture().getDepthOrLayers() > 1) {
            throw new UnsupportedOperationException("Textures with multiple depths or layers are not yet supported as an attachment");
        }
    }

    public static void bindFrameBuffer(int id, GpuTextureView colorTexture) {
        GlStateManager._glBindFramebuffer((int)36160, (int)id);
        GlStateManager._viewport((int)0, (int)0, (int)colorTexture.getWidth(0), (int)colorTexture.getHeight(0));
    }
}

