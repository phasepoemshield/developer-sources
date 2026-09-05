package org.wild.mixin;

import net.minecraft.class_1920;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_761;
import net.minecraft.class_765;
import net.minecraft.class_761.class_10948;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.uVvvNVuUV;

@Mixin({class_761.class})
public class WorldRendererLightmapMixin {
   @Inject(
      method = {"getLightmapCoordinates(Lnet/minecraft/client/render/WorldRenderer$BrightnessGetter;Lnet/minecraft/world/BlockRenderView;Lnet/minecraft/block/BlockState;Lnet/minecraft/util/math/BlockPos;)I"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private static void wild$torchLight(class_10948 var0, class_1920 var1, class_2680 var2, class_2338 var3, CallbackInfoReturnable<Integer> var4) {
      if (uVvvNVuUV.NnUuNNU) {
         int var5 = uVvvNVuUV.UuUVuuUu(var3.method_10263(), var3.method_10264(), var3.method_10260());
         if (var5 > 0) {
            int var6 = var4.getReturnValueI();
            int var7 = class_765.method_24186(var6);
            if (var5 > var7) {
               int var8 = class_765.method_24187(var6);
               var4.setReturnValue(class_765.method_23687(var5, var8));
            }
         }
      }
   }
}
