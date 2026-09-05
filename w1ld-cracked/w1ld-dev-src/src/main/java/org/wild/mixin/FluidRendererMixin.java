package org.wild.mixin;

import net.minecraft.class_1920;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_3486;
import net.minecraft.class_3610;
import net.minecraft.class_4588;
import net.minecraft.class_775;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.uuUnvvnNUU;

@Mixin({class_775.class})
public class FluidRendererMixin {
   @Inject(
      method = {"render"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void wild$hideLiquids(class_1920 var1, class_2338 var2, class_4588 var3, class_2680 var4, class_3610 var5, CallbackInfo var6) {
      boolean var7 = uuUnvvnNUU.C00OOC00oO("Вода (жидкость)") && var5.method_15767(class_3486.field_15517);
      boolean var8 = uuUnvvnNUU.C00OOC00oO("Лава (жидкость)") && var5.method_15767(class_3486.field_15518);
      if (var7 || var8) {
         var6.cancel();
      }
   }
}
