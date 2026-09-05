/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 *  net.irisshaders.iris.parsing.VectorType
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package net.irisshaders.iris.uniforms.custom.cached;

import java.util.function.Supplier;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.parsing.VectorType;
import net.irisshaders.iris.uniforms.custom.cached.VectorCachedUniform;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class Float3VectorCachedUniform
extends VectorCachedUniform<Vector3f> {
    public Float3VectorCachedUniform(String string, UniformUpdateFrequency uniformUpdateFrequency, Supplier<Vector3f> supplier) {
        super(string, uniformUpdateFrequency, new Vector3f(), supplier);
    }

    public VectorType getType() {
        return VectorType.VEC3;
    }

    @Override
    public void push(int n) {
        IrisRenderSystem.uniform3f((int)n, (float)((Vector3f)this.cached).x, (float)((Vector3f)this.cached).y, (float)((Vector3f)this.cached).z);
    }

    @Override
    protected void setFrom(Vector3f vector3f) {
        ((Vector3f)this.cached).set((Vector3fc)vector3f);
    }
}

