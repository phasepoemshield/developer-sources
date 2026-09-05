/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.sampler.GlSampler
 */
package net.irisshaders.iris.gl.texture;

import java.util.function.IntSupplier;
import net.irisshaders.iris.gl.sampler.GlSampler;
import net.irisshaders.iris.gl.texture.TextureType;

public interface TextureAccess {
    public TextureType getType();

    public IntSupplier getTextureId();

    public GlSampler getSampling();
}

