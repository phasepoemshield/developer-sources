/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00978
 *  minecraft.class00995
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01391
 *  minecraft.class01421
 *  minecraft.class01423
 *  minecraft.class01894
 *  minecraft.class06851
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07211
 *  minecraft.class07279
 *  minecraft.class07311
 *  minecraft.class08141
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.uniforms.SystemTimeUniforms
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class00978;
import minecraft.class00995;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01391;
import minecraft.class01421;
import minecraft.class01423;
import minecraft.class01894;
import minecraft.class03358;
import minecraft.class06851;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07211;
import minecraft.class07279;
import minecraft.class07311;
import minecraft.class08141;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.uniforms.SystemTimeUniforms;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class03334<T extends class07279, S extends class00978>
implements class03358<T, S> {
    public static final class01894 N = class01894.y((String)"textures/environment/end_sky.png");
    public static final class01894 y = class01894.y((String)"textures/entity/end_portal.png");
    private static final float L = 0.075f;
    private static final float u = 0.15f;
    private static final float i = 0.2f;

    protected class07311 M() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class03334.N(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class07311)callbackInfoReturnable.getReturnValue();
        }
        return class06851.s();
    }

    protected float u() {
        return 0.75f;
    }

    private void N(class00978 class009782, class01391 class013912, class01423 class014232, Matrix3f matrix3f, class07211 class072112, float f, int n, int n2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        if (!class009782.i.contains(class072112)) {
            return;
        }
        float f14 = class072112.P();
        float f15 = class072112.s();
        float f16 = class072112.T();
        class013912.N(class014232, f2, f3, f4).method_22915(0.075f, 0.15f, 0.2f, 1.0f).method_22913(0.0f + f, 0.0f + f).method_22922(n).method_60803(n2).y(class014232, f14, f15, f16);
        class013912.N(class014232, f5, f6, f7).method_22915(0.075f, 0.15f, 0.2f, 1.0f).method_22913(0.0f + f, 0.2f + f).method_22922(n).method_60803(n2).y(class014232, f14, f15, f16);
        class013912.N(class014232, f8, f9, f10).method_22915(0.075f, 0.15f, 0.2f, 1.0f).method_22913(0.2f + f, 0.2f + f).method_22922(n).method_60803(n2).y(class014232, f14, f15, f16);
        class013912.N(class014232, f11, f12, f13).method_22915(0.075f, 0.15f, 0.2f, 1.0f).method_22913(0.2f + f, 0.0f + f).method_22922(n).method_60803(n2).y(class014232, f14, f15, f16);
    }

    private static void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (Iris.getCurrentPack().isPresent()) {
            callbackInfoReturnable.setReturnValue((Object)class06851.u((class01894)class00995.y));
        }
    }

    public void N(class00978 class009782, class01423 class014232, class01391 class013912, CallbackInfo callbackInfo) {
        if (Iris.getCurrentPack().isEmpty()) {
            return;
        }
        int n = class01384.u;
        int n2 = 0xF000F0;
        callbackInfo.cancel();
        Matrix3f matrix3f = class014232.y();
        float f = SystemTimeUniforms.TIMER.getFrameTimeCounter() * 0.01f % 1.0f;
        float f2 = this.u();
        float f3 = this.R();
        this.N(class009782, class013912, class014232, matrix3f, class07211.field_11036, f, n, n2, 0.0f, f2, 1.0f, 1.0f, f2, 1.0f, 1.0f, f2, 0.0f, 0.0f, f2, 0.0f);
        this.N(class009782, class013912, class014232, matrix3f, class07211.field_11033, f, n, n2, 0.0f, f3, 1.0f, 0.0f, f3, 0.0f, 1.0f, f3, 0.0f, 1.0f, f3, 1.0f);
        this.N(class009782, class013912, class014232, matrix3f, class07211.field_11043, f, n, n2, 0.0f, f2, 0.0f, 1.0f, f2, 0.0f, 1.0f, f3, 0.0f, 0.0f, f3, 0.0f);
        this.N(class009782, class013912, class014232, matrix3f, class07211.field_11039, f, n, n2, 0.0f, f2, 1.0f, 0.0f, f2, 0.0f, 0.0f, f3, 0.0f, 0.0f, f3, 1.0f);
        this.N(class009782, class013912, class014232, matrix3f, class07211.field_11035, f, n, n2, 0.0f, f2, 1.0f, 0.0f, f3, 1.0f, 1.0f, f3, 1.0f, 1.0f, f2, 1.0f);
        this.N(class009782, class013912, class014232, matrix3f, class07211.field_11034, f, n, n2, 1.0f, f2, 1.0f, 1.0f, f3, 1.0f, 1.0f, f3, 0.0f, 1.0f, f2, 0.0f);
    }

    @Override
    public void N(S s, class01421 class014212, class01237 class012372, class06959 class069592) {
        class012372.N(class014212, this.M(), (class014232, class013912) -> {
            CallbackInfo callbackInfo = new CallbackInfo("", true);
            this.N((class00978)s, class014232, class013912, callbackInfo);
            if (callbackInfo.isCancelled()) {
                return;
            }
            this.N(class009782.i, class014232.N(), class013912);
        });
    }

    private void N(EnumSet<class07211> enumSet, Matrix4f matrix4f, class01391 class013912) {
        float f = this.R();
        float f2 = this.u();
        this.N(enumSet, matrix4f, class013912, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, class07211.field_11035);
        this.N(enumSet, matrix4f, class013912, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, class07211.field_11043);
        this.N(enumSet, matrix4f, class013912, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, class07211.field_11034);
        this.N(enumSet, matrix4f, class013912, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, class07211.field_11039);
        this.N(enumSet, matrix4f, class013912, 0.0f, 1.0f, f, f, 0.0f, 0.0f, 1.0f, 1.0f, class07211.field_11033);
        this.N(enumSet, matrix4f, class013912, 0.0f, 1.0f, f2, f2, 1.0f, 1.0f, 0.0f, 0.0f, class07211.field_11036);
    }

    private void N(EnumSet<class07211> enumSet, Matrix4f matrix4f, class01391 class013912, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, class07211 class072112) {
        if (enumSet.contains(class072112)) {
            class013912.N((Matrix4fc)matrix4f, f, f3, f5);
            class013912.N((Matrix4fc)matrix4f, f2, f3, f6);
            class013912.N((Matrix4fc)matrix4f, f2, f4, f7);
            class013912.N((Matrix4fc)matrix4f, f, f4, f8);
        }
    }

    @Override
    public void N(T t, S s, float f, class06889 class068892, @Nullable class08141 class081412) {
        class03358.super.N(t, s, f, class068892, class081412);
        ((class00978)s).i.clear();
        for (class07211 class072112 : class07211.values()) {
            if (!t.N(class072112)) continue;
            ((class00978)s).i.add(class072112);
        }
    }

    protected float R() {
        return 0.375f;
    }
}

