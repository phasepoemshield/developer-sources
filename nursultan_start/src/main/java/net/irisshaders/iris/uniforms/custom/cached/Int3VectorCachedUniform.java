/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 *  net.irisshaders.iris.parsing.VectorType
 *  org.joml.Vector3i
 *  org.joml.Vector3ic
 */
package net.irisshaders.iris.uniforms.custom.cached;

import java.util.function.Supplier;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.parsing.VectorType;
import net.irisshaders.iris.uniforms.custom.cached.VectorCachedUniform;
import org.joml.Vector3i;
import org.joml.Vector3ic;

public class Int3VectorCachedUniform
extends VectorCachedUniform<Vector3i> {
    public Int3VectorCachedUniform(String string, UniformUpdateFrequency uniformUpdateFrequency, Supplier<Vector3i> supplier) {
        super(string, uniformUpdateFrequency, new Vector3i(), supplier);
    }

    public VectorType getType() {
        return VectorType.I_VEC3;
    }

    @Override
    public void push(int n) {
        IrisRenderSystem.uniform3i((int)n, (int)((Vector3i)this.cached).x, (int)((Vector3i)this.cached).y, (int)((Vector3i)this.cached).z);
    }

    @Override
    protected void setFrom(Vector3i vector3i) {
        ((Vector3i)this.cached).set((Vector3ic)vector3i);
    }
}

