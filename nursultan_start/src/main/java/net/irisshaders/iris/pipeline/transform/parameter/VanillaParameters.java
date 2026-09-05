/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  net.irisshaders.iris.gl.blending.AlphaTest
 *  net.irisshaders.iris.gl.state.ShaderAttributeInputs
 *  net.irisshaders.iris.gl.texture.TextureType
 *  net.irisshaders.iris.helpers.Tri
 *  net.irisshaders.iris.shaderpack.texture.TextureStage
 */
package net.irisshaders.iris.pipeline.transform.parameter;

import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import net.irisshaders.iris.gl.blending.AlphaTest;
import net.irisshaders.iris.gl.state.ShaderAttributeInputs;
import net.irisshaders.iris.gl.texture.TextureType;
import net.irisshaders.iris.helpers.Tri;
import net.irisshaders.iris.pipeline.transform.Patch;
import net.irisshaders.iris.pipeline.transform.parameter.GeometryInfoParameters;
import net.irisshaders.iris.shaderpack.texture.TextureStage;

public class VanillaParameters
extends GeometryInfoParameters {
    public final AlphaTest alpha;
    public final ShaderAttributeInputs inputs;
    public final boolean hasChunkOffset;
    private final boolean isLines;
    private final boolean isClouds;

    public VanillaParameters(Patch patch, Object2ObjectMap<Tri<String, TextureType, TextureStage>, String> object2ObjectMap, AlphaTest alphaTest, boolean bl, boolean bl2, boolean bl3, ShaderAttributeInputs shaderAttributeInputs, boolean bl4, boolean bl5) {
        super(patch, object2ObjectMap, bl4, bl5);
        this.alpha = alphaTest;
        this.isLines = bl;
        this.isClouds = bl2;
        this.hasChunkOffset = bl3;
        this.inputs = shaderAttributeInputs;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!super.equals(object)) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        VanillaParameters vanillaParameters = (VanillaParameters)object;
        if (this.alpha == null ? vanillaParameters.alpha != null : !this.alpha.equals((Object)vanillaParameters.alpha)) {
            return false;
        }
        if (this.inputs == null ? vanillaParameters.inputs != null : !this.inputs.equals((Object)vanillaParameters.inputs)) {
            return false;
        }
        if (this.hasChunkOffset != vanillaParameters.hasChunkOffset) {
            return false;
        }
        if (this.isClouds != vanillaParameters.isClouds) {
            return false;
        }
        return this.isLines == vanillaParameters.isLines;
    }

    @Override
    public int hashCode() {
        int n = 31;
        int n2 = super.hashCode();
        n2 = 31 * n2 + (this.alpha == null ? 0 : this.alpha.hashCode());
        n2 = 31 * n2 + (this.inputs == null ? 0 : this.inputs.hashCode());
        n2 = 31 * n2 + (this.hasChunkOffset ? 1231 : 1237);
        n2 = 31 * n2 + (this.isLines ? 1231 : 1237);
        n2 = 31 * n2 + (this.isClouds ? 1231 : 1237);
        return n2;
    }

    @Override
    public AlphaTest getAlphaTest() {
        return this.alpha;
    }

    public boolean isLines() {
        return this.isLines;
    }

    public boolean isClouds() {
        return this.isClouds;
    }

    @Override
    public TextureStage getTextureStage() {
        return TextureStage.GBUFFERS_AND_SHADOW;
    }
}

