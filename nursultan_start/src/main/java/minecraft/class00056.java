/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class12035
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

import Nursultan.class12035;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.system.MemoryStack;

public class class00056
implements class12035,
AutoCloseable {
    private final GpuBuffer N;
    private final GpuBufferSlice y;
    private final float L;
    private final float u;
    private final boolean i;
    private float R;
    private float M;

    private Matrix4f L(float f, float f2) {
        return new Matrix4f().setOrtho(0.0f, f, this.i ? f2 : 0.0f, this.i ? 0.0f : f2, this.L, this.u);
    }

    public class00056(String string, float f, float f2, boolean bl) {
        this.L = f;
        this.u = f2;
        this.i = bl;
        GpuDevice gpuDevice = RenderSystem.getDevice();
        this.N = gpuDevice.createBuffer(() -> "Projection matrix UBO " + string, 136, (long)RenderSystem.PROJECTION_MATRIX_UBO_SIZE);
        this.y = this.N.slice(0L, (long)RenderSystem.PROJECTION_MATRIX_UBO_SIZE);
    }

    @Override
    public void close() {
        this.N.close();
    }

    public GpuBufferSlice y(float f, float f2) {
        if (this.R != f || this.M != f2) {
            Matrix4f matrix4f = this.L(f, f2);
            try (MemoryStack memoryStack = MemoryStack.stackPush();){
                ByteBuffer byteBuffer = Std140Builder.onStack((MemoryStack)memoryStack, (int)RenderSystem.PROJECTION_MATRIX_UBO_SIZE).putMat4f((Matrix4fc)matrix4f).get();
                RenderSystem.getDevice().createCommandEncoder().writeToBuffer(this.N.slice(), byteBuffer);
            }
            this.R = f;
            this.M = f2;
        }
        return this.y;
    }

    public /* synthetic */ Matrix4f N(float f, float f2) {
        return this.L(f, f2);
    }
}

