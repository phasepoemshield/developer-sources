/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  net.irisshaders.iris.gl.texture.TextureType
 */
package net.irisshaders.iris.gl.program;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import net.irisshaders.iris.gl.program.GlUniform1iCall;
import net.irisshaders.iris.gl.program.ProgramSamplers;
import net.irisshaders.iris.gl.sampler.GlSampler;
import net.irisshaders.iris.gl.sampler.SamplerBinding;
import net.irisshaders.iris.gl.sampler.SamplerHolder;
import net.irisshaders.iris.gl.sampler.SamplerLimits;
import net.irisshaders.iris.gl.state.ValueUpdateNotifier;
import net.irisshaders.iris.gl.texture.TextureType;

public final class ProgramSamplers$Builder
implements SamplerHolder {
    private final int program;
    private final ImmutableSet<Integer> reservedTextureUnits;
    private final ImmutableList.Builder<SamplerBinding> samplers;
    private final ImmutableList.Builder<ValueUpdateNotifier> notifiersToReset;
    private final List<GlUniform1iCall> calls;
    private int remainingUnits;
    private int nextUnit;

    ProgramSamplers$Builder(int n, Set<Integer> set) {
        this.program = n;
        this.reservedTextureUnits = ImmutableSet.copyOf(set);
        this.samplers = ImmutableList.builder();
        this.notifiersToReset = ImmutableList.builder();
        this.calls = new ArrayList<GlUniform1iCall>();
        int n2 = SamplerLimits.get().getMaxTextureUnits();
        for (int n3 : set) {
            if (n3 < n2) continue;
            throw new IllegalStateException("Cannot mark texture unit " + n3 + " as reserved because that texture unit isn't available on this system! Only " + n2 + " texture units are available.");
        }
        this.remainingUnits = n2 - set.size();
        while (set.contains(this.nextUnit)) {
            ++this.nextUnit;
        }
    }

    public ProgramSamplers build() {
        return new ProgramSamplers((ImmutableList<SamplerBinding>)this.samplers.build(), (ImmutableList<ValueUpdateNotifier>)this.notifiersToReset.build(), this.calls);
    }

    @Override
    public void addExternalSampler(int n, String ... stringArray) {
        if (!this.reservedTextureUnits.contains((Object)n)) {
            throw new IllegalArgumentException("Cannot add an externally-managed sampler for texture unit " + n + " since it isn't in the set of reserved texture units.");
        }
        for (String string : stringArray) {
            int n2 = GlStateManager._glGetUniformLocation((int)this.program, (CharSequence)string);
            if (n2 == -1) continue;
            this.calls.add(new GlUniform1iCall(n2, n));
        }
    }

    @Override
    public boolean addDynamicSampler(TextureType textureType, IntSupplier intSupplier, Supplier<GlSampler> supplier, String ... stringArray) {
        return this.addDynamicSampler(textureType, intSupplier, supplier, false, null, stringArray);
    }

    private boolean addDynamicSampler(TextureType textureType, IntSupplier intSupplier, Supplier<GlSampler> supplier, boolean bl, ValueUpdateNotifier valueUpdateNotifier, String ... stringArray) {
        if (valueUpdateNotifier != null) {
            this.notifiersToReset.add((Object)valueUpdateNotifier);
        }
        for (String string : stringArray) {
            int n = GlStateManager._glGetUniformLocation((int)this.program, (CharSequence)string);
            if (n == -1) continue;
            if (this.remainingUnits <= 0) {
                throw new IllegalStateException("No more available texture units while activating sampler " + string);
            }
            this.calls.add(new GlUniform1iCall(n, this.nextUnit));
            bl = true;
        }
        if (!bl) {
            return false;
        }
        this.samplers.add((Object)new SamplerBinding(textureType, this.nextUnit, intSupplier, supplier, valueUpdateNotifier));
        --this.remainingUnits;
        ++this.nextUnit;
        while (this.remainingUnits > 0 && this.reservedTextureUnits.contains((Object)this.nextUnit)) {
            ++this.nextUnit;
        }
        return true;
    }

    @Override
    public boolean addDynamicSampler(TextureType textureType, IntSupplier intSupplier, ValueUpdateNotifier valueUpdateNotifier, Supplier<GlSampler> supplier, String ... stringArray) {
        return this.addDynamicSampler(textureType, intSupplier, supplier, false, valueUpdateNotifier, stringArray);
    }

    @Override
    public boolean addDefaultSampler(TextureType textureType, IntSupplier intSupplier, ValueUpdateNotifier valueUpdateNotifier, Supplier<GlSampler> supplier, String ... stringArray) {
        if (this.nextUnit != 0) {
            throw new IllegalStateException("Texture unit 0 is already used.");
        }
        return this.addDynamicSampler(TextureType.TEXTURE_2D, intSupplier, supplier, true, valueUpdateNotifier, stringArray);
    }

    @Override
    public boolean hasSampler(String string) {
        return GlStateManager._glGetUniformLocation((int)this.program, (CharSequence)string) != -1;
    }
}

