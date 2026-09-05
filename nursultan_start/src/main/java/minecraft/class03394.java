/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09324
 *  Nursultan.class11938
 *  com.google.common.collect.Lists
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.buffers.Std140Builder
 *  com.mojang.blaze3d.buffers.Std140SizeCalculator
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderSystem
 *  java.lang.MatchException
 *  me.flashyreese.mods.sodiumextra.client.fog.FogEnvironmentExtended
 *  minecraft.class00084
 *  minecraft.class02233
 *  minecraft.class02566
 *  minecraft.class03556
 *  minecraft.class03968
 *  minecraft.class03970
 *  minecraft.class03998
 *  minecraft.class04453
 *  minecraft.class04798
 *  minecraft.class04995
 *  minecraft.class05363
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07438
 *  minecraft.class08995
 *  minecraft.class09005
 *  minecraft.class09017
 *  minecraft.class09042
 *  minecraft.class09043
 *  net.caffeinemc.mods.sodium.client.util.FogParameters
 *  net.caffeinemc.mods.sodium.client.util.FogStorage
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 *  org.lwjgl.system.MemoryStack
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09324;
import Nursultan.class11938;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import java.util.List;
import me.flashyreese.mods.sodiumextra.client.fog.FogEnvironmentExtended;
import minecraft.class00084;
import minecraft.class02233;
import minecraft.class02566;
import minecraft.class03386;
import minecraft.class03396;
import minecraft.class03448;
import minecraft.class03556;
import minecraft.class03968;
import minecraft.class03970;
import minecraft.class03998;
import minecraft.class04453;
import minecraft.class04798;
import minecraft.class04995;
import minecraft.class05363;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07438;
import minecraft.class08995;
import minecraft.class09005;
import minecraft.class09017;
import minecraft.class09042;
import minecraft.class09043;
import net.caffeinemc.mods.sodium.client.util.FogParameters;
import net.caffeinemc.mods.sodium.client.util.FogStorage;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.joml.Vector4f;
import org.joml.Vector4fc;
import org.lwjgl.system.MemoryStack;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03394
implements AutoCloseable,
FogStorage {
    public static final int N = new Std140SizeCalculator().putVec4().putFloat().putFloat().putFloat().putFloat().putFloat().putFloat().get();
    private static final List<class09005> y = Lists.newArrayList((Object[])new class09005[]{new class08995(), new class09017(), new class03968(), new class03998(), new class09043(), new class09042()});
    private static boolean L = true;
    private final GpuBuffer u;
    private final class00084 i;
    private FogParameters R = FogParameters.NONE;

    public class03394() {
        GpuDevice gpuDevice = RenderSystem.getDevice();
        this.i = new class00084(() -> "Fog UBO", 130, N);
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            ByteBuffer byteBuffer = memoryStack.malloc(N);
            this.N(byteBuffer, 0, new Vector4f(0.0f), Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE);
            this.u = gpuDevice.createBuffer(() -> "Empty fog", 128, byteBuffer.flip());
        }
        RenderSystem.setShaderFog((GpuBufferSlice)this.N(class03396.field_60101));
    }

    @Override
    public void close() {
        this.u.close();
        this.i.close();
    }

    private void y(class05363 class053632, int n, class02233 class022332, float f, class03448 class034482, CallbackInfoReturnable callbackInfoReturnable) {
        CapturedRenderingState.INSTANCE.setFogColor(((Vector4f)callbackInfoReturnable.getReturnValue()).x, ((Vector4f)callbackInfoReturnable.getReturnValue()).y, ((Vector4f)callbackInfoReturnable.getReturnValue()).z);
    }

    public static boolean y() {
        L = !L;
        return L;
    }

    private Vector4f N(Vector4f vector4f) {
        class09324 class093242 = class09324.N((float)vector4f.x, (float)vector4f.y, (float)vector4f.z, (float)vector4f.w);
        class11938.L().L((Object)class093242);
        return new Vector4f(class093242.L(), class093242.u(), class093242.N(), class093242.y());
    }

    public void N(class05363 class053632, int n, class02233 class022332, float f, class03448 class034482, CallbackInfoReturnable callbackInfoReturnable, float f2, Vector4f vector4f, float f3, class04798 class047982, class07049 class070492, class03970 class039702) {
        for (class09005 class090052 : y) {
            if (!class090052.N(class047982, class070492) || !(class090052 instanceof FogEnvironmentExtended)) continue;
            ((FogEnvironmentExtended)class090052).sodium_extra$applyFogSettings(class047982, class039702, class070492, class053632.u(), class034482, f3);
            break;
        }
    }

    private void N(class05363 class053632, int n, class02233 class022332, float f, class03448 class034482, CallbackInfoReturnable callbackInfoReturnable) {
        if (class053632.W() == class04798.field_27886) {
            class07049 class070492 = class053632.B();
            float f2 = 0.05f;
            if (class070492 instanceof class04453) {
                class04453 class044532 = (class04453)class070492;
                f2 -= class044532.j() * class044532.j() * 0.03f;
                class03556 var10 = class044532.method_73183().i(class044532.method_24515());
            }
            CapturedRenderingState.INSTANCE.setFogDensity(f2);
        } else {
            CapturedRenderingState.INSTANCE.setFogDensity(-1.0f);
        }
    }

    private void N(class05363 class053632, int n, class02233 class022332, float f, class03448 class034482, CallbackInfoReturnable callbackInfoReturnable, class03970 class039702, Vector4f vector4f) {
        this.R = new FogParameters(vector4f.x, vector4f.y, vector4f.z, vector4f.w, class039702.N, class039702.L, class039702.y, class039702.u);
    }

    public GpuBufferSlice N(class03396 class033962) {
        if (!L) {
            return this.u.slice(0L, (long)N);
        }
        return switch (class033962.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> this.u.slice(0L, (long)N);
            case 1 -> this.i.y().slice(0L, (long)N);
        };
    }

    private Vector4f N(class05363 class053632, float f, class03448 class034482, int n, float f2) {
        class07438 class074382;
        float f3;
        class04798 class047982 = this.N(class053632);
        class07049 class070492 = class053632.B();
        class09005 class090052 = null;
        class09005 class090053 = null;
        for (class09005 class090054 : y) {
            if (!class090054.N(class047982, class070492)) continue;
            if (class090052 == null && class090054.N()) {
                class090052 = class090054;
            }
            if (class090053 != null || !class090054.y()) continue;
            class090053 = class090054;
        }
        if (class090052 == null) {
            throw new IllegalStateException("No color source environment found");
        }
        int n2 = class090052.N(class034482, class053632, n, f);
        float f4 = class034482.method_8401().u();
        float f5 = class04995.N((float)((f4 + (float)class034482.method_31607() - (float)class053632.y().B) / f4), (float)0.0f, (float)1.0f);
        if (class090053 != null) {
            class07438 class074383 = (class07438)class070492;
            f5 = class090053.N(class074383, f5, f);
        }
        float f6 = class02566.m((int)n2);
        float f7 = class02566.P((int)n2);
        float f8 = class02566.s((int)n2);
        if (f5 > 0.0f && class047982 != class04798.field_27885 && class047982 != class04798.field_27887) {
            f3 = class04995.z((float)(1.0f - f5));
            f6 *= f3;
            f7 *= f3;
            f8 *= f3;
        }
        if (f2 > 0.0f) {
            f6 = class04995.B((float)f2, (float)f6, (float)(f6 * 0.7f));
            f7 = class04995.B((float)f2, (float)f7, (float)(f7 * 0.6f));
            f8 = class04995.B((float)f2, (float)f8, (float)(f8 * 0.6f));
        }
        f3 = class047982 == class04798.field_27886 ? (class070492 instanceof class04453 ? ((class04453)class070492).j() : 1.0f) : (class070492 instanceof class07438 && (class074382 = (class07438)class070492).method_6059(class07047.s) && !class074382.method_6059(class07047.J) ? class03386.N(class074382, f) : 0.0f);
        if (f6 != 0.0f && f7 != 0.0f && f8 != 0.0f) {
            float f9 = 1.0f / Math.max(f6, Math.max(f7, f8));
            f6 = class04995.B((float)f3, (float)f6, (float)(f6 * f9));
            f7 = class04995.B((float)f3, (float)f7, (float)(f7 * f9));
            f8 = class04995.B((float)f3, (float)f8, (float)(f8 * f9));
        }
        return new Vector4f(f6, f7, f8, 1.0f);
    }

    public Vector4f N(class05363 class053632, int n, class02233 class022332, float f, class03448 class034482) {
        class09005 class0900522;
        this.N(class053632, n, class022332, f, class034482, null);
        float f2 = class022332.N(false);
        Vector4f vector4f = this.N(this.N(class053632, f2, class034482, n, f));
        float f3 = n * 16;
        class04798 class047982 = this.N(class053632);
        class07049 class070492 = class053632.B();
        class03970 class039702 = new class03970();
        for (class09005 class0900522 : y) {
            if (!class0900522.N(class047982, class070492)) continue;
            class0900522.N(class039702, class053632, class034482, f3, class022332);
            break;
        }
        float f4 = class04995.N((float)(f3 / 10.0f), (float)4.0f, (float)64.0f);
        class039702.y = f3 - f4;
        class039702.u = f3;
        this.N(class053632, n, class022332, f, class034482, null, f2, vector4f, f3, class047982, class070492, class039702);
        class0900522 = RenderSystem.getDevice().createCommandEncoder().mapBuffer(this.i.y(), false, true);
        try {
            ByteBuffer byteBuffer = class0900522.data();
            float f5 = class039702.N;
            float f6 = class039702.L;
            float f7 = class039702.y;
            float f8 = class039702.u;
            float f9 = class039702.i;
            float f10 = class039702.R;
            this.N(class053632, n, class022332, f, class034482, null, class039702, vector4f);
            this.N(byteBuffer, 0, vector4f, f5, f6, f7, f8, f9, f10);
        }
        finally {
            if (class0900522 != null) {
                class0900522.close();
            }
        }
        Vector4f vector4f2 = vector4f;
        this.y(class053632, n, class022332, f, class034482, new CallbackInfoReturnable("", false, (Object)vector4f2));
        return vector4f2;
    }

    public void N() {
        this.i.L();
    }

    private void N(ByteBuffer byteBuffer, int n, Vector4f vector4f, float f, float f2, float f3, float f4, float f5, float f6) {
        byteBuffer.position(n);
        Std140Builder.intoBuffer((ByteBuffer)byteBuffer).putVec4((Vector4fc)vector4f).putFloat(f).putFloat(f2).putFloat(f3).putFloat(f4).putFloat(f5).putFloat(f6);
    }

    private class04798 N(class05363 class053632) {
        class04798 class047982 = class053632.W();
        if (class047982 == class04798.field_27888) {
            return class04798.field_60563;
        }
        return class047982;
    }

    public FogParameters sodium$getFogParameters() {
        return this.R;
    }
}

