package org.wild.mixin;

import net.minecraft.class_10017;
import net.minecraft.class_1297;
import net.minecraft.class_2561;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_897;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.NVvvnuvVV;
import ru.metaculture.protection.UnVVnUuvNvu;
import ru.metaculture.protection.nuVUnVnVvV;
import ru.metaculture.protection.uuUUunvVVu;

@Mixin({class_897.class})
public abstract class EntityRendererMixin<S extends class_10017> {
   @Inject(
      method = {"updateRenderState"},
      at = {@At("TAIL")}
   )
   private void wild$attachEntityId(class_1297 var1, S var2, float var3, CallbackInfo var4) {
      ((uuUUunvVVu)var2).wild$setEntityId(var1.method_5628());
   }

   @Inject(
      method = {"renderLabelIfPresent"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderLabelIfPresent(S var1, class_2561 var2, class_4587 var3, class_4597 var4, int var5, CallbackInfo var6) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         NVvvnuvVV var7 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(NVvvnuvVV.class);
         if (var7 != null && var7.UuUVuuUu((int)(var1.field_53329 * 100.0F))) {
            var6.cancel();
         }
      }
   }

   @ModifyVariable(
      method = {"renderLabelIfPresent"},
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0
   )
   private class_2561 litka$maskNametag(class_2561 var1) {
      return UnVVnUuvNvu.UuUVuuUu(var1);
   }

   @Inject(
      method = {"renderLabelIfPresent"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void skipLabelDuringCapture(class_10017 var1, class_2561 var2, class_4587 var3, class_4597 var4, int var5, CallbackInfo var6) {
      if (nuVUnVnVvV.UuUVuuUu().uVUuuVnNVU()) {
         var6.cancel();
      }
   }
}
