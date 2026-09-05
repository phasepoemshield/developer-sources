/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.ImmutableSet$Builder
 *  com.google.common.collect.UnmodifiableIterator
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  net.irisshaders.iris.gl.texture.TextureAccess
 *  net.irisshaders.iris.gl.texture.TextureType
 *  net.irisshaders.iris.shaderpack.properties.PackRenderTargetDirectives
 */
package net.irisshaders.iris.gl.program;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import net.irisshaders.iris.gl.sampler.GlSampler;
import net.irisshaders.iris.gl.sampler.SamplerHolder;
import net.irisshaders.iris.gl.state.ValueUpdateNotifier;
import net.irisshaders.iris.gl.texture.TextureAccess;
import net.irisshaders.iris.gl.texture.TextureType;
import net.irisshaders.iris.shaderpack.properties.PackRenderTargetDirectives;

public final class ProgramSamplers$CustomTextureSamplerInterceptor
implements SamplerHolder {
    private final SamplerHolder samplerHolder;
    private final Object2ObjectMap<String, TextureAccess> customTextureIds;
    private final ImmutableSet<String> deactivatedOverrides;

    ProgramSamplers$CustomTextureSamplerInterceptor(SamplerHolder samplerHolder, Object2ObjectMap<String, TextureAccess> object2ObjectMap, ImmutableSet<Integer> immutableSet) {
        this.samplerHolder = samplerHolder;
        this.customTextureIds = object2ObjectMap;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        UnmodifiableIterator unmodifiableIterator = immutableSet.iterator();
        while (unmodifiableIterator.hasNext()) {
            int n = (Integer)unmodifiableIterator.next();
            builder.add((Object)("colortex" + n));
            if (n >= PackRenderTargetDirectives.LEGACY_RENDER_TARGETS.size()) continue;
            builder.add((Object)((String)PackRenderTargetDirectives.LEGACY_RENDER_TARGETS.get(n)));
        }
        this.deactivatedOverrides = builder.build();
    }

    private TextureAccess getOverride(String ... stringArray) {
        for (String string : stringArray) {
            if (!this.customTextureIds.containsKey((Object)string) || this.deactivatedOverrides.contains((Object)string)) continue;
            return (TextureAccess)this.customTextureIds.get((Object)string);
        }
        return null;
    }

    @Override
    public void addExternalSampler(int n, String ... stringArray) {
        TextureAccess textureAccess = this.getOverride(stringArray);
        if (textureAccess != null) {
            if (n == 0) {
                this.samplerHolder.addDefaultSampler(textureAccess.getType(), textureAccess.getTextureId(), null, () -> textureAccess.getSampling(), stringArray);
            } else {
                this.samplerHolder.addDynamicSampler(textureAccess.getType(), textureAccess.getTextureId(), null, () -> textureAccess.getSampling(), stringArray);
            }
        } else {
            this.samplerHolder.addExternalSampler(n, stringArray);
        }
    }

    @Override
    public boolean addDynamicSampler(IntSupplier intSupplier, GlSampler glSampler, String ... stringArray) {
        TextureAccess textureAccess = this.getOverride(stringArray);
        if (textureAccess != null) {
            return this.samplerHolder.addDynamicSampler(textureAccess.getType(), textureAccess.getTextureId(), null, () -> ((TextureAccess)textureAccess).getSampling(), stringArray);
        }
        return this.samplerHolder.addDynamicSampler(intSupplier, glSampler, stringArray);
    }

    @Override
    public boolean addDynamicSampler(IntSupplier intSupplier, GlSampler glSampler, ValueUpdateNotifier valueUpdateNotifier, String ... stringArray) {
        TextureAccess textureAccess = this.getOverride(stringArray);
        if (textureAccess != null) {
            return this.samplerHolder.addDynamicSampler(textureAccess.getType(), textureAccess.getTextureId(), null, () -> ((TextureAccess)textureAccess).getSampling(), stringArray);
        }
        return this.samplerHolder.addDynamicSampler(intSupplier, glSampler, valueUpdateNotifier, stringArray);
    }

    @Override
    public boolean addDynamicSampler(TextureType textureType, IntSupplier intSupplier, ValueUpdateNotifier valueUpdateNotifier, Supplier<GlSampler> supplier, String ... stringArray) {
        return false;
    }

    @Override
    public boolean addDynamicSampler(TextureType textureType, IntSupplier intSupplier, Supplier<GlSampler> supplier, String ... stringArray) {
        TextureAccess textureAccess = this.getOverride(stringArray);
        if (textureAccess != null) {
            return this.samplerHolder.addDynamicSampler(textureAccess.getType(), textureAccess.getTextureId(), null, () -> ((TextureAccess)textureAccess).getSampling(), stringArray);
        }
        return this.samplerHolder.addDynamicSampler(textureType, intSupplier, supplier, stringArray);
    }

    @Override
    public boolean addDefaultSampler(TextureType textureType, IntSupplier intSupplier, ValueUpdateNotifier valueUpdateNotifier, Supplier<GlSampler> supplier, String ... stringArray) {
        TextureAccess textureAccess = this.getOverride(stringArray);
        if (textureAccess != null) {
            return this.samplerHolder.addDefaultSampler(textureAccess.getType(), textureAccess.getTextureId(), null, () -> ((TextureAccess)textureAccess).getSampling(), stringArray);
        }
        return this.samplerHolder.addDefaultSampler(textureType, intSupplier, valueUpdateNotifier, supplier, stringArray);
    }

    @Override
    public boolean addDefaultSampler(IntSupplier intSupplier, String ... stringArray) {
        TextureAccess textureAccess = this.getOverride(stringArray);
        if (textureAccess != null) {
            return this.samplerHolder.addDefaultSampler(textureAccess.getType(), textureAccess.getTextureId(), null, () -> ((TextureAccess)textureAccess).getSampling(), stringArray);
        }
        return this.samplerHolder.addDefaultSampler(intSupplier, stringArray);
    }

    @Override
    public boolean hasSampler(String string) {
        return this.samplerHolder.hasSampler(string);
    }
}

