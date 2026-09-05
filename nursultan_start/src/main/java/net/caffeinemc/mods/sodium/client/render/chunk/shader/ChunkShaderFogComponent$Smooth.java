/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformFloat2v
 *  net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformFloat4v
 *  net.caffeinemc.mods.sodium.client.util.FogParameters
 */
package net.caffeinemc.mods.sodium.client.render.chunk.shader;

import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformFloat2v;
import net.caffeinemc.mods.sodium.client.gl.shader.uniform.GlUniformFloat4v;
import net.caffeinemc.mods.sodium.client.render.chunk.shader.ChunkShaderFogComponent;
import net.caffeinemc.mods.sodium.client.render.chunk.shader.ShaderBindingContext;
import net.caffeinemc.mods.sodium.client.util.FogParameters;

public class ChunkShaderFogComponent$Smooth
extends ChunkShaderFogComponent {
    private final GlUniformFloat4v uFogColor;
    private final GlUniformFloat2v uEnvironmentFog;
    private final GlUniformFloat2v uRenderFog;

    public ChunkShaderFogComponent$Smooth(ShaderBindingContext shaderBindingContext) {
        this.uFogColor = shaderBindingContext.bindUniform("u_FogColor", GlUniformFloat4v::new);
        this.uEnvironmentFog = shaderBindingContext.bindUniform("u_EnvironmentFog", GlUniformFloat2v::new);
        this.uRenderFog = shaderBindingContext.bindUniform("u_RenderFog", GlUniformFloat2v::new);
    }

    @Override
    public void setup(FogParameters fogParameters) {
        this.uFogColor.set(fogParameters.red(), fogParameters.green(), fogParameters.blue(), fogParameters.alpha());
        this.uEnvironmentFog.set(fogParameters.environmentalStart(), fogParameters.environmentalEnd());
        this.uRenderFog.set(fogParameters.renderStart(), fogParameters.renderEnd());
    }
}

