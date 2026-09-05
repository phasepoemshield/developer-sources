/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.class_11658
 *  net.minecraft.class_11890
 *  net.minecraft.class_12076
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_4184
 *  net.minecraft.class_4604
 *  net.minecraft.class_761
 *  net.minecraft.class_9779
 *  net.minecraft.class_9909
 *  net.minecraft.class_9922
 *  net.minecraft.class_9975
 *  org.joml.Matrix4f
 *  org.joml.Vector4f
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package ruhack.phobia.a;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_11658;
import net.minecraft.class_11890;
import net.minecraft.class_12076;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_4184;
import net.minecraft.class_4604;
import net.minecraft.class_761;
import net.minecraft.class_9779;
import net.minecraft.class_9909;
import net.minecraft.class_9922;
import net.minecraft.class_9975;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ruhack.phobia.c;
import ruhack.phobia.ff;
import ruhack.phobia.jd;
import ruhack.phobia.jk;
import ruhack.phobia.jm;
import ruhack.phobia.jo;
import ruhack.phobia.ly;

@Mixin(value={class_761.class})
public class bz
implements c {
    @Inject(method={"method_62203"}, at={@At(value="HEAD")}, cancellable=true)
    private void phobia$removeWeather(class_9909 frameGraphBuilder, GpuBufferSlice fog, CallbackInfo ci2) {
        if (ff.weatherDisabled()) {
            ci2.cancel();
            return;
        }
        jk removals = jk.getInstance();
        if (removals != null && removals.isState() && removals.modeSetting.isSelected("Rain")) {
            ci2.cancel();
        }
    }

    @Inject(method={"method_72917"}, at={@At(value="TAIL")})
    private void phobia$enableCustomModelOutlinePostProcess(class_4184 camera, class_4604 frustum, class_9779 tickCounter, class_11658 state, CallbackInfo ci2) {
        jm shaderESP = jm.getInstance();
        if (shaderESP != null && shaderESP.isState() && bz.mc.field_1724 != null && jd.appliesTo((class_11890)bz.mc.field_1724) && shaderESP.shouldOutline((class_11890)bz.mc.field_1724)) {
            state.field_61736 = true;
        }
    }

    @Inject(method={"method_43788"}, at={@At(value="HEAD")}, cancellable=true)
    private void onHasBlindnessOrDarkness(class_4184 camera, CallbackInfoReturnable<Boolean> cir) {
        jk noRender = jk.getInstance();
        if (noRender == null || !noRender.isState()) {
            return;
        }
        class_1297 entity = camera.method_19331();
        if (!(entity instanceof class_1309)) {
            return;
        }
        class_1309 livingEntity = (class_1309)entity;
        boolean hasBlindness = livingEntity.method_6059(class_1294.field_5919);
        boolean hasDarkness = livingEntity.method_6059(class_1294.field_38092);
        if (noRender.modeSetting.isSelected("Bad Effects") && hasBlindness && !hasDarkness) {
            cir.setReturnValue((Object)false);
        }
        if (noRender.modeSetting.isSelected("Darkness") && hasDarkness && !hasBlindness) {
            cir.setReturnValue((Object)false);
        }
        if (noRender.modeSetting.isSelected("Bad Effects") && noRender.modeSetting.isSelected("Darkness")) {
            cir.setReturnValue((Object)false);
        }
    }

    @Inject(method={"method_22710"}, at={@At(value="HEAD")})
    private void onWorldRenderStart(class_9922 allocator, class_9779 tickCounter, boolean renderBlockOutline, class_4184 camera, Matrix4f positionMatrix, Matrix4f frustumProjection, Matrix4f projectionMatrix, GpuBufferSlice fog, Vector4f fogColor, boolean shouldRenderSky, CallbackInfo ci2) {
        jo shaderSky = jo.getInstance();
        if (shaderSky != null && shaderSky.isState()) {
            ly.setMatrices(projectionMatrix, positionMatrix);
        }
    }

    @Inject(method={"method_62215"}, at={@At(value="HEAD")}, cancellable=true)
    private static void onRenderSkyPass(GpuBufferSlice fog, class_12076 skyState, class_9975 skyRendering, CallbackInfo ci2) {
        jo shaderSky = jo.getInstance();
        if (shaderSky == null || !shaderSky.isState()) {
            return;
        }
        RenderSystem.setShaderFog((GpuBufferSlice)fog);
        ly.render(shaderSky);
        ci2.cancel();
    }
}

