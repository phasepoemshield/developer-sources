/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.state.ValueUpdateNotifier
 *  org.joml.Matrix3f
 *  org.joml.Matrix3fc
 *  org.lwjgl.BufferUtils
 */
package net.irisshaders.iris.gl.uniform;

import java.nio.FloatBuffer;
import java.util.function.Supplier;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.state.ValueUpdateNotifier;
import net.irisshaders.iris.gl.uniform.Uniform;
import org.joml.Matrix3f;
import org.joml.Matrix3fc;
import org.lwjgl.BufferUtils;

public class Matrix3Uniform
extends Uniform {
    private final FloatBuffer buffer = BufferUtils.createFloatBuffer((int)9);
    private final Supplier<Matrix3fc> value;
    private final Matrix3f cachedValue = new Matrix3f();

    Matrix3Uniform(int n, Supplier<Matrix3fc> supplier) {
        super(n);
        this.value = supplier;
    }

    Matrix3Uniform(int n, Supplier<Matrix3fc> supplier, ValueUpdateNotifier valueUpdateNotifier) {
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

    public void updateValue() {
        Matrix3fc matrix3fc = this.value.get();
        if (!this.cachedValue.equals((Object)matrix3fc)) {
            this.cachedValue.set(matrix3fc);
            this.cachedValue.get(this.buffer);
            this.buffer.rewind();
            IrisRenderSystem.uniformMatrix3fv((int)this.location, (boolean)false, (FloatBuffer)this.buffer);
        }
    }
}

