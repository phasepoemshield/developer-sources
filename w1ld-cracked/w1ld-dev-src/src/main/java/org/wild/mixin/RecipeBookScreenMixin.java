package org.wild.mixin;

import net.minecraft.class_10260;
import net.minecraft.class_332;
import net.minecraft.class_437;
import net.minecraft.class_490;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.NVnVnNnN;
import ru.metaculture.protection.nVvVVUun;

@Mixin({class_10260.class})
public class RecipeBookScreenMixin {
   @Unique
   private boolean litka$recipeBookScaled;

   @Inject(
      method = {"render"},
      at = {@At("HEAD")}
   )
   private void litka$preRecipeBookRender(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (NVnVnNnN.vNUvnnVnUvu()) {
         this.litka$recipeBookScaled = false;
         if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
            nVvVVUun var6 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(nVvVVUun.class);
            class_437 var7 = (class_437)this;
            if (!(var7 instanceof class_490)) {
               if (var6 != null && var6.UuUVuuUu(var7)) {
                  float var8 = var6.C00OOC00oO(var7);
                  float var9 = var1.method_51421() / 2.0F;
                  float var10 = var1.method_51443() / 2.0F;
                  var1.method_51448().pushMatrix();
                  var1.method_51448().translate(var9, var10);
                  var1.method_51448().scale(var8, var8);
                  var1.method_51448().translate(-var9, -var10);
                  this.litka$recipeBookScaled = true;
               }
            }
         }
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("TAIL")}
   )
   private void litka$postRecipeBookRender(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      if (this.litka$recipeBookScaled) {
         var1.method_51448().popMatrix();
         this.litka$recipeBookScaled = false;
      }
   }
}
