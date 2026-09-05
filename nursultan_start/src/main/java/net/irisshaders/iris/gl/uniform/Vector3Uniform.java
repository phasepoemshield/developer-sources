/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.state.ValueUpdateNotifier
 *  org.joml.Vector3d
 *  org.joml.Vector3f
 *  org.joml.Vector4f
 */
package net.irisshaders.iris.gl.uniform;

import java.util.function.Supplier;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.state.ValueUpdateNotifier;
import net.irisshaders.iris.gl.uniform.Uniform;
import org.joml.Vector3d;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class Vector3Uniform
extends Uniform {
    private final Vector3f cachedValue = new Vector3f();
    private final Supplier<Vector3f> value;

    static Vector3Uniform converted(int n, Supplier<Vector3d> supplier) {
        Vector3f vector3f = new Vector3f();
        return new Vector3Uniform(n, () -> {
            Vector3d vector3d = (Vector3d)supplier.get();
            vector3f.set((float)vector3d.x, (float)vector3d.y, (float)vector3d.z);
            return vector3f;
        });
    }

    Vector3Uniform(int n, Supplier<Vector3f> supplier) {
        super(n);
        this.value = supplier;
    }

    Vector3Uniform(int n, Supplier<Vector3f> supplier, ValueUpdateNotifier valueUpdateNotifier) {
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

    static Vector3Uniform truncated(int n, Supplier<Vector4f> supplier) {
        Vector3f vector3f = new Vector3f();
        return new Vector3Uniform(n, () -> {
            Vector4f vector4f = (Vector4f)supplier.get();
            vector3f.set(vector4f.x(), vector4f.y(), vector4f.z());
            return vector3f;
        });
    }

    private void updateValue() {
        Vector3f vector3f = this.value.get();
        if (!vector3f.equals((Object)this.cachedValue)) {
            this.cachedValue.set(vector3f.x(), vector3f.y(), vector3f.z());
            IrisRenderSystem.uniform3f((int)this.location, (float)this.cachedValue.x(), (float)this.cachedValue.y(), (float)this.cachedValue.z());
        }
    }
}

