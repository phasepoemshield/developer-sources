/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.pipeline.programs;

import net.irisshaders.iris.shaderpack.loading.ProgramId;

public enum SodiumPrograms$Pass {
    SHADOW(ProgramId.ShadowSolid),
    SHADOW_CUTOUT(ProgramId.ShadowCutout),
    SHADOW_TRANS(ProgramId.ShadowWater),
    TERRAIN(ProgramId.TerrainSolid),
    TERRAIN_CUTOUT(ProgramId.TerrainCutout),
    TRANSLUCENT(ProgramId.Water);

    private final ProgramId originalId;

    private SodiumPrograms$Pass(ProgramId programId) {
        this.originalId = programId;
    }

    public ProgramId getOriginalId() {
        return this.originalId;
    }
}

