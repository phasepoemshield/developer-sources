package org.wild.mixin;

import net.minecraft.class_1297;
import net.minecraft.class_1531;
import net.minecraft.class_1657;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.vVnUVUUuUUu;

@Mixin({class_1297.class})
public abstract class MixinEntity {
   @Inject(
      method = {"isInvisibleTo"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onIsInvisibleTo(class_1657 var1, CallbackInfoReturnable<Boolean> var2) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         vVnUVUUuUUu var3 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(vVnUVUUuUUu.class);
         if (var3 != null && var3.nuUnNvnuUu && !(this instanceof class_1531)) {
            var2.setReturnValue(false);
         }
      }
   }
}
