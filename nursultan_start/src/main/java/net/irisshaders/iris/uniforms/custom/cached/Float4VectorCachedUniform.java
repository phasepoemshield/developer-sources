/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 *  net.irisshaders.iris.parsing.VectorType
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 */
package net.irisshaders.iris.uniforms.custom.cached;

import java.util.function.Supplier;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.parsing.VectorType;
import net.irisshaders.iris.uniforms.custom.cached.VectorCachedUniform;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class Float4VectorCachedUniform
extends VectorCachedUniform<Vector4f> {
    public Float4VectorCachedUniform(String string, UniformUpdateFrequency uniformUpdateFrequency, Supplier<Vector4f> supplier) {
        super(string, uniformUpdateFrequency, new Vector4f(), supplier);
    }

    public VectorType getType() {
        return VectorType.VEC4;
    }

    @Override
    public void push(int n) {
        IrisRenderSystem.uniform4f((int)n, (float)((Vector4f)this.cached).x, (float)((Vector4f)this.cached).y, (float)((Vector4f)this.cached).z, (float)((Vector4f)this.cached).w);
    }

    @Override
    protected void setFrom(Vector4f vector4f) {
        ((Vector4f)this.cached).set((Vector4fc)vector4f);
    }
}

