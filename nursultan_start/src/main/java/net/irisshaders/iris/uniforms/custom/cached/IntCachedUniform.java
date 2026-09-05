/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  kroppeb.stareval.function.FunctionReturn
 *  kroppeb.stareval.function.Type
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 */
package net.irisshaders.iris.uniforms.custom.cached;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.function.IntSupplier;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.uniforms.custom.cached.CachedUniform;

public class IntCachedUniform
extends CachedUniform {
    private final IntSupplier supplier;
    private int cached;

    public IntCachedUniform(String string, UniformUpdateFrequency uniformUpdateFrequency, IntSupplier intSupplier) {
        super(string, uniformUpdateFrequency);
        this.supplier = intSupplier;
    }

    @Override
    public Type getType() {
        return Type.Int;
    }

    @Override
    public void push(int n) {
        GlStateManager._glUniform1i((int)n, (int)this.cached);
    }

    @Override
    public void writeTo(FunctionReturn functionReturn) {
        functionReturn.intReturn = this.cached;
    }

    @Override
    protected boolean doUpdate() {
        int n = this.cached;
        this.cached = this.supplier.getAsInt();
        return n != this.cached;
    }
}

