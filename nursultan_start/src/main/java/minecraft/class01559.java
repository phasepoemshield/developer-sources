/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.buffers.Std140Builder
 *  com.mojang.blaze3d.buffers.Std140SizeCalculator
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderSystem
 *  minecraft.class04995
 *  minecraft.class07334
 *  org.joml.Matrix4f
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.lwjgl.system.MemoryStack
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import minecraft.class01540;
import minecraft.class04995;
import minecraft.class07334;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.lwjgl.system.MemoryStack;

public class class01559
implements AutoCloseable {
    private static final Vector3f y = new Vector3f(0.2f, 1.0f, -0.7f).normalize();
    private static final Vector3f L = new Vector3f(-0.2f, 1.0f, 0.7f).normalize();
    private static final Vector3f u = new Vector3f(0.2f, 1.0f, -0.7f).normalize();
    private static final Vector3f i = new Vector3f(-0.2f, -1.0f, 0.7f).normalize();
    private static final Vector3f R = new Vector3f(0.2f, -1.0f, 1.0f).normalize();
    private static final Vector3f M = new Vector3f(-0.2f, -1.0f, 0.0f).normalize();
    public static final int N = new Std140SizeCalculator().putVec3().putVec3().get();
    private final GpuBuffer B;
    private final long Z;

    public class01559() {
        GpuDevice gpuDevice = RenderSystem.getDevice();
        this.Z = class04995.i((int)N, (int)gpuDevice.getUniformOffsetAlignment());
        this.B = gpuDevice.createBuffer(() -> "Lighting UBO", 136, this.Z * (long)class01540.values().length);
        Matrix4f matrix4f = new Matrix4f().rotationY(-0.3926991f).rotateX(2.3561945f);
        this.N(class01540.field_60026, matrix4f.transformDirection((Vector3fc)y, new Vector3f()), matrix4f.transformDirection((Vector3fc)L, new Vector3f()));
        Matrix4f matrix4f2 = new Matrix4f().scaling(1.0f, -1.0f, 1.0f).rotateYXZ(1.0821041f, 3.2375858f, 0.0f).rotateYXZ(-0.3926991f, 2.3561945f, 0.0f);
        this.N(class01540.field_60027, matrix4f2.transformDirection((Vector3fc)y, new Vector3f()), matrix4f2.transformDirection((Vector3fc)L, new Vector3f()));
        this.N(class01540.field_60028, R, M);
        Matrix4f matrix4f3 = new Matrix4f();
        this.N(class01540.field_60029, matrix4f3.transformDirection((Vector3fc)R, new Vector3f()), matrix4f3.transformDirection((Vector3fc)M, new Vector3f()));
    }

    @Override
    public void close() {
        this.B.close();
    }

    public void N(class01540 class015402) {
        RenderSystem.setShaderLights((GpuBufferSlice)this.B.slice((long)class015402.ordinal() * this.Z, (long)N));
    }

    private void N(class01540 class015402, Vector3f vector3f, Vector3f vector3f2) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            ByteBuffer byteBuffer = Std140Builder.onStack((MemoryStack)memoryStack, (int)N).putVec3((Vector3fc)vector3f).putVec3((Vector3fc)vector3f2).get();
            RenderSystem.getDevice().createCommandEncoder().writeToBuffer(this.B.slice((long)class015402.ordinal() * this.Z, this.Z), byteBuffer);
        }
    }

    public void N(class07334 class073342) {
        switch (class073342) {
            case field_64380: {
                this.N(class01540.field_60025, y, L);
                break;
            }
            case field_64381: {
                this.N(class01540.field_60025, u, i);
            }
        }
    }
}

