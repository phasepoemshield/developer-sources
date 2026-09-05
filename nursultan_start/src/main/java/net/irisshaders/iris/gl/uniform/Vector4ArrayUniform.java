/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.state.ValueUpdateNotifier
 */
package net.irisshaders.iris.gl.uniform;

import java.util.Arrays;
import java.util.function.Supplier;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.state.ValueUpdateNotifier;
import net.irisshaders.iris.gl.uniform.Uniform;

public class Vector4ArrayUniform
extends Uniform {
    private final Supplier<float[]> value;
    private float[] cachedValue = new float[4];

    Vector4ArrayUniform(int n, Supplier<float[]> supplier) {
        this(n, supplier, null);
    }

    Vector4ArrayUniform(int n, Supplier<float[]> supplier, ValueUpdateNotifier valueUpdateNotifier) {
        super(n, valueUpdateNotifier);
        this.value = supplier;
    }

    @Override
    public void update() {
        this.updateValue();
        if (this.notifier != null) {
            this.notifier.setListener(this::updateValue);
        }
    }

    private void updateValue() {
        float[] fArray = this.value.get();
        if (!Arrays.equals(fArray, this.cachedValue)) {
            this.cachedValue = fArray;
            IrisRenderSystem.uniform4f((int)this.location, (float)this.cachedValue[0], (float)this.cachedValue[1], (float)this.cachedValue[2], (float)this.cachedValue[3]);
        }
    }
}

