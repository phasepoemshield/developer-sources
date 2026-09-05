/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 *  net.irisshaders.iris.parsing.VectorType
 *  org.joml.Vector2f
 *  org.joml.Vector2fc
 */
package net.irisshaders.iris.uniforms.custom.cached;

import java.util.function.Supplier;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.parsing.VectorType;
import net.irisshaders.iris.uniforms.custom.cached.VectorCachedUniform;
import org.joml.Vector2f;
import org.joml.Vector2fc;

public class Float2VectorCachedUniform
extends VectorCachedUniform<Vector2f> {
    public Float2VectorCachedUniform(String string, UniformUpdateFrequency uniformUpdateFrequency, Supplier<Vector2f> supplier) {
        super(string, uniformUpdateFrequency, new Vector2f(), supplier);
    }

    public VectorType getType() {
        return VectorType.VEC2;
    }

    @Override
    public void push(int n) {
        IrisRenderSystem.uniform2f((int)n, (float)((Vector2f)this.cached).x, (float)((Vector2f)this.cached).y);
    }

    @Override
    protected void setFrom(Vector2f vector2f) {
        ((Vector2f)this.cached).set((Vector2fc)vector2f);
    }
}

