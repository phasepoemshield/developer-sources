/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.state.ValueUpdateNotifier
 *  org.joml.Vector2i
 */
package net.irisshaders.iris.gl.uniform;

import java.util.function.Supplier;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.state.ValueUpdateNotifier;
import net.irisshaders.iris.gl.uniform.Uniform;
import org.joml.Vector2i;

public class Vector2IntegerJomlUniform
extends Uniform {
    private final Supplier<Vector2i> value;
    private Vector2i cachedValue = null;

    Vector2IntegerJomlUniform(int n, Supplier<Vector2i> supplier) {
        this(n, supplier, null);
    }

    Vector2IntegerJomlUniform(int n, Supplier<Vector2i> supplier, ValueUpdateNotifier valueUpdateNotifier) {
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
        Vector2i vector2i = this.value.get();
        if (!vector2i.equals((Object)this.cachedValue)) {
            this.cachedValue = vector2i;
            IrisRenderSystem.uniform2i((int)this.location, (int)vector2i.x, (int)vector2i.y);
        }
    }
}

