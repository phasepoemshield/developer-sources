/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.enums.CameraSubmersionType
 *  net.minecraft.client.render.Camera
 *  net.minecraft.client.render.RenderTickCounter
 *  net.minecraft.client.render.fog.FogData
 *  net.minecraft.client.render.fog.FogRenderer
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.MathHelper
 *  org.joml.Vector4f
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 *  org.spongepowered.asm.mixin.injection.callback.LocalCapture
 */
package kotakbaz.rain.mixin;

import java.awt.Color;
import net.minecraft.block.enums.CameraSubmersionType;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.render.fog.FogData;
import net.minecraft.client.render.fog.FogRenderer;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import oxxxde.\u0628\u0624;

@Mixin(value={FogRenderer.class})
public class MixinCustomFogRenderer {
    @Inject(method={"method_3211"}, at={@At(value="INVOKE", target="Lcom/mojang/blaze3d/systems/CommandEncoder;mapBuffer(Lcom/mojang/blaze3d/buffers/GpuBuffer;ZZ)Lcom/mojang/blaze3d/buffers/GpuBuffer$MappedView;")}, locals=LocalCapture.CAPTURE_FAILHARD)
    private void rain$applyCustomFog(Camera camera, int viewDistance, RenderTickCounter tickCounter, float skyDarkness, ClientWorld world, CallbackInfoReturnable<Vector4f> cir, float tickProgress, Vector4f fogColorVector, float viewDistanceBlocks, CameraSubmersionType cameraSubmersionType, Entity entity, FogData fogData, float fogPadding) {
        if (!\u0628\u0624.INSTANCE.useCustomFog()) {
            return;
        }
        Color fogColor = \u0628\u0624.INSTANCE.resolvedFogColor();
        fogColorVector.set((float)fogColor.getRed() / 255.0f, (float)fogColor.getGreen() / 255.0f, (float)fogColor.getBlue() / 255.0f, (float)fogColor.getAlpha() / 255.0f);
        float clientViewDistanceBlocks = Math.max(32.0f, (float)viewDistance * 16.0f);
        float maxFogDistance = Math.max(512.0f, clientViewDistanceBlocks * 2.0f);
        float start = MathHelper.clamp((float)((Float)\u0628\u0624.INSTANCE.getFogDistance().getValue()).floatValue(), (float)-8.0f, (float)maxFogDistance);
        float end = MathHelper.clamp((float)(start + ((Float)\u0628\u0624.INSTANCE.getFogDensity().getValue()).floatValue() * 16.0f), (float)0.0f, (float)maxFogDistance);
        float skyEnd = Math.max(end, clientViewDistanceBlocks);
        fogData.environmentalStart = start;
        fogData.environmentalEnd = end;
        fogData.renderDistanceStart = start;
        fogData.renderDistanceEnd = end;
        fogData.skyEnd = skyEnd;
        fogData.cloudEnd = skyEnd;
    }
}

