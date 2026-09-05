package org.wild.mixin;

import net.minecraft.class_368;
import net.minecraft.class_374;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.uuUnvvnNUU;

@Mixin({class_374.class})
public class ToastManagerMixin {
   @Inject(
      method = {"add(Lnet/minecraft/client/toast/Toast;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$filterToast(class_368 var1, CallbackInfo var2) {
      if (uuUnvvnNUU.UuUVuuUu(var1)) {
         var2.cancel();
      }
   }
}
