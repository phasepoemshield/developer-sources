/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09308
 *  Nursultan.class10993
 *  Nursultan.class11938
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalFloatRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalFloatRef
 *  com.mojang.blaze3d.buffers.GpuBuffer$MappedView
 *  com.mojang.blaze3d.buffers.Std140Builder
 *  com.mojang.blaze3d.buffers.Std140SizeCalculator
 *  com.mojang.blaze3d.systems.CommandEncoder
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.textures.TextureFormat
 *  minecraft.class00084
 *  minecraft.class00579
 *  minecraft.class00608
 *  minecraft.class00917
 *  minecraft.class01056
 *  minecraft.class02566
 *  minecraft.class03386
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04643
 *  minecraft.class04995
 *  minecraft.class05363
 *  minecraft.class05630
 *  minecraft.class06069
 *  minecraft.class06202
 *  minecraft.class07047
 *  minecraft.class07376
 *  minecraft.class07438
 *  minecraft.class08394
 *  minecraft.class08700
 *  net.irisshaders.iris.mixin.LightTextureAccessor
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09308;
import Nursultan.class10993;
import Nursultan.class11938;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalFloatRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalFloatRef;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import java.nio.ByteBuffer;
import java.util.OptionalInt;
import minecraft.class00084;
import minecraft.class00579;
import minecraft.class00608;
import minecraft.class00917;
import minecraft.class01056;
import minecraft.class02566;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04643;
import minecraft.class04995;
import minecraft.class05363;
import minecraft.class05630;
import minecraft.class06069;
import minecraft.class06202;
import minecraft.class07047;
import minecraft.class07376;
import minecraft.class07438;
import minecraft.class08394;
import minecraft.class08700;
import net.irisshaders.iris.mixin.LightTextureAccessor;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03042
implements AutoCloseable,
LightTextureAccessor {
    public static final int N = 0xF000F0;
    public static final int y = 0xF00000;
    public static final int L = 240;
    private static final int u = 16;
    private static final int i = new Std140SizeCalculator().putFloat().putFloat().putFloat().putFloat().putFloat().putFloat().putFloat().putVec3().putVec3().get();
    private final GpuTexture R;
    private final GpuTextureView M;
    private boolean B;
    private float Z;
    private final class03386 z;
    private final class06202 U;
    private final class00084 E;
    private final class06069 W = class06069.u();

    public class03042(class03386 class033862, class06202 class062022) {
        this.z = class033862;
        this.U = class062022;
        GpuDevice gpuDevice = RenderSystem.getDevice();
        this.R = gpuDevice.createTexture("Light Texture", 12, TextureFormat.RGBA8, 16, 16, 1, 1);
        this.M = gpuDevice.createTextureView(this.R);
        gpuDevice.createCommandEncoder().clearColorTexture(this.R, -1);
        this.E = new class00084(() -> "Lightmap UBO", 130, i);
    }

    @Override
    public void close() {
        this.R.close();
        this.M.close();
        this.E.close();
    }

    private void y(CallbackInfoReturnable callbackInfoReturnable) {
        class10993 class109932 = class10993.L();
        class11938.L().L((Object)class109932);
        if (class109932.y()) {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(0.0f));
        }
    }

    public static int y(int n, int n2) {
        if (n2 == 0) {
            return n;
        }
        int n3 = Math.max(class03042.y(n), n2);
        return class03042.N(Math.max(class03042.N(n), n2), n3);
    }

    public static int y(int n) {
        return n >>> 20 & 0xF;
    }

    public void y() {
        this.Z += (this.W.z() - this.W.z()) * this.W.z() * this.W.z() * 0.1f;
        this.Z *= 0.9f;
        this.B = true;
    }

    private void N(class07438 class074382, float f, float f2, CallbackInfoReturnable callbackInfoReturnable) {
        CapturedRenderingState.INSTANCE.setDarknessLightFactor((float)((double)((Float)callbackInfoReturnable.getReturnValue()).floatValue() * (Double)((class05630)this.U.i_7).NO().method_41753()));
    }

    private void N(float f, CallbackInfo callbackInfo) {
        CapturedRenderingState.INSTANCE.setDarknessLightFactor(0.0f);
    }

    public static int N(int n, int n2) {
        return n << 4 | n2 << 20;
    }

    private class04643 N(class04643 class046432, LocalFloatRef localFloatRef) {
        class09308 class093082 = class09308.N((float)localFloatRef.get());
        class11938.L().L((Object)class093082);
        localFloatRef.set(class093082.N());
        return class046432;
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        class10993 class109932 = class10993.L();
        class11938.L().L((Object)class109932);
        if (class109932.y()) {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(0.0f));
        }
    }

    public GpuTextureView N() {
        return this.M;
    }

    public static int N(int n) {
        return n >>> 4 & 0xF;
    }

    public static float N(float f, int n) {
        float f2 = (float)n / 15.0f;
        float f3 = f2 / (4.0f - 3.0f * f2);
        return class04995.B((float)f, (float)f3, (float)1.0f);
    }

    public static float N(class07376 class073762, int n) {
        return class03042.N(class073762.E(), n);
    }

    public void N(float f) {
        float f2;
        Vector3f vector3f;
        if (!this.B) {
            return;
        }
        this.B = false;
        class04643 class046432 = class08700.N();
        class046432.N("lightTex");
        class03448 class034482 = (class03448)this.U.T_3;
        if (class034482 == null) {
            return;
        }
        class05363 class053632 = ((class03386)this.U.i_5).s();
        class00579 class005792 = class053632.U();
        this.N(f, null);
        int n = (Integer)class005792.N(class00608.b, f);
        float f3 = class034482.method_8597().E();
        float f4 = ((Float)class053632.U().N(class00608.j, f)).floatValue();
        class00917 class009172 = class034482.R();
        if (class009172 != null) {
            vector3f = new Vector3f(0.99f, 1.12f, 1.0f);
            if (!((Boolean)((class05630)this.U.i_7).y().method_41753()).booleanValue()) {
                f2 = class009172.N(f);
                f4 = ((class01056)this.U.i_6).U().u() ? (f4 += f2 / 3.0f) : (f4 += f2);
            }
        } else {
            vector3f = new Vector3f(1.0f, 1.0f, 1.0f);
        }
        f2 = ((Double)((class05630)this.U.i_7).NO().method_41753()).floatValue();
        float f5 = ((class04453)this.U.T_4).method_66279(class07047.J, f) * f2;
        float f6 = this.N((class07438)((class04453)this.U.T_4), f5, f) * f2;
        float f7 = ((class04453)this.U.T_4).j();
        float f8 = ((class04453)this.U.T_4).method_6059(class07047.s) ? class03386.N((class07438)((class04453)this.U.T_4), (float)f) : (f7 > 0.0f && ((class04453)this.U.T_4).method_6059(class07047.Q) ? f7 : 0.0f);
        float f9 = this.Z + 1.5f;
        float f10 = ((Double)((class05630)this.U.i_7).No().method_41753()).floatValue();
        CommandEncoder commandEncoder = RenderSystem.getDevice().createCommandEncoder();
        LocalFloatRefImpl localFloatRefImpl = new LocalFloatRefImpl();
        localFloatRefImpl.init(f8);
        f8 = localFloatRefImpl.dispose();
        class046432 = this.N(class046432, (LocalFloatRef)localFloatRefImpl);
        CommandEncoder commandEncoder2 = commandEncoder;
        try (GpuBuffer.MappedView mappedView = commandEncoder2.mapBuffer(this.E.y(), false, true);){
            Std140Builder.intoBuffer((ByteBuffer)mappedView.data()).putFloat(f3).putFloat(f4).putFloat(f9).putFloat(f8).putFloat(f6).putFloat(this.z.L(f)).putFloat(Math.max(0.0f, f10 - f5)).putVec3((Vector3fc)class02566.U((int)n)).putVec3((Vector3fc)vector3f);
        }
        mappedView = commandEncoder2.createRenderPass(() -> "Update light", this.M, OptionalInt.empty());
        try {
            mappedView.setPipeline(class08394.yu);
            RenderSystem.bindDefaultUniforms((RenderPass)mappedView);
            mappedView.setUniform("LightmapInfo", this.E.y());
            mappedView.draw(0, 3);
        }
        finally {
            if (mappedView != null) {
                mappedView.close();
            }
        }
        this.E.L();
        class046432.L();
    }

    private float N(class07438 class074382, float f, float f2) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueF();
        }
        CallbackInfoReturnable callbackInfoReturnable2 = new CallbackInfoReturnable("", true);
        this.y(callbackInfoReturnable2);
        if (callbackInfoReturnable2.isCancelled()) {
            return callbackInfoReturnable2.getReturnValueF();
        }
        float f3 = 0.45f * f;
        float f4 = Math.max(0.0f, class04995.P((double)(((float)class074382.field_6012 - f2) * (float)Math.PI * 0.025f)) * f3);
        this.N(class074382, f, f2, new CallbackInfoReturnable("", false, f4));
        return f4;
    }

    public /* synthetic */ GpuTexture getLightTexture() {
        return this.R;
    }
}

