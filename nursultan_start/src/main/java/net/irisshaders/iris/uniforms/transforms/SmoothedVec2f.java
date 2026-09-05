/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector2f
 *  org.joml.Vector2i
 */
package net.irisshaders.iris.uniforms.transforms;

import java.util.function.Supplier;
import net.irisshaders.iris.uniforms.FrameUpdateNotifier;
import net.irisshaders.iris.uniforms.transforms.SmoothedFloat;
import org.joml.Vector2f;
import org.joml.Vector2i;

public class SmoothedVec2f
implements Supplier<Vector2f> {
    private final SmoothedFloat x;
    private final SmoothedFloat y;

    public SmoothedVec2f(float f, float f2, Supplier<Vector2i> supplier, FrameUpdateNotifier frameUpdateNotifier) {
        this.x = new SmoothedFloat(f, f2, () -> ((Vector2i)supplier.get()).x, frameUpdateNotifier);
        this.y = new SmoothedFloat(f, f2, () -> ((Vector2i)supplier.get()).y, frameUpdateNotifier);
    }

    @Override
    public Vector2f get() {
        return new Vector2f(this.x.getAsFloat(), this.y.getAsFloat());
    }
}

