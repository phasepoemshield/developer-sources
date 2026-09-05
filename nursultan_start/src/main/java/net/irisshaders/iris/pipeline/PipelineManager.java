/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  minecraft.class03063
 *  minecraft.class06202
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  net.irisshaders.iris.uniforms.SystemTimeUniforms
 */
package net.irisshaders.iris.pipeline;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import minecraft.class03063;
import minecraft.class06202;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.pipeline.VanillaRenderingPipeline;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.uniforms.SystemTimeUniforms;

public class PipelineManager {
    private final Function<NamespacedId, WorldRenderingPipeline> pipelineFactory;
    private final Map<NamespacedId, WorldRenderingPipeline> pipelinesPerDimension = new HashMap<NamespacedId, WorldRenderingPipeline>();
    private WorldRenderingPipeline pipeline = new VanillaRenderingPipeline();
    private int versionCounterForSodiumShaderReload = 0;

    public WorldRenderingPipeline preparePipeline(NamespacedId namespacedId) {
        if (!this.pipelinesPerDimension.containsKey(namespacedId)) {
            SystemTimeUniforms.COUNTER.reset();
            SystemTimeUniforms.TIMER.reset();
            Iris.logger.info("Creating pipeline for dimension {}", new Object[]{namespacedId});
            this.pipeline = this.pipelineFactory.apply(namespacedId);
            this.pipelinesPerDimension.put(namespacedId, this.pipeline);
            if (WorldRenderingSettings.INSTANCE.isReloadRequired()) {
                if ((class03063)class06202.Nq().B_2 != null) {
                    ((class03063)class06202.Nq().B_2).u();
                }
                WorldRenderingSettings.INSTANCE.clearReloadRequired();
            }
        } else {
            this.pipeline = this.pipelinesPerDimension.get(namespacedId);
        }
        return this.pipeline;
    }

    public void destroyPipeline() {
        this.pipelinesPerDimension.forEach((namespacedId, worldRenderingPipeline) -> {
            Iris.logger.info("Destroying pipeline {}", new Object[]{namespacedId});
            this.resetTextureState();
            worldRenderingPipeline.destroy();
        });
        this.pipelinesPerDimension.clear();
        this.pipeline = null;
        ++this.versionCounterForSodiumShaderReload;
    }

    private void resetTextureState() {
        for (int i = 0; i < GlStateManager.TEXTURES.length; ++i) {
            GlStateManager._activeTexture((int)(33984 + i));
            GlStateManager._bindTexture((int)0);
        }
        GlStateManager._activeTexture((int)33984);
    }

    public PipelineManager(Function<NamespacedId, WorldRenderingPipeline> function) {
        this.pipelineFactory = function;
    }

    public Optional<WorldRenderingPipeline> getPipeline() {
        return Optional.ofNullable(this.pipeline);
    }

    public WorldRenderingPipeline getPipelineNullable() {
        return this.pipeline;
    }

    public int getVersionCounterForSodiumShaderReload() {
        return this.versionCounterForSodiumShaderReload;
    }
}

