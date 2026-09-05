/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL46C
 */
package net.irisshaders.iris.gl.uniform;

import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.function.Supplier;
import net.irisshaders.iris.gl.uniform.Uniform;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL46C;

public class MatrixFromFloatArrayUniform
extends Uniform {
    private final FloatBuffer buffer = BufferUtils.createFloatBuffer((int)16);
    private final Supplier<float[]> value;
    private float[] cachedValue = null;

    MatrixFromFloatArrayUniform(int n, Supplier<float[]> supplier) {
        super(n);
        this.value = supplier;
    }

    @Override
    public void update() {
        float[] fArray = this.value.get();
        if (!Arrays.equals(fArray, this.cachedValue)) {
            this.cachedValue = Arrays.copyOf(fArray, 16);
            this.buffer.put(this.cachedValue);
            this.buffer.rewind();
            GL46C.glUniformMatrix4fv((int)this.location, (boolean)false, (FloatBuffer)this.buffer);
        }
    }
}

