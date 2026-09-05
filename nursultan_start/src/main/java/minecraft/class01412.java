/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10960
 *  Nursultan.class10962
 *  Nursultan.class10978
 *  Nursultan.class11938
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  minecraft.class00500
 *  minecraft.class01231
 *  minecraft.class01237
 *  minecraft.class01540
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class02566
 *  minecraft.class03042
 *  minecraft.class03386
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class03770
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class05630
 *  minecraft.class06069
 *  minecraft.class06202
 *  minecraft.class06584
 *  minecraft.class06851
 *  minecraft.class06898
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07295
 *  minecraft.class07299
 *  minecraft.class07376
 *  minecraft.class08036
 *  minecraft.class08097
 *  minecraft.class08388
 *  minecraft.class08874
 *  minecraft.class08898
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.pipeline.WorldRenderingPipeline
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class10960;
import Nursultan.class10962;
import Nursultan.class10978;
import Nursultan.class11938;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import minecraft.class00500;
import minecraft.class01231;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01391;
import minecraft.class01407;
import minecraft.class01421;
import minecraft.class01540;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02566;
import minecraft.class03042;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class03770;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05630;
import minecraft.class06069;
import minecraft.class06202;
import minecraft.class06584;
import minecraft.class06851;
import minecraft.class06898;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07295;
import minecraft.class07299;
import minecraft.class07376;
import minecraft.class08036;
import minecraft.class08097;
import minecraft.class08388;
import minecraft.class08874;
import minecraft.class08898;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class01412 {
    private static final class01894 y = class01894.y((String)"textures/misc/underwater.png");
    private final class06202 L;
    private final class08097 u;
    private final class01407 i;
    public static final int N = 40;
    private @Nullable class06584 R;
    private int M;
    private float B;
    private float Z;
    private static @Nullable class07209 z;

    public class01412(class06202 class062022, class08097 class080972, class01407 class014072) {
        this.L = class062022;
        this.u = class080972;
        this.i = class014072;
    }

    public void y() {
        this.R = null;
    }

    private static void y(class06202 class062022, class01421 class014212, class01407 class014072, CallbackInfo callbackInfo) {
        class10960 class109602 = class10960.L();
        class11938.L().L((Object)class109602);
        if (class109602.y()) {
            callbackInfo.cancel();
        }
    }

    private static class08388 N(class03770 class037702, class00500 class005002, class08036 class080362) {
        if (z != null) {
            class08388 class083882 = class037702.getModelParticleSprite(class005002, (class07295)class080362.method_73183(), z);
            z = null;
            return class083882;
        }
        return class037702.N(class005002);
    }

    private static void N(/*
     * Issues handling annotations - annotations may be inaccurate
     */
    @Nullable CallbackInfoReturnable callbackInfoReturnable, class07218 class072182) {
        z = callbackInfoReturnable.getReturnValue() != null ? class072182.method_10062() : null;
    }

    private static void N(class08388 class083882, class01421 class014212, class01407 class014072, CallbackInfo callbackInfo) {
        class10978 class109782 = class10978.L();
        class11938.L().L((Object)class109782);
        if (class109782.y()) {
            callbackInfo.cancel();
        }
    }

    private static void N(class06202 class062022, class01421 class014212, class01407 class014072, CallbackInfo callbackInfo) {
        WorldRenderingPipeline worldRenderingPipeline = Iris.getPipelineManager().getPipelineNullable();
        if (worldRenderingPipeline != null && !worldRenderingPipeline.shouldRenderUnderwaterOverlay()) {
            callbackInfo.cancel();
        }
    }

    private static class08388 N(class03770 class037702, class00500 class005002, LocalRef localRef) {
        return class01412.N(class037702, class005002, (class08036)localRef.get());
    }

    private static void N(class01421 class014212, class01407 class014072, class08388 class083882, CallbackInfo callbackInfo) {
        class10962 class109622 = class10962.L();
        class11938.L().L((Object)class109622);
        if (class109622.y()) {
            callbackInfo.cancel();
        }
    }

    public void N(class06584 class065842, class06069 class060692) {
        this.R = class065842;
        this.M = 40;
        this.B = class060692.z() * 2.0f - 1.0f;
        this.Z = class060692.z() * 2.0f - 1.0f;
    }

    private void N(class01421 class014212, float f, class01237 class012372) {
        if (this.R == null || this.M <= 0) {
            return;
        }
        float f2 = ((float)(40 - this.M) + f) / 40.0f;
        float f3 = f2 * f2;
        float f4 = f2 * f3;
        float f5 = (10.25f * f4 * f3 - 24.95f * f3 * f3 + 25.5f * f4 - 13.8f * f3 + 4.0f * f2) * (float)Math.PI;
        float f6 = (float)this.L.Nt().U() / (float)this.L.Nt().E();
        float f7 = this.B * 0.3f * f6;
        float f8 = this.Z * 0.3f;
        class014212.N();
        class014212.N(f7 * class04995.L((float)class04995.m((double)(f5 * 2.0f))), f8 * class04995.L((float)class04995.m((double)(f5 * 2.0f))), -10.0f + 9.0f * class04995.m((double)f5));
        float f9 = 0.8f;
        class014212.y(0.8f, 0.8f, 0.8f);
        class014212.N((Quaternionfc)class02058.u.N(900.0f * class04995.L((float)class04995.m((double)f5))));
        class014212.N((Quaternionfc)class02058.y.N(6.0f * class04995.P((double)(f2 * 8.0f))));
        class014212.N((Quaternionfc)class02058.R.N(6.0f * class04995.P((double)(f2 * 8.0f))));
        ((class03386)this.L.i_5).v().N(class01540.field_60027);
        class08898 class088982 = new class08898();
        this.L.NM().N(class088982, this.R, class03662.field_4319, (class07299)((class03448)this.L.T_3), null, 0);
        class088982.N(class014212, class012372, 0xF000F0, class01384.u, 0);
        class014212.y();
    }

    public void N(boolean bl, float f, class01237 class012372) {
        class01421 class014212 = new class01421();
        class04453 class044532 = (class04453)this.L.T_4;
        if (((class05630)this.L.i_7).NS().N() && !bl) {
            class00500 class005002;
            if (!class044532.field_5960 && (class005002 = class01412.N((class08036)class044532)) != null) {
                class03770 class037702 = this.L.yU().N();
                LocalRefImpl localRefImpl = new LocalRefImpl();
                localRefImpl.init((Object)class044532);
                class044532 = (class08036)localRefImpl.dispose();
                class01412.N(class01412.N(class037702, class005002, (LocalRef)localRefImpl), class014212, this.i);
            }
            if (!((class04453)this.L.T_4).method_7325()) {
                if (((class04453)this.L.T_4).method_5777(class01231.N)) {
                    class01412.N(this.L, class014212, this.i);
                }
                if (((class04453)this.L.T_4).method_5809()) {
                    class005002 = this.u.N(class08874.y);
                    class01412.N(class014212, this.i, (class08388)class005002);
                }
            }
        }
        if (!((class05630)this.L.i_7).NG) {
            this.N(class014212, f, class012372);
        }
    }

    public void N() {
        if (this.M > 0) {
            --this.M;
            if (this.M == 0) {
                this.R = null;
            }
        }
    }

    private static void N(class01421 class014212, class01407 class014072, class08388 class083882) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        class01412.N(class014212, class014072, class083882, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class01391 class013912 = class014072.method_73477(class06851.Y((class01894)class083882.method_45852()));
        float f = class083882.method_4594();
        float f2 = class083882.method_4577();
        float f3 = class083882.method_4593();
        float f4 = class083882.method_4575();
        float f5 = 1.0f;
        for (int i = 0; i < 2; ++i) {
            class014212.N();
            float f6 = -0.5f;
            float f7 = 0.5f;
            float f8 = -0.5f;
            float f9 = 0.5f;
            float f10 = -0.5f;
            class014212.N((float)(-(i * 2 - 1)) * 0.24f, -0.3f, 0.0f);
            class014212.N((Quaternionfc)class02058.u.N((float)(i * 2 - 1) * 10.0f));
            Matrix4f matrix4f = class014212.L().N();
            class013912.N((Matrix4fc)matrix4f, -0.5f, -0.5f, -0.5f).method_22913(f2, f4).method_22915(1.0f, 1.0f, 1.0f, 0.9f);
            class013912.N((Matrix4fc)matrix4f, 0.5f, -0.5f, -0.5f).method_22913(f, f4).method_22915(1.0f, 1.0f, 1.0f, 0.9f);
            class013912.N((Matrix4fc)matrix4f, 0.5f, 0.5f, -0.5f).method_22913(f, f3).method_22915(1.0f, 1.0f, 1.0f, 0.9f);
            class013912.N((Matrix4fc)matrix4f, -0.5f, 0.5f, -0.5f).method_22913(f2, f3).method_22915(1.0f, 1.0f, 1.0f, 0.9f);
            class014212.y();
        }
    }

    private static void N(class06202 class062022, class01421 class014212, class01407 class014072) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        class01412.N(class062022, class014212, class014072, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        CallbackInfo callbackInfo2 = new CallbackInfo("", true);
        class01412.y(class062022, class014212, class014072, callbackInfo2);
        if (callbackInfo2.isCancelled()) {
            return;
        }
        class07209 class072092 = class07209.method_49637((double)((class04453)class062022.T_4).method_23317(), (double)((class04453)class062022.T_4).method_23320(), (double)((class04453)class062022.T_4).method_23321());
        float f = class03042.N((class07376)((class04453)class062022.T_4).method_73183().method_8597(), (int)((class04453)class062022.T_4).method_73183().U(class072092));
        int n = class02566.N((float)0.1f, (float)f, (float)f, (float)f);
        float f2 = 4.0f;
        float f3 = -1.0f;
        float f4 = 1.0f;
        float f5 = -1.0f;
        float f6 = 1.0f;
        float f7 = -0.5f;
        float f8 = -((class04453)class062022.T_4).method_36454() / 64.0f;
        float f9 = ((class04453)class062022.T_4).method_36455() / 64.0f;
        Matrix4f matrix4f = class014212.L().N();
        class01391 class013912 = class014072.method_73477(class06851.k((class01894)y));
        class013912.N((Matrix4fc)matrix4f, -1.0f, -1.0f, -0.5f).method_22913(4.0f + f8, 4.0f + f9).method_39415(n);
        class013912.N((Matrix4fc)matrix4f, 1.0f, -1.0f, -0.5f).method_22913(0.0f + f8, 4.0f + f9).method_39415(n);
        class013912.N((Matrix4fc)matrix4f, 1.0f, 1.0f, -0.5f).method_22913(0.0f + f8, 0.0f + f9).method_39415(n);
        class013912.N((Matrix4fc)matrix4f, -1.0f, 1.0f, -0.5f).method_22913(4.0f + f8, 0.0f + f9).method_39415(n);
    }

    private static void N(class08388 class083882, class01421 class014212, class01407 class014072) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        class01412.N(class083882, class014212, class014072, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        float f = 0.1f;
        int n = class02566.N((float)1.0f, (float)0.1f, (float)0.1f, (float)0.1f);
        float f2 = -1.0f;
        float f3 = 1.0f;
        float f4 = -1.0f;
        float f5 = 1.0f;
        float f6 = -0.5f;
        float f7 = class083882.method_4594();
        float f8 = class083882.method_4577();
        float f9 = class083882.method_4593();
        float f10 = class083882.method_4575();
        Matrix4f matrix4f = class014212.L().N();
        class01391 class013912 = class014072.method_73477(class06851.k((class01894)class083882.method_45852()));
        class013912.N((Matrix4fc)matrix4f, -1.0f, -1.0f, -0.5f).method_22913(f8, f10).method_39415(n);
        class013912.N((Matrix4fc)matrix4f, 1.0f, -1.0f, -0.5f).method_22913(f7, f10).method_39415(n);
        class013912.N((Matrix4fc)matrix4f, 1.0f, 1.0f, -0.5f).method_22913(f7, f9).method_39415(n);
        class013912.N((Matrix4fc)matrix4f, -1.0f, 1.0f, -0.5f).method_22913(f8, f9).method_39415(n);
    }

    private static @Nullable class00500 N(class08036 class080362) {
        class07218 class072182 = new class07218();
        for (int i = 0; i < 8; ++i) {
            double d = class080362.method_23317() + (double)(((float)((i >> 0) % 2) - 0.5f) * class080362.method_17681() * 0.8f);
            double d2 = class080362.method_23320() + (double)(((float)((i >> 1) % 2) - 0.5f) * 0.1f * class080362.method_55693());
            double d3 = class080362.method_23321() + (double)(((float)((i >> 2) % 2) - 0.5f) * class080362.method_17681() * 0.8f);
            class072182.N(d, d2, d3);
            class00500 class005002 = class080362.method_73183().method_8320((class07209)class072182);
            if (class005002.b() == class06898.field_11455 || !class005002.U((class07290)class080362.method_73183(), (class07209)class072182)) continue;
            class00500 class005003 = class005002;
            class00500 class005004 = class005003;
            class005004 = new CallbackInfoReturnable("", false, (Object)class005004);
            class01412.N((CallbackInfoReturnable)class005004, class072182);
            return class005003;
        }
        return null;
    }
}

