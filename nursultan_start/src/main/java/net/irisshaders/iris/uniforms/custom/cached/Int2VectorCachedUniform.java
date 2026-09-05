/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kroppeb.stareval.function.FunctionReturn
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 *  net.irisshaders.iris.parsing.VectorType
 *  org.joml.Vector2i
 *  org.joml.Vector2ic
 */
package net.irisshaders.iris.uniforms.custom.cached;

import java.util.function.Supplier;
import kroppeb.stareval.function.FunctionReturn;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.parsing.VectorType;
import net.irisshaders.iris.uniforms.custom.cached.VectorCachedUniform;
import org.joml.Vector2i;
import org.joml.Vector2ic;

public class Int2VectorCachedUniform
extends VectorCachedUniform<Vector2i> {
    public Int2VectorCachedUniform(String string, UniformUpdateFrequency uniformUpdateFrequency, Supplier<Vector2i> supplier) {
        super(string, uniformUpdateFrequency, new Vector2i(), supplier);
    }

    public VectorType getType() {
        return VectorType.I_VEC2;
    }

    @Override
    public void push(int n) {
        IrisRenderSystem.uniform2i((int)n, (int)((Vector2i)this.cached).x, (int)((Vector2i)this.cached).y);
    }

    @Override
    public void writeTo(FunctionReturn functionReturn) {
        functionReturn.objectReturn = this.cached;
    }

    @Override
    protected void setFrom(Vector2i vector2i) {
        ((Vector2i)this.cached).set((Vector2ic)vector2i);
    }
}

