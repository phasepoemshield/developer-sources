/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08188
 *  net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer
 *  net.caffeinemc.mods.sodium.client.util.FogParameters
 *  org.joml.Matrix4fc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.shader;

import minecraft.class08188;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass;
import net.caffeinemc.mods.sodium.client.util.FogParameters;
import org.joml.Matrix4fc;

public interface ChunkShaderInterface {
    @Deprecated
    public void resetState();

    public void setProjectionMatrix(Matrix4fc var1);

    public void setRegionOffset(float var1, float var2, float var3);

    public void setChunkData(GlBuffer var1, int var2);

    public void setModelViewMatrix(Matrix4fc var1);

    @Deprecated
    public void setupState(TerrainRenderPass var1, FogParameters var2, class08188 var3);
}

