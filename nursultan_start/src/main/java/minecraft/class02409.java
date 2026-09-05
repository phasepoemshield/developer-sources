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
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod
 *  minecraft.class00579
 *  minecraft.class00608
 *  minecraft.class00917
 *  minecraft.class01391
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class02566
 *  minecraft.class02579
 *  minecraft.class02609
 *  minecraft.class03063
 *  minecraft.class03386
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04798
 *  minecraft.class04995
 *  minecraft.class05363
 *  minecraft.class05474
 *  minecraft.class06069
 *  minecraft.class06202
 *  minecraft.class06971
 *  minecraft.class07331
 *  minecraft.class07360
 *  minecraft.class07835
 *  minecraft.class08117
 *  minecraft.class08165
 *  minecraft.class08388
 *  minecraft.class08394
 *  minecraft.class08589
 *  minecraft.class08626
 *  minecraft.class08627
 *  minecraft.class08918
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.mixin.LevelRendererAccessor
 *  net.irisshaders.iris.pipeline.WorldRenderingPhase
 *  net.irisshaders.iris.pipeline.WorldRenderingPipeline
 *  org.joml.Matrix3f
 *  org.joml.Matrix3fc
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
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
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import minecraft.class00579;
import minecraft.class00608;
import minecraft.class00917;
import minecraft.class01391;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02566;
import minecraft.class02579;
import minecraft.class02609;
import minecraft.class03063;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04798;
import minecraft.class04995;
import minecraft.class05363;
import minecraft.class05474;
import minecraft.class06069;
import minecraft.class06202;
import minecraft.class06971;
import minecraft.class07331;
import minecraft.class07360;
import minecraft.class07835;
import minecraft.class08117;
import minecraft.class08165;
import minecraft.class08388;
import minecraft.class08394;
import minecraft.class08589;
import minecraft.class08626;
import minecraft.class08627;
import minecraft.class08918;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.mixin.LevelRendererAccessor;
import net.irisshaders.iris.pipeline.WorldRenderingPhase;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import org.joml.Matrix3f;
import org.joml.Matrix3fc;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class02409
implements AutoCloseable {
    private static final class01894 N = class01894.y((String)"sun");
    private static final class01894 y = class01894.y((String)"end_flash");
    private static final class01894 L = class01894.y((String)"textures/environment/end_sky.png");
    private static final float u = 512.0f;
    private static final int i = 10;
    private static final int R = 1500;
    private static final float M = 30.0f;
    private static final float B = 100.0f;
    private static final float Z = 20.0f;
    private static final float z = 100.0f;
    private static final int U = 16;
    private static final int E = 6;
    private static final float W = 100.0f;
    private static final float m = 60.0f;
    private final class08626 P;
    private final GpuBuffer s;
    private final GpuBuffer T;
    private final GpuBuffer b;
    private final GpuBuffer j;
    private final GpuBuffer v;
    private final GpuBuffer n;
    private final GpuBuffer t;
    private final GpuBuffer G;
    private final RenderSystem.class_5590 l = RenderSystem.getSequentialBuffer((VertexFormat.class_5596)VertexFormat.class_5596.field_27382);
    private final class08918 d;
    private int w;

    private static GpuBuffer L(class08626 class086262) {
        class02609 class026092 = class08165.values();
        VertexFormat vertexFormat = class07835.Z;
        try (class02579 class025792 = class02579.N((int)(((class08165[])class026092).length * 4 * vertexFormat.getVertexSize()));){
            GpuBuffer gpuBuffer;
            block13: {
                class07331 class073312 = new class07331(class025792, VertexFormat.class_5596.field_27382, vertexFormat);
                for (class08165 class081652 : class026092) {
                    class08388 class083882 = class086262.N(class01894.y((String)("moon/" + class081652.method_15434())));
                    class073312.method_22912(-1.0f, 0.0f, -1.0f).method_22913(class083882.method_4577(), class083882.method_4575());
                    class073312.method_22912(1.0f, 0.0f, -1.0f).method_22913(class083882.method_4594(), class083882.method_4575());
                    class073312.method_22912(1.0f, 0.0f, 1.0f).method_22913(class083882.method_4594(), class083882.method_4593());
                    class073312.method_22912(-1.0f, 0.0f, 1.0f).method_22913(class083882.method_4577(), class083882.method_4593());
                }
                class02609 class026093 = class073312.y();
                try {
                    gpuBuffer = RenderSystem.getDevice().createBuffer(() -> "Moon phases", 32, class026093.N());
                    if (class026093 == null) break block13;
                }
                catch (Throwable throwable) {
                    if (class026093 != null) {
                        try {
                            class026093.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                class026093.close();
            }
            return gpuBuffer;
        }
    }

    private void L(float f, class01421 class014212, CallbackInfo callbackInfo) {
        this.N(WorldRenderingPhase.STARS);
    }

    private GpuBuffer L() {
        int n = 18;
        int n2 = class07835.R.getVertexSize();
        try (class02579 class025792 = class02579.N((int)(18 * n2));){
            GpuBuffer gpuBuffer;
            block13: {
                class07331 class073312 = new class07331(class025792, VertexFormat.class_5596.field_27381, class07835.R);
                int n3 = class02566.y((float)1.0f);
                int n4 = class02566.y((float)0.0f);
                class073312.method_22912(0.0f, 100.0f, 0.0f).method_39415(n3);
                for (int i = 0; i <= 16; ++i) {
                    float f = (float)i * ((float)Math.PI * 2) / 16.0f;
                    float f2 = class04995.m((double)f);
                    float f3 = class04995.P((double)f);
                    class073312.method_22912(f2 * 120.0f, f3 * 120.0f, -f3 * 40.0f).method_39415(n4);
                }
                class02609 class026092 = class073312.y();
                try {
                    gpuBuffer = RenderSystem.getDevice().createBuffer(() -> "Sunrise/Sunset fan", 32, class026092.N());
                    if (class026092 == null) break block13;
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

    private void L(class08165 class081652, float f, class01421 class014212, CallbackInfo callbackInfo) {
        if (!SodiumExtraClientMod.options().detailSettings.moon) {
            callbackInfo.cancel();
        }
    }

    private void L(class01421 class014212, float f, int n, CallbackInfo callbackInfo) {
        if (!SodiumExtraClientMod.options().detailSettings.sun) {
            callbackInfo.cancel();
        }
    }

    public class02409(class08627 class086272, class08117 class081172) {
        this.P = class081172.N(class08589.P);
        this.s = this.u();
        this.j = class02409.i();
        this.d = this.N(class086272, L);
        this.G = class02409.y(this.P);
        this.v = class02409.N(this.P);
        this.n = class02409.L(this.P);
        this.t = this.L();
        try (class02579 class025792 = class02579.N((int)(10 * class07835.i.getVertexSize()));){
            class07331 class073312 = new class07331(class025792, VertexFormat.class_5596.field_27381, class07835.i);
            this.N((class01391)class073312, 16.0f);
            try (class02609 class026092 = class073312.y();){
                this.T = RenderSystem.getDevice().createBuffer(() -> "Top sky vertex buffer", 32, class026092.N());
            }
            class073312 = new class07331(class025792, VertexFormat.class_5596.field_27381, class07835.i);
            this.N((class01391)class073312, -16.0f);
            class026092 = class073312.y();
            try {
                this.b = RenderSystem.getDevice().createBuffer(() -> "Bottom sky vertex buffer", 32, class026092.N());
            }
            finally {
                if (class026092 != null) {
                    class026092.close();
                }
            }
        }
    }

    private static GpuBuffer i() {
        try (class02579 class025792 = class02579.N((int)(24 * class07835.z.getVertexSize()));){
            Matrix4f matrix4f;
            block20: {
                class07331 class073312 = new class07331(class025792, VertexFormat.class_5596.field_27382, class07835.z);
                for (int i = 0; i < 6; ++i) {
                    matrix4f = new Matrix4f();
                    switch (i) {
                        case 1: {
                            matrix4f.rotationX(1.5707964f);
                            break;
                        }
                        case 2: {
                            matrix4f.rotationX(-1.5707964f);
                            break;
                        }
                        case 3: {
                            matrix4f.rotationX((float)Math.PI);
                            break;
                        }
                        case 4: {
                            matrix4f.rotationZ(1.5707964f);
                            break;
                        }
                        case 5: {
                            matrix4f.rotationZ(-1.5707964f);
                        }
                    }
                    class073312.N((Matrix4fc)matrix4f, -100.0f, -100.0f, -100.0f).method_22913(0.0f, 0.0f).method_39415(-14145496);
                    class073312.N((Matrix4fc)matrix4f, -100.0f, -100.0f, 100.0f).method_22913(0.0f, 16.0f).method_39415(-14145496);
                    class073312.N((Matrix4fc)matrix4f, 100.0f, -100.0f, 100.0f).method_22913(16.0f, 16.0f).method_39415(-14145496);
                    class073312.N((Matrix4fc)matrix4f, 100.0f, -100.0f, -100.0f).method_22913(16.0f, 0.0f).method_39415(-14145496);
                }
                class02609 class026092 = class073312.y();
                try {
                    matrix4f = RenderSystem.getDevice().createBuffer(() -> "End sky vertex buffer", 40, class026092.N());
                    if (class026092 == null) break block20;
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
            return matrix4f;
        }
    }

    private void i(float f, class01421 class014212, CallbackInfo callbackInfo) {
        if (!SodiumExtraClientMod.options().detailSettings.stars) {
            callbackInfo.cancel();
        }
    }

    private float v() {
        if (Iris.getPipelineManager().getPipelineNullable() == null) {
            return 0.0f;
        }
        return Iris.getPipelineManager().getPipelineNullable().getSunPathRotation();
    }

    @Override
    public void close() {
        this.v.close();
        this.n.close();
        this.s.close();
        this.T.close();
        this.b.close();
        this.j.close();
        this.t.close();
        this.G.close();
    }

    private GpuBuffer u() {
        class06069 class060692 = class06069.y((long)10842L);
        float f = 100.0f;
        try (class02579 class025792 = class02579.N((int)(class07835.i.getVertexSize() * 1500 * 4));){
            GpuBuffer gpuBuffer;
            block13: {
                class07331 class073312 = new class07331(class025792, VertexFormat.class_5596.field_27382, class07835.i);
                for (int i = 0; i < 1500; ++i) {
                    float f2 = class060692.z() * 2.0f - 1.0f;
                    float f3 = class060692.z() * 2.0f - 1.0f;
                    float f4 = class060692.z() * 2.0f - 1.0f;
                    float f5 = 0.15f + class060692.z() * 0.1f;
                    float f6 = class04995.U((float)f2, (float)f3, (float)f4);
                    if (f6 <= 0.010000001f || f6 >= 1.0f) continue;
                    Vector3f vector3f = new Vector3f(f2, f3, f4).normalize(100.0f);
                    float f7 = (float)(class060692.U() * 3.1415927410125732 * 2.0);
                    Matrix3f matrix3f = new Matrix3f().rotateTowards((Vector3fc)new Vector3f((Vector3fc)vector3f).negate(), (Vector3fc)new Vector3f(0.0f, 1.0f, 0.0f)).rotateZ(-f7);
                    class073312.N_26((Vector3fc)new Vector3f(f5, -f5, 0.0f).mul((Matrix3fc)matrix3f).add((Vector3fc)vector3f));
                    class073312.N_26((Vector3fc)new Vector3f(f5, f5, 0.0f).mul((Matrix3fc)matrix3f).add((Vector3fc)vector3f));
                    class073312.N_26((Vector3fc)new Vector3f(-f5, f5, 0.0f).mul((Matrix3fc)matrix3f).add((Vector3fc)vector3f));
                    class073312.N_26((Vector3fc)new Vector3f(-f5, -f5, 0.0f).mul((Matrix3fc)matrix3f).add((Vector3fc)vector3f));
                }
                class02609 class026092 = class073312.y();
                try {
                    this.w = class026092.L().L();
                    gpuBuffer = RenderSystem.getDevice().createBuffer(() -> "Stars vertex buffer", 40, class026092.N());
                    if (class026092 == null) break block13;
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

    private void u(float f, class01421 class014212, CallbackInfo callbackInfo) {
        if (!SodiumExtraClientMod.options().detailSettings.sun) {
            callbackInfo.cancel();
        }
    }

    private static GpuBuffer y(class08626 class086262) {
        return class02409.N("End flash quad", class086262.N(y));
    }

    private void y_5(int n, CallbackInfo callbackInfo) {
        this.N(WorldRenderingPhase.SKY);
    }

    private void y(float f, class01421 class014212) {
        this.L(f, class014212, null);
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.i(f, class014212, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        Matrix4fStack matrix4fStack = RenderSystem.getModelViewStack();
        matrix4fStack.pushMatrix();
        matrix4fStack.mul((Matrix4fc)class014212.L().N());
        RenderPipeline renderPipeline = class08394.NV;
        GpuTextureView gpuTextureView = class06202.Nq().e().u();
        GpuTextureView gpuTextureView2 = class06202.Nq().e().R();
        GpuBuffer gpuBuffer = this.l.method_68274(this.w);
        GpuBufferSlice gpuBufferSlice = RenderSystem.getDynamicUniforms().N((Matrix4fc)matrix4fStack, (Vector4fc)new Vector4f(f, f, f, f), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Stars", gpuTextureView, OptionalInt.empty(), gpuTextureView2, OptionalDouble.empty());){
            renderPass.setPipeline(renderPipeline);
            RenderSystem.bindDefaultUniforms((RenderPass)renderPass);
            renderPass.setUniform("DynamicTransforms", gpuBufferSlice);
            renderPass.setVertexBuffer(0, this.s);
            renderPass.setIndexBuffer(gpuBuffer, this.l.method_31924());
            renderPass.drawIndexed(0, 0, this.w, 1);
        }
        matrix4fStack.popMatrix();
    }

    public void y() {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        RenderSystem.class_5590 class_55902 = RenderSystem.getSequentialBuffer((VertexFormat.class_5596)VertexFormat.class_5596.field_27382);
        GpuBuffer gpuBuffer = class_55902.method_68274(36);
        GpuTextureView gpuTextureView = class06202.Nq().e().u();
        GpuTextureView gpuTextureView2 = class06202.Nq().e().R();
        GpuBufferSlice gpuBufferSlice = RenderSystem.getDynamicUniforms().N((Matrix4fc)RenderSystem.getModelViewMatrix(), (Vector4fc)new Vector4f(1.0f, 1.0f, 1.0f, 1.0f), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "End sky", gpuTextureView, OptionalInt.empty(), gpuTextureView2, OptionalDouble.empty());){
            renderPass.setPipeline(class08394.Nq);
            RenderSystem.bindDefaultUniforms((RenderPass)renderPass);
            renderPass.setUniform("DynamicTransforms", gpuBufferSlice);
            renderPass.bindTexture("Sampler0", this.d.method_71659(), this.d.method_75484());
            renderPass.setVertexBuffer(0, this.j);
            renderPass.setIndexBuffer(gpuBuffer, class_55902.method_31924());
            renderPass.drawIndexed(0, 0, 36, 1);
        }
    }

    private void y(class01421 class014212, float f, int n, CallbackInfo callbackInfo) {
        if (((LevelRendererAccessor)((class03063)class06202.Nq().B_2)).invokeDoesMobEffectBlockSky(((class03386)class06202.Nq().i_5).s())) {
            callbackInfo.cancel();
        }
        if (((class03386)class06202.Nq().i_5).s().W() != class04798.field_27888) {
            callbackInfo.cancel();
        }
    }

    private void y(float f, class01421 class014212, CallbackInfo callbackInfo) {
        this.N(WorldRenderingPhase.SUN);
    }

    private void y(class08165 class081652, float f, class01421 class014212, CallbackInfo callbackInfo) {
        this.N(WorldRenderingPhase.MOON);
    }

    private void y(CallbackInfo callbackInfo) {
        this.N(WorldRenderingPhase.VOID);
    }

    public void N(int n, CallbackInfo callbackInfo) {
        if (!SodiumExtraClientMod.options().detailSettings.sky) {
            callbackInfo.cancel();
        }
    }

    public void N(class01421 class014212, float f, float f2, float f3) {
        class014212.N((Quaternionfc)class02058.u.N(180.0f - f3));
        class014212.N((Quaternionfc)class02058.y.N(-90.0f - f2));
        Matrix4fStack matrix4fStack = RenderSystem.getModelViewStack();
        matrix4fStack.pushMatrix();
        matrix4fStack.mul((Matrix4fc)class014212.L().N());
        matrix4fStack.translate(0.0f, 100.0f, 0.0f);
        matrix4fStack.scale(60.0f, 1.0f, 60.0f);
        GpuBufferSlice gpuBufferSlice = RenderSystem.getDynamicUniforms().N((Matrix4fc)matrix4fStack, (Vector4fc)new Vector4f(f, f, f, f), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        GpuTextureView gpuTextureView = class06202.Nq().e().u();
        GpuTextureView gpuTextureView2 = class06202.Nq().e().R();
        GpuBuffer gpuBuffer = this.l.method_68274(6);
        try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "End flash", gpuTextureView, OptionalInt.empty(), gpuTextureView2, OptionalDouble.empty());){
            renderPass.setPipeline(class08394.Ne);
            RenderSystem.bindDefaultUniforms((RenderPass)renderPass);
            renderPass.setUniform("DynamicTransforms", gpuBufferSlice);
            renderPass.bindTexture("Sampler0", this.P.method_71659(), this.P.method_75484());
            renderPass.setVertexBuffer(0, this.G);
            renderPass.setIndexBuffer(gpuBuffer, this.l.method_31924());
            renderPass.drawIndexed(0, 0, 6, 1);
        }
        matrix4fStack.popMatrix();
    }

    public void N(WorldRenderingPhase worldRenderingPhase) {
        if (Iris.getPipelineManager().getPipelineNullable() == null) {
            return;
        }
        Iris.getPipelineManager().getPipelineNullable().setPhase(worldRenderingPhase);
    }

    private void N(class01421 class014212, float f, float f2, float f3, class08165 class081652, float f4, float f5, CallbackInfo callbackInfo) {
        class014212.N((Quaternionfc)class02058.R.N(this.v()));
    }

    private void N(class01391 class013912, float f) {
        float f2 = Math.signum(f) * 512.0f;
        class013912.method_22912(0.0f, f, 0.0f);
        for (int i = -180; i <= 180; i += 45) {
            class013912.method_22912(f2 * class04995.P((double)((float)i * ((float)Math.PI / 180))), f, 512.0f * class04995.m((double)((float)i * ((float)Math.PI / 180))));
        }
    }

    private static GpuBuffer N(class08626 class086262) {
        return class02409.N("Sun quad", class086262.N(N));
    }

    private void N(class08165 class081652, float f, class01421 class014212) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class081652, f, class014212, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.y(class081652, f, class014212, null);
        CallbackInfo callbackInfo2 = new CallbackInfo("", true);
        this.L(class081652, f, class014212, callbackInfo2);
        if (callbackInfo2.isCancelled()) {
            return;
        }
        int n = class081652.N() * 4;
        Matrix4fStack matrix4fStack = RenderSystem.getModelViewStack();
        matrix4fStack.pushMatrix();
        matrix4fStack.mul((Matrix4fc)class014212.L().N());
        matrix4fStack.translate(0.0f, 100.0f, 0.0f);
        matrix4fStack.scale(20.0f, 1.0f, 20.0f);
        GpuBufferSlice gpuBufferSlice = RenderSystem.getDynamicUniforms().N((Matrix4fc)matrix4fStack, (Vector4fc)new Vector4f(1.0f, 1.0f, 1.0f, f), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        GpuTextureView gpuTextureView = class06202.Nq().e().u();
        GpuTextureView gpuTextureView2 = class06202.Nq().e().R();
        GpuBuffer gpuBuffer = this.l.method_68274(6);
        try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Sky moon", gpuTextureView, OptionalInt.empty(), gpuTextureView2, OptionalDouble.empty());){
            renderPass.setPipeline(class08394.Ne);
            RenderSystem.bindDefaultUniforms((RenderPass)renderPass);
            renderPass.setUniform("DynamicTransforms", gpuBufferSlice);
            renderPass.bindTexture("Sampler0", this.P.method_71659(), this.P.method_75484());
            renderPass.setVertexBuffer(0, this.n);
            renderPass.setIndexBuffer(gpuBuffer, this.l.method_31924());
            renderPass.drawIndexed(n, 0, 6, 1);
        }
        matrix4fStack.popMatrix();
    }

    public void N(int n) {
        this.y_5(n, null);
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(n, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        GpuBufferSlice gpuBufferSlice = RenderSystem.getDynamicUniforms().N((Matrix4fc)RenderSystem.getModelViewMatrix(), (Vector4fc)class02566.E((int)n), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        GpuTextureView gpuTextureView = class06202.Nq().e().u();
        GpuTextureView gpuTextureView2 = class06202.Nq().e().R();
        try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Sky disc", gpuTextureView, OptionalInt.empty(), gpuTextureView2, OptionalDouble.empty());){
            renderPass.setPipeline(class08394.No);
            RenderSystem.bindDefaultUniforms((RenderPass)renderPass);
            renderPass.setUniform("DynamicTransforms", gpuBufferSlice);
            renderPass.setVertexBuffer(0, this.T);
            renderPass.draw(0, 10);
        }
    }

    private class08918 N(class08627 class086272, class01894 class018942) {
        return class086272.y(class018942);
    }

    public void N(class01421 class014212, float f, int n) {
        this.N(class014212, f, n, null);
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.y(class014212, f, n, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        CallbackInfo callbackInfo2 = new CallbackInfo("", true);
        this.L(class014212, f, n, callbackInfo2);
        if (callbackInfo2.isCancelled()) {
            return;
        }
        float f2 = class02566.W((int)n);
        if (f2 <= 0.001f) {
            return;
        }
        class014212.N();
        class014212.N((Quaternionfc)class02058.y.N(90.0f));
        float f3 = class04995.m((double)f) < 0.0f ? 180.0f : 0.0f;
        class014212.N((Quaternionfc)class02058.R.N(f3 + 90.0f));
        Matrix4fStack matrix4fStack = RenderSystem.getModelViewStack();
        matrix4fStack.pushMatrix();
        matrix4fStack.mul((Matrix4fc)class014212.L().N());
        matrix4fStack.scale(1.0f, 1.0f, f2);
        GpuBufferSlice gpuBufferSlice = RenderSystem.getDynamicUniforms().N((Matrix4fc)matrix4fStack, (Vector4fc)class02566.E((int)n), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        GpuTextureView gpuTextureView = class06202.Nq().e().u();
        GpuTextureView gpuTextureView2 = class06202.Nq().e().R();
        try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Sunrise sunset", gpuTextureView, OptionalInt.empty(), gpuTextureView2, OptionalDouble.empty());){
            renderPass.setPipeline(class08394.NK);
            RenderSystem.bindDefaultUniforms((RenderPass)renderPass);
            renderPass.setUniform("DynamicTransforms", gpuBufferSlice);
            renderPass.setVertexBuffer(0, this.t);
            renderPass.draw(0, 18);
        }
        matrix4fStack.popMatrix();
        class014212.y();
    }

    public void N(CallbackInfo callbackInfo) {
        if (!SodiumExtraClientMod.options().detailSettings.sky) {
            callbackInfo.cancel();
        }
    }

    private void N(float f, class01421 class014212, CallbackInfo callbackInfo) {
        if (!Iris.getPipelineManager().getPipeline().map(WorldRenderingPipeline::shouldRenderSun).orElse(true).booleanValue()) {
            callbackInfo.cancel();
        }
    }

    public void N(class03448 class034482, float f, class05363 class053632, class06971 class069712) {
        class069712.N = class034482.method_8597().m();
        if (class069712.N == class07360.field_64385) {
            return;
        }
        if (class069712.N == class07360.field_64387) {
            class00917 class009172 = class034482.R();
            if (class009172 == null) {
                return;
            }
            class069712.U = class009172.N(f);
            class069712.E = class009172.N();
            class069712.W = class009172.y();
            return;
        }
        class00579 class005792 = class053632.U();
        class069712.L = ((Float)class005792.N(class00608.W, f)).floatValue() * ((float)Math.PI / 180);
        class069712.u = ((Float)class005792.N(class00608.m, f)).floatValue() * ((float)Math.PI / 180);
        class069712.i = ((Float)class005792.N(class00608.P, f)).floatValue() * ((float)Math.PI / 180);
        class069712.R = 1.0f - class034482.method_8430(f);
        class069712.M = ((Float)class005792.N(class00608.T, f)).floatValue();
        class069712.B = (Integer)class053632.U().N(class00608.z, f);
        class069712.Z = (class08165)class005792.N(class00608.s, f);
        class069712.z = (Integer)class005792.N(class00608.Z, f);
        class069712.y = this.N(f, class034482);
    }

    private static GpuBuffer N(String string, class08388 class083882) {
        VertexFormat vertexFormat = class07835.Z;
        try (class02579 class025792 = class02579.N((int)(4 * vertexFormat.getVertexSize()));){
            GpuBuffer gpuBuffer;
            block12: {
                class07331 class073312 = new class07331(class025792, VertexFormat.class_5596.field_27382, vertexFormat);
                class073312.method_22912(-1.0f, 0.0f, -1.0f).method_22913(class083882.method_4594(), class083882.method_4593());
                class073312.method_22912(1.0f, 0.0f, -1.0f).method_22913(class083882.method_4577(), class083882.method_4593());
                class073312.method_22912(1.0f, 0.0f, 1.0f).method_22913(class083882.method_4577(), class083882.method_4575());
                class073312.method_22912(-1.0f, 0.0f, 1.0f).method_22913(class083882.method_4594(), class083882.method_4575());
                class02609 class026092 = class073312.y();
                try {
                    gpuBuffer = RenderSystem.getDevice().createBuffer(() -> string, 32, class026092.N());
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

    private boolean N(float f, class03448 class034482) {
        return ((class04453)class06202.Nq().T_4).method_5836((float)f).B - class034482.method_8401().N((class05474)class034482) < 0.0;
    }

    public void N() {
        this.y(null);
        Matrix4fStack matrix4fStack = RenderSystem.getModelViewStack();
        matrix4fStack.pushMatrix();
        matrix4fStack.translate(0.0f, 12.0f, 0.0f);
        GpuBufferSlice gpuBufferSlice = RenderSystem.getDynamicUniforms().N((Matrix4fc)matrix4fStack, (Vector4fc)new Vector4f(0.0f, 0.0f, 0.0f, 1.0f), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        GpuTextureView gpuTextureView = class06202.Nq().e().u();
        GpuTextureView gpuTextureView2 = class06202.Nq().e().R();
        try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Sky dark", gpuTextureView, OptionalInt.empty(), gpuTextureView2, OptionalDouble.empty());){
            renderPass.setPipeline(class08394.No);
            RenderSystem.bindDefaultUniforms((RenderPass)renderPass);
            renderPass.setUniform("DynamicTransforms", gpuBufferSlice);
            renderPass.setVertexBuffer(0, this.b);
            renderPass.draw(0, 10);
        }
        matrix4fStack.popMatrix();
    }

    private void N(class01421 class014212, float f, int n, CallbackInfo callbackInfo) {
        this.N(WorldRenderingPhase.SUNSET);
    }

    private void N(float f, class01421 class014212) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(f, class014212, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.y(f, class014212, null);
        CallbackInfo callbackInfo2 = new CallbackInfo("", true);
        this.u(f, class014212, callbackInfo2);
        if (callbackInfo2.isCancelled()) {
            return;
        }
        Matrix4fStack matrix4fStack = RenderSystem.getModelViewStack();
        matrix4fStack.pushMatrix();
        matrix4fStack.mul((Matrix4fc)class014212.L().N());
        matrix4fStack.translate(0.0f, 100.0f, 0.0f);
        matrix4fStack.scale(30.0f, 1.0f, 30.0f);
        GpuBufferSlice gpuBufferSlice = RenderSystem.getDynamicUniforms().N((Matrix4fc)matrix4fStack, (Vector4fc)new Vector4f(1.0f, 1.0f, 1.0f, f), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
        GpuTextureView gpuTextureView = class06202.Nq().e().u();
        GpuTextureView gpuTextureView2 = class06202.Nq().e().R();
        GpuBuffer gpuBuffer = this.l.method_68274(6);
        try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Sky sun", gpuTextureView, OptionalInt.empty(), gpuTextureView2, OptionalDouble.empty());){
            renderPass.setPipeline(class08394.Ne);
            RenderSystem.bindDefaultUniforms((RenderPass)renderPass);
            renderPass.setUniform("DynamicTransforms", gpuBufferSlice);
            renderPass.bindTexture("Sampler0", this.P.method_71659(), this.P.method_75484());
            renderPass.setVertexBuffer(0, this.v);
            renderPass.setIndexBuffer(gpuBuffer, this.l.method_31924());
            renderPass.drawIndexed(0, 0, 6, 1);
        }
        matrix4fStack.popMatrix();
    }

    public void N(class01421 class014212, float f, float f2, float f3, class08165 class081652, float f4, float f5) {
        class014212.N();
        class014212.N((Quaternionfc)class02058.u.N(-90.0f));
        this.N(class014212, f, f2, f3, class081652, f4, f5, null);
        class014212.N();
        class014212.N((Quaternionfc)class02058.y.rotation(f));
        this.N(f4, class014212);
        class014212.y();
        class014212.N();
        class014212.N((Quaternionfc)class02058.y.rotation(f2));
        this.N(class081652, f4, class014212);
        class014212.y();
        if (f5 > 0.0f) {
            class014212.N();
            class014212.N((Quaternionfc)class02058.y.rotation(f3));
            this.y(f5, class014212);
            class014212.y();
        }
        class014212.y();
    }

    private void N(class08165 class081652, float f, class01421 class014212, CallbackInfo callbackInfo) {
        if (!Iris.getPipelineManager().getPipeline().map(WorldRenderingPipeline::shouldRenderMoon).orElse(true).booleanValue()) {
            callbackInfo.cancel();
        }
    }
}

