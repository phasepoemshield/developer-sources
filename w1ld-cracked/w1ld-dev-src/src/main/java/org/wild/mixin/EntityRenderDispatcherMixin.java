package org.wild.mixin;

import net.minecraft.class_1297;
import net.minecraft.class_1303;
import net.minecraft.class_1531;
import net.minecraft.class_1533;
import net.minecraft.class_1534;
import net.minecraft.class_1542;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_4604;
import net.minecraft.class_5915;
import net.minecraft.class_898;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ru.metaculture.protection.uuUnvvnNUU;

@Mixin({class_898.class})
public class EntityRenderDispatcherMixin {
   @Inject(
      method = {"shouldRender"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private <E extends class_1297> void litka$skipEntities(E var1, class_4604 var2, double var3, double var5, double var7, CallbackInfoReturnable<Boolean> var9) {
      if (uuUnvvnNUU.C00OOC00oO("Стойки брони") && var1 instanceof class_1531) {
         var9.setReturnValue(false);
      } else if (!uuUnvvnNUU.C00OOC00oO("Рамки") || !(var1 instanceof class_1533) && !(var1 instanceof class_5915)) {
         if (uuUnvvnNUU.C00OOC00oO("Картины") && var1 instanceof class_1534) {
            var9.setReturnValue(false);
         } else if (uuUnvvnNUU.C00OOC00oO("Дроп предметов") && var1 instanceof class_1542) {
            var9.setReturnValue(false);
         } else {
            if (uuUnvvnNUU.C00OOC00oO("Опыт-орбы") && var1 instanceof class_1303) {
               var9.setReturnValue(false);
            }
         }
      } else {
         if (uuUnvvnNUU.UuuuNNunN.uUnuvNvvNU()) {
            class_1799 var10 = ((class_1533)var1).method_6940();
            if (var10 != null && var10.method_31574(class_1802.field_8204)) {
               return;
            }
         }

         var9.setReturnValue(false);
      }
   }
}
