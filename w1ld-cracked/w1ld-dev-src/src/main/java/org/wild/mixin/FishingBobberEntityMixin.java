package org.wild.mixin;

import net.minecraft.class_1297;
import net.minecraft.class_1536;
import net.minecraft.class_1657;
import net.minecraft.class_2604;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_1536.class})
public class FishingBobberEntityMixin {
   @Inject(
      method = {"onSpawnPacket"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$quietInvalidFishingOwner(class_2604 var1, CallbackInfo var2) {
      class_1297 var3 = (class_1297)this;
      class_1297 var4 = var3.method_37908().method_8469(var1.method_11166());
      if (!(var4 instanceof class_1657)) {
         var3.method_31472();
         var2.cancel();
      }
   }
}
