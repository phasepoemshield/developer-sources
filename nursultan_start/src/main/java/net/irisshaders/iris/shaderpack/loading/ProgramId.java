/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.irisshaders.iris.api.v0.IrisProgram
 *  net.irisshaders.iris.gl.blending.BlendMode
 *  net.irisshaders.iris.gl.blending.BlendModeFunction
 *  net.irisshaders.iris.gl.blending.BlendModeOverride
 */
package net.irisshaders.iris.shaderpack.loading;

import java.util.Objects;
import java.util.Optional;
import net.irisshaders.iris.api.v0.IrisProgram;
import net.irisshaders.iris.gl.blending.BlendMode;
import net.irisshaders.iris.gl.blending.BlendModeFunction;
import net.irisshaders.iris.gl.blending.BlendModeOverride;
import net.irisshaders.iris.shaderpack.loading.ProgramGroup;

public enum ProgramId {
    Shadow(ProgramGroup.Shadow, "", BlendModeOverride.OFF),
    ShadowSolid(ProgramGroup.Shadow, "solid", Shadow, BlendModeOverride.OFF),
    ShadowCutout(ProgramGroup.Shadow, "cutout", Shadow, BlendModeOverride.OFF),
    ShadowWater(ProgramGroup.Shadow, "water", Shadow, BlendModeOverride.OFF),
    ShadowEntities(ProgramGroup.Shadow, "entities", Shadow, BlendModeOverride.OFF),
    ShadowLightning(ProgramGroup.Shadow, "lightning", ShadowEntities, BlendModeOverride.OFF),
    ShadowBlock(ProgramGroup.Shadow, "block", Shadow, BlendModeOverride.OFF),
    Basic(ProgramGroup.Gbuffers, "basic"),
    Line(ProgramGroup.Gbuffers, "line", Basic),
    Textured(ProgramGroup.Gbuffers, "textured", Basic),
    TexturedLit(ProgramGroup.Gbuffers, "textured_lit", Textured),
    SkyBasic(ProgramGroup.Gbuffers, "skybasic", Basic),
    SkyTextured(ProgramGroup.Gbuffers, "skytextured", Textured),
    Clouds(ProgramGroup.Gbuffers, "clouds", Textured),
    Terrain(ProgramGroup.Gbuffers, "terrain", TexturedLit),
    TerrainSolid(ProgramGroup.Gbuffers, "terrain_solid", Terrain),
    TerrainCutout(ProgramGroup.Gbuffers, "terrain_cutout", Terrain),
    DamagedBlock(ProgramGroup.Gbuffers, "damagedblock", Terrain),
    Block(ProgramGroup.Gbuffers, "block", Terrain),
    BlockTrans(ProgramGroup.Gbuffers, "block_translucent", Block),
    BeaconBeam(ProgramGroup.Gbuffers, "beaconbeam", Textured),
    Item(ProgramGroup.Gbuffers, "item", TexturedLit),
    Entities(ProgramGroup.Gbuffers, "entities", TexturedLit),
    EntitiesTrans(ProgramGroup.Gbuffers, "entities_translucent", Entities),
    Lightning(ProgramGroup.Gbuffers, "lightning", Entities),
    Particles(ProgramGroup.Gbuffers, "particles", TexturedLit),
    ParticlesTrans(ProgramGroup.Gbuffers, "particles_translucent", Particles),
    EntitiesGlowing(ProgramGroup.Gbuffers, "entities_glowing", Entities),
    ArmorGlint(ProgramGroup.Gbuffers, "armor_glint", Textured),
    SpiderEyes(ProgramGroup.Gbuffers, "spidereyes", Textured, new BlendModeOverride(new BlendMode(BlendModeFunction.SRC_ALPHA.getGlId(), BlendModeFunction.ONE.getGlId(), BlendModeFunction.ZERO.getGlId(), BlendModeFunction.ONE.getGlId()))),
    Hand(ProgramGroup.Gbuffers, "hand", TexturedLit),
    Weather(ProgramGroup.Gbuffers, "weather", TexturedLit),
    Water(ProgramGroup.Gbuffers, "water", Terrain),
    HandWater(ProgramGroup.Gbuffers, "hand_water", Hand),
    DhTerrain(ProgramGroup.Dh, "terrain"),
    DhWater(ProgramGroup.Dh, "water", DhTerrain),
    DhGeneric(ProgramGroup.Dh, "generic", DhTerrain),
    DhShadow(ProgramGroup.Dh, "shadow"),
    Final(ProgramGroup.Final, "");

