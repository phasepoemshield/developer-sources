package org.wild.mixin;

import net.minecraft.class_1113;
import net.minecraft.class_1144;
import net.minecraft.class_1140.class_11518;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.uuUnvvnNUU;

@Mixin({class_1144.class})
public class SoundManagerMixin {
   @Inject(
      method = {"play(Lnet/minecraft/client/sound/SoundInstance;)Lnet/minecraft/client/sound/SoundSystem$PlayResult;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$muteSound(class_1113 var1, CallbackInfoReturnable<class_11518> var2) {
      if (var1 != null) {
         if (uuUnvvnNUU.UuUVuuUu(var1.method_4775())) {
            var2.setReturnValue(class_11518.field_60956);
         }
      }
   }
}
