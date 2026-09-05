package org.wild.mixin;

import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.NUvnVVNvvu;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.UnnVUNVvv;
import ru.metaculture.protection.VunUNUNVUnv;
import ru.metaculture.protection.uNvNuNnVNUvv;
import ru.metaculture.protection.uNvUVUNvuUVV;
import ru.metaculture.protection.vUUNuvuVn;

@Mixin({class_636.class})
public class MixinMultiPlayerGameMode {
   @Inject(
      method = {"attackEntity"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onAttack(class_1657 var1, class_1297 var2, CallbackInfo var3) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         uNvNuNnVNUvv var4 = new uNvNuNnVNUvv(var2);
         NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)var4);
         if (var4.UuUVuuUu()) {
            var3.cancel();
         } else if (UnnVUNVvv.UuUVuuUu(var2)) {
            var3.cancel();
         } else {
            if (var2 instanceof class_1657) {
               String var5 = var2.method_5477().getString();
               vUUNuvuVn var6 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(vUUNuvuVn.class);
               if (var6 != null && var6.nuUnNvnuUu && vUUNuvuVn.uVunuUNVVUUV.uUnuvNvvNU() && uNvUVUNvuUVV.UuUVuuUu(var5)) {
                  var3.cancel();
               }
            }
         }
      }
   }
}
