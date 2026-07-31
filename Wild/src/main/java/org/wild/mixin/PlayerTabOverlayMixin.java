package org.wild.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreboardObjective;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.Animations;
import ru.metaculture.protection.WildClient;

@Mixin({PlayerListHud.class})
public class PlayerTabOverlayMixin {
   @Unique
   private boolean litka$tabScaled;

   @Inject(
      method = {"render"},
      at = {@At("HEAD")}
   )
   private void litka$preRenderTab(DrawContext drawContext, int i, Scoreboard scoreboard, ScoreboardObjective scoreboardObjective, CallbackInfo callbackInfo) {
      this.litka$tabScaled = false;
      Animations var6 = WildClient.O00000000.O000000000.O00000000(Animations.class);
      if (var6 != null && var6.O0000000000000 && var6.O000000000O.O000000000("Таб")) {
         MinecraftClient var7 = MinecraftClient.getInstance();
         boolean var8 = var7 != null && var7.options.playerListKey.isPressed();
         float var9 = var6.O00000000000(var8);
         drawContext.getMatrices().pushMatrix();
         drawContext.getMatrices().translate(i / 2.0F, 0.0F);
         drawContext.getMatrices().scale(var9, var9);
         drawContext.getMatrices().translate(-i / 2.0F, 0.0F);
         this.litka$tabScaled = true;
      }
   }

   @Inject(
      method = {"render"},
      at = {@At("TAIL")}
   )
   private void litka$postRenderTab(DrawContext drawContext, int i, Scoreboard scoreboard, ScoreboardObjective scoreboardObjective, CallbackInfo callbackInfo) {
      if (this.litka$tabScaled) {
         drawContext.getMatrices().popMatrix();
         this.litka$tabScaled = false;
      }
   }
}
