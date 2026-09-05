/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package net.irisshaders.iris.uniforms;

import java.util.function.Supplier;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

class MatrixUniforms$Previous
implements Supplier<Matrix4fc> {
    private final Supplier<Matrix4fc> parent;
    private Matrix4f previous;

    MatrixUniforms$Previous(Supplier<Matrix4fc> supplier) {
        this.parent = supplier;
        this.previous = new Matrix4f();
    }

    @Override
    public Matrix4fc get() {
        Matrix4f matrix4f = new Matrix4f(this.parent.get());
        Matrix4f matrix4f2 = new Matrix4f((Matrix4fc)this.previous);
        this.previous = matrix4f;
        return matrix4f2;
    }
}

