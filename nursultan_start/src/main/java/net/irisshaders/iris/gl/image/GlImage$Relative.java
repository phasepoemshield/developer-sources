/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.texture.PixelType
 *  net.irisshaders.iris.gl.texture.TextureType
 */
package net.irisshaders.iris.gl.image;

import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.image.GlImage;
import net.irisshaders.iris.gl.texture.InternalTextureFormat;
import net.irisshaders.iris.gl.texture.PixelFormat;
import net.irisshaders.iris.gl.texture.PixelType;
import net.irisshaders.iris.gl.texture.TextureType;

public class GlImage$Relative
extends GlImage {
    private final float relativeHeight;
    private final float relativeWidth;

    public GlImage$Relative(String string, String string2, PixelFormat pixelFormat, InternalTextureFormat internalTextureFormat, PixelType pixelType, boolean bl, float f, float f2, int n, int n2) {
        super(string, string2, TextureType.TEXTURE_2D, pixelFormat, internalTextureFormat, pixelType, bl, (int)((float)n * f), (int)((float)n2 * f2), 0);
        this.relativeWidth = f;
        this.relativeHeight = f2;
    }

    @Override
    public void updateNewSize(int n, int n2) {
        IrisRenderSystem.bindTextureForSetup(this.target.getGlType(), this.getGlId());
        this.target.apply(this.getGlId(), (int)((float)n * this.relativeWidth), (int)((float)n2 * this.relativeHeight), 0, this.internalTextureFormat.getGlFormat(), this.format.getGlFormat(), this.pixelType.getGlFormat(), null);
        int n3 = this.getGlId();
        this.setup(n3, n, n2, 0);
        IrisRenderSystem.bindTextureForSetup(this.target.getGlType(), 0);
    }
}

