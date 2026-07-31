package org.wild.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.world.LevelLoadingScreen;
import net.minecraft.server.WorldGenerationProgressTracker;
import net.minecraft.text.Text;
import net.minecraft.util.Util;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ru.metaculture.protection.O00000OOO0000;
import ru.metaculture.protection.O0000O00OO0OO;

@Mixin({LevelLoadingScreen.class})
public abstract class LevelLoadingScreenMixin extends Screen {
   @Shadow
   @Final
   private WorldGenerationProgressTracker progressProvider;
   @Shadow
   private long lastNarrationTime;

   protected LevelLoadingScreenMixin(Text text) {
      super(text);
   }

   @Inject(
      method = {"render"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void wild$renderPremiumLevelLoading(DrawContext drawContext, int i, int j, float f, CallbackInfo callbackInfo) {
      MinecraftClient var6 = MinecraftClient.getInstance();
      LevelLoadingScreen var7 = (LevelLoadingScreen)(Object)this;
      if (var6 == null) {
         O0000O00OO0OO.O00000000("LevelLoadingScreen.render", var7, "client missing", null);
      } else if (!O00000OOO0000.O00000000().O00000000(var6, i, j, 1.0F, var7)) {
         O0000O00OO0OO.O00000000(var7, "render.vanilla-fallback", "backdrop unavailable");
      } else {
         long var8 = Util.getMeasuringTimeMs();
         if (var8 - this.lastNarrationTime > 2000L) {
            this.lastNarrationTime = var8;
            this.narrateScreenIfNarrationEnabled(true);
         }

         O00000OOO0000.O00000000().O00000000(var6, this.progressProvider);
         O0000O00OO0OO.O00000000(var7, "render.custom", "level-loading overlay");
         callbackInfo.cancel();
      }
   }
}
