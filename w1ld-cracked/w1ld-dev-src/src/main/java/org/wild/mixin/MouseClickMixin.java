package org.wild.mixin;

import net.minecraft.class_1041;
import net.minecraft.class_310;
import net.minecraft.class_312;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.NNVuvnnUnnuv;
import ru.metaculture.protection.NUvnVVNvvu;
import ru.metaculture.protection.VUUnVnVNNU;
import ru.metaculture.protection.VnuuuuVvVnN;
import ru.metaculture.protection.VunUNUNVUnv;
import ru.metaculture.protection.vVvuNVUVvNv;

@Mixin({class_312.class})
public class MouseClickMixin {
   @Inject(
      method = {"onMouseButton"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void handleMenuMouseClick(long var1, int var3, int var4, int var5, CallbackInfo var6) {
      VUUnVnVNNU.UuUVuuUu();
      class_310 var7 = class_310.method_1551();
      if (!wild$isWindowInputUsable(var7, var1)) {
         var6.cancel();
      } else {
         double[] var8 = new double[1];
         double[] var9 = new double[1];
         GLFW.glfwGetCursorPos(var1, var8, var9);
         VnuuuuVvVnN var10 = new VnuuuuVvVnN(var1, var3, var4, var5, var8[0], var9[0], var7.field_1755 != null);
         NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)var10);
         if (!var10.UuUVuuUu() && !var10.uVUuuVnNVU()) {
            NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)(new vVvuNVUVvNv(var1, -100 - var3, 0, var4, var5)));
         }

         if (var10.UuUVuuUu()) {
            var6.cancel();
         }
      }
   }

   @Inject(
      method = {"lockCursor"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void preventCursorLock(CallbackInfo var1) {
      VUUnVnVNNU.UuUVuuUu();
      class_310 var2 = class_310.method_1551();
      long var3 = 0L;
      if (var2 != null && var2.method_22683() != null) {
         var3 = var2.method_22683().method_4490();
      }

      if (wild$isWindowInputUsable(var2, var3) && var2.field_1755 == null) {
         NNVuvnnUnnuv var5 = new NNVuvnnUnnuv(var2, var3);
         NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)var5);
         if (var5.UuUVuuUu()) {
            var1.cancel();
         }
      } else {
         var1.cancel();
      }
   }

   @Unique
   private static boolean wild$isWindowInputUsable(class_310 var0, long var1) {
      if (var0 != null && var0.method_22683() != null && var1 != 0L && var0.method_1569()) {
         class_1041 var3 = var0.method_22683();
         return var1 == var3.method_4490() && !var3.method_65966() && var3.method_4489() > 0 && var3.method_4506() > 0;
      } else {
         return false;
      }
   }
}
