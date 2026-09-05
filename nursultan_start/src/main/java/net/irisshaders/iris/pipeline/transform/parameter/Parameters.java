/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.ast.transform.JobParameters
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  net.irisshaders.iris.gl.blending.AlphaTest
 *  net.irisshaders.iris.gl.texture.TextureType
 *  net.irisshaders.iris.helpers.Tri
 *  net.irisshaders.iris.shaderpack.texture.TextureStage
 */
package net.irisshaders.iris.pipeline.transform.parameter;

import io.github.douira.glsl_transformer.ast.transform.JobParameters;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import net.irisshaders.iris.gl.blending.AlphaTest;
import net.irisshaders.iris.gl.texture.TextureType;
import net.irisshaders.iris.helpers.Tri;
import net.irisshaders.iris.pipeline.transform.Patch;
import net.irisshaders.iris.pipeline.transform.PatchShaderType;
import net.irisshaders.iris.shaderpack.texture.TextureStage;

public abstract class Parameters
implements JobParameters {
    public final Patch patch;
    private final Object2ObjectMap<Tri<String, TextureType, TextureStage>, String> textureMap;
    public PatchShaderType type;
    public String name;

    public Object2ObjectMap<Tri<String, TextureType, TextureStage>, String> getTextureMap() {
        return this.textureMap;
    }

    public Parameters(Patch patch, Object2ObjectMap<Tri<String, TextureType, TextureStage>, String> object2ObjectMap) {
        this.patch = patch;
        this.textureMap = object2ObjectMap;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        Parameters parameters = (Parameters)object;
        if (this.patch != parameters.patch) {
            return false;
        }
        if (this.textureMap == null) {
            return parameters.textureMap == null;
        }
        return this.textureMap.equals(parameters.textureMap);
    }

    public int hashCode() {
        int n = 31;
        int n2 = 1;
        n2 = 31 * n2 + (this.patch == null ? 0 : this.patch.hashCode());
        n2 = 31 * n2 + (this.textureMap == null ? 0 : this.textureMap.hashCode());
        return n2;
    }

    public AlphaTest getAlphaTest() {
        return AlphaTest.ALWAYS;
    }

    public abstract TextureStage getTextureStage();
}

