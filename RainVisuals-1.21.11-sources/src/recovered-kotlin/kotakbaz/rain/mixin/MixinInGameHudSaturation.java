package kotakbaz.rain.mixin;

import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.رع;

// $VF: Compiled from MixinInGameHudSaturation.java
@Mixin(InGameHud.class)
public abstract class MixinInGameHudSaturation {
   @Unique
   private static final Identifier RAIN_FOOD_FULL_HUNGER = Identifier.ofVanilla("hud/food_full_hunger");
   @Unique
   private static final Identifier RAIN_FOOD_EMPTY = Identifier.ofVanilla("hud/food_empty");
   @Unique
   private static final Identifier RAIN_FOOD_EMPTY_HUNGER = Identifier.ofVanilla("hud/food_empty_hunger");
   @Unique
   private static final Identifier RAIN_FOOD_FULL = Identifier.ofVanilla("hud/food_full");
   @Unique
   private static final Identifier RAIN_FOOD_HALF = Identifier.ofVanilla("hud/food_half");
   @Unique
   private static final Identifier RAIN_FOOD_HALF_HUNGER = Identifier.ofVanilla("hud/food_half_hunger");
   @Unique
   private boolean rain$saturationRowRendered;

   @ModifyArg(
      method = "method_1760",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/class_329;method_65022(Lnet/minecraft/class_332;Lnet/minecraft/class_1657;III)V"),
      index = 3
   )
   private int rain$moveAirBubblesAboveSaturation(int y) {
      return this.rain$saturationRowRendered ? y - 10 : y;
   }

   @Inject(method = "method_58477", at = @At("TAIL"))
   private void rain$renderSaturation(DrawContext foodY, PlayerEntity player, int rightEdge, int graphics, CallbackInfo ci) {
      if (رع.INSTANCE.isEnabled()) {
         int saturationLevel = Math.max(0, Math.min(20, Math.round(player.getHungerManager().getSaturationLevel())));
         boolean hasHunger = player.hasStatusEffect(StatusEffects.HUNGER);
         Identifier emptySprite = hasHunger ? RAIN_FOOD_EMPTY_HUNGER : RAIN_FOOD_EMPTY;
         Identifier halfSprite = hasHunger ? RAIN_FOOD_HALF_HUNGER : RAIN_FOOD_HALF;
         Identifier fullSprite = hasHunger ? RAIN_FOOD_FULL_HUNGER : RAIN_FOOD_FULL;
         boolean showEmpty = رع.INSTANCE.shouldRenderEmptySlots();
         int saturationY = foodY - 10;

         for (int index = 0; index < 10; index++) {
            int x = rightEdge - index * 8 - 9;
            int point = index * 2 + 1;
            boolean full = point < saturationLevel;
            boolean half = point == saturationLevel;
            if (showEmpty || full || half) {
               graphics.drawGuiTexture(RenderPipelines.GUI_TEXTURED, emptySprite, x, saturationY, 9, 9);
            }

            if (full) {
               graphics.drawGuiTexture(RenderPipelines.GUI_TEXTURED, fullSprite, x, saturationY, 9, 9);
            } else if (half) {
               graphics.drawGuiTexture(RenderPipelines.GUI_TEXTURED, halfSprite, x, saturationY, 9, 9);
            }
         }

         this.rain$saturationRowRendered = showEmpty || saturationLevel > 0;
      }
   }

   @Inject(method = "method_1760", at = @At("HEAD"))
   private void rain$resetSaturationRowState(DrawContext ci, CallbackInfo graphics) {
      this.rain$saturationRowRendered = false;
   }
}
