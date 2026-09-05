/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.state.ValueUpdateNotifier
 *  org.joml.Vector2f
 */
package net.irisshaders.iris.gl.uniform;

import java.util.function.Supplier;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.state.ValueUpdateNotifier;
import net.irisshaders.iris.gl.uniform.Uniform;
import org.joml.Vector2f;

public class Vector2Uniform
extends Uniform {
    private final Supplier<Vector2f> value;
    private Vector2f cachedValue = null;

    Vector2Uniform(int n, Supplier<Vector2f> supplier) {
        super(n);
        this.value = supplier;
    }

    Vector2Uniform(int n, Supplier<Vector2f> supplier, ValueUpdateNotifier valueUpdateNotifier) {
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
        Vector2f vector2f = this.value.get();
        if (!vector2f.equals((Object)this.cachedValue)) {
            this.cachedValue = vector2f;
            IrisRenderSystem.uniform2f((int)this.location, (float)vector2f.x, (float)vector2f.y);
        }
    }
}

