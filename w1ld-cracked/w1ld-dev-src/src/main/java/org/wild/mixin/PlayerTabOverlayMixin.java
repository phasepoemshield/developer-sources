package org.wild.mixin;

import net.minecraft.class_266;
import net.minecraft.class_269;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_355;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.nVvVVUun;

@Mixin({class_355.class})
public class PlayerTabOverlayMixin {
   @Unique
   private boolean litka$tabScaled;

   @Inject(
      method = {"render"},
      at = {@At("HEAD")}
   )
   private void litka$preRenderTab(class_332 var1, int var2, class_269 var3, class_266 var4, CallbackInfo var5) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         this.litka$tabScaled = false;
         nVvVVUun var6 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(nVvVVUun.class);
         if (var6 != null && var6.nuUnNvnuUu && var6.NVNnnvnuunNv.C00OOC00oO("Таб")) {
            class_310 var7 = class_310.method_1551();
            boolean var8 = var7 != null && var7.field_1690.field_1907.method_1434();
            float var9 = var6.vVvUvVVuuNvV(var8);
            var1.method_51448().pushMatrix();
            var1.method_51448().translate(var2 / 2.0F, 0.0F);
            var1.method_51448().scale(var9, var9);
            var1.method_51448().translate(-var2 / 2.0F, 0.0F);
            this.litka$tabScaled = true;
         }
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("TAIL")}
   )
   private void litka$postRenderTab(class_332 var1, int var2, class_269 var3, class_266 var4, CallbackInfo var5) {
      if (this.litka$tabScaled) {
         var1.method_51448().popMatrix();
         this.litka$tabScaled = false;
      }
   }
}
