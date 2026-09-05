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
import ru.metaculture.protection.NUvnVVNvvu;
import ru.metaculture.protection.UVNVVUunvN;
import ru.metaculture.protection.VUUnVnVNNU;
import ru.metaculture.protection.VunUNUNVUnv;
import ru.metaculture.protection.vVvuNVUVvNv;

@Mixin({class_312.class})
public class MouseScrollMixin {
   @Inject(
      method = {"onMouseScroll"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void handleMenuMouseScroll(long var1, double var3, double var5, CallbackInfo var7) {
      VUUnVnVNNU.UuUVuuUu();
      class_310 var8 = class_310.method_1551();
      if (!wild$isWindowInputUsable(var8, var1)) {
         var7.cancel();
      } else {
         double[] var9 = new double[1];
         double[] var10 = new double[1];
         GLFW.glfwGetCursorPos(var1, var9, var10);
         UVNVVUunvN var11 = new UVNVVUunvN(var1, var3, var5, var9[0], var10[0], var8.field_1755 != null);
         NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)var11);
         if (!var11.UuUVuuUu() && !var11.vNUvnnVnUvu() && Math.abs(var5) > 1.0E-4) {
            int var12 = var5 > 0.0 ? -200 : -201;
            NUvnVVNvvu.UuUVuuUu((VunUNUNVUnv)(new vVvuNVUVvNv(var1, var12, 0, 1, 0)));
         }

         if (var11.UuUVuuUu()) {
            var7.cancel();
         }
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
