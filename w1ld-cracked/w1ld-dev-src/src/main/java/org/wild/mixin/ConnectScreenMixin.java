package org.wild.mixin;

import net.minecraft.class_156;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_412;
import net.minecraft.class_437;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.VNNUVUuN;
import ru.metaculture.protection.VUUuNVNNU;

@Mixin({class_412.class})
public abstract class ConnectScreenMixin extends class_437 {
   @Shadow
   private class_2561 field_2413;
   @Shadow
   private long field_19097;

   protected ConnectScreenMixin(class_2561 var1) {
      super(var1);
   }

   @Inject(
      method = {"render"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$renderPremiumConnect(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      class_310 var6 = class_310.method_1551();
      class_412 var7 = (class_412)this;
      if (var6 == null) {
         VNNUVUuN.UuUVuuUu("ConnectScreen.render", var7, "client missing", null);
      } else {
         if (!VUUuNVNNU.UuUVuuUu().UuUVuuUu(var6, var2, var3, 1.0F, var7)) {
            int var8 = var6.method_22683() != null ? var6.method_22683().method_4486() : this.field_22789;
            int var9 = var6.method_22683() != null ? var6.method_22683().method_4502() : this.field_22790;
            var1.method_25296(0, 0, var8, var9, -16447732, -15658213);
            VNNUVUuN.UuUVuuUu(var7, "render.safe-fallback", "backdrop unavailable");
         } else {
            VNNUVUuN.UuUVuuUu(var7, "render.custom", "connect-status overlay");
         }

         long var10 = class_156.method_658();
         if (var10 - this.field_19097 > 2000L && var6.method_44713() != null) {
            this.field_19097 = var10;
            var6.method_44713().method_37015(class_2561.method_43471("narrator.joining"));
         }

         super.method_25394(var1, var2, var3, var4);
         VUUuNVNNU.UuUVuuUu().UuUVuuUu(var6, this.field_2413);
         var5.cancel();
      }
   }
}
