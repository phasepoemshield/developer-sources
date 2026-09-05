package org.wild.mixin;

import net.minecraft.class_1058;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4603;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.uuUnvvnNUU;

@Mixin({class_4603.class})
public class InGameOverlayRendererMixin {
   @Inject(
      method = {"renderFireOverlay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void onRenderFireOverlay(class_4587 var0, class_4597 var1, CallbackInfo var2) {
      if (uuUnvvnNUU.UuUVuuUu("Огонь")) {
         var2.cancel();
      }
   }

   @Inject(
      method = {"renderUnderwaterOverlay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void onRenderUnderwaterOverlay(class_310 var0, class_4587 var1, class_4597 var2, CallbackInfo var3) {
      if (uuUnvvnNUU.UuUVuuUu("Вода")) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"renderInWallOverlay"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private static void onRenderInWallOverlay(class_1058 var0, class_4587 var1, class_4597 var2, CallbackInfo var3) {
      if (uuUnvvnNUU.UuUVuuUu("Стена в глазах")) {
         var3.cancel();
      }
   }

   @Inject(
      method = {"renderFloatingItem"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void onRenderFloatingItem(class_4587 var1, float var2, CallbackInfo var3) {
      if (uuUnvvnNUU.UuUVuuUu("Анимация тотема")) {
         var3.cancel();
      }
   }
}
