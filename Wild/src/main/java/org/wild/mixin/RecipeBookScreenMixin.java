package org.wild.mixin;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.gui.screen.ingame.RecipeBookScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.Animations;
import ru.metaculture.protection.WildClient;

@Mixin({RecipeBookScreen.class})
public class RecipeBookScreenMixin {
   @Unique
   private boolean litka$recipeBookScaled;

   @Inject(
      method = {"render"},
      at = {@At("HEAD")}
   )
   private void litka$preRecipeBookRender(DrawContext drawContext, int i, int j, float f, CallbackInfo callbackInfo) {
      this.litka$recipeBookScaled = false;
      if (WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null) {
         Animations var6 = WildClient.O00000000.O000000000.O00000000(Animations.class);
         Screen var7 = (Screen)(Object)this;
         if (!(var7 instanceof InventoryScreen)) {
            if (var6 != null && var6.O00000000(var7)) {
               float var8 = var6.O000000000(var7);
               float var9 = drawContext.getScaledWindowWidth() / 2.0F;
               float var10 = drawContext.getScaledWindowHeight() / 2.0F;
               drawContext.getMatrices().pushMatrix();
               drawContext.getMatrices().translate(var9, var10);
               drawContext.getMatrices().scale(var8, var8);
               drawContext.getMatrices().translate(-var9, -var10);
               this.litka$recipeBookScaled = true;
            }
         }
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("TAIL")}
   )
   private void litka$postRecipeBookRender(DrawContext drawContext, int i, int j, float f, CallbackInfo callbackInfo) {
      if (this.litka$recipeBookScaled) {
         drawContext.getMatrices().popMatrix();
         this.litka$recipeBookScaled = false;
      }
   }
}
