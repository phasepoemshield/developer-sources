package org.wild.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1531;
import net.minecraft.class_1657;
import net.minecraft.class_2248;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_636;
import net.minecraft.class_638;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.UnnVUNVvv;
import ru.metaculture.protection.uuNvvnN;
import ru.metaculture.protection.vunVnNUv;

@Environment(EnvType.CLIENT)
@Mixin({class_636.class})
public abstract class ClientPlayerInteractionManagerMixin {
   @Inject(
      method = {"interactBlock"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void noInteract(class_746 var1, class_1268 var2, class_3965 var3, CallbackInfoReturnable<class_1269> var4) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         if (var1 != null) {
            vunVnNUv var5 = (vunVnNUv)NVnVnNnN.UuUVuuUu.C00OOC00oO.C00OOC00oO(vunVnNUv.class);
            if (var5 != null && var5.nuUnNvnuUu) {
               if (uuNvvnN.ccOO0COcoco0 == null) {
                  class_638 var6 = var1.field_17892;
                  if (var6 != null) {
                     class_2248 var7 = var6.method_8320(var3.method_17777()).method_26204();
                     if (vunVnNUv.UuuNnUvUuv().contains(var7)) {
                        var4.setReturnValue(class_1269.field_5814);
                     }
                  }
               }
            }
         }
      }
   }

   @Inject(
      method = {"interactEntity"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void noInteractEntity(class_1657 var1, class_1297 var2, class_1268 var3, CallbackInfoReturnable<class_1269> var4) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         if (UnnVUNVvv.C00OOC00oO(var2)) {
            var4.setReturnValue(class_1269.field_5812);
         } else if (var2 instanceof class_1531) {
            vunVnNUv var5 = (vunVnNUv)NVnVnNnN.UuUVuuUu.C00OOC00oO.C00OOC00oO(vunVnNUv.class);
            if (var5 != null && var5.nuUnNvnuUu) {
               if (vunVnNUv.NVNnnvnuunNv.UuUVuuUu(0)) {
                  var4.setReturnValue(class_1269.field_5814);
               }
            }
         }
      }
   }

   @Inject(
      method = {"interactEntityAtLocation"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void fakePlayerInteractAtLocation(class_1657 var1, class_1297 var2, class_3966 var3, class_1268 var4, CallbackInfoReturnable<class_1269> var5) {
      if (UnnVUNVvv.C00OOC00oO(var2)) {
         var5.setReturnValue(class_1269.field_5812);
      }
   }
}
