/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01391
 *  minecraft.class01407
 *  minecraft.class01422
 *  minecraft.class01423
 *  minecraft.class05911
 *  minecraft.class06031
 *  minecraft.class07937
 *  minecraft.class08388
 *  minecraft.class08800
 *  minecraft.class08874
 *  net.irisshaders.iris.shaderpack.materialmap.NamespacedId
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import minecraft.class01391;
import minecraft.class01407;
import minecraft.class01422;
import minecraft.class01423;
import minecraft.class05911;
import minecraft.class06031;
import minecraft.class07937;
import minecraft.class08117;
import minecraft.class08388;
import minecraft.class08800;
import minecraft.class08874;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08125 {
    private static final NamespacedId N;

    private void y(class07937 class079372, class01422 class014222, class08117 class081172, CallbackInfo callbackInfo) {
        CapturedRenderingState.INSTANCE.setCurrentEntity(0);
    }

    private static void N(class01423 class014232, class01391 class013912, float f, float f2, float f3, float f4, float f5) {
        class013912.N(class014232, f, f2, f3).method_39415(-1).method_22913(f4, f5).method_60796(0, 10).method_60803(240).y(class014232, 0.0f, 1.0f, 0.0f);
    }

    private void N(class07937 class079372, class01422 class014222, class08117 class081172, CallbackInfo callbackInfo) {
        if (WorldRenderingSettings.INSTANCE.getEntityIds() != null) {
            CapturedRenderingState.INSTANCE.setCurrentEntity(WorldRenderingSettings.INSTANCE.getEntityIds().applyAsInt((Object)N));
        }
    }

    public void N(class07937 class079372, class01422 class014222, class08117 class081172) {
        this.N(class079372, class014222, class081172, null);
        for (class06031 class060312 : class079372.y()) {
            this.N(class060312.N(), (class01407)class014222, class060312.y(), class060312.L(), class081172);
        }
        this.y(class079372, class014222, class081172, null);
    }

    private void N(class01423 class014232, class01407 class014072, class08800 class088002, Quaternionf quaternionf, class08117 class081172) {
        class08388 class083882 = class081172.N(class08874.N);
        class08388 class083883 = class081172.N(class08874.y);
        float f = class088002.s * 1.4f;
        class014232.y(f, f, f);
        float f2 = 0.5f;
        float f3 = 0.0f;
        float f4 = class088002.T / f;
        float f5 = 0.0f;
        class014232.N((Quaternionfc)quaternionf);
        class014232.N(0.0f, 0.0f, 0.3f - (float)((int)f4) * 0.02f);
        float f6 = 0.0f;
        int n = 0;
        class01391 class013912 = class014072.method_73477(class05911.Z());
        while (f4 > 0.0f) {
            class08388 class083884 = n % 2 == 0 ? class083882 : class083883;
            float f7 = class083884.method_4594();
            float f8 = class083884.method_4593();
            float f9 = class083884.method_4577();
            float f10 = class083884.method_4575();
            if (n / 2 % 2 == 0) {
                float f11 = f9;
                f9 = f7;
                f7 = f11;
            }
            class08125.N(class014232, class013912, -f2 - 0.0f, 0.0f - f5, f6, f9, f10);
            class08125.N(class014232, class013912, f2 - 0.0f, 0.0f - f5, f6, f7, f10);
            class08125.N(class014232, class013912, f2 - 0.0f, 1.4f - f5, f6, f7, f8);
            class08125.N(class014232, class013912, -f2 - 0.0f, 1.4f - f5, f6, f9, f8);
            f4 -= 0.45f;
            f5 -= 0.45f;
            f2 *= 0.9f;
            f6 -= 0.03f;
            ++n;
        }
    }
}

