/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalBooleanRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalBooleanRef
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00741
 *  minecraft.class00891
 *  minecraft.class01231
 *  minecraft.class01391
 *  minecraft.class03063
 *  minecraft.class04651
 *  minecraft.class04688
 *  minecraft.class04995
 *  minecraft.class06229
 *  minecraft.class06889
 *  minecraft.class07131
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07290
 *  minecraft.class07295
 *  minecraft.class08097
 *  minecraft.class08388
 *  minecraft.class08874
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler
 *  net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry
 *  net.fabricmc.fabric.impl.client.rendering.fluid.FluidRenderHandlerInfo
 *  net.fabricmc.fabric.impl.client.rendering.fluid.FluidRenderHandlerRegistryImpl
 *  net.fabricmc.fabric.impl.client.rendering.fluid.FluidRenderingImpl
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalBooleanRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalBooleanRef;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00741;
import minecraft.class00891;
import minecraft.class01231;
import minecraft.class01391;
import minecraft.class03063;
import minecraft.class04651;
import minecraft.class04688;
import minecraft.class04995;
import minecraft.class06229;
import minecraft.class06889;
import minecraft.class07131;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07290;
import minecraft.class07295;
import minecraft.class08097;
import minecraft.class08388;
import minecraft.class08874;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandler;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.impl.client.rendering.fluid.FluidRenderHandlerInfo;
import net.fabricmc.fabric.impl.client.rendering.fluid.FluidRenderHandlerRegistryImpl;
import net.fabricmc.fabric.impl.client.rendering.fluid.FluidRenderingImpl;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class03760 {
    private static final float N = 0.8888889f;
    private final class08388 y;
    private final class08388 L;
    private final class08388 u;
    private final class08388 i;
    private final class08388 R;

    public class03760(class08097 class080972) {
        this.y = class080972.N(class08874.L);
        this.L = class080972.N(class08874.u);
        this.u = class080972.N(class08874.i);
        this.i = class080972.N(class08874.R);
        this.R = class080972.N(class08874.M);
        this.N((CallbackInfo)null);
    }

    private static boolean y(class07211 class072112, float f, class00500 class005002) {
        return class03760.N(class072112, f, class005002);
    }

    public class08388 y(class08388 class083882) {
        return this.N(1, class083882);
    }

    private class08388 N(int n, class08388 class083882) {
        FluidRenderHandlerInfo fluidRenderHandlerInfo = FluidRenderingImpl.getCurrentInfo();
        if (fluidRenderHandlerInfo.handler == null) {
            return class083882;
        }
        if (fluidRenderHandlerInfo.sprites.length == n - 1) {
            return class083882;
        }
        return fluidRenderHandlerInfo.sprites[n];
    }

    public void N(class07295 class072952, class07209 class072092, class01391 class013912, class00500 class005002, class04688 class046882, CallbackInfo callbackInfo) {
        FluidRenderHandler fluidRenderHandler;
        if (FluidRenderingImpl.getCurrentInfo().handler == null && (fluidRenderHandler = FluidRenderHandlerRegistry.INSTANCE.get(class046882.N())) != null) {
            fluidRenderHandler.renderFluid(class072092, class072952, class013912, class005002, class046882);
            callbackInfo.cancel();
        }
    }

    public void N(CallbackInfo callbackInfo) {
        class03760 class037602 = this;
        ((FluidRenderHandlerRegistryImpl)FluidRenderHandlerRegistry.INSTANCE).onFluidRendererReload(class037602, new class08388[]{this.u, this.i, this.R}, new class08388[]{this.y, this.L}, this.R);
    }

    private int N(class07295 class072952, class07209 class072092) {
        int n = class03063.N((class07295)class072952, (class07209)class072092);
        int n2 = class03063.N((class07295)class072952, (class07209)class072092.method_10084());
        int n3 = n & 0xFF;
        int n4 = n2 & 0xFF;
        int n5 = n >> 16 & 0xFF;
        int n6 = n2 >> 16 & 0xFF;
        return (n3 > n4 ? n3 : n4) | (n5 > n6 ? n5 : n6) << 16;
    }

    private void N(class01391 class013912, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int n) {
        class013912.method_22912(f, f2, f3).method_22915(f4, f5, f6, 1.0f).method_22913(f7, f8).method_60803(n).method_22914(0.0f, 1.0f, 0.0f);
    }

    private boolean N(boolean bl, LocalBooleanRef localBooleanRef) {
        return !localBooleanRef.get();
    }

    private class08388 N(class08388 class083882, class07295 class072952, class07209 class072092, boolean bl, class08388 class083883, LocalBooleanRef localBooleanRef) {
        FluidRenderHandlerInfo fluidRenderHandlerInfo = FluidRenderingImpl.getCurrentInfo();
        boolean bl2 = fluidRenderHandlerInfo.handler != null ? fluidRenderHandlerInfo.hasOverlay : !bl;
        class00891 class008912 = class072952.method_8320(class072092).i();
        localBooleanRef.set(bl2 && FluidRenderHandlerRegistry.INSTANCE.isBlockTransparent(class008912));
        if (localBooleanRef.get()) {
            return fluidRenderHandlerInfo.handler != null ? fluidRenderHandlerInfo.overlaySprite : this.R;
        }
        return class083883;
    }

    public int N(int n, class07295 class072952, class07209 class072092, class01391 class013912, class00500 class005002, class04688 class046882) {
        FluidRenderHandlerInfo fluidRenderHandlerInfo = FluidRenderingImpl.getCurrentInfo();
        return fluidRenderHandlerInfo.handler != null ? fluidRenderHandlerInfo.handler.getFluidColor(class072952, class072092, class046882) : n;
    }

    public class08388 N(class08388 class083882) {
        return this.N(0, class083882);
    }

    public void N(class07295 class072952, class07209 class072092, class01391 class013912, class00500 class005002, class04688 class046882) {
        int n;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        LocalBooleanRefImpl localBooleanRefImpl = new LocalBooleanRefImpl();
        localBooleanRefImpl.init(false);
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class072952, class072092, class013912, class005002, class046882, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        boolean bl = class046882.N(class01231.y);
        class08388 class083882 = bl ? this.y : this.u;
        class083882 = this.N(class083882);
        class08388 class083883 = bl ? this.L : this.i;
        class083883 = this.y(class083883);
        int n2 = bl ? this.N(0xFFFFFF, class072952, class072092, class013912, class005002, class046882) : this.N(class06229.u((class07295)class072952, (class07209)class072092), class072952, class072092, class013912, class005002, class046882);
        float f18 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f19 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f20 = (float)(n2 & 0xFF) / 255.0f;
        class00500 class005003 = class072952.method_8320(class072092.method_10093(class07211.field_11033));
        class04688 class046883 = class005003.Y();
        class00500 class005004 = class072952.method_8320(class072092.method_10093(class07211.field_11036));
        class04688 class046884 = class005004.Y();
        class00500 class005005 = class072952.method_8320(class072092.method_10093(class07211.field_11043));
        class04688 class046885 = class005005.Y();
        class00500 class005006 = class072952.method_8320(class072092.method_10093(class07211.field_11035));
        class04688 class046886 = class005006.Y();
        class00500 class005007 = class072952.method_8320(class072092.method_10093(class07211.field_11039));
        class04688 class046887 = class005007.Y();
        class00500 class005008 = class072952.method_8320(class072092.method_10093(class07211.field_11034));
        class04688 class046888 = class005008.Y();
        boolean bl2 = !class03760.N(class046882, class046884);
        boolean bl3 = class03760.N(class046882, class005002, class07211.field_11033, class046883) && !class03760.y(class07211.field_11033, 0.8888889f, class005003);
        int n3 = class03760.N(class046882, class005002, class07211.field_11043, class046885);
        int n4 = class03760.N(class046882, class005002, class07211.field_11035, class046886);
        int n5 = class03760.N(class046882, class005002, class07211.field_11039, class046887);
        int n6 = class03760.N(class046882, class005002, class07211.field_11034, class046888);
        if (!bl2 && !bl3 && n6 == 0 && n5 == 0 && n3 == 0 && n4 == 0) {
            return;
        }
        float f21 = class072952.method_24852(class07211.field_11033, true);
        float f22 = class072952.method_24852(class07211.field_11036, true);
        float f23 = class072952.method_24852(class07211.field_11043, true);
        float f24 = class072952.method_24852(class07211.field_11039, true);
        class04651 class046512 = class046882.N();
        float f25 = this.N(class072952, class046512, class072092, class005002, class046882);
        if (f25 >= 1.0f) {
            f17 = 1.0f;
            f16 = 1.0f;
            f15 = 1.0f;
            f14 = 1.0f;
        } else {
            f13 = this.N(class072952, class046512, class072092.method_10095(), class005005, class046885);
            f12 = this.N(class072952, class046512, class072092.method_10072(), class005006, class046886);
            f11 = this.N(class072952, class046512, class072092.method_10078(), class005008, class046888);
            f10 = this.N(class072952, class046512, class072092.method_10067(), class005007, class046887);
            f17 = this.N(class072952, class046512, f25, f13, f11, class072092.method_10093(class07211.field_11043).method_10093(class07211.field_11034));
            f16 = this.N(class072952, class046512, f25, f13, f10, class072092.method_10093(class07211.field_11043).method_10093(class07211.field_11039));
            f15 = this.N(class072952, class046512, f25, f12, f11, class072092.method_10093(class07211.field_11035).method_10093(class07211.field_11034));
            f14 = this.N(class072952, class046512, f25, f12, f10, class072092.method_10093(class07211.field_11035).method_10093(class07211.field_11039));
        }
        f13 = class072092.method_10263() & 0xF;
        f12 = class072092.method_10264() & 0xF;
        f11 = class072092.method_10260() & 0xF;
        f10 = 0.001f;
        float f26 = f9 = bl3 ? 0.001f : 0.0f;
        if (bl2 && !class03760.y(class07211.field_11036, Math.min(Math.min(f16, f14), Math.min(f15, f17)), class005004)) {
            float f27;
            float f28;
            float f29;
            f16 -= 0.001f;
            f14 -= 0.001f;
            f15 -= 0.001f;
            f17 -= 0.001f;
            class06889 class068892 = class046882.L((class07290)class072952, class072092);
            if (class068892.M == 0.0 && class068892.Z == 0.0) {
                f8 = class083882.method_4580(0.0f);
                f29 = class083882.method_4570(0.0f);
                f7 = f8;
                f6 = class083882.method_4570(1.0f);
                f5 = class083882.method_4580(1.0f);
                f4 = f6;
                f3 = f5;
                f2 = f29;
            } else {
                float f30 = (float)class04995.u((double)class068892.Z, (double)class068892.M) - 1.5707964f;
                f28 = class04995.m((double)f30) * 0.25f;
                f27 = class04995.P((double)f30) * 0.25f;
                f = 0.5f;
                f8 = class083883.method_4580(0.5f + (-f27 - f28));
                f29 = class083883.method_4570(0.5f + (-f27 + f28));
                f7 = class083883.method_4580(0.5f + (-f27 + f28));
                f6 = class083883.method_4570(0.5f + (f27 + f28));
                f5 = class083883.method_4580(0.5f + (f27 + f28));
                f4 = class083883.method_4570(0.5f + (f27 - f28));
                f3 = class083883.method_4580(0.5f + (f27 - f28));
                f2 = class083883.method_4570(0.5f + (-f27 - f28));
            }
            n = this.N(class072952, class072092);
            f28 = f22 * f18;
            f27 = f22 * f19;
            f = f22 * f20;
            this.N(class013912, f13 + 0.0f, f12 + f16, f11 + 0.0f, f28, f27, f, f8, f29, n);
            this.N(class013912, f13 + 0.0f, f12 + f14, f11 + 1.0f, f28, f27, f, f7, f6, n);
            this.N(class013912, f13 + 1.0f, f12 + f15, f11 + 1.0f, f28, f27, f, f5, f4, n);
            this.N(class013912, f13 + 1.0f, f12 + f17, f11 + 0.0f, f28, f27, f, f3, f2, n);
            if (class046882.y((class07290)class072952, class072092.method_10084())) {
                this.N(class013912, f13 + 0.0f, f12 + f16, f11 + 0.0f, f28, f27, f, f8, f29, n);
                this.N(class013912, f13 + 1.0f, f12 + f17, f11 + 0.0f, f28, f27, f, f3, f2, n);
                this.N(class013912, f13 + 1.0f, f12 + f15, f11 + 1.0f, f28, f27, f, f5, f4, n);
                this.N(class013912, f13 + 0.0f, f12 + f14, f11 + 1.0f, f28, f27, f, f7, f6, n);
            }
        }
        if (bl3) {
            f8 = class083882.method_4594();
            f7 = class083882.method_4577();
            f5 = class083882.method_4593();
            f3 = class083882.method_4575();
            int n7 = this.N(class072952, class072092.method_10074());
            f6 = f21 * f18;
            f4 = f21 * f19;
            f2 = f21 * f20;
            this.N(class013912, f13, f12 + f9, f11 + 1.0f, f6, f4, f2, f8, f3, n7);
            this.N(class013912, f13, f12 + f9, f11, f6, f4, f2, f8, f5, n7);
            this.N(class013912, f13 + 1.0f, f12 + f9, f11, f6, f4, f2, f7, f5, n7);
            this.N(class013912, f13 + 1.0f, f12 + f9, f11 + 1.0f, f6, f4, f2, f7, f3, n7);
        }
        int n8 = this.N(class072952, class072092);
        for (class07211 class072112 : class07221.field_11062) {
            class00891 class008912;
            float f31;
            float f32;
            switch (class072112) {
                case field_11043: {
                    f3 = f16;
                    f32 = f17;
                    f6 = f13;
                    f2 = f13 + 1.0f;
                    f4 = f11 + 0.001f;
                    f31 = f11 + 0.001f;
                    n = n3;
                    break;
                }
                case field_11035: {
                    f3 = f15;
                    f32 = f14;
                    f6 = f13 + 1.0f;
                    f2 = f13;
                    f4 = f11 + 1.0f - 0.001f;
                    f31 = f11 + 1.0f - 0.001f;
                    n = n4;
                    break;
                }
                case field_11039: {
                    f3 = f14;
                    f32 = f16;
                    f6 = f13 + 0.001f;
                    f2 = f13 + 0.001f;
                    f4 = f11 + 1.0f;
                    f31 = f11;
                    n = n5;
                    break;
                }
                default: {
                    f3 = f17;
                    f32 = f15;
                    f6 = f13 + 1.0f - 0.001f;
                    f2 = f13 + 1.0f - 0.001f;
                    f4 = f11;
                    f31 = f11 + 1.0f;
                    n = n6;
                }
            }
            if (n == 0 || class03760.y(class072112, Math.max(f3, f32), class072952.method_8320(class072092.method_10093(class072112)))) continue;
            class07209 class072093 = class072092.method_10093(class072112);
            class08388 class083884 = class083883;
            if (!bl && ((class008912 = class072952.method_8320(class072093).i()) instanceof class00741 || class008912 instanceof class07131)) {
                class083884 = this.R;
            }
            class083884 = this.N(class083884, class072952, class072093, bl, class083883, (LocalBooleanRef)localBooleanRefImpl);
            f = class083884.method_4580(0.0f);
            float f33 = class083884.method_4580(0.5f);
            float f34 = class083884.method_4570((1.0f - f3) * 0.5f);
            float f35 = class083884.method_4570((1.0f - f32) * 0.5f);
            float f36 = class083884.method_4570(0.5f);
            float f37 = class072112.z() == class07185.field_11051 ? f23 : f24;
            float f38 = f22 * f37 * f18;
            float f39 = f22 * f37 * f19;
            float f40 = f22 * f37 * f20;
            this.N(class013912, f6, f12 + f3, f4, f38, f39, f40, f, f34, n8);
            this.N(class013912, f2, f12 + f32, f31, f38, f39, f40, f33, f35, n8);
            this.N(class013912, f2, f12 + f9, f31, f38, f39, f40, f33, f36, n8);
            this.N(class013912, f6, f12 + f9, f4, f38, f39, f40, f, f36, n8);
            if (!this.N(class083884 != this.R, (LocalBooleanRef)localBooleanRefImpl)) continue;
            this.N(class013912, f6, f12 + f9, f4, f38, f39, f40, f, f36, n8);
            this.N(class013912, f2, f12 + f9, f31, f38, f39, f40, f33, f36, n8);
            this.N(class013912, f2, f12 + f32, f31, f38, f39, f40, f33, f35, n8);
            this.N(class013912, f6, f12 + f3, f4, f38, f39, f40, f, f34, n8);
        }
    }

    public static boolean N(class04688 class046882, class00500 class005002, class07211 class072112, class04688 class046883) {
        return !class03760.N(class005002, class072112) && !class03760.N(class046882, class046883);
    }

    private static boolean N(class00500 class005002, class07211 class072112) {
        return class03760.N(class072112.b(), 1.0f, class005002);
    }

    private static boolean N(class07211 class072112, float f, class00500 class005002) {
        class00494 class004942 = class005002.N(class072112.b());
        if (class004942 == class00389.N()) {
            return false;
        }
        if (class004942 == class00389.y()) {
            boolean bl = f == 1.0f;
            return class072112 != class07211.field_11036 || bl;
        }
        class00494 class004943 = class00389.N((double)0.0, (double)0.0, (double)0.0, (double)1.0, (double)f, (double)1.0);
        return class00389.N((class00494)class004943, (class00494)class004942, (class07211)class072112);
    }

    private static boolean N(class04688 class046882, class04688 class046883) {
        return class046883.N().N(class046882.N());
    }

    private float N(class07295 class072952, class04651 class046512, class07209 class072092, class00500 class005002, class04688 class046882) {
        if (class046512.N(class046882.N())) {
            class00500 class005003 = class072952.method_8320(class072092.method_10084());
            if (class046512.N(class005003.Y().N())) {
                return 1.0f;
            }
            return class046882.i();
        }
        if (!class005002.B()) {
            return 0.0f;
        }
        return -1.0f;
    }

    private float N(class07295 class072952, class04651 class046512, class07209 class072092) {
        class00500 class005002 = class072952.method_8320(class072092);
        return this.N(class072952, class046512, class072092, class005002, class005002.Y());
    }

    private void N(float[] fArray, float f) {
        if (f >= 0.8f) {
            fArray[0] = fArray[0] + f * 10.0f;
            fArray[1] = fArray[1] + 10.0f;
        } else if (f >= 0.0f) {
            fArray[0] = fArray[0] + f;
            fArray[1] = fArray[1] + 1.0f;
        }
    }

    private float N(class07295 class072952, class04651 class046512, float f, float f2, float f3, class07209 class072092) {
        if (f3 >= 1.0f || f2 >= 1.0f) {
            return 1.0f;
        }
        float[] fArray = new float[2];
        if (f3 > 0.0f || f2 > 0.0f) {
            float f4 = this.N(class072952, class046512, class072092);
            if (f4 >= 1.0f) {
                return 1.0f;
            }
            this.N(fArray, f4);
        }
        this.N(fArray, f);
        this.N(fArray, f3);
        this.N(fArray, f2);
        return fArray[0] / fArray[1];
    }
}

