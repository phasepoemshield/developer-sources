/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.joml.Math
 *  org.joml.Matrix3f
 *  org.joml.Quaternionf
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.joml.Math;
import org.joml.Matrix3f;
import org.joml.Quaternionf;

public final class class03585
extends Record {
    private final float sinHalf;
    private final float cosHalf;

    public Quaternionf L(Quaternionf quaternionf) {
        return quaternionf.set(0.0f, 0.0f, this.sinHalf, this.cosHalf);
    }

    public Matrix3f L(Matrix3f matrix3f) {
        matrix3f.m02 = 0.0f;
        matrix3f.m12 = 0.0f;
        matrix3f.m20 = 0.0f;
        matrix3f.m21 = 0.0f;
        float f = this.y();
        float f2 = this.L();
        matrix3f.m00 = f;
        matrix3f.m11 = f;
        matrix3f.m01 = f2;
        matrix3f.m10 = -f2;
        matrix3f.m22 = 1.0f;
        return matrix3f;
    }

    public float L() {
        return 2.0f * this.sinHalf * this.cosHalf;
    }

    public class03585(float f, float f2) {
        this.sinHalf = f;
        this.cosHalf = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03585.class, "sinHalf;cosHalf", "sinHalf", "cosHalf"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03585.class, "sinHalf;cosHalf", "sinHalf", "cosHalf"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03585.class, "sinHalf;cosHalf", "sinHalf", "cosHalf"}, this);
    }

    public float i() {
        return this.cosHalf;
    }

    public float u() {
        return this.sinHalf;
    }

    public Matrix3f y(Matrix3f matrix3f) {
        matrix3f.m01 = 0.0f;
        matrix3f.m10 = 0.0f;
        matrix3f.m12 = 0.0f;
        matrix3f.m21 = 0.0f;
        float f = this.y();
        float f2 = this.L();
        matrix3f.m00 = f;
        matrix3f.m22 = f;
        matrix3f.m02 = -f2;
        matrix3f.m20 = f2;
        matrix3f.m11 = 1.0f;
        return matrix3f;
    }

    public Quaternionf y(Quaternionf quaternionf) {
        return quaternionf.set(0.0f, this.sinHalf, 0.0f, this.cosHalf);
    }

    public float y() {
        return this.cosHalf * this.cosHalf - this.sinHalf * this.sinHalf;
    }

    public Quaternionf N(Quaternionf quaternionf) {
        return quaternionf.set(this.sinHalf, 0.0f, 0.0f, this.cosHalf);
    }

    public class03585 N() {
        return new class03585(-this.sinHalf, this.cosHalf);
    }

    public Matrix3f N(Matrix3f matrix3f) {
        matrix3f.m01 = 0.0f;
        matrix3f.m02 = 0.0f;
        matrix3f.m10 = 0.0f;
        matrix3f.m20 = 0.0f;
        float f = this.y();
        float f2 = this.L();
        matrix3f.m11 = f;
        matrix3f.m22 = f;
        matrix3f.m12 = f2;
        matrix3f.m21 = -f2;
        matrix3f.m00 = 1.0f;
        return matrix3f;
    }

    public static class03585 N(float f) {
        float f2 = Math.sin((float)(f / 2.0f));
        float f3 = Math.cosFromSin((float)f2, (float)(f / 2.0f));
        return new class03585(f2, f3);
    }

    public static class03585 N(float f, float f2) {
        float f3 = Math.invsqrt((float)(f * f + f2 * f2));
        return new class03585(f3 * f, f3 * f2);
    }
}

