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

record MatrixUniforms$Inverted(Supplier<Matrix4fc> parent) implements Supplier<Matrix4fc>
{
    @Override
    public Matrix4fc get() {
        Matrix4f matrix4f = new Matrix4f(this.parent.get());
        matrix4f.invert();
        return matrix4f;
    }
}

