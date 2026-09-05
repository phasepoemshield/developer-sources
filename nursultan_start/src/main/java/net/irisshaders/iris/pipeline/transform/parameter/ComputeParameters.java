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
import net.irisshaders.iris.pipeline.transform.parameter.TextureStageParameters;
import net.irisshaders.iris.shaderpack.texture.TextureStage;

public class ComputeParameters
extends TextureStageParameters {
    public ComputeParameters(Patch patch, TextureStage textureStage, Object2ObjectMap<Tri<String, TextureType, TextureStage>, String> object2ObjectMap) {
        super(patch, textureStage, object2ObjectMap);
    }
}

