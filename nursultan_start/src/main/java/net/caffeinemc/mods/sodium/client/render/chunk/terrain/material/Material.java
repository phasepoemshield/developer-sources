/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk.terrain.material;

import net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.parameters.AlphaCutoffParameter;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.parameters.MaterialParameters;

public class Material {
    public final TerrainRenderPass pass;
    public final int packed;
    public final AlphaCutoffParameter alphaCutoff;
    public final boolean mipped;

    public int bits() {
        return this.packed;
    }

    public Material(TerrainRenderPass terrainRenderPass, AlphaCutoffParameter alphaCutoffParameter, boolean bl) {
        this.pass = terrainRenderPass;
        this.packed = MaterialParameters.pack(alphaCutoffParameter, bl);
        this.alphaCutoff = alphaCutoffParameter;
        this.mipped = bl;
    }

    public boolean isTranslucent() {
        return this.pass.isTranslucent();
    }
}

