/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  minecraft.class05096
 *  net.irisshaders.iris.gui.screen.ShaderPackScreen
 *  net.irisshaders.iris.pipeline.IrisPipelines
 *  net.irisshaders.iris.pipeline.VanillaRenderingPipeline
 *  net.irisshaders.iris.pipeline.WorldRenderingPipeline
 *  net.irisshaders.iris.pipeline.programs.ShaderKey
 *  net.irisshaders.iris.shaderpack.loading.ProgramId
 *  net.irisshaders.iris.shadows.ShadowRenderingState
 *  net.irisshaders.iris.vertices.IrisTextVertexSinkImpl
 */
package net.irisshaders.iris.apiimpl;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.nio.ByteBuffer;
import java.util.function.IntFunction;
import minecraft.class05096;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.api.v0.IrisApi;
import net.irisshaders.iris.api.v0.IrisApiConfig;
import net.irisshaders.iris.api.v0.IrisProgram;
import net.irisshaders.iris.api.v0.IrisTextVertexSink;
import net.irisshaders.iris.apiimpl.IrisApiV0ConfigImpl;
import net.irisshaders.iris.gui.screen.ShaderPackScreen;
import net.irisshaders.iris.pipeline.IrisPipelines;
import net.irisshaders.iris.pipeline.VanillaRenderingPipeline;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.pipeline.programs.ShaderKey;
import net.irisshaders.iris.shaderpack.loading.ProgramId;
import net.irisshaders.iris.shadows.ShadowRenderingState;
import net.irisshaders.iris.vertices.IrisTextVertexSinkImpl;

public class IrisApiV0Impl
implements IrisApi {
    public static final IrisApiV0Impl INSTANCE = new IrisApiV0Impl();
    private static final IrisApiV0ConfigImpl CONFIG = new IrisApiV0ConfigImpl();

    @Override
    public float getSunPathRotation() {
        WorldRenderingPipeline worldRenderingPipeline = Iris.getPipelineManager().getPipelineNullable();
        if (worldRenderingPipeline == null) {
            return 0.0f;
        }
        return worldRenderingPipeline.getSunPathRotation();
    }

    @Override
    public IrisApiConfig getConfig() {
        return CONFIG;
    }

    @Override
    public void assignPipeline(RenderPipeline renderPipeline, IrisProgram irisProgram) {
        IrisPipelines.assignPipeline((RenderPipeline)renderPipeline, (ShaderKey)ShaderKey.findBestMatch((RenderPipeline)renderPipeline, (ProgramId)ProgramId.fromAPI((IrisProgram)irisProgram)));
    }

    @Override
    public boolean isShaderPackInUse() {
        WorldRenderingPipeline worldRenderingPipeline = Iris.getPipelineManager().getPipelineNullable();
        if (worldRenderingPipeline == null) {
            return false;
        }
        return !(worldRenderingPipeline instanceof VanillaRenderingPipeline);
    }

    @Override
    public IrisTextVertexSink createTextVertexSink(int n, IntFunction<ByteBuffer> intFunction) {
        return new IrisTextVertexSinkImpl(n, intFunction);
    }

    @Override
    public int getMinorApiRevision() {
        return 3;
    }

    @Override
    public boolean isRenderingShadowPass() {
        return ShadowRenderingState.areShadowsCurrentlyBeingRendered();
    }

    @Override
    public String getMainScreenLanguageKey() {
        return "options.iris.shaderPackSelection";
    }

    @Override
    public Object openMainIrisScreenObj(Object object) {
        return new ShaderPackScreen((class05096)object);
    }
}

