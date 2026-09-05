/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  minecraft.class00405
 *  minecraft.class00941
 *  minecraft.class01391
 *  minecraft.class03504
 *  minecraft.class07913
 *  minecraft.class07915
 *  minecraft.class07948
 *  net.caffeinemc.mods.sodium.api.math.MatrixHelper
 *  net.caffeinemc.mods.sodium.api.util.ColorARGB
 *  net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter
 *  net.caffeinemc.mods.sodium.api.vertex.format.common.GlyphVertex
 *  net.caffeinemc.mods.sodium.client.render.vertex.VertexConsumerUtils
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.lwjgl.system.MemoryStack
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.blaze3d.textures.GpuTextureView;
import minecraft.class00405;
import minecraft.class00941;
import minecraft.class01391;
import minecraft.class03504;
import minecraft.class05245;
import minecraft.class05247;
import minecraft.class05274;
import minecraft.class07913;
import minecraft.class07915;
import minecraft.class07948;
import net.caffeinemc.mods.sodium.api.math.MatrixHelper;
import net.caffeinemc.mods.sodium.api.util.ColorARGB;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import net.caffeinemc.mods.sodium.api.vertex.format.common.GlyphVertex;
import net.caffeinemc.mods.sodium.client.render.vertex.VertexConsumerUtils;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.system.MemoryStack;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05272
implements class07913,
class07948 {
    public static final float N = 0.001f;
    final class05247 y;
    final class03504 L;
    public final GpuTextureView u;
    public final float i;
    public final float R;
    public final float M;
    public final float B;
    public final float Z;
    public final float z;
    public final float U;
    public final float E;

    private float L() {
        return 1.0f - 0.25f * this.U;
    }

    float L(class05274 class052742) {
        return class052742.u() + this.z + (class052742.L() ? class052742.j() : 0.0f) + (class052742.z().u() ? Math.max(this.L(), this.y()) : 0.0f) + class05272.N(class052742.z().L());
    }

    public class05272(class05247 class052472, class03504 class035042, GpuTextureView gpuTextureView, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.y = class052472;
        this.L = class035042;
        this.u = gpuTextureView;
        this.i = f;
        this.R = f2;
        this.M = f3;
        this.B = f4;
        this.Z = f5;
        this.z = f6;
        this.U = f7;
        this.E = f8;
    }

    float u(class05274 class052742) {
        return class052742.i() + this.E + (class052742.L() ? class052742.j() : 0.0f) + class05272.N(class052742.z().L());
    }

    private float y() {
        return 1.0f - 0.25f * this.E;
    }

    float y(class05274 class052742) {
        return class052742.i() + this.U - class05272.N(class052742.z().L());
    }

    public class07915 N(float f, float f2, int n, int n2, class00405 class004052, float f3, float f4) {
        return new class05274(f, f2, n, n2, this, class004052, f3, f4);
    }

    public class00941 N(float f, float f2, float f3, float f4, float f5, int n, int n2, float f6) {
        return new class05245(this, f, f2, f3, f4, f5, n, n2, f6);
    }

    public class05247 N() {
        return this.y;
    }

    private void N(boolean bl, float f, float f2, float f3, Matrix4f matrix4f, class01391 class013912, int n, boolean bl2, int n2, CallbackInfo callbackInfo) {
        VertexBufferWriter vertexBufferWriter = VertexConsumerUtils.convertOrLog((class01391)class013912);
        if (vertexBufferWriter == null) {
            return;
        }
        callbackInfo.cancel();
        float f4 = f + this.Z;
        float f5 = f + this.z;
        float f6 = f2 + this.U;
        float f7 = f2 + this.E;
        float f8 = bl ? 1.0f - 0.25f * this.U : 0.0f;
        float f9 = bl ? 1.0f - 0.25f * this.E : 0.0f;
        float f10 = bl2 ? 0.1f : 0.0f;
        int n3 = ColorARGB.toABGR((int)n);
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            long l;
            long l2 = l = memoryStack.nmalloc(112);
            class05272.N(l2, matrix4f, f4 + f8 - f10, f6 - f10, f3, n3, this.i, this.M, n2);
            class05272.N(l2 += 28L, matrix4f, f4 + f9 - f10, f7 + f10, f3, n3, this.i, this.B, n2);
            class05272.N(l2 += 28L, matrix4f, f5 + f9 + f10, f7 + f10, f3, n3, this.R, this.B, n2);
            class05272.N(l2 += 28L, matrix4f, f5 + f8 + f10, f6 - f10, f3, n3, this.R, this.M, n2);
            l2 += 28L;
            vertexBufferWriter.push(memoryStack, l, 4, GlyphVertex.FORMAT);
        }
    }

    private void N(class05245 class052452, float f, float f2, int n, class01391 class013912, int n2, Matrix4f matrix4f, CallbackInfo callbackInfo) {
        VertexBufferWriter vertexBufferWriter = VertexConsumerUtils.convertOrLog((class01391)class013912);
        if (vertexBufferWriter == null) {
            return;
        }
        callbackInfo.cancel();
        float f3 = class052452.i();
        float f4 = class052452.M();
        float f5 = class052452.B();
        float f6 = class052452.R();
        float f7 = f2;
        int n3 = ColorARGB.toABGR((int)n);
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            long l;
            long l2 = l = memoryStack.nmalloc(112);
            class05272.N(l2, matrix4f, f3 + f, f5 + f, f7, n3, this.i, this.M, n2);
            class05272.N(l2 += 28L, matrix4f, f4 + f, f5 + f, f7, n3, this.i, this.B, n2);
            class05272.N(l2 += 28L, matrix4f, f4 + f, f6 + f, f7, n3, this.R, this.B, n2);
            class05272.N(l2 += 28L, matrix4f, f3 + f, f6 + f, f7, n3, this.R, this.M, n2);
            l2 += 28L;
            vertexBufferWriter.push(memoryStack, l, 4, GlyphVertex.FORMAT);
        }
    }

    private static void N(long l, Matrix4f matrix4f, float f, float f2, float f3, int n, float f4, float f5, int n2) {
        float f6 = MatrixHelper.transformPositionX((Matrix4fc)matrix4f, (float)f, (float)f2, (float)f3);
        float f7 = MatrixHelper.transformPositionY((Matrix4fc)matrix4f, (float)f, (float)f2, (float)f3);
        float f8 = MatrixHelper.transformPositionZ((Matrix4fc)matrix4f, (float)f, (float)f2, (float)f3);
        GlyphVertex.put((long)l, (float)f6, (float)f7, (float)f8, (int)n, (float)f4, (float)f5, (int)n2);
    }

    void N(class05274 class052742, Matrix4f matrix4f, class01391 class013912, int n, boolean bl) {
        float f;
        float f2;
        class00405 class004052 = class052742.z();
        boolean bl2 = class004052.u();
        float f3 = class052742.u();
        float f4 = class052742.i();
        int n2 = class052742.R();
        boolean bl3 = class004052.L();
        float f5 = f2 = bl ? 0.0f : 0.001f;
        if (class052742.L()) {
            int n3 = class052742.M();
            this.N(bl2, f3 + class052742.j(), f4 + class052742.j(), 0.0f, matrix4f, class013912, n3, bl3, n);
            if (bl3) {
                this.N(bl2, f3 + class052742.Z() + class052742.j(), f4 + class052742.j(), f2, matrix4f, class013912, n3, true, n);
            }
            f = bl ? 0.0f : 0.03f;
        } else {
            f = 0.0f;
        }
        this.N(bl2, f3, f4, f, matrix4f, class013912, n2, bl3, n);
        if (bl3) {
            this.N(bl2, f3 + class052742.Z(), f4, f + f2, matrix4f, class013912, n2, true, n);
        }
    }

    private void N(boolean bl, float f, float f2, float f3, Matrix4f matrix4f, class01391 class013912, int n, boolean bl2, int n2) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(bl, f, f2, f3, matrix4f, class013912, n, bl2, n2, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        float f4 = f + this.Z;
        float f5 = f + this.z;
        float f6 = f2 + this.U;
        float f7 = f2 + this.E;
        float f8 = bl ? this.L() : 0.0f;
        float f9 = bl ? this.y() : 0.0f;
        float f10 = class05272.N(bl2);
        class013912.N((Matrix4fc)matrix4f, f4 + f8 - f10, f6 - f10, f3).method_39415(n).method_22913(this.i, this.M).method_60803(n2);
        class013912.N((Matrix4fc)matrix4f, f4 + f9 - f10, f7 + f10, f3).method_39415(n).method_22913(this.i, this.B).method_60803(n2);
        class013912.N((Matrix4fc)matrix4f, f5 + f9 + f10, f7 + f10, f3).method_39415(n).method_22913(this.R, this.B).method_60803(n2);
        class013912.N((Matrix4fc)matrix4f, f5 + f8 + f10, f6 - f10, f3).method_39415(n).method_22913(this.R, this.M).method_60803(n2);
    }

    private static float N(boolean bl) {
        return bl ? 0.1f : 0.0f;
    }

    float N(class05274 class052742) {
        return class052742.u() + this.Z + (class052742.z().u() ? Math.min(this.L(), this.y()) : 0.0f) - class05272.N(class052742.z().L());
    }

    void N(class05245 class052452, Matrix4f matrix4f, class01391 class013912, int n, boolean bl) {
        float f;
        float f2 = f = bl ? 0.0f : class052452.Z();
        if (class052452.L()) {
            this.N(class052452, class052452.s(), f, class052452.P(), class013912, n, matrix4f);
            f += bl ? 0.0f : 0.03f;
        }
        this.N(class052452, 0.0f, f, class052452.z(), class013912, n, matrix4f);
    }

    private void N(class05245 class052452, float f, float f2, int n, class01391 class013912, int n2, Matrix4f matrix4f) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class052452, f, f2, n, class013912, n2, matrix4f, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class013912.N((Matrix4fc)matrix4f, class052452.i() + f, class052452.B() + f, f2).method_39415(n).method_22913(this.i, this.M).method_60803(n2);
        class013912.N((Matrix4fc)matrix4f, class052452.M() + f, class052452.B() + f, f2).method_39415(n).method_22913(this.i, this.B).method_60803(n2);
        class013912.N((Matrix4fc)matrix4f, class052452.M() + f, class052452.E() + f, f2).method_39415(n).method_22913(this.R, this.B).method_60803(n2);
        class013912.N((Matrix4fc)matrix4f, class052452.i() + f, class052452.E() + f, f2).method_39415(n).method_22913(this.R, this.M).method_60803(n2);
    }
}

