/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.client.gl.Framebuffer
 */
package kotakbaz.rain.client.render.main.buffer.framebuffer;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import net.minecraft.client.gl.Framebuffer;
import oxxxde.\u0631\u0622;

public class CustomFramebuffer
extends Framebuffer {
    private static final int TRANSLUCENT = new Color(0.0f, 0.0f, 0.0f, 0.0f).hashCode();
    private final int clearColor;

    public void clearColorTexture() {
        if (this.getColorAttachment() != null) {
            RenderSystem.getDevice().createCommandEncoder().clearColorTexture(this.getColorAttachment(), this.clearColor);
        }
    }

    public CustomFramebuffer(String name, int width, int height, boolean useDepth) {
        this(name, width, height, TRANSLUCENT, useDepth);
    }

    public void clearAllTextures() {
        this.clearColorTexture();
        this.clearDepthTexture();
    }

    public void clearDepthTexture() {
        if (this.getDepthAttachment() != null) {
            RenderSystem.getDevice().createCommandEncoder().clearDepthTexture(this.getDepthAttachment(), 0.0);
        }
    }

    public void bind(boolean setViewport) {
        GlStateManager._glBindFramebuffer((int)36160, (int)\u0631\u0622.getFrameBufferId(this.getColorAttachmentView(), this.getDepthAttachmentView()));
        if (setViewport) {
            GlStateManager._viewport((int)0, (int)0, (int)this.getColorAttachment().getWidth(0), (int)this.getColorAttachment().getHeight(0));
        }
    }

    public CustomFramebuffer(String name, int width, int height, int clearColor, boolean useDepth) {
        super(name, useDepth);
        this.resize(width, height);
        this.clearColor = clearColor;
    }

    public CustomFramebuffer(String name, boolean useDepth) {
        this(name, 1, 1, useDepth);
    }
}

