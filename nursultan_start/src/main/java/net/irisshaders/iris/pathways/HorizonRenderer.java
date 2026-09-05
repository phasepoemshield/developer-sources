/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.systems.RenderSystem$class_5590
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  minecraft.class01391
 *  minecraft.class02609
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class07331
 *  minecraft.class07835
 *  minecraft.class07849
 *  minecraft.class08394
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 */
package net.irisshaders.iris.pathways;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import minecraft.class01391;
import minecraft.class02609;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class07331;
import minecraft.class07835;
import minecraft.class07849;
import minecraft.class08394;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class HorizonRenderer {
    private static final float TOP = 16.0f;
    private static final float BOTTOM = -16.0f;
    private GpuBuffer buffer;
    private int currentRenderDistance;
    private int indexCount = -1;

    public HorizonRenderer() {
        this.currentRenderDistance = ((class05630)class06202.Nq().i_7).Nh();
        this.rebuildBuffer();
    }

    public void destroy() {
        this.buffer.close();
    }

    private void rebuildBuffer() {
        if (this.buffer != null) {
            this.buffer.close();
        }
        class07331 class073312 = class07849.y().N(VertexFormat.class_5596.field_27381, class07835.i);
        this.buildHorizon(this.currentRenderDistance * 16, (class01391)class073312);
        class02609 class026092 = class073312.y();
        this.buffer = RenderSystem.getDevice().createBuffer(() -> "Horizon", 40, class026092.N());
        this.indexCount = class026092.L().L();
        class026092.close();
        class07849.y().L();
    }

    public void renderHorizon(Matrix4fc matrix4fc, Matrix4fc matrix4fc2, Vector4f vector4f) {
        if (this.currentRenderDistance != ((class05630)class06202.Nq().i_7).Nh()) {
            this.currentRenderDistance = ((class05630)class06202.Nq().i_7).Nh();
            this.rebuildBuffer();
        }
        RenderSystem.class_5590 class_55902 = RenderSystem.getSequentialBuffer((VertexFormat.class_5596)VertexFormat.class_5596.field_27381);
        GpuBuffer gpuBuffer = class_55902.method_68274(this.indexCount);
        GpuBufferSlice gpuBufferSlice = RenderSystem.getDynamicUniforms().N(matrix4fc, (Vector4fc)vector4f, (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Sky", class06202.Nq().e().u(), OptionalInt.empty(), class06202.Nq().e().R(), OptionalDouble.empty());){
            RenderSystem.bindDefaultUniforms((RenderPass)renderPass);
            renderPass.setUniform("DynamicTransforms", gpuBufferSlice);
            renderPass.setVertexBuffer(0, this.buffer);
            renderPass.setIndexBuffer(gpuBuffer, class_55902.method_31924());
            renderPass.setPipeline(class08394.No);
            renderPass.drawIndexed(0, 0, this.indexCount, 1);
        }
    }

    private void buildHorizon(int n, class01391 class013912) {
        if (n > 256) {
            n = 256;
        }
        class013912.method_22912(0.0f, -16.0f, 0.0f);
        for (int i = 0; i <= 8; ++i) {
            float f = (float)((double)(-i) * Math.PI / 4.0);
            float f2 = (float)((double)n * Math.cos(f));
            float f3 = (float)((double)n * Math.sin(f));
            class013912.method_22912(f2, 16.0f, f3);
        }
    }
}

