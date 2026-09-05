/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.gl.shader.ShaderConstants
 *  net.caffeinemc.mods.sodium.client.gl.shader.ShaderConstants$Builder
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType
 */
package net.caffeinemc.mods.sodium.client.render.chunk.shader;

import net.caffeinemc.mods.sodium.client.gl.shader.ShaderConstants;
import net.caffeinemc.mods.sodium.client.render.chunk.shader.ChunkFogMode;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType;

public record ChunkShaderOptions(ChunkFogMode fog, TerrainRenderPass pass, ChunkVertexType vertexType) {
    public ShaderConstants constants() {
        ShaderConstants.Builder builder = ShaderConstants.builder();
        builder.addAll(this.fog.getDefines());
        if (this.pass.supportsFragmentDiscard()) {
            builder.add("USE_FRAGMENT_DISCARD");
        }
        builder.add("USE_VERTEX_COMPRESSION");
        return builder.build();
    }
}

