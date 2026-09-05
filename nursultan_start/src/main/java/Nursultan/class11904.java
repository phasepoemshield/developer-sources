/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11904
extends Record {
    public float[] lights;
    public int[] indices;
    public float[] positions;
    public int[] colors;
    public float[] uvs;
    public GpuTextureView texture;
    public float[] normals;

    public int[] L() {
        return this.colors;
    }

    public float[] M() {
        return this.positions;
    }

    public class11904(GpuTextureView gpuTextureView, float[] fArray, float[] fArray2, int[] nArray, float[] fArray3, float[] fArray4, int[] nArray2) {
        this.texture = gpuTextureView;
        this.positions = fArray;
        this.uvs = fArray2;
        this.colors = nArray;
        this.lights = fArray3;
        this.normals = fArray4;
        this.indices = nArray2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11904.class, "texture;positions;uvs;colors;lights;normals;indices", "texture", "positions", "uvs", "colors", "lights", "normals", "indices"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11904.class, "texture;positions;uvs;colors;lights;normals;indices", "texture", "positions", "uvs", "colors", "lights", "normals", "indices"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11904.class, "texture;positions;uvs;colors;lights;normals;indices", "texture", "positions", "uvs", "colors", "lights", "normals", "indices"}, this);
    }

    public GpuTextureView i() {
        return this.texture;
    }

    public float[] u() {
        return this.uvs;
    }

    public int[] y() {
        return this.indices;
    }

    public float[] N() {
        return this.lights;
    }

    public float[] R() {
        return this.normals;
    }
}

