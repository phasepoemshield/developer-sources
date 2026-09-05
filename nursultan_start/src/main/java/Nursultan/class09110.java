/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.Std140Builder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00063
 *  org.joml.Matrix4fc
 *  org.joml.Vector3fc
 *  org.joml.Vector4fc
 */
package Nursultan;

import com.mojang.blaze3d.buffers.Std140Builder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import minecraft.class00063;
import org.joml.Matrix4fc;
import org.joml.Vector3fc;
import org.joml.Vector4fc;

public final class class09110
extends Record
implements class00063 {
    private final Matrix4fc modelView;
    private final Vector4fc colorModulator;
    private final Vector3fc modelOffset;
    private final Matrix4fc textureMatrix;

    public Vector3fc L() {
        return this.modelOffset;
    }

    public class09110(Matrix4fc matrix4fc, Vector4fc vector4fc, Vector3fc vector3fc, Matrix4fc matrix4fc2) {
        this.modelView = matrix4fc;
        this.colorModulator = vector4fc;
        this.modelOffset = vector3fc;
        this.textureMatrix = matrix4fc2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09110.class, "modelView;colorModulator;modelOffset;textureMatrix", "modelView", "colorModulator", "modelOffset", "textureMatrix"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09110.class, "modelView;colorModulator;modelOffset;textureMatrix", "modelView", "colorModulator", "modelOffset", "textureMatrix"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09110.class, "modelView;colorModulator;modelOffset;textureMatrix", "modelView", "colorModulator", "modelOffset", "textureMatrix"}, this);
    }

    public Matrix4fc u() {
        return this.textureMatrix;
    }

    public Vector4fc y() {
        return this.colorModulator;
    }

    public void N(ByteBuffer byteBuffer) {
        Std140Builder.intoBuffer((ByteBuffer)byteBuffer).putMat4f(this.modelView).putVec4(this.colorModulator).putVec3(this.modelOffset).putMat4f(this.textureMatrix);
    }

    public Matrix4fc N() {
        return this.modelView;
    }
}

