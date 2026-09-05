/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.systems.RenderSystem$class_5590
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  minecraft.class00438
 *  minecraft.class00984
 *  minecraft.class01237
 *  minecraft.class01391
 *  minecraft.class02579
 *  minecraft.class02609
 *  minecraft.class05436
 *  minecraft.class05846
 *  minecraft.class06959
 *  minecraft.class07331
 *  minecraft.class07835
 *  minecraft.class08627
 *  minecraft.class08918
 *  net.caffeinemc.mods.sodium.api.util.ColorARGB
 *  net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter
 *  net.caffeinemc.mods.sodium.api.vertex.format.common.ParticleVertex
 *  net.caffeinemc.mods.sodium.client.render.vertex.VertexConsumerUtils
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.system.MemoryStack
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.HashMap;
import java.util.Map;
import minecraft.class00438;
import minecraft.class00969;
import minecraft.class00972;
import minecraft.class00977;
import minecraft.class00984;
import minecraft.class01237;
import minecraft.class01391;
import minecraft.class02579;
import minecraft.class02609;
import minecraft.class05436;
import minecraft.class05846;
import minecraft.class06959;
import minecraft.class07331;
import minecraft.class07835;
import minecraft.class08627;
import minecraft.class08918;
import net.caffeinemc.mods.sodium.api.util.ColorARGB;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import net.caffeinemc.mods.sodium.api.vertex.format.common.ParticleVertex;
import net.caffeinemc.mods.sodium.client.render.vertex.VertexConsumerUtils;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryStack;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class00965
implements class00972,
class05436 {
    private static final int N = 1024;
    private static final int y = 12;
    private static final int L = 2;
    private final Map<class05846, class00969> u = new HashMap<class05846, class00969>();
    private int i;
    private static final Quaternionf R = new Quaternionf();
    private static final Vector3f M = new Vector3f();

    @Override
    public void submit(class01237 class012372, class06959 class069592) {
        if (this.i > 0) {
            class012372.N((class05436)this);
        }
    }

    @Override
    public void y() {
        this.u.values().forEach(class00969::N);
        this.i = 0;
    }

    private void N(class01391 class013912, Quaternionf quaternionf, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n, int n2) {
        Vector3f vector3f = new Vector3f(f4, f5, 0.0f).rotate((Quaternionfc)quaternionf).mul(f6).add(f, f2, f3);
        class013912.method_22912(vector3f.x(), vector3f.y(), vector3f.z()).method_22913(f7, f8).method_39415(n).method_60803(n2);
    }

    protected void N(class01391 class013912, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, int n, int n2, CallbackInfo callbackInfo) {
        VertexBufferWriter vertexBufferWriter = VertexConsumerUtils.convertOrLog((class01391)class013912);
        if (vertexBufferWriter == null) {
            return;
        }
        callbackInfo.cancel();
        R.set(f4, f5, f6, f7);
        this.N(vertexBufferWriter, f, f2, f3, f8, f9, f10, f11, f12, ColorARGB.toABGR((int)n), n2, R);
    }

    private void N(VertexBufferWriter vertexBufferWriter, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n, int n2, Quaternionf quaternionf) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            long l;
            long l2 = l = memoryStack.nmalloc(112);
            M.set(1.0f, -1.0f, 0.0f).rotate((Quaternionfc)quaternionf).mul(f4).add(f, f2, f3);
            ParticleVertex.put((long)l2, (float)class00965.M.x, (float)class00965.M.y, (float)class00965.M.z, (float)f6, (float)f8, (int)n, (int)n2);
            M.set(1.0f, 1.0f, 0.0f).rotate((Quaternionfc)quaternionf).mul(f4).add(f, f2, f3);
            ParticleVertex.put((long)(l2 += 28L), (float)class00965.M.x, (float)class00965.M.y, (float)class00965.M.z, (float)f6, (float)f7, (int)n, (int)n2);
            M.set(-1.0f, 1.0f, 0.0f).rotate((Quaternionfc)quaternionf).mul(f4).add(f, f2, f3);
            ParticleVertex.put((long)(l2 += 28L), (float)class00965.M.x, (float)class00965.M.y, (float)class00965.M.z, (float)f5, (float)f7, (int)n, (int)n2);
            M.set(-1.0f, -1.0f, 0.0f).rotate((Quaternionfc)quaternionf).mul(f4).add(f, f2, f3);
            ParticleVertex.put((long)(l2 += 28L), (float)class00965.M.x, (float)class00965.M.y, (float)class00965.M.z, (float)f5, (float)f8, (int)n, (int)n2);
            l2 += 28L;
            vertexBufferWriter.push(memoryStack, l, 4, ParticleVertex.FORMAT);
        }
    }

    public @Nullable class00977 N(class00438 class004382) {
        try (class02579 class025792 = class02579.N((int)(this.i * 4 * class07835.u.getVertexSize()));){
            class07331 class073312 = new class07331(class025792, VertexFormat.class_5596.field_27382, class07835.u);
            HashMap<class05846, class00984> hashMap = new HashMap<class05846, class00984>();
            int n3 = 0;
            for (Map.Entry<class05846, class00969> gpuBufferSlice2 : this.u.entrySet()) {
                gpuBufferSlice2.getValue().N((f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, n, n2) -> this.N((class01391)class073312, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, n, n2));
                if (gpuBufferSlice2.getValue().y() > 0) {
                    hashMap.put(gpuBufferSlice2.getKey(), new class00984(n3, gpuBufferSlice2.getValue().y() * 6));
                }
                n3 += gpuBufferSlice2.getValue().y() * 4;
            }
            class02609 class026092 = class073312.N();
            if (class026092 != null) {
                class004382.N(class026092.N());
                RenderSystem.getSequentialBuffer((VertexFormat.class_5596)VertexFormat.class_5596.field_27382).method_68274(class026092.L().L());
                GpuBufferSlice gpuBufferSlice = RenderSystem.getDynamicUniforms().N((Matrix4fc)RenderSystem.getModelViewMatrix(), (Vector4fc)new Vector4f(1.0f, 1.0f, 1.0f, 1.0f), (Vector3fc)new Vector3f(), (Matrix4fc)new Matrix4f());
                class00977 class009772 = new class00977(class026092.L().L(), gpuBufferSlice, hashMap);
                return class009772;
            }
            class00977 class009773 = null;
            return class009773;
        }
    }

    public void N(class00977 class009772, class00438 class004382, RenderPass renderPass, class08627 class086272, boolean bl) {
        RenderSystem.class_5590 class_55902 = RenderSystem.getSequentialBuffer((VertexFormat.class_5596)VertexFormat.class_5596.field_27382);
        renderPass.setVertexBuffer(0, class004382.N());
        renderPass.setIndexBuffer(class_55902.method_68274(class009772.N()), class_55902.method_31924());
        renderPass.setUniform("DynamicTransforms", class009772.y());
        for (Map.Entry<class05846, class00984> entry : class009772.L().entrySet()) {
            if (bl != entry.getKey().N()) continue;
            renderPass.setPipeline(entry.getKey().L());
            class08918 class089182 = class086272.y(entry.getKey().y());
            renderPass.bindTexture("Sampler0", class089182.method_71659(), class089182.method_75484());
            renderPass.drawIndexed(entry.getValue().N(), 0, entry.getValue().y(), 1);
        }
    }

    protected void N(class01391 class013912, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, int n, int n2) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class013912, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, n, n2, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        Quaternionf quaternionf = new Quaternionf(f4, f5, f6, f7);
        this.N(class013912, quaternionf, f, f2, f3, 1.0f, -1.0f, f8, f10, f12, n, n2);
        this.N(class013912, quaternionf, f, f2, f3, 1.0f, 1.0f, f8, f10, f11, n, n2);
        this.N(class013912, quaternionf, f, f2, f3, -1.0f, 1.0f, f8, f9, f11, n, n2);
        this.N(class013912, quaternionf, f, f2, f3, -1.0f, -1.0f, f8, f9, f12, n, n2);
    }

    public void N(class05846 class058463, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, int n, int n2) {
        this.u.computeIfAbsent(class058463, class058462 -> new class00969()).N(f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, n, n2);
        ++this.i;
    }
}

