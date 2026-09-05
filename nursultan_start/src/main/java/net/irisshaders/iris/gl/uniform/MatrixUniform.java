/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.state.ValueUpdateNotifier
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL46C
 */
package net.irisshaders.iris.gl.uniform;

import java.nio.FloatBuffer;
import java.util.function.Supplier;
import net.irisshaders.iris.gl.state.ValueUpdateNotifier;
import net.irisshaders.iris.gl.uniform.Uniform;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL46C;

public class MatrixUniform
extends Uniform {
    private final FloatBuffer buffer = BufferUtils.createFloatBuffer((int)16);
    private final Supplier<Matrix4fc> value;
    private final Matrix4f cachedValue = new Matrix4f();

    MatrixUniform(int n, Supplier<Matrix4fc> supplier) {
        super(n);
        this.value = supplier;
    }

    MatrixUniform(int n, Supplier<Matrix4fc> supplier, ValueUpdateNotifier valueUpdateNotifier) {
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
        Matrix4fc matrix4fc = this.value.get();
        if (!this.cachedValue.equals((Object)matrix4fc)) {
            this.cachedValue.set(matrix4fc);
            this.cachedValue.get(this.buffer);
            this.buffer.rewind();
            GL46C.glUniformMatrix4fv((int)this.location, (boolean)false, (FloatBuffer)this.buffer);
        }
    }
}

