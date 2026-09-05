/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11068
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.buffers.Std140Builder
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderSystem
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.lwjgl.system.MemoryStack
 */
package minecraft;

import Nursultan.class11068;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.system.MemoryStack;

public class class00046
implements class11068,
AutoCloseable {
    private final GpuBuffer N;
    private final GpuBufferSlice y;
    private final float L;
    private final float u;
    private int i;
    private int R;
    private float M;

    public /* synthetic */ int L() {
        return this.R;
    }

    private Matrix4f L(int n, int n2, float f) {
        return new Matrix4f().perspective(f * ((float)Math.PI / 180), (float)n / (float)n2, this.L, this.u);
    }

    public class00046(String string, float f, float f2) {
        this.L = f;
        this.u = f2;
        GpuDevice gpuDevice = RenderSystem.getDevice();
        this.N = gpuDevice.createBuffer(() -> "Projection matrix UBO " + string, 136, (long)RenderSystem.PROJECTION_MATRIX_UBO_SIZE);
        this.y = this.N.slice(0L, (long)RenderSystem.PROJECTION_MATRIX_UBO_SIZE);
    }

    @Override
    public void close() {
        this.N.close();
    }

    public GpuBufferSlice y(int n, int n2, float f) {
        if (this.i != n || this.R != n2 || this.M != f) {
            Matrix4f matrix4f = this.L(n, n2, f);
            try (MemoryStack memoryStack = MemoryStack.stackPush();){
                ByteBuffer byteBuffer = Std140Builder.onStack((MemoryStack)memoryStack, (int)RenderSystem.PROJECTION_MATRIX_UBO_SIZE).putMat4f((Matrix4fc)matrix4f).get();
                RenderSystem.getDevice().createCommandEncoder().writeToBuffer(this.N.slice(), byteBuffer);
            }
            this.i = n;
            this.R = n2;
            this.M = f;
        }
        return this.y;
    }

    public /* synthetic */ float y() {
        return this.M;
    }

    public /* synthetic */ Matrix4f N(int n, int n2, float f) {
        return this.L(n, n2, f);
    }

    public /* synthetic */ int N() {
        return this.i;
    }
}

