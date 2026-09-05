/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.sampler.GlSampler
 */
package net.irisshaders.iris.gl.texture;

import java.util.function.IntSupplier;
import net.irisshaders.iris.gl.sampler.GlSampler;
import net.irisshaders.iris.gl.texture.TextureAccess;
import net.irisshaders.iris.gl.texture.TextureType;

public class TextureWrapper
implements TextureAccess {
    private final IntSupplier texture;
    private final TextureType type;

    public TextureWrapper(IntSupplier intSupplier, TextureType textureType) {
        this.texture = intSupplier;
        this.type = textureType;
    }

    @Override
    public TextureType getType() {
        return this.type;
    }

    @Override
    public IntSupplier getTextureId() {
        return this.texture;
    }

    @Override
    public GlSampler getSampling() {
        return GlSampler.MIPPED_NEAREST_REPEAT;
    }
}

