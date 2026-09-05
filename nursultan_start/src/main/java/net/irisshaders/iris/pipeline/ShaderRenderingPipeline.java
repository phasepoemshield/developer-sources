/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.uniforms.FrameUpdateNotifier
 */
package net.irisshaders.iris.pipeline;

import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.pipeline.programs.ShaderMap;
import net.irisshaders.iris.uniforms.FrameUpdateNotifier;

public interface ShaderRenderingPipeline
extends WorldRenderingPipeline {
    public boolean shouldOverrideShaders();

    public ShaderMap getShaderMap();

    @Override
    public FrameUpdateNotifier getFrameUpdateNotifier();
}

