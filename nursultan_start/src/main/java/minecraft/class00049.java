/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09110
 *  Nursultan.class09112
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.buffers.Std140SizeCalculator
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 */
package minecraft;

import Nursultan.class09110;
import Nursultan.class09112;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import minecraft.class00063;
import minecraft.class00091;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class class00049
implements AutoCloseable {
    public static final int N = new Std140SizeCalculator().putMat4f().putVec4().putVec3().putMat4f().get();
    public static final int y = new Std140SizeCalculator().putMat4f().putFloat().putIVec2().putIVec3().get();
    private static final int L = 2;
    private final class00091<class09110> u = new class00091("Dynamic Transforms UBO", N, 2);
    private final class00091<class09112> i = new class00091("Chunk Sections UBO", y, 2);

    @Override
    public void close() {
        this.u.close();
        this.i.close();
    }

    public GpuBufferSlice N(Matrix4fc matrix4fc, Vector4fc vector4fc, Vector3fc vector3fc, Matrix4fc matrix4fc2) {
        return this.u.N(new class09110((Matrix4fc)new Matrix4f(matrix4fc), (Vector4fc)new Vector4f(vector4fc), (Vector3fc)new Vector3f(vector3fc), (Matrix4fc)new Matrix4f(matrix4fc2)));
    }

    public GpuBufferSlice[] N(class09112 ... class09112Array) {
        return this.i.N((class00063[])class09112Array);
    }

    public GpuBufferSlice[] N(class09110 ... class09110Array) {
        return this.u.N((class00063[])class09110Array);
    }

    public void N() {
        this.u.N();
        this.i.N();
    }
}

