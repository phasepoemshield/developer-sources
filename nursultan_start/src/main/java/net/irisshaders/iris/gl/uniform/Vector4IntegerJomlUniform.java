/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.state.ValueUpdateNotifier
 *  org.joml.Vector4i
 */
package net.irisshaders.iris.gl.uniform;

import java.util.function.Supplier;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.state.ValueUpdateNotifier;
import net.irisshaders.iris.gl.uniform.Uniform;
import org.joml.Vector4i;

public class Vector4IntegerJomlUniform
extends Uniform {
    private final Supplier<Vector4i> value;
    private Vector4i cachedValue = null;

    Vector4IntegerJomlUniform(int n, Supplier<Vector4i> supplier) {
        this(n, supplier, null);
    }

    Vector4IntegerJomlUniform(int n, Supplier<Vector4i> supplier, ValueUpdateNotifier valueUpdateNotifier) {
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
        Vector4i vector4i = this.value.get();
        if (!vector4i.equals((Object)this.cachedValue)) {
            this.cachedValue = vector4i;
            IrisRenderSystem.uniform4i((int)this.location, (int)vector4i.x, (int)vector4i.y, (int)vector4i.z, (int)vector4i.w);
        }
    }
}

