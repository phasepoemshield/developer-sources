/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.gl.image;

import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.image.GlImage;
import net.irisshaders.iris.gl.image.ImageClearPass;

class ImageClearPass$Float
extends ImageClearPass {
    public ImageClearPass$Float(GlImage glImage) {
        super(glImage);
    }

    @Override
    public void execute() {
        IrisRenderSystem.clearBufferfv(this.framebuffer.getId(), 6144, 0, new float[]{0.0f, 0.0f, 0.0f, 0.0f});
    }
}

