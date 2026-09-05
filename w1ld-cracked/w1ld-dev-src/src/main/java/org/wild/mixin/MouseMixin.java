package org.wild.mixin;

import net.minecraft.class_1041;
import net.minecraft.class_310;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import ru.metaculture.protection.NUvnVVNvvu;
import ru.metaculture.protection.UuvVnuU;
import ru.metaculture.protection.VUUnVnVNNU;
import ru.metaculture.protection.VunUNUNVUnv;
import ru.metaculture.protection.nUUuNuvNUVV;
import ru.metaculture.protection.nvNVVNvnVunu;
import ru.metaculture.protection.vNuUUUVVunnV;

@Mixin({class_312.class})
public abstract class MouseMixin {
   @Inject(
      method = {"updateMouse"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void cancelCameraMovement(CallbackInfo var1) {
      VUUnVnVNNU.UuUVuuUu();
      class_310 var2 = class_310.method_1551();
      if (!isMouseWindowUsable(var2)) {
         var1.cancel();
      } else if (var2.field_1755 == null) {
         vNuUUUVVunnV var3 = new vNuUUUVVunnV(var2);
         NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)var3);
         if (var3.UuUVuuUu()) {
            var1.cancel();
         }
      }
   }

   @Inject(
      method = {"updateMouse"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/network/ClientPlayerEntity;changeLookDirection(DD)V"
      )},
      locals = LocalCapture.CAPTURE_FAILHARD,
      cancellable = true
   )
   private void onLook(double var1, CallbackInfo var3, double var4, double var6, double var8, double var10, double var12, int var14) {
      class_310 var15 = class_310.method_1551();
      if (!isMouseWindowUsable(var15)) {
         var3.cancel();
      } else {
         if (var15 != null && var15.field_1724 != null) {
            nUUuNuvNUVV var16 = new nUUuNuvNUVV(var4, var6 * var14);
            NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)var16);
            if (!var16.UuUVuuUu()) {
               var15.field_1724.method_5872(var16.UuUVuuUu, var16.C00OOC00oO);
            }

            var3.cancel();
         }
      }
   }

   @Inject(
      method = {"onMouseScroll"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onMouseScroll(long var1, double var3, double var5, CallbackInfo var7) {
      VUUnVnVNNU.UuUVuuUu();
      class_310 var8 = class_310.method_1551();
      if (isMouseWindowUsable(var8)) {
         if (var8.field_1755 == null) {
            if (nvNVVNvnVunu.nuunNvv && var5 != 0.0) {
               nvNVVNvnVunu.uUVVvVVNvvn -= (float)(var5 * 0.075F);
               nvNVVNvnVunu.uUVVvVVNvvn = UuvVnuU.vuuuNvNuv(nvNVVNvnVunu.uUVVvVVNvvn, 0.02F, 2.0F);
               var7.cancel();
            }
         }
      }
   }

   private static boolean isMouseWindowUsable(class_310 var0) {
      if (var0 != null && var0.method_22683() != null && var0.method_1569()) {
         class_1041 var1 = var0.method_22683();
         return !var1.method_65966() && var1.method_4489() > 0 && var1.method_4506() > 0;
      } else {
         return false;
      }
   }
}
