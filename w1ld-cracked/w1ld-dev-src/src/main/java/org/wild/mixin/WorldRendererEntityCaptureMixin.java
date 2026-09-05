package org.wild.mixin;

import net.minecraft.class_1297;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_761;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.nuVUnVnVvV;

@Mixin({class_761.class})
public abstract class WorldRendererEntityCaptureMixin {
   @Inject(
      method = {"renderEntity"},
      at = {@At("HEAD")}
   )
   private void captureEntity(class_1297 var1, double var2, double var4, double var6, float var8, class_4587 var9, class_4597 var10, CallbackInfo var11) {
      nuVUnVnVvV var12 = nuVUnVnVvV.UuUVuuUu();
      if (var12.UuuNnUvUuv()) {
         var12.UuUVuuUu(var1, var2, var4, var6, var8, var9);
      }
   }
}
