package org.wild.mixin;

import net.minecraft.entity.player.HungerManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.Sprint;
import ru.metaculture.protection.WildClient;

@Mixin({HungerManager.class})
public class MixinHungerManager {
   @Inject(
      method = {"getFoodLevel"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onGetFoodLevel(CallbackInfoReturnable<Integer> callbackInfoReturnable) {
      Sprint var2 = WildClient.O00000000.O000000000.O00000000(Sprint.class);
      if (var2 != null && var2.O0000000000000 && var2.O000000000O00.O0000000000()) {
         callbackInfoReturnable.setReturnValue(8);
      }
   }
}
