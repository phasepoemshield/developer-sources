/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.system.MemoryStack;

public class class00062
implements AutoCloseable {
    private final GpuBuffer N;
    private final GpuBufferSlice y;

    public class00062(String string) {
        GpuDevice gpuDevice = RenderSystem.getDevice();
        this.N = gpuDevice.createBuffer(() -> "Projection matrix UBO " + string, 136, (long)RenderSystem.PROJECTION_MATRIX_UBO_SIZE);
        this.y = this.N.slice(0L, (long)RenderSystem.PROJECTION_MATRIX_UBO_SIZE);
    }

    @Override
    public void close() {
        this.N.close();
    }

    public GpuBufferSlice N(Matrix4f matrix4f) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            ByteBuffer byteBuffer = Std140Builder.onStack((MemoryStack)memoryStack, (int)RenderSystem.PROJECTION_MATRIX_UBO_SIZE).putMat4f((Matrix4fc)matrix4f).get();
            RenderSystem.getDevice().createCommandEncoder().writeToBuffer(this.N.slice(), byteBuffer);
        }
        return this.y;
    }
}

