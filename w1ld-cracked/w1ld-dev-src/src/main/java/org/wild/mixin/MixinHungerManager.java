package org.wild.mixin;

import net.minecraft.class_1702;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.uVUuvvVnuvVN;

@Mixin({class_1702.class})
public class MixinHungerManager {
   @Inject(
      method = {"getFoodLevel"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onGetFoodLevel(CallbackInfoReturnable<Integer> var1) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
            uVUuvvVnuvVN var2 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(uVUuvvVnuvVN.class);
            if (var2 != null && var2.nuUnNvnuUu && var2.uNnUnnuNUnNu.uUnuvNvvNU()) {
               var1.setReturnValue(8);
            }
         }
      }
   }
}
