/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.texture.TextureType
 */
package net.irisshaders.iris.gl.sampler;

import java.util.function.IntSupplier;
import java.util.function.Supplier;
import net.irisshaders.iris.gl.sampler.GlSampler;
import net.irisshaders.iris.gl.state.ValueUpdateNotifier;
import net.irisshaders.iris.gl.texture.TextureType;

public interface SamplerHolder {
    public void addExternalSampler(int var1, String ... var2);

    default public boolean addDynamicSampler(IntSupplier intSupplier, GlSampler glSampler, String ... stringArray) {
        return this.addDynamicSampler(TextureType.TEXTURE_2D, intSupplier, () -> glSampler, stringArray);
    }

    public boolean addDynamicSampler(TextureType var1, IntSupplier var2, Supplier<GlSampler> var3, String ... var4);

    default public boolean addDynamicSampler(IntSupplier intSupplier, GlSampler glSampler, ValueUpdateNotifier valueUpdateNotifier, String ... stringArray) {
        return this.addDynamicSampler(TextureType.TEXTURE_2D, intSupplier, valueUpdateNotifier, () -> glSampler, stringArray);
    }

    public boolean addDynamicSampler(TextureType var1, IntSupplier var2, ValueUpdateNotifier var3, Supplier<GlSampler> var4, String ... var5);

    public boolean addDefaultSampler(TextureType var1, IntSupplier var2, ValueUpdateNotifier var3, Supplier<GlSampler> var4, String ... var5);

    default public boolean addDefaultSampler(IntSupplier intSupplier, String ... stringArray) {
        return this.addDefaultSampler(TextureType.TEXTURE_2D, intSupplier, null, null, stringArray);
    }

    public boolean hasSampler(String var1);
}

