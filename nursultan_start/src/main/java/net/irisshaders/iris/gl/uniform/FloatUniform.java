/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.state.ValueUpdateNotifier
 */
package net.irisshaders.iris.gl.uniform;

import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.state.ValueUpdateNotifier;
import net.irisshaders.iris.gl.uniform.FloatSupplier;
import net.irisshaders.iris.gl.uniform.Uniform;

public class FloatUniform
extends Uniform {
    private final FloatSupplier value;
    private float cachedValue = 0.0f;

    FloatUniform(int n, FloatSupplier floatSupplier) {
        this(n, floatSupplier, null);
    }

    FloatUniform(int n, FloatSupplier floatSupplier, ValueUpdateNotifier valueUpdateNotifier) {
        super(n, valueUpdateNotifier);
        this.value = floatSupplier;
    }

    @Override
    public void update() {
        this.updateValue();
        if (this.notifier != null) {
            this.notifier.setListener(this::updateValue);
        }
    }

    private void updateValue() {
        float f = this.value.getAsFloat();
        if (this.cachedValue != f) {
            this.cachedValue = f;
            IrisRenderSystem.uniform1f((int)this.location, (float)f);
        }
    }
}

