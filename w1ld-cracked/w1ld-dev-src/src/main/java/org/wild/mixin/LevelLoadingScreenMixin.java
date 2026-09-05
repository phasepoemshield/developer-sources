package org.wild.mixin;

import net.minecraft.class_156;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3928;
import net.minecraft.class_3953;
import net.minecraft.class_437;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.VNNUVUuN;
import ru.metaculture.protection.VUUuNVNNU;

@Mixin({class_3928.class})
public abstract class LevelLoadingScreenMixin extends class_437 {
   @Shadow
   @Final
   private class_3953 field_17406;
   @Shadow
   private long field_19101;

   protected LevelLoadingScreenMixin(class_2561 var1) {
      super(var1);
   }

   @Inject(
      method = {"render"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$renderPremiumLevelLoading(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      class_310 var6 = class_310.method_1551();
      class_3928 var7 = (class_3928)this;
      if (var6 == null) {
         VNNUVUuN.UuUVuuUu("LevelLoadingScreen.render", var7, "client missing", null);
      } else if (!VUUuNVNNU.UuUVuuUu().UuUVuuUu(var6, var2, var3, 1.0F, var7)) {
         VNNUVUuN.UuUVuuUu(var7, "render.vanilla-fallback", "backdrop unavailable");
      } else {
         long var8 = class_156.method_658();
         if (var8 - this.field_19101 > 2000L) {
            this.field_19101 = var8;
            this.method_37064(true);
         }

         VUUuNVNNU.UuUVuuUu().UuUVuuUu(var6, this.field_17406);
         VNNUVUuN.UuUVuuUu(var7, "render.custom", "level-loading overlay");
         var5.cancel();
      }
   }
}
