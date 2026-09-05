package org.wild.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.VNUNnUVUvUuu;
import ru.metaculture.protection.WvvwWVWvvVWw;
import ru.metaculture.protection.uNvUVUNvuUVV;

@Environment(EnvType.CLIENT)
@Mixin({class_1297.class})
public abstract class EntityMixin {
   @Inject(
      method = {"getTargetingMargin"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void client$getTargetingMargin(CallbackInfoReturnable<Float> var1) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         class_1297 var2 = (class_1297)this;
         if (var2 instanceof class_1657) {
            VNUNnUVUvUuu var3 = (VNUNnUVUvUuu)NVnVnNnN.UuUVuuUu.C00OOC00oO.C00OOC00oO(VNUNnUVUvUuu.class);
            if (var3 != null && var3.nuUnNvnuUu) {
               if (VNUNnUVUvUuu.NVNnnvnuunNv.C00OOC00oO("Обычный")) {
                  if (!(VNUNnUVUvUuu.UNnVVNvvnVvU.uUnuvNvvNU() && var2 instanceof class_1657 var4) || !uNvUVUNvuUVV.UuUVuuUu(var4.method_5477().getString())) {
                     float var6 = (Float)var1.getReturnValue();
                     float var5 = VNUNnUVUvUuu.uVunuUNVVUUV.uUnuvNvvNU();
                     var1.setReturnValue(var6 + var5);
                  }
               }
            }
         }
      }
   }

   @Inject(
      method = {"pushAwayFrom"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onPushAwayFrom(class_1297 var1, CallbackInfo var2) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         class_1297 var3 = (class_1297)this;
         if (var3 instanceof class_746) {
            if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
               WvvwWVWvvVWw var4 = (WvvwWVWvvVWw)NVnVnNnN.UuUVuuUu.C00OOC00oO.C00OOC00oO(WvvwWVWvvVWw.class);
               if (var4 != null && var4.nuUnNvnuUu) {
                  if (var1 instanceof class_1657 && var4.NVNnnvnuunNv.uUnuvNvvNU()) {
                     var2.cancel();
                  } else if (var1 instanceof class_1309 && !(var1 instanceof class_1657) && var4.uVunuUNVVUUV.uUnuvNvvNU()) {
                     var2.cancel();
                  }
               }
            }
         }
      }
   }
}
