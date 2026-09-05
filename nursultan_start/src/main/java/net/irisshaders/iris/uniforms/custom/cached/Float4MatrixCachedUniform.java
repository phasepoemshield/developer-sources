/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 *  net.irisshaders.iris.parsing.MatrixType
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package net.irisshaders.iris.uniforms.custom.cached;

import java.util.function.Supplier;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.parsing.MatrixType;
import net.irisshaders.iris.uniforms.custom.cached.VectorCachedUniform;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public class Float4MatrixCachedUniform
extends VectorCachedUniform<Matrix4fc> {
    private final float[] buffer = new float[16];

    public Float4MatrixCachedUniform(String string, UniformUpdateFrequency uniformUpdateFrequency, Supplier<Matrix4fc> supplier) {
        super(string, uniformUpdateFrequency, new Matrix4f(), supplier);
    }

    public MatrixType<Matrix4f> getType() {
        return MatrixType.MAT4;
    }

    @Override
    public void push(int n) {
        ((Matrix4fc)this.cached).get(this.buffer);
        IrisRenderSystem.uniformMatrix4fv((int)n, (boolean)false, (float[])this.buffer);
    }

    @Override
    protected void setFrom(Matrix4fc matrix4fc) {
        ((Matrix4f)this.cached).set(matrix4fc);
    }
}

