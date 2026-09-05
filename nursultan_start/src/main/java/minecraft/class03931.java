/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.systems.RenderSystem$class_5590
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  minecraft.class00046
 *  minecraft.class00312
 *  minecraft.class01894
 *  minecraft.class02579
 *  minecraft.class02609
 *  minecraft.class06202
 *  minecraft.class07331
 *  minecraft.class07835
 *  minecraft.class08066
 *  minecraft.class08394
 *  minecraft.class08627
 *  minecraft.class08918
 *  minecraft.class08998
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import minecraft.class00046;
import minecraft.class00312;
import minecraft.class01894;
import minecraft.class02579;
import minecraft.class02609;
import minecraft.class06202;
import minecraft.class07331;
import minecraft.class07835;
import minecraft.class08066;
import minecraft.class08394;
import minecraft.class08627;
import minecraft.class08918;
import minecraft.class08998;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class class03931
implements AutoCloseable {
    private static final int N = 6;
    private final GpuBuffer y;
    private final class00046 L;
    private final class01894 u;

    public class03931(class01894 class018942) {
        this.u = class018942;
        this.L = new class00046("cubemap", 0.05f, 10.0f);
        this.y = class03931.N();
    }

    @Override
    public void close() {
        this.y.close();
        this.L.close();
    }

    public void N(class08627 class086272) {
        class086272.N(this.u, (class08918)new class08998(this.u));
    }

    private static GpuBuffer N() {
        try (class02579 class025792 = class02579.N((int)(class07835.i.getVertexSize() * 4 * 6));){
            GpuBuffer gpuBuffer;
            block12: {
                class07331 class073312 = new class07331(class025792, VertexFormat.class_5596.field_27382, class07835.i);
                class073312.method_22912(-1.0f, -1.0f, 1.0f);
                class073312.method_22912(-1.0f, 1.0f, 1.0f);
                class073312.method_22912(1.0f, 1.0f, 1.0f);
                class073312.method_22912(1.0f, -1.0f, 1.0f);
                class073312.method_22912(1.0f, -1.0f, 1.0f);
                class073312.method_22912(1.0f, 1.0f, 1.0f);
                class073312.method_22912(1.0f, 1.0f, -1.0f);
                class073312.method_22912(1.0f, -1.0f, -1.0f);
                class073312.method_22912(1.0f, -1.0f, -1.0f);
                class073312.method_22912(1.0f, 1.0f, -1.0f);
                class073312.method_22912(-1.0f, 1.0f, -1.0f);
                class073312.method_22912(-1.0f, -1.0f, -1.0f);
                class073312.method_22912(-1.0f, -1.0f, -1.0f);
                class073312.method_22912(-1.0f, 1.0f, -1.0f);
                class073312.method_22912(-1.0f, 1.0f, 1.0f);
                class073312.method_22912(-1.0f, -1.0f, 1.0f);
                class073312.method_22912(-1.0f, -1.0f, -1.0f);
                class073312.method_22912(-1.0f, -1.0f, 1.0f);
                class073312.method_22912(1.0f, -1.0f, 1.0f);
                class073312.method_22912(1.0f, -1.0f, -1.0f);
                class073312.method_22912(-1.0f, 1.0f, 1.0f);
                class073312.method_22912(-1.0f, 1.0f, -1.0f);
                class073312.method_22912(1.0f, 1.0f, -1.0f);
                class073312.method_22912(1.0f, 1.0f, 1.0f);
                class02609 class026092 = class073312.y();
                try {
                    gpuBuffer = RenderSystem.getDevice().createBuffer(() -> "Cube map vertex buffer", 32, class026092.N());
                    if (class026092 == null) break block12;
                }
                catch (Throwable throwable) {
                    if (class026092 != null) {
                        try {
                            class026092.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                class026092.close();
            }
            return gpuBuffer;
        }
    }

    public void N(class06202 class062022, float f, float f2) {
        RenderSystem.setProjectionMatrix((GpuBufferSlice)this.L.y(class062022.Nt().U(), class062022.Nt().E(), 85.0f), (class00312)class00312.field_54953);
        RenderPipeline renderPipeline = class08394.yN;
        class08066 class080662 = class06202.Nq().e();
        GpuTextureView gpuTextureView = class080662.u();
        GpuTextureView gpuTextureView2 = class080662.R();
        RenderSystem.class_5590 class_55902 = RenderSystem.getSequentialBuffer((VertexFormat.class_5596)VertexFormat.class_5596.field_27382);
        GpuBuffer gpuBuffer = class_55902.method_68274(36);
        Matrix4fStack matrix4fStack = RenderSystem.getModelViewStack();
        matrix4fStack.pushMatrix();
        matrix4fStack.rotationX((float)Math.PI);
        matrix4fStack.rotateX(f * ((float)Math.PI / 180));
        matrix4fStack.rotateY(f2 * ((float)Math.PI / 180));
        GpuBufferSlice gpuBufferSlice = RenderSystem.getDynamicUniforms().N((Matrix4fc)new Matrix4f((Matrix4fc)matrix4fStack), (Vector4fc)new Vector4f(1.0f, 1.0f, 1.0f, 1.0f), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        matrix4fStack.popMatrix();
        try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Cubemap", gpuTextureView, OptionalInt.empty(), gpuTextureView2, OptionalDouble.empty());){
            renderPass.setPipeline(renderPipeline);
            RenderSystem.bindDefaultUniforms((RenderPass)renderPass);
            renderPass.setVertexBuffer(0, this.y);
            renderPass.setIndexBuffer(gpuBuffer, class_55902.method_31924());
            renderPass.setUniform("DynamicTransforms", gpuBufferSlice);
            class08918 class089182 = class062022.NO().y(this.u);
            renderPass.bindTexture("Sampler0", class089182.method_71659(), class089182.method_75484());
            renderPass.drawIndexed(0, 0, 36, 1);
        }
    }
}

