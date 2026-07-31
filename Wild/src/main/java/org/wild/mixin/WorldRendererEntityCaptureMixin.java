package org.wild.mixin;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.O0000O00OO000;

@Mixin({WorldRenderer.class})
public abstract class WorldRendererEntityCaptureMixin {
   @Inject(
      method = {"renderEntity"},
      at = {@At("HEAD")}
   )
   private void captureEntity(
      Entity entity, double d, double e, double f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, CallbackInfo callbackInfo
   ) {
      O0000O00OO000 var12 = O0000O00OO000.O00000000();
      if (var12.O0000000000O0()) {
         var12.O00000000(entity, d, e, f, g, matrixStack);
      }
   }
}
