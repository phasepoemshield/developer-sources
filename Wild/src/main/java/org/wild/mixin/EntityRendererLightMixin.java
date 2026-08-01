package org.wild.mixin;

import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.FullBright;

@Mixin({EntityRenderer.class})
public class EntityRendererLightMixin {
   @Inject(
      method = {"getLight(Lnet/minecraft/entity/Entity;F)I"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void wild$torchLight(Entity entity, float f, CallbackInfoReturnable<Integer> callbackInfoReturnable) {
      if (FullBright.O000000000O00O) {
         int var4 = FullBright.O00000000(entity.getX(), entity.getY() + entity.getHeight() * 0.5, entity.getZ());
         if (var4 > 0) {
            int var5 = callbackInfoReturnable.getReturnValueI();
            int var6 = LightmapTextureManager.getBlockLightCoordinates(var5);
            if (var4 > var6) {
               int var7 = LightmapTextureManager.getSkyLightCoordinates(var5);
               callbackInfoReturnable.setReturnValue(LightmapTextureManager.pack(var4, var7));
            }
         }
      }
   }
}
