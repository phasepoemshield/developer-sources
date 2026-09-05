/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.gl.image;

import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.image.GlImage;
import net.irisshaders.iris.gl.image.ImageClearPass;

class ImageClearPass$UInt
extends ImageClearPass {
    public ImageClearPass$UInt(GlImage glImage) {
        super(glImage);
    }

    @Override
    public void execute() {
        IrisRenderSystem.clearBufferuiv(this.framebuffer.getId(), 6144, 0, new int[]{0, 0, 0, 0});
    }
}

