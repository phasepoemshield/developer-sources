/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  net.irisshaders.iris.gl.blending.AlphaTest
 *  net.irisshaders.iris.gl.texture.TextureType
 *  net.irisshaders.iris.helpers.Tri
 *  net.irisshaders.iris.shaderpack.texture.TextureStage
 */
package net.irisshaders.iris.pipeline.transform.parameter;

import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import net.irisshaders.iris.gl.blending.AlphaTest;
import net.irisshaders.iris.gl.texture.TextureType;
import net.irisshaders.iris.helpers.Tri;
import net.irisshaders.iris.pipeline.transform.Patch;
import net.irisshaders.iris.pipeline.transform.parameter.Parameters;
import net.irisshaders.iris.shaderpack.texture.TextureStage;

public class SodiumParameters
extends Parameters {
    public final AlphaTest alpha;

    public SodiumParameters(Patch patch, Object2ObjectMap<Tri<String, TextureType, TextureStage>, String> object2ObjectMap, AlphaTest alphaTest) {
        super(patch, object2ObjectMap);
        this.alpha = alphaTest;
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
        SodiumParameters sodiumParameters = (SodiumParameters)object;
        if (this.alpha == null) {
            return sodiumParameters.alpha == null;
        }
        return this.alpha.equals((Object)sodiumParameters.alpha);
    }

    @Override
    public int hashCode() {
        int n = 31;
        int n2 = super.hashCode();
        n2 = 31 * n2 + (this.alpha == null ? 0 : this.alpha.hashCode());
        return n2;
    }

    @Override
    public AlphaTest getAlphaTest() {
        return this.alpha;
    }

    @Override
    public TextureStage getTextureStage() {
        return TextureStage.GBUFFERS_AND_SHADOW;
    }
}

