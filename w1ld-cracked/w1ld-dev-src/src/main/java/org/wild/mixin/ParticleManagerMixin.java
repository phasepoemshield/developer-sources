package org.wild.mixin;

import net.minecraft.class_2394;
import net.minecraft.class_702;
import net.minecraft.class_703;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.uuUnvvnNUU;

@Mixin({class_702.class})
public class ParticleManagerMixin {
   @Inject(
      method = {"addParticle(Lnet/minecraft/particle/ParticleEffect;DDDDDD)Lnet/minecraft/client/particle/Particle;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$cancelParticle(
      class_2394 var1, double var2, double var4, double var6, double var8, double var10, double var12, CallbackInfoReturnable<class_703> var14
   ) {
      if (uuUnvvnNUU.C00OOC00oO(var1)) {
         var14.setReturnValue(null);
      }
   }
}
