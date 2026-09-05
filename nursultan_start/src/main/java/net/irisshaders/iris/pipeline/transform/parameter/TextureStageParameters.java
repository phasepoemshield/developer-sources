/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  net.irisshaders.iris.gl.texture.TextureType
 *  net.irisshaders.iris.helpers.Tri
 *  net.irisshaders.iris.shaderpack.texture.TextureStage
 */
package net.irisshaders.iris.pipeline.transform.parameter;

import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import net.irisshaders.iris.gl.texture.TextureType;
import net.irisshaders.iris.helpers.Tri;
import net.irisshaders.iris.pipeline.transform.Patch;
import net.irisshaders.iris.pipeline.transform.parameter.Parameters;
import net.irisshaders.iris.shaderpack.texture.TextureStage;

public class TextureStageParameters
extends Parameters {
    private final TextureStage stage;

    public TextureStageParameters(Patch patch, TextureStage textureStage, Object2ObjectMap<Tri<String, TextureType, TextureStage>, String> object2ObjectMap) {
        super(patch, object2ObjectMap);
        this.stage = textureStage;
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
        TextureStageParameters textureStageParameters = (TextureStageParameters)object;
        return this.stage == textureStageParameters.stage;
    }

    @Override
    public int hashCode() {
        int n = 31;
        int n2 = super.hashCode();
        n2 = 31 * n2 + (this.stage == null ? 0 : this.stage.hashCode());
        return n2;
    }

    @Override
    public TextureStage getTextureStage() {
        return this.stage;
    }
}

