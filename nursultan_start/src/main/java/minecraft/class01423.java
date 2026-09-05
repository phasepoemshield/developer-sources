/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02054
 *  org.joml.Matrix3f
 *  org.joml.Matrix3fc
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package minecraft;

import minecraft.class02054;
import org.joml.Matrix3f;
import org.joml.Matrix3fc;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public final class class01423 {
    private final Matrix4f y = new Matrix4f();
    private final Matrix3f L = new Matrix3f();
    public boolean N = true;

    public void L() {
        this.y.identity();
        this.L.identity();
        this.N = true;
    }

    private void i() {
        this.L.set((Matrix4fc)this.y).invert().transpose();
        this.N = false;
    }

    public class01423 u() {
        class01423 class014232 = new class01423();
        class014232.N(this);
        return class014232;
    }

    public void y(float f, float f2, float f3) {
        this.y.scale(f, f2, f3);
        if (Math.abs(f) == Math.abs(f2) && Math.abs(f2) == Math.abs(f3)) {
            if (f < 0.0f || f2 < 0.0f || f3 < 0.0f) {
                this.L.scale(Math.signum(f), Math.signum(f2), Math.signum(f3));
            }
            return;
        }
        this.L.scale(1.0f / f, 1.0f / f2, 1.0f / f3);
        this.N = false;
    }

    public Matrix3f y() {
        return this.L;
    }

    public void N(Quaternionfc quaternionfc, float f, float f2, float f3) {
        this.y.rotateAround(quaternionfc, f, f2, f3);
        this.L.rotate(quaternionfc);
    }

    public void N(class01423 class014232) {
        this.y.set((Matrix4fc)class014232.y);
        this.L.set((Matrix3fc)class014232.L);
        this.N = class014232.N;
    }

    public void N(Matrix4fc matrix4fc) {
        this.y.mul(matrix4fc);
        if (!class02054.y((Matrix4fc)matrix4fc)) {
            if (class02054.L((Matrix4fc)matrix4fc)) {
                this.L.mul((Matrix3fc)new Matrix3f(matrix4fc));
            } else {
                this.i();
            }
        }
    }

    public Matrix4f N(float f, float f2, float f3) {
        return this.y.translate(f, f2, f3);
    }

    public Vector3f N(Vector3fc vector3fc, Vector3f vector3f) {
        return this.N(vector3fc.x(), vector3fc.y(), vector3fc.z(), vector3f);
    }

    public Vector3f N(float f, float f2, float f3, Vector3f vector3f) {
        Vector3f vector3f2 = this.L.transform(f, f2, f3, vector3f);
        return this.N ? vector3f2 : vector3f2.normalize();
    }

    public Matrix4f N() {
        return this.y;
    }

    public void N(Quaternionfc quaternionfc) {
        this.y.rotate(quaternionfc);
        this.L.rotate(quaternionfc);
    }
}

