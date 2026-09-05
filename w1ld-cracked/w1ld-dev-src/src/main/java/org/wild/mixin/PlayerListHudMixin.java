package org.wild.mixin;

import net.minecraft.class_2561;
import net.minecraft.class_355;
import net.minecraft.class_640;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.UnVVnUuvNvu;

@Mixin({class_355.class})
public class PlayerListHudMixin {
   @Inject(
      method = {"getPlayerName"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void litka$maskTabName(class_640 var1, CallbackInfoReturnable<class_2561> var2) {
      class_2561 var3 = (class_2561)var2.getReturnValue();
      if (var3 != null) {
         var2.setReturnValue(UnVVnUuvNvu.UuUVuuUu(var3));
      }
   }
}
