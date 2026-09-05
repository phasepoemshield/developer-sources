/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.state.ValueUpdateNotifier
 *  org.joml.Vector3i
 */
package net.irisshaders.iris.gl.uniform;

import java.util.function.Supplier;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.state.ValueUpdateNotifier;
import net.irisshaders.iris.gl.uniform.Uniform;
import org.joml.Vector3i;

public class Vector3IntegerUniform
extends Uniform {
    private final Vector3i cachedValue = new Vector3i();
    private final Supplier<Vector3i> value;

    Vector3IntegerUniform(int n, Supplier<Vector3i> supplier) {
        super(n);
        this.value = supplier;
    }

    Vector3IntegerUniform(int n, Supplier<Vector3i> supplier, ValueUpdateNotifier valueUpdateNotifier) {
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
        Vector3i vector3i = this.value.get();
        if (!vector3i.equals((Object)this.cachedValue)) {
            this.cachedValue.set(vector3i.x(), vector3i.y(), vector3i.z());
            IrisRenderSystem.uniform3i((int)this.location, (int)this.cachedValue.x(), (int)this.cachedValue.y(), (int)this.cachedValue.z());
        }
    }
}

