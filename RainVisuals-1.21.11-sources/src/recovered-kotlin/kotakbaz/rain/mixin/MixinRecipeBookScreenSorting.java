package kotakbaz.rain.mixin;

import net.minecraft.client.gui.Click;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.gui.screen.ingame.RecipeBookScreen;
import net.minecraft.client.input.CharInput;
import net.minecraft.client.input.KeyInput;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.ذه;
import oxxxde.ظظ;

// $VF: Compiled from MixinRecipeBookScreenSorting.java
@Mixin(RecipeBookScreen.class)
public abstract class MixinRecipeBookScreenSorting {
   @Inject(method = "method_25402", at = @At("HEAD"), cancellable = true)
   private void rain$lockRecipeBookClick(Click doubled, boolean cir, CallbackInfoReturnable<Boolean> event) {
      if (this.rain$isSorting() && !((ذه)this).rain$isSortButtonHovered(event.x(), event.y())) {
         cir.setReturnValue(true);
      }
   }

   @Inject(method = "method_25403", at = @At("HEAD"), cancellable = true)
   private void rain$lockRecipeBookDrag(Click event, double cir, double dragY, CallbackInfoReturnable<Boolean> dragX) {
      if (this.rain$isSorting()) {
         cir.setReturnValue(true);
      }
   }

   @Unique
   private boolean rain$isSorting() {
      return this instanceof InventoryScreen && ظظ.INSTANCE.isSorting();
   }

   @Inject(method = "method_25404", at = @At("HEAD"), cancellable = true)
   private void rain$lockRecipeBookKey(KeyInput cir, CallbackInfoReturnable<Boolean> event) {
      if (this.rain$isSorting()) {
         cir.setReturnValue(true);
      }
   }

   @Inject(method = "method_25400", at = @At("HEAD"), cancellable = true)
   private void rain$lockRecipeBookText(CharInput cir, CallbackInfoReturnable<Boolean> event) {
      if (this.rain$isSorting()) {
         cir.setReturnValue(true);
      }
   }
}
