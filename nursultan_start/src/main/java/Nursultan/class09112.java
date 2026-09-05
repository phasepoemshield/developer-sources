/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.Std140Builder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00063
 *  org.joml.Matrix4fc
 */
package Nursultan;

import com.mojang.blaze3d.buffers.Std140Builder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.ByteBuffer;
import minecraft.class00063;
import org.joml.Matrix4fc;

public final class class09112
extends Record
implements class00063 {
    private final Matrix4fc modelView;
    private final int x;
    private final int y;
    private final int z;
    private final float visibility;
    private final int textureAtlasWidth;
    private final int textureAtlasHeight;

    public int L() {
        return this.y;
    }

    public int M() {
        return this.textureAtlasHeight;
    }

    public class09112(Matrix4fc matrix4fc, int n, int n2, int n3, float f, int n4, int n5) {
        this.modelView = matrix4fc;
        this.x = n;
        this.y = n2;
        this.z = n3;
        this.visibility = f;
        this.textureAtlasWidth = n4;
        this.textureAtlasHeight = n5;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09112.class, "modelView;x;y;z;visibility;textureAtlasWidth;textureAtlasHeight", "modelView", "x", "y", "z", "visibility", "textureAtlasWidth", "textureAtlasHeight"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09112.class, "modelView;x;y;z;visibility;textureAtlasWidth;textureAtlasHeight", "modelView", "x", "y", "z", "visibility", "textureAtlasWidth", "textureAtlasHeight"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09112.class, "modelView;x;y;z;visibility;textureAtlasWidth;textureAtlasHeight", "modelView", "x", "y", "z", "visibility", "textureAtlasWidth", "textureAtlasHeight"}, this);
    }

    public float i() {
        return this.visibility;
    }

    public int u() {
        return this.z;
    }

    public int y() {
        return this.x;
    }

    public void N(ByteBuffer byteBuffer) {
        Std140Builder.intoBuffer((ByteBuffer)byteBuffer).putMat4f(this.modelView).putFloat(this.visibility).putIVec2(this.textureAtlasWidth, this.textureAtlasHeight).putIVec3(this.x, this.y, this.z);
    }

    public Matrix4fc N() {
        return this.modelView;
    }

    public int R() {
        return this.textureAtlasWidth;
    }
}

