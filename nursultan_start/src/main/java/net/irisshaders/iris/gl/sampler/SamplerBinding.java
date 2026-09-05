/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.texture.TextureType
 */
package net.irisshaders.iris.gl.sampler;

import java.util.function.IntSupplier;
import java.util.function.Supplier;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.sampler.GlSampler;
import net.irisshaders.iris.gl.state.ValueUpdateNotifier;
import net.irisshaders.iris.gl.texture.TextureType;

public class SamplerBinding {
    private final int textureUnit;
    private final IntSupplier texture;
    private final ValueUpdateNotifier notifier;
    private final TextureType textureType;
    private final Supplier<GlSampler> sampler;

    public SamplerBinding(TextureType textureType, int n, IntSupplier intSupplier, Supplier<GlSampler> supplier, ValueUpdateNotifier valueUpdateNotifier) {
        this.textureType = textureType;
        this.textureUnit = n;
        this.texture = intSupplier;
        this.sampler = supplier;
        this.notifier = valueUpdateNotifier;
    }

    public void update() {
        this.updateSampler();
        if (this.notifier != null) {
            this.notifier.setListener(this::updateSampler);
        }
    }

    private void updateSampler() {
        GlSampler glSampler = this.sampler == null ? null : this.sampler.get();
        IrisRenderSystem.bindSamplerToUnit(this.textureUnit, glSampler == null ? 0 : glSampler.getId());
        IrisRenderSystem.bindTextureToUnit(this.textureType.getGlType(), this.textureUnit, this.texture.getAsInt());
    }
}

