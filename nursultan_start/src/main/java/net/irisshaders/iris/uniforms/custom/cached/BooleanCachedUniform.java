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
import java.util.function.BooleanSupplier;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.uniforms.custom.cached.CachedUniform;

public class BooleanCachedUniform
extends CachedUniform {
    private final BooleanSupplier supplier;
    private boolean cached;

    public BooleanCachedUniform(String string, UniformUpdateFrequency uniformUpdateFrequency, BooleanSupplier booleanSupplier) {
        super(string, uniformUpdateFrequency);
        this.supplier = booleanSupplier;
    }

    @Override
    public Type getType() {
        return Type.Boolean;
    }

    @Override
    public void push(int n) {
        GlStateManager._glUniform1i((int)n, (int)(this.cached ? 1 : 0));
    }

    @Override
    public void writeTo(FunctionReturn functionReturn) {
        functionReturn.booleanReturn = this.cached;
    }

    @Override
    protected boolean doUpdate() {
        boolean bl = this.cached;
        this.cached = this.supplier.getAsBoolean();
        return bl != this.cached;
    }
}

