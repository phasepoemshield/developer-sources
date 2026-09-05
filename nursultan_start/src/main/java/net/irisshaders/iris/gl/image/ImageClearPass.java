/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.irisshaders.iris.gl.texture.ShaderDataType
 */
package net.irisshaders.iris.gl.image;

import net.irisshaders.iris.gl.framebuffer.GlFramebuffer;
import net.irisshaders.iris.gl.image.GlImage;
import net.irisshaders.iris.gl.image.ImageClearPass$Float;
import net.irisshaders.iris.gl.image.ImageClearPass$Int;
import net.irisshaders.iris.gl.image.ImageClearPass$UInt;
import net.irisshaders.iris.gl.texture.ShaderDataType;

public abstract class ImageClearPass {
    protected final GlFramebuffer framebuffer = new GlFramebuffer();

    public static ImageClearPass create(GlImage glImage) {
        return switch (glImage.getInternalFormat().getShaderDataType()) {
            default -> throw new MatchException(null, null);
            case ShaderDataType.FLOAT -> new ImageClearPass$Float(glImage);
            case ShaderDataType.INT -> new ImageClearPass$Int(glImage);
            case ShaderDataType.UINT -> new ImageClearPass$UInt(glImage);
        };
    }

    ImageClearPass(GlImage glImage) {
        this.framebuffer.addColorAttachment(0, glImage.getId());
    }

    public abstract void execute();

    public void destroy() {
        this.framebuffer.destroy();
    }
}

