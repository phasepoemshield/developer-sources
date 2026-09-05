/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class06202
 *  minecraft.class08280
 *  minecraft.class08627
 *  minecraft.class08829
 *  minecraft.class08918
 */
package dev.isxander.yacl3.gui.image.impl;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.isxander.yacl3.gui.image.ImageRenderer;
import dev.isxander.yacl3.gui.image.ImageRendererFactory;
import dev.isxander.yacl3.gui.utils.GuiUtils;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Path;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class06202;
import minecraft.class08280;
import minecraft.class08627;
import minecraft.class08829;
import minecraft.class08918;

public class DynamicTextureImage
implements ImageRenderer {
    protected static final class08627 textureManager = class06202.Nq().NO();
    protected class08280 image;
    protected class08829 texture;
    protected final class01894 uniqueLocation;
    protected final int width;
    protected final int height;
    protected final boolean textureFiltering;

    public DynamicTextureImage(class08280 class082802, class01894 class018942, boolean bl) {
        RenderSystem.assertOnRenderThread();
        this.image = class082802;
        this.texture = new class08829(() -> ((class01894)class018942).toString(), class082802);
        this.textureFiltering = bl;
        this.uniqueLocation = class018942;
        textureManager.N(this.uniqueLocation, (class08918)this.texture);
        this.width = class082802.N();
        this.height = class082802.y();
    }

    @Override
    public void close() {
        this.image.close();
        this.image = null;
        this.texture = null;
        textureManager.L(this.uniqueLocation);
    }

    @Override
    public int render(class01054 class010542, int n, int n2, int n3, float f) {
        if (this.image == null) {
            return 0;
        }
        float f2 = (float)n3 / (float)this.width;
        int n4 = (int)((float)this.height * f2);
        GuiUtils.pushPose(class010542);
        GuiUtils.translate2D(class010542, n, n2);
        GuiUtils.scale2D(class010542, f2, f2);
        GuiUtils.blitGuiTex(class010542, this.uniqueLocation, 0, 0, 0.0f, 0.0f, this.width, this.height, this.width, this.height, this.textureFiltering);
        GuiUtils.popPose(class010542);
        return n4;
    }

    public static ImageRendererFactory fromPath(Path path, class01894 class018942, boolean bl) {
        return () -> () -> new DynamicTextureImage(class08280.N((InputStream)new FileInputStream(path.toFile())), class018942, bl);
    }
}

