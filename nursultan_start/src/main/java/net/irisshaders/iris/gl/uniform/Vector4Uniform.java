/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.state.ValueUpdateNotifier
 *  org.joml.Vector4f
 */
package net.irisshaders.iris.gl.uniform;

import java.util.function.Supplier;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.state.ValueUpdateNotifier;
import net.irisshaders.iris.gl.uniform.Uniform;
import org.joml.Vector4f;

public class Vector4Uniform
extends Uniform {
    private final Vector4f cachedValue = new Vector4f();
    private final Supplier<Vector4f> value;

    Vector4Uniform(int n, Supplier<Vector4f> supplier) {
        this(n, supplier, null);
    }

    Vector4Uniform(int n, Supplier<Vector4f> supplier, ValueUpdateNotifier valueUpdateNotifier) {
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
        Vector4f vector4f = this.value.get();
        if (!vector4f.equals((Object)this.cachedValue)) {
            this.cachedValue.set(vector4f.x(), vector4f.y(), vector4f.z(), vector4f.w());
            IrisRenderSystem.uniform4f((int)this.location, (float)this.cachedValue.x(), (float)this.cachedValue.y(), (float)this.cachedValue.z(), (float)this.cachedValue.w());
        }
    }
}

