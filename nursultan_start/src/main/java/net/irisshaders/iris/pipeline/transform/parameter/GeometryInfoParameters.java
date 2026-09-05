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

public abstract class GeometryInfoParameters
extends Parameters {
    public final boolean hasGeometry;
    public final boolean hasTesselation;

    public GeometryInfoParameters(Patch patch, Object2ObjectMap<Tri<String, TextureType, TextureStage>, String> object2ObjectMap, boolean bl, boolean bl2) {
        super(patch, object2ObjectMap);
        this.hasGeometry = bl;
        this.hasTesselation = bl2;
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
        GeometryInfoParameters geometryInfoParameters = (GeometryInfoParameters)object;
        return this.hasGeometry == geometryInfoParameters.hasGeometry;
    }

    @Override
    public int hashCode() {
        int n = 31;
        int n2 = super.hashCode();
        n2 = 31 * n2 + (this.hasGeometry ? 1231 : 1237);
        return n2;
    }
}

