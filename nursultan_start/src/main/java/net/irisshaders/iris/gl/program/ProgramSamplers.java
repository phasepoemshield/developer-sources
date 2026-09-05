/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  net.irisshaders.iris.gl.texture.TextureAccess
 *  net.irisshaders.iris.mixin.GlStateManagerAccessor
 */
package net.irisshaders.iris.gl.program;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.blaze3d.opengl.GlStateManager;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import java.util.List;
import java.util.Set;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.program.GlUniform1iCall;
import net.irisshaders.iris.gl.program.ProgramSamplers$Builder;
import net.irisshaders.iris.gl.program.ProgramSamplers$CustomTextureSamplerInterceptor;
import net.irisshaders.iris.gl.sampler.SamplerBinding;
import net.irisshaders.iris.gl.sampler.SamplerHolder;
import net.irisshaders.iris.gl.state.ValueUpdateNotifier;
import net.irisshaders.iris.gl.texture.TextureAccess;
import net.irisshaders.iris.mixin.GlStateManagerAccessor;

public class ProgramSamplers {
    private static ProgramSamplers active;
    private final ImmutableList<SamplerBinding> samplerBindings;
    private final ImmutableList<ValueUpdateNotifier> notifiersToReset;
    private List<GlUniform1iCall> initializer;

    ProgramSamplers(ImmutableList<SamplerBinding> immutableList, ImmutableList<ValueUpdateNotifier> immutableList2, List<GlUniform1iCall> list) {
        this.samplerBindings = immutableList;
        this.notifiersToReset = immutableList2;
        this.initializer = list;
    }

    public void update() {
        if (active != null) {
            active.removeListeners();
        }
        active = this;
        if (this.initializer != null) {
            for (GlUniform1iCall glUniform1iCall : this.initializer) {
                GlStateManager._glUniform1i((int)glUniform1iCall.location(), (int)glUniform1iCall.value());
            }
            this.initializer = null;
        }
        int n = GlStateManagerAccessor.getActiveTexture();
        for (SamplerBinding samplerBinding : this.samplerBindings) {
            samplerBinding.update();
        }
        GlStateManager._activeTexture((int)(33984 + n));
    }

    public static ProgramSamplers$Builder builder(int n, Set<Integer> set) {
        return new ProgramSamplers$Builder(n, set);
    }

    public static ProgramSamplers$CustomTextureSamplerInterceptor customTextureSamplerInterceptor(SamplerHolder samplerHolder, Object2ObjectMap<String, TextureAccess> object2ObjectMap, ImmutableSet<Integer> immutableSet) {
        return new ProgramSamplers$CustomTextureSamplerInterceptor(samplerHolder, object2ObjectMap, immutableSet);
    }

    public static ProgramSamplers$CustomTextureSamplerInterceptor customTextureSamplerInterceptor(SamplerHolder samplerHolder, Object2ObjectMap<String, TextureAccess> object2ObjectMap) {
        return ProgramSamplers.customTextureSamplerInterceptor(samplerHolder, object2ObjectMap, (ImmutableSet<Integer>)ImmutableSet.of());
    }

    public void removeListeners() {
        active = null;
        for (ValueUpdateNotifier valueUpdateNotifier : this.notifiersToReset) {
            valueUpdateNotifier.setListener(null);
        }
    }

    public static void clearActiveSamplers() {
        if (active != null) {
            active.removeListeners();
        }
        IrisRenderSystem.unbindAllSamplers();
    }
}

