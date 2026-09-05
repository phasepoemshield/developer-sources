package org.wild.mixin;

import net.minecraft.class_2561;
import net.minecraft.class_268;
import net.minecraft.class_5250;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.UnVVnUuvNvu;

@Mixin({class_268.class})
public class TeamMixin {
   @Inject(
      method = {"decorateName"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void litka$maskScoreboardTeam(class_2561 var1, CallbackInfoReturnable<class_5250> var2) {
      class_5250 var3 = (class_5250)var2.getReturnValue();
      if (var3 != null) {
         var2.setReturnValue((class_5250)UnVVnUuvNvu.C00OOC00oO(var3));
      }
   }
}
