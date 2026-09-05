package org.wild.mixin;

import net.minecraft.class_2561;
import net.minecraft.class_333;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.uuUnvvnNUU;

@Mixin({class_333.class})
public class NarratorManagerMixin {
   @Inject(
      method = {"narrateText(Lnet/minecraft/text/Text;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$silenceNarrator(class_2561 var1, CallbackInfo var2) {
      if (uuUnvvnNUU.UuuNnUvUuv()) {
         var2.cancel();
      }
   }
}
