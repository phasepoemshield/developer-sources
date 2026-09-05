/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector4f
 */
package net.irisshaders.iris.shadows.frustum.advanced;

import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector4f;

public class BaseClippingPlanes {
    private final Vector4f[] planes = new Vector4f[6];

    public BaseClippingPlanes(Matrix4fc matrix4fc) {
        this.init(matrix4fc);
    }

    private static Vector4f transform(Matrix4fc matrix4fc, float f, float f2, float f3) {
        Vector4f vector4f = new Vector4f(f, f2, f3, 1.0f);
        vector4f.mul(matrix4fc);
        vector4f.normalize();
        return vector4f;
    }

    private void init(Matrix4fc matrix4fc) {
        Matrix4f matrix4f = new Matrix4f(matrix4fc);
        matrix4f.transpose();
        this.planes[0] = BaseClippingPlanes.transform((Matrix4fc)matrix4f, -1.0f, 0.0f, 0.0f);
        this.planes[1] = BaseClippingPlanes.transform((Matrix4fc)matrix4f, 1.0f, 0.0f, 0.0f);
        this.planes[2] = BaseClippingPlanes.transform((Matrix4fc)matrix4f, 0.0f, -1.0f, 0.0f);
        this.planes[3] = BaseClippingPlanes.transform((Matrix4fc)matrix4f, 0.0f, 1.0f, 0.0f);
        this.planes[4] = BaseClippingPlanes.transform((Matrix4fc)matrix4f, 0.0f, 0.0f, -1.0f);
        this.planes[5] = BaseClippingPlanes.transform((Matrix4fc)matrix4f, 0.0f, 0.0f, 1.0f);
    }

    public Vector4f[] getPlanes() {
        return this.planes;
    }
}

