/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11105
 *  baritone.utils.accessor.IRenderType
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.systems.RenderSystem$class_5590
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5595
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  minecraft.class02609
 *  minecraft.class06823
 *  minecraft.class06828
 *  minecraft.class06830
 *  minecraft.class06851
 *  minecraft.class08066
 *  minecraft.class08681
 *  net.irisshaders.iris.mixin.rendertype.RenderTypeAccessor
 *  net.irisshaders.iris.mixinterface.RenderTypeInterface
 *  org.joml.Matrix4fStack
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 */
package minecraft;

import Nursultan.class11105;
import baritone.utils.accessor.IRenderType;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Consumer;
import minecraft.class02609;
import minecraft.class06823;
import minecraft.class06828;
import minecraft.class06830;
import minecraft.class06851;
import minecraft.class08066;
import minecraft.class08681;
import net.irisshaders.iris.mixin.rendertype.RenderTypeAccessor;
import net.irisshaders.iris.mixinterface.RenderTypeInterface;
import org.joml.Matrix4fStack;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class class07311
implements class11105,
IRenderType,
RenderTypeAccessor,
RenderTypeInterface {
    private static final int field_64012 = 0x100000;
    public static final int field_64008 = 0x400000;
    public static final int field_64009 = 786432;
    public static final int field_64010 = 1536;
    private final class06828 field_64013;
    private final Optional<class07311> field_64014;
    public final String field_64011;

    public class07311(String string, class06828 class068282) {
        this.field_64011 = string;
        this.field_64013 = class068282;
        this.field_64014 = class068282.i == class06823.field_21855 ? class068282.y.values().stream().findFirst().map(class068452 -> (class07311)class06851.N.apply(class068452.N(), class068282.N.isCull())) : Optional.empty();
    }

    public String toString() {
        return "RenderType[" + this.field_64011 + ":" + String.valueOf(this.field_64013) + "]";
    }

    public static class07311 method_75940(String string, class06828 class068282) {
        return new class07311(string, class068282);
    }

    public void method_60895(class02609 class026092) {
        Matrix4fStack matrix4fStack = RenderSystem.getModelViewStack();
        Consumer consumer = this.field_64013.U.N();
        if (consumer != null) {
            matrix4fStack.pushMatrix();
            consumer.accept(matrix4fStack);
        }
        GpuBufferSlice gpuBufferSlice = RenderSystem.getDynamicUniforms().N((Matrix4fc)RenderSystem.getModelViewMatrix(), (Vector4fc)new Vector4f(1.0f, 1.0f, 1.0f, 1.0f), (Vector3fc)new Vector3f(), (Matrix4fc)this.field_64013.L.N());
        Map map = this.field_64013.N();
        try (class02609 class026093 = class026092;){
            GpuTextureView gpuTextureView;
            VertexFormat.class_5595 class_55952;
            GpuBuffer gpuBuffer;
            RenderSystem.class_5590 class_55902;
            GpuBuffer gpuBuffer2 = this.field_64013.N.getVertexFormat().uploadImmediateVertexBuffer(class026092.N());
            if (class026092.y() == null) {
                class_55902 = RenderSystem.getSequentialBuffer((VertexFormat.class_5596)class026092.L().u());
                gpuBuffer = class_55902.method_68274(class026092.L().L());
                class_55952 = class_55902.method_31924();
            } else {
                gpuBuffer = this.field_64013.N.getVertexFormat().uploadImmediateIndexBuffer(class026092.y());
                class_55952 = class026092.L().i();
            }
            class_55902 = this.field_64013.u.N();
            GpuTextureView gpuTextureView2 = gpuTextureView = RenderSystem.outputColorTextureOverride != null ? RenderSystem.outputColorTextureOverride : class_55902.u();
            GpuTextureView gpuTextureView3 = class_55902.u ? (RenderSystem.outputDepthTextureOverride != null ? RenderSystem.outputDepthTextureOverride : class_55902.R()) : null;
            try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Immediate draw for " + this.field_64011, gpuTextureView, OptionalInt.empty(), gpuTextureView3, OptionalDouble.empty());){
                renderPass.setPipeline(this.field_64013.N);
                class08681 class086812 = RenderSystem.getScissorStateForRenderTypeDraws();
                if (class086812.y()) {
                    renderPass.enableScissor(class086812.L(), class086812.u(), class086812.i(), class086812.R());
                }
                RenderSystem.bindDefaultUniforms((RenderPass)renderPass);
                renderPass.setUniform("DynamicTransforms", gpuBufferSlice);
                renderPass.setVertexBuffer(0, gpuBuffer2);
                for (Map.Entry entry : map.entrySet()) {
                    renderPass.bindTexture((String)entry.getKey(), ((class06830)entry.getValue()).N(), ((class06830)entry.getValue()).y());
                }
                renderPass.setIndexBuffer(gpuBuffer, class_55952);
                renderPass.drawIndexed(0, 0, class026092.L().L(), 1);
            }
        }
        if (consumer != null) {
            matrix4fStack.popMatrix();
        }
    }

    public RenderPipeline method_73243() {
        return this.field_64013.N;
    }

    public VertexFormat method_23031() {
        return this.field_64013.N.getVertexFormat();
    }

    public boolean method_23037() {
        return this.field_64013.B;
    }

    public class07311 createRenderType(String string, class06828 class068282) {
        return class07311.method_75940(string, class068282);
    }

    public Optional<class07311> method_23289() {
        return this.field_64014;
    }

    public boolean method_24295() {
        return this.field_64013.i == class06823.field_21854;
    }

    public RenderPipeline iris$getPipeline() {
        return this.field_64013.N;
    }

    public boolean method_43332() {
        return !this.method_23033().field_38878;
    }

    public boolean method_60894() {
        return this.field_64013.Z;
    }

    public int method_22722() {
        return this.field_64013.z;
    }

    public VertexFormat.class_5596 method_23033() {
        return this.field_64013.N.getVertexFormatMode();
    }

    public class08066 iris$getRenderTarget() {
        return this.field_64013.u.N();
    }

    public /* synthetic */ class06828 nursultan$getRenderSetup() {
        return this.field_64013;
    }
}