    private final ProgramGroup group;
    private final String sourceName;
    private final ProgramId fallback;
    private final BlendModeOverride defaultBlendOverride;

    private ProgramId(ProgramGroup programGroup, String string2, ProgramId programId) {
        this.group = programGroup;
        this.sourceName = string2.isEmpty() ? programGroup.getBaseName() : programGroup.getBaseName() + "_" + string2;
        this.fallback = Objects.requireNonNull(programId);
        this.defaultBlendOverride = null;
    }

    private ProgramId(ProgramGroup programGroup, String string2, ProgramId programId, BlendModeOverride blendModeOverride) {
        this.group = programGroup;
        this.sourceName = string2.isEmpty() ? programGroup.getBaseName() : programGroup.getBaseName() + "_" + string2;
        this.fallback = Objects.requireNonNull(programId);
        this.defaultBlendOverride = blendModeOverride;
    }

    private ProgramId(ProgramGroup programGroup, String string2) {
        this.group = programGroup;
        this.sourceName = string2.isEmpty() ? programGroup.getBaseName() : programGroup.getBaseName() + "_" + string2;
        this.fallback = null;
        this.defaultBlendOverride = null;
    }

    private ProgramId(ProgramGroup programGroup, String string2, BlendModeOverride blendModeOverride) {
        this.group = programGroup;
        this.sourceName = string2.isEmpty() ? programGroup.getBaseName() : programGroup.getBaseName() + "_" + string2;
        this.fallback = null;
        this.defaultBlendOverride = blendModeOverride;
    }

    public ProgramGroup getGroup() {
        return this.group;
    }

    public Optional<ProgramId> getFallback() {
        return Optional.ofNullable(this.fallback);
    }

    public BlendModeOverride getBlendModeOverride() {
        return this.defaultBlendOverride;
    }

    public static ProgramId fromAPI(IrisProgram irisProgram) {
        return switch (irisProgram) {
            default -> throw new MatchException(null, null);
            case IrisProgram.BASIC -> Basic;
            case IrisProgram.TEXTURED -> Textured;
            case IrisProgram.TERRAIN -> Terrain;
            case IrisProgram.TERRAIN_SOLID -> TerrainSolid;
            case IrisProgram.TERRAIN_CUTOUT -> TerrainCutout;
            case IrisProgram.TRANSLUCENT -> Water;
            case IrisProgram.SKY_BASIC -> SkyBasic;
            case IrisProgram.SKY_TEXTURED -> SkyTextured;
            case IrisProgram.ARMOR_GLINT -> ArmorGlint;
            case IrisProgram.ENTITIES -> Entities;
            case IrisProgram.ENTITIES_TRANSLUCENT -> EntitiesTrans;
            case IrisProgram.CLOUDS -> Clouds;
            case IrisProgram.BLOCK -> Block;
            case IrisProgram.BLOCK_TRANSLUCENT -> BlockTrans;
            case IrisProgram.HAND -> Hand;
            case IrisProgram.HAND_TRANSLUCENT -> HandWater;
            case IrisProgram.PARTICLES -> Particles;
            case IrisProgram.PARTICLES_TRANSLUCENT -> ParticlesTrans;
            case IrisProgram.EMISSIVE_ENTITIES -> SpiderEyes;
            case IrisProgram.BEACON_BEAM -> BeaconBeam;
            case IrisProgram.LINES -> Line;
        };
    }

    public String getSourceName() {
        return this.sourceName;
    }
}

