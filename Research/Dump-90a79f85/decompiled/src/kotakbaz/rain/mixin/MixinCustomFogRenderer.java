/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_3532
 *  net.minecraft.class_4184
 *  net.minecraft.class_5636
 *  net.minecraft.class_638
 *  net.minecraft.class_7285
 *  net.minecraft.class_758
 *  net.minecraft.class_9779
 *  org.joml.Vector4f
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 *  org.spongepowered.asm.mixin.injection.callback.LocalCapture
 */
package kotakbaz.rain.mixin;

import java.awt.Color;
import kotakbaz.rain.module.modules.render.A;
import net.minecraft.class_1297;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_5636;
import net.minecraft.class_638;
import net.minecraft.class_7285;
import net.minecraft.class_758;
import net.minecraft.class_9779;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(value={class_758.class})
public class MixinCustomFogRenderer {
    public MixinCustomFogRenderer() {
        super();
    }

    @Inject(method={"method_3211"}, at={@At(value="INVOKE", target="Lcom/mojang/blaze3d/systems/CommandEncoder;mapBuffer(Lcom/mojang/blaze3d/buffers/GpuBuffer;ZZ)Lcom/mojang/blaze3d/buffers/GpuBuffer$MappedView;")}, locals=LocalCapture.CAPTURE_FAILHARD)
    private void rain$applyCustomFog(class_4184 camera, int viewDistance, boolean thick, class_9779 tickCounter, float skyDarkness, class_638 world, CallbackInfoReturnable<Vector4f> cir, float tickProgress, Vector4f fogColorVector, float viewDistanceBlocks, class_5636 cameraSubmersionType, class_1297 entity, class_7285 fogData, float fogPadding) {
        if (!A.INSTANCE.useCustomFog()) {
            return;
        }
        Color fogColor = A.INSTANCE.resolvedFogColor();
        fogColorVector.set((float)fogColor.getRed() / 255.0f, (float)fogColor.getGreen() / 255.0f, (float)fogColor.getBlue() / 255.0f, (float)fogColor.getAlpha() / 255.0f);
        float clientViewDistanceBlocks = Math.max(32.0f, (float)viewDistance * 16.0f);
        float maxFogDistance = Math.max(512.0f, clientViewDistanceBlocks * 2.0f);
        float start = class_3532.method_15363((float)((Float)A.INSTANCE.getFogDistance().getValue()).floatValue(), (float)-8.0f, (float)maxFogDistance);
        float end = class_3532.method_15363((float)(start + ((Float)A.INSTANCE.getFogDensity().getValue()).floatValue() * 16.0f), (float)0.0f, (float)maxFogDistance);
        float skyEnd = Math.max(end, clientViewDistanceBlocks);
        fogData.field_60582 = start;
        fogData.field_60584 = end;
        fogData.field_60583 = start;
        fogData.field_60585 = end;
        fogData.field_60099 = skyEnd;
        fogData.field_60100 = skyEnd;
    }
}

