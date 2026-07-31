package zenith.zov.utility.mixin.screen;

import zenith.hud.*;

import net.minecraft.client.gui.screen.ingame.RecipeBookScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.gui.screen.recipebook.RecipeBookWidget;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.ZenithInternal135;

@Mixin({InventoryScreen.class})
public abstract class MixinInventoryScreen extends RecipeBookScreen<PlayerScreenHandler> {
   public MixinInventoryScreen(PlayerScreenHandler PlayerScreenHandler, RecipeBookWidget<?> RecipeBookWidget, PlayerInventory PlayerInventory, Text Text) {
      super(PlayerScreenHandler, RecipeBookWidget, PlayerInventory, Text);
   }

   @Inject(
      method = {"render"},
      at = {@At("RETURN")}
   )
   private void zenith$popInventoryScaleAnimation(DrawContext DrawContext, int i, int j, float f, CallbackInfo callbackinfo) {
      ZenithInternal135 ll11il11il1lilii1iliilil = (ZenithInternal135)this;
      ll11il11il1lilii1iliilil.zenith$betterMinecraft$popScaleIfNeeded(DrawContext);
      ll11il11il1lilii1iliilil.zenith$betterMinecraft$finishClosingAnimation();
   }
}
