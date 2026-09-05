/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.gl.image;

import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.image.GlImage;
import net.irisshaders.iris.gl.image.ImageClearPass;

class ImageClearPass$Int
extends ImageClearPass {
    public ImageClearPass$Int(GlImage glImage) {
        super(glImage);
    }

    @Override
    public void execute() {
        IrisRenderSystem.clearBufferiv(this.framebuffer.getId(), 6144, 0, new int[]{0, 0, 0, 0});
    }
}

