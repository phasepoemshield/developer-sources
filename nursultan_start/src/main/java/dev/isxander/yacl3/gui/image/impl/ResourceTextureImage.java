/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.debug.DebugProperties
 *  minecraft.class01054
 *  minecraft.class01894
 */
package dev.isxander.yacl3.gui.image.impl;

import dev.isxander.yacl3.debug.DebugProperties;
import dev.isxander.yacl3.gui.image.ImageRenderer;
import dev.isxander.yacl3.gui.image.ImageRendererFactory;
import dev.isxander.yacl3.gui.utils.GuiUtils;
import minecraft.class01054;
import minecraft.class01894;

public class ResourceTextureImage
implements ImageRenderer {
    private final class01894 location;
    private final int width;
    private final int height;
    private final int textureWidth;
    private final int textureHeight;
    private final float u;
    private final float v;

    public static ImageRendererFactory createFactory(class01894 class018942, float f, float f2, int n, int n2, int n3, int n4) {
        return () -> () -> new ResourceTextureImage(class018942, f, f2, n, n2, n3, n4);
    }

    public ResourceTextureImage(class01894 class018942, float f, float f2, int n, int n2, int n3, int n4) {
        this.location = class018942;
        this.width = n;
        this.height = n2;
        this.textureWidth = n3;
        this.textureHeight = n4;
        this.u = f;
        this.v = f2;
    }

    @Override
    public void close() {
    }

    @Override
    public int render(class01054 class010542, int n, int n2, int n3, float f) {
        float f2 = (float)n3 / (float)this.width;
        int n4 = (int)((float)this.height * f2);
        GuiUtils.pushPose(class010542);
        GuiUtils.translate2D(class010542, n, n2);
        GuiUtils.scale2D(class010542, f2, f2);
        GuiUtils.blitGuiTex(class010542, this.location, 0, 0, this.u, this.v, this.width, this.height, this.textureWidth, this.textureHeight, DebugProperties.IMAGE_FILTERING);
        GuiUtils.popPose(class010542);
        return n4;
    }
}

