/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kroppeb.stareval.function.FunctionReturn
 *  kroppeb.stareval.function.Type
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.uniform.FloatSupplier
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 */
package net.irisshaders.iris.uniforms.custom.cached;

import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.uniform.FloatSupplier;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.uniforms.custom.cached.CachedUniform;

public class FloatCachedUniform
extends CachedUniform {
    private final FloatSupplier supplier;
    private float cached;

    public FloatCachedUniform(String string, UniformUpdateFrequency uniformUpdateFrequency, FloatSupplier floatSupplier) {
        super(string, uniformUpdateFrequency);
        this.supplier = floatSupplier;
    }

    @Override
    public Type getType() {
        return Type.Float;
    }

    @Override
    public void push(int n) {
        IrisRenderSystem.uniform1f((int)n, (float)this.cached);
    }

    @Override
    public void writeTo(FunctionReturn functionReturn) {
        functionReturn.floatReturn = this.cached;
    }

    @Override
    protected boolean doUpdate() {
        float f = this.cached;
        this.cached = this.supplier.getAsFloat();
        return f != this.cached;
    }
}

