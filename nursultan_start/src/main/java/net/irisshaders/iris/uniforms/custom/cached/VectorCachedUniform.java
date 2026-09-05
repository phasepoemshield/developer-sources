/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kroppeb.stareval.function.FunctionReturn
 *  kroppeb.stareval.function.Type
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 */
package net.irisshaders.iris.uniforms.custom.cached;

import java.util.function.Supplier;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.uniforms.custom.cached.CachedUniform;

public abstract class VectorCachedUniform<T>
extends CachedUniform {
    protected final T cached;
    private final Supplier<T> supplier;

    public VectorCachedUniform(String string, UniformUpdateFrequency uniformUpdateFrequency, T t, Supplier<T> supplier) {
        super(string, uniformUpdateFrequency);
        this.supplier = supplier;
        this.cached = t;
    }

    @Override
    public Type getType() {
        return Type.Float;
    }

    @Override
    public void writeTo(FunctionReturn functionReturn) {
        functionReturn.objectReturn = this.cached;
    }

    @Override
    protected boolean doUpdate() {
        T t = this.supplier.get();
        if (t == null) {
            Iris.logger.warn("Cached Uniform supplier gave null back");
            return false;
        }
        if (!this.cached.equals(t)) {
            this.setFrom(t);
            return true;
        }
        return false;
    }

    protected abstract void setFrom(T var1);
}

