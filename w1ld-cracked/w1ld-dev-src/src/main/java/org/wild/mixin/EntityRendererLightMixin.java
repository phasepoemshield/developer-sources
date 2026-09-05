package org.wild.mixin;

import net.minecraft.class_1297;
import net.minecraft.class_765;
import net.minecraft.class_897;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.uVvvNVuUV;

@Mixin({class_897.class})
public class EntityRendererLightMixin {
   @Inject(
      method = {"getLight(Lnet/minecraft/entity/Entity;F)I"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void wild$torchLight(class_1297 var1, float var2, CallbackInfoReturnable<Integer> var3) {
      if (uVvvNVuUV.NnUuNNU) {
         int var4 = uVvvNVuUV.UuUVuuUu(var1.method_23317(), var1.method_23318() + var1.method_17682() * 0.5, var1.method_23321());
         if (var4 > 0) {
            int var5 = var3.getReturnValueI();
            int var6 = class_765.method_24186(var5);
            if (var4 > var6) {
               int var7 = class_765.method_24187(var5);
               var3.setReturnValue(class_765.method_23687(var4, var7));
            }
         }
      }
   }
}
