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
import oxxxde.بؤ;

// $VF: Compiled from MixinCustomFogRenderer.java
@Mixin(FogRenderer.class)
public class MixinCustomFogRenderer {
   @Inject(
      method = "method_3211",
      at = @At(
         value = "INVOKE",
         target = "Lcom/mojang/blaze3d/systems/CommandEncoder;mapBuffer(Lcom/mojang/blaze3d/buffers/GpuBuffer;ZZ)Lcom/mojang/blaze3d/buffers/GpuBuffer$MappedView;"
      ),
      locals = LocalCapture.CAPTURE_FAILHARD
   )
   private void rain$applyCustomFog(
      Camera viewDistanceBlocks,
      int cameraSubmersionType,
      RenderTickCounter tickProgress,
      float skyDarkness,
      ClientWorld fogColorVector,
      CallbackInfoReturnable<Vector4f> fogData,
      float fogPadding,
      Vector4f tickCounter,
      float camera,
      CameraSubmersionType entity,
      Entity cir,
      FogData world,
      float viewDistance
   ) {
      if (بؤ.INSTANCE.useCustomFog()) {
         Color fogColor = بؤ.INSTANCE.resolvedFogColor();
         fogColorVector.set(fogColor.getRed() / 255.0F, fogColor.getGreen() / 255.0F, fogColor.getBlue() / 255.0F, fogColor.getAlpha() / 255.0F);
         float clientViewDistanceBlocks = Math.max(32.0F, viewDistance * 16.0F);
         float maxFogDistance = Math.max(512.0F, clientViewDistanceBlocks * 2.0F);
         float start = MathHelper.clamp(بؤ.INSTANCE.getFogDistance().getValue(), -8.0F, maxFogDistance);
         float end = MathHelper.clamp(start + بؤ.INSTANCE.getFogDensity().getValue() * 16.0F, 0.0F, maxFogDistance);
         float skyEnd = Math.max(end, clientViewDistanceBlocks);
         fogData.environmentalStart = start;
         fogData.environmentalEnd = end;
         fogData.renderDistanceStart = start;
         fogData.renderDistanceEnd = end;
         fogData.skyEnd = skyEnd;
         fogData.cloudEnd = skyEnd;
      }
   }
}
